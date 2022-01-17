package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceConversionPathReportCondition;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceCrossCampaignReachesReportCondition;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceReachReportCondition;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReportTypeConditionオブジェクトは、各レポートタイプごとのレポート作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReportTypeCondition describes the condition to create each report type.   This field is optional in ADD operation, and will be ignored in REMOVE operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceReportTypeConditionオブジェクトは、各レポートタイプごとのレポート作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceReportTypeCondition describes the condition to create each report type.   This field is optional in ADD operation, and will be ignored in REMOVE operation.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReportTypeCondition   {
  @JsonProperty("conversionPathReportCondition")
  private ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition = null;

  @JsonProperty("crossCampaignReachesReportCondition")
  private ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignReachesReportCondition = null;

  @JsonProperty("reachReportCondition")
  private ReportDefinitionServiceReachReportCondition reachReportCondition = null;

  @JsonProperty("reportType")
  private ReportDefinitionServiceType reportType = null;

  public ReportDefinitionServiceReportTypeCondition conversionPathReportCondition(ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition) {
    this.conversionPathReportCondition = conversionPathReportCondition;
    return this;
  }

  /**
   * Get conversionPathReportCondition
   * @return conversionPathReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceConversionPathReportCondition getConversionPathReportCondition() {
    return conversionPathReportCondition;
  }

  public void setConversionPathReportCondition(ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition) {
    this.conversionPathReportCondition = conversionPathReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition crossCampaignReachesReportCondition(ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignReachesReportCondition) {
    this.crossCampaignReachesReportCondition = crossCampaignReachesReportCondition;
    return this;
  }

  /**
   * Get crossCampaignReachesReportCondition
   * @return crossCampaignReachesReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceCrossCampaignReachesReportCondition getCrossCampaignReachesReportCondition() {
    return crossCampaignReachesReportCondition;
  }

  public void setCrossCampaignReachesReportCondition(ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignReachesReportCondition) {
    this.crossCampaignReachesReportCondition = crossCampaignReachesReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition reachReportCondition(ReportDefinitionServiceReachReportCondition reachReportCondition) {
    this.reachReportCondition = reachReportCondition;
    return this;
  }

  /**
   * Get reachReportCondition
   * @return reachReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReachReportCondition getReachReportCondition() {
    return reachReportCondition;
  }

  public void setReachReportCondition(ReportDefinitionServiceReachReportCondition reachReportCondition) {
    this.reachReportCondition = reachReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition reportType(ReportDefinitionServiceType reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceType getReportType() {
    return reportType;
  }

  public void setReportType(ReportDefinitionServiceType reportType) {
    this.reportType = reportType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReportTypeCondition reportDefinitionServiceReportTypeCondition = (ReportDefinitionServiceReportTypeCondition) o;
    return Objects.equals(this.conversionPathReportCondition, reportDefinitionServiceReportTypeCondition.conversionPathReportCondition) &&
        Objects.equals(this.crossCampaignReachesReportCondition, reportDefinitionServiceReportTypeCondition.crossCampaignReachesReportCondition) &&
        Objects.equals(this.reachReportCondition, reportDefinitionServiceReportTypeCondition.reachReportCondition) &&
        Objects.equals(this.reportType, reportDefinitionServiceReportTypeCondition.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionPathReportCondition, crossCampaignReachesReportCondition, reachReportCondition, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportTypeCondition {\n");
    
    sb.append("    conversionPathReportCondition: ").append(toIndentedString(conversionPathReportCondition)).append("\n");
    sb.append("    crossCampaignReachesReportCondition: ").append(toIndentedString(crossCampaignReachesReportCondition)).append("\n");
    sb.append("    reachReportCondition: ").append(toIndentedString(reachReportCondition)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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

