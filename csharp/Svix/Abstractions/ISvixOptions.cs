namespace Xwebhook.Abstractions
{
    public interface IXwebhookOptions
    {
        public string ServerUrl { get; }

        public bool Throw { get; }
    }
}