package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceMaximizeConversionsCampaignオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceMaximizeConversionsCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (Maximize Conversions).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceMaximizeConversionsCampaignオブジェクトは、自動入札（コンバージョン数の最大化）に適しているキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceMaximizeConversionsCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (Maximize Conversions).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceMaximizeConversionsCampaign   {
  @JsonProperty("recommendationId")
  private Long recommendationId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("currentBudget")
  private Long currentBudget = null;

  @JsonProperty("currentCampaignBiddingStrategyType")
  private String currentCampaignBiddingStrategyType = null;

  @JsonProperty("currentCpcBidValue")
  private Long currentCpcBidValue = null;

  @JsonProperty("recommendedCampaignBiddingStrategyType")
  private String recommendedCampaignBiddingStrategyType = null;

  public RecommendationServiceMaximizeConversionsCampaign recommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public Long getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Long recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceMaximizeConversionsCampaign campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public RecommendationServiceMaximizeConversionsCampaign campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public RecommendationServiceMaximizeConversionsCampaign currentBudget(Long currentBudget) {
    this.currentBudget = currentBudget;
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン予算です。 </div> <div lang=\"en\"> Current campaign budget. </div> 
   * @return currentBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン予算です。 </div> <div lang=\"en\"> Current campaign budget. </div> ")


  public Long getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(Long currentBudget) {
    this.currentBudget = currentBudget;
  }

  public RecommendationServiceMaximizeConversionsCampaign currentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン入札戦略タイプです。 </div> <div lang=\"en\"> Current campaign bidding strategy type. </div> 
   * @return currentCampaignBiddingStrategyType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン入札戦略タイプです。 </div> <div lang=\"en\"> Current campaign bidding strategy type. </div> ")


  public String getCurrentCampaignBiddingStrategyType() {
    return currentCampaignBiddingStrategyType;
  }

  public void setCurrentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
  }

  public RecommendationServiceMaximizeConversionsCampaign currentCpcBidValue(Long currentCpcBidValue) {
    this.currentCpcBidValue = currentCpcBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン最大入札単価(CPC)です。 </div> <div lang=\"en\"> Current max bid of campaign (CPC). </div> 
   * @return currentCpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン最大入札単価(CPC)です。 </div> <div lang=\"en\"> Current max bid of campaign (CPC). </div> ")


  public Long getCurrentCpcBidValue() {
    return currentCpcBidValue;
  }

  public void setCurrentCpcBidValue(Long currentCpcBidValue) {
    this.currentCpcBidValue = currentCpcBidValue;
  }

  public RecommendationServiceMaximizeConversionsCampaign recommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するキャンペーン入札戦略タイプです。<br> </div> <div lang=\"en\"> Recommended campaign bidding strategy type. </div> 
   * @return recommendedCampaignBiddingStrategyType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン入札戦略タイプです。<br> </div> <div lang=\"en\"> Recommended campaign bidding strategy type. </div> ")


  public String getRecommendedCampaignBiddingStrategyType() {
    return recommendedCampaignBiddingStrategyType;
  }

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
    RecommendationServiceMaximizeConversionsCampaign recommendationServiceMaximizeConversionsCampaign = (RecommendationServiceMaximizeConversionsCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceMaximizeConversionsCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceMaximizeConversionsCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceMaximizeConversionsCampaign.campaignName) &&
        Objects.equals(this.currentBudget, recommendationServiceMaximizeConversionsCampaign.currentBudget) &&
        Objects.equals(this.currentCampaignBiddingStrategyType, recommendationServiceMaximizeConversionsCampaign.currentCampaignBiddingStrategyType) &&
        Objects.equals(this.currentCpcBidValue, recommendationServiceMaximizeConversionsCampaign.currentCpcBidValue) &&
        Objects.equals(this.recommendedCampaignBiddingStrategyType, recommendationServiceMaximizeConversionsCampaign.recommendedCampaignBiddingStrategyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget, currentCampaignBiddingStrategyType, currentCpcBidValue, recommendedCampaignBiddingStrategyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceMaximizeConversionsCampaign {\n");
    
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
    sb.append("    currentCampaignBiddingStrategyType: ").append(toIndentedString(currentCampaignBiddingStrategyType)).append("\n");
    sb.append("    currentCpcBidValue: ").append(toIndentedString(currentCpcBidValue)).append("\n");
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

