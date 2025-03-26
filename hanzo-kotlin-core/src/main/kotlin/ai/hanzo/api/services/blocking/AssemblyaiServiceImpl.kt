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
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteParams
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchParams
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveParams
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateResponse

class AssemblyaiServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssemblyaiService {

    private val withRawResponse: AssemblyaiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssemblyaiService.WithRawResponse = withRawResponse

    override fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions,
    ): AssemblyaiCreateResponse =
        // post /assemblyai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions,
    ): AssemblyaiRetrieveResponse =
        // get /assemblyai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions,
    ): AssemblyaiUpdateResponse =
        // put /assemblyai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions,
    ): AssemblyaiDeleteResponse =
        // delete /assemblyai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions,
    ): AssemblyaiPatchResponse =
        // patch /assemblyai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssemblyaiService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AssemblyaiCreateResponse> =
            jsonHandler<AssemblyaiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("assemblyai", params._pathParam(0))
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

        private val retrieveHandler: Handler<AssemblyaiRetrieveResponse> =
            jsonHandler<AssemblyaiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("assemblyai", params._pathParam(0))
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

        private val updateHandler: Handler<AssemblyaiUpdateResponse> =
            jsonHandler<AssemblyaiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("assemblyai", params._pathParam(0))
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

        private val deleteHandler: Handler<AssemblyaiDeleteResponse> =
            jsonHandler<AssemblyaiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("assemblyai", params._pathParam(0))
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

        private val patchHandler: Handler<AssemblyaiPatchResponse> =
            jsonHandler<AssemblyaiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("assemblyai", params._pathParam(0))
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
