// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.model.ModelCreateParams
import ai.hanzo.api.models.model.ModelCreateResponse
import ai.hanzo.api.models.model.ModelDeleteParams
import ai.hanzo.api.models.model.ModelDeleteResponse
import ai.hanzo.api.services.async.model.InfoServiceAsync
import ai.hanzo.api.services.async.model.InfoServiceAsyncImpl
import ai.hanzo.api.services.async.model.UpdateServiceAsync
import ai.hanzo.api.services.async.model.UpdateServiceAsyncImpl

class ModelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelServiceAsync {

    private val withRawResponse: ModelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val update: UpdateServiceAsync by lazy { UpdateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ModelServiceAsync.WithRawResponse = withRawResponse

    override fun info(): InfoServiceAsync = info

    override fun update(): UpdateServiceAsync = update

    override suspend fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions,
    ): ModelCreateResponse =
        // post /model/new
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions,
    ): ModelDeleteResponse =
        // post /model/delete
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val update: UpdateServiceAsync.WithRawResponse by lazy {
            UpdateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun update(): UpdateServiceAsync.WithRawResponse = update

        private val createHandler: Handler<ModelCreateResponse> =
            jsonHandler<ModelCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<ModelDeleteResponse> =
            jsonHandler<ModelDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
    }
}
