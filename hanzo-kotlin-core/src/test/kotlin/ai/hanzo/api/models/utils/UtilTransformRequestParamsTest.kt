// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UtilTransformRequestParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UtilTransformRequestParams.builder()
            .callType(UtilTransformRequestParams.CallType.EMBEDDING)
            .requestBody(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UtilTransformRequestParams.builder()
                .callType(UtilTransformRequestParams.CallType.EMBEDDING)
                .requestBody(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.callType()).isEqualTo(UtilTransformRequestParams.CallType.EMBEDDING)
        assertThat(body._requestBody()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
