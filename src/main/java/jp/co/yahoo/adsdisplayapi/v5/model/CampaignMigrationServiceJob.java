package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignMigrationServiceJobStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignMigrationServiceScope;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignMigrationServiceJobオブジェクトは、マイグレーションジョブの処理状況を示すオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignMigrationServiceJob object indicates processing status of migration job.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignMigrationServiceJobオブジェクトは、マイグレーションジョブの処理状況を示すオブジェクトです。</div> <div lang=\"en\">CampaignMigrationServiceJob object indicates processing status of migration job.</div> ")

public class CampaignMigrationServiceJob   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("failedCount")
  private JsonNullable<Long> failedCount = JsonNullable.undefined();

  @JsonProperty("inProgressCount")
  private JsonNullable<Long> inProgressCount = JsonNullable.undefined();

  @JsonProperty("jobStatus")
  private JsonNullable<CampaignMigrationServiceJobStatus> jobStatus = JsonNullable.undefined();

  @JsonProperty("migrationJobEndDate")
  private JsonNullable<String> migrationJobEndDate = JsonNullable.undefined();

  @JsonProperty("migrationJobId")
  private JsonNullable<Long> migrationJobId = JsonNullable.undefined();

  @JsonProperty("migrationJobSubmitDate")
  private JsonNullable<String> migrationJobSubmitDate = JsonNullable.undefined();

  @JsonProperty("scope")
  private JsonNullable<CampaignMigrationServiceScope> scope = JsonNullable.undefined();

  @JsonProperty("succeededCount")
  private JsonNullable<Long> succeededCount = JsonNullable.undefined();

  @JsonProperty("totalCount")
  private JsonNullable<Long> totalCount = JsonNullable.undefined();

  public CampaignMigrationServiceJob accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public CampaignMigrationServiceJob failedCount(Long failedCount) {
    this.failedCount = JsonNullable.of(failedCount);
    return this;
  }

  /**
   * <div lang=\"ja\">失敗キャンペーン数</div> <div lang=\"en\">Number of failed campaigns</div> 
   * @return failedCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">失敗キャンペーン数</div> <div lang=\"en\">Number of failed campaigns</div> ")


  public JsonNullable<Long> getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(JsonNullable<Long> failedCount) {
    this.failedCount = failedCount;
  }

  public CampaignMigrationServiceJob inProgressCount(Long inProgressCount) {
    this.inProgressCount = JsonNullable.of(inProgressCount);
    return this;
  }

  /**
   * <div lang=\"ja\">進行中キャンペーン数</div> <div lang=\"en\">Number of progressing campaigns</div> 
   * @return inProgressCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">進行中キャンペーン数</div> <div lang=\"en\">Number of progressing campaigns</div> ")


  public JsonNullable<Long> getInProgressCount() {
    return inProgressCount;
  }

  public void setInProgressCount(JsonNullable<Long> inProgressCount) {
    this.inProgressCount = inProgressCount;
  }

  public CampaignMigrationServiceJob jobStatus(CampaignMigrationServiceJobStatus jobStatus) {
    this.jobStatus = JsonNullable.of(jobStatus);
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignMigrationServiceJobStatus> getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JsonNullable<CampaignMigrationServiceJobStatus> jobStatus) {
    this.jobStatus = jobStatus;
  }

  public CampaignMigrationServiceJob migrationJobEndDate(String migrationJobEndDate) {
    this.migrationJobEndDate = JsonNullable.of(migrationJobEndDate);
    return this;
  }

  /**
   * <div lang=\"ja\">マイグレーションジョブ終了日時</div> <div lang=\"en\">Migration job end date</div> 
   * @return migrationJobEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">マイグレーションジョブ終了日時</div> <div lang=\"en\">Migration job end date</div> ")


  public JsonNullable<String> getMigrationJobEndDate() {
    return migrationJobEndDate;
  }

  public void setMigrationJobEndDate(JsonNullable<String> migrationJobEndDate) {
    this.migrationJobEndDate = migrationJobEndDate;
  }

  public CampaignMigrationServiceJob migrationJobId(Long migrationJobId) {
    this.migrationJobId = JsonNullable.of(migrationJobId);
    return this;
  }

  /**
   * <div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> 
   * @return migrationJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">マイグレーションジョブID</div> <div lang=\"en\">Migration job ID</div> ")


  public JsonNullable<Long> getMigrationJobId() {
    return migrationJobId;
  }

  public void setMigrationJobId(JsonNullable<Long> migrationJobId) {
    this.migrationJobId = migrationJobId;
  }

  public CampaignMigrationServiceJob migrationJobSubmitDate(String migrationJobSubmitDate) {
    this.migrationJobSubmitDate = JsonNullable.of(migrationJobSubmitDate);
    return this;
  }

  /**
   * <div lang=\"ja\">マイグレーションジョブ登録日時</div> <div lang=\"en\">Migration job submit date</div> 
   * @return migrationJobSubmitDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">マイグレーションジョブ登録日時</div> <div lang=\"en\">Migration job submit date</div> ")


  public JsonNullable<String> getMigrationJobSubmitDate() {
    return migrationJobSubmitDate;
  }

  public void setMigrationJobSubmitDate(JsonNullable<String> migrationJobSubmitDate) {
    this.migrationJobSubmitDate = migrationJobSubmitDate;
  }

  public CampaignMigrationServiceJob scope(CampaignMigrationServiceScope scope) {
    this.scope = JsonNullable.of(scope);
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignMigrationServiceScope> getScope() {
    return scope;
  }

  public void setScope(JsonNullable<CampaignMigrationServiceScope> scope) {
    this.scope = scope;
  }

  public CampaignMigrationServiceJob succeededCount(Long succeededCount) {
    this.succeededCount = JsonNullable.of(succeededCount);
    return this;
  }

  /**
   * <div lang=\"ja\">正常終了キャンペーン数</div> <div lang=\"en\">Number of completed campaigns</div> 
   * @return succeededCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">正常終了キャンペーン数</div> <div lang=\"en\">Number of completed campaigns</div> ")


  public JsonNullable<Long> getSucceededCount() {
    return succeededCount;
  }

  public void setSucceededCount(JsonNullable<Long> succeededCount) {
    this.succeededCount = succeededCount;
  }

  public CampaignMigrationServiceJob totalCount(Long totalCount) {
    this.totalCount = JsonNullable.of(totalCount);
    return this;
  }

  /**
   * <div lang=\"ja\">全キャンペーン数</div> <div lang=\"en\">Number of total campaigns</div> 
   * @return totalCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">全キャンペーン数</div> <div lang=\"en\">Number of total campaigns</div> ")


  public JsonNullable<Long> getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(JsonNullable<Long> totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMigrationServiceJob campaignMigrationServiceJob = (CampaignMigrationServiceJob) o;
    return Objects.equals(this.accountId, campaignMigrationServiceJob.accountId) &&
        Objects.equals(this.failedCount, campaignMigrationServiceJob.failedCount) &&
        Objects.equals(this.inProgressCount, campaignMigrationServiceJob.inProgressCount) &&
        Objects.equals(this.jobStatus, campaignMigrationServiceJob.jobStatus) &&
        Objects.equals(this.migrationJobEndDate, campaignMigrationServiceJob.migrationJobEndDate) &&
        Objects.equals(this.migrationJobId, campaignMigrationServiceJob.migrationJobId) &&
        Objects.equals(this.migrationJobSubmitDate, campaignMigrationServiceJob.migrationJobSubmitDate) &&
        Objects.equals(this.scope, campaignMigrationServiceJob.scope) &&
        Objects.equals(this.succeededCount, campaignMigrationServiceJob.succeededCount) &&
        Objects.equals(this.totalCount, campaignMigrationServiceJob.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, failedCount, inProgressCount, jobStatus, migrationJobEndDate, migrationJobId, migrationJobSubmitDate, scope, succeededCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMigrationServiceJob {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    inProgressCount: ").append(toIndentedString(inProgressCount)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    migrationJobEndDate: ").append(toIndentedString(migrationJobEndDate)).append("\n");
    sb.append("    migrationJobId: ").append(toIndentedString(migrationJobId)).append("\n");
    sb.append("    migrationJobSubmitDate: ").append(toIndentedString(migrationJobSubmitDate)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    succeededCount: ").append(toIndentedString(succeededCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

