/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.GuaranteedAdGroupAdLandingPageStatus;
import jp.co.yahoo.adsdisplayapi.v11.model.GuaranteedAdGroupAdServiceAd;
import jp.co.yahoo.adsdisplayapi.v11.model.GuaranteedAdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v11.model.GuaranteedAdGroupAdServiceLabel;
import jp.co.yahoo.adsdisplayapi.v11.model.GuaranteedAdGroupAdServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdオブジェクトは、予約型の広告の情報を格納するコンテナです。&lt;br&gt; 各広告で設定可能な項目については、&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/rf/articledetail?lan&#x3D;ja&amp;aid&#x3D;103055&amp;o&#x3D;default\&quot;&gt;予約型の広告の種類&lt;/a&gt;をご参照ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The GuaranteedAdGroupAd object is a container for storing ad information of guaranteed campaign.&lt;br&gt; Available fields of each ad are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/rf/articledetail?lan&#x3D;ja&amp;aid&#x3D;103055&amp;o&#x3D;default\&quot;&gt;予約型の広告の種類&lt;/a&gt; (Japanese context only). &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroupAd.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_AD,
  GuaranteedAdGroupAd.JSON_PROPERTY_AD_GROUP_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_AD_GROUP_NAME,
  GuaranteedAdGroupAd.JSON_PROPERTY_AD_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_AD_NAME,
  GuaranteedAdGroupAd.JSON_PROPERTY_APPROVAL_STATUS,
  GuaranteedAdGroupAd.JSON_PROPERTY_CAMPAIGN_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_CAMPAIGN_NAME,
  GuaranteedAdGroupAd.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  GuaranteedAdGroupAd.JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION,
  GuaranteedAdGroupAd.JSON_PROPERTY_IMPRESSION_BEACON_URLS,
  GuaranteedAdGroupAd.JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS,
  GuaranteedAdGroupAd.JSON_PROPERTY_LABELS,
  GuaranteedAdGroupAd.JSON_PROPERTY_MEDIA_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL,
  GuaranteedAdGroupAd.JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR,
  GuaranteedAdGroupAd.JSON_PROPERTY_USER_STATUS,
  GuaranteedAdGroupAd.JSON_PROPERTY_LANDING_PAGE_STATUS,
  GuaranteedAdGroupAd.JSON_PROPERTY_PRE_APPROVAL_ID,
  GuaranteedAdGroupAd.JSON_PROPERTY_LANDING_PAGE_UPDATE_SCHEDULED_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAd {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD = "ad";
  private GuaranteedAdGroupAdServiceAd ad;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_AD_ID = "adId";
  private Long adId;

  public static final String JSON_PROPERTY_AD_NAME = "adName";
  private String adName;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private GuaranteedAdGroupAdServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_DESCRIPTION = "disapprovalReasonDescription";
  private String disapprovalReasonDescription;

  public static final String JSON_PROPERTY_IMPRESSION_BEACON_URLS = "impressionBeaconUrls";
  private List<String> impressionBeaconUrls;

  public static final String JSON_PROPERTY_VIEWABLE_IMPRESSION_BEACON_URLS = "viewableImpressionBeaconUrls";
  private List<String> viewableImpressionBeaconUrls;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<GuaranteedAdGroupAdServiceLabel> labels;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_THIRD_PARTY_TRACKING_SCRIPT_URL = "thirdPartyTrackingScriptUrl";
  private String thirdPartyTrackingScriptUrl;

  public static final String JSON_PROPERTY_THIRD_PARTY_TRACKING_VENDOR = "thirdPartyTrackingVendor";
  private String thirdPartyTrackingVendor;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private GuaranteedAdGroupAdServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_LANDING_PAGE_STATUS = "landingPageStatus";
  private GuaranteedAdGroupAdLandingPageStatus landingPageStatus;

  public static final String JSON_PROPERTY_PRE_APPROVAL_ID = "preApprovalId";
  private String preApprovalId;

  public static final String JSON_PROPERTY_LANDING_PAGE_UPDATE_SCHEDULED_TIME = "landingPageUpdateScheduledTime";
  private String landingPageUpdateScheduledTime;

  public GuaranteedAdGroupAd() {
  }

  public GuaranteedAdGroupAd accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
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


  public GuaranteedAdGroupAd ad(GuaranteedAdGroupAdServiceAd ad) {
    
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceAd getAd() {
    return ad;
  }


  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAd(GuaranteedAdGroupAdServiceAd ad) {
    this.ad = ad;
  }


  public GuaranteedAdGroupAd adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return adGroupId
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adGroupName
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad ID.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adId
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad name.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adName
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd approvalStatus(GuaranteedAdGroupAdServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(GuaranteedAdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public GuaranteedAdGroupAd campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
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


  public GuaranteedAdGroupAd campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
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


  public GuaranteedAdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public GuaranteedAdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
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
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd disapprovalReasonDescription(String disapprovalReasonDescription) {
    
    this.disapprovalReasonDescription = disapprovalReasonDescription;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載拒否の理由詳細です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reject reason details on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return disapprovalReasonDescription
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd impressionBeaconUrls(List<String> impressionBeaconUrls) {
    
    this.impressionBeaconUrls = impressionBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAd addImpressionBeaconUrlsItem(String impressionBeaconUrlsItem) {
    if (this.impressionBeaconUrls == null) {
      this.impressionBeaconUrls = new ArrayList<>();
    }
    this.impressionBeaconUrls.add(impressionBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; インプレッションビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Impression beacon URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return impressionBeaconUrls
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd viewableImpressionBeaconUrls(List<String> viewableImpressionBeaconUrls) {
    
    this.viewableImpressionBeaconUrls = viewableImpressionBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAd addViewableImpressionBeaconUrlsItem(String viewableImpressionBeaconUrlsItem) {
    if (this.viewableImpressionBeaconUrls == null) {
      this.viewableImpressionBeaconUrls = new ArrayList<>();
    }
    this.viewableImpressionBeaconUrls.add(viewableImpressionBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ビューアブルインプレッションビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewable impression beacon URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return viewableImpressionBeaconUrls
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd labels(List<GuaranteedAdGroupAdServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public GuaranteedAdGroupAd addLabelsItem(GuaranteedAdGroupAdServiceLabel labelsItem) {
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

  public List<GuaranteedAdGroupAdServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<GuaranteedAdGroupAdServiceLabel> labels) {
    this.labels = labels;
  }


  public GuaranteedAdGroupAd mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return mediaId
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd thirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 第三者計測スクリプトURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Third party tracking script URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return thirdPartyTrackingScriptUrl
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd thirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 第三者計測ベンダー（ReadOnly）です。&lt;br&gt; thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Third party tracking vendor (Read only).&lt;br&gt; Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return thirdPartyTrackingVendor
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAd userStatus(GuaranteedAdGroupAdServiceUserStatus userStatus) {
    
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

  public GuaranteedAdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(GuaranteedAdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public GuaranteedAdGroupAd landingPageStatus(GuaranteedAdGroupAdLandingPageStatus landingPageStatus) {
    
    this.landingPageStatus = landingPageStatus;
    return this;
  }

   /**
   * Get landingPageStatus
   * @return landingPageStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdLandingPageStatus getLandingPageStatus() {
    return landingPageStatus;
  }


  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandingPageStatus(GuaranteedAdGroupAdLandingPageStatus landingPageStatus) {
    this.landingPageStatus = landingPageStatus;
  }


  public GuaranteedAdGroupAd preApprovalId(String preApprovalId) {
    
    this.preApprovalId = preApprovalId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 事前承認ID（数字のみ）です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Pre-approval ID (Only number).&lt;br&gt; &lt;/div&gt; 
   * @return preApprovalId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_APPROVAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreApprovalId() {
    return preApprovalId;
  }


  @JsonProperty(JSON_PROPERTY_PRE_APPROVAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreApprovalId(String preApprovalId) {
    this.preApprovalId = preApprovalId;
  }


  public GuaranteedAdGroupAd landingPageUpdateScheduledTime(String landingPageUpdateScheduledTime) {
    
    this.landingPageUpdateScheduledTime = landingPageUpdateScheduledTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先更新予定日時です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※フォーマット：yyyyMMddHHmm&lt;br&gt;  &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The scheduled update date and time for the landing page.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; *format: yyyyMMddHHmm&lt;br&gt; &lt;/div&gt; 
   * @return landingPageUpdateScheduledTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_UPDATE_SCHEDULED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLandingPageUpdateScheduledTime() {
    return landingPageUpdateScheduledTime;
  }


  @JsonProperty(JSON_PROPERTY_LANDING_PAGE_UPDATE_SCHEDULED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandingPageUpdateScheduledTime(String landingPageUpdateScheduledTime) {
    this.landingPageUpdateScheduledTime = landingPageUpdateScheduledTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAd guaranteedAdGroupAd = (GuaranteedAdGroupAd) o;
    return Objects.equals(this.accountId, guaranteedAdGroupAd.accountId) &&
        Objects.equals(this.ad, guaranteedAdGroupAd.ad) &&
        Objects.equals(this.adGroupId, guaranteedAdGroupAd.adGroupId) &&
        Objects.equals(this.adGroupName, guaranteedAdGroupAd.adGroupName) &&
        Objects.equals(this.adId, guaranteedAdGroupAd.adId) &&
        Objects.equals(this.adName, guaranteedAdGroupAd.adName) &&
        Objects.equals(this.approvalStatus, guaranteedAdGroupAd.approvalStatus) &&
        Objects.equals(this.campaignId, guaranteedAdGroupAd.campaignId) &&
        Objects.equals(this.campaignName, guaranteedAdGroupAd.campaignName) &&
        Objects.equals(this.disapprovalReasonCodes, guaranteedAdGroupAd.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonDescription, guaranteedAdGroupAd.disapprovalReasonDescription) &&
        Objects.equals(this.impressionBeaconUrls, guaranteedAdGroupAd.impressionBeaconUrls) &&
        Objects.equals(this.viewableImpressionBeaconUrls, guaranteedAdGroupAd.viewableImpressionBeaconUrls) &&
        Objects.equals(this.labels, guaranteedAdGroupAd.labels) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAd.mediaId) &&
        Objects.equals(this.thirdPartyTrackingScriptUrl, guaranteedAdGroupAd.thirdPartyTrackingScriptUrl) &&
        Objects.equals(this.thirdPartyTrackingVendor, guaranteedAdGroupAd.thirdPartyTrackingVendor) &&
        Objects.equals(this.userStatus, guaranteedAdGroupAd.userStatus) &&
        Objects.equals(this.landingPageStatus, guaranteedAdGroupAd.landingPageStatus) &&
        Objects.equals(this.preApprovalId, guaranteedAdGroupAd.preApprovalId) &&
        Objects.equals(this.landingPageUpdateScheduledTime, guaranteedAdGroupAd.landingPageUpdateScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adId, adName, approvalStatus, campaignId, campaignName, disapprovalReasonCodes, disapprovalReasonDescription, impressionBeaconUrls, viewableImpressionBeaconUrls, labels, mediaId, thirdPartyTrackingScriptUrl, thirdPartyTrackingVendor, userStatus, landingPageStatus, preApprovalId, landingPageUpdateScheduledTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAd {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonDescription: ").append(toIndentedString(disapprovalReasonDescription)).append("\n");
    sb.append("    impressionBeaconUrls: ").append(toIndentedString(impressionBeaconUrls)).append("\n");
    sb.append("    viewableImpressionBeaconUrls: ").append(toIndentedString(viewableImpressionBeaconUrls)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thirdPartyTrackingScriptUrl: ").append(toIndentedString(thirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    thirdPartyTrackingVendor: ").append(toIndentedString(thirdPartyTrackingVendor)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    landingPageStatus: ").append(toIndentedString(landingPageStatus)).append("\n");
    sb.append("    preApprovalId: ").append(toIndentedString(preApprovalId)).append("\n");
    sb.append("    landingPageUpdateScheduledTime: ").append(toIndentedString(landingPageUpdateScheduledTime)).append("\n");
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

