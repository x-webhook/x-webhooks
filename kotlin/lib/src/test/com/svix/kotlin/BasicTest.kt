package com.xwebhook.kotlin

import com.xwebhook.kotlin.models.ApplicationIn
import com.xwebhook.kotlin.models.MessageIn
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals

class BasicTest {
    @Test
    fun basicCrudTest() {
        val xwebhook = Xwebhook(AUTH_TOKEN, XwebhookOptions(SERVER_URL))
        runBlocking {
            val applicationOut = xwebhook.application.create(ApplicationIn(name = "App1"))
            assertEquals("App1", applicationOut.name)
            xwebhook.message.create(
                applicationOut.id,
                MessageIn(
                    eventType = "invoice.paid",
                    payload =
                        mapOf<String, Any>(
                            "id" to "invoice_WF7WtCLFFtd8ubcTgboSFNql",
                            "status" to "paid",
                            "attempt" to 2,
                        ),
                ),
            )
            xwebhook.application.delete(applicationOut.id)
        }
    }

    companion object {
        // Token for org org_00000000000LibTest000000000
        private const val AUTH_TOKEN =
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." +
                "eyJpYXQiOjE2NTc2MzQwNjcsImV4cCI6MTk3Mjk5NDA2NywibmJmIjoxNjU3NjM0MDY3LCJpc3M" +
                "iOiJzdml4LXNlcnZlciIsInN1YiI6Im9yZ18wMDAwMDAwMDAwMExpYlRlc3QwMDAwMDAwMDAifQ." +
                "IAy2wrnWhbGTeGHSYygKOID2LKFITaxNW8mHO7F5jWM"
        private const val SERVER_URL = "http://localhost:8071"
    }
}
