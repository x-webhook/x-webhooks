using System;
using System.Net;
using Moq;
using Xwebhook.Abstractions;
using Xwebhook.Api;
using Xwebhook.Client;
using Xwebhook.Model;
using Xwebhook.Models;
using Xunit;

namespace Xwebhook.Tests
{
    public sealed class ApplicationTests
    {
        private const string MOCK_TOKEN = ";iuani;ansd;ifgjbnai;sdjfgb";

        private readonly Mock<IApplicationApi> _mockApplicationApi;

        private readonly Mock<IXwebhookOptions> _mockOptions;

        private readonly XwebhookClient _xwebhookClient;

        public ApplicationTests()
        {
            _mockApplicationApi = new Mock<IApplicationApi>();
            _mockOptions = new Mock<IXwebhookOptions>();
            _xwebhookClient = new XwebhookClient(
                MOCK_TOKEN,
                _mockOptions.Object,
                applicationApi: _mockApplicationApi.Object);
        }

        [Fact]
        public void ApplicationCreate_WithoutApplication_ThrowsException()
        {
            // Assert
            Assert.Throws<ArgumentNullException>(() => _xwebhookClient.Application.Create(null, null));
        }

        [Fact]
        public void ApplicationCreateAsync_WithoutApplication_ThrowsException()
        {
            // Assert
            Assert.ThrowsAsync<ArgumentNullException>(() => _xwebhookClient.Application.CreateAsync(null, null, null, default));
        }
    }
}