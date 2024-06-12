#!/usr/bin/env bash

set -ex

mypy xwebhook
ruff check xwebhook
ruff format --check xwebhook
