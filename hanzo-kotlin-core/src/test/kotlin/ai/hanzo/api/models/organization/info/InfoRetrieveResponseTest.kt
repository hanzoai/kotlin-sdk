// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization.info

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.Member
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .budgetId("budget_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .addModel("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .llmBudgetTable(
                    InfoRetrieveResponse.LlmBudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .addMember(
                    InfoRetrieveResponse.Member.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organization_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .budgetId("budget_id")
                        .llmBudgetTable(
                            InfoRetrieveResponse.Member.LlmBudgetTable.builder()
                                .budgetDuration("budget_duration")
                                .maxBudget(0.0)
                                .maxParallelRequests(0L)
                                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                                .rpmLimit(0L)
                                .softBudget(0.0)
                                .tpmLimit(0L)
                                .build()
                        )
                        .spend(0.0)
                        .user(JsonValue.from(mapOf<String, Any>()))
                        .userRole("user_role")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .organizationAlias("organization_alias")
                .organizationId("organization_id")
                .spend(0.0)
                .addTeam(
                    InfoRetrieveResponse.Team.builder()
                        .teamId("team_id")
                        .addAdmin(JsonValue.from(mapOf<String, Any>()))
                        .blocked(true)
                        .budgetDuration("budget_duration")
                        .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .llmModelTable(
                            InfoRetrieveResponse.Team.LlmModelTable.builder()
                                .createdBy("created_by")
                                .updatedBy("updated_by")
                                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .addMember(JsonValue.from(mapOf<String, Any>()))
                        .addMembersWithRole(
                            Member.builder()
                                .role(Member.Role.ADMIN)
                                .userEmail("user_email")
                                .userId("user_id")
                                .build()
                        )
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modelId(0L)
                        .addModel(JsonValue.from(mapOf<String, Any>()))
                        .organizationId("organization_id")
                        .rpmLimit(0L)
                        .spend(0.0)
                        .teamAlias("team_alias")
                        .tpmLimit(0L)
                        .build()
                )
                .build()

        assertThat(infoRetrieveResponse.budgetId()).isEqualTo("budget_id")
        assertThat(infoRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(infoRetrieveResponse.createdBy()).isEqualTo("created_by")
        assertThat(infoRetrieveResponse.models()).containsExactly("string")
        assertThat(infoRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(infoRetrieveResponse.updatedBy()).isEqualTo("updated_by")
        assertThat(infoRetrieveResponse.llmBudgetTable())
            .isEqualTo(
                InfoRetrieveResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(infoRetrieveResponse.members())
            .containsExactly(
                InfoRetrieveResponse.Member.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organization_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .budgetId("budget_id")
                    .llmBudgetTable(
                        InfoRetrieveResponse.Member.LlmBudgetTable.builder()
                            .budgetDuration("budget_duration")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                            .rpmLimit(0L)
                            .softBudget(0.0)
                            .tpmLimit(0L)
                            .build()
                    )
                    .spend(0.0)
                    .user(JsonValue.from(mapOf<String, Any>()))
                    .userRole("user_role")
                    .build()
            )
        assertThat(infoRetrieveResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(infoRetrieveResponse.organizationAlias()).isEqualTo("organization_alias")
        assertThat(infoRetrieveResponse.organizationId()).isEqualTo("organization_id")
        assertThat(infoRetrieveResponse.spend()).isEqualTo(0.0)
        assertThat(infoRetrieveResponse.teams())
            .containsExactly(
                InfoRetrieveResponse.Team.builder()
                    .teamId("team_id")
                    .addAdmin(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .llmModelTable(
                        InfoRetrieveResponse.Team.LlmModelTable.builder()
                            .createdBy("created_by")
                            .updatedBy("updated_by")
                            .modelAliases(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .addMember(JsonValue.from(mapOf<String, Any>()))
                    .addMembersWithRole(
                        Member.builder()
                            .role(Member.Role.ADMIN)
                            .userEmail("user_email")
                            .userId("user_id")
                            .build()
                    )
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelId(0L)
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .organizationId("organization_id")
                    .rpmLimit(0L)
                    .spend(0.0)
                    .teamAlias("team_alias")
                    .tpmLimit(0L)
                    .build()
            )
    }
}
