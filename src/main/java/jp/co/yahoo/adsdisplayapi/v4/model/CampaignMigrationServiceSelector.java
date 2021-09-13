package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignMigrationServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignMigrationServiceSelector object contains search condition of get method (execution parameters).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignMigrationServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">CampaignMigrationServiceSelector object contains search condition of get method (execution parameters).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignMigrationServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("migrationJobIds")
  @Valid
  private List<Long> migrationJobIds = null;

  public CampaignMigrationServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignMigrationServiceSelector migrationJobIds(List<Long> migrationJobIds) {
    this.migrationJobIds = migrationJobIds;
    return this;
  }

  public CampaignMigrationServiceSelector addMigrationJobIdsItem(Long migrationJobIdsItem) {
    if (this.migrationJobIds == null) {
      this.migrationJobIds = new ArrayList<>();
    }
    this.migrationJobIds.add(migrationJobIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> 
   * @return migrationJobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> ")

@Size(max=500) 
  public List<Long> getMigrationJobIds() {
    return migrationJobIds;
  }

  public void setMigrationJobIds(List<Long> migrationJobIds) {
    this.migrationJobIds = migrationJobIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMigrationServiceSelector campaignMigrationServiceSelector = (CampaignMigrationServiceSelector) o;
    return Objects.equals(this.accountId, campaignMigrationServiceSelector.accountId) &&
        Objects.equals(this.migrationJobIds, campaignMigrationServiceSelector.migrationJobIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, migrationJobIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    migrationJobIds: ").append(toIndentedString(migrationJobIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

