// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.completions

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CompletionCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CompletionCreateParams.builder().model("model").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = CompletionCreateParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("model", "model").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CompletionCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
