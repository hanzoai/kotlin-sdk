// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.guardrails.GuardrailListParams
import ai.hanzo.api.models.guardrails.GuardrailListResponse
import com.google.errorprone.annotations.MustBeClosed

interface GuardrailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * List the guardrails that are available on the proxy server
     *
     * 👉 [Guardrail docs](https://docs.hanzo.ai/docs/proxy/guardrails/quick_start)
     *
     * Example Request:
     * ```bash
     * curl -X GET "http://localhost:4000/guardrails/list" -H "Authorization: Bearer <your_api_key>"
     * ```
     *
     * Example Response:
     * ```json
     * {
     *   "guardrails": [
     *     {
     *       "guardrail_name": "bedrock-pre-guard",
     *       "guardrail_info": {
     *         "params": [
     *           {
     *             "name": "toxicity_score",
     *             "type": "float",
     *             "description": "Score between 0-1 indicating content toxicity level"
     *           },
     *           {
     *             "name": "pii_detection",
     *             "type": "boolean"
     *           }
     *         ]
     *       }
     *     }
     *   ]
     * }
     * ```
     */
    fun list(
        params: GuardrailListParams = GuardrailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GuardrailListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): GuardrailListResponse =
        list(GuardrailListParams.none(), requestOptions)

    /** A view of [GuardrailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /guardrails/list`, but is otherwise the same as
         * [GuardrailService.list].
         */
        @MustBeClosed
        fun list(
            params: GuardrailListParams = GuardrailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GuardrailListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GuardrailListResponse> =
            list(GuardrailListParams.none(), requestOptions)
    }
}
