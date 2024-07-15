package io.openweb3.xwebhook.kotlin

open class ListOptions {
    var iterator: String? = null
    var limit = 50

    open fun iterator(iterator: String) = apply { this.iterator = iterator }

    open fun limit(limit: Int) = apply { this.limit = limit }
}
