// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkKnown
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class BlockUsers
private constructor(
    private val userIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("user_ids")
        @ExcludeMissing
        userIds: JsonField<List<String>> = JsonMissing.of()
    ) : this(userIds, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIds(): List<String> = userIds.getRequired("user_ids")

    /**
     * Returns the raw JSON value of [userIds].
     *
     * Unlike [userIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_ids") @ExcludeMissing fun _userIds(): JsonField<List<String>> = userIds

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

        /**
         * Returns a mutable builder for constructing an instance of [BlockUsers].
         *
         * The following fields are required:
         * ```kotlin
         * .userIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BlockUsers]. */
    class Builder internal constructor() {

        private var userIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(blockUsers: BlockUsers) = apply {
            userIds = blockUsers.userIds.map { it.toMutableList() }
            additionalProperties = blockUsers.additionalProperties.toMutableMap()
        }

        fun userIds(userIds: List<String>) = userIds(JsonField.of(userIds))

        /**
         * Sets [Builder.userIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userIds(userIds: JsonField<List<String>>) = apply {
            this.userIds = userIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [userIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserId(userId: String) = apply {
            userIds =
                (userIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("userIds", it).add(userId)
                }
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
         * Returns an immutable instance of [BlockUsers].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .userIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlockUsers =
            BlockUsers(
                checkRequired("userIds", userIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BlockUsers = apply {
        if (validated) {
            return@apply
        }

        userIds()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BlockUsers && userIds == other.userIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(userIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlockUsers{userIds=$userIds, additionalProperties=$additionalProperties}"
}
