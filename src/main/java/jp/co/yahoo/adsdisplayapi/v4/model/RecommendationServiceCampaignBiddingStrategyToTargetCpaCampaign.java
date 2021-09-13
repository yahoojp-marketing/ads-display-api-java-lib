package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaignオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (target CPA).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaignオブジェクトは、自動入札（コンバージョン単価の目標値）に適しているキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign object describes detailed information of Recommendations about the campaign that is suitable for using autobidding (target CPA).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign   {
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

  @JsonProperty("currentMaxCpcBidValue")
  private Long currentMaxCpcBidValue = null;

  @JsonProperty("recommendedCampaignBiddingStrategyType")
  private String recommendedCampaignBiddingStrategyType = null;

  @JsonProperty("recommendedTargetCpaBidValue")
  private Long recommendedTargetCpaBidValue = null;

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendationId(Long recommendationId) {
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

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignId(Long campaignId) {
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

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign campaignName(String campaignName) {
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

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentBudget(Long currentBudget) {
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

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン入札戦略タイプです。<br> 現在は\"MAX_CPC\"のみ返却します。 </div> <div lang=\"en\"> Current campaign bidding strategy type.<br> Currently, only \"MAX_CPC\" will be returned. </div> 
   * @return currentCampaignBiddingStrategyType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン入札戦略タイプです。<br> 現在は\"MAX_CPC\"のみ返却します。 </div> <div lang=\"en\"> Current campaign bidding strategy type.<br> Currently, only \"MAX_CPC\" will be returned. </div> ")


  public String getCurrentCampaignBiddingStrategyType() {
    return currentCampaignBiddingStrategyType;
  }

  public void setCurrentCampaignBiddingStrategyType(String currentCampaignBiddingStrategyType) {
    this.currentCampaignBiddingStrategyType = currentCampaignBiddingStrategyType;
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign currentMaxCpcBidValue(Long currentMaxCpcBidValue) {
    this.currentMaxCpcBidValue = currentMaxCpcBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン最大入札単価(CPC)です。 </div> <div lang=\"en\"> Current max bid of campaign (CPC). </div> 
   * @return currentMaxCpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン最大入札単価(CPC)です。 </div> <div lang=\"en\"> Current max bid of campaign (CPC). </div> ")


  public Long getCurrentMaxCpcBidValue() {
    return currentMaxCpcBidValue;
  }

  public void setCurrentMaxCpcBidValue(Long currentMaxCpcBidValue) {
    this.currentMaxCpcBidValue = currentMaxCpcBidValue;
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するキャンペーン入札戦略タイプです。<br> 現在は\"AUTO\"のみ返却します。 </div> <div lang=\"en\"> Recommended campaign bidding strategy type.<br> Currently, only \"AUTO\" will be returned. </div> 
   * @return recommendedCampaignBiddingStrategyType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン入札戦略タイプです。<br> 現在は\"AUTO\"のみ返却します。 </div> <div lang=\"en\"> Recommended campaign bidding strategy type.<br> Currently, only \"AUTO\" will be returned. </div> ")


  public String getRecommendedCampaignBiddingStrategyType() {
    return recommendedCampaignBiddingStrategyType;
  }

  public void setRecommendedCampaignBiddingStrategyType(String recommendedCampaignBiddingStrategyType) {
    this.recommendedCampaignBiddingStrategyType = recommendedCampaignBiddingStrategyType;
  }

  public RecommendationServiceCampaignBiddingStrategyToTargetCpaCampaign recommendedTargetCpaBidValue(Long recommendedTargetCpaBidValue) {
    this.recommendedTargetCpaBidValue = recommendedTargetCpaBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するキャンペーン目標単価(tCPA)です。 </div> <div lang=\"en\"> Recommended target bid of campaign (tCPA). </div> 
   * @return recommendedTargetCpaBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン目標単価(tCPA)です。 </div> <div lang=\"en\"> Recommended target bid of campaign (tCPA). </div> ")


  public Long getRecommendedTargetCpaBidValue() {
    return recommendedTargetCpaBidValue;
  }

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
        Objects.equals(this.currentMaxCpcBidValue, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.currentMaxCpcBidValue) &&
        Objects.equals(this.recommendedCampaignBiddingStrategyType, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.recommendedCampaignBiddingStrategyType) &&
        Objects.equals(this.recommendedTargetCpaBidValue, recommendationServiceCampaignBiddingStrategyToTargetCpaCampaign.recommendedTargetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget, currentCampaignBiddingStrategyType, currentMaxCpcBidValue, recommendedCampaignBiddingStrategyType, recommendedTargetCpaBidValue);
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
    sb.append("    currentMaxCpcBidValue: ").append(toIndentedString(currentMaxCpcBidValue)).append("\n");
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

