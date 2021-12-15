package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AuditLogServiceJobStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceSelector object is container storing the search conditions of get method (execution parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">AuditLogServiceSelector object is container storing the search conditions of get method (execution parameter).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("auditLogJobIds")
  @Valid
  private List<Long> auditLogJobIds = null;

  @JsonProperty("jobStatuses")
  @Valid
  private List<AuditLogServiceJobStatus> jobStatuses = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public AuditLogServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceSelector auditLogJobIds(List<Long> auditLogJobIds) {
    this.auditLogJobIds = auditLogJobIds;
    return this;
  }

  public AuditLogServiceSelector addAuditLogJobIdsItem(Long auditLogJobIdsItem) {
    if (this.auditLogJobIds == null) {
      this.auditLogJobIds = new ArrayList<>();
    }
    this.auditLogJobIds.add(auditLogJobIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">The job ID.</div> 
   * @return auditLogJobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">The job ID.</div> ")

@Size(max=500) 
  public List<Long> getAuditLogJobIds() {
    return auditLogJobIds;
  }

  public void setAuditLogJobIds(List<Long> auditLogJobIds) {
    this.auditLogJobIds = auditLogJobIds;
  }

  public AuditLogServiceSelector jobStatuses(List<AuditLogServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
    return this;
  }

  public AuditLogServiceSelector addJobStatusesItem(AuditLogServiceJobStatus jobStatusesItem) {
    if (this.jobStatuses == null) {
      this.jobStatuses = new ArrayList<>();
    }
    this.jobStatuses.add(jobStatusesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブステータスです。</div> <div lang=\"en\">The job status information.</div> 
   * @return jobStatuses
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブステータスです。</div> <div lang=\"en\">The job status information.</div> ")

  @Valid
@Size(max=3) 
  public List<AuditLogServiceJobStatus> getJobStatuses() {
    return jobStatuses;
  }

  public void setJobStatuses(List<AuditLogServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }

  public AuditLogServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AuditLogServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceSelector auditLogServiceSelector = (AuditLogServiceSelector) o;
    return Objects.equals(this.accountId, auditLogServiceSelector.accountId) &&
        Objects.equals(this.auditLogJobIds, auditLogServiceSelector.auditLogJobIds) &&
        Objects.equals(this.jobStatuses, auditLogServiceSelector.jobStatuses) &&
        Objects.equals(this.numberResults, auditLogServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, auditLogServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, auditLogJobIds, jobStatuses, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    auditLogJobIds: ").append(toIndentedString(auditLogJobIds)).append("\n");
    sb.append("    jobStatuses: ").append(toIndentedString(jobStatuses)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

