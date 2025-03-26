// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.gemini.GeminiCreateParams
import ai.hanzo.api.models.gemini.GeminiCreateResponse
import ai.hanzo.api.models.gemini.GeminiDeleteParams
import ai.hanzo.api.models.gemini.GeminiDeleteResponse
import ai.hanzo.api.models.gemini.GeminiPatchParams
import ai.hanzo.api.models.gemini.GeminiPatchResponse
import ai.hanzo.api.models.gemini.GeminiRetrieveParams
import ai.hanzo.api.models.gemini.GeminiRetrieveResponse
import ai.hanzo.api.models.gemini.GeminiUpdateParams
import ai.hanzo.api.models.gemini.GeminiUpdateResponse

class GeminiServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GeminiService {

    private val withRawResponse: GeminiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GeminiService.WithRawResponse = withRawResponse

    override fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions,
    ): GeminiCreateResponse =
        // post /gemini/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions,
    ): GeminiRetrieveResponse =
        // get /gemini/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions,
    ): GeminiUpdateResponse =
        // put /gemini/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions,
    ): GeminiDeleteResponse =
        // delete /gemini/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions,
    ): GeminiPatchResponse =
        // patch /gemini/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeminiService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<GeminiCreateResponse> =
            jsonHandler<GeminiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("gemini", params._pathParam(0))
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

        private val retrieveHandler: Handler<GeminiRetrieveResponse> =
            jsonHandler<GeminiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("gemini", params._pathParam(0))
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

        private val updateHandler: Handler<GeminiUpdateResponse> =
            jsonHandler<GeminiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("gemini", params._pathParam(0))
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

        private val deleteHandler: Handler<GeminiDeleteResponse> =
            jsonHandler<GeminiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("gemini", params._pathParam(0))
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

        private val patchHandler: Handler<GeminiPatchResponse> =
            jsonHandler<GeminiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeminiPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("gemini", params._pathParam(0))
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
