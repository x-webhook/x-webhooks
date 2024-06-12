using System;
using System.Collections.Generic;
using Xwebhook.Model;

namespace Xwebhook.Models
{
    public sealed class BackgroundTaskListOptions : ListOptions
    {
        public BackgroundTaskStatus? Status { get; set; }

        public BackgroundTaskType? Task { get; set; }
    }
}