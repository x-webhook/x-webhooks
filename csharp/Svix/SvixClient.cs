using System;
using Microsoft.Extensions.Logging;
using Xwebhook.Abstractions;
using Xwebhook.Api;
using Xwebhook.Client;
using Xwebhook.Models;

namespace Xwebhook
{
    public sealed class XwebhookClient : IXwebhookClient
    {
        protected Configuration Config => new Configuration
        {
            BasePath = ServerUrl,
            AccessToken = Token
        };

        public IApplication Application { get; }

        public IAuthentication Authentication { get; }

        public IEndpoint Endpoint { get; }

        public IEventType EventType { get; }

        public IHealth Health { get; }

        public IIntegration Integration { get; }

        public IMessage Message { get; }

        public IMessageAttempt MessageAttempt { get; }

        public IStatistics Statistics { get; }

        public ILogger Logger { get; }

        public string ServerUrl => _options?.ServerUrl;

        public bool Throw => _options?.Throw ?? false;

        public string Token { get; }

        private readonly IXwebhookOptions _options;

        public XwebhookClient(string token, IXwebhookOptions options, ILogger<XwebhookClient> logger = null
            , IApplicationApi applicationApi = null, IAuthenticationApi authenticationApi = null, IEndpointApi endpointApi = null
            , IEventTypeApi eventTypeApi = null, IHealthApi healthApi = null, IIntegrationApi integrationApi = null
            , IMessageApi messageApi = null, IMessageAttemptApi messageAttemptApi = null, IStatisticsApi statisticsApi = null)
        {
            Logger = logger;
            _options = options ?? throw new ArgumentNullException(nameof(options));
            Token = token ?? throw new ArgumentNullException(nameof(token));

            Application = new Application(this, applicationApi ?? new ApplicationApi(Config));
            Authentication = new Authentication(this, authenticationApi ?? new AuthenticationApi(Config));
            Endpoint = new Endpoint(this, endpointApi ?? new EndpointApi(Config));
            EventType = new EventType(this, eventTypeApi ?? new EventTypeApi(Config));
            Health = new Health(this, healthApi ?? new HealthApi(Config));
            Integration = new Integration(this, integrationApi ?? new IntegrationApi(Config));
            Message = new Message(this, messageApi ?? new MessageApi(Config));
            MessageAttempt = new MessageAttempt(this, messageAttemptApi ?? new MessageAttemptApi(Config));
            Statistics = new Statistics(this, statisticsApi ?? new StatisticsApi(Config));
        }

        public XwebhookClient(string token, IXwebhookOptions options, ILogger<XwebhookClient> logger)
            : this(token, options, logger, healthApi: null, applicationApi: null)
        {
            // empty
        }
    }
}
