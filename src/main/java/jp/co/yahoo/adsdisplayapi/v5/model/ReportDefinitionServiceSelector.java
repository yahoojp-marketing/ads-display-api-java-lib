package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportJobStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceSelectorオブジェクトは、操作の対象とするレポートを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceSelector object serves the report definition for the target of operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceSelectorオブジェクトは、操作の対象とするレポートを表します。</div> <div lang=\"en\">ReportDefinitionServiceSelector object serves the report definition for the target of operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("reportJobIds")
  @Valid
  private List<Long> reportJobIds = null;

  @JsonProperty("reportJobStatuses")
  @Valid
  private List<ReportDefinitionServiceReportJobStatus> reportJobStatuses = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public ReportDefinitionServiceSelector accountId(Long accountId) {
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

  public ReportDefinitionServiceSelector numberResults(Integer numberResults) {
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
   * <div lang=\"ja\">レポートIDです。</div> <div lang=\"en\">Report ID.</div> 
   * @return reportJobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レポートIDです。</div> <div lang=\"en\">Report ID.</div> ")

@Size(max=500) 
  public List<Long> getReportJobIds() {
    return reportJobIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<ReportDefinitionServiceReportJobStatus> getReportJobStatuses() {
    return reportJobStatuses;
  }

  public void setReportJobStatuses(List<ReportDefinitionServiceReportJobStatus> reportJobStatuses) {
    this.reportJobStatuses = reportJobStatuses;
  }

  public ReportDefinitionServiceSelector startIndex(Integer startIndex) {
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

