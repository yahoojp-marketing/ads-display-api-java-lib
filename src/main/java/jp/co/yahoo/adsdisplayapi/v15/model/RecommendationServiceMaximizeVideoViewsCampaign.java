/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeVideoViewsCampaignオブジェクトは、自動入札（動画再生数の最大化）に適しているキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeVideoViewsCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (Maximize video views).&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_RECOMMENDATION_ID,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_CAMPAIGN_ID,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_CAMPAIGN_NAME,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_CURRENT_BUDGET,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_CURRENT_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_CURRENT_CPV_BID_VALUE,
  RecommendationServiceMaximizeVideoViewsCampaign.JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceMaximizeVideoViewsCampaign {
  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "recommendationId";
  private Long recommendationId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CURRENT_BUDGET = "currentBudget";
  private Long currentBudget;

  public static final String JSON_PROPERTY_CURRENT_CAMPAIGN_BIDDING_STRATEGY_TYPE = "currentCampaignBiddingStrategyType";
  private String currentCampaignBiddingStrategyType;

  public static final String JSON_PROPERTY_CURRENT_CPV_BID_VALUE = "currentCpvBidValue";
  private Long currentCpvBidValue;

  public static final String JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE = "recommendedCampaignBiddingStrategyType";
  private String recommendedCampaignBiddingStrategyType;

  public RecommendationServiceMaximizeVideoViewsCampaign() {
  }

  public RecommendationServiceMaximizeVideoViewsCampaign recommendationId(Long recommendationId) {
    
    this.recommendationId = recommendationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化提案IDです。&lt;br&gt; optimizationScoreLiftがnullでない場合は、1つのキャンペーンに関する提案に共通の最適化提案IDが割り当てられます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommendation ID.&lt;br&gt; When optimizationScoreLift isn&#39;t null, the system will assign a common recommendation ID to the suggestion for the campaign. &lt;/div&gt; 
   * @return recommendationId
  **/
  @jakarta.annotation.Nullable
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


  public RecommendationServiceMaximizeVideoViewsCampaign campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; &lt;/div&gt; 
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
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


  public RecommendationServiceMaximizeVideoViewsCampaign campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; &lt;/div&gt; 
   * @return campaignName
  **/
  @jakarta.annotation.Nullable
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


  public RecommendationServiceMaximizeVideoViewsCampaign currentBudget(Long currentBudget) {
    
    this.currentBudget = currentBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン予算です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current campaign budget. &lt;/div&gt; 
   * @return currentBudget
  **/
  @jakarta.annotation.Nullable
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


  public RecommendationServiceMaximizeVideoViewsCampaign currentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン入札戦略タイプです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current campaign bidding strategy type. &lt;/div&gt; 
   * @return currentCampaignBiddingStrategyType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentCampaignBiddingStrategyType() {
    return currentCampaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
  }


  public RecommendationServiceMaximizeVideoViewsCampaign currentCpvBidValue(Long currentCpvBidValue) {
    
    this.currentCpvBidValue = currentCpvBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン最大入札単価(CPV)です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current max bid of campaign (CPV). &lt;/div&gt; 
   * @return currentCpvBidValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_CPV_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentCpvBidValue() {
    return currentCpvBidValue;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CPV_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCpvBidValue(Long currentCpvBidValue) {
    this.currentCpvBidValue = currentCpvBidValue;
  }


  public RecommendationServiceMaximizeVideoViewsCampaign recommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するキャンペーン入札戦略タイプです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommended campaign bidding strategy type. &lt;/div&gt; 
   * @return recommendedCampaignBiddingStrategyType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecommendedCampaignBiddingStrategyType() {
    return recommendedCampaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceMaximizeVideoViewsCampaign recommendationServiceMaximizeVideoViewsCampaign = (RecommendationServiceMaximizeVideoViewsCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceMaximizeVideoViewsCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceMaximizeVideoViewsCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceMaximizeVideoViewsCampaign.campaignName) &&
        Objects.equals(this.currentBudget, recommendationServiceMaximizeVideoViewsCampaign.currentBudget) &&
        Objects.equals(this.currentCampaignBiddingStrategyType, recommendationServiceMaximizeVideoViewsCampaign.currentCampaignBiddingStrategyType) &&
        Objects.equals(this.currentCpvBidValue, recommendationServiceMaximizeVideoViewsCampaign.currentCpvBidValue) &&
        Objects.equals(this.recommendedCampaignBiddingStrategyType, recommendationServiceMaximizeVideoViewsCampaign.recommendedCampaignBiddingStrategyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget, currentCampaignBiddingStrategyType, currentCpvBidValue, recommendedCampaignBiddingStrategyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeVideoViewsCampaign {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
    sb.append("    currentCampaignBiddingStrategyType: ").append(toIndentedString(currentCampaignBiddingStrategyType)).append("\n");
    sb.append("    currentCpvBidValue: ").append(toIndentedString(currentCpvBidValue)).append("\n");
    sb.append("    recommendedCampaignBiddingStrategyType: ").append(toIndentedString(recommendedCampaignBiddingStrategyType)).append("\n");
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

