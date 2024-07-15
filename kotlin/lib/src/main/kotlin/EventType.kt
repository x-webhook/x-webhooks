package io.openweb3.xwebhook.kotlin

import io.openweb3.xwebhook.kotlin.exceptions.ApiException
import io.openweb3.xwebhook.kotlin.internal.apis.EventTypeApi
import io.openweb3.xwebhook.kotlin.models.EventTypeImportOpenApiIn
import io.openweb3.xwebhook.kotlin.models.EventTypeImportOpenApiOut
import io.openweb3.xwebhook.kotlin.models.EventTypeIn
import io.openweb3.xwebhook.kotlin.models.EventTypeOut
import io.openweb3.xwebhook.kotlin.models.EventTypePatch
import io.openweb3.xwebhook.kotlin.models.EventTypeUpdate
import io.openweb3.xwebhook.kotlin.models.ListResponseEventTypeOut

class EventType internal constructor(token: String, options: XwebhookOptions) {
    val api = EventTypeApi(options.serverUrl)

    init {
        api.accessToken = token
        api.userAgent = options.getUA()
        options.initialRetryDelayMillis?.let { api.initialRetryDelayMillis = it }
        options.numRetries?.let { api.numRetries = it }
    }

    suspend fun list(options: EventTypeListOptions = EventTypeListOptions()): ListResponseEventTypeOut {
        try {
            return api.v1EventTypeList(options.limit, options.iterator, null, options.includeAchived, options.withContent)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun create(
        eventTypeIn: EventTypeIn,
        options: PostOptions = PostOptions(),
    ): EventTypeOut {
        try {
            return api.v1EventTypeCreate(eventTypeIn, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun get(eventTypeName: String): EventTypeOut {
        try {
            return api.v1EventTypeGet(eventTypeName)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun update(
        eventTypeName: String,
        eventTypeUpdate: EventTypeUpdate,
    ): EventTypeOut {
        try {
            return api.v1EventTypeUpdate(eventTypeName, eventTypeUpdate)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun patch(
        eventTypeName: String,
        eventTypePatch: EventTypePatch,
    ): EventTypeOut {
        try {
            return api.v1EventTypePatch(eventTypeName, eventTypePatch)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun delete(eventTypeName: String) {
        try {
            api.v1EventTypeDelete(eventTypeName, null)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }

    suspend fun importOpenApi(
        eventTypeImportOpenApiIn: EventTypeImportOpenApiIn,
        options: PostOptions = PostOptions(),
    ): EventTypeImportOpenApiOut {
        try {
            return api.v1EventTypeImportOpenapi(eventTypeImportOpenApiIn, options.idempotencyKey)
        } catch (e: Exception) {
            throw ApiException.wrap(e)
        }
    }
}
