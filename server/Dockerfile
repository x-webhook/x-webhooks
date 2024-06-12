# Base build
FROM rust:1.76-slim-bookworm AS build

RUN apt-get update && apt-get install -y \
        build-essential=12.* \
        checkinstall=1.* \
        zlib1g-dev=1:* \
        pkg-config=1.8.* \
        libssl-dev=* \
        --no-install-recommends

RUN set -ex ; \
        mkdir -p /app ;\
        useradd appuser ;\
        chown -R appuser: /app ;\
        mkdir -p /home/appuser ;\
        chown -R appuser: /home/appuser

WORKDIR /app

# Hack to enable docker caching
COPY Cargo.toml .
COPY Cargo.lock .
COPY xwebhook-server_derive xwebhook-server_derive
COPY xwebhook-server/Cargo.toml xwebhook-server/
RUN set -ex ;\
        mkdir xwebhook-server/src ;\
        echo 'fn main() { println!("Dummy!"); }' > xwebhook-server/src/main.rs ;\
        cargo build --release ;\
        rm -rf xwebhook-server/src

COPY . .
RUN cargo build --release --frozen

# Production
FROM debian:bookworm-slim AS prod

RUN set -ex ; \
        mkdir -p /app ;\
        useradd appuser ;\
        chown -R appuser: /app ;\
        mkdir -p /home/appuser ;\
        chown -R appuser: /home/appuser

RUN apt-get update && apt-get install -y \
        ca-certificates=20230311 \
        libssl3=3.* \
        --no-install-recommends && \
        update-ca-certificates && \
        rm -rf /var/lib/apt/lists/*

USER appuser
EXPOSE 8080

COPY --from=build /app/target/release/xwebhook-server /usr/local/bin/xwebhook-server

# Ignoring this lint, because it's an embedded shell script
# hadolint ignore=DL3025
CMD \
    set -ex ; \
    if [ ! -z "$WAIT_FOR" ]; then \
        WAIT_FOR_ARG="--wait-for 15"; \
    fi ; \
    exec xwebhook-server --run-migrations $WAIT_FOR_ARG
