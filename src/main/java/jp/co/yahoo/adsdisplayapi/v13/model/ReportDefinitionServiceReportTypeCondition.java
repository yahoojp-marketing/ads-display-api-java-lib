/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v13.model.ReportDefinitionServiceConversionPathReportCondition;
import jp.co.yahoo.adsdisplayapi.v13.model.ReportDefinitionServiceCrossCampaignReachesReportCondition;
import jp.co.yahoo.adsdisplayapi.v13.model.ReportDefinitionServiceModelComparisonReportCondition;
import jp.co.yahoo.adsdisplayapi.v13.model.ReportDefinitionServiceReachReportCondition;
import jp.co.yahoo.adsdisplayapi.v13.model.ReportDefinitionServiceReportType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReportTypeConditionオブジェクトは、各レポートタイプごとのレポート作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReportTypeCondition describes the condition to create each report type.   This field is optional in ADD operation, and will be ignored in REMOVE operation.  &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceReportTypeCondition.JSON_PROPERTY_CONVERSION_PATH_REPORT_CONDITION,
  ReportDefinitionServiceReportTypeCondition.JSON_PROPERTY_CROSS_CAMPAIGN_REACHES_REPORT_CONDITION,
  ReportDefinitionServiceReportTypeCondition.JSON_PROPERTY_REACH_REPORT_CONDITION,
  ReportDefinitionServiceReportTypeCondition.JSON_PROPERTY_MODEL_COMPARISON_REPORT_CONDITION,
  ReportDefinitionServiceReportTypeCondition.JSON_PROPERTY_REPORT_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceReportTypeCondition {
  public static final String JSON_PROPERTY_CONVERSION_PATH_REPORT_CONDITION = "conversionPathReportCondition";
  private ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition;

  public static final String JSON_PROPERTY_CROSS_CAMPAIGN_REACHES_REPORT_CONDITION = "crossCampaignReachesReportCondition";
  private ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignReachesReportCondition;

  public static final String JSON_PROPERTY_REACH_REPORT_CONDITION = "reachReportCondition";
  private ReportDefinitionServiceReachReportCondition reachReportCondition;

  public static final String JSON_PROPERTY_MODEL_COMPARISON_REPORT_CONDITION = "modelComparisonReportCondition";
  private ReportDefinitionServiceModelComparisonReportCondition modelComparisonReportCondition;

  public static final String JSON_PROPERTY_REPORT_TYPE = "reportType";
  private ReportDefinitionServiceReportType reportType;

  public ReportDefinitionServiceReportTypeCondition() {
  }

  public ReportDefinitionServiceReportTypeCondition conversionPathReportCondition(ReportDefinitionServiceConversionPathReportCondition conversionPathReportCondition) {
    
    this.conversionPathReportCondition = conversionPathReportCondition;
    return this;
  }

   /**
   * Get conversionPathReportCondition
   * @return conversionPathReportCondition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceConversionPathReportCondition getConversionPathReportCondition() {
    return conversionPathReportCondition;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_REACHES_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceCrossCampaignReachesReportCondition getCrossCampaignReachesReportCondition() {
    return crossCampaignReachesReportCondition;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_REACHES_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACH_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReachReportCondition getReachReportCondition() {
    return reachReportCondition;
  }


  @JsonProperty(JSON_PROPERTY_REACH_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachReportCondition(ReportDefinitionServiceReachReportCondition reachReportCondition) {
    this.reachReportCondition = reachReportCondition;
  }


  public ReportDefinitionServiceReportTypeCondition modelComparisonReportCondition(ReportDefinitionServiceModelComparisonReportCondition modelComparisonReportCondition) {
    
    this.modelComparisonReportCondition = modelComparisonReportCondition;
    return this;
  }

   /**
   * Get modelComparisonReportCondition
   * @return modelComparisonReportCondition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_COMPARISON_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceModelComparisonReportCondition getModelComparisonReportCondition() {
    return modelComparisonReportCondition;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_COMPARISON_REPORT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelComparisonReportCondition(ReportDefinitionServiceModelComparisonReportCondition modelComparisonReportCondition) {
    this.modelComparisonReportCondition = modelComparisonReportCondition;
  }


  public ReportDefinitionServiceReportTypeCondition reportType(ReportDefinitionServiceReportType reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportType getReportType() {
    return reportType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportType(ReportDefinitionServiceReportType reportType) {
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
        Objects.equals(this.modelComparisonReportCondition, reportDefinitionServiceReportTypeCondition.modelComparisonReportCondition) &&
        Objects.equals(this.reportType, reportDefinitionServiceReportTypeCondition.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionPathReportCondition, crossCampaignReachesReportCondition, reachReportCondition, modelComparisonReportCondition, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportTypeCondition {\n");
    sb.append("    conversionPathReportCondition: ").append(toIndentedString(conversionPathReportCondition)).append("\n");
    sb.append("    crossCampaignReachesReportCondition: ").append(toIndentedString(crossCampaignReachesReportCondition)).append("\n");
    sb.append("    reachReportCondition: ").append(toIndentedString(reachReportCondition)).append("\n");
    sb.append("    modelComparisonReportCondition: ").append(toIndentedString(modelComparisonReportCondition)).append("\n");
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

