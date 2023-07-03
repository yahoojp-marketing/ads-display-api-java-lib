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
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceAsset;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceResponsiveImageAdオブジェクトは、レスポンシブ広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがRESPONSIVE_IMAGE_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceResponsiveImageAd object describes the Responsive Ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is RESPONSIVE_IMAGE_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_BUTTON_TEXT,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_DISPLAY_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_FINAL_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_LOGO_MEDIA_ID,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_PRINCIPAL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_TRACKING_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_URL,
  AdGroupAdServiceResponsiveImageAd.JSON_PROPERTY_ASSET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceResponsiveImageAd {
  public static final String JSON_PROPERTY_BUTTON_TEXT = "buttonText";
  private AdGroupAdServiceButtonText buttonText;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private AdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private AdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL = "isRemoveSmartphoneFinalUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID = "isRemoveLogoMediaId";
  private AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID = "logoMediaId";
  private Long logoMediaId;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private AdGroupAdServiceAsset asset;

  public AdGroupAdServiceResponsiveImageAd() {
  }

  public AdGroupAdServiceResponsiveImageAd buttonText(AdGroupAdServiceButtonText buttonText) {
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUTTON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceButtonText getButtonText() {
    return buttonText;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
  }


  public AdGroupAdServiceResponsiveImageAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
    
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

  public AdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public AdGroupAdServiceResponsiveImageAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 説明文です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※レスポンシブディスプレイ広告を利用する場合は指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *Cannot be specified when using responsive display ads. 
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AdGroupAdServiceResponsiveImageAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時にurlを指定する場合、このフィールドは必須です。&lt;br&gt; ADD時にfinalUrlを指定する場合、このフィールドを指定することはできません。代わりにfinalUrlから生成された値が自動で設定されます。&lt;br&gt; ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。&lt;br&gt; - iOSの場合：itunes.apple.com&lt;br&gt; - Androidの場合：play.google.com &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; If you specify url in ADD operation, this field is required.&lt;br&gt; When finalUrl is specified in ADD operation, this field cannot be specified. Instead, the value generated from finalUrl will be set automatically.&lt;br&gt; However, not allowed for ADD and SET when a campaign goal is \&quot;app promotion\&quot;. Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.&lt;br&gt; - For iOS : itunes.apple.com&lt;br&gt; - For Android : play.google.com &lt;/div&gt; 
   * @return displayUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayUrl() {
    return displayUrl;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public AdGroupAdServiceResponsiveImageAd displayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

   /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }


  public AdGroupAdServiceResponsiveImageAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。&lt;br&gt; finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。&lt;br&gt; SET時は省略可能となります。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。&lt;br&gt; キャンペーン目的「アプリ訴求」の場合は、このフィールドには以下のURLのみ設定できます。&lt;br&gt; - iOSの場合：itunes.apple.com, apps.apple.com&lt;br&gt; - Androidの場合：play.google.com &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.&lt;br&gt; If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared.&lt;br&gt; If campaignGoal is APP_PROMOTION, only the following URL can be set in this field.&lt;br&gt; - For iOS : itunes.apple.com, apps.apple.com&lt;br&gt; - For Android : play.google.com &lt;/div&gt; 
   * @return finalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalUrl() {
    return finalUrl;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }


  public AdGroupAdServiceResponsiveImageAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL (smartphone).&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; Not allowed for ADD and SET when a campaign goal is \&quot;app promotion\&quot;.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared. &lt;/div&gt; 
   * @return smartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }


  public AdGroupAdServiceResponsiveImageAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; タイトルです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※レスポンシブディスプレイ広告を利用する場合は指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Title.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *Cannot be specified when using responsive display ads. &lt;/div&gt; 
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public AdGroupAdServiceResponsiveImageAd isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

   /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  public AdGroupAdServiceResponsiveImageAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
    return this;
  }

   /**
   * Get isRemoveLogoMediaId
   * @return isRemoveLogoMediaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }


  public AdGroupAdServiceResponsiveImageAd isRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public AdGroupAdServiceResponsiveImageAd logoMediaId(Long logoMediaId) {
    
    this.logoMediaId = logoMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴ画像のメディアIDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of logo image.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return logoMediaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogoMediaId() {
    return logoMediaId;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
  }


  public AdGroupAdServiceResponsiveImageAd principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の主体者表記です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Advertiser Indication of the ad.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. &lt;/div&gt; 
   * @return principal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public AdGroupAdServiceResponsiveImageAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared. &lt;/div&gt; 
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


  public AdGroupAdServiceResponsiveImageAd url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; アプリ訴求キャンペーンで設定可能なリンク先URLについては&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;ja&amp;aid&#x3D;61528\&quot;&gt;こちら&lt;/a&gt;をご参照ください。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。&lt;br&gt; urlフィールドを設定する場合、displayUrlの指定が必須になります。またその際は、finalUrl、smartphoneFinalUrl、trackingUrl、customParametersは指定不可です。&lt;br&gt; SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。&lt;br&gt; ※現在は指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; For information about the destination URL that can be set with campaigns for \&quot;app promotion\&quot;, refer to &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan&#x3D;en&amp;aid&#x3D;39261\&quot;&gt;this page&lt;/a&gt;.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.&lt;br&gt; When url field is specified, displayUrl must be specified. In that case, finalUrl, smartphoneFinalUrl, trackingUrl and customParameters cannot be specified.&lt;br&gt; If finalUrl is specified in SET operation, the value in this field will be cleared.&lt;br&gt; ※Not available. &lt;/div&gt; 
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public AdGroupAdServiceResponsiveImageAd asset(AdGroupAdServiceAsset asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAsset getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsset(AdGroupAdServiceAsset asset) {
    this.asset = asset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceResponsiveImageAd adGroupAdServiceResponsiveImageAd = (AdGroupAdServiceResponsiveImageAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceResponsiveImageAd.buttonText) &&
        Objects.equals(this.customParameters, adGroupAdServiceResponsiveImageAd.customParameters) &&
        Objects.equals(this.description, adGroupAdServiceResponsiveImageAd.description) &&
        Objects.equals(this.displayUrl, adGroupAdServiceResponsiveImageAd.displayUrl) &&
        Objects.equals(this.displayUrlLevel, adGroupAdServiceResponsiveImageAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, adGroupAdServiceResponsiveImageAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceResponsiveImageAd.smartphoneFinalUrl) &&
        Objects.equals(this.headline, adGroupAdServiceResponsiveImageAd.headline) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceResponsiveImageAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveLogoMediaId, adGroupAdServiceResponsiveImageAd.isRemoveLogoMediaId) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroupAdServiceResponsiveImageAd.isRemoveTrackingUrl) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceResponsiveImageAd.logoMediaId) &&
        Objects.equals(this.principal, adGroupAdServiceResponsiveImageAd.principal) &&
        Objects.equals(this.trackingUrl, adGroupAdServiceResponsiveImageAd.trackingUrl) &&
        Objects.equals(this.url, adGroupAdServiceResponsiveImageAd.url) &&
        Objects.equals(this.asset, adGroupAdServiceResponsiveImageAd.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, customParameters, description, displayUrl, displayUrlLevel, finalUrl, smartphoneFinalUrl, headline, isRemoveSmartphoneFinalUrl, isRemoveLogoMediaId, isRemoveTrackingUrl, logoMediaId, principal, trackingUrl, url, asset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveImageAd {\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveLogoMediaId: ").append(toIndentedString(isRemoveLogoMediaId)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

