/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

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
import jp.co.yahoo.adsdisplayapi.v8.model.ReportDefinitionServiceReportJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceSelectorオブジェクトは、操作の対象とするレポートを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceSelector object serves the report definition for the target of operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceSelectorオブジェクトは、操作の対象とするレポートを表します。</div> <div lang=\"en\">ReportDefinitionServiceSelector object serves the report definition for the target of operation.</div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  ReportDefinitionServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  ReportDefinitionServiceSelector.JSON_PROPERTY_REPORT_JOB_IDS,
  ReportDefinitionServiceSelector.JSON_PROPERTY_REPORT_JOB_STATUSES,
  ReportDefinitionServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("ReportDefinitionServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 200;

  public static final String JSON_PROPERTY_REPORT_JOB_IDS = "reportJobIds";
  private List<Long> reportJobIds = null;

  public static final String JSON_PROPERTY_REPORT_JOB_STATUSES = "reportJobStatuses";
  private List<ReportDefinitionServiceReportJobStatus> reportJobStatuses = null;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public ReportDefinitionServiceSelector() { 
  }

  public ReportDefinitionServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
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


  public ReportDefinitionServiceSelector numberResults(Integer numberResults) {
    
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


  public ReportDefinitionServiceSelector reportJobIds(List<Long> reportJobIds) {
    
    this.reportJobIds = reportJobIds;
    return this;
  }

  public ReportDefinitionServiceSelector addReportJobIdsItem(Long reportJobIdsItem) {
    if (this.reportJobIds == null) {
      this.reportJobIds = new ArrayList<>();
    }
    this.reportJobIds.add(reportJobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポートIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Report ID.&lt;/div&gt; 
   * @return reportJobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レポートIDです。</div> <div lang=\"en\">Report ID.</div> ")
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getReportJobIds() {
    return reportJobIds;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportJobIds(List<Long> reportJobIds) {
    this.reportJobIds = reportJobIds;
  }


  public ReportDefinitionServiceSelector reportJobStatuses(List<ReportDefinitionServiceReportJobStatus> reportJobStatuses) {
    
    this.reportJobStatuses = reportJobStatuses;
    return this;
  }

  public ReportDefinitionServiceSelector addReportJobStatusesItem(ReportDefinitionServiceReportJobStatus reportJobStatusesItem) {
    if (this.reportJobStatuses == null) {
      this.reportJobStatuses = new ArrayList<>();
    }
    this.reportJobStatuses.add(reportJobStatusesItem);
    return this;
  }

   /**
   * Get reportJobStatuses
   * @return reportJobStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceReportJobStatus> getReportJobStatuses() {
    return reportJobStatuses;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportJobStatuses(List<ReportDefinitionServiceReportJobStatus> reportJobStatuses) {
    this.reportJobStatuses = reportJobStatuses;
  }


  public ReportDefinitionServiceSelector startIndex(Integer startIndex) {
    
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
    ReportDefinitionServiceSelector reportDefinitionServiceSelector = (ReportDefinitionServiceSelector) o;
    return Objects.equals(this.accountId, reportDefinitionServiceSelector.accountId) &&
        Objects.equals(this.numberResults, reportDefinitionServiceSelector.numberResults) &&
        Objects.equals(this.reportJobIds, reportDefinitionServiceSelector.reportJobIds) &&
        Objects.equals(this.reportJobStatuses, reportDefinitionServiceSelector.reportJobStatuses) &&
        Objects.equals(this.startIndex, reportDefinitionServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, reportJobIds, reportJobStatuses, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    reportJobIds: ").append(toIndentedString(reportJobIds)).append("\n");
    sb.append("    reportJobStatuses: ").append(toIndentedString(reportJobStatuses)).append("\n");
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

