package com.xwebhook.kotlin

import com.xwebhook.kotlin.exceptions.ApiException
import com.xwebhook.kotlin.internal.apis.BackgroundTasksApi
import com.xwebhook.kotlin.models.BackgroundTaskOut
import com.xwebhook.kotlin.models.ListResponseBackgroundTaskOut

class BackgroundTask internal constructor(token: String, options: XwebhookOptions) {
    private val api = BackgroundTasksApi(options.serverUrl)

    init {
        api.accessToken = token
        api.userAgent = options.getUA()
        options.initialRetryDelayMillis?.let { api.initialRetryDelayMillis = it }
        options.numRetries?.let { api.numRetries = it }
    }

    suspend fun list(options: BackgroundTaskListOptions = BackgroundTaskListOptions()): ListResponseBackgroundTaskOut {
        try {
            return api.listBackgroundTasks(options.status, options.task, options.limit, options.iterator, options.order)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun get(taskId: String): BackgroundTaskOut {
        try {
            return api.getBackgroundTask(taskId)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }
}
