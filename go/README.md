<h1 align="center">
    <a style="text-decoration: none" href="https://webhook.openweb3.io">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://webhook.openweb3.io">Website</a> | <a href="https://docs.webhook.openweb3.io">Documentation</a> | <a href="https://webhook.openweb3.io/slack">Community Slack</a>
<h2>

Go library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/x-webhook/x-webhooks)](https://pkg.go.dev/github.com/x-webhook/x-webhooks/go)

[![Join our slack](https://img.shields.io/badge/Slack-join%20the%20community-blue?logo=slack&style=social)](https://webhook.openweb3.io/slack/)

# Usage Documentation

You can find general usage documentation at <https://docs.webhook.openweb3.io>.  For complete API documentation with code examples for each endpoint in all of our official client libraries head over to our API documentation site at <https://api.webhook.openweb3.io>.

# Language Support

<table style="table-layout:fixed; white-space: nowrap;">
  <th colspan="2">⚡️ Features ⚡️</th>
  <tr>
    <th>Officially Supported</th>
    <th>✅</th>
  </tr>
  <tr>
    <th>API Support</th>
    <th>✅</th>
  </tr>
  <tr>
    <th>Signature Verification</th>
    <th>✅</th>
  </tr>
  <tr>
    <th>Caveats</th>
    <th>None! 🚀</th>
  </tr>
</table>

# Development


First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Requirements

 - go >= 1.16

## Contributing

Before opening a PR be sure to format your code!

```sh
go fmt ./...
```

## Running Tests

Simply run:

```sh
go test ./...
```

## Publishing

Releases use go modules and are automatically published by tagging the release commit.
