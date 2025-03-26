// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.model

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.model.info.InfoListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoService = client.model().info()

        val info = infoService.list(InfoListParams.builder().llmModelId("llm_model_id").build())

        info.validate()
    }
}
