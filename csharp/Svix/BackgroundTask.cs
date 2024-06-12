using System;
using System.Collections.Generic;
using System.Net;
using System.Threading;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using Xwebhook.Abstractions;
using Xwebhook.Api;
using Xwebhook.Client;
using Xwebhook.Model;
using Xwebhook.Models;

namespace Xwebhook
{
    public sealed class BackgroundTask : XwebhookResourceBase, IBackgroundTask
    {
        private readonly IBackgroundTasksApi _backgroundTaskApi;

        public BackgroundTask(IXwebhookClient xwebhookClient, IBackgroundTasksApi backgroundTaskApi)
            : base(xwebhookClient)
        {
            _backgroundTaskApi = backgroundTaskApi ?? throw new ArgumentNullException(nameof(backgroundTaskApi));
        }

        public BackgroundTaskOut Get(string taskId, string idempotencyKey = default)
        {
            try
            {
                var lBackgroundTask = _backgroundTaskApi.GetBackgroundTask(taskId);

                return lBackgroundTask;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(Get)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }

        public async Task<BackgroundTaskOut> GetAsync(string taskId, string idempotencyKey = default, CancellationToken cancellationToken = default)
        {
            try
            {
                var lBackgroundTask = await _backgroundTaskApi.GetBackgroundTaskAsync(taskId);

                return lBackgroundTask;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(GetAsync)} failed");

                if (Throw)
                    throw;

                return null;
            }
        }

        public ListResponseBackgroundTaskOut List(BackgroundTaskListOptions options = null, string idempotencyKey = default)
        {
            try
            {
                var lResponse = _backgroundTaskApi.ListBackgroundTasks(
                    options?.Status,
                    options?.Task,
                    options?.Limit,
                    options?.Iterator,
                    options?.Order);

                return lResponse;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(List)} failed");

                if (Throw)
                    throw;

                return new ListResponseBackgroundTaskOut();
            }
        }

        public async Task<ListResponseBackgroundTaskOut> ListAsync(BackgroundTaskListOptions options = null, string idempotencyKey = default, CancellationToken cancellationToken = default)
        {
            try
            {
                var lResponse = await _backgroundTaskApi.ListBackgroundTasksAsync(
                    options?.Status,
                    options?.Task,
                    options?.Limit,
                    options?.Iterator,
                    options?.Order,
                    cancellationToken);

                return lResponse;
            }
            catch (ApiException e)
            {
                Logger?.LogError(e, $"{nameof(ListAsync)} failed");

                if (Throw)
                    throw;

                return new ListResponseBackgroundTaskOut();
            }
        }
    }
}
