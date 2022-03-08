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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceDeviceAppType;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceLabel;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupオブジェクトは、広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Ad Group object is a container for storing ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupオブジェクトは、広告グループ情報を保持します。</div> <div lang=\"en\">The Ad Group object is a container for storing ad group information.</div> ")
@JsonPropertyOrder({
  AdGroup.JSON_PROPERTY_ACCOUNT_ID,
  AdGroup.JSON_PROPERTY_AD_GROUP_BIDDING_STRATEGY,
  AdGroup.JSON_PROPERTY_AD_GROUP_ID,
  AdGroup.JSON_PROPERTY_AD_GROUP_NAME,
  AdGroup.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroup.JSON_PROPERTY_CAMPAIGN_NAME,
  AdGroup.JSON_PROPERTY_CUSTOM_PARAMETERS,
  AdGroup.JSON_PROPERTY_DEVICE,
  AdGroup.JSON_PROPERTY_DEVICE_APP,
  AdGroup.JSON_PROPERTY_DEVICE_OS,
  AdGroup.JSON_PROPERTY_DEVICE_OS_VERSION,
  AdGroup.JSON_PROPERTY_FEED_SET_ID,
  AdGroup.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  AdGroup.JSON_PROPERTY_LABELS,
  AdGroup.JSON_PROPERTY_TRACKING_URL,
  AdGroup.JSON_PROPERTY_USER_STATUS,
  AdGroup.JSON_PROPERTY_CREATED_DATE
})
@JsonTypeName("AdGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroup {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_BIDDING_STRATEGY = "adGroupBiddingStrategy";
  private AdGroupServiceBiddingStrategy adGroupBiddingStrategy;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private AdGroupServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private List<AdGroupServiceDeviceType> device = null;

  public static final String JSON_PROPERTY_DEVICE_APP = "deviceApp";
  private List<AdGroupServiceDeviceAppType> deviceApp = null;

  public static final String JSON_PROPERTY_DEVICE_OS = "deviceOs";
  private List<AdGroupServiceDeviceOsType> deviceOs = null;

  public static final String JSON_PROPERTY_DEVICE_OS_VERSION = "deviceOsVersion";
  private String deviceOsVersion;

  public static final String JSON_PROPERTY_FEED_SET_ID = "feedSetId";
  private Long feedSetId;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private AdGroupServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<AdGroupServiceLabel> labels = null;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public AdGroup() { 
  }

  public AdGroup accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")
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


  public AdGroup adGroupBiddingStrategy(AdGroupServiceBiddingStrategy adGroupBiddingStrategy) {
    
    this.adGroupBiddingStrategy = adGroupBiddingStrategy;
    return this;
  }

   /**
   * Get adGroupBiddingStrategy
   * @return adGroupBiddingStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_BIDDING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceBiddingStrategy getAdGroupBiddingStrategy() {
    return adGroupBiddingStrategy;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_BIDDING_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupBiddingStrategy(AdGroupServiceBiddingStrategy adGroupBiddingStrategy) {
    this.adGroupBiddingStrategy = adGroupBiddingStrategy;
  }


  public AdGroup adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. &lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroup adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public AdGroup campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> ")
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


  public AdGroup campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroup customParameters(AdGroupServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(AdGroupServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public AdGroup device(List<AdGroupServiceDeviceType> device) {
    
    this.device = device;
    return this;
  }

  public AdGroup addDeviceItem(AdGroupServiceDeviceType deviceItem) {
    if (this.device == null) {
      this.device = new ArrayList<>();
    }
    this.device.add(deviceItem);
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceDeviceType> getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(List<AdGroupServiceDeviceType> device) {
    this.device = device;
  }


  public AdGroup deviceApp(List<AdGroupServiceDeviceAppType> deviceApp) {
    
    this.deviceApp = deviceApp;
    return this;
  }

  public AdGroup addDeviceAppItem(AdGroupServiceDeviceAppType deviceAppItem) {
    if (this.deviceApp == null) {
      this.deviceApp = new ArrayList<>();
    }
    this.deviceApp.add(deviceAppItem);
    return this;
  }

   /**
   * Get deviceApp
   * @return deviceApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceDeviceAppType> getDeviceApp() {
    return deviceApp;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceApp(List<AdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = deviceApp;
  }


  public AdGroup deviceOs(List<AdGroupServiceDeviceOsType> deviceOs) {
    
    this.deviceOs = deviceOs;
    return this;
  }

  public AdGroup addDeviceOsItem(AdGroupServiceDeviceOsType deviceOsItem) {
    if (this.deviceOs == null) {
      this.deviceOs = new ArrayList<>();
    }
    this.deviceOs.add(deviceOsItem);
    return this;
  }

   /**
   * Get deviceOs
   * @return deviceOs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceDeviceOsType> getDeviceOs() {
    return deviceOs;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceOs(List<AdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = deviceOs;
  }


  public AdGroup deviceOsVersion(String deviceOsVersion) {
    
    this.deviceOsVersion = deviceOsVersion;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; OSバージョンです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※設定を解除する場合は、NONEを設定してください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; OS version.&lt;br&gt; ∗To cancel the setting, specify &amp;#34;NONE&amp;#34;.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return deviceOsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> OSバージョンです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※設定を解除する場合は、NONEを設定してください。 </div> <div lang=\"en\"> OS version.<br> ∗To cancel the setting, specify &#34;NONE&#34;.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_DEVICE_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceOsVersion() {
    return deviceOsVersion;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceOsVersion(String deviceOsVersion) {
    this.deviceOsVersion = deviceOsVersion;
  }


  public AdGroup feedSetId(Long feedSetId) {
    
    this.feedSetId = feedSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品セットIDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Feed set ID.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; * If feedSetId is not specified in ADD operation, the default set is associated automatically. &lt;/div&gt; 
   * @return feedSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 </div> <div lang=\"en\"> Feed set ID.<br> This field is optional in ADD and SET operation.<br> * If feedSetId is not specified in ADD operation, the default set is associated automatically. </div> ")
  @JsonProperty(JSON_PROPERTY_FEED_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedSetId() {
    return feedSetId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedSetId(Long feedSetId) {
    this.feedSetId = feedSetId;
  }


  public AdGroup isRemoveTrackingUrl(AdGroupServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(AdGroupServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public AdGroup labels(List<AdGroupServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public AdGroup addLabelsItem(AdGroupServiceLabel labelsItem) {
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

  public List<AdGroupServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<AdGroupServiceLabel> labels) {
    this.labels = labels;
  }


  public AdGroup trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※SET時、こちらが審査中の場合、編集はできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional.&lt;br&gt; *In SET operation, cannot update it when this field is in editorial review.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> このフィールドは、省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional.<br> *In SET operation, cannot update it when this field is in editorial review.</div> ")
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


  public AdGroup userStatus(AdGroupServiceUserStatus userStatus) {
    
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

  public AdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public AdGroup createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループが作成された日時です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Ad Group made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroup adGroup = (AdGroup) o;
    return Objects.equals(this.accountId, adGroup.accountId) &&
        Objects.equals(this.adGroupBiddingStrategy, adGroup.adGroupBiddingStrategy) &&
        Objects.equals(this.adGroupId, adGroup.adGroupId) &&
        Objects.equals(this.adGroupName, adGroup.adGroupName) &&
        Objects.equals(this.campaignId, adGroup.campaignId) &&
        Objects.equals(this.campaignName, adGroup.campaignName) &&
        Objects.equals(this.customParameters, adGroup.customParameters) &&
        Objects.equals(this.device, adGroup.device) &&
        Objects.equals(this.deviceApp, adGroup.deviceApp) &&
        Objects.equals(this.deviceOs, adGroup.deviceOs) &&
        Objects.equals(this.deviceOsVersion, adGroup.deviceOsVersion) &&
        Objects.equals(this.feedSetId, adGroup.feedSetId) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroup.isRemoveTrackingUrl) &&
        Objects.equals(this.labels, adGroup.labels) &&
        Objects.equals(this.trackingUrl, adGroup.trackingUrl) &&
        Objects.equals(this.userStatus, adGroup.userStatus) &&
        Objects.equals(this.createdDate, adGroup.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupBiddingStrategy, adGroupId, adGroupName, campaignId, campaignName, customParameters, device, deviceApp, deviceOs, deviceOsVersion, feedSetId, isRemoveTrackingUrl, labels, trackingUrl, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroup {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupBiddingStrategy: ").append(toIndentedString(adGroupBiddingStrategy)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceApp: ").append(toIndentedString(deviceApp)).append("\n");
    sb.append("    deviceOs: ").append(toIndentedString(deviceOs)).append("\n");
    sb.append("    deviceOsVersion: ").append(toIndentedString(deviceOsVersion)).append("\n");
    sb.append("    feedSetId: ").append(toIndentedString(feedSetId)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

