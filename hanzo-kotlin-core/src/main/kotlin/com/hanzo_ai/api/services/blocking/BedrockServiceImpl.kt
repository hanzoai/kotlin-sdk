// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockCreateResponse
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteResponse
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchResponse
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveResponse
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateResponse

class BedrockServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BedrockService {

    private val withRawResponse: BedrockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BedrockService.WithRawResponse = withRawResponse

    override fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions,
    ): BedrockCreateResponse =
        // post /bedrock/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions,
    ): BedrockRetrieveResponse =
        // get /bedrock/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions,
    ): BedrockUpdateResponse =
        // put /bedrock/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions,
    ): BedrockDeleteResponse =
        // delete /bedrock/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions,
    ): BedrockPatchResponse =
        // patch /bedrock/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BedrockService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BedrockCreateResponse> =
            jsonHandler<BedrockCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("bedrock", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BedrockRetrieveResponse> =
            jsonHandler<BedrockRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bedrock", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<BedrockUpdateResponse> =
            jsonHandler<BedrockUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("bedrock", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<BedrockDeleteResponse> =
            jsonHandler<BedrockDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("bedrock", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val patchHandler: Handler<BedrockPatchResponse> =
            jsonHandler<BedrockPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("bedrock", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
