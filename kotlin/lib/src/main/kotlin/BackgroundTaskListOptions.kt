package com.xwebhook.kotlin

import com.xwebhook.kotlin.models.BackgroundTaskStatus
import com.xwebhook.kotlin.models.BackgroundTaskType
import com.xwebhook.kotlin.models.Ordering

class BackgroundTaskListOptions : ListOptions() {
    var status: BackgroundTaskStatus? = null
    var task: BackgroundTaskType? = null
    var order: Ordering? = null

    fun order(order: Ordering) = apply { this.order = order }

    fun status(status: BackgroundTaskStatus) = apply { this.status = status }

    fun task(task: BackgroundTaskType) = apply { this.task = task }

    override fun iterator(iterator: String) = apply { super.iterator(iterator) }

    override fun limit(limit: Int) = apply { super.limit(limit) }
}
