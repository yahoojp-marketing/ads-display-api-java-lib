/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.ReportDefinitionServiceCrossCampaignBuying;
import jp.co.yahoo.adsdisplayapi.v17.model.ReportDefinitionServiceCrossCampaignGoal;
import jp.co.yahoo.adsdisplayapi.v17.model.ReportDefinitionServiceCrossCampaignId;
import jp.co.yahoo.adsdisplayapi.v17.model.ReportDefinitionServiceCrossCampaignType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceCrossCampaignReachesReportConditionオブジェクトは、横断リーチレポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;の場合は必須です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには少なくとも2件の要素が必要です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには最大で3件の要素を指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceCrossCampaignReachesReportCondition describes the condition to create Cross-campaign Reach Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If reportType is &lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;, this field is required in ADD operation.   * At least two elements are required for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes.   * Up to 3 elements can be specified for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceCrossCampaignReachesReportCondition.JSON_PROPERTY_CROSS_CAMPAIGN_TYPE,
  ReportDefinitionServiceCrossCampaignReachesReportCondition.JSON_PROPERTY_CROSS_CAMPAIGN_IDS,
  ReportDefinitionServiceCrossCampaignReachesReportCondition.JSON_PROPERTY_CROSS_CAMPAIGN_GOALS,
  ReportDefinitionServiceCrossCampaignReachesReportCondition.JSON_PROPERTY_CROSS_CAMPAIGN_BUYING_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceCrossCampaignReachesReportCondition {
  public static final String JSON_PROPERTY_CROSS_CAMPAIGN_TYPE = "crossCampaignType";
  private ReportDefinitionServiceCrossCampaignType crossCampaignType;

  public static final String JSON_PROPERTY_CROSS_CAMPAIGN_IDS = "crossCampaignIds";
  private List<ReportDefinitionServiceCrossCampaignId> crossCampaignIds;

  public static final String JSON_PROPERTY_CROSS_CAMPAIGN_GOALS = "crossCampaignGoals";
  private List<ReportDefinitionServiceCrossCampaignGoal> crossCampaignGoals;

  public static final String JSON_PROPERTY_CROSS_CAMPAIGN_BUYING_TYPES = "crossCampaignBuyingTypes";
  private List<ReportDefinitionServiceCrossCampaignBuying> crossCampaignBuyingTypes;

  public ReportDefinitionServiceCrossCampaignReachesReportCondition() {
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignType(ReportDefinitionServiceCrossCampaignType crossCampaignType) {
    
    this.crossCampaignType = crossCampaignType;
    return this;
  }

   /**
   * Get crossCampaignType
   * @return crossCampaignType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceCrossCampaignType getCrossCampaignType() {
    return crossCampaignType;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossCampaignType(ReportDefinitionServiceCrossCampaignType crossCampaignType) {
    this.crossCampaignType = crossCampaignType;
  }


  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignIds(List<ReportDefinitionServiceCrossCampaignId> crossCampaignIds) {
    
    this.crossCampaignIds = crossCampaignIds;
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignIdsItem(ReportDefinitionServiceCrossCampaignId crossCampaignIdsItem) {
    if (this.crossCampaignIds == null) {
      this.crossCampaignIds = new ArrayList<>();
    }
    this.crossCampaignIds.add(crossCampaignIdsItem);
    return this;
  }

   /**
   * Get crossCampaignIds
   * @return crossCampaignIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceCrossCampaignId> getCrossCampaignIds() {
    return crossCampaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossCampaignIds(List<ReportDefinitionServiceCrossCampaignId> crossCampaignIds) {
    this.crossCampaignIds = crossCampaignIds;
  }


  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignGoals(List<ReportDefinitionServiceCrossCampaignGoal> crossCampaignGoals) {
    
    this.crossCampaignGoals = crossCampaignGoals;
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignGoalsItem(ReportDefinitionServiceCrossCampaignGoal crossCampaignGoalsItem) {
    if (this.crossCampaignGoals == null) {
      this.crossCampaignGoals = new ArrayList<>();
    }
    this.crossCampaignGoals.add(crossCampaignGoalsItem);
    return this;
  }

   /**
   * Get crossCampaignGoals
   * @return crossCampaignGoals
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceCrossCampaignGoal> getCrossCampaignGoals() {
    return crossCampaignGoals;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossCampaignGoals(List<ReportDefinitionServiceCrossCampaignGoal> crossCampaignGoals) {
    this.crossCampaignGoals = crossCampaignGoals;
  }


  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignBuyingTypes(List<ReportDefinitionServiceCrossCampaignBuying> crossCampaignBuyingTypes) {
    
    this.crossCampaignBuyingTypes = crossCampaignBuyingTypes;
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignBuyingTypesItem(ReportDefinitionServiceCrossCampaignBuying crossCampaignBuyingTypesItem) {
    if (this.crossCampaignBuyingTypes == null) {
      this.crossCampaignBuyingTypes = new ArrayList<>();
    }
    this.crossCampaignBuyingTypes.add(crossCampaignBuyingTypesItem);
    return this;
  }

   /**
   * Get crossCampaignBuyingTypes
   * @return crossCampaignBuyingTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_BUYING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceCrossCampaignBuying> getCrossCampaignBuyingTypes() {
    return crossCampaignBuyingTypes;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CAMPAIGN_BUYING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossCampaignBuyingTypes(List<ReportDefinitionServiceCrossCampaignBuying> crossCampaignBuyingTypes) {
    this.crossCampaignBuyingTypes = crossCampaignBuyingTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceCrossCampaignReachesReportCondition reportDefinitionServiceCrossCampaignReachesReportCondition = (ReportDefinitionServiceCrossCampaignReachesReportCondition) o;
    return Objects.equals(this.crossCampaignType, reportDefinitionServiceCrossCampaignReachesReportCondition.crossCampaignType) &&
        Objects.equals(this.crossCampaignIds, reportDefinitionServiceCrossCampaignReachesReportCondition.crossCampaignIds) &&
        Objects.equals(this.crossCampaignGoals, reportDefinitionServiceCrossCampaignReachesReportCondition.crossCampaignGoals) &&
        Objects.equals(this.crossCampaignBuyingTypes, reportDefinitionServiceCrossCampaignReachesReportCondition.crossCampaignBuyingTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossCampaignType, crossCampaignIds, crossCampaignGoals, crossCampaignBuyingTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceCrossCampaignReachesReportCondition {\n");
    sb.append("    crossCampaignType: ").append(toIndentedString(crossCampaignType)).append("\n");
    sb.append("    crossCampaignIds: ").append(toIndentedString(crossCampaignIds)).append("\n");
    sb.append("    crossCampaignGoals: ").append(toIndentedString(crossCampaignGoals)).append("\n");
    sb.append("    crossCampaignBuyingTypes: ").append(toIndentedString(crossCampaignBuyingTypes)).append("\n");
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

