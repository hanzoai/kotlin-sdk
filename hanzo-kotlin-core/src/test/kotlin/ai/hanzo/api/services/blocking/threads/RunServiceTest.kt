// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.threads.runs.RunCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.threads().runs()

        val run = runService.create(RunCreateParams.builder().threadId("thread_id").build())

        run.validate()
    }
}
