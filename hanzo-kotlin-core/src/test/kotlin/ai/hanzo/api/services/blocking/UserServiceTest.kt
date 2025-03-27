// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.user.UserCreateParams
import ai.hanzo.api.models.user.UserDeleteParams
import ai.hanzo.api.models.user.UserListParams
import ai.hanzo.api.models.user.UserRetrieveInfoParams
import ai.hanzo.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.create(
                UserCreateParams.builder()
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .autoCreateKey(true)
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .sendInviteEmail(true)
                    .spend(0.0)
                    .teamId("team_id")
                    .addTeam(JsonValue.from(mapOf<String, Any>()))
                    .tpmLimit(0L)
                    .userAlias("user_alias")
                    .userEmail("user_email")
                    .userId("user_id")
                    .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
                    .build()
            )

        user.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.update(
                UserUpdateParams.builder()
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .password("password")
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .spend(0.0)
                    .teamId("team_id")
                    .tpmLimit(0L)
                    .userEmail("user_email")
                    .userId("user_id")
                    .userRole(UserUpdateParams.UserRole.PROXY_ADMIN)
                    .build()
            )

        user.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.list(
                UserListParams.builder()
                    .page(1L)
                    .pageSize(1L)
                    .role("role")
                    .userIds("user_ids")
                    .build()
            )

        user.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val user =
            userService.delete(
                UserDeleteParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addUserId("string")
                    .build()
            )

        user.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        val response =
            userService.retrieveInfo(UserRetrieveInfoParams.builder().userId("user_id").build())

        response.validate()
    }
}
