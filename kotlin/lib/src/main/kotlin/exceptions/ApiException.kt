package io.openweb3.xwebhook.kotlin.exceptions

import io.openweb3.xwebhook.kotlin.internal.infrastructure.ClientError
import io.openweb3.xwebhook.kotlin.internal.infrastructure.ClientException
import io.openweb3.xwebhook.kotlin.internal.infrastructure.Response
import io.openweb3.xwebhook.kotlin.internal.infrastructure.ServerError
import io.openweb3.xwebhook.kotlin.internal.infrastructure.ServerException

class ApiException internal constructor(message: String? = null, val statusCode: Int = -1, val body: String? = null) : RuntimeException(
    message,
) {
    companion object {
        private fun extractBody(response: Response?): String? {
            return when (response) {
                is ClientError<*> -> {
                    val body = response.body
                    return if (body is String) body else null
                }
                is ServerError<*> -> {
                    val body = response.body
                    return if (body is String) body else null
                }
                else -> null
            }
        }

        internal fun wrap(e: Exception): Exception {
            return when (e) {
                is ServerException -> {
                    ApiException(e.message, e.statusCode, extractBody(e.response))
                }
                is ClientException -> {
                    ApiException(e.message, e.statusCode, extractBody(e.response))
                }
                else -> e
            }
        }
    }
}
