// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.global

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.global.spend.SpendListTagsParams
import com.hanzo_ai.api.models.global.spend.SpendListTagsResponse
import com.hanzo_ai.api.models.global.spend.SpendResetParams
import com.hanzo_ai.api.models.global.spend.SpendResetResponse
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportParams
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportResponse

interface SpendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * LLM Enterprise - View Spend Per Request Tag. Used by LLM UI
     *
     * Example Request:
     * ```
     * curl -X GET "http://0.0.0.0:4000/spend/tags" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Spend with Start Date and End Date
     *
     * ```
     * curl -X GET "http://0.0.0.0:4000/spend/tags?start_date=2022-01-01&end_date=2022-02-01" -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun listTags(
        params: SpendListTagsParams = SpendListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SpendListTagsResponse>

    /** @see [listTags] */
    fun listTags(requestOptions: RequestOptions): List<SpendListTagsResponse> =
        listTags(SpendListTagsParams.none(), requestOptions)

    /**
     * ADMIN ONLY / MASTER KEY Only Endpoint
     *
     * Globally reset spend for All API Keys and Teams, maintain LLM_SpendLogs
     * 1. LLM_SpendLogs will maintain the logs on spend, no data gets deleted from there
     * 2. LLM_VerificationTokens spend will be set = 0
     * 3. LLM_TeamTable spend will be set = 0
     */
    fun reset(
        params: SpendResetParams = SpendResetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpendResetResponse

    /** @see [reset] */
    fun reset(requestOptions: RequestOptions): SpendResetResponse =
        reset(SpendResetParams.none(), requestOptions)

    /**
     * Get Daily Spend per Team, based on specific startTime and endTime. Per team, view usage by
     * each key, model
     * [ { "group-by-day": "2024-05-10", "teams": [ { "team_name": "team-1" "spend": 10, "keys": [ "key": "1213", "usage": { "model-1": { "cost": 12.50, "input_tokens": 1000, "output_tokens": 5000, "requests": 100 }, "audio-modelname1": { "cost": 25.50, "seconds": 25, "requests": 50 }, } } ]
     * ] }
     */
    fun retrieveReport(
        params: SpendRetrieveReportParams = SpendRetrieveReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SpendRetrieveReportResponse>

    /** @see [retrieveReport] */
    fun retrieveReport(requestOptions: RequestOptions): List<SpendRetrieveReportResponse> =
        retrieveReport(SpendRetrieveReportParams.none(), requestOptions)

    /** A view of [SpendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /global/spend/tags`, but is otherwise the same as
         * [SpendService.listTags].
         */
        @MustBeClosed
        fun listTags(
            params: SpendListTagsParams = SpendListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SpendListTagsResponse>>

        /** @see [listTags] */
        @MustBeClosed
        fun listTags(requestOptions: RequestOptions): HttpResponseFor<List<SpendListTagsResponse>> =
            listTags(SpendListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /global/spend/reset`, but is otherwise the same as
         * [SpendService.reset].
         */
        @MustBeClosed
        fun reset(
            params: SpendResetParams = SpendResetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpendResetResponse>

        /** @see [reset] */
        @MustBeClosed
        fun reset(requestOptions: RequestOptions): HttpResponseFor<SpendResetResponse> =
            reset(SpendResetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global/spend/report`, but is otherwise the same as
         * [SpendService.retrieveReport].
         */
        @MustBeClosed
        fun retrieveReport(
            params: SpendRetrieveReportParams = SpendRetrieveReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SpendRetrieveReportResponse>>

        /** @see [retrieveReport] */
        @MustBeClosed
        fun retrieveReport(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<SpendRetrieveReportResponse>> =
            retrieveReport(SpendRetrieveReportParams.none(), requestOptions)
    }
}
