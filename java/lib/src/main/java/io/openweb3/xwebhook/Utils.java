package io.openweb3.xwebhook;

import io.openweb3.xwebhook.exceptions.ApiException;

final class Utils {
    private Utils() {
    }

    public static ApiException wrapInternalApiException(final io.openweb3.xwebhook.internal.ApiException e) {
        return new ApiException(e.getMessage(), e, e.getCode(), e.getResponseHeaders(), e.getResponseBody());
    }
}
