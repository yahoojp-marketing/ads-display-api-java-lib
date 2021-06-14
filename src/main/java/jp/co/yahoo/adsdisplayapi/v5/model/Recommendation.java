package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceCampaignBiddingStrategyToTargetCpa;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceCampaignsForAddingAds;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceDailyBudgetOver;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceImpsShareBudgetLossOver;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceMigrateToYda;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceSearchKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v5.model.RecommendationServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Recommendationオブジェクトは、最適化提案を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Recommendation object is a container for storing a recommendation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Recommendationオブジェクトは、最適化提案を格納するコンテナです。</div> <div lang=\"en\">Recommendation object is a container for storing a recommendation.</div> ")

public class Recommendation   {
  @JsonProperty("type")
  private JsonNullable<RecommendationServiceType> type = JsonNullable.undefined();

  @JsonProperty("campaignBiddingStrategyToTargetCpa")
  private JsonNullable<RecommendationServiceCampaignBiddingStrategyToTargetCpa> campaignBiddingStrategyToTargetCpa = JsonNullable.undefined();

  @JsonProperty("dailyBudgetOver")
  private JsonNullable<RecommendationServiceDailyBudgetOver> dailyBudgetOver = JsonNullable.undefined();

  @JsonProperty("impsShareBudgetLossOver")
  private JsonNullable<RecommendationServiceImpsShareBudgetLossOver> impsShareBudgetLossOver = JsonNullable.undefined();

  @JsonProperty("migrateToYda")
  private JsonNullable<RecommendationServiceMigrateToYda> migrateToYda = JsonNullable.undefined();

  @JsonProperty("searchKeywordIdea")
  private JsonNullable<RecommendationServiceSearchKeywordIdea> searchKeywordIdea = JsonNullable.undefined();

  @JsonProperty("campaignsForAddingAds")
  private JsonNullable<RecommendationServiceCampaignsForAddingAds> campaignsForAddingAds = JsonNullable.undefined();

  public Recommendation type(RecommendationServiceType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceType> getType() {
    return type;
  }

  public void setType(JsonNullable<RecommendationServiceType> type) {
    this.type = type;
  }

  public Recommendation campaignBiddingStrategyToTargetCpa(RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa) {
    this.campaignBiddingStrategyToTargetCpa = JsonNullable.of(campaignBiddingStrategyToTargetCpa);
    return this;
  }

  /**
   * Get campaignBiddingStrategyToTargetCpa
   * @return campaignBiddingStrategyToTargetCpa
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceCampaignBiddingStrategyToTargetCpa> getCampaignBiddingStrategyToTargetCpa() {
    return campaignBiddingStrategyToTargetCpa;
  }

  public void setCampaignBiddingStrategyToTargetCpa(JsonNullable<RecommendationServiceCampaignBiddingStrategyToTargetCpa> campaignBiddingStrategyToTargetCpa) {
    this.campaignBiddingStrategyToTargetCpa = campaignBiddingStrategyToTargetCpa;
  }

  public Recommendation dailyBudgetOver(RecommendationServiceDailyBudgetOver dailyBudgetOver) {
    this.dailyBudgetOver = JsonNullable.of(dailyBudgetOver);
    return this;
  }

  /**
   * Get dailyBudgetOver
   * @return dailyBudgetOver
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceDailyBudgetOver> getDailyBudgetOver() {
    return dailyBudgetOver;
  }

  public void setDailyBudgetOver(JsonNullable<RecommendationServiceDailyBudgetOver> dailyBudgetOver) {
    this.dailyBudgetOver = dailyBudgetOver;
  }

  public Recommendation impsShareBudgetLossOver(RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver) {
    this.impsShareBudgetLossOver = JsonNullable.of(impsShareBudgetLossOver);
    return this;
  }

  /**
   * Get impsShareBudgetLossOver
   * @return impsShareBudgetLossOver
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceImpsShareBudgetLossOver> getImpsShareBudgetLossOver() {
    return impsShareBudgetLossOver;
  }

  public void setImpsShareBudgetLossOver(JsonNullable<RecommendationServiceImpsShareBudgetLossOver> impsShareBudgetLossOver) {
    this.impsShareBudgetLossOver = impsShareBudgetLossOver;
  }

  public Recommendation migrateToYda(RecommendationServiceMigrateToYda migrateToYda) {
    this.migrateToYda = JsonNullable.of(migrateToYda);
    return this;
  }

  /**
   * Get migrateToYda
   * @return migrateToYda
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceMigrateToYda> getMigrateToYda() {
    return migrateToYda;
  }

  public void setMigrateToYda(JsonNullable<RecommendationServiceMigrateToYda> migrateToYda) {
    this.migrateToYda = migrateToYda;
  }

  public Recommendation searchKeywordIdea(RecommendationServiceSearchKeywordIdea searchKeywordIdea) {
    this.searchKeywordIdea = JsonNullable.of(searchKeywordIdea);
    return this;
  }

  /**
   * Get searchKeywordIdea
   * @return searchKeywordIdea
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceSearchKeywordIdea> getSearchKeywordIdea() {
    return searchKeywordIdea;
  }

  public void setSearchKeywordIdea(JsonNullable<RecommendationServiceSearchKeywordIdea> searchKeywordIdea) {
    this.searchKeywordIdea = searchKeywordIdea;
  }

  public Recommendation campaignsForAddingAds(RecommendationServiceCampaignsForAddingAds campaignsForAddingAds) {
    this.campaignsForAddingAds = JsonNullable.of(campaignsForAddingAds);
    return this;
  }

  /**
   * Get campaignsForAddingAds
   * @return campaignsForAddingAds
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RecommendationServiceCampaignsForAddingAds> getCampaignsForAddingAds() {
    return campaignsForAddingAds;
  }

  public void setCampaignsForAddingAds(JsonNullable<RecommendationServiceCampaignsForAddingAds> campaignsForAddingAds) {
    this.campaignsForAddingAds = campaignsForAddingAds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.migrateToYda, recommendation.migrateToYda) &&
        Objects.equals(this.searchKeywordIdea, recommendation.searchKeywordIdea) &&
        Objects.equals(this.campaignsForAddingAds, recommendation.campaignsForAddingAds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, campaignBiddingStrategyToTargetCpa, dailyBudgetOver, impsShareBudgetLossOver, migrateToYda, searchKeywordIdea, campaignsForAddingAds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    campaignBiddingStrategyToTargetCpa: ").append(toIndentedString(campaignBiddingStrategyToTargetCpa)).append("\n");
    sb.append("    dailyBudgetOver: ").append(toIndentedString(dailyBudgetOver)).append("\n");
    sb.append("    impsShareBudgetLossOver: ").append(toIndentedString(impsShareBudgetLossOver)).append("\n");
    sb.append("    migrateToYda: ").append(toIndentedString(migrateToYda)).append("\n");
    sb.append("    searchKeywordIdea: ").append(toIndentedString(searchKeywordIdea)).append("\n");
    sb.append("    campaignsForAddingAds: ").append(toIndentedString(campaignsForAddingAds)).append("\n");
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

