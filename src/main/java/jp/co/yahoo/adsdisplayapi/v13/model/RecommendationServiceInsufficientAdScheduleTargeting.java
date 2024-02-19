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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.RecommendationServiceInsufficientAdScheduleTargetingCampaign;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceInsufficientAdScheduleTargetingオブジェクトは、配信可能時間が6時間未満の曜日があるキャンペーンに関する最適化提案の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceInsufficientAdScheduleTargeting object describes recommendation information about the campaign that have days of the week with less than six hours available for ad delivery.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceInsufficientAdScheduleTargetingオブジェクトは、配信可能時間が6時間未満の曜日があるキャンペーンに関する最適化提案の情報を表します。</div> <div lang=\"en\">RecommendationServiceInsufficientAdScheduleTargeting object describes recommendation information about the campaign that have days of the week with less than six hours available for ad delivery.</div> ")
@JsonPropertyOrder({
  RecommendationServiceInsufficientAdScheduleTargeting.JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING_CAMPAIGN_LIST
})
@JsonTypeName("RecommendationServiceInsufficientAdScheduleTargeting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceInsufficientAdScheduleTargeting {
  public static final String JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING_CAMPAIGN_LIST = "insufficientAdScheduleTargetingCampaignList";
  private List<RecommendationServiceInsufficientAdScheduleTargetingCampaign> insufficientAdScheduleTargetingCampaignList = null;

  public RecommendationServiceInsufficientAdScheduleTargeting() { 
  }

  public RecommendationServiceInsufficientAdScheduleTargeting insufficientAdScheduleTargetingCampaignList(List<RecommendationServiceInsufficientAdScheduleTargetingCampaign> insufficientAdScheduleTargetingCampaignList) {
    
    this.insufficientAdScheduleTargetingCampaignList = insufficientAdScheduleTargetingCampaignList;
    return this;
  }

  public RecommendationServiceInsufficientAdScheduleTargeting addInsufficientAdScheduleTargetingCampaignListItem(RecommendationServiceInsufficientAdScheduleTargetingCampaign insufficientAdScheduleTargetingCampaignListItem) {
    if (this.insufficientAdScheduleTargetingCampaignList == null) {
      this.insufficientAdScheduleTargetingCampaignList = new ArrayList<>();
    }
    this.insufficientAdScheduleTargetingCampaignList.add(insufficientAdScheduleTargetingCampaignListItem);
    return this;
  }

   /**
   * Get insufficientAdScheduleTargetingCampaignList
   * @return insufficientAdScheduleTargetingCampaignList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceInsufficientAdScheduleTargetingCampaign> getInsufficientAdScheduleTargetingCampaignList() {
    return insufficientAdScheduleTargetingCampaignList;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING_CAMPAIGN_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientAdScheduleTargetingCampaignList(List<RecommendationServiceInsufficientAdScheduleTargetingCampaign> insufficientAdScheduleTargetingCampaignList) {
    this.insufficientAdScheduleTargetingCampaignList = insufficientAdScheduleTargetingCampaignList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceInsufficientAdScheduleTargeting recommendationServiceInsufficientAdScheduleTargeting = (RecommendationServiceInsufficientAdScheduleTargeting) o;
    return Objects.equals(this.insufficientAdScheduleTargetingCampaignList, recommendationServiceInsufficientAdScheduleTargeting.insufficientAdScheduleTargetingCampaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insufficientAdScheduleTargetingCampaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceInsufficientAdScheduleTargeting {\n");
    sb.append("    insufficientAdScheduleTargetingCampaignList: ").append(toIndentedString(insufficientAdScheduleTargetingCampaignList)).append("\n");
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

