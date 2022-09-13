/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.AuditLogServiceJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceSelector object is container storing the search conditions of get method (execution parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">getメソッドの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">AuditLogServiceSelector object is container storing the search conditions of get method (execution parameter).</div> ")
@JsonPropertyOrder({
  AuditLogServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AuditLogServiceSelector.JSON_PROPERTY_AUDIT_LOG_JOB_IDS,
  AuditLogServiceSelector.JSON_PROPERTY_JOB_STATUSES,
  AuditLogServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AuditLogServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("AuditLogServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AUDIT_LOG_JOB_IDS = "auditLogJobIds";
  private List<Long> auditLogJobIds = null;

  public static final String JSON_PROPERTY_JOB_STATUSES = "jobStatuses";
  private List<AuditLogServiceJobStatus> jobStatuses = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AuditLogServiceSelector() { 
  }

  public AuditLogServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The job ID.&lt;/div&gt; 
   * @return auditLogJobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">The job ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIT_LOG_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAuditLogJobIds() {
    return auditLogJobIds;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_LOG_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブステータスです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The job status information.&lt;/div&gt; 
   * @return jobStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブステータスです。</div> <div lang=\"en\">The job status information.</div> ")
  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuditLogServiceJobStatus> getJobStatuses() {
    return jobStatuses;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobStatuses(List<AuditLogServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }


  public AuditLogServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public AuditLogServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

