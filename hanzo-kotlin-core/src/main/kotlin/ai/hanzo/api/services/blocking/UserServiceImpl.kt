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
import ai.hanzo.api.models.user.UserCreateParams
import ai.hanzo.api.models.user.UserCreateResponse
import ai.hanzo.api.models.user.UserDeleteParams
import ai.hanzo.api.models.user.UserDeleteResponse
import ai.hanzo.api.models.user.UserListParams
import ai.hanzo.api.models.user.UserListResponse
import ai.hanzo.api.models.user.UserRetrieveInfoParams
import ai.hanzo.api.models.user.UserRetrieveInfoResponse
import ai.hanzo.api.models.user.UserUpdateParams
import ai.hanzo.api.models.user.UserUpdateResponse

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): UserCreateResponse =
        // post /user/new
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): UserUpdateResponse =
        // post /user/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListResponse =
        // get /user/get_users
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions,
    ): UserDeleteResponse =
        // post /user/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveInfo(
        params: UserRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): UserRetrieveInfoResponse =
        // get /user/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<UserCreateResponse> =
            jsonHandler<UserCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<UserUpdateResponse> =
            jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<UserListResponse> =
            jsonHandler<UserListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "get_users")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<UserDeleteResponse> =
            jsonHandler<UserDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val retrieveInfoHandler: Handler<UserRetrieveInfoResponse> =
            jsonHandler<UserRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: UserRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
