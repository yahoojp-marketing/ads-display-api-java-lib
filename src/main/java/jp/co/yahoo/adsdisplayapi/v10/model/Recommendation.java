/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceAdGroupsForAddingAds;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceCampaignBiddingStrategyToTargetCpa;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceDailyBudgetOver;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceDailyBudgetSmall;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceDuplicateTargetingSettings;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceImpsShareBudgetLossOver;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceInsufficientAdScheduleTargeting;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceInsufficientClicks;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceInsufficientConversions;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceInsufficientTargeting;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceInsufficientVideoViews;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceMaximizeClicks;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceMaximizeConversions;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceMaximizeVideoViews;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceSearchKeywordIdea;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceType;
import jp.co.yahoo.adsdisplayapi.v10.model.RecommendationServiceUpdateAdCreative;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Recommendationオブジェクトは、最適化提案を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Recommendation object is a container for storing a recommendation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  Recommendation.JSON_PROPERTY_TYPE,
  Recommendation.JSON_PROPERTY_OPTIMIZATION_SCORE_LIFT,
  Recommendation.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA,
  Recommendation.JSON_PROPERTY_DAILY_BUDGET_OVER,
  Recommendation.JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER,
  Recommendation.JSON_PROPERTY_SEARCH_KEYWORD_IDEA,
  Recommendation.JSON_PROPERTY_MAXIMIZE_CONVERSIONS,
  Recommendation.JSON_PROPERTY_MAXIMIZE_CLICKS,
  Recommendation.JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS,
  Recommendation.JSON_PROPERTY_UPDATE_AD_CREATIVE,
  Recommendation.JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS,
  Recommendation.JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE,
  Recommendation.JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS,
  Recommendation.JSON_PROPERTY_DAILY_BUDGET_SMALL,
  Recommendation.JSON_PROPERTY_INSUFFICIENT_TARGETING,
  Recommendation.JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING,
  Recommendation.JSON_PROPERTY_INSUFFICIENT_CONVERSIONS,
  Recommendation.JSON_PROPERTY_INSUFFICIENT_CLICKS,
  Recommendation.JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Recommendation {
  public static final String JSON_PROPERTY_TYPE = "type";
  private RecommendationServiceType type;

  public static final String JSON_PROPERTY_OPTIMIZATION_SCORE_LIFT = "optimizationScoreLift";
  private Double optimizationScoreLift;

  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TO_TARGET_CPA = "campaignBiddingStrategyToTargetCpa";
  private RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa;

  public static final String JSON_PROPERTY_DAILY_BUDGET_OVER = "dailyBudgetOver";
  private RecommendationServiceDailyBudgetOver dailyBudgetOver;

  public static final String JSON_PROPERTY_IMPS_SHARE_BUDGET_LOSS_OVER = "impsShareBudgetLossOver";
  private RecommendationServiceImpsShareBudgetLossOver impsShareBudgetLossOver;

  public static final String JSON_PROPERTY_SEARCH_KEYWORD_IDEA = "searchKeywordIdea";
  private RecommendationServiceSearchKeywordIdea searchKeywordIdea;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS = "maximizeConversions";
  private RecommendationServiceMaximizeConversions maximizeConversions;

  public static final String JSON_PROPERTY_MAXIMIZE_CLICKS = "maximizeClicks";
  private RecommendationServiceMaximizeClicks maximizeClicks;

  public static final String JSON_PROPERTY_MAXIMIZE_VIDEO_VIEWS = "maximizeVideoViews";
  private RecommendationServiceMaximizeVideoViews maximizeVideoViews;

  public static final String JSON_PROPERTY_UPDATE_AD_CREATIVE = "updateAdCreative";
  private RecommendationServiceUpdateAdCreative updateAdCreative;

  public static final String JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS = "duplicateTargetingSettings";
  private RecommendationServiceDuplicateTargetingSettings duplicateTargetingSettings;

  public static final String JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE = "notOptimalAdCountCombinedAdTypeAndImageSize";
  private RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize notOptimalAdCountCombinedAdTypeAndImageSize;

  public static final String JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS = "adGroupsForAddingAds";
  private RecommendationServiceAdGroupsForAddingAds adGroupsForAddingAds;

  public static final String JSON_PROPERTY_DAILY_BUDGET_SMALL = "dailyBudgetSmall";
  private RecommendationServiceDailyBudgetSmall dailyBudgetSmall;

  public static final String JSON_PROPERTY_INSUFFICIENT_TARGETING = "insufficientTargeting";
  private RecommendationServiceInsufficientTargeting insufficientTargeting;

  public static final String JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING = "insufficientAdScheduleTargeting";
  private RecommendationServiceInsufficientAdScheduleTargeting insufficientAdScheduleTargeting;

  public static final String JSON_PROPERTY_INSUFFICIENT_CONVERSIONS = "insufficientConversions";
  private RecommendationServiceInsufficientConversions insufficientConversions;

  public static final String JSON_PROPERTY_INSUFFICIENT_CLICKS = "insufficientClicks";
  private RecommendationServiceInsufficientClicks insufficientClicks;

  public static final String JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS = "insufficientVideoViews";
  private RecommendationServiceInsufficientVideoViews insufficientVideoViews;

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
  @jakarta.annotation.Nullable
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


  public Recommendation optimizationScoreLift(Double optimizationScoreLift) {
    
    this.optimizationScoreLift = optimizationScoreLift;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 最適化スコアの上昇推測値です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Estimated optimization score increase&lt;br&gt; &lt;/div&gt; 
   * @return optimizationScoreLift
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE_LIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOptimizationScoreLift() {
    return optimizationScoreLift;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE_LIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimizationScoreLift(Double optimizationScoreLift) {
    this.optimizationScoreLift = optimizationScoreLift;
  }


  public Recommendation campaignBiddingStrategyToTargetCpa(RecommendationServiceCampaignBiddingStrategyToTargetCpa campaignBiddingStrategyToTargetCpa) {
    
    this.campaignBiddingStrategyToTargetCpa = campaignBiddingStrategyToTargetCpa;
    return this;
  }

   /**
   * Get campaignBiddingStrategyToTargetCpa
   * @return campaignBiddingStrategyToTargetCpa
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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


  public Recommendation maximizeConversions(RecommendationServiceMaximizeConversions maximizeConversions) {
    
    this.maximizeConversions = maximizeConversions;
    return this;
  }

   /**
   * Get maximizeConversions
   * @return maximizeConversions
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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


  public Recommendation updateAdCreative(RecommendationServiceUpdateAdCreative updateAdCreative) {
    
    this.updateAdCreative = updateAdCreative;
    return this;
  }

   /**
   * Get updateAdCreative
   * @return updateAdCreative
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_AD_CREATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceUpdateAdCreative getUpdateAdCreative() {
    return updateAdCreative;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_AD_CREATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateAdCreative(RecommendationServiceUpdateAdCreative updateAdCreative) {
    this.updateAdCreative = updateAdCreative;
  }


  public Recommendation duplicateTargetingSettings(RecommendationServiceDuplicateTargetingSettings duplicateTargetingSettings) {
    
    this.duplicateTargetingSettings = duplicateTargetingSettings;
    return this;
  }

   /**
   * Get duplicateTargetingSettings
   * @return duplicateTargetingSettings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceDuplicateTargetingSettings getDuplicateTargetingSettings() {
    return duplicateTargetingSettings;
  }


  @JsonProperty(JSON_PROPERTY_DUPLICATE_TARGETING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuplicateTargetingSettings(RecommendationServiceDuplicateTargetingSettings duplicateTargetingSettings) {
    this.duplicateTargetingSettings = duplicateTargetingSettings;
  }


  public Recommendation notOptimalAdCountCombinedAdTypeAndImageSize(RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize notOptimalAdCountCombinedAdTypeAndImageSize) {
    
    this.notOptimalAdCountCombinedAdTypeAndImageSize = notOptimalAdCountCombinedAdTypeAndImageSize;
    return this;
  }

   /**
   * Get notOptimalAdCountCombinedAdTypeAndImageSize
   * @return notOptimalAdCountCombinedAdTypeAndImageSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize getNotOptimalAdCountCombinedAdTypeAndImageSize() {
    return notOptimalAdCountCombinedAdTypeAndImageSize;
  }


  @JsonProperty(JSON_PROPERTY_NOT_OPTIMAL_AD_COUNT_COMBINED_AD_TYPE_AND_IMAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotOptimalAdCountCombinedAdTypeAndImageSize(RecommendationServiceNotOptimalAdCountCombinedAdTypeAndImageSize notOptimalAdCountCombinedAdTypeAndImageSize) {
    this.notOptimalAdCountCombinedAdTypeAndImageSize = notOptimalAdCountCombinedAdTypeAndImageSize;
  }


  public Recommendation adGroupsForAddingAds(RecommendationServiceAdGroupsForAddingAds adGroupsForAddingAds) {
    
    this.adGroupsForAddingAds = adGroupsForAddingAds;
    return this;
  }

   /**
   * Get adGroupsForAddingAds
   * @return adGroupsForAddingAds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceAdGroupsForAddingAds getAdGroupsForAddingAds() {
    return adGroupsForAddingAds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUPS_FOR_ADDING_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupsForAddingAds(RecommendationServiceAdGroupsForAddingAds adGroupsForAddingAds) {
    this.adGroupsForAddingAds = adGroupsForAddingAds;
  }


  public Recommendation dailyBudgetSmall(RecommendationServiceDailyBudgetSmall dailyBudgetSmall) {
    
    this.dailyBudgetSmall = dailyBudgetSmall;
    return this;
  }

   /**
   * Get dailyBudgetSmall
   * @return dailyBudgetSmall
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceDailyBudgetSmall getDailyBudgetSmall() {
    return dailyBudgetSmall;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyBudgetSmall(RecommendationServiceDailyBudgetSmall dailyBudgetSmall) {
    this.dailyBudgetSmall = dailyBudgetSmall;
  }


  public Recommendation insufficientTargeting(RecommendationServiceInsufficientTargeting insufficientTargeting) {
    
    this.insufficientTargeting = insufficientTargeting;
    return this;
  }

   /**
   * Get insufficientTargeting
   * @return insufficientTargeting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceInsufficientTargeting getInsufficientTargeting() {
    return insufficientTargeting;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientTargeting(RecommendationServiceInsufficientTargeting insufficientTargeting) {
    this.insufficientTargeting = insufficientTargeting;
  }


  public Recommendation insufficientAdScheduleTargeting(RecommendationServiceInsufficientAdScheduleTargeting insufficientAdScheduleTargeting) {
    
    this.insufficientAdScheduleTargeting = insufficientAdScheduleTargeting;
    return this;
  }

   /**
   * Get insufficientAdScheduleTargeting
   * @return insufficientAdScheduleTargeting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceInsufficientAdScheduleTargeting getInsufficientAdScheduleTargeting() {
    return insufficientAdScheduleTargeting;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_AD_SCHEDULE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientAdScheduleTargeting(RecommendationServiceInsufficientAdScheduleTargeting insufficientAdScheduleTargeting) {
    this.insufficientAdScheduleTargeting = insufficientAdScheduleTargeting;
  }


  public Recommendation insufficientConversions(RecommendationServiceInsufficientConversions insufficientConversions) {
    
    this.insufficientConversions = insufficientConversions;
    return this;
  }

   /**
   * Get insufficientConversions
   * @return insufficientConversions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceInsufficientConversions getInsufficientConversions() {
    return insufficientConversions;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientConversions(RecommendationServiceInsufficientConversions insufficientConversions) {
    this.insufficientConversions = insufficientConversions;
  }


  public Recommendation insufficientClicks(RecommendationServiceInsufficientClicks insufficientClicks) {
    
    this.insufficientClicks = insufficientClicks;
    return this;
  }

   /**
   * Get insufficientClicks
   * @return insufficientClicks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceInsufficientClicks getInsufficientClicks() {
    return insufficientClicks;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientClicks(RecommendationServiceInsufficientClicks insufficientClicks) {
    this.insufficientClicks = insufficientClicks;
  }


  public Recommendation insufficientVideoViews(RecommendationServiceInsufficientVideoViews insufficientVideoViews) {
    
    this.insufficientVideoViews = insufficientVideoViews;
    return this;
  }

   /**
   * Get insufficientVideoViews
   * @return insufficientVideoViews
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecommendationServiceInsufficientVideoViews getInsufficientVideoViews() {
    return insufficientVideoViews;
  }


  @JsonProperty(JSON_PROPERTY_INSUFFICIENT_VIDEO_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsufficientVideoViews(RecommendationServiceInsufficientVideoViews insufficientVideoViews) {
    this.insufficientVideoViews = insufficientVideoViews;
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
        Objects.equals(this.optimizationScoreLift, recommendation.optimizationScoreLift) &&
        Objects.equals(this.campaignBiddingStrategyToTargetCpa, recommendation.campaignBiddingStrategyToTargetCpa) &&
        Objects.equals(this.dailyBudgetOver, recommendation.dailyBudgetOver) &&
        Objects.equals(this.impsShareBudgetLossOver, recommendation.impsShareBudgetLossOver) &&
        Objects.equals(this.searchKeywordIdea, recommendation.searchKeywordIdea) &&
        Objects.equals(this.maximizeConversions, recommendation.maximizeConversions) &&
        Objects.equals(this.maximizeClicks, recommendation.maximizeClicks) &&
        Objects.equals(this.maximizeVideoViews, recommendation.maximizeVideoViews) &&
        Objects.equals(this.updateAdCreative, recommendation.updateAdCreative) &&
        Objects.equals(this.duplicateTargetingSettings, recommendation.duplicateTargetingSettings) &&
        Objects.equals(this.notOptimalAdCountCombinedAdTypeAndImageSize, recommendation.notOptimalAdCountCombinedAdTypeAndImageSize) &&
        Objects.equals(this.adGroupsForAddingAds, recommendation.adGroupsForAddingAds) &&
        Objects.equals(this.dailyBudgetSmall, recommendation.dailyBudgetSmall) &&
        Objects.equals(this.insufficientTargeting, recommendation.insufficientTargeting) &&
        Objects.equals(this.insufficientAdScheduleTargeting, recommendation.insufficientAdScheduleTargeting) &&
        Objects.equals(this.insufficientConversions, recommendation.insufficientConversions) &&
        Objects.equals(this.insufficientClicks, recommendation.insufficientClicks) &&
        Objects.equals(this.insufficientVideoViews, recommendation.insufficientVideoViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, optimizationScoreLift, campaignBiddingStrategyToTargetCpa, dailyBudgetOver, impsShareBudgetLossOver, searchKeywordIdea, maximizeConversions, maximizeClicks, maximizeVideoViews, updateAdCreative, duplicateTargetingSettings, notOptimalAdCountCombinedAdTypeAndImageSize, adGroupsForAddingAds, dailyBudgetSmall, insufficientTargeting, insufficientAdScheduleTargeting, insufficientConversions, insufficientClicks, insufficientVideoViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    optimizationScoreLift: ").append(toIndentedString(optimizationScoreLift)).append("\n");
    sb.append("    campaignBiddingStrategyToTargetCpa: ").append(toIndentedString(campaignBiddingStrategyToTargetCpa)).append("\n");
    sb.append("    dailyBudgetOver: ").append(toIndentedString(dailyBudgetOver)).append("\n");
    sb.append("    impsShareBudgetLossOver: ").append(toIndentedString(impsShareBudgetLossOver)).append("\n");
    sb.append("    searchKeywordIdea: ").append(toIndentedString(searchKeywordIdea)).append("\n");
    sb.append("    maximizeConversions: ").append(toIndentedString(maximizeConversions)).append("\n");
    sb.append("    maximizeClicks: ").append(toIndentedString(maximizeClicks)).append("\n");
    sb.append("    maximizeVideoViews: ").append(toIndentedString(maximizeVideoViews)).append("\n");
    sb.append("    updateAdCreative: ").append(toIndentedString(updateAdCreative)).append("\n");
    sb.append("    duplicateTargetingSettings: ").append(toIndentedString(duplicateTargetingSettings)).append("\n");
    sb.append("    notOptimalAdCountCombinedAdTypeAndImageSize: ").append(toIndentedString(notOptimalAdCountCombinedAdTypeAndImageSize)).append("\n");
    sb.append("    adGroupsForAddingAds: ").append(toIndentedString(adGroupsForAddingAds)).append("\n");
    sb.append("    dailyBudgetSmall: ").append(toIndentedString(dailyBudgetSmall)).append("\n");
    sb.append("    insufficientTargeting: ").append(toIndentedString(insufficientTargeting)).append("\n");
    sb.append("    insufficientAdScheduleTargeting: ").append(toIndentedString(insufficientAdScheduleTargeting)).append("\n");
    sb.append("    insufficientConversions: ").append(toIndentedString(insufficientConversions)).append("\n");
    sb.append("    insufficientClicks: ").append(toIndentedString(insufficientClicks)).append("\n");
    sb.append("    insufficientVideoViews: ").append(toIndentedString(insufficientVideoViews)).append("\n");
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

