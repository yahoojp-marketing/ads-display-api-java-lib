package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポートをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download the report.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">レポートをダウンロードします。</div> <div lang=\"en\">Download the report.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceDownloadSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("reportJobId")
  private Long reportJobId;

  public ReportDefinitionServiceDownloadSelector accountId(Long accountId) {
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

  public ReportDefinitionServiceDownloadSelector reportJobId(Long reportJobId) {
    this.reportJobId = reportJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">レポートジョブIDです。</div> <div lang=\"en\">Report Job Id</div> 
   * @return reportJobId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">レポートジョブIDです。</div> <div lang=\"en\">Report Job Id</div> ")
  @NotNull


  public Long getReportJobId() {
    return reportJobId;
  }

  public void setReportJobId(Long reportJobId) {
    this.reportJobId = reportJobId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceDownloadSelector reportDefinitionServiceDownloadSelector = (ReportDefinitionServiceDownloadSelector) o;
    return Objects.equals(this.accountId, reportDefinitionServiceDownloadSelector.accountId) &&
        Objects.equals(this.reportJobId, reportDefinitionServiceDownloadSelector.reportJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, reportJobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    reportJobId: ").append(toIndentedString(reportJobId)).append("\n");
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

