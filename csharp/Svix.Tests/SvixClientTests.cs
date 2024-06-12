using Microsoft.Extensions.Logging.Abstractions;
using Xwebhook.Models;
using Xunit;

namespace Xwebhook.Tests
{
    public class XwebhookClientTests
    {
        [Fact]
        public void Constructor_WhenCalled_DoesNotNeedLogger()
        {
            var sut = new XwebhookClient("", new XwebhookOptions("http://some.url"));

            Assert.NotNull(sut);
        }

        [Fact]
        public void Constructor_WhenCalled_AcceptsLogger()
        {
            var sut = new XwebhookClient("", new XwebhookOptions("http://some.url"), new NullLogger<XwebhookClient>());

            Assert.NotNull(sut);
        }
    }
}