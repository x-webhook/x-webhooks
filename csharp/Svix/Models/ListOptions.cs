using Xwebhook.Model;

namespace Xwebhook.Models
{
    public class ListOptions
    {
        public string? Iterator { get; set; }

        public int? Limit { get; set; }

        public Ordering? Order { get; set; }
    }
}