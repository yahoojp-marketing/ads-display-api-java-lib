/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceDailyBudgetOverCampaignオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceDailyBudgetOverCampaign object describes detailed information of recommendation about campaigns that reached the daily budget.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceDailyBudgetOverCampaignオブジェクトは、1日の予算上限に達したキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceDailyBudgetOverCampaign object describes detailed information of recommendation about campaigns that reached the daily budget.</div> ")
@JsonPropertyOrder({
  RecommendationServiceDailyBudgetOverCampaign.JSON_PROPERTY_RECOMMENDATION_ID,
  RecommendationServiceDailyBudgetOverCampaign.JSON_PROPERTY_CAMPAIGN_ID,
  RecommendationServiceDailyBudgetOverCampaign.JSON_PROPERTY_CAMPAIGN_NAME,
  RecommendationServiceDailyBudgetOverCampaign.JSON_PROPERTY_CURRENT_BUDGET
})
@JsonTypeName("RecommendationServiceDailyBudgetOverCampaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceDailyBudgetOverCampaign {
  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private Long recommendationId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CURRENT_BUDGET = "currentBudget";
  private Long currentBudget;

  public RecommendationServiceDailyBudgetOverCampaign() { 
  }

  public RecommendationServiceDailyBudgetOverCampaign recommendationId(Long recommendationId) {
    
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化提案IDです。&lt;br&gt; optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommendation ID.&lt;br&gt; When optimizationScoreLift isn&#39;t null, the system will assign a common recommendation ID to the suggestion for the campaign. &lt;/div&gt; 
   * @return recommendationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 </div> <div lang=\"en\"> Recommendation ID.<br> When optimizationScoreLift isn't null, the system will assign a common recommendation ID to the suggestion for the campaign. </div> ")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendationId() {
    return recommendationId;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }


  public RecommendationServiceDailyBudgetOverCampaign campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public RecommendationServiceDailyBudgetOverCampaign campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign name.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public RecommendationServiceDailyBudgetOverCampaign currentBudget(Long currentBudget) {
    
    this.currentBudget = currentBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン予算です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current campaign budget. &lt;/div&gt; 
   * @return currentBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン予算です。 </div> <div lang=\"en\"> Current campaign budget. </div> ")
  @JsonProperty(JSON_PROPERTY_CURRENT_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentBudget() {
    return currentBudget;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBudget(Long currentBudget) {
    this.currentBudget = currentBudget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceDailyBudgetOverCampaign recommendationServiceDailyBudgetOverCampaign = (RecommendationServiceDailyBudgetOverCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceDailyBudgetOverCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceDailyBudgetOverCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceDailyBudgetOverCampaign.campaignName) &&
        Objects.equals(this.currentBudget, recommendationServiceDailyBudgetOverCampaign.currentBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceDailyBudgetOverCampaign {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
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

