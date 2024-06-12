using System;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using Xwebhook.Abstractions;
using Xwebhook.Api;
using Xwebhook.Client;
using Xwebhook.Model;

namespace Xwebhook
{
    public sealed class Statistics : XwebhookResourceBase, IStatistics
    {
        private readonly IStatisticsApi _statisticsApi;

        public Statistics(IXwebhookClient xwebhookClient, IStatisticsApi statisticsApi)
            : base(xwebhookClient)
        {
            _statisticsApi = statisticsApi ?? throw new ArgumentNullException(nameof(statisticsApi));
        }

        public AppUsageStatsOut AggregateAppStats(AppUsageStatsIn appUsageStatsIn, string idempotencyKey = default)
        {
            try
            {
                var res = _statisticsApi.V1StatisticsAggregateAppStats(
                    appUsageStatsIn,
                    idempotencyKey);

                return res;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(AggregateAppStats)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }

        public async Task<AppUsageStatsOut> AggregateAppStatsAsync(AppUsageStatsIn appUsageStatsIn, string idempotencyKey = default)
        {
            try
            {
                var res = await _statisticsApi.V1StatisticsAggregateAppStatsAsync(
                    appUsageStatsIn,
                    idempotencyKey);

                return res;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(AggregateAppStatsAsync)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }

        public AggregateEventTypesOut AggregateEventTypes()
        {
            try
            {
                var res = _statisticsApi.V1StatisticsAggregateEventTypes();

                return res;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(AggregateAppStatsAsync)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }

        public async Task<AggregateEventTypesOut> AggregateEventTypesAsync()
        {
            try
            {
                var res = await _statisticsApi.V1StatisticsAggregateEventTypesAsync();

                return res;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(AggregateAppStatsAsync)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }
    }
}
