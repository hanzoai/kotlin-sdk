// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.batches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchCreateWithProviderParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BatchCreateWithProviderParams.builder().provider("provider").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = BatchCreateWithProviderParams.builder().provider("provider").build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
