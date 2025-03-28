// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.threads.messages.MessageCreateParams
import ai.hanzo.api.models.threads.messages.MessageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.threads().messages()

        val message =
            messageService.create(MessageCreateParams.builder().threadId("thread_id").build())

        message.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.threads().messages()

        val message = messageService.list(MessageListParams.builder().threadId("thread_id").build())

        message.validate()
    }
}
