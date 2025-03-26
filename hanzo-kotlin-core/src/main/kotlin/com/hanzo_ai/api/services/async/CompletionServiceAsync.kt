// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.completions.CompletionCreateParams
import com.hanzo_ai.api.models.completions.CompletionCreateResponse

interface CompletionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Follows the exact same API spec as `OpenAI's Completions API
     * https://platform.openai.com/docs/api-reference/completions`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/completions
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "gpt-3.5-turbo-instruct",
     *     "prompt": "Once upon a time",
     *     "max_tokens": 50,
     *     "temperature": 0.7
     * }'
     * ```
     */
    suspend fun create(
        params: CompletionCreateParams = CompletionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletionCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): CompletionCreateResponse =
        create(CompletionCreateParams.none(), requestOptions)

    /**
     * A view of [CompletionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /completions`, but is otherwise the same as
         * [CompletionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CompletionCreateParams = CompletionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompletionCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<CompletionCreateResponse> =
            create(CompletionCreateParams.none(), requestOptions)
    }
}
