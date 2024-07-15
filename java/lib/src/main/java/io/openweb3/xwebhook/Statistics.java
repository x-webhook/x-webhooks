package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.StatisticsApi;
import io.openweb3.xwebhook.models.AggregateEventTypesOut;
import io.openweb3.xwebhook.models.AppUsageStatsIn;
import io.openweb3.xwebhook.models.AppUsageStatsOut;

public class Statistics {
    private final StatisticsApi api;

    Statistics() {
        api = new StatisticsApi();
    }

    public AppUsageStatsOut aggregateAppStats(final AppUsageStatsIn appUsageStatsIn, final PostOptions options) throws ApiException {
        try {
            return api.v1StatisticsAggregateAppStats(appUsageStatsIn, options.getIdempotencyKey());
        } catch (io.openweb3.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

    public AggregateEventTypesOut aggregateEventTypes() throws io.openweb3.xwebhook.internal.ApiException {
        try {
            return api.v1StatisticsAggregateEventTypes();
        } catch (io.openweb3.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

}
