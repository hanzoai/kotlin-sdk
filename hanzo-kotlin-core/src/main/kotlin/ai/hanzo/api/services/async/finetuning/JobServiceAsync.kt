// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobCreateResponse
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobListResponse
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveResponse
import ai.hanzo.api.services.async.finetuning.jobs.CancelServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cancel(): CancelServiceAsync

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given
     * dataset. This is the equivalent of POST https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/fine-tuning/create
     *
     * Example Curl:
     * ```
     * curl http://localhost:4000/v1/fine_tuning/jobs       -H "Content-Type: application/json"       -H "Authorization: Bearer sk-1234"       -d '{
     *     "model": "gpt-3.5-turbo",
     *     "training_file": "file-abc123",
     *     "hyperparameters": {
     *       "n_epochs": 4
     *     }
     *   }'
     * ```
     */
    suspend fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobCreateResponse

    /**
     * Retrieves a fine-tuning job. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to retrieve.
     */
    suspend fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse

    /**
     * Lists fine-tuning jobs for the organization. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `after`: Identifier for the last job from the previous pagination request.
     * - `limit`: Number of fine-tuning jobs to retrieve (default is 20).
     */
    suspend fun list(
        params: JobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListResponse

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cancel(): CancelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs/{fine_tuning_job_id}`, but is
         * otherwise the same as [JobServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: JobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListResponse>
    }
}
