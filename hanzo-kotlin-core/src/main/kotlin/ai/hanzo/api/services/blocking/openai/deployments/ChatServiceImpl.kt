// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.openai.deployments

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
import ai.hanzo.api.models.openai.deployments.chat.ChatCompleteParams
import ai.hanzo.api.models.openai.deployments.chat.ChatCompleteResponse

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions,
    ): ChatCompleteResponse =
        // post /openai/deployments/{model}/chat/completions
        withRawResponse().complete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val completeHandler: Handler<ChatCompleteResponse> =
            jsonHandler<ChatCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "openai",
                        "deployments",
                        params._pathParam(0),
                        "chat",
                        "completions",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { completeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
