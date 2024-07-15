package io.openweb3.xwebhook.kotlin

class Xwebhook(token: String, options: XwebhookOptions = XwebhookOptions()) {
    init {
        val tokenParts = token.split(".")
        if (options.wantedServerUrl == null) {
            val region = tokenParts.last()
            if (region == "us") {
                options.serverUrl = "https://api.webhook.openweb3.io"
            } else if (region == "eu") {
                options.serverUrl = "https://api.webhook.openweb3.io"
            } else if (region == "in") {
                options.serverUrl = "https://api.webhook.openweb3.io"
            }
        }
    }

    val application = Application(token, options)
    val authentication = Authentication(token, options)
    val endpoint = Endpoint(token, options)
    val eventType = EventType(token, options)
    val integration = Integration(token, options)
    val message = Message(token, options)
    val messageAttempt = MessageAttempt(token, options)
    val statistics = Statistics(token, options)
}
