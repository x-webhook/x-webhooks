using System.Threading;
using System.Threading.Tasks;

namespace Xwebhook.Abstractions
{
    public interface IHealth
    {
        bool IsHealthy(string idempotencyKey = default);

        Task<bool> IsHealthyAsync(string idempotencyKey = default, CancellationToken cancellationToken = default);
    }
}