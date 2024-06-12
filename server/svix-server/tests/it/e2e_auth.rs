//! Module that test the dashboard-access endpoint and associated JWT tokens. This module will test
//! that the tokens returned by the endpoint have restricted functionality and that the response
//! from the endpoint is valid in the process.

use reqwest::StatusCode;
use serde_json::Value;
use xwebhook_server::{
    core::{
        security::{INVALID_TOKEN_ERR, JWT_SECRET_ERR},
        types::ApplicationId,
    },
    v1::endpoints::application::ApplicationOut,
};

use crate::utils::{
    common_calls::{app_portal_access, application_in},
    get_default_test_config, start_xwebhook_server, IgnoredResponse,
};

#[tokio::test]
/// Users with application-level tokens should only be allowed to read the information related to
/// their one application. All other endpoints should error.
async fn test_restricted_application_access() {
    let (client, _jh) = start_xwebhook_server().await;

    let app_id: ApplicationId = client
        .post::<_, ApplicationOut>(
            "api/v1/app/",
            application_in("TEST_APP_NAME"),
            StatusCode::CREATED,
        )
        .await
        .unwrap()
        .id;
    let app_id_2: ApplicationId = client
        .post::<_, ApplicationOut>(
            "api/v1/app/",
            application_in("TEST_APP_NAME_2"),
            StatusCode::CREATED,
        )
        .await
        .unwrap()
        .id;

    let client = app_portal_access(&client, &app_id, Default::default()).await;

    // CREATE, UPDATE, DELETE, and LIST ops
    let _: IgnoredResponse = client
        .post(
            "api/v1/app/",
            application_in("TEST_APP_NAME"),
            StatusCode::FORBIDDEN,
        )
        .await
        .unwrap();
    let _: IgnoredResponse = client
        .put(
            &format!("api/v1/app/{app_id}/"),
            application_in("TEST_APP_NAME"),
            StatusCode::FORBIDDEN,
        )
        .await
        .unwrap();
    let _: IgnoredResponse = client
        .delete(&format!("api/v1/app/{app_id}/"), StatusCode::FORBIDDEN)
        .await
        .unwrap();
    let _: IgnoredResponse = client
        .get("api/v1/app/", StatusCode::FORBIDDEN)
        .await
        .unwrap();

    // READ should succeed when accessing the app_id the token is auhtorized for but no others
    let _: IgnoredResponse = client
        .get(&format!("api/v1/app/{app_id_2}/"), StatusCode::NOT_FOUND)
        .await
        .unwrap();
    let _: ApplicationOut = client
        .get(&format!("api/v1/app/{app_id}/"), StatusCode::OK)
        .await
        .unwrap();
}

#[tokio::test]
async fn test_dashboard_access_without_body() {
    let (client, _jh) = start_xwebhook_server().await;

    let app_id: ApplicationId = client
        .post::<_, ApplicationOut>(
            "api/v1/app/",
            application_in("TEST_APP_NAME"),
            StatusCode::CREATED,
        )
        .await
        .unwrap()
        .id;

    // We just need to ensure we get an OK response without a body.
    let _: IgnoredResponse = client
        .post(
            &format!("api/v1/auth/dashboard-access/{app_id}/"),
            (),
            StatusCode::OK,
        )
        .await
        .unwrap();
}

#[tokio::test]
async fn test_invalid_auth_error_detail() {
    let (mut client, _jh) = start_xwebhook_server().await;
    let cfg = get_default_test_config();
    let jwt_secret = match cfg.jwt_signing_config.as_ref() {
        xwebhook_server::core::security::JwtSigningConfig::Default { jwt_secret } => {
            std::str::from_utf8(&jwt_secret.to_bytes())
                .unwrap()
                .to_owned()
        }

        _ => return {},
    };

    client.set_auth_header("some-nonsense-key".to_string());
    match client
        .post::<_, Value>(
            "api/v1/app/",
            application_in("TEST_APP_NAME"),
            StatusCode::UNAUTHORIZED,
        )
        .await
    {
        Ok(Value::Object(i)) => {
            assert_eq!(i.get("detail").unwrap(), INVALID_TOKEN_ERR);
        }
        _ => {
            panic!("Unexpected response");
        }
    }
    client.set_auth_header(jwt_secret);
    match client
        .post::<_, Value>(
            "api/v1/app/",
            application_in("TEST_APP_NAME"),
            StatusCode::UNAUTHORIZED,
        )
        .await
    {
        Ok(Value::Object(i)) => {
            assert_eq!(i.get("detail").unwrap(), JWT_SECRET_ERR);
        }
        _ => {
            panic!("Unexpected response");
        }
    }
}
