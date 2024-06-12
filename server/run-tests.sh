#!/bin/bash

# Run tests with various configurations.

if [[ -z "$TEST_COMMAND" ]]; then
    if [[ -z "$CARGO_HOME" ]]; then
        CARGO_HOME="$HOME/.cargo"
    fi

    if command -v cargo-nextest || [[ -e "$CARGO_HOME/bin/cargo-nextest" ]]; then
        TEST_COMMAND="cargo nextest run"
    else
        TEST_COMMAND="cargo test"
    fi
fi

# Common variables:
export DATABASE_URL="postgresql://postgres:postgres@localhost:5432/postgres"
export XWEBHOOK_JWT_SECRET="test value"
export XWEBHOOK_LOG_LEVEL="info"
export XWEBHOOK_WHITELIST_SUBNETS="[127.0.0.1/32]"
export XWEBHOOK_DB_POOL_MAX_SIZE="500"
export XWEBHOOK_REDIS_POOL_MAX_SIZE="10000"

echo "*********** RUN 1 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="redis"
    export XWEBHOOK_CACHE_TYPE="redis"
    export XWEBHOOK_REDIS_DSN="redis://localhost:6379"
    ${TEST_COMMAND}
    ${TEST_COMMAND} -- --ignored redis
)

echo "*********** RUN 2 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="redis"
    export XWEBHOOK_CACHE_TYPE="memory"
    export XWEBHOOK_REDIS_DSN="redis://localhost:6379"
    ${TEST_COMMAND}
)

echo "*********** RUN 3 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="redis"
    export XWEBHOOK_CACHE_TYPE="none"
    export XWEBHOOK_REDIS_DSN="redis://localhost:6379"
    ${TEST_COMMAND}
)

echo "*********** RUN 4 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="rediscluster"
    export XWEBHOOK_CACHE_TYPE="rediscluster"
    export XWEBHOOK_REDIS_DSN="redis://localhost:6380"
    ${TEST_COMMAND}
    ${TEST_COMMAND} -- --ignored redis
)

echo "*********** RUN 5 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="memory"
    export XWEBHOOK_CACHE_TYPE="none"
    ${TEST_COMMAND}
)

echo "*********** RUN 6 ***********"
(
    export XWEBHOOK_QUEUE_TYPE="rabbitmq"
    export XWEBHOOK_CACHE_TYPE="redis"
    export XWEBHOOK_REDIS_DSN="redis://localhost:6379"
    export XWEBHOOK_RABBIT_DSN="amqp://xivs:xivs@localhost:5672/%2f"
    ${TEST_COMMAND}
    ${TEST_COMMAND} -- --ignored rabbitmq
)
