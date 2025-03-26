// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.threads

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.runs.RunCreateParams
import ai.hanzo.api.models.threads.runs.RunCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a run.
     *
     * API Reference: https://platform.openai.com/docs/api-reference/runs/createRun
     */
    suspend fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/runs`, but is otherwise the
         * same as [RunServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>
    }
}
