<h1 align="center">
    <a style="text-decoration: none" href="https://webhook.openweb3.io">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://webhook.openweb3.io">Website</a> | <a href="https://docs.webhook.openweb3.io">Documentation</a> | <a href="https://webhook.openweb3.io/slack">Community Slack</a>
<h2>

![GitHub tag](https://img.shields.io/github/tag/xwebhook/xwebhook-libs.svg)
[![PyPI](https://img.shields.io/pypi/v/xwebhook.svg)](https://pypi.python.org/pypi/xwebhook/)
[![NPM version](https://img.shields.io/npm/v/xwebhook.svg)](https://www.npmjs.com/package/xwebhook)
[![Gem](https://img.shields.io/gem/v/xwebhook)](https://rubygems.org/gems/xwebhook)
[![Maven Central (Java)](https://img.shields.io/maven-central/v/com.xwebhook/xwebhook?label=maven-central%20(java))](https://search.maven.org/artifact/com.xwebhook/xwebhook)
[![Maven Central (Kotlin)](https://img.shields.io/maven-central/v/com.xwebhook.kotlin/xwebhook-kotlin?label=maven-central%20(kotlin))](https://search.maven.org/artifact/com.xwebhook.kotlin/xwebhook-kotlin)
[![Nuget](https://img.shields.io/nuget/v/xwebhook)](https://www.nuget.org/packages/Xwebhook/)
[![Packagist Version](https://img.shields.io/packagist/v/xwebhook/xwebhook)](https://packagist.org/packages/xwebhook/xwebhook)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/xwebhook/xwebhook-libs)](https://pkg.go.dev/github.com/xwebhook/xwebhook-libs/go)
[![Join our slack](https://img.shields.io/badge/Slack-join%20the%20community-blue?logo=slack&style=social)](https://webhook.openweb3.io/slack/)

# [Xwebhook](https://webhook.openweb3.io) Client Library Development Guide

Looking for general information? Checkout the [README](./README.md).

## Official Xwebhook Client Libraries

<table style="table-layout:fixed; white-space: nowrap;">
  <th colspan="6">⚡️ Feature Breakdown ⚡️</th>
  <tr>
    <th>Language</th>
    <th>Officially Supported</th>
    <th>API Support</th>
    <th>Webhook Verification</th>
    <th colspan="4">Other Notes</th>
  </tr>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/go/README.md">Go</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4"></th>
  </tr>
  </tr>
    <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/python/README.md">Python</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4"></th>
  </tr>
    </tr>
    <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/javascript/README.md">Typescript/Javascript</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4"></th>
  </tr>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/java/README.md">Java</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4">Async support planned. (If you use kotlin, checkout our kotlin library for coroutine support.)</th>
  </tr>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/kotlin/README.md">Kotlin</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4">
  </th>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/ruby/README.md">Ruby</a></th>
    <th>✅</th>
    <th>✅</th>
    <th>✅</th>
    <th colspan="4">
  </th>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/csharp/README.md">C# (dotnet)</a></th>
    <th>✅</th>
    <th>🔜</th>
    <th>✅</th>
    <th colspan="4">
  </th>
  <tr>
    <th>Rust</th>
    <th>🔜</th>
    <th>🔜</th>
    <th>🔜</th>
    <th colspan="4">
  </th>
  <tr>
    <th><a href="https://github.com/xwebhook/xwebhook-libs/blob/main/php/README.md">PHP</a></th>
    <th>✅</th>
    <th>🔜</th>
    <th>✅</th>
    <th colspan="4">
  </th>
</table>

## Usage Instructions

For examples on how to get started using our client libraries checkout our [General Documentation](https://docs.webhook.openweb3.io). For code examples checkout our [API Documentation]()

## Building the Client Libraries

We use [openapi-generator](https://github.com/OpenAPITools/openapi-generator) to autogenerate bindings in each language. We then use these bindings as the building blocks for our exposed API.  To generate these bindings from the root directory of the project run:

```sh
# Install deps
yarn

# Generate bindings for every language
./regen_openapi.sh
```

Once you have completed this step you can checkout the README of the language of your choice (found in the language's subdirectory) for detailed steps on building that particular library. You can find links to these guides in the chart [above](#official-xwebhook-client-libraries).
