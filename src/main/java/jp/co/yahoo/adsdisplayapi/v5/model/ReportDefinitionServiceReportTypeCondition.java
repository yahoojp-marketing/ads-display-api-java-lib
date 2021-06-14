package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceConversionPathReportCondition;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceCrossCampaignReachesReportCondition;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceFrequencyReportCondition;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReachReportCondition;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReportTypeConditionオブジェクトは、各レポートタイプごとのレポート作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReportTypeCondition describes the condition to create each report type.   This field is optional in ADD operation, and will be ignored in REMOVE operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceReportTypeConditionオブジェクトは、各レポートタイプごとのレポート作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceReportTypeCondition describes the condition to create each report type.   This field is optional in ADD operation, and will be ignored in REMOVE operation.  </div> ")

public class ReportDefinitionServiceReportTypeCondition   {
  @JsonProperty("conversionPathReportCondition")
  private JsonNullable<ReportDefinitionServiceConversionPathReportCondition> conversionPathReportCondition = JsonNullable.undefined();

  @JsonProperty("crossCampaignReachesReportCondition")
  private JsonNullable<ReportDefinitionServiceCrossCampaignReachesReportCondition> crossCampaignReachesReportCondition = JsonNullable.undefined();

  @JsonProperty("frequencyReportCondition")
  private JsonNullable<ReportDefinitionServiceFrequencyReportCondition> frequencyReportCondition = JsonNullable.undefined();

  @JsonProperty("reachReportCondition")
  private JsonNullable<ReportDefinitionServiceReachReportCondition> reachReportCondition = JsonNullable.undefined();

  @JsonProperty("reportType")
  private JsonNullable<ReportDefinitionServiceType> reportType = JsonNullable.undefined();

  public ReportDefinitionServiceReportTypeCondition conversionPathReportCondition(ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition) {
    this.conversionPathReportCondition = JsonNullable.of(conversionPathReportCondition);
    return this;
  }

  /**
   * Get conversionPathReportCondition
   * @return conversionPathReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceConversionPathReportCondition> getConversionPathReportCondition() {
    return conversionPathReportCondition;
  }

  public void setConversionPathReportCondition(JsonNullable<ReportDefinitionServiceConversionPathReportCondition> conversionPathReportCondition) {
    this.conversionPathReportCondition = conversionPathReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition crossCampaignReachesReportCondition(ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignReachesReportCondition) {
    this.crossCampaignReachesReportCondition = JsonNullable.of(crossCampaignReachesReportCondition);
    return this;
  }

  /**
   * Get crossCampaignReachesReportCondition
   * @return crossCampaignReachesReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceCrossCampaignReachesReportCondition> getCrossCampaignReachesReportCondition() {
    return crossCampaignReachesReportCondition;
  }

  public void setCrossCampaignReachesReportCondition(JsonNullable<ReportDefinitionServiceCrossCampaignReachesReportCondition> crossCampaignReachesReportCondition) {
    this.crossCampaignReachesReportCondition = crossCampaignReachesReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition frequencyReportCondition(ReportDefinitionServiceFrequencyReportCondition frequencyReportCondition) {
    this.frequencyReportCondition = JsonNullable.of(frequencyReportCondition);
    return this;
  }

  /**
   * Get frequencyReportCondition
   * @return frequencyReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceFrequencyReportCondition> getFrequencyReportCondition() {
    return frequencyReportCondition;
  }

  public void setFrequencyReportCondition(JsonNullable<ReportDefinitionServiceFrequencyReportCondition> frequencyReportCondition) {
    this.frequencyReportCondition = frequencyReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition reachReportCondition(ReportDefinitionServiceReachReportCondition reachReportCondition) {
    this.reachReportCondition = JsonNullable.of(reachReportCondition);
    return this;
  }

  /**
   * Get reachReportCondition
   * @return reachReportCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReachReportCondition> getReachReportCondition() {
    return reachReportCondition;
  }

  public void setReachReportCondition(JsonNullable<ReportDefinitionServiceReachReportCondition> reachReportCondition) {
    this.reachReportCondition = reachReportCondition;
  }

  public ReportDefinitionServiceReportTypeCondition reportType(ReportDefinitionServiceType reportType) {
    this.reportType = JsonNullable.of(reportType);
    return this;
  }

  /**
   * Get reportType
   * @return reportType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceType> getReportType() {
    return reportType;
  }

  public void setReportType(JsonNullable<ReportDefinitionServiceType> reportType) {
    this.reportType = reportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReportTypeCondition reportDefinitionServiceReportTypeCondition = (ReportDefinitionServiceReportTypeCondition) o;
    return Objects.equals(this.conversionPathReportCondition, reportDefinitionServiceReportTypeCondition.conversionPathReportCondition) &&
        Objects.equals(this.crossCampaignReachesReportCondition, reportDefinitionServiceReportTypeCondition.crossCampaignReachesReportCondition) &&
        Objects.equals(this.frequencyReportCondition, reportDefinitionServiceReportTypeCondition.frequencyReportCondition) &&
        Objects.equals(this.reachReportCondition, reportDefinitionServiceReportTypeCondition.reachReportCondition) &&
        Objects.equals(this.reportType, reportDefinitionServiceReportTypeCondition.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionPathReportCondition, crossCampaignReachesReportCondition, frequencyReportCondition, reachReportCondition, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportTypeCondition {\n");
    
    sb.append("    conversionPathReportCondition: ").append(toIndentedString(conversionPathReportCondition)).append("\n");
    sb.append("    crossCampaignReachesReportCondition: ").append(toIndentedString(crossCampaignReachesReportCondition)).append("\n");
    sb.append("    frequencyReportCondition: ").append(toIndentedString(frequencyReportCondition)).append("\n");
    sb.append("    reachReportCondition: ").append(toIndentedString(reachReportCondition)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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

