using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;
using Xwebhook.Model;
using Xwebhook.Models;

namespace Xwebhook.Abstractions
{
    public interface IStatistics
    {
        AppUsageStatsOut AggregateAppStats(AppUsageStatsIn appUsageStatsIn, string idempotencyKey = default);

        Task<AppUsageStatsOut> AggregateAppStatsAsync(AppUsageStatsIn appUsageStatsIn, string idempotencyKey = default);

        AggregateEventTypesOut AggregateEventTypes();

        Task<AggregateEventTypesOut> AggregateEventTypesAsync();

    }
}
