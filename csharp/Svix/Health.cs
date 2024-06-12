using System;
using Microsoft.Extensions.Logging;
using Xwebhook.Abstractions;
using Xwebhook.Api;
using Xwebhook.Client;
using System.Net;
using System.Threading;
using System.Threading.Tasks;

namespace Xwebhook
{
    public sealed class Health : XwebhookResourceBase, IHealth
    {
        private readonly IHealthApi _healthApi;

        public Health(IXwebhookClient xwebhookClient, IHealthApi healthApi)
            : base(xwebhookClient)
        {
            _healthApi = healthApi ?? throw new ArgumentNullException(nameof(healthApi));
        }

        public bool IsHealthy(string idempotencyKey = default)
        {
            try
            {
                var lResponse = _healthApi.V1HealthGetWithHttpInfo();

                return lResponse.StatusCode == HttpStatusCode.NoContent;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(IsHealthy)} failed");

                if (Throw)
                    throw;

                return false;
            }
        }

        public async Task<bool> IsHealthyAsync(string idempotencyKey = default, CancellationToken cancellationToken = default)
        {
            try
            {
                var lResponse = await _healthApi.V1HealthGetWithHttpInfoAsync(cancellationToken)
                    .ConfigureAwait(false);

                return lResponse.StatusCode == HttpStatusCode.NoContent;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(IsHealthyAsync)} failed");

                if (Throw)
                    throw;

                return false;
            }
        }
    }
}