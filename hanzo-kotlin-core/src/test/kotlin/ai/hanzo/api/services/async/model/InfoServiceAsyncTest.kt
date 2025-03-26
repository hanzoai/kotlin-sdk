// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.model.info.InfoListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.model().info()

        val info =
            infoServiceAsync.list(InfoListParams.builder().llmModelId("llm_model_id").build())

        info.validate()
    }
}
