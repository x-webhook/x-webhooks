#!/bin/sh -e
set -x

ruff check --fix xwebhook
ruff format xwebhook
