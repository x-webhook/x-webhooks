package io.openweb3.xwebhook.kotlin

import io.openweb3.xwebhook.kotlin.exceptions.ApiException
import io.openweb3.xwebhook.kotlin.internal.apis.IntegrationApi
import io.openweb3.xwebhook.kotlin.models.IntegrationIn
import io.openweb3.xwebhook.kotlin.models.IntegrationKeyOut
import io.openweb3.xwebhook.kotlin.models.IntegrationOut
import io.openweb3.xwebhook.kotlin.models.IntegrationUpdate
import io.openweb3.xwebhook.kotlin.models.ListResponseIntegrationOut

class Integration internal constructor(token: String, options: XwebhookOptions) {
    val api = IntegrationApi(options.serverUrl)

    init {
        api.accessToken = token
        api.userAgent = options.getUA()
        options.initialRetryDelayMillis?.let { api.initialRetryDelayMillis = it }
        options.numRetries?.let { api.numRetries = it }
    }

    suspend fun list(
        appId: String,
        options: IntegrationListOptions = IntegrationListOptions(),
    ): ListResponseIntegrationOut {
        try {
            return api.v1IntegrationList(appId, options.limit, options.iterator, options.order)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun create(
        appId: String,
        integIn: IntegrationIn,
        options: PostOptions = PostOptions(),
    ): IntegrationOut {
        try {
            return api.v1IntegrationCreate(appId, integIn, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun get(
        appId: String,
        integId: String,
    ): IntegrationOut {
        try {
            return api.v1IntegrationGet(appId, integId)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun update(
        appId: String,
        integId: String,
        integUpdate: IntegrationUpdate,
    ): IntegrationOut {
        try {
            return api.v1IntegrationUpdate(appId, integId, integUpdate)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun delete(
        appId: String,
        integId: String,
    ) {
        try {
            api.v1IntegrationDelete(appId, integId)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun getKey(
        appId: String,
        integId: String,
    ): IntegrationKeyOut {
        try {
            return api.v1IntegrationGetKey(appId, integId)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun rotateKey(
        appId: String,
        integId: String,
        options: PostOptions = PostOptions(),
    ): IntegrationKeyOut {
        try {
            return api.v1IntegrationRotateKey(
                appId,
                integId,
                options.idempotencyKey,
            )
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }
}
