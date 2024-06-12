package com.xwebhook;

import com.xwebhook.models.BackgroundTaskStatus;
import com.xwebhook.models.BackgroundTaskType;
import com.xwebhook.models.Ordering;

public class BackgroundTaskListOptions extends ListOptions {
    private BackgroundTaskStatus status;
    private BackgroundTaskType task;
    private Ordering order;

    public void setOrder(final Ordering order) {
        this.order = order;
    }

    public Ordering getOrder() {
        return this.order;
    }

    public void setStatus(final BackgroundTaskStatus status) {
        this.status = status;
    }

    public BackgroundTaskStatus getStatus() {
        return this.status;
    }

    public void setTask(final BackgroundTaskType task) {
        this.task = task;
    }

    public BackgroundTaskType getTask() {
        return this.task;
    }
}
