using System;
using System.Collections.Generic;

namespace Xwebhook.Models
{
    public sealed class EndpointStatsOptions
    {
        public DateTime? Since { get; set; }

        public DateTime? Until { get; set; }
    }
}