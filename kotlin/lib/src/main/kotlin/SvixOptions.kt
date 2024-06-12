package com.xwebhook.kotlin

data class XwebhookOptions(
    internal var wantedServerUrl: String? = null,
    val initialRetryDelayMillis: Long? = null,
    val numRetries: Int? = null,
) {
    private val version = "1.21.0"

    var serverUrl: String
        get() = this.wantedServerUrl ?: DEFAULT_URL
        set(value) {
            this.wantedServerUrl = value
        }

    companion object {
        const val DEFAULT_URL = "https://api.xwebhook.com"
    }

    internal fun getUA(): String {
        return "xwebhook-libs/$version/kotlin"
    }
}
