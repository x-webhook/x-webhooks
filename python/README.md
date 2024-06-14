<h1 align="center">
    <a style="text-decoration: none" href="https://www.xwebhook.com">
      <img width="120" src="https://avatars.githubusercontent.com/u/80175132?s=200&v=4" />
      <p align="center">Xwebhook - Webhooks as a service</p>
    </a>
</h1>
<h2 align="center">
  <a href="https://xwebhook.com">Website</a> | <a href="https://docs.xwebhook.com">Documentation</a> | <a href="https://xwebhook.com/slack">Community Slack</a>
<h2>

Python library for interacting with the Xwebhook API and verifying webhook signatures

![GitHub tag](https://img.shields.io/github/tag/x-webhook/x-webhooks.svg)
[![PyPI](https://img.shields.io/pypi/v/xwebhook.svg)](https://pypi.python.org/pypi/xwebhook/)

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
pip install Xwebhook
```

## Usage
Please refer to [the documentation](https://docs.xwebhook.com/) or [the API reference](https://api.xwebhook.com/docs) for more usage instructions.

### Async
```python
from xwebhook.api import XwebhookAsync, ApplicationIn

xwebhook = XwebhookAsync("AUTH_TOKEN")
app = await xwebhook.application.create(ApplicationIn(name="Application name"))
```

### Sync

```python
from xwebhook.api import Xwebhook, ApplicationIn

xwebhook = Xwebhook("AUTH_TOKEN")
app = xwebhook.application.create(ApplicationIn(name="Application name"))
```

# Development

First checkout the [core README](../README.md#development) for details on how to generate our API bindings, then follow the steps below.

## Requirements

 - python 3

## Installing dependencies

```sh
python -m venv .venv
pip install -r requirements.txt && pip install -r requirements-dev.txt
./scripts/generate_openapi.sh
```

## Contributing

Before opening a PR be sure to format your code!

```sh
./scripts/format.sh
```

## Running Tests

Simply run:

```sh
pytest
```
