package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RecommendationServiceImpsShareBudgetLossOverCampaignオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RecommendationServiceImpsShareBudgetLossOverCampaign object describes the detailed information of Recommendations about campaigns that have a large lost impression share (budget).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RecommendationServiceImpsShareBudgetLossOverCampaignオブジェクトは、インプレッションシェア損失率（予算）が大きいキャンペーンに関する最適化提案の詳細情報を表します。</div> <div lang=\"en\">RecommendationServiceImpsShareBudgetLossOverCampaign object describes the detailed information of Recommendations about campaigns that have a large lost impression share (budget).</div> ")

public class RecommendationServiceImpsShareBudgetLossOverCampaign   {
  @JsonProperty("recommendationId")
  private JsonNullable<Long> recommendationId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("currentBudget")
  private JsonNullable<Long> currentBudget = JsonNullable.undefined();

  @JsonProperty("recommendedBudget")
  private JsonNullable<Long> recommendedBudget = JsonNullable.undefined();

  public RecommendationServiceImpsShareBudgetLossOverCampaign recommendationId(Long recommendationId) {
    this.recommendationId = JsonNullable.of(recommendationId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> 
   * @return recommendationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最適化提案IDです。<br> </div> <div lang=\"en\"> Recommendation ID.<br> </div> ")


  public JsonNullable<Long> getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(JsonNullable<Long> recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationServiceImpsShareBudgetLossOverCampaign campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> </div> <div lang=\"en\"> Campaign ID.<br> </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public RecommendationServiceImpsShareBudgetLossOverCampaign campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> </div> <div lang=\"en\"> Campaign Name.<br> </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public RecommendationServiceImpsShareBudgetLossOverCampaign currentBudget(Long currentBudget) {
    this.currentBudget = JsonNullable.of(currentBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> 現在のキャンペーン予算です。 </div> <div lang=\"en\"> Current campaign budget. </div> 
   * @return currentBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 現在のキャンペーン予算です。 </div> <div lang=\"en\"> Current campaign budget. </div> ")


  public JsonNullable<Long> getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(JsonNullable<Long> currentBudget) {
    this.currentBudget = currentBudget;
  }

  public RecommendationServiceImpsShareBudgetLossOverCampaign recommendedBudget(Long recommendedBudget) {
    this.recommendedBudget = JsonNullable.of(recommendedBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> 推奨するキャンペーン予算設定です。 </div> <div lang=\"en\"> Recommended campaign budget setting. </div> 
   * @return recommendedBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 推奨するキャンペーン予算設定です。 </div> <div lang=\"en\"> Recommended campaign budget setting. </div> ")


  public JsonNullable<Long> getRecommendedBudget() {
    return recommendedBudget;
  }

  public void setRecommendedBudget(JsonNullable<Long> recommendedBudget) {
    this.recommendedBudget = recommendedBudget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceImpsShareBudgetLossOverCampaign recommendationServiceImpsShareBudgetLossOverCampaign = (RecommendationServiceImpsShareBudgetLossOverCampaign) o;
    return Objects.equals(this.recommendationId, recommendationServiceImpsShareBudgetLossOverCampaign.recommendationId) &&
        Objects.equals(this.campaignId, recommendationServiceImpsShareBudgetLossOverCampaign.campaignId) &&
        Objects.equals(this.campaignName, recommendationServiceImpsShareBudgetLossOverCampaign.campaignName) &&
        Objects.equals(this.currentBudget, recommendationServiceImpsShareBudgetLossOverCampaign.currentBudget) &&
        Objects.equals(this.recommendedBudget, recommendationServiceImpsShareBudgetLossOverCampaign.recommendedBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, campaignId, campaignName, currentBudget, recommendedBudget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceImpsShareBudgetLossOverCampaign {\n");
    
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
    sb.append("    recommendedBudget: ").append(toIndentedString(recommendedBudget)).append("\n");
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

