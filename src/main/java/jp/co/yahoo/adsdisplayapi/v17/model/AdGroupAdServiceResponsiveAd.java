/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.AdGroupAdServiceAsset;
import jp.co.yahoo.adsdisplayapi.v17.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v17.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceResponsiveAdオブジェクトは、レスポンシブ広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがRESPONSIVE_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceResponsiveAd object displays Video Ads information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is RESPONSIVE_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_BUTTON_TEXT,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_LOGO_MEDIA_ID,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_PRINCIPAL,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_ASSET,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_THUMBNAIL_MEDIA_ID,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS,
  AdGroupAdServiceResponsiveAd.JSON_PROPERTY_VIDEO_START_BEACON_URLS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceResponsiveAd {
  public static final String JSON_PROPERTY_BUTTON_TEXT = "buttonText";
  private AdGroupAdServiceButtonText buttonText;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID = "logoMediaId";
  private Long logoMediaId;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private AdGroupAdServiceAsset asset;

  public static final String JSON_PROPERTY_THUMBNAIL_MEDIA_ID = "thumbnailMediaId";
  private Long thumbnailMediaId;

  public static final String JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID = "isRemoveLogoMediaId";
  private AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS = "isRemoveVideo10SecBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS = "isRemoveVideo25PercentBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS = "isRemoveVideo3SecBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS = "isRemoveVideo50PercentBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS = "isRemoveVideo75PercentBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS = "isRemoveVideoCompleteBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS = "isRemoveVideoStartBeaconUrls";
  private AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS = "video10SecBeaconUrls";
  private List<String> video10SecBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS = "video25PercentBeaconUrls";
  private List<String> video25PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS = "video3SecBeaconUrls";
  private List<String> video3SecBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS = "video50PercentBeaconUrls";
  private List<String> video50PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS = "video75PercentBeaconUrls";
  private List<String> video75PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS = "videoCompleteBeaconUrls";
  private List<String> videoCompleteBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO_START_BEACON_URLS = "videoStartBeaconUrls";
  private List<String> videoStartBeaconUrls;

  public AdGroupAdServiceResponsiveAd() {
  }

  public AdGroupAdServiceResponsiveAd buttonText(AdGroupAdServiceButtonText buttonText) {
    
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


  public AdGroupAdServiceResponsiveAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の説明文です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※レスポンシブディスプレイ広告を利用する場合は指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad description.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *Cannot be specified when using Responsive Ads for Display. &lt;/div&gt; 
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


  public AdGroupAdServiceResponsiveAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告のタイトルです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※レスポンシブディスプレイ広告を利用する場合は指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad title.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *Cannot be specified when using Responsive Ads for Display. &lt;/div&gt; 
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


  public AdGroupAdServiceResponsiveAd logoMediaId(Long logoMediaId) {
    
    this.logoMediaId = logoMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴの画像IDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Logo image ID.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
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


  public AdGroupAdServiceResponsiveAd principal(String principal) {
    
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


  public AdGroupAdServiceResponsiveAd asset(AdGroupAdServiceAsset asset) {
    
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


  public AdGroupAdServiceResponsiveAd thumbnailMediaId(Long thumbnailMediaId) {
    
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サムネイルIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Thumbnail ID.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return thumbnailMediaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getThumbnailMediaId() {
    return thumbnailMediaId;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }


  public AdGroupAdServiceResponsiveAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    
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


  public AdGroupAdServiceResponsiveAd isRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo10SecBeaconUrls
   * @return isRemoveVideo10SecBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo25PercentBeaconUrls
   * @return isRemoveVideo25PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo3SecBeaconUrls
   * @return isRemoveVideo3SecBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo50PercentBeaconUrls
   * @return isRemoveVideo50PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo75PercentBeaconUrls
   * @return isRemoveVideo75PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideoCompleteBeaconUrls
   * @return isRemoveVideoCompleteBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd isRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideoStartBeaconUrls
   * @return isRemoveVideoStartBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    
    this.video10SecBeaconUrls = video10SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null) {
      this.video10SecBeaconUrls = new ArrayList<>();
    }
    this.video10SecBeaconUrls.add(video10SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 10秒視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (10 seconds).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return video10SecBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideo10SecBeaconUrls() {
    return video10SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = video10SecBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null) {
      this.video25PercentBeaconUrls = new ArrayList<>();
    }
    this.video25PercentBeaconUrls.add(video25PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 25％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (25%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return video25PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideo25PercentBeaconUrls() {
    return video25PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    
    this.video3SecBeaconUrls = video3SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null) {
      this.video3SecBeaconUrls = new ArrayList<>();
    }
    this.video3SecBeaconUrls.add(video3SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 3秒視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (3 seconds).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return video3SecBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideo3SecBeaconUrls() {
    return video3SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = video3SecBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null) {
      this.video50PercentBeaconUrls = new ArrayList<>();
    }
    this.video50PercentBeaconUrls.add(video50PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 50％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (50%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return video50PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideo50PercentBeaconUrls() {
    return video50PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null) {
      this.video75PercentBeaconUrls = new ArrayList<>();
    }
    this.video75PercentBeaconUrls.add(video75PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 75％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (75%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return video75PercentBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideo75PercentBeaconUrls() {
    return video75PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideo75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null) {
      this.videoCompleteBeaconUrls = new ArrayList<>();
    }
    this.videoCompleteBeaconUrls.add(videoCompleteBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生完了ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (complete).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return videoCompleteBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideoCompleteBeaconUrls() {
    return videoCompleteBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
  }


  public AdGroupAdServiceResponsiveAd videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    
    this.videoStartBeaconUrls = videoStartBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveAd addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null) {
      this.videoStartBeaconUrls = new ArrayList<>();
    }
    this.videoStartBeaconUrls.add(videoStartBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生開始ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (start).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return videoStartBeaconUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideoStartBeaconUrls() {
    return videoStartBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = videoStartBeaconUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceResponsiveAd adGroupAdServiceResponsiveAd = (AdGroupAdServiceResponsiveAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceResponsiveAd.buttonText) &&
        Objects.equals(this.description, adGroupAdServiceResponsiveAd.description) &&
        Objects.equals(this.headline, adGroupAdServiceResponsiveAd.headline) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceResponsiveAd.logoMediaId) &&
        Objects.equals(this.principal, adGroupAdServiceResponsiveAd.principal) &&
        Objects.equals(this.asset, adGroupAdServiceResponsiveAd.asset) &&
        Objects.equals(this.thumbnailMediaId, adGroupAdServiceResponsiveAd.thumbnailMediaId) &&
        Objects.equals(this.isRemoveLogoMediaId, adGroupAdServiceResponsiveAd.isRemoveLogoMediaId) &&
        Objects.equals(this.isRemoveVideo10SecBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, adGroupAdServiceResponsiveAd.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.video10SecBeaconUrls, adGroupAdServiceResponsiveAd.video10SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, adGroupAdServiceResponsiveAd.video25PercentBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, adGroupAdServiceResponsiveAd.video3SecBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, adGroupAdServiceResponsiveAd.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, adGroupAdServiceResponsiveAd.video75PercentBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, adGroupAdServiceResponsiveAd.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, adGroupAdServiceResponsiveAd.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, description, headline, logoMediaId, principal, asset, thumbnailMediaId, isRemoveLogoMediaId, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, video10SecBeaconUrls, video25PercentBeaconUrls, video3SecBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveAd {\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    isRemoveLogoMediaId: ").append(toIndentedString(isRemoveLogoMediaId)).append("\n");
    sb.append("    isRemoveVideo10SecBeaconUrls: ").append(toIndentedString(isRemoveVideo10SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo25PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo25PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo3SecBeaconUrls: ").append(toIndentedString(isRemoveVideo3SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo50PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo50PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo75PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo75PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoCompleteBeaconUrls: ").append(toIndentedString(isRemoveVideoCompleteBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoStartBeaconUrls: ").append(toIndentedString(isRemoveVideoStartBeaconUrls)).append("\n");
    sb.append("    video10SecBeaconUrls: ").append(toIndentedString(video10SecBeaconUrls)).append("\n");
    sb.append("    video25PercentBeaconUrls: ").append(toIndentedString(video25PercentBeaconUrls)).append("\n");
    sb.append("    video3SecBeaconUrls: ").append(toIndentedString(video3SecBeaconUrls)).append("\n");
    sb.append("    video50PercentBeaconUrls: ").append(toIndentedString(video50PercentBeaconUrls)).append("\n");
    sb.append("    video75PercentBeaconUrls: ").append(toIndentedString(video75PercentBeaconUrls)).append("\n");
    sb.append("    videoCompleteBeaconUrls: ").append(toIndentedString(videoCompleteBeaconUrls)).append("\n");
    sb.append("    videoStartBeaconUrls: ").append(toIndentedString(videoStartBeaconUrls)).append("\n");
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

