/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceCampaignBiddingStrategyToTargetCpa;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceCampaignsForAddingAds;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceDailyBudgetOver;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceImpsShareBudgetLossOver;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeClicks;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeConversions;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceMaximizeVideoViews;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceSearchKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v7.model.RecommendationServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Recommendationオブジェクトは、最適化提案を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Recommendation object is a container for storing a recommendation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Recommendationオブジェクトは、最適化提案を格納するコンテナです。</div> <div lang=\"en\">Recommendation object is a container for storing a recommendation.</div> ")
@JsonPropertyOrder({
  Recommendation.JSON_PROPERTY_TYPE,
  Recommendation.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA,
  Recommendation.JSON_PROPERTY_DAILY_BUDGET_OVER,
  Recommendation.JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER,
  Recommendation.JSON_PROPERTY_SEARCH_KEYWORD_IDEA,
  Recommendation.JSON_PROPERTY_CAMPAIGNS_FOR_ADDING_ADS,
  Recommendation.JSON_PROPERTY_MAXIMIZE_CONVERSIONS,
  Recommendation.JSON_PROPERTY_MAXIMIZE_CLICKS,
  Recommendation.JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS
})
@JsonTypeName("Recommendation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Recommendation {
  public static final String JSON_PROPERTY_TYPE = "type";
  private RecommendationServiceType type;

  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA = "campaignBiddingStrategyToTargetCpa";
  private RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa;

  public static final String JSON_PROPERTY_DAILY_BUDGET_OVER = "dailyBudgetOver";
  private RecommendationServiceDailyBudgetOver dailyBudgetOver;

  public static final String JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER = "impsShareBudgetLossOver";
  private RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_IDEA = "searchKeywordIdea";
  private RecommendationServiceSearchKeywordIdea searchKeywordIdea;

  public static final String JSON_PROPERTY_CAMPAIGNS_FOR_ADDING_ADS = "campaignsForAddingAds";
  private RecommendationServiceCampaignsForAddingAds campaignsForAddingAds;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS = "maximizeConversions";
  private RecommendationServiceMaximizeConversions maximizeConversions;

  public static final String JSON_PROPERTY_MAXIMIZE_CLICKS = "maximizeClicks";
  private RecommendationServiceMaximizeClicks maximizeClicks;

  public static final String JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS = "maximizeVideoViews";
  private RecommendationServiceMaximizeVideoViews maximizeVideoViews;

  public Recommendation() { 
  }

  public Recommendation type(RecommendationServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceCampaignBiddingStrategyToTargetCpa getCampaignBiddingStrategyToTargetCpa() {
    return campaignBiddingStrategyToTargetCpa;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_OVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceDailyBudgetOver getDailyBudgetOver() {
    return dailyBudgetOver;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_OVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceImpsShareBudgetLossOver getImpsShareBudgetLossOver() {
    return impsShareBudgetLossOver;
  }


  @JsonProperty(JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceSearchKeywordIdea getSearchKeywordIdea() {
    return searchKeywordIdea;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_IDEA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGNS_FOR_ADDING_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceCampaignsForAddingAds getCampaignsForAddingAds() {
    return campaignsForAddingAds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGNS_FOR_ADDING_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignsForAddingAds(RecommendationServiceCampaignsForAddingAds campaignsForAddingAds) {
    this.campaignsForAddingAds = campaignsForAddingAds;
  }


  public Recommendation maximizeConversions(RecommendationServiceMaximizeConversions maximizeConversions) {
    
    this.maximizeConversions = maximizeConversions;
    return this;
  }

   /**
   * Get maximizeConversions
   * @return maximizeConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceMaximizeConversions getMaximizeConversions() {
    return maximizeConversions;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversions(RecommendationServiceMaximizeConversions maximizeConversions) {
    this.maximizeConversions = maximizeConversions;
  }


  public Recommendation maximizeClicks(RecommendationServiceMaximizeClicks maximizeClicks) {
    
    this.maximizeClicks = maximizeClicks;
    return this;
  }

   /**
   * Get maximizeClicks
   * @return maximizeClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceMaximizeClicks getMaximizeClicks() {
    return maximizeClicks;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeClicks(RecommendationServiceMaximizeClicks maximizeClicks) {
    this.maximizeClicks = maximizeClicks;
  }


  public Recommendation maximizeVideoViews(RecommendationServiceMaximizeVideoViews maximizeVideoViews) {
    
    this.maximizeVideoViews = maximizeVideoViews;
    return this;
  }

   /**
   * Get maximizeVideoViews
   * @return maximizeVideoViews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceMaximizeVideoViews getMaximizeVideoViews() {
    return maximizeVideoViews;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeVideoViews(RecommendationServiceMaximizeVideoViews maximizeVideoViews) {
    this.maximizeVideoViews = maximizeVideoViews;
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
        Objects.equals(this.campaignsForAddingAds, recommendation.campaignsForAddingAds) &&
        Objects.equals(this.maximizeConversions, recommendation.maximizeConversions) &&
        Objects.equals(this.maximizeClicks, recommendation.maximizeClicks) &&
        Objects.equals(this.maximizeVideoViews, recommendation.maximizeVideoViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, campaignBiddingStrategyToTargetCpa, dailyBudgetOver, impsShareBudgetLossOver, searchKeywordIdea, campaignsForAddingAds, maximizeConversions, maximizeClicks, maximizeVideoViews);
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
    sb.append("    maximizeConversions: ").append(toIndentedString(maximizeConversions)).append("\n");
    sb.append("    maximizeClicks: ").append(toIndentedString(maximizeClicks)).append("\n");
    sb.append("    maximizeVideoViews: ").append(toIndentedString(maximizeVideoViews)).append("\n");
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

