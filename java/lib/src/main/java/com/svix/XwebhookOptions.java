package com.xwebhook;

public final class XwebhookOptions {
	private static final String DEFAULT_URL = "https://api.xwebhook.com";

	private boolean debug = false;
	private String serverUrl = DEFAULT_URL;

	public XwebhookOptions() {
	}

	public XwebhookOptions debug(final boolean debug) {
		this.debug = debug;
		return this;
	}

	public XwebhookOptions serverUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
		return this;
	}

	public void setDebug(final boolean debug) {
		this.debug = debug;
	}

	public void setServerUrl(final String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public boolean getDebug() {
		return debug;
	}

	public String getServerUrl() {
		return serverUrl;
	}
}
