// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MessageListParams.builder().threadId("thread_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = MessageListParams.builder().threadId("thread_id").build()

        assertThat(params._pathParam(0)).isEqualTo("thread_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
