package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceCampaignBiddingStrategyToTargetCpa;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceCampaignsForAddingAds;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceDailyBudgetOver;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceImpsShareBudgetLossOver;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceSearchKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v6.model.RecommendationServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Recommendationオブジェクトは、最適化提案を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Recommendation object is a container for storing a recommendation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Recommendationオブジェクトは、最適化提案を格納するコンテナです。</div> <div lang=\"en\">Recommendation object is a container for storing a recommendation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Recommendation   {
  @JsonProperty("type")
  private RecommendationServiceType type = null;

  @JsonProperty("campaignBiddingStrategyToTargetCpa")
  private RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa = null;

  @JsonProperty("dailyBudgetOver")
  private RecommendationServiceDailyBudgetOver dailyBudgetOver = null;

  @JsonProperty("impsShareBudgetLossOver")
  private RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver = null;

  @JsonProperty("searchKeywordIdea")
  private RecommendationServiceSearchKeywordIdea searchKeywordIdea = null;

  @JsonProperty("campaignsForAddingAds")
  private RecommendationServiceCampaignsForAddingAds campaignsForAddingAds = null;

  public Recommendation type(RecommendationServiceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceType getType() {
    return type;
  }

  public void setType(RecommendationServiceType type) {
    this.type = type;
  }

  public Recommendation campaignBiddingStrategyToTargetCpa(RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa) {
    this.campaignBiddingStrategyToTargetCpa = campaignBiddingStrategyToTargetCpa;
    return this;
  }

  /**
   * Get campaignBiddingStrategyToTargetCpa
   * @return campaignBiddingStrategyToTargetCpa
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa getCampaignBiddingStrategyToTargetCpa() {
    return campaignBiddingStrategyToTargetCpa;
  }

  public void setCampaignBiddingStrategyToTargetCpa(RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa) {
    this.campaignBiddingStrategyToTargetCpa = campaignBiddingStrategyToTargetCpa;
  }

  public Recommendation dailyBudgetOver(RecommendationServiceDailyBudgetOver dailyBudgetOver) {
    this.dailyBudgetOver = dailyBudgetOver;
    return this;
  }

  /**
   * Get dailyBudgetOver
   * @return dailyBudgetOver
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceDailyBudgetOver getDailyBudgetOver() {
    return dailyBudgetOver;
  }

  public void setDailyBudgetOver(RecommendationServiceDailyBudgetOver dailyBudgetOver) {
    this.dailyBudgetOver = dailyBudgetOver;
  }

  public Recommendation impsShareBudgetLossOver(RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver) {
    this.impsShareBudgetLossOver = impsShareBudgetLossOver;
    return this;
  }

  /**
   * Get impsShareBudgetLossOver
   * @return impsShareBudgetLossOver
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceImpsShareBudgetLossOver getImpsShareBudgetLossOver() {
    return impsShareBudgetLossOver;
  }

  public void setImpsShareBudgetLossOver(RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver) {
    this.impsShareBudgetLossOver = impsShareBudgetLossOver;
  }

  public Recommendation searchKeywordIdea(RecommendationServiceSearchKeywordIdea searchKeywordIdea) {
    this.searchKeywordIdea = searchKeywordIdea;
    return this;
  }

  /**
   * Get searchKeywordIdea
   * @return searchKeywordIdea
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceSearchKeywordIdea getSearchKeywordIdea() {
    return searchKeywordIdea;
  }

  public void setSearchKeywordIdea(RecommendationServiceSearchKeywordIdea searchKeywordIdea) {
    this.searchKeywordIdea = searchKeywordIdea;
  }

  public Recommendation campaignsForAddingAds(RecommendationServiceCampaignsForAddingAds campaignsForAddingAds) {
    this.campaignsForAddingAds = campaignsForAddingAds;
    return this;
  }

  /**
   * Get campaignsForAddingAds
   * @return campaignsForAddingAds
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecommendationServiceCampaignsForAddingAds getCampaignsForAddingAds() {
    return campaignsForAddingAds;
  }

  public void setCampaignsForAddingAds(RecommendationServiceCampaignsForAddingAds campaignsForAddingAds) {
    this.campaignsForAddingAds = campaignsForAddingAds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommendation recommendation = (Recommendation) o;
    return Objects.equals(this.type, recommendation.type) &&
        Objects.equals(this.campaignBiddingStrategyToTargetCpa, recommendation.campaignBiddingStrategyToTargetCpa) &&
        Objects.equals(this.dailyBudgetOver, recommendation.dailyBudgetOver) &&
        Objects.equals(this.impsShareBudgetLossOver, recommendation.impsShareBudgetLossOver) &&
        Objects.equals(this.searchKeywordIdea, recommendation.searchKeywordIdea) &&
        Objects.equals(this.campaignsForAddingAds, recommendation.campaignsForAddingAds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, campaignBiddingStrategyToTargetCpa, dailyBudgetOver, impsShareBudgetLossOver, searchKeywordIdea, campaignsForAddingAds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    campaignBiddingStrategyToTargetCpa: ").append(toIndentedString(campaignBiddingStrategyToTargetCpa)).append("\n");
    sb.append("    dailyBudgetOver: ").append(toIndentedString(dailyBudgetOver)).append("\n");
    sb.append("    impsShareBudgetLossOver: ").append(toIndentedString(impsShareBudgetLossOver)).append("\n");
    sb.append("    searchKeywordIdea: ").append(toIndentedString(searchKeywordIdea)).append("\n");
    sb.append("    campaignsForAddingAds: ").append(toIndentedString(campaignsForAddingAds)).append("\n");
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

