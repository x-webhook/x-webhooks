package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;
import io.openweb3.xwebhook.internal.api.BackgroundTasksApi;
import io.openweb3.xwebhook.models.BackgroundTaskOut;
import io.openweb3.xwebhook.models.ListResponseBackgroundTaskOut;

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
        } catch (io.openweb3.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }

    public BackgroundTaskOut get(final String taskId) throws ApiException {
        try {
            return api.getBackgroundTask(taskId);
        } catch (io.openweb3.xwebhook.internal.ApiException e) {
            throw Utils.wrapInternalApiException(e);
        }
    }
}
