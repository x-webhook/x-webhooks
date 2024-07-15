package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.ApplicationApi;
import io.openweb3.xwebhook.models.ApplicationIn;
import io.openweb3.xwebhook.models.ApplicationOut;
import io.openweb3.xwebhook.models.ApplicationPatch;
import io.openweb3.xwebhook.models.ListResponseApplicationOut;

public final class Application {
	private final ApplicationApi api;

	Application() {
		api = new ApplicationApi();
	}

	public ListResponseApplicationOut list(final ApplicationListOptions options) throws ApiException {
		try {
			return api.v1ApplicationList(options.getLimit(), options.getIterator(), options.getOrder());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ApplicationOut create(final ApplicationIn applicationIn) throws ApiException {
		return this.create(applicationIn, new PostOptions());
	}

	public ApplicationOut create(final ApplicationIn applicationIn, final PostOptions options) throws ApiException {
		try {
			return api.v1ApplicationCreate(applicationIn, null, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ApplicationOut getOrCreate(final ApplicationIn applicationIn) throws ApiException {
		return this.getOrCreate(applicationIn, new PostOptions());
	}

	public ApplicationOut getOrCreate(final ApplicationIn applicationIn, final PostOptions options) throws ApiException {
		try {
			return api.v1ApplicationCreate(applicationIn, true, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ApplicationOut get(final String appId) throws ApiException {
		try {
			return api.v1ApplicationGet(appId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ApplicationOut update(final String appId, final ApplicationIn applicationIn) throws ApiException {
		try {
			return api.v1ApplicationUpdate(appId, applicationIn);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ApplicationOut patch(final String appId, final ApplicationPatch applicationPatch) throws ApiException {
		try {
			return api.v1ApplicationPatch(appId, applicationPatch);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void delete(final String appId) throws ApiException {
		try {
			api.v1ApplicationDelete(appId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}
}
