// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.assistants.AssistantCreateParams
import com.hanzo_ai.api.models.assistants.AssistantCreateResponse
import com.hanzo_ai.api.models.assistants.AssistantDeleteParams
import com.hanzo_ai.api.models.assistants.AssistantDeleteResponse
import com.hanzo_ai.api.models.assistants.AssistantListParams
import com.hanzo_ai.api.models.assistants.AssistantListResponse

interface AssistantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    suspend fun create(
        params: AssistantCreateParams = AssistantCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): AssistantCreateResponse =
        create(AssistantCreateParams.none(), requestOptions)

    /**
     * Returns a list of assistants.
     *
     * API Reference docs - https://platform.openai.com/docs/api-reference/assistants/listAssistants
     */
    suspend fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AssistantListResponse =
        list(AssistantListParams.none(), requestOptions)

    /**
     * Delete assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    suspend fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse

    /**
     * A view of [AssistantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AssistantCreateParams = AssistantCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<AssistantCreateResponse> =
            create(AssistantCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AssistantListResponse> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse>
    }
}
