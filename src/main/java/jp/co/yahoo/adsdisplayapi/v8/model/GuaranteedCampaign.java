/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceAdCategoryStatus;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceBrandTracking;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceCampaignBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceConversionTracker;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceLabel;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceLifetimeBudget;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServicePackage;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceServingStatus;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceUserStatus;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedCampaignServiceViewableFrequencyCap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedCampaignオブジェクトは、予約型のキャンペーン情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedCampaign object describes guaranteed campaign information. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedCampaignオブジェクトは、予約型のキャンペーン情報を表します。</div> <div lang=\"en\">GuaranteedCampaign object describes guaranteed campaign information. </div> ")
@JsonPropertyOrder({
  GuaranteedCampaign.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedCampaign.JSON_PROPERTY_LIFETIME_BUDGET,
  GuaranteedCampaign.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY,
  GuaranteedCampaign.JSON_PROPERTY_CAMPAIGN_GOAL,
  GuaranteedCampaign.JSON_PROPERTY_CAMPAIGN_ID,
  GuaranteedCampaign.JSON_PROPERTY_CAMPAIGN_NAME,
  GuaranteedCampaign.JSON_PROPERTY_END_DATE,
  GuaranteedCampaign.JSON_PROPERTY_END_TIME,
  GuaranteedCampaign.JSON_PROPERTY_LABELS,
  GuaranteedCampaign.JSON_PROPERTY_SERVING_STATUS,
  GuaranteedCampaign.JSON_PROPERTY_START_DATE,
  GuaranteedCampaign.JSON_PROPERTY_START_TIME,
  GuaranteedCampaign.JSON_PROPERTY_USER_STATUS,
  GuaranteedCampaign.JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP,
  GuaranteedCampaign.JSON_PROPERTY_GUARANTEED_SIMULATION_ID,
  GuaranteedCampaign.JSON_PROPERTY_NOTIFICATION_EMAIL_ADDRESS,
  GuaranteedCampaign.JSON_PROPERTY_AD_CATEGORY_STATUS,
  GuaranteedCampaign.JSON_PROPERTY_CAMPAIGN_CANCELED_DATE,
  GuaranteedCampaign.JSON_PROPERTY_PACKAGE,
  GuaranteedCampaign.JSON_PROPERTY_BRAND_TRACKING,
  GuaranteedCampaign.JSON_PROPERTY_CONVERSION_TRACKER
})
@JsonTypeName("GuaranteedCampaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaign {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_LIFETIME_BUDGET = "lifetimeBudget";
  private GuaranteedCampaignServiceLifetimeBudget lifetimeBudget;

  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY = "campaignBiddingStrategy";
  private GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategy;

  public static final String JSON_PROPERTY_CAMPAIGN_GOAL = "campaignGoal";
  private String campaignGoal;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<GuaranteedCampaignServiceLabel> labels = null;

  public static final String JSON_PROPERTY_SERVING_STATUS = "servingStatus";
  private GuaranteedCampaignServiceServingStatus servingStatus;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private GuaranteedCampaignServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP = "viewableFrequencyCap";
  private GuaranteedCampaignServiceViewableFrequencyCap viewableFrequencyCap;

  public static final String JSON_PROPERTY_GUARANTEED_SIMULATION_ID = "guaranteedSimulationId";
  private Long guaranteedSimulationId;

  public static final String JSON_PROPERTY_NOTIFICATION_EMAIL_ADDRESS = "notificationEmailAddress";
  private List<String> notificationEmailAddress = null;

  public static final String JSON_PROPERTY_AD_CATEGORY_STATUS = "adCategoryStatus";
  private GuaranteedCampaignServiceAdCategoryStatus adCategoryStatus;

  public static final String JSON_PROPERTY_CAMPAIGN_CANCELED_DATE = "campaignCanceledDate";
  private String campaignCanceledDate;

  public static final String JSON_PROPERTY_PACKAGE = "package";
  private GuaranteedCampaignServicePackage _package;

  public static final String JSON_PROPERTY_BRAND_TRACKING = "brandTracking";
  private GuaranteedCampaignServiceBrandTracking brandTracking;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER = "conversionTracker";
  private GuaranteedCampaignServiceConversionTracker conversionTracker;

  public GuaranteedCampaign() { 
  }

  public GuaranteedCampaign accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID. &lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID. <br> This field is required in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public GuaranteedCampaign lifetimeBudget(GuaranteedCampaignServiceLifetimeBudget lifetimeBudget) {
    
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

   /**
   * Get lifetimeBudget
   * @return lifetimeBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceLifetimeBudget getLifetimeBudget() {
    return lifetimeBudget;
  }


  @JsonProperty(JSON_PROPERTY_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetimeBudget(GuaranteedCampaignServiceLifetimeBudget lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }


  public GuaranteedCampaign campaignBiddingStrategy(GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    
    this.campaignBiddingStrategy = campaignBiddingStrategy;
    return this;
  }

   /**
   * Get campaignBiddingStrategy
   * @return campaignBiddingStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceCampaignBiddingStrategy getCampaignBiddingStrategy() {
    return campaignBiddingStrategy;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategy(GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    this.campaignBiddingStrategy = campaignBiddingStrategy;
  }


  public GuaranteedCampaign campaignGoal(String campaignGoal) {
    
    this.campaignGoal = campaignGoal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン目的です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign goal.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return campaignGoal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign goal.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignGoal() {
    return campaignGoal;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
  }


  public GuaranteedCampaign campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドはSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSET時に必須となります。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET operation. </div> ")
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


  public GuaranteedCampaign campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign Name. &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。 </div> <div lang=\"en\"> Campaign Name. </div> ")
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


  public GuaranteedCampaign endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date.&lt;br&gt; ∗ Format: yyyyMMdd&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public GuaranteedCampaign endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了時刻です。&lt;br&gt; ※フォーマット：HHmm&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End time.&lt;br&gt; * Format: HHmm&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了時刻です。<br> ※フォーマット：HHmm<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End time.<br> * Format: HHmm<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public GuaranteedCampaign labels(List<GuaranteedCampaignServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public GuaranteedCampaign addLabelsItem(GuaranteedCampaignServiceLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedCampaignServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<GuaranteedCampaignServiceLabel> labels) {
    this.labels = labels;
  }


  public GuaranteedCampaign servingStatus(GuaranteedCampaignServiceServingStatus servingStatus) {
    
    this.servingStatus = servingStatus;
    return this;
  }

   /**
   * Get servingStatus
   * @return servingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceServingStatus getServingStatus() {
    return servingStatus;
  }


  @JsonProperty(JSON_PROPERTY_SERVING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServingStatus(GuaranteedCampaignServiceServingStatus servingStatus) {
    this.servingStatus = servingStatus;
  }


  public GuaranteedCampaign startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date.&lt;br&gt; ∗ Format: yyyyMMdd&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public GuaranteedCampaign startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始時刻です。&lt;br&gt; ※フォーマット：HHmm&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start time.&lt;br&gt; * Format: HHmm&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始時刻です。<br> ※フォーマット：HHmm<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start time.<br> * Format: HHmm<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public GuaranteedCampaign userStatus(GuaranteedCampaignServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(GuaranteedCampaignServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public GuaranteedCampaign viewableFrequencyCap(GuaranteedCampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    
    this.viewableFrequencyCap = viewableFrequencyCap;
    return this;
  }

   /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceViewableFrequencyCap getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableFrequencyCap(GuaranteedCampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }


  public GuaranteedCampaign guaranteedSimulationId(Long guaranteedSimulationId) {
    
    this.guaranteedSimulationId = guaranteedSimulationId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; シミュレーションIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Simulation ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return guaranteedSimulationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Simulation ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_GUARANTEED_SIMULATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGuaranteedSimulationId() {
    return guaranteedSimulationId;
  }


  @JsonProperty(JSON_PROPERTY_GUARANTEED_SIMULATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
  }


  public GuaranteedCampaign notificationEmailAddress(List<String> notificationEmailAddress) {
    
    this.notificationEmailAddress = notificationEmailAddress;
    return this;
  }

  public GuaranteedCampaign addNotificationEmailAddressItem(String notificationEmailAddressItem) {
    if (this.notificationEmailAddress == null) {
      this.notificationEmailAddress = new ArrayList<>();
    }
    this.notificationEmailAddress.add(notificationEmailAddressItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 連絡先メールアドレスです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Email address to send notifications.&lt;br&gt; &lt;/div&gt; 
   * @return notificationEmailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 連絡先メールアドレスです。<br> </div> <div lang=\"en\"> Email address to send notifications.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNotificationEmailAddress() {
    return notificationEmailAddress;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationEmailAddress(List<String> notificationEmailAddress) {
    this.notificationEmailAddress = notificationEmailAddress;
  }


  public GuaranteedCampaign adCategoryStatus(GuaranteedCampaignServiceAdCategoryStatus adCategoryStatus) {
    
    this.adCategoryStatus = adCategoryStatus;
    return this;
  }

   /**
   * Get adCategoryStatus
   * @return adCategoryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_CATEGORY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceAdCategoryStatus getAdCategoryStatus() {
    return adCategoryStatus;
  }


  @JsonProperty(JSON_PROPERTY_AD_CATEGORY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdCategoryStatus(GuaranteedCampaignServiceAdCategoryStatus adCategoryStatus) {
    this.adCategoryStatus = adCategoryStatus;
  }


  public GuaranteedCampaign campaignCanceledDate(String campaignCanceledDate) {
    
    this.campaignCanceledDate = campaignCanceledDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 予約型のキャンペーンをキャンセルした日時です。&lt;br&gt; ※フォーマット：yyyyMMddHHmmss&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; A date and time which the guaranteed campaign is cancelled.&lt;br&gt; ∗ Format: yyyyMMddHHmmss&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return campaignCanceledDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約型のキャンペーンをキャンセルした日時です。<br> ※フォーマット：yyyyMMddHHmmss<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> A date and time which the guaranteed campaign is cancelled.<br> ∗ Format: yyyyMMddHHmmss<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_CANCELED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignCanceledDate() {
    return campaignCanceledDate;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_CANCELED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignCanceledDate(String campaignCanceledDate) {
    this.campaignCanceledDate = campaignCanceledDate;
  }


  public GuaranteedCampaign _package(GuaranteedCampaignServicePackage _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServicePackage getPackage() {
    return _package;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackage(GuaranteedCampaignServicePackage _package) {
    this._package = _package;
  }


  public GuaranteedCampaign brandTracking(GuaranteedCampaignServiceBrandTracking brandTracking) {
    
    this.brandTracking = brandTracking;
    return this;
  }

   /**
   * Get brandTracking
   * @return brandTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceBrandTracking getBrandTracking() {
    return brandTracking;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_TRACKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandTracking(GuaranteedCampaignServiceBrandTracking brandTracking) {
    this.brandTracking = brandTracking;
  }


  public GuaranteedCampaign conversionTracker(GuaranteedCampaignServiceConversionTracker conversionTracker) {
    
    this.conversionTracker = conversionTracker;
    return this;
  }

   /**
   * Get conversionTracker
   * @return conversionTracker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceConversionTracker getConversionTracker() {
    return conversionTracker;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTracker(GuaranteedCampaignServiceConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaign guaranteedCampaign = (GuaranteedCampaign) o;
    return Objects.equals(this.accountId, guaranteedCampaign.accountId) &&
        Objects.equals(this.lifetimeBudget, guaranteedCampaign.lifetimeBudget) &&
        Objects.equals(this.campaignBiddingStrategy, guaranteedCampaign.campaignBiddingStrategy) &&
        Objects.equals(this.campaignGoal, guaranteedCampaign.campaignGoal) &&
        Objects.equals(this.campaignId, guaranteedCampaign.campaignId) &&
        Objects.equals(this.campaignName, guaranteedCampaign.campaignName) &&
        Objects.equals(this.endDate, guaranteedCampaign.endDate) &&
        Objects.equals(this.endTime, guaranteedCampaign.endTime) &&
        Objects.equals(this.labels, guaranteedCampaign.labels) &&
        Objects.equals(this.servingStatus, guaranteedCampaign.servingStatus) &&
        Objects.equals(this.startDate, guaranteedCampaign.startDate) &&
        Objects.equals(this.startTime, guaranteedCampaign.startTime) &&
        Objects.equals(this.userStatus, guaranteedCampaign.userStatus) &&
        Objects.equals(this.viewableFrequencyCap, guaranteedCampaign.viewableFrequencyCap) &&
        Objects.equals(this.guaranteedSimulationId, guaranteedCampaign.guaranteedSimulationId) &&
        Objects.equals(this.notificationEmailAddress, guaranteedCampaign.notificationEmailAddress) &&
        Objects.equals(this.adCategoryStatus, guaranteedCampaign.adCategoryStatus) &&
        Objects.equals(this.campaignCanceledDate, guaranteedCampaign.campaignCanceledDate) &&
        Objects.equals(this._package, guaranteedCampaign._package) &&
        Objects.equals(this.brandTracking, guaranteedCampaign.brandTracking) &&
        Objects.equals(this.conversionTracker, guaranteedCampaign.conversionTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lifetimeBudget, campaignBiddingStrategy, campaignGoal, campaignId, campaignName, endDate, endTime, labels, servingStatus, startDate, startTime, userStatus, viewableFrequencyCap, guaranteedSimulationId, notificationEmailAddress, adCategoryStatus, campaignCanceledDate, _package, brandTracking, conversionTracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaign {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    campaignBiddingStrategy: ").append(toIndentedString(campaignBiddingStrategy)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    servingStatus: ").append(toIndentedString(servingStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    guaranteedSimulationId: ").append(toIndentedString(guaranteedSimulationId)).append("\n");
    sb.append("    notificationEmailAddress: ").append(toIndentedString(notificationEmailAddress)).append("\n");
    sb.append("    adCategoryStatus: ").append(toIndentedString(adCategoryStatus)).append("\n");
    sb.append("    campaignCanceledDate: ").append(toIndentedString(campaignCanceledDate)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    brandTracking: ").append(toIndentedString(brandTracking)).append("\n");
    sb.append("    conversionTracker: ").append(toIndentedString(conversionTracker)).append("\n");
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

