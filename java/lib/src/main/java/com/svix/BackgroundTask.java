package com.xwebhook;

import com.xwebhook.exceptions.ApiException;
import com.xwebhook.internal.api.BackgroundTasksApi;
import com.xwebhook.models.BackgroundTaskOut;
import com.xwebhook.models.ListResponseBackgroundTaskOut;

public final class BackgroundTask {
    private final BackgroundTasksApi api;

    BackgroundTask() {
        api = new BackgroundTasksApi();
    }

    public ListResponseBackgroundTaskOut list(final BackgroundTaskListOptions options) throws ApiException {
        try {
            return api.listBackgroundTasks(options.getStatus(), options.getTask(), options.getLimit(),
                    options.getIterator(),
                    options.getOrder());
        } catch (com.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

    public BackgroundTaskOut get(final String taskId) throws ApiException {
        try {
            return api.getBackgroundTask(taskId);
        } catch (com.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }
}
