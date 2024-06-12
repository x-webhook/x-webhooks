use omniqueue::DynConsumer;
use xwebhook_bridge_types::{
    async_trait, xwebhook::api::Xwebhook, SenderInput, SenderOutputOpts, TransformationConfig,
    TransformerTx,
};

use crate::{config::QueueInputOpts, error::Error, gcp_pubsub, rabbitmq, run_inner, sqs, Consumer};

pub struct QueueSender {
    name: String,
    source: String,
    system: String,
    input_opts: QueueInputOpts,
    transformation: Option<TransformationConfig>,
    transformer_tx: Option<TransformerTx>,
    xwebhook_client: Xwebhook,
}

impl std::fmt::Debug for QueueSender {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        f.debug_struct("SenderInput").finish()
    }
}

fn system_name(opts: &QueueInputOpts) -> &'static str {
    match opts {
        QueueInputOpts::GCPPubSub(_) => "gcp-pubsub",
        QueueInputOpts::RabbitMQ(_) => "rabbitmq",
        QueueInputOpts::Redis(_) => "redis",
        QueueInputOpts::SQS(_) => "sqs",
    }
}

fn source_name(opts: &QueueInputOpts) -> &str {
    match opts {
        QueueInputOpts::GCPPubSub(opts) => &opts.subscription_id,
        QueueInputOpts::RabbitMQ(opts) => &opts.queue_name,
        QueueInputOpts::Redis(opts) => &opts.queue_key,
        QueueInputOpts::SQS(opts) => &opts.queue_dsn,
    }
}

impl QueueSender {
    pub fn new(
        name: String,
        input: QueueInputOpts,
        transformation: Option<TransformationConfig>,
        output: SenderOutputOpts,
    ) -> Self {
        Self {
            name,
            source: source_name(&input).into(),
            system: system_name(&input).into(),
            input_opts: input,
            transformation,
            transformer_tx: None,
            xwebhook_client: match output {
                SenderOutputOpts::Xwebhook(output) => {
                    Xwebhook::new(output.token, output.options.map(Into::into))
                }
            },
        }
    }
}

#[async_trait]
impl Consumer for QueueSender {
    fn source(&self) -> &str {
        &self.source
    }

    fn system(&self) -> &str {
        &self.system
    }

    fn transformer_tx(&self) -> Option<&TransformerTx> {
        self.transformer_tx.as_ref()
    }

    fn transformation(&self) -> Option<&TransformationConfig> {
        self.transformation.as_ref()
    }

    fn xwebhook_client(&self) -> &Xwebhook {
        &self.xwebhook_client
    }

    async fn consumer(&self) -> std::io::Result<DynConsumer> {
        Ok(match &self.input_opts {
            QueueInputOpts::GCPPubSub(cfg) => gcp_pubsub::consumer(cfg).await,
            QueueInputOpts::RabbitMQ(cfg) => rabbitmq::consumer(cfg).await,
            QueueInputOpts::Redis(cfg) => crate::redis::consumer(cfg).await,
            QueueInputOpts::SQS(cfg) => sqs::consumer(cfg).await,
        }
        .map_err(Error::from)?)
    }
}

#[async_trait]
impl SenderInput for QueueSender {
    fn name(&self) -> &str {
        &self.name
    }
    fn set_transformer(&mut self, tx: Option<TransformerTx>) {
        self.transformer_tx = tx;
    }
    async fn run(&self) -> std::io::Result<()> {
        run_inner(self).await
    }
}
