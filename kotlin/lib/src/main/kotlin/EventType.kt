package com.xwebhook.kotlin

import com.xwebhook.kotlin.exceptions.ApiException
import com.xwebhook.kotlin.internal.apis.EventTypeApi
import com.xwebhook.kotlin.models.EventTypeImportOpenApiIn
import com.xwebhook.kotlin.models.EventTypeImportOpenApiOut
import com.xwebhook.kotlin.models.EventTypeIn
import com.xwebhook.kotlin.models.EventTypeOut
import com.xwebhook.kotlin.models.EventTypePatch
import com.xwebhook.kotlin.models.EventTypeUpdate
import com.xwebhook.kotlin.models.ListResponseEventTypeOut

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
