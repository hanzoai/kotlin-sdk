// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.active.ActiveListCallbacksParams
import com.hanzo_ai.api.models.active.ActiveListCallbacksResponse

interface ActiveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of llm level settings
     *
     * This is useful for debugging and ensuring the proxy server is configured correctly.
     *
     * Response schema:
     * ```
     * {
     *     "alerting": _alerting,
     *     "llm.callbacks": llm_callbacks,
     *     "llm.input_callback": llm_input_callbacks,
     *     "llm.failure_callback": llm_failure_callbacks,
     *     "llm.success_callback": llm_success_callbacks,
     *     "llm._async_success_callback": llm_async_success_callbacks,
     *     "llm._async_failure_callback": llm_async_failure_callbacks,
     *     "llm._async_input_callback": llm_async_input_callbacks,
     *     "all_llm_callbacks": all_llm_callbacks,
     *     "num_callbacks": len(all_llm_callbacks),
     *     "num_alerting": _num_alerting,
     *     "llm.request_timeout": llm.request_timeout,
     * }
     * ```
     */
    fun listCallbacks(
        params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActiveListCallbacksResponse

    /** @see [listCallbacks] */
    fun listCallbacks(requestOptions: RequestOptions): ActiveListCallbacksResponse =
        listCallbacks(ActiveListCallbacksParams.none(), requestOptions)

    /** A view of [ActiveService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /active/callbacks`, but is otherwise the same as
         * [ActiveService.listCallbacks].
         */
        @MustBeClosed
        fun listCallbacks(
            params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActiveListCallbacksResponse>

        /** @see [listCallbacks] */
        @MustBeClosed
        fun listCallbacks(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActiveListCallbacksResponse> =
            listCallbacks(ActiveListCallbacksParams.none(), requestOptions)
    }
}
