/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaignオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (target CPA).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaignオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (target CPA).</div> ")
@JsonPropertyOrder({
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_RECOMMENDATION_ID,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_CAMPAIGN_ID,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_CAMPAIGN_NAME,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_CURRENT_BUDGET,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_CURRENT_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_CURRENT_CPC_BID_VALUE,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.JSON_PROPERTY_RECOMMENDED_TARGET_CPA_BID_VALUE
})
@JsonTypeName("RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign {
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

  public static final String JSON_PROPERTY_CURRENT_CPC_BID_VALUE = "currentCpcBidValue";
  private Long currentCpcBidValue;

  public static final String JSON_PROPERTY_RECOMMENDED_CAMPAIGN_BIDDING_STRATEGY_TYPE = "recommendedCampaignBiddingStrategyType";
  private String recommendedCampaignBiddingStrategyType;

  public static final String JSON_PROPERTY_RECOMMENDED_TARGET_CPA_BID_VALUE = "recommendedTargetCpaBidValue";
  private Long recommendedTargetCpaBidValue;

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign() { 
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendationId(Long recommendationId) {
    
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignId(Long campaignId) {
    
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign Name.&lt;br&gt; &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> ")
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentBudget(Long currentBudget) {
    
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン入札戦略タイプです。&lt;br&gt; 現在は\&quot;CPC\&quot;のみ返却します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current campaign bidding strategy type.&lt;br&gt; Currently, only \&quot;CPC\&quot; will be returned. &lt;/div&gt; 
   * @return currentCampaignBiddingStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン入札戦略タイプです。<br> 現在は\"CPC\"のみ返却します。 </div> <div lang=\"en\"> Current campaign bidding strategy type.<br> Currently, only \"CPC\" will be returned. </div> ")
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentCpcBidValue(Long currentCpcBidValue) {
    
    this.currentCpcBidValue = currentCpcBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 現在のキャンペーン最大入札単価(CPC)です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Current max bid of campaign (CPC). &lt;/div&gt; 
   * @return currentCpcBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン最大入札単価(CPC)です。 </div> <div lang=\"en\"> Current max bid of campaign (CPC). </div> ")
  @JsonProperty(JSON_PROPERTY_CURRENT_CPC_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentCpcBidValue() {
    return currentCpcBidValue;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CPC_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCpcBidValue(Long currentCpcBidValue) {
    this.currentCpcBidValue = currentCpcBidValue;
  }


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するキャンペーン入札戦略タイプです。&lt;br&gt; 現在は\&quot;AUTO\&quot;のみ返却します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommended campaign bidding strategy type.&lt;br&gt; Currently, only \&quot;AUTO\&quot; will be returned. &lt;/div&gt; 
   * @return recommendedCampaignBiddingStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン入札戦略タイプです。<br> 現在は\"AUTO\"のみ返却します。 </div> <div lang=\"en\"> Recommended campaign bidding strategy type.<br> Currently, only \"AUTO\" will be returned. </div> ")
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


  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendedTargetCpaBidValue(Long recommendedTargetCpaBidValue) {
    
    this.recommendedTargetCpaBidValue = recommendedTargetCpaBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 推奨するキャンペーン目標単価(tCPA)です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Recommended target bid of campaign (tCPA). &lt;/div&gt; 
   * @return recommendedTargetCpaBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン目標単価(tCPA)です。 </div> <div lang=\"en\"> Recommended target bid of campaign (tCPA). </div> ")
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_TARGET_CPA_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecommendedTargetCpaBidValue() {
    return recommendedTargetCpaBidValue;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDED_TARGET_CPA_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendedTargetCpaBidValue(Long recommendedTargetCpaBidValue) {
    this.recommendedTargetCpaBidValue = recommendedTargetCpaBidValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign = (RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.campaignName) &&
        Objects.equals(this.currentBudget, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.currentBudget) &&
        Objects.equals(this.currentCampaignBiddingStrategyType, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.currentCampaignBiddingStrategyType) &&
        Objects.equals(this.currentCpcBidValue, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.currentCpcBidValue) &&
        Objects.equals(this.recommendedCampaignBiddingStrategyType, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.recommendedCampaignBiddingStrategyType) &&
        Objects.equals(this.recommendedTargetCpaBidValue, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.recommendedTargetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget, currentCampaignBiddingStrategyType, currentCpcBidValue, recommendedCampaignBiddingStrategyType, recommendedTargetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
    sb.append("    currentCampaignBiddingStrategyType: ").append(toIndentedString(currentCampaignBiddingStrategyType)).append("\n");
    sb.append("    currentCpcBidValue: ").append(toIndentedString(currentCpcBidValue)).append("\n");
    sb.append("    recommendedCampaignBiddingStrategyType: ").append(toIndentedString(recommendedCampaignBiddingStrategyType)).append("\n");
    sb.append("    recommendedTargetCpaBidValue: ").append(toIndentedString(recommendedTargetCpaBidValue)).append("\n");
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

