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
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceCountingType;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceIsPreviousConversion;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceType;
import jp.co.yahoo.adsdisplayapi.v8.model.ConversionTrackerServiceWebConversion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker settings such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker settings such as ConversionTag and performance data by tag.</div> ")
@JsonPropertyOrder({
  ConversionTracker.JSON_PROPERTY_ACCOUNT_ID,
  ConversionTracker.JSON_PROPERTY_ALL_CONVERSION_VALUE,
  ConversionTracker.JSON_PROPERTY_ALL_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_VIEW_THROUGH_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_APP_CONVERSION,
  ConversionTracker.JSON_PROPERTY_CATEGORY,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_ID,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_NAME,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_TYPE,
  ConversionTracker.JSON_PROPERTY_CONVERSION_VALUE,
  ConversionTracker.JSON_PROPERTY_CONVERSION_VALUE_VIA_AD_CLICK,
  ConversionTracker.JSON_PROPERTY_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_CONVERSIONS_VIA_AD_CLICK,
  ConversionTracker.JSON_PROPERTY_COUNTING_TYPE,
  ConversionTracker.JSON_PROPERTY_CROSS_DEVICE_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_EXCLUDE_FROM_BIDDING,
  ConversionTracker.JSON_PROPERTY_MEASUREMENT_PERIOD,
  ConversionTracker.JSON_PROPERTY_MEASUREMENT_PERIOD_VIEW,
  ConversionTracker.JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE,
  ConversionTracker.JSON_PROPERTY_STATUS,
  ConversionTracker.JSON_PROPERTY_USER_REVENUE_VALUE,
  ConversionTracker.JSON_PROPERTY_WEB_CONVERSION,
  ConversionTracker.JSON_PROPERTY_IS_PREVIOUS_CONVERSION
})
@JsonTypeName("ConversionTracker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTracker {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ALL_CONVERSION_VALUE = "allConversionValue";
  private String allConversionValue;

  public static final String JSON_PROPERTY_ALL_CONVERSIONS = "allConversions";
  private Long allConversions;

  public static final String JSON_PROPERTY_VIEW_THROUGH_CONVERSIONS = "viewThroughConversions";
  private Long viewThroughConversions;

  public static final String JSON_PROPERTY_APP_CONVERSION = "appConversion";
  private ConversionTrackerServiceAppConversion appConversion;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private ConversionTrackerServiceCategory category;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_NAME = "conversionTrackerName";
  private String conversionTrackerName;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TYPE = "conversionTrackerType";
  private ConversionTrackerServiceType conversionTrackerType;

  public static final String JSON_PROPERTY_CONVERSION_VALUE = "conversionValue";
  private String conversionValue;

  public static final String JSON_PROPERTY_CONVERSION_VALUE_VIA_AD_CLICK = "conversionValueViaAdClick";
  private String conversionValueViaAdClick;

  public static final String JSON_PROPERTY_CONVERSIONS = "conversions";
  private Long conversions;

  public static final String JSON_PROPERTY_CONVERSIONS_VIA_AD_CLICK = "conversionsViaAdClick";
  private Long conversionsViaAdClick;

  public static final String JSON_PROPERTY_COUNTING_TYPE = "countingType";
  private ConversionTrackerServiceCountingType countingType;

  public static final String JSON_PROPERTY_CROSS_DEVICE_CONVERSIONS = "crossDeviceConversions";
  private Long crossDeviceConversions;

  public static final String JSON_PROPERTY_EXCLUDE_FROM_BIDDING = "excludeFromBidding";
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding;

  public static final String JSON_PROPERTY_MEASUREMENT_PERIOD = "measurementPeriod";
  private Integer measurementPeriod;

  public static final String JSON_PROPERTY_MEASUREMENT_PERIOD_VIEW = "measurementPeriodView";
  private Integer measurementPeriodView;

  public static final String JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE = "mostRecentConversionDate";
  private String mostRecentConversionDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConversionTrackerServiceStatus status;

  public static final String JSON_PROPERTY_USER_REVENUE_VALUE = "userRevenueValue";
  private Long userRevenueValue;

  public static final String JSON_PROPERTY_WEB_CONVERSION = "webConversion";
  private ConversionTrackerServiceWebConversion webConversion;

  public static final String JSON_PROPERTY_IS_PREVIOUS_CONVERSION = "isPreviousConversion";
  private ConversionTrackerServiceIsPreviousConversion isPreviousConversion;

  public ConversionTracker() { 
  }

  public ConversionTracker accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public ConversionTracker allConversionValue(String allConversionValue) {
    
    this.allConversionValue = allConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンの価値（全て）です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conv. value (all). &lt;/div&gt; 
   * @return allConversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（全て）です。 </div> <div lang=\"en\"> Conv. value (all). </div> ")
  @JsonProperty(JSON_PROPERTY_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAllConversionValue() {
    return allConversionValue;
  }


  @JsonProperty(JSON_PROPERTY_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }


  public ConversionTracker allConversions(Long allConversions) {
    
    this.allConversions = allConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョン数（全て）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversions (all).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return allConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（全て）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (all).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAllConversions() {
    return allConversions;
  }


  @JsonProperty(JSON_PROPERTY_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllConversions(Long allConversions) {
    this.allConversions = allConversions;
  }


  public ConversionTracker viewThroughConversions(Long viewThroughConversions) {
    
    this.viewThroughConversions = viewThroughConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビュースルーコンバージョン数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;View through conversions&lt;/div&gt; 
   * @return viewThroughConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> ")
  @JsonProperty(JSON_PROPERTY_VIEW_THROUGH_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getViewThroughConversions() {
    return viewThroughConversions;
  }


  @JsonProperty(JSON_PROPERTY_VIEW_THROUGH_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
  }


  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    
    this.appConversion = appConversion;
    return this;
  }

   /**
   * Get appConversion
   * @return appConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversion getAppConversion() {
    return appConversion;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
  }


  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(ConversionTrackerServiceCategory category) {
    this.category = category;
  }


  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカーIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SET時は必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion Tracker ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET operation. &lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカーIDです。<br> このフィールドは、ADD時は無視され、SET時は必須となります。 </div> <div lang=\"en\"> Conversion Tracker ID.<br> This field will be ignored in ADD operation, and will be required in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }


  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    
    this.conversionTrackerName = conversionTrackerName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカー名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion Tracker Name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return conversionTrackerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョントラッカー名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Conversion Tracker Name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionTrackerName() {
    return conversionTrackerName;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }


  public ConversionTracker conversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    
    this.conversionTrackerType = conversionTrackerType;
    return this;
  }

   /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceType getConversionTrackerType() {
    return conversionTrackerType;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerType(ConversionTrackerServiceType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }


  public ConversionTracker conversionValue(String conversionValue) {
    
    this.conversionValue = conversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンの価値/コンバージョン数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conv. value/conv.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値/コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value/conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionValue() {
    return conversionValue;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }


  public ConversionTracker conversionValueViaAdClick(String conversionValueViaAdClick) {
    
    this.conversionValueViaAdClick = conversionValueViaAdClick;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンの価値（クリック経由）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conv. value (via click).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversionValueViaAdClick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの価値（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conv. value (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionValueViaAdClick() {
    return conversionValueViaAdClick;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
  }


  public ConversionTracker conversions(Long conversions) {
    
    this.conversions = conversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョン数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversions.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversions() {
    return conversions;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversions(Long conversions) {
    this.conversions = conversions;
  }


  public ConversionTracker conversionsViaAdClick(Long conversionsViaAdClick) {
    
    this.conversionsViaAdClick = conversionsViaAdClick;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョン数（クリック経由）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversions (via click).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return conversionsViaAdClick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョン数（クリック経由）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Conversions (via click).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSIONS_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionsViaAdClick() {
    return conversionsViaAdClick;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSIONS_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
  }


  public ConversionTracker countingType(ConversionTrackerServiceCountingType countingType) {
    
    this.countingType = countingType;
    return this;
  }

   /**
   * Get countingType
   * @return countingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceCountingType getCountingType() {
    return countingType;
  }


  @JsonProperty(JSON_PROPERTY_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountingType(ConversionTrackerServiceCountingType countingType) {
    this.countingType = countingType;
  }


  public ConversionTracker crossDeviceConversions(Long crossDeviceConversions) {
    
    this.crossDeviceConversions = crossDeviceConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; クロスデバイスコンバージョン数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Cross-device conv.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return crossDeviceConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> クロスデバイスコンバージョン数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Cross-device conv.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CROSS_DEVICE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCrossDeviceConversions() {
    return crossDeviceConversions;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_DEVICE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
  }


  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    
    this.excludeFromBidding = excludeFromBidding;
    return this;
  }

   /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }


  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    
    this.measurementPeriod = measurementPeriod;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 計測期間（単位：日）です。&lt;br&gt; ※7～90の範囲内で指定可能です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Counting period (Unit: Day).&lt;br&gt; ∗ Can be specified within the range of 7 to 90 days.&lt;br&gt; This field is optional in requests. The default value in ADD operation will be 30. &lt;/div&gt; 
   * @return measurementPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 計測期間（単位：日）です。<br> ※7～90の範囲内で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は30となります。 </div> <div lang=\"en\"> Counting period (Unit: Day).<br> ∗ Can be specified within the range of 7 to 90 days.<br> This field is optional in requests. The default value in ADD operation will be 30. </div> ")
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMeasurementPeriod() {
    return measurementPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }


  public ConversionTracker measurementPeriodView(Integer measurementPeriodView) {
    
    this.measurementPeriodView = measurementPeriodView;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 測定期間（動画視聴）&lt;br&gt; ※1-30の範囲で指定可能です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Counting period (Video view).&lt;br&gt; ∗ Can be specified within the range of 1 to 30.&lt;br&gt; This field is optional in requests. The default value in ADD operation will be 1. &lt;/div&gt; 
   * @return measurementPeriodView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 測定期間（動画視聴）<br> ※1-30の範囲で指定可能です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は1となります。 </div> <div lang=\"en\"> Counting period (Video view).<br> ∗ Can be specified within the range of 1 to 30.<br> This field is optional in requests. The default value in ADD operation will be 1. </div> ")
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMeasurementPeriodView() {
    return measurementPeriodView;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasurementPeriodView(Integer measurementPeriodView) {
    this.measurementPeriodView = measurementPeriodView;
  }


  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    
    this.mostRecentConversionDate = mostRecentConversionDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンが発生した直近の日付です。&lt;br&gt; ※YYYYMMDD形式です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The date of the most recent conversion.&lt;br&gt; ∗ Format: YYYYMMDD.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return mostRecentConversionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンが発生した直近の日付です。<br> ※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The date of the most recent conversion.<br> ∗ Format: YYYYMMDD.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }


  @JsonProperty(JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }


  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }


  public ConversionTracker userRevenueValue(Long userRevenueValue) {
    
    this.userRevenueValue = userRevenueValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョンの収益値です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Revenue value for Conversions.&lt;br&gt; This field is optional in requests. The default value in ADD operation will be 0. &lt;/div&gt; 
   * @return userRevenueValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> コンバージョンの収益値です。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値は0となります。 </div> <div lang=\"en\"> Revenue value for Conversions.<br> This field is optional in requests. The default value in ADD operation will be 0. </div> ")
  @JsonProperty(JSON_PROPERTY_USER_REVENUE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserRevenueValue() {
    return userRevenueValue;
  }


  @JsonProperty(JSON_PROPERTY_USER_REVENUE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserRevenueValue(Long userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }


  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    
    this.webConversion = webConversion;
    return this;
  }

   /**
   * Get webConversion
   * @return webConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceWebConversion getWebConversion() {
    return webConversion;
  }


  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
  }


  public ConversionTracker isPreviousConversion(ConversionTrackerServiceIsPreviousConversion isPreviousConversion) {
    
    this.isPreviousConversion = isPreviousConversion;
    return this;
  }

   /**
   * Get isPreviousConversion
   * @return isPreviousConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PREVIOUS_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceIsPreviousConversion getIsPreviousConversion() {
    return isPreviousConversion;
  }


  @JsonProperty(JSON_PROPERTY_IS_PREVIOUS_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPreviousConversion(ConversionTrackerServiceIsPreviousConversion isPreviousConversion) {
    this.isPreviousConversion = isPreviousConversion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTracker conversionTracker = (ConversionTracker) o;
    return Objects.equals(this.accountId, conversionTracker.accountId) &&
        Objects.equals(this.allConversionValue, conversionTracker.allConversionValue) &&
        Objects.equals(this.allConversions, conversionTracker.allConversions) &&
        Objects.equals(this.viewThroughConversions, conversionTracker.viewThroughConversions) &&
        Objects.equals(this.appConversion, conversionTracker.appConversion) &&
        Objects.equals(this.category, conversionTracker.category) &&
        Objects.equals(this.conversionTrackerId, conversionTracker.conversionTrackerId) &&
        Objects.equals(this.conversionTrackerName, conversionTracker.conversionTrackerName) &&
        Objects.equals(this.conversionTrackerType, conversionTracker.conversionTrackerType) &&
        Objects.equals(this.conversionValue, conversionTracker.conversionValue) &&
        Objects.equals(this.conversionValueViaAdClick, conversionTracker.conversionValueViaAdClick) &&
        Objects.equals(this.conversions, conversionTracker.conversions) &&
        Objects.equals(this.conversionsViaAdClick, conversionTracker.conversionsViaAdClick) &&
        Objects.equals(this.countingType, conversionTracker.countingType) &&
        Objects.equals(this.crossDeviceConversions, conversionTracker.crossDeviceConversions) &&
        Objects.equals(this.excludeFromBidding, conversionTracker.excludeFromBidding) &&
        Objects.equals(this.measurementPeriod, conversionTracker.measurementPeriod) &&
        Objects.equals(this.measurementPeriodView, conversionTracker.measurementPeriodView) &&
        Objects.equals(this.mostRecentConversionDate, conversionTracker.mostRecentConversionDate) &&
        Objects.equals(this.status, conversionTracker.status) &&
        Objects.equals(this.userRevenueValue, conversionTracker.userRevenueValue) &&
        Objects.equals(this.webConversion, conversionTracker.webConversion) &&
        Objects.equals(this.isPreviousConversion, conversionTracker.isPreviousConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allConversionValue, allConversions, viewThroughConversions, appConversion, category, conversionTrackerId, conversionTrackerName, conversionTrackerType, conversionValue, conversionValueViaAdClick, conversions, conversionsViaAdClick, countingType, crossDeviceConversions, excludeFromBidding, measurementPeriod, measurementPeriodView, mostRecentConversionDate, status, userRevenueValue, webConversion, isPreviousConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTracker {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allConversionValue: ").append(toIndentedString(allConversionValue)).append("\n");
    sb.append("    allConversions: ").append(toIndentedString(allConversions)).append("\n");
    sb.append("    viewThroughConversions: ").append(toIndentedString(viewThroughConversions)).append("\n");
    sb.append("    appConversion: ").append(toIndentedString(appConversion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    conversionTrackerName: ").append(toIndentedString(conversionTrackerName)).append("\n");
    sb.append("    conversionTrackerType: ").append(toIndentedString(conversionTrackerType)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    conversionValueViaAdClick: ").append(toIndentedString(conversionValueViaAdClick)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    conversionsViaAdClick: ").append(toIndentedString(conversionsViaAdClick)).append("\n");
    sb.append("    countingType: ").append(toIndentedString(countingType)).append("\n");
    sb.append("    crossDeviceConversions: ").append(toIndentedString(crossDeviceConversions)).append("\n");
    sb.append("    excludeFromBidding: ").append(toIndentedString(excludeFromBidding)).append("\n");
    sb.append("    measurementPeriod: ").append(toIndentedString(measurementPeriod)).append("\n");
    sb.append("    measurementPeriodView: ").append(toIndentedString(measurementPeriodView)).append("\n");
    sb.append("    mostRecentConversionDate: ").append(toIndentedString(mostRecentConversionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userRevenueValue: ").append(toIndentedString(userRevenueValue)).append("\n");
    sb.append("    webConversion: ").append(toIndentedString(webConversion)).append("\n");
    sb.append("    isPreviousConversion: ").append(toIndentedString(isPreviousConversion)).append("\n");
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

