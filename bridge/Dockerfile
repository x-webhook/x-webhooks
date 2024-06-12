# Base build
FROM rust:1.72-slim-bullseye AS build

RUN apt-get update && apt-get install -y \
    build-essential=12.* \
    checkinstall=1.* \
    curl=7.* \
    libssl-dev=* \
    pkg-config=0.29.* \
    zlib1g-dev=1:* \
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
COPY xwebhook-bridge-types/Cargo.toml xwebhook-bridge-types/
COPY xwebhook-bridge-plugin-queue/Cargo.toml xwebhook-bridge-plugin-queue/
COPY xwebhook-bridge/Cargo.toml xwebhook-bridge/
RUN set -ex ;\
        mkdir xwebhook-bridge-plugin-queue/src ;\
        mkdir xwebhook-bridge-types/src ;\
        mkdir xwebhook-bridge/src ;\
        echo '' > xwebhook-bridge-plugin-queue/src/lib.rs ;\
        echo '' > xwebhook-bridge-types/src/lib.rs ;\
        echo 'fn main() { println!("Dummy!"); }' > xwebhook-bridge/src/main.rs ;\
        cargo build --release ;\
        rm -rf \
          xwebhook-bridge-plugin-queue/src \
          xwebhook-bridge-types/src \
          xwebhook-bridge/src

COPY . .
# touching the lib.rs/main.rs ensures cargo rebuilds them instead of considering them already built.
RUN touch */src/lib.rs && touch */src/main.rs
RUN cargo build --release --frozen

# Production
FROM debian:bullseye-slim AS prod

RUN set -ex ; \
        mkdir -p /app ;\
        useradd appuser ;\
        chown -R appuser: /app ;\
        mkdir -p /home/appuser ;\
        chown -R appuser: /home/appuser

RUN apt-get update ;\
    apt-get install --no-install-recommends -y ca-certificates=20210119; \
    update-ca-certificates; \
    rm -rf /var/lib/apt/lists/*

USER appuser

COPY --from=build /app/target/release/xwebhook-bridge /usr/local/bin/xwebhook-bridge
EXPOSE 5000

# Will fail if there's no `xwebhook-bridge.yaml` in the CWD or `XWEBHOOK_BRIDGE_CFG` is not set to a valid
# path to a config.
CMD ["xwebhook-bridge"]
