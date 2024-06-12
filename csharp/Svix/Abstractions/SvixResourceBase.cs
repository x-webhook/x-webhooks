using System;
using Microsoft.Extensions.Logging;

namespace Xwebhook.Abstractions
{
    public abstract class XwebhookResourceBase
    {
        private XwebhookResourceBase()
        {
            // empty
        }

        protected ILogger Logger => XwebhookClient.Logger;

        protected readonly IXwebhookClient XwebhookClient;

        protected bool Throw => XwebhookClient?.Throw ?? false;

        protected XwebhookResourceBase(IXwebhookClient xwebhookClient)
        {
            XwebhookClient = xwebhookClient ?? throw new ArgumentNullException(nameof(xwebhookClient));
        }
    }
}