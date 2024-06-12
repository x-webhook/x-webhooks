using Xwebhook.Abstractions;

namespace Xwebhook.Models
{
    public sealed class XwebhookOptions : IXwebhookOptions
    {
        public string ServerUrl { get; }

        public bool Throw { get; }

        private XwebhookOptions()
        {
            // empty
        }

        public XwebhookOptions(string serverUrl, bool bThrow = true)
        {
            ServerUrl = serverUrl;
            Throw = bThrow;
        }
    }
}