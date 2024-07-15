package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.EventTypeApi;
import io.openweb3.xwebhook.models.EventTypeImportOpenApiIn;
import io.openweb3.xwebhook.models.EventTypeImportOpenApiOut;
import io.openweb3.xwebhook.models.EventTypeIn;
import io.openweb3.xwebhook.models.EventTypeOut;
import io.openweb3.xwebhook.models.EventTypePatch;
import io.openweb3.xwebhook.models.EventTypeUpdate;
import io.openweb3.xwebhook.models.ListResponseEventTypeOut;

public final class EventType {
	private final EventTypeApi api;

	public EventType() {
		api = new EventTypeApi();
	}

	public ListResponseEventTypeOut list(final EventTypeListOptions options) throws ApiException {
		try {
			return api.v1EventTypeList(options.getLimit(), options.getIterator(), null, options.getIncludeArchived(), options.getWithContent());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeOut create(final EventTypeIn eventTypeIn) throws ApiException {
		return this.create(eventTypeIn, new PostOptions());
	}

	public EventTypeOut create(final EventTypeIn eventTypeIn, final PostOptions options) throws ApiException {
		try {
			return api.v1EventTypeCreate(eventTypeIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeOut get(final String eventTypeName) throws ApiException {
		try {
			return api.v1EventTypeGet(eventTypeName);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeOut update(final String eventTypeName, final EventTypeUpdate eventTypeUpdate) throws ApiException {
		try {
			return api.v1EventTypeUpdate(eventTypeName, eventTypeUpdate);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeOut patch(final String eventTypeName, final EventTypePatch eventTypePatch) throws ApiException {
		try {
			return api.v1EventTypePatch(eventTypeName, eventTypePatch);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void delete(final String eventTypeName) throws ApiException {
		try {
			api.v1EventTypeDelete(eventTypeName, null);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeImportOpenApiOut importOpenApi(final EventTypeImportOpenApiIn eventTypeImportOpenApiIn) throws ApiException {
		try {
			return this.importOpenApi(eventTypeImportOpenApiIn, new PostOptions());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EventTypeImportOpenApiOut importOpenApi(final EventTypeImportOpenApiIn eventTypeImportOpenApiIn, final PostOptions options) throws ApiException {
		try {
			return api.v1EventTypeImportOpenapi(eventTypeImportOpenApiIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}
}
