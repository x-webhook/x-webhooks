package com.xwebhook;

import java.util.HashSet;

import com.xwebhook.exceptions.ApiException;
import com.xwebhook.internal.api.MessageApi;
import com.xwebhook.models.ListResponseMessageOut;
import com.xwebhook.models.MessageIn;
import com.xwebhook.models.MessageOut;
import com.google.gson.JsonParser;

public final class Message {
	private final MessageApi api;

	Message() {
		api = new MessageApi();
	}

	public ListResponseMessageOut list(final String appId, final MessageListOptions options) throws ApiException {
		try {
			return api.v1MessageList(
					appId,
					options.getLimit(),
					options.getIterator(),
					options.getChannel(),
					options.getBefore(),
					options.getAfter(),
					options.getWithContent(),
					options.getTag(),
					new HashSet<>(options.getEventTypes())
			);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public MessageOut create(final String appId, final MessageIn messageIn) throws ApiException {
		return this.create(appId, messageIn, new PostOptions());
	}

	public MessageOut create(final String appId, final MessageIn messageIn, final PostOptions options) throws ApiException {
		try {
			return api.v1MessageCreate(appId, messageIn.payload(getPayload(messageIn.getPayload())), null, options.getIdempotencyKey());
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public MessageOut get(final String msgId, final String appId) throws ApiException {
		try {
			return api.v1MessageGet(appId, msgId, null);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	public void expungeContent(final String msgId, final String appId) throws ApiException {
		try {
			api.v1MessageExpungeContent(appId, msgId);
		} catch (com.xwebhook.internal.ApiException e) {
			throw Utils.wrapInternalApiException(e);
		}
	}

	private static Object getPayload(final Object payload) {
		// Convert string to JsonObject, otherwise gson fails to convert it.
		if (payload instanceof String) {
			return new JsonParser().parse(payload.toString());
		}
		return payload;
	}
}
