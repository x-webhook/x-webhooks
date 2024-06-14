<h1 align="center">
    <a style="text-decoration: none" href="https://www.xwebhook.com">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://xwebhook.com">Website</a> | <a href="https://docs.xwebhook.com">Documentation</a> | <a href="https://xwebhook.com/slack">Community Slack</a>
<h2>

Ruby library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![Gem](https://img.shields.io/gem/v/xwebhook)](https://rubygems.org/gems/xwebhook)


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
    <th>🚀 None!</th>
  </tr>
</table>

## Installation

Add this line to your application's Gemfile:

```ruby
gem 'xwebhook'
```

And then execute:

```sh
bundle
```

Or install it yourself as:

```sh
gem install xwebhook
```

# Development

First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Building

```sh
bundler exec rake build
```

## Contributing

Before opening a PR be sure to format your code!

```sh
bundle exec rspec spec
```

## Running Tests

Simply run:

```sh
bundle exec rspec spec
```

## Publishing

```sh
gem build xwebhook.gemspec

gem push pkg/xwebhook-<VERSION>.gem
```
