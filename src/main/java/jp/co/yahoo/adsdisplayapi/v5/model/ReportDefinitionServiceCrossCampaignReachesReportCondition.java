package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceCrossCampaignBuying;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceCrossCampaignGoal;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceCrossCampaignId;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceCrossCampaignType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceCrossCampaignReachesReportConditionオブジェクトは、横断リーチレポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;の場合は必須です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには少なくとも2件の要素が必要です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには最大で3件の要素を指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceCrossCampaignReachesReportCondition describes the condition to create Cross-campaign Reach Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If reportType is &lt;code&gt;CROSS_CAMPAIGN_REACHES&lt;/code&gt;, this field is required in ADD operation.   * At least two elements are required for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes.   * Up to 3 elements can be specified for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceCrossCampaignReachesReportConditionオブジェクトは、横断リーチレポートの作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、reportTypeが<code>CROSS_CAMPAIGN_REACHES</code>の場合は必須です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには少なくとも2件の要素が必要です。   ※crossCampaignIds、crossCampaignGoals、crossCampaignBuyingTypesには最大で3件の要素を指定できます。 </div> <div lang=\"en\">   ReportDefinitionServiceCrossCampaignReachesReportCondition describes the condition to create Cross-campaign Reach Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If reportType is <code>CROSS_CAMPAIGN_REACHES</code>, this field is required in ADD operation.   * At least two elements are required for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes.   * Up to 3 elements can be specified for crossCampaignIds, crossCampaignGoals, and crossCampaignBuyingTypes. </div> ")

public class ReportDefinitionServiceCrossCampaignReachesReportCondition   {
  @JsonProperty("crossCampaignType")
  private JsonNullable<ReportDefinitionServiceCrossCampaignType> crossCampaignType = JsonNullable.undefined();

  @JsonProperty("crossCampaignIds")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceCrossCampaignId>> crossCampaignIds = JsonNullable.undefined();

  @JsonProperty("crossCampaignGoals")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceCrossCampaignGoal>> crossCampaignGoals = JsonNullable.undefined();

  @JsonProperty("crossCampaignBuyingTypes")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceCrossCampaignBuying>> crossCampaignBuyingTypes = JsonNullable.undefined();

  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignType(ReportDefinitionServiceCrossCampaignType crossCampaignType) {
    this.crossCampaignType = JsonNullable.of(crossCampaignType);
    return this;
  }

  /**
   * Get crossCampaignType
   * @return crossCampaignType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceCrossCampaignType> getCrossCampaignType() {
    return crossCampaignType;
  }

  public void setCrossCampaignType(JsonNullable<ReportDefinitionServiceCrossCampaignType> crossCampaignType) {
    this.crossCampaignType = crossCampaignType;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignIds(List<ReportDefinitionServiceCrossCampaignId> crossCampaignIds) {
    this.crossCampaignIds = JsonNullable.of(crossCampaignIds);
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignIdsItem(ReportDefinitionServiceCrossCampaignId crossCampaignIdsItem) {
    if (this.crossCampaignIds == null || !this.crossCampaignIds.isPresent()) {
      this.crossCampaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.crossCampaignIds.get().add(crossCampaignIdsItem);
    return this;
  }

  /**
   * Get crossCampaignIds
   * @return crossCampaignIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceCrossCampaignId>> getCrossCampaignIds() {
    return crossCampaignIds;
  }

  public void setCrossCampaignIds(JsonNullable<List<ReportDefinitionServiceCrossCampaignId>> crossCampaignIds) {
    this.crossCampaignIds = crossCampaignIds;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignGoals(List<ReportDefinitionServiceCrossCampaignGoal> crossCampaignGoals) {
    this.crossCampaignGoals = JsonNullable.of(crossCampaignGoals);
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignGoalsItem(ReportDefinitionServiceCrossCampaignGoal crossCampaignGoalsItem) {
    if (this.crossCampaignGoals == null || !this.crossCampaignGoals.isPresent()) {
      this.crossCampaignGoals = JsonNullable.of(new ArrayList<>());
    }
    this.crossCampaignGoals.get().add(crossCampaignGoalsItem);
    return this;
  }

  /**
   * Get crossCampaignGoals
   * @return crossCampaignGoals
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceCrossCampaignGoal>> getCrossCampaignGoals() {
    return crossCampaignGoals;
  }

  public void setCrossCampaignGoals(JsonNullable<List<ReportDefinitionServiceCrossCampaignGoal>> crossCampaignGoals) {
    this.crossCampaignGoals = crossCampaignGoals;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition crossCampaignBuyingTypes(List<ReportDefinitionServiceCrossCampaignBuying> crossCampaignBuyingTypes) {
    this.crossCampaignBuyingTypes = JsonNullable.of(crossCampaignBuyingTypes);
    return this;
  }

  public ReportDefinitionServiceCrossCampaignReachesReportCondition addCrossCampaignBuyingTypesItem(ReportDefinitionServiceCrossCampaignBuying crossCampaignBuyingTypesItem) {
    if (this.crossCampaignBuyingTypes == null || !this.crossCampaignBuyingTypes.isPresent()) {
      this.crossCampaignBuyingTypes = JsonNullable.of(new ArrayList<>());
    }
    this.crossCampaignBuyingTypes.get().add(crossCampaignBuyingTypesItem);
    return this;
  }

  /**
   * Get crossCampaignBuyingTypes
   * @return crossCampaignBuyingTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceCrossCampaignBuying>> getCrossCampaignBuyingTypes() {
    return crossCampaignBuyingTypes;
  }

  public void setCrossCampaignBuyingTypes(JsonNullable<List<ReportDefinitionServiceCrossCampaignBuying>> crossCampaignBuyingTypes) {
    this.crossCampaignBuyingTypes = crossCampaignBuyingTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

