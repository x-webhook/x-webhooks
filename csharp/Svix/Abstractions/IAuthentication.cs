using System.Threading;
using System.Threading.Tasks;
using Xwebhook.Model;

namespace Xwebhook.Abstractions
{
    public interface IAuthentication
    {
        DashboardAccessOut GetDashboardAccess(string appId, string idempotencyKey = default);

        Task<DashboardAccessOut> GetDashboardAccessAsync(string appId, string idempotencyKey = default,
            CancellationToken cancellationToken = default);

        bool Logout(string idempotencyKey = default);

        Task<bool> LogoutAsync(string idempotencyKey = default, CancellationToken cancellationToken = default);
    }
}