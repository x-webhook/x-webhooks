package com.xwebhook.kotlin

import com.xwebhook.kotlin.exceptions.ApiException
import com.xwebhook.kotlin.internal.apis.AuthenticationApi
import com.xwebhook.kotlin.models.AppPortalAccessIn
import com.xwebhook.kotlin.models.AppPortalAccessOut
import com.xwebhook.kotlin.models.DashboardAccessOut

class Authentication internal constructor(token: String, options: XwebhookOptions) {
    val api = AuthenticationApi(options.serverUrl)

    init {
        api.accessToken = token
        api.userAgent = options.getUA()
        options.initialRetryDelayMillis?.let { api.initialRetryDelayMillis = it }
        options.numRetries?.let { api.numRetries = it }
    }

    suspend fun appPortalAccess(
        appId: String,
        appPortalAccessIn: AppPortalAccessIn,
        options: PostOptions = PostOptions(),
    ): AppPortalAccessOut {
        try {
            return api.v1AuthenticationAppPortalAccess(appId, appPortalAccessIn, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun dashboardAccess(
        appId: String,
        options: PostOptions = PostOptions(),
    ): DashboardAccessOut {
        try {
            return api.v1AuthenticationDashboardAccess(appId, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun logout(options: PostOptions = PostOptions()) {
        try {
            api.v1AuthenticationLogout(options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }
}
