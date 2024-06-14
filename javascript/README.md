<h1 align="center">
    <a style="text-decoration: none" href="https://www.xwebhook.com">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://xwebhook.com">Website</a> | <a href="https://docs.xwebhook.com">Documentation</a> | <a href="https://xwebhook.com/slack">Community Slack</a>
<h2>

Typescript/Javascript library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![NPM version](https://img.shields.io/npm/v/xwebhook.svg)](https://www.npmjs.com/package/xwebhook)

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
    <th>None! 🚀</th>
  </tr>
</table>

# Installation

```sh
npm install xwebhook
# or
yarn add xwebhook
```

# Usage

```js
import { Xwebhook } from "xwebhook";

const xwebhook = new Xwebhook("AUTH_TOKEN");
const app = await xwebhook.application.create({ name: "Application name" });
```
# Development


First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Requirements

 - node
 - yarn

## Building the library
```sh
yarn
yarn build
```

## Contributing

Before opening a PR be sure to format your code!

```sh
yarn lint:fix
```

## Running Tests

Simply run:

```sh
yarn test
```
