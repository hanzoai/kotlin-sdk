// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.budget

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class BudgetNew
private constructor(
    private val budgetDuration: JsonField<String>,
    private val budgetId: JsonField<String>,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val modelMaxBudget: JsonField<ModelMaxBudget>,
    private val rpmLimit: JsonField<Long>,
    private val softBudget: JsonField<Double>,
    private val tpmLimit: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_id") @ExcludeMissing budgetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("soft_budget")
        @ExcludeMissing
        softBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
    ) : this(
        budgetDuration,
        budgetId,
        maxBudget,
        maxParallelRequests,
        modelMaxBudget,
        rpmLimit,
        softBudget,
        tpmLimit,
        mutableMapOf(),
    )

    /**
     * Max duration budget should be set for (e.g. '1hr', '1d', '28d')
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

    /**
     * The unique budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): String? = budgetId.getNullable("budget_id")

    /**
     * Requests will fail if this budget (in USD) is exceeded.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

    /**
     * Max concurrent requests allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Long? = maxParallelRequests.getNullable("max_parallel_requests")

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelMaxBudget(): ModelMaxBudget? = modelMaxBudget.getNullable("model_max_budget")

    /**
     * Max requests per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

    /**
     * Requests will NOT fail if this is exceeded. Will fire alerting though.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softBudget(): Double? = softBudget.getNullable("soft_budget")

    /**
     * Max tokens per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_duration")
    @ExcludeMissing
    fun _budgetDuration(): JsonField<String> = budgetDuration

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_parallel_requests")
    @ExcludeMissing
    fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

    /**
     * Returns the raw JSON value of [modelMaxBudget].
     *
     * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_max_budget")
    @ExcludeMissing
    fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

    /**
     * Returns the raw JSON value of [softBudget].
     *
     * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("soft_budget") @ExcludeMissing fun _softBudget(): JsonField<Double> = softBudget

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [BudgetNew]. */
        fun builder() = Builder()
    }

    /** A builder for [BudgetNew]. */
    class Builder internal constructor() {

        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetId: JsonField<String> = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var softBudget: JsonField<Double> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(budgetNew: BudgetNew) = apply {
            budgetDuration = budgetNew.budgetDuration
            budgetId = budgetNew.budgetId
            maxBudget = budgetNew.maxBudget
            maxParallelRequests = budgetNew.maxParallelRequests
            modelMaxBudget = budgetNew.modelMaxBudget
            rpmLimit = budgetNew.rpmLimit
            softBudget = budgetNew.softBudget
            tpmLimit = budgetNew.tpmLimit
            additionalProperties = budgetNew.additionalProperties.toMutableMap()
        }

        /** Max duration budget should be set for (e.g. '1hr', '1d', '28d') */
        fun budgetDuration(budgetDuration: String?) =
            budgetDuration(JsonField.ofNullable(budgetDuration))

        /**
         * Sets [Builder.budgetDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetDuration] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<String>) = apply {
            this.budgetDuration = budgetDuration
        }

        /** The unique budget id. */
        fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

        /** Requests will fail if this budget (in USD) is exceeded. */
        fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

        /**
         * Alias for [Builder.maxBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

        /**
         * Sets [Builder.maxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

        /** Max concurrent requests allowed for this budget id. */
        fun maxParallelRequests(maxParallelRequests: Long?) =
            maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

        /**
         * Alias for [Builder.maxParallelRequests].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxParallelRequests(maxParallelRequests: Long) =
            maxParallelRequests(maxParallelRequests as Long?)

        /**
         * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
            this.maxParallelRequests = maxParallelRequests
        }

        /**
         * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
         * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
         */
        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) =
            modelMaxBudget(JsonField.ofNullable(modelMaxBudget))

        /**
         * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
            this.modelMaxBudget = modelMaxBudget
        }

        /** Max requests per minute, allowed for this budget id. */
        fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

        /**
         * Alias for [Builder.rpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

        /**
         * Sets [Builder.rpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

        /** Requests will NOT fail if this is exceeded. Will fire alerting though. */
        fun softBudget(softBudget: Double?) = softBudget(JsonField.ofNullable(softBudget))

        /**
         * Alias for [Builder.softBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

        /**
         * Sets [Builder.softBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun softBudget(softBudget: JsonField<Double>) = apply { this.softBudget = softBudget }

        /** Max tokens per minute, allowed for this budget id. */
        fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

        /**
         * Alias for [Builder.tpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

        /**
         * Sets [Builder.tpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [BudgetNew].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BudgetNew =
            BudgetNew(
                budgetDuration,
                budgetId,
                maxBudget,
                maxParallelRequests,
                modelMaxBudget,
                rpmLimit,
                softBudget,
                tpmLimit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BudgetNew = apply {
        if (validated) {
            return@apply
        }

        budgetDuration()
        budgetId()
        maxBudget()
        maxParallelRequests()
        modelMaxBudget()?.validate()
        rpmLimit()
        softBudget()
        tpmLimit()
        validated = true
    }

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     */
    class ModelMaxBudget
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelMaxBudget]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelMaxBudget]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ModelMaxBudget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelMaxBudget = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelMaxBudget && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelMaxBudget{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BudgetNew && budgetDuration == other.budgetDuration && budgetId == other.budgetId && maxBudget == other.maxBudget && maxParallelRequests == other.maxParallelRequests && modelMaxBudget == other.modelMaxBudget && rpmLimit == other.rpmLimit && softBudget == other.softBudget && tpmLimit == other.tpmLimit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(budgetDuration, budgetId, maxBudget, maxParallelRequests, modelMaxBudget, rpmLimit, softBudget, tpmLimit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BudgetNew{budgetDuration=$budgetDuration, budgetId=$budgetId, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
}
