/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v16.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v16.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelQuintieオブジェクトは、ブランドパネル クインティ広告の情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelQuintie object describes information of Brand Panel Quintuple ad.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_THUMBNAIL_MEDIA_ID,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_TRACKING_URL,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelQuintie.JSON_PROPERTY_VIDEO_START_BEACON_URLS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceBrandPanelQuintie {
  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_THUMBNAIL_MEDIA_ID = "thumbnailMediaId";
  private Long thumbnailMediaId;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS = "video3SecBeaconUrls";
  private List<String> video3SecBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS = "video25PercentBeaconUrls";
  private List<String> video25PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS = "video50PercentBeaconUrls";
  private List<String> video50PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS = "video75PercentBeaconUrls";
  private List<String> video75PercentBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS = "video10SecBeaconUrls";
  private List<String> video10SecBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS = "videoCompleteBeaconUrls";
  private List<String> videoCompleteBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO_START_BEACON_URLS = "videoStartBeaconUrls";
  private List<String> videoStartBeaconUrls;

  public GuaranteedAdGroupAdServiceBrandPanelQuintie() {
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie thumbnailMediaId(Long thumbnailMediaId) {
    
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サムネイルIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Thumbnail ID.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
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

  public GuaranteedAdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public GuaranteedAdGroupAdServiceBrandPanelQuintie displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
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

  public GuaranteedAdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }


  public GuaranteedAdGroupAdServiceBrandPanelQuintie finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; If you specify finalUrl, trackingUrl and customParameters will be optional.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; * Not Available. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; * Not Available. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    
    this.video3SecBeaconUrls = video3SecBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null) {
      this.video3SecBeaconUrls = new ArrayList<>();
    }
    this.video3SecBeaconUrls.add(video3SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 3秒視聴ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (3 seconds).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null) {
      this.video25PercentBeaconUrls = new ArrayList<>();
    }
    this.video25PercentBeaconUrls.add(video25PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 25％再生視聴ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (25%).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null) {
      this.video50PercentBeaconUrls = new ArrayList<>();
    }
    this.video50PercentBeaconUrls.add(video50PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 50％再生視聴ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (50%).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null) {
      this.video75PercentBeaconUrls = new ArrayList<>();
    }
    this.video75PercentBeaconUrls.add(video75PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 75％再生視聴ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (75%).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    
    this.video10SecBeaconUrls = video10SecBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null) {
      this.video10SecBeaconUrls = new ArrayList<>();
    }
    this.video10SecBeaconUrls.add(video10SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 10秒視聴ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (10 seconds).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null) {
      this.videoCompleteBeaconUrls = new ArrayList<>();
    }
    this.videoCompleteBeaconUrls.add(videoCompleteBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生完了ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (complete).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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


  public GuaranteedAdGroupAdServiceBrandPanelQuintie videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    
    this.videoStartBeaconUrls = videoStartBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelQuintie addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null) {
      this.videoStartBeaconUrls = new ArrayList<>();
    }
    this.videoStartBeaconUrls.add(videoStartBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生開始ビーコンURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (start).&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
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
    GuaranteedAdGroupAdServiceBrandPanelQuintie guaranteedAdGroupAdServiceBrandPanelQuintie = (GuaranteedAdGroupAdServiceBrandPanelQuintie) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceBrandPanelQuintie.displayUrl) &&
        Objects.equals(this.thumbnailMediaId, guaranteedAdGroupAdServiceBrandPanelQuintie.thumbnailMediaId) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceBrandPanelQuintie.customParameters) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceBrandPanelQuintie.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceBrandPanelQuintie.finalUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceBrandPanelQuintie.trackingUrl) &&
        Objects.equals(this.video3SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.video3SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.video25PercentBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.video75PercentBeaconUrls) &&
        Objects.equals(this.video10SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.video10SecBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, guaranteedAdGroupAdServiceBrandPanelQuintie.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, thumbnailMediaId, customParameters, displayUrlLevel, finalUrl, trackingUrl, video3SecBeaconUrls, video25PercentBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, video10SecBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBrandPanelQuintie {\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    video3SecBeaconUrls: ").append(toIndentedString(video3SecBeaconUrls)).append("\n");
    sb.append("    video25PercentBeaconUrls: ").append(toIndentedString(video25PercentBeaconUrls)).append("\n");
    sb.append("    video50PercentBeaconUrls: ").append(toIndentedString(video50PercentBeaconUrls)).append("\n");
    sb.append("    video75PercentBeaconUrls: ").append(toIndentedString(video75PercentBeaconUrls)).append("\n");
    sb.append("    video10SecBeaconUrls: ").append(toIndentedString(video10SecBeaconUrls)).append("\n");
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

