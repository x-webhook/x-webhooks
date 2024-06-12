package com.xwebhook;

import com.xwebhook.exceptions.ApiException;

final class Utils {
    private Utils() {
    }

    public static ApiException wrapInternalApiException(final com.xwebhook.internal.ApiException e) {
        return new ApiException(e.getMessage(), e, e.getCode(), e.getResponseHeaders(), e.getResponseBody());
    }
}
