package io.openweb3.xwebhook;

import java.util.HashSet;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.MessageAttemptApi;
import io.openweb3.xwebhook.models.ListResponseEndpointMessageOut;
import io.openweb3.xwebhook.models.ListResponseMessageAttemptEndpointOut;
import io.openweb3.xwebhook.models.ListResponseMessageAttemptOut;
import io.openweb3.xwebhook.models.ListResponseMessageEndpointOut;
import io.openweb3.xwebhook.models.MessageAttemptOut;

public final class MessageAttempt {
	private final MessageAttemptApi api;

	MessageAttempt() {
		api = new MessageAttemptApi();
	}

	/*
	* @deprecated: use listByMsg or listByEndpoint instead
     */
	@Deprecated
	public ListResponseMessageAttemptOut list(final String appId, final String msgId, final MessageAttemptListOptions options) throws ApiException {
		return this.listByMsg(appId, msgId, options);
	}

	public ListResponseMessageAttemptOut listByMsg(final String appId, final String msgId, final MessageAttemptListOptions options) throws ApiException {
		try {
			return api.v1MessageAttemptListByMsg(
					appId,
					msgId,
					options.getLimit(),
					options.getIterator(),
					options.getMessageStatus(),
					options.getStatusCodeClass(),
					options.getChannel(),
					options.getTag(),
					options.getEndpointId(),
					options.getBefore(),
					options.getAfter(),
					options.getWithContent(),
					new HashSet<>(options.getEventTypes())
			);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ListResponseMessageAttemptOut listByEndpoint(final String appId, final String endpointId, final MessageAttemptListOptions options) throws ApiException {
		try {
			return api.v1MessageAttemptListByEndpoint(
					appId,
					endpointId,
					options.getLimit(),
					options.getIterator(),
					options.getMessageStatus(),
					options.getStatusCodeClass(),
					options.getChannel(),
					options.getTag(),
					options.getBefore(),
					options.getAfter(),
					options.getWithContent(),
					options.getWithMsg(),
					new HashSet<>(options.getEventTypes())
			);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public MessageAttemptOut get(final String msgId, final String appId, final String attemptId) throws ApiException {
		try {
			return api.v1MessageAttemptGet(appId, msgId, attemptId);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void resend(final String msgId, final String appId, final String endpointId) throws ApiException {
		this.resend(msgId, appId, endpointId, new PostOptions());
	}

	public void resend(final String msgId, final String appId, final String endpointId, final PostOptions options) throws ApiException {
		try {
			api.v1MessageAttemptResend(appId, msgId, endpointId, options.getIdempotencyKey());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ListResponseEndpointMessageOut listAttemptedMessages(final String appId, final String endpointId, final MessageAttemptListOptions options) throws ApiException {
		try {
			return api.v1MessageAttemptListAttemptedMessages(
					appId,
					endpointId,
					options.getLimit(),
					options.getIterator(),
					options.getChannel(),
					options.getTag(),
					options.getMessageStatus(),
					options.getBefore(),
					options.getAfter(),
					options.getWithContent(),
					new HashSet<>(options.getEventTypes())
			);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ListResponseMessageEndpointOut listAttemptedDestinations(final String appId, final String msgId, final MessageAttemptListOptions options) throws ApiException {
		try {
			return api.v1MessageAttemptListAttemptedDestinations(appId, msgId, options.getLimit(), options.getIterator());
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public ListResponseMessageAttemptEndpointOut listAttemptsForEndpoint(final String appId, final String msgId, final String endpointId,
		final MessageAttemptListOptions options) throws ApiException {
			try {
				return api.v1MessageAttemptListByEndpointDeprecated(
						appId,
						msgId,
						endpointId,
						options.getLimit(),
						options.getIterator(),
						options.getChannel(),
						options.getTag(),
						options.getMessageStatus(),
						options.getBefore(),
						options.getAfter(),
						new HashSet<>(options.getEventTypes())
				);
			} catch (io.openweb3.xwebhook.internal.ApiException e) {
				throw Utils.wrapInternalApiException(e);
			}
	}

	public void expungeContent(final String appId, final String msgId, final String attemptId) throws ApiException {
		try {
			api.v1MessageAttemptExpungeContent(
				appId,
				msgId,
				attemptId
			);
		} catch (io.openweb3.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}
}
