package com.xwebhook;

import com.xwebhook.exceptions.ApiException;
import com.xwebhook.internal.api.EndpointApi;
import com.xwebhook.models.EndpointHeadersIn;
import com.xwebhook.models.EndpointHeadersOut;
import com.xwebhook.models.EndpointHeadersPatchIn;
import com.xwebhook.models.EndpointIn;
import com.xwebhook.models.EndpointOut;
import com.xwebhook.models.EndpointPatch;
import com.xwebhook.models.EndpointUpdate;
import com.xwebhook.models.EndpointSecretOut;
import com.xwebhook.models.EndpointSecretRotateIn;
import com.xwebhook.models.EndpointTransformationIn;
import com.xwebhook.models.EndpointTransformationOut;
import com.xwebhook.models.EventExampleIn;
import com.xwebhook.models.ListResponseEndpointOut;
import com.xwebhook.models.MessageOut;
import com.xwebhook.models.RecoverIn;
import com.xwebhook.models.ReplayIn;
import com.xwebhook.models.EndpointStats;

public final class Endpoint {
	private final EndpointApi api;

	public Endpoint() {
		api = new EndpointApi();
	}

	public ListResponseEndpointOut list(final String appId, final EndpointListOptions options) throws ApiException {
		try {
			return api.v1EndpointList(appId, options.getLimit(), options.getIterator(), options.getOrder());
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut get(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGet(appId, endpointId);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut update(final String appId, final String endpointId, final EndpointUpdate endpointUpdate)
			throws ApiException {
		try {
			return api.v1EndpointUpdate(appId, endpointId, endpointUpdate);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointOut patch(final String appId, final String endpointId, final EndpointPatch endpointPatch)
			throws ApiException {
		try {
			return api.v1EndpointPatch(appId, endpointId, endpointPatch);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void delete(final String appId, final String endpointId) throws ApiException {
		try {
			api.v1EndpointDelete(appId, endpointId);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointSecretOut getSecret(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGetSecret(appId, endpointId);
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointHeadersOut getHeaders(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1EndpointGetHeaders(appId, endpointId);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void updateHeaders(final String appId, final String endpointId, final EndpointHeadersIn endpointHeadersIn)
			throws ApiException {
		try {
			api.v1EndpointUpdateHeaders(appId, endpointId, endpointHeadersIn);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void patchHeaders(final String appId, final String endpointId,
			final EndpointHeadersPatchIn endpointHeadersIn) throws ApiException {
		try {
			api.v1EndpointPatchHeaders(appId, endpointId, endpointHeadersIn);
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public EndpointTransformationOut transformationGet(final String appId, final String endpointId)
			throws ApiException {
		try {
			return api.v1EndpointTransformationGet(appId, endpointId);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void transformationPartialUpdate(final String appId, final String endpointId,
			final EndpointTransformationIn transformationIn) throws ApiException {
		try {
			api.v1EndpointTransformationPartialUpdate(appId, endpointId, transformationIn);
		} catch (com.xwebhook.internal.ApiException e) {
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
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}
}
