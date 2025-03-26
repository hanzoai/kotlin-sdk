// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.delete

import ai.hanzo.api.models.add.IpAddress
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeleteCreateAllowedIpParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DeleteCreateAllowedIpParams.builder()
            .ipAddress(IpAddress.builder().ip("ip").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            DeleteCreateAllowedIpParams.builder()
                .ipAddress(IpAddress.builder().ip("ip").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(IpAddress.builder().ip("ip").build())
    }
}
