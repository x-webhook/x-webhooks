package com.xwebhook;

import com.xwebhook.internal.ApiClient;
import com.xwebhook.internal.Configuration;
import com.xwebhook.internal.auth.HttpBearerAuth;

public final class Xwebhook {
	public static final String VERSION = "1.24.0";
	private final Application application;
	private final Authentication authentication;
	private final Endpoint endpoint;
	private final EventType eventType;
	private final Integration integration;
	private final Message message;
	private final MessageAttempt messageAttempt;
	private final Statistics statistics;

	public Xwebhook(final String token) {
		this(token, new XwebhookOptions());
	}

	public Xwebhook(final String token, final XwebhookOptions options) {
		ApiClient apiClient = new ApiClient();

		String[] tokenParts = token.split("\\.");
		String region = tokenParts[tokenParts.length - 1];
		if (region.equals("us")) {
			apiClient.setBasePath("https://api.us.xwebhook.com");
		} else if (region.equals("eu")) {
			apiClient.setBasePath("https://api.eu.xwebhook.com");
		} else if (region.equals("in")) {
			apiClient.setBasePath("https://api.in.xwebhook.com");
		} else {
			apiClient.setBasePath(options.getServerUrl());
		}

		apiClient.setUserAgent(String.format("xwebhook-libs/%s/java", Xwebhook.VERSION));

		HttpBearerAuth httpBearer = (HttpBearerAuth) apiClient.getAuthentication("HTTPBearer");
		httpBearer.setBearerToken(token);

		Configuration.setDefaultApiClient(apiClient);

		application = new Application();
		authentication = new Authentication();
		endpoint = new Endpoint();
		eventType = new EventType();
		integration = new Integration();
		message = new Message();
		messageAttempt = new MessageAttempt();
		statistics = new Statistics();
	}

	public Application getApplication() {
		return application;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public Endpoint getEndpoint() {
		return endpoint;
	}

	public EventType getEventType() {
		return eventType;
	}

	public Integration getIntegration() {
		return integration;
	}

	public Message getMessage() {
		return message;
	}

	public MessageAttempt getMessageAttempt() {
		return messageAttempt;
	}

	public Statistics getStatistics() {
		return statistics;
	}
}
