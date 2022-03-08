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
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceAd;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceAdStyle;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceLabel;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAdServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupAd object is a container for storing ad information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。</div> <div lang=\"en\">The AdGroupAd object is a container for storing ad information.</div> ")
@JsonPropertyOrder({
  AdGroupAd.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupAd.JSON_PROPERTY_AD,
  AdGroupAd.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupAd.JSON_PROPERTY_AD_GROUP_NAME,
  AdGroupAd.JSON_PROPERTY_AD_ID,
  AdGroupAd.JSON_PROPERTY_AD_NAME,
  AdGroupAd.JSON_PROPERTY_AD_STYLE,
  AdGroupAd.JSON_PROPERTY_APPROVAL_STATUS,
  AdGroupAd.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupAd.JSON_PROPERTY_CAMPAIGN_NAME,
  AdGroupAd.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  AdGroupAd.JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION,
  AdGroupAd.JSON_PROPERTY_IMPRESSION_BEACON_URLS,
  AdGroupAd.JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS,
  AdGroupAd.JSON_PROPERTY_IS_REMOVE_IMPRESSION_BEACON_URLS,
  AdGroupAd.JSON_PROPERTY_IS_REMOVE_VIEWABLE_IMPRESSION_BEACON_URLS,
  AdGroupAd.JSON_PROPERTY_IS_REMOVE_THIRD_PARTY_TRACKING_SCRIPT_URL,
  AdGroupAd.JSON_PROPERTY_LABELS,
  AdGroupAd.JSON_PROPERTY_MEDIA_ID,
  AdGroupAd.JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL,
  AdGroupAd.JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR,
  AdGroupAd.JSON_PROPERTY_USER_STATUS,
  AdGroupAd.JSON_PROPERTY_CREATED_DATE
})
@JsonTypeName("AdGroupAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAd {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD = "ad";
  private AdGroupAdServiceAd ad;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_AD_ID = "adId";
  private Long adId;

  public static final String JSON_PROPERTY_AD_NAME = "adName";
  private String adName;

  public static final String JSON_PROPERTY_AD_STYLE = "adStyle";
  private AdGroupAdServiceAdStyle adStyle;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private AdGroupAdServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION = "disapprovalReasonDescription";
  private String disapprovalReasonDescription;

  public static final String JSON_PROPERTY_IMPRESSION_BEACON_URLS = "impressionBeaconUrls";
  private List<String> impressionBeaconUrls = null;

  public static final String JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS = "viewableImpressionBeaconUrls";
  private List<String> viewableImpressionBeaconUrls = null;

  public static final String JSON_PROPERTY_IS_REMOVE_IMPRESSION_BEACON_URLS = "isRemoveImpressionBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIEWABLE_IMPRESSION_BEACON_URLS = "isRemoveViewableImpressionBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveViewableImpressionBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_THIRD_PARTY_TRACKING_SCRIPT_URL = "isRemoveThirdPartyTrackingScriptUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<AdGroupAdServiceLabel> labels = null;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL = "thirdPartyTrackingScriptUrl";
  private String thirdPartyTrackingScriptUrl;

  public static final String JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR = "thirdPartyTrackingVendor";
  private String thirdPartyTrackingVendor;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupAdServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public AdGroupAd() { 
  }

  public AdGroupAd accountId(Long accountId) {
    
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


  public AdGroupAd ad(AdGroupAdServiceAd ad) {
    
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAd getAd() {
    return ad;
  }


  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAd(AdGroupAdServiceAd ad) {
    this.ad = ad;
  }


  public AdGroupAd adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests. </div> ")
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


  public AdGroupAd adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupAd adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告IDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. &lt;/div&gt; 
   * @return adId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告IDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Ad ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdId() {
    return adId;
  }


  @JsonProperty(JSON_PROPERTY_AD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdGroupAd adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdName() {
    return adName;
  }


  @JsonProperty(JSON_PROPERTY_AD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdName(String adName) {
    this.adName = adName;
  }


  public AdGroupAd adStyle(AdGroupAdServiceAdStyle adStyle) {
    
    this.adStyle = adStyle;
    return this;
  }

   /**
   * Get adStyle
   * @return adStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAdStyle getAdStyle() {
    return adStyle;
  }


  @JsonProperty(JSON_PROPERTY_AD_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdStyle(AdGroupAdServiceAdStyle adStyle) {
    this.adStyle = adStyle;
  }


  public AdGroupAd approvalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public AdGroupAd campaignId(Long campaignId) {
    
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


  public AdGroupAd campaignName(String campaignName) {
    
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


  public AdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載拒否の理由です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reject reason on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public AdGroupAd disapprovalReasonDescription(String disapprovalReasonDescription) {
    
    this.disapprovalReasonDescription = disapprovalReasonDescription;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載拒否の理由詳細です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reject reason details on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return disapprovalReasonDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason details on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisapprovalReasonDescription() {
    return disapprovalReasonDescription;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonDescription(String disapprovalReasonDescription) {
    this.disapprovalReasonDescription = disapprovalReasonDescription;
  }


  public AdGroupAd impressionBeaconUrls(List<String> impressionBeaconUrls) {
    
    this.impressionBeaconUrls = impressionBeaconUrls;
    return this;
  }

  public AdGroupAd addImpressionBeaconUrlsItem(String impressionBeaconUrlsItem) {
    if (this.impressionBeaconUrls == null) {
      this.impressionBeaconUrls = new ArrayList<>();
    }
    this.impressionBeaconUrls.add(impressionBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; インプレッションビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Impression beacon URL.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return impressionBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> インプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Impression beacon URL.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getImpressionBeaconUrls() {
    return impressionBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
  }


  public AdGroupAd viewableImpressionBeaconUrls(List<String> viewableImpressionBeaconUrls) {
    
    this.viewableImpressionBeaconUrls = viewableImpressionBeaconUrls;
    return this;
  }

  public AdGroupAd addViewableImpressionBeaconUrlsItem(String viewableImpressionBeaconUrlsItem) {
    if (this.viewableImpressionBeaconUrls == null) {
      this.viewableImpressionBeaconUrls = new ArrayList<>();
    }
    this.viewableImpressionBeaconUrls.add(viewableImpressionBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ビューアブルインプレッションビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewable impression beacon URL.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return viewableImpressionBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Viewable impression beacon URL.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getViewableImpressionBeaconUrls() {
    return viewableImpressionBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableImpressionBeaconUrls(List<String> viewableImpressionBeaconUrls) {
    this.viewableImpressionBeaconUrls = viewableImpressionBeaconUrls;
  }


  public AdGroupAd isRemoveImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls) {
    
    this.isRemoveImpressionBeaconUrls = isRemoveImpressionBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveImpressionBeaconUrls
   * @return isRemoveImpressionBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveImpressionBeaconUrls() {
    return isRemoveImpressionBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls) {
    this.isRemoveImpressionBeaconUrls = isRemoveImpressionBeaconUrls;
  }


  public AdGroupAd isRemoveViewableImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveViewableImpressionBeaconUrls) {
    
    this.isRemoveViewableImpressionBeaconUrls = isRemoveViewableImpressionBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveViewableImpressionBeaconUrls
   * @return isRemoveViewableImpressionBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIEWABLE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveViewableImpressionBeaconUrls() {
    return isRemoveViewableImpressionBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIEWABLE_IMPRESSION_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveViewableImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveViewableImpressionBeaconUrls) {
    this.isRemoveViewableImpressionBeaconUrls = isRemoveViewableImpressionBeaconUrls;
  }


  public AdGroupAd isRemoveThirdPartyTrackingScriptUrl(AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
    return this;
  }

   /**
   * Get isRemoveThirdPartyTrackingScriptUrl
   * @return isRemoveThirdPartyTrackingScriptUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_THIRD_PARTY_TRACKING_SCRIPT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveThirdPartyTrackingScriptUrl() {
    return isRemoveThirdPartyTrackingScriptUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_THIRD_PARTY_TRACKING_SCRIPT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveThirdPartyTrackingScriptUrl(AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
  }


  public AdGroupAd labels(List<AdGroupAdServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public AdGroupAd addLabelsItem(AdGroupAdServiceLabel labelsItem) {
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

  public List<AdGroupAdServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<AdGroupAdServiceLabel> labels) {
    this.labels = labels;
  }


  public AdGroupAd mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public AdGroupAd thirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 第三者計測スクリプトURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Third party tracking script URL.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return thirdPartyTrackingScriptUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測スクリプトURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Third party tracking script URL.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartyTrackingScriptUrl() {
    return thirdPartyTrackingScriptUrl;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
  }


  public AdGroupAd thirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 第三者計測ベンダー（ReadOnly）です。&lt;br&gt; thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Third party tracking vendor (Read only).&lt;br&gt; Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return thirdPartyTrackingVendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測ベンダー（ReadOnly）です。<br> thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Third party tracking vendor (Read only).<br> Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartyTrackingVendor() {
    return thirdPartyTrackingVendor;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
  }


  public AdGroupAd userStatus(AdGroupAdServiceUserStatus userStatus) {
    
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

  public AdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public AdGroupAd createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告が作成された日時です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Ad made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告が作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> ")
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
    AdGroupAd adGroupAd = (AdGroupAd) o;
    return Objects.equals(this.accountId, adGroupAd.accountId) &&
        Objects.equals(this.ad, adGroupAd.ad) &&
        Objects.equals(this.adGroupId, adGroupAd.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupAd.adGroupName) &&
        Objects.equals(this.adId, adGroupAd.adId) &&
        Objects.equals(this.adName, adGroupAd.adName) &&
        Objects.equals(this.adStyle, adGroupAd.adStyle) &&
        Objects.equals(this.approvalStatus, adGroupAd.approvalStatus) &&
        Objects.equals(this.campaignId, adGroupAd.campaignId) &&
        Objects.equals(this.campaignName, adGroupAd.campaignName) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAd.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonDescription, adGroupAd.disapprovalReasonDescription) &&
        Objects.equals(this.impressionBeaconUrls, adGroupAd.impressionBeaconUrls) &&
        Objects.equals(this.viewableImpressionBeaconUrls, adGroupAd.viewableImpressionBeaconUrls) &&
        Objects.equals(this.isRemoveImpressionBeaconUrls, adGroupAd.isRemoveImpressionBeaconUrls) &&
        Objects.equals(this.isRemoveViewableImpressionBeaconUrls, adGroupAd.isRemoveViewableImpressionBeaconUrls) &&
        Objects.equals(this.isRemoveThirdPartyTrackingScriptUrl, adGroupAd.isRemoveThirdPartyTrackingScriptUrl) &&
        Objects.equals(this.labels, adGroupAd.labels) &&
        Objects.equals(this.mediaId, adGroupAd.mediaId) &&
        Objects.equals(this.thirdPartyTrackingScriptUrl, adGroupAd.thirdPartyTrackingScriptUrl) &&
        Objects.equals(this.thirdPartyTrackingVendor, adGroupAd.thirdPartyTrackingVendor) &&
        Objects.equals(this.userStatus, adGroupAd.userStatus) &&
        Objects.equals(this.createdDate, adGroupAd.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adId, adName, adStyle, approvalStatus, campaignId, campaignName, disapprovalReasonCodes, disapprovalReasonDescription, impressionBeaconUrls, viewableImpressionBeaconUrls, isRemoveImpressionBeaconUrls, isRemoveViewableImpressionBeaconUrls, isRemoveThirdPartyTrackingScriptUrl, labels, mediaId, thirdPartyTrackingScriptUrl, thirdPartyTrackingVendor, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAd {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adStyle: ").append(toIndentedString(adStyle)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonDescription: ").append(toIndentedString(disapprovalReasonDescription)).append("\n");
    sb.append("    impressionBeaconUrls: ").append(toIndentedString(impressionBeaconUrls)).append("\n");
    sb.append("    viewableImpressionBeaconUrls: ").append(toIndentedString(viewableImpressionBeaconUrls)).append("\n");
    sb.append("    isRemoveImpressionBeaconUrls: ").append(toIndentedString(isRemoveImpressionBeaconUrls)).append("\n");
    sb.append("    isRemoveViewableImpressionBeaconUrls: ").append(toIndentedString(isRemoveViewableImpressionBeaconUrls)).append("\n");
    sb.append("    isRemoveThirdPartyTrackingScriptUrl: ").append(toIndentedString(isRemoveThirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thirdPartyTrackingScriptUrl: ").append(toIndentedString(thirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    thirdPartyTrackingVendor: ").append(toIndentedString(thirdPartyTrackingVendor)).append("\n");
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

