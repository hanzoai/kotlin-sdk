// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.budget.BudgetCreateParams
import com.hanzo_ai.api.models.budget.BudgetCreateResponse
import com.hanzo_ai.api.models.budget.BudgetDeleteParams
import com.hanzo_ai.api.models.budget.BudgetDeleteResponse
import com.hanzo_ai.api.models.budget.BudgetInfoParams
import com.hanzo_ai.api.models.budget.BudgetInfoResponse
import com.hanzo_ai.api.models.budget.BudgetListParams
import com.hanzo_ai.api.models.budget.BudgetListResponse
import com.hanzo_ai.api.models.budget.BudgetSettingsParams
import com.hanzo_ai.api.models.budget.BudgetSettingsResponse
import com.hanzo_ai.api.models.budget.BudgetUpdateParams
import com.hanzo_ai.api.models.budget.BudgetUpdateResponse

interface BudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new budget object. Can apply this to teams, orgs, end-users, keys.
     *
     * Parameters:
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - budget_id: Optional[str] - The id of the budget. If not provided, a new id will be
     *   generated.
     * - max_budget: Optional[float] - The max budget for the budget.
     * - soft_budget: Optional[float] - The soft budget for the budget.
     * - max_parallel_requests: Optional[int] - The max number of parallel requests for the budget.
     * - tpm_limit: Optional[int] - The tokens per minute limit for the budget.
     * - rpm_limit: Optional[int] - The requests per minute limit for the budget.
     * - model_max_budget: Optional[dict] - Specify max budget for a given model. Example:
     *   {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d", "tpm_limit": 100000,
     *   "rpm_limit": 100000}}
     */
    suspend fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetCreateResponse

    /**
     * Update an existing budget object.
     *
     * Parameters:
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - budget_id: Optional[str] - The id of the budget. If not provided, a new id will be
     *   generated.
     * - max_budget: Optional[float] - The max budget for the budget.
     * - soft_budget: Optional[float] - The soft budget for the budget.
     * - max_parallel_requests: Optional[int] - The max number of parallel requests for the budget.
     * - tpm_limit: Optional[int] - The tokens per minute limit for the budget.
     * - rpm_limit: Optional[int] - The requests per minute limit for the budget.
     * - model_max_budget: Optional[dict] - Specify max budget for a given model. Example:
     *   {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d", "tpm_limit": 100000,
     *   "rpm_limit": 100000}}
     */
    suspend fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetUpdateResponse

    /** List all the created budgets in proxy db. Used on Admin UI. */
    suspend fun list(
        params: BudgetListParams = BudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BudgetListResponse =
        list(BudgetListParams.none(), requestOptions)

    /**
     * Delete budget
     *
     * Parameters:
     * - id: str - The budget id to delete
     */
    suspend fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetDeleteResponse

    /**
     * Get the budget id specific information
     *
     * Parameters:
     * - budgets: List[str] - The list of budget ids to get information for
     */
    suspend fun info(
        params: BudgetInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetInfoResponse

    /**
     * Get list of configurable params + current value for a budget item + description of each field
     *
     * Used on Admin UI.
     *
     * Query Parameters:
     * - budget_id: str - The budget id to get information for
     */
    suspend fun settings(
        params: BudgetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSettingsResponse

    /**
     * A view of [BudgetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /budget/new`, but is otherwise the same as
         * [BudgetServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetCreateResponse>

        /**
         * Returns a raw HTTP response for `post /budget/update`, but is otherwise the same as
         * [BudgetServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /budget/list`, but is otherwise the same as
         * [BudgetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BudgetListParams = BudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BudgetListResponse> =
            list(BudgetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /budget/delete`, but is otherwise the same as
         * [BudgetServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /budget/info`, but is otherwise the same as
         * [BudgetServiceAsync.info].
         */
        @MustBeClosed
        suspend fun info(
            params: BudgetInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetInfoResponse>

        /**
         * Returns a raw HTTP response for `get /budget/settings`, but is otherwise the same as
         * [BudgetServiceAsync.settings].
         */
        @MustBeClosed
        suspend fun settings(
            params: BudgetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSettingsResponse>
    }
}
