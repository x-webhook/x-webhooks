package io.openweb3.xwebhook.kotlin

class PostOptions {
    var idempotencyKey: String? = null

    fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }
}
