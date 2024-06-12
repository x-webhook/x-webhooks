using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;
using Xwebhook.Model;
using Xwebhook.Models;

namespace Xwebhook.Abstractions
{
    public interface IMessage
    {
        MessageOut Create(string appId, MessageIn message, MessageCreateOptions options = null,
            string idempotencyKey = default);

        Task<MessageOut> CreateAsync(string appId, MessageIn message, MessageCreateOptions options = null,
            string idempotencyKey = default, CancellationToken cancellationToken = default);

        MessageOut Get(string appId, string messageId, string idempotencyKey = default);

        Task<MessageOut> GetAsync(string appId, string messageId, string idempotencyKey = default,
            CancellationToken cancellationToken = default);

        ListResponseMessageOut List(string appId, MessageListOptions options = null, string idempotencyKey = default);

        Task<ListResponseMessageOut> ListAsync(string appId, MessageListOptions options = null, string idempotencyKey = default,
            CancellationToken cancellationToken = default);
    }
}
