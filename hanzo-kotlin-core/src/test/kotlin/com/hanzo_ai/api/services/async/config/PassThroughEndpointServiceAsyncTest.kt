// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.config

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PassThroughEndpointServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointServiceAsync.create(
                PassThroughEndpointCreateParams.builder()
                    .passThroughGenericEndpoint(
                        PassThroughGenericEndpoint.builder()
                            .headers(JsonValue.from(mapOf<String, Any>()))
                            .path("path")
                            .target("target")
                            .build()
                    )
                    .build()
            )

        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointServiceAsync.update(
                PassThroughEndpointUpdateParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointServiceAsync.list(
                PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointServiceAsync.delete(
                PassThroughEndpointDeleteParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }
}
