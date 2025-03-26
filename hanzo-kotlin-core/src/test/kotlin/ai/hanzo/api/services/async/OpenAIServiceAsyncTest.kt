// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.openai.OpenAICreateParams
import ai.hanzo.api.models.openai.OpenAIDeleteParams
import ai.hanzo.api.models.openai.OpenAIPatchParams
import ai.hanzo.api.models.openai.OpenAIRetrieveParams
import ai.hanzo.api.models.openai.OpenAIUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OpenAIServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openai =
            openaiServiceAsync.create(OpenAICreateParams.builder().endpoint("endpoint").build())

        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openai =
            openaiServiceAsync.retrieve(OpenAIRetrieveParams.builder().endpoint("endpoint").build())

        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openai =
            openaiServiceAsync.update(OpenAIUpdateParams.builder().endpoint("endpoint").build())

        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openai =
            openaiServiceAsync.delete(OpenAIDeleteParams.builder().endpoint("endpoint").build())

        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val response =
            openaiServiceAsync.patch(OpenAIPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
