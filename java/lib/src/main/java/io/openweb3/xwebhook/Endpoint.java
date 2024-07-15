package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.EndpointApi;
import io.openweb3.xwebhook.models.EndpointHeadersIn;
import io.openweb3.xwebhook.models.EndpointHeadersOut;
import io.openweb3.xwebhook.models.EndpointHeadersPatchIn;
import io.openweb3.xwebhook.models.EndpointIn;
import io.openweb3.xwebhook.models.EndpointOut;
import io.openweb3.xwebhook.models.EndpointPatch;
import io.openweb3.xwebhook.models.EndpointUpdate;
import io.openweb3.xwebhook.models.EndpointSecretOut;
import io.openweb3.xwebhook.models.EndpointSecretRotateIn;
import io.openweb3.xwebhook.models.EndpointTransformationIn;
import io.openweb3.xwebhook.models.EndpointTransformationOut;
import io.openweb3.xwebhook.models.EventExampleIn;
import io.openweb3.xwebhook.models.ListResponseEndpointOut;
import io.openweb3.xwebhook.models.MessageOut;
import io.openweb3.xwebhook.models.RecoverIn;
import io.openweb3.xwebhook.models.ReplayIn;
import io.openweb3.xwebhook.models.EndpointStats;

public final class Endpoint {
	private final EndpointApi api;

	public Endpoint() {
		api = new EndpointApi();
	}

	public ListResponseEndpointOut list(final String appId, final EndpointListOptions options) throws ApiException {
		try {
			return api.v1EndpointList(appId, options.getLimit(), options.getIterator(), options.getOrder());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut create(final String appId, final EndpointIn endpointIn) throws ApiException {
		return this.create(appId, endpointIn, new PostOptions());
	}

	public EndpointOut create(final String appId, final EndpointIn endpointIn, final PostOptions options)
			throws ApiException {
		try {
			return api.v1EndpointCreate(appId, endpointIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut get(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGet(appId, endpointId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut update(final String appId, final String endpointId, final EndpointUpdate endpointUpdate)
			throws ApiException {
		try {
			return api.v1EndpointUpdate(appId, endpointId, endpointUpdate);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut patch(final String appId, final String endpointId, final EndpointPatch endpointPatch)
			throws ApiException {
		try {
			return api.v1EndpointPatch(appId, endpointId, endpointPatch);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void delete(final String appId, final String endpointId) throws ApiException {
		try {
			api.v1EndpointDelete(appId, endpointId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointSecretOut getSecret(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGetSecret(appId, endpointId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void rotateSecret(final String appId, final String endpointId,
			final EndpointSecretRotateIn endpointSecretRotateIn) throws ApiException {
		this.rotateSecret(appId, endpointId, endpointSecretRotateIn, new PostOptions());
	}

	public void rotateSecret(final String appId, final String endpointId,
			final EndpointSecretRotateIn endpointSecretRotateIn, final PostOptions options) throws ApiException {
		try {
			api.v1EndpointRotateSecret(appId, endpointId, endpointSecretRotateIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void recover(final String appId, final String endpointId, final RecoverIn recoverIn) throws ApiException {
		this.recover(appId, endpointId, recoverIn, new PostOptions());
	}

	public void recover(final String appId, final String endpointId, final RecoverIn recoverIn,
			final PostOptions options) throws ApiException {
		try {
			api.v1EndpointRecover(appId, endpointId, recoverIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointHeadersOut getHeaders(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGetHeaders(appId, endpointId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void updateHeaders(final String appId, final String endpointId, final EndpointHeadersIn endpointHeadersIn)
			throws ApiException {
		try {
			api.v1EndpointUpdateHeaders(appId, endpointId, endpointHeadersIn);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void patchHeaders(final String appId, final String endpointId,
			final EndpointHeadersPatchIn endpointHeadersIn) throws ApiException {
		try {
			api.v1EndpointPatchHeaders(appId, endpointId, endpointHeadersIn);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointStats getStats(final String appId, final String endpointId) throws ApiException {
		return getStats(appId, endpointId, new EndpointStatsOptions());
	}

	public EndpointStats getStats(final String appId, final String endpointId, final EndpointStatsOptions options)
			throws ApiException {
		try {
			return api.v1EndpointGetStats(appId, endpointId, options.getSince(), options.getUntil());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void replayMissing(final String appId, final String endpointId, final ReplayIn replayIn)
			throws ApiException {
		this.replayMissing(appId, endpointId, replayIn, new PostOptions());
	}

	public void replayMissing(final String appId, final String endpointId, final ReplayIn replayIn,
			final PostOptions options) throws ApiException {
		try {
			api.v1EndpointReplay(appId, endpointId, replayIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointTransformationOut transformationGet(final String appId, final String endpointId)
			throws ApiException {
		try {
			return api.v1EndpointTransformationGet(appId, endpointId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void transformationPartialUpdate(final String appId, final String endpointId,
			final EndpointTransformationIn transformationIn) throws ApiException {
		try {
			api.v1EndpointTransformationPartialUpdate(appId, endpointId, transformationIn);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public MessageOut sendExample(final String appId, final String endpointId, final EventExampleIn eventExampleIn)
			throws ApiException {
		return this.sendExample(appId, endpointId, eventExampleIn, new PostOptions());
	}

	public MessageOut sendExample(final String appId, final String endpointId, final EventExampleIn eventExampleIn,
			final PostOptions options) throws ApiException {
		try {
			return api.v1EndpointSendExample(appId, endpointId, eventExampleIn, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}
}
