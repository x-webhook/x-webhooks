<h1 align="center">
    <a style="text-decoration: none" href="https://www.xwebhook.com">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://xwebhook.com">Website</a> | <a href="https://docs.xwebhook.com">Documentation</a> | <a href="https://xwebhook.com/slack">Community Slack</a>
<h2>

Java library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![Maven Central (Java)](https://img.shields.io/maven-central/v/com.xwebhook/xwebhook?label=maven-central%20(java))](https://search.maven.org/artifact/com.xwebhook/xwebhook)

[![Join our slack](https://img.shields.io/badge/Slack-join%20the%20community-blue?logo=slack&style=social)](https://www.xwebhook.com/slack/)

# Usage Documentation

You can find general usage documentation at <https://docs.xwebhook.com>.  For complete API documentation with code examples for each endpoint in all of our official client libraries head over to our API documentation site at <https://api.xwebhook.com>.

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
    <th>Async support planned. (If you use kotlin, checkout our kotlin library for coroutine support.)</th>
  </tr>
</table>

# Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xwebhook</groupId>
  <artifactId>xwebhook</artifactId>
  <version>1.24.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.xwebhook:xwebhook:1.24.0"
```

# Development

First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Requirements

 - Java 1.8+
 - Gradle

## Building the library
```sh
./gradlew build
```

## Running Tests

Simply run:

```sh
./gradlew test
```

## Publishing to Maven

```sh
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```

