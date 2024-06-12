// SPDX-FileCopyrightText: © 2024 Xwebhook Authors
// SPDX-License-Identifier: MIT

use reqwest::StatusCode;

use crate::utils::{start_xwebhook_server, IgnoredResponse};

#[tokio::test]
async fn ping_with_trailing_slash() {
    let (client, _jh) = start_xwebhook_server().await;

    let _: IgnoredResponse = client
        .get("api/v1/health/ping/", StatusCode::NO_CONTENT)
        .await
        .unwrap();
}

#[tokio::test]
async fn ping_without_trailing_slash() {
    let (client, _jh) = start_xwebhook_server().await;

    let _: IgnoredResponse = client
        .get("api/v1/health/ping", StatusCode::NO_CONTENT)
        .await
        .unwrap();
}
