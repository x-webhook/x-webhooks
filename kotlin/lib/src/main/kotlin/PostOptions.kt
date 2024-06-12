package com.xwebhook.kotlin

class PostOptions {
    var idempotencyKey: String? = null

    fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }
}
