package io.openweb3.xwebhook.kotlin

import io.openweb3.xwebhook.kotlin.exceptions.ApiException
import io.openweb3.xwebhook.kotlin.internal.apis.StatisticsApi
import io.openweb3.xwebhook.kotlin.models.AggregateEventTypesOut
import io.openweb3.xwebhook.kotlin.models.AppUsageStatsIn
import io.openweb3.xwebhook.kotlin.models.AppUsageStatsOut

class Statistics internal constructor(token: String, options: XwebhookOptions) {
    private val api = StatisticsApi(options.serverUrl)

    init {
        api.accessToken = token
        api.userAgent = options.getUA()
        options.initialRetryDelayMillis?.let { api.initialRetryDelayMillis = it }
        options.numRetries?.let { api.numRetries = it }
    }

    suspend fun aggregateAppStats(
        appUsageStatsIn: AppUsageStatsIn,
        options: PostOptions = PostOptions(),
    ): AppUsageStatsOut {
        try {
            return api.v1StatisticsAggregateAppStats(appUsageStatsIn, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun aggregateEventTypes(): AggregateEventTypesOut {
        try {
            return api.v1StatisticsAggregateEventTypes()
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }
}
