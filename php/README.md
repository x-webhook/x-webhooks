<h1 align="center">
    <a style="text-decoration: none" href="https://webhook.openweb3.io">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://webhook.openweb3.io">Website</a> | <a href="https://docs.webhook.openweb3.io">Documentation</a> | <a href="https://webhook.openweb3.io/slack">Community Slack</a>
<h2>

PHP library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![Packagist Version](https://img.shields.io/packagist/v/xwebhook/xwebhook)](https://packagist.org/packages/xwebhook/xwebhook)

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
    <th>🔜</th>
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

## Composer

Install via [Composer](https://getcomposer.org/):

```sh
composer require xwebhook/xwebhook
```

Autoload dependencies:
```php
require __DIR__ . '/vendor/autoload.php';
```

## Manual Installation

For now you can download the [latest release](https://github.com/x-webhook/x-webhooks/releases). Then, to use the bindings, include the `init.php` file.

```php
require_once('/path/to/xwebhook-php/init.php');
```

### Required Dependencies

Xwebhook PHP requires the following extensions in order to run:

- [`json`](https://secure.php.net/manual/en/book.json.php)

If you use Composer, these dependencies should be handled automatically. If you install manually, you'll want to make sure that these extensions are available.

# Development

First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Requirements

 - PHP >= 5.6.0

## Building the library
```sh
dotnet build
```

## Contributing

Before opening a PR be sure to format your code!

```sh
composer install
./vendor/bin/php-cs-fixer fix -v --using-cache=no .
```

## Running Tests

Simply run:

```sh
composer install
./vendor/bin/phpunit php/tests
```
