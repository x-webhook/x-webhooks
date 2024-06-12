package com.xwebhook;

import com.xwebhook.exceptions.ApiException;
import com.xwebhook.internal.api.StatisticsApi;
import com.xwebhook.models.AggregateEventTypesOut;
import com.xwebhook.models.AppUsageStatsIn;
import com.xwebhook.models.AppUsageStatsOut;

public class Statistics {
    private final StatisticsApi api;

    Statistics() {
        api = new StatisticsApi();
    }

    public AppUsageStatsOut aggregateAppStats(final AppUsageStatsIn appUsageStatsIn, final PostOptions options) throws ApiException {
        try {
            return api.v1StatisticsAggregateAppStats(appUsageStatsIn, options.getIdempotencyKey());
        } catch (com.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

    public AggregateEventTypesOut aggregateEventTypes() throws com.xwebhook.internal.ApiException {
        try {
            return api.v1StatisticsAggregateEventTypes();
        } catch (com.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

}
