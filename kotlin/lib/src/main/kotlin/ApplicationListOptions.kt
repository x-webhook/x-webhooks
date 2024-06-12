package com.xwebhook.kotlin

import com.xwebhook.kotlin.models.Ordering

class ApplicationListOptions : ListOptions() {
    var order: Ordering? = null

    fun order(order: Ordering) = apply { this.order = order }

    override fun iterator(iterator: String): ApplicationListOptions = apply { super.iterator(iterator) }

    override fun limit(limit: Int) = apply { super.limit(limit) }
}
