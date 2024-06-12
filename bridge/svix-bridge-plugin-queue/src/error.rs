pub use omniqueue::QueueError;
use xwebhook_bridge_types::xwebhook;

pub enum Error {
    Payload(String),
    Json(serde_json::Error),
    Queue(QueueError),
    Xwebhook(xwebhook::error::Error),
    Generic(String),
}
pub type Result<T> = std::result::Result<T, Error>;

impl From<xwebhook::error::Error> for Error {
    fn from(value: xwebhook::error::Error) -> Self {
        Error::Xwebhook(value)
    }
}

impl From<serde_json::Error> for Error {
    fn from(value: serde_json::Error) -> Self {
        Error::Json(value)
    }
}

impl From<QueueError> for Error {
    fn from(value: QueueError) -> Self {
        Error::Queue(value)
    }
}

impl From<String> for Error {
    fn from(value: String) -> Self {
        Self::Generic(value)
    }
}

impl From<Error> for std::io::Error {
    fn from(value: Error) -> Self {
        match value {
            Error::Payload(e) => std::io::Error::new(std::io::ErrorKind::Other, e),
            Error::Json(e) => std::io::Error::new(std::io::ErrorKind::Other, e),
            Error::Queue(e) => std::io::Error::new(std::io::ErrorKind::Other, e),
            Error::Xwebhook(e) => std::io::Error::new(std::io::ErrorKind::Other, e),
            Error::Generic(e) => std::io::Error::new(std::io::ErrorKind::Other, e),
        }
    }
}
