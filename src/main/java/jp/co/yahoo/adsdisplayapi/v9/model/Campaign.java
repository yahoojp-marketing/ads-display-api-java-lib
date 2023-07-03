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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceBiddingStrategyConfiguration;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceBudget;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceConversionTracker;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceLabel;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceServingStatus;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceUserStatus;
import jp.co.yahoo.adsdisplayapi.v9.model.CampaignServiceViewableFrequencyCap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Campaignオブジェクトは、キャンペーン情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign object describes campaign information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  Campaign.JSON_PROPERTY_ACCOUNT_ID,
  Campaign.JSON_PROPERTY_APP_ID,
  Campaign.JSON_PROPERTY_APP_NAME,
  Campaign.JSON_PROPERTY_BUDGET,
  Campaign.JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION,
  Campaign.JSON_PROPERTY_CAMPAIGN_GOAL,
  Campaign.JSON_PROPERTY_CAMPAIGN_ID,
  Campaign.JSON_PROPERTY_CAMPAIGN_NAME,
  Campaign.JSON_PROPERTY_CONVERSION_OPTIMIZER,
  Campaign.JSON_PROPERTY_CUSTOM_PARAMETERS,
  Campaign.JSON_PROPERTY_DEVICE_OS_TYPE,
  Campaign.JSON_PROPERTY_END_DATE,
  Campaign.JSON_PROPERTY_END_TIME,
  Campaign.JSON_PROPERTY_FEED_ID,
  Campaign.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  Campaign.JSON_PROPERTY_LABELS,
  Campaign.JSON_PROPERTY_OPTIMIZATION_SCORE,
  Campaign.JSON_PROPERTY_SERVING_STATUS,
  Campaign.JSON_PROPERTY_START_DATE,
  Campaign.JSON_PROPERTY_START_TIME,
  Campaign.JSON_PROPERTY_TRACKING_URL,
  Campaign.JSON_PROPERTY_USER_STATUS,
  Campaign.JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP,
  Campaign.JSON_PROPERTY_CAMPAIGN_DELIVERY_TYPE,
  Campaign.JSON_PROPERTY_CREATED_DATE,
  Campaign.JSON_PROPERTY_VENDOR_NAME,
  Campaign.JSON_PROPERTY_CONVERSION_TRACKER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Campaign {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_NAME = "appName";
  private String appName;

  public static final String JSON_PROPERTY_BUDGET = "budget";
  private CampaignServiceBudget budget;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION = "biddingStrategyConfiguration";
  private CampaignServiceBiddingStrategyConfiguration biddingStrategyConfiguration;

  public static final String JSON_PROPERTY_CAMPAIGN_GOAL = "campaignGoal";
  private String campaignGoal;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CONVERSION_OPTIMIZER = "conversionOptimizer";
  private CampaignServiceConversionOptimizer conversionOptimizer;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private CampaignServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DEVICE_OS_TYPE = "deviceOsType";
  private CampaignServiceDeviceOsType deviceOsType;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private CampaignServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<CampaignServiceLabel> labels;

  public static final String JSON_PROPERTY_OPTIMIZATION_SCORE = "optimizationScore";
  private Double optimizationScore;

  public static final String JSON_PROPERTY_SERVING_STATUS = "servingStatus";
  private CampaignServiceServingStatus servingStatus;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private CampaignServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP = "viewableFrequencyCap";
  private CampaignServiceViewableFrequencyCap viewableFrequencyCap;

  public static final String JSON_PROPERTY_CAMPAIGN_DELIVERY_TYPE = "campaignDeliveryType";
  private String campaignDeliveryType;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_VENDOR_NAME = "vendorName";
  private String vendorName;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER = "conversionTracker";
  private CampaignServiceConversionTracker conversionTracker;

  public Campaign() {
  }

  public Campaign accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID. &lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public Campaign appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; iOS:アプリIDです。&lt;br&gt; Android:パッケージ名です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。&lt;br&gt; ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; iOS: APP ID.&lt;br&gt; Android: Package name. &lt;br&gt; This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.&lt;br&gt; *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. &lt;/div&gt; 
   * @return appId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }


  public Campaign appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アプリの名称です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。&lt;br&gt; ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; App Name. &lt;br&gt; This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.&lt;br&gt; *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. &lt;/div&gt; 
   * @return appName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppName() {
    return appName;
  }


  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppName(String appName) {
    this.appName = appName;
  }


  public Campaign budget(CampaignServiceBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBudget getBudget() {
    return budget;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudget(CampaignServiceBudget budget) {
    this.budget = budget;
  }


  public Campaign biddingStrategyConfiguration(CampaignServiceBiddingStrategyConfiguration biddingStrategyConfiguration) {
    
    this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    return this;
  }

   /**
   * Get biddingStrategyConfiguration
   * @return biddingStrategyConfiguration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBiddingStrategyConfiguration getBiddingStrategyConfiguration() {
    return biddingStrategyConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyConfiguration(CampaignServiceBiddingStrategyConfiguration biddingStrategyConfiguration) {
    this.biddingStrategyConfiguration = biddingStrategyConfiguration;
  }


  public Campaign campaignGoal(String campaignGoal) {
    
    this.campaignGoal = campaignGoal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン目的です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;br&gt; SETおよびREMOVE時、このフィールドは無視されます。&lt;br&gt; ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign goal.&lt;br&gt; In ADD operation, this field is required.&lt;br&gt; In SET and REMOVE operation, this field will be ignored.&lt;br&gt; * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.&lt;br&gt; &lt;/div&gt; 
   * @return campaignGoal
  **/
  @jakarta.annotation.Nullable
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


  public Campaign campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドはSETおよびREMOVE時に必須となり、ADD時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation. &lt;/div&gt; 
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


  public Campaign campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign Name.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
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


  public Campaign conversionOptimizer(CampaignServiceConversionOptimizer conversionOptimizer) {
    
    this.conversionOptimizer = conversionOptimizer;
    return this;
  }

   /**
   * Get conversionOptimizer
   * @return conversionOptimizer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_OPTIMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceConversionOptimizer getConversionOptimizer() {
    return conversionOptimizer;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_OPTIMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionOptimizer(CampaignServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
  }


  public Campaign customParameters(CampaignServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(CampaignServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public Campaign deviceOsType(CampaignServiceDeviceOsType deviceOsType) {
    
    this.deviceOsType = deviceOsType;
    return this;
  }

   /**
   * Get deviceOsType
   * @return deviceOsType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_OS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceDeviceOsType getDeviceOsType() {
    return deviceOsType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_OS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceOsType(CampaignServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
  }


  public Campaign endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了日です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※endTimeが指定されている場合、ADDおよびSET時に必須となります。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If endTime is specified, This field is required in ADD and SET operation.&lt;br&gt; *format: yyyyMMdd &lt;/div&gt; 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
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


  public Campaign endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了時刻です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※フォーマット：HHmm &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End time.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; * Format: HHmm &lt;/div&gt; 
   * @return endTime
  **/
  @jakarta.annotation.Nullable
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


  public Campaign feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; フィードIDです。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。&lt;br&gt; ※campaignGoalが「ITEM_LIST」の場合、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Feed ID.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. &lt;br&gt; *If campaignGoal is ITEM_LIST, this field is required in ADD operation. &lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public Campaign isRemoveTrackingUrl(CampaignServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(CampaignServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public Campaign labels(List<CampaignServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Campaign addLabelsItem(CampaignServiceLabel labelsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<CampaignServiceLabel> labels) {
    this.labels = labels;
  }


  public Campaign optimizationScore(Double optimizationScore) {
    
    this.optimizationScore = optimizationScore;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最適化スコアです。&lt;br&gt; 最適化スコアは、0.0から1.0の範囲の値を返却します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Optimization score.&lt;br&gt; Optimization score returns a value ranging from 0.0 to 1.0.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return optimizationScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOptimizationScore() {
    return optimizationScore;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimizationScore(Double optimizationScore) {
    this.optimizationScore = optimizationScore;
  }


  public Campaign servingStatus(CampaignServiceServingStatus servingStatus) {
    
    this.servingStatus = servingStatus;
    return this;
  }

   /**
   * Get servingStatus
   * @return servingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceServingStatus getServingStatus() {
    return servingStatus;
  }


  @JsonProperty(JSON_PROPERTY_SERVING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServingStatus(CampaignServiceServingStatus servingStatus) {
    this.servingStatus = servingStatus;
  }


  public Campaign startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始日です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※startTimeが指定されている場合、ADDおよびSET時に必須となります。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If startTime is specified, This field is required in ADD and SET operation.&lt;br&gt; *format: yyyyMMdd &lt;/div&gt; 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
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


  public Campaign startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始時刻です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※フォーマット：HHmm &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start time.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; * Format: HHmm &lt;/div&gt; 
   * @return startTime
  **/
  @jakarta.annotation.Nullable
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


  public Campaign trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時およびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時、こちらが審査中の場合、編集はできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *In SET operation, cannot update it when this field is in editorial review.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingUrl() {
    return trackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  public Campaign userStatus(CampaignServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(CampaignServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public Campaign viewableFrequencyCap(CampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    
    this.viewableFrequencyCap = viewableFrequencyCap;
    return this;
  }

   /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceViewableFrequencyCap getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableFrequencyCap(CampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }


  public Campaign campaignDeliveryType(String campaignDeliveryType) {
    
    this.campaignDeliveryType = campaignDeliveryType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン掲載タイプです。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; CampaignDeliveryTypeを指定してのキャンペーン作成は、一部の利用者向けの機能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign delivery type.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; Creating a campaign with the CampaignDeliveryType specified is a function for some users. &lt;/div&gt; 
   * @return campaignDeliveryType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DELIVERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignDeliveryType() {
    return campaignDeliveryType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_DELIVERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignDeliveryType(String campaignDeliveryType) {
    this.campaignDeliveryType = campaignDeliveryType;
  }


  public Campaign createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンが作成された日時です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Campaign made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public Campaign vendorName(String vendorName) {
    
    this.vendorName = vendorName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンの広告効果測定ツールのベンダー名です。キャンペーン目的「アプリ訴求」の場合にのみ設定されます。&lt;br&gt; このフィールドはキャンペーン作成後、最初にリンク先URLを設定した広告が作成された時に設定されます。&lt;br&gt; キャンペーンに紐づく広告のリンク先URLには、このベンダー名に対応する広告効果測定ツールのURLのみが指定できます。&lt;br&gt; ADD時およびSET時、&lt;code&gt;APPSFLYER&lt;/code&gt;, &lt;code&gt;ADJUST&lt;/code&gt;, &lt;code&gt;SINGULAR&lt;/code&gt;, &lt;code&gt;KOCHAVA&lt;/code&gt;, &lt;code&gt;BRANCH&lt;/code&gt; および &lt;code&gt;NONE&lt;/code&gt; のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Vendor name of tracking tool for the campaign. It will be set only when the campaign goal is \&quot;app promotion\&quot;. &lt;br&gt; This field will be set when the first ad with destination URL is created after creating the campaign.&lt;br&gt; Only the tracking tool URL corresponds to this tool vendor name can be specified for the destination URL of the ad linked to the campaign.&lt;br&gt; Only &lt;code&gt;APPSFLYER&lt;/code&gt;, &lt;code&gt;ADJUST&lt;/code&gt;, &lt;code&gt;SINGULAR&lt;/code&gt;, &lt;code&gt;KOCHAVA&lt;/code&gt;, &lt;code&gt;BRANCH&lt;/code&gt; and &lt;code&gt;NONE&lt;/code&gt; can be specified in ADD and SET operation. &lt;/div&gt; 
   * @return vendorName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVendorName() {
    return vendorName;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public Campaign conversionTracker(CampaignServiceConversionTracker conversionTracker) {
    
    this.conversionTracker = conversionTracker;
    return this;
  }

   /**
   * Get conversionTracker
   * @return conversionTracker
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceConversionTracker getConversionTracker() {
    return conversionTracker;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTracker(CampaignServiceConversionTracker conversionTracker) {
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
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.accountId, campaign.accountId) &&
        Objects.equals(this.appId, campaign.appId) &&
        Objects.equals(this.appName, campaign.appName) &&
        Objects.equals(this.budget, campaign.budget) &&
        Objects.equals(this.biddingStrategyConfiguration, campaign.biddingStrategyConfiguration) &&
        Objects.equals(this.campaignGoal, campaign.campaignGoal) &&
        Objects.equals(this.campaignId, campaign.campaignId) &&
        Objects.equals(this.campaignName, campaign.campaignName) &&
        Objects.equals(this.conversionOptimizer, campaign.conversionOptimizer) &&
        Objects.equals(this.customParameters, campaign.customParameters) &&
        Objects.equals(this.deviceOsType, campaign.deviceOsType) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.endTime, campaign.endTime) &&
        Objects.equals(this.feedId, campaign.feedId) &&
        Objects.equals(this.isRemoveTrackingUrl, campaign.isRemoveTrackingUrl) &&
        Objects.equals(this.labels, campaign.labels) &&
        Objects.equals(this.optimizationScore, campaign.optimizationScore) &&
        Objects.equals(this.servingStatus, campaign.servingStatus) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.startTime, campaign.startTime) &&
        Objects.equals(this.trackingUrl, campaign.trackingUrl) &&
        Objects.equals(this.userStatus, campaign.userStatus) &&
        Objects.equals(this.viewableFrequencyCap, campaign.viewableFrequencyCap) &&
        Objects.equals(this.campaignDeliveryType, campaign.campaignDeliveryType) &&
        Objects.equals(this.createdDate, campaign.createdDate) &&
        Objects.equals(this.vendorName, campaign.vendorName) &&
        Objects.equals(this.conversionTracker, campaign.conversionTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appId, appName, budget, biddingStrategyConfiguration, campaignGoal, campaignId, campaignName, conversionOptimizer, customParameters, deviceOsType, endDate, endTime, feedId, isRemoveTrackingUrl, labels, optimizationScore, servingStatus, startDate, startTime, trackingUrl, userStatus, viewableFrequencyCap, campaignDeliveryType, createdDate, vendorName, conversionTracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    biddingStrategyConfiguration: ").append(toIndentedString(biddingStrategyConfiguration)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    conversionOptimizer: ").append(toIndentedString(conversionOptimizer)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    optimizationScore: ").append(toIndentedString(optimizationScore)).append("\n");
    sb.append("    servingStatus: ").append(toIndentedString(servingStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    campaignDeliveryType: ").append(toIndentedString(campaignDeliveryType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

