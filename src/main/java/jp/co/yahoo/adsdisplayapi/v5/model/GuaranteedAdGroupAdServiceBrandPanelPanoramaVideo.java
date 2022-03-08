/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaVideoオブジェクトは、予約型専用広告：4:1の縮小機能付き動画で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo object describes information about a guaranteed ad composed of 4:1 video with reduction function.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaVideoオブジェクトは、予約型専用広告：4:1の縮小機能付き動画で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo object describes information about a guaranteed ad composed of 4:1 video with reduction function.<br> This field is optional.<br> </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_URL,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_THUMBNAIL_MEDIA_ID,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo.JSON_PROPERTY_VIDEO_START_BEACON_URLS
})
@JsonTypeName("GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo {
  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID = "adShrinkMainMediaId";
  private Long adShrinkMainMediaId;

  public static final String JSON_PROPERTY_THUMBNAIL_MEDIA_ID = "thumbnailMediaId";
  private Long thumbnailMediaId;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS = "isRemoveVideo10SecBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS = "isRemoveVideo25PercentBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS = "isRemoveVideo3SecBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS = "isRemoveVideo50PercentBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS = "isRemoveVideo75PercentBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS = "isRemoveVideoCompleteBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls;

  public static final String JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS = "isRemoveVideoStartBeaconUrls";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls;

  public static final String JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS = "video3SecBeaconUrls";
  private List<String> video3SecBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS = "video25PercentBeaconUrls";
  private List<String> video25PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS = "video50PercentBeaconUrls";
  private List<String> video50PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS = "video75PercentBeaconUrls";
  private List<String> video75PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS = "video10SecBeaconUrls";
  private List<String> video10SecBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS = "videoCompleteBeaconUrls";
  private List<String> videoCompleteBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO_START_BEACON_URLS = "videoStartBeaconUrls";
  private List<String> videoStartBeaconUrls = null;

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo() { 
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo adShrinkMainMediaId(Long adShrinkMainMediaId) {
    
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 縮小メイン画像です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reduced main image.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adShrinkMainMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }


  @JsonProperty(JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo thumbnailMediaId(Long thumbnailMediaId) {
    
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サムネイルIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Thumbnail ID.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return thumbnailMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideo10SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo10SecBeaconUrls
   * @return isRemoveVideo10SecBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo10SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideo25PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo25PercentBeaconUrls
   * @return isRemoveVideo25PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo25PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideo3SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo3SecBeaconUrls
   * @return isRemoveVideo3SecBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo3SecBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideo50PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo50PercentBeaconUrls
   * @return isRemoveVideo50PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo50PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideo75PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideo75PercentBeaconUrls
   * @return isRemoveVideo75PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo75PercentBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideoCompleteBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideoCompleteBeaconUrls
   * @return isRemoveVideoCompleteBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoCompleteBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo isRemoveVideoStartBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
    return this;
  }

   /**
   * Get isRemoveVideoStartBeaconUrls
   * @return isRemoveVideoStartBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoStartBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    
    this.video3SecBeaconUrls = video3SecBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null) {
      this.video3SecBeaconUrls = new ArrayList<>();
    }
    this.video3SecBeaconUrls.add(video3SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 3秒視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (3 seconds).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return video3SecBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null) {
      this.video25PercentBeaconUrls = new ArrayList<>();
    }
    this.video25PercentBeaconUrls.add(video25PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 25％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (25%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return video25PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null) {
      this.video50PercentBeaconUrls = new ArrayList<>();
    }
    this.video50PercentBeaconUrls.add(video50PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 50％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (50%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return video50PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null) {
      this.video75PercentBeaconUrls = new ArrayList<>();
    }
    this.video75PercentBeaconUrls.add(video75PercentBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 75％再生視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Playback viewing beacon URL (75%).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return video75PercentBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    
    this.video10SecBeaconUrls = video10SecBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null) {
      this.video10SecBeaconUrls = new ArrayList<>();
    }
    this.video10SecBeaconUrls.add(video10SecBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 10秒視聴ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (10 seconds).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return video10SecBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null) {
      this.videoCompleteBeaconUrls = new ArrayList<>();
    }
    this.videoCompleteBeaconUrls.add(videoCompleteBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生完了ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (complete).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return videoCompleteBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    
    this.videoStartBeaconUrls = videoStartBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null) {
      this.videoStartBeaconUrls = new ArrayList<>();
    }
    this.videoStartBeaconUrls.add(videoStartBeaconUrlsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 再生開始ビーコンURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時はすべて上書きされます。&lt;br&gt; ※httpsのURLのみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewing beacon URL (start).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; ∗Replace all URLs in SET operation.&lt;br&gt; ∗Available URL is only &amp;#34;https&amp;#34;. &lt;/div&gt; 
   * @return videoStartBeaconUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")
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
    GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo guaranteedAdGroupAdServiceBrandPanelPanoramaVideo = (GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.displayUrl) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.url) &&
        Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.adShrinkMainMediaId) &&
        Objects.equals(this.thumbnailMediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.thumbnailMediaId) &&
        Objects.equals(this.isRemoveVideo10SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.video3SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.video25PercentBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.video75PercentBeaconUrls) &&
        Objects.equals(this.video10SecBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.video10SecBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, guaranteedAdGroupAdServiceBrandPanelPanoramaVideo.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, url, adShrinkMainMediaId, thumbnailMediaId, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, video3SecBeaconUrls, video25PercentBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, video10SecBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo {\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    adShrinkMainMediaId: ").append(toIndentedString(adShrinkMainMediaId)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    isRemoveVideo10SecBeaconUrls: ").append(toIndentedString(isRemoveVideo10SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo25PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo25PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo3SecBeaconUrls: ").append(toIndentedString(isRemoveVideo3SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo50PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo50PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo75PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo75PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoCompleteBeaconUrls: ").append(toIndentedString(isRemoveVideoCompleteBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoStartBeaconUrls: ").append(toIndentedString(isRemoveVideoStartBeaconUrls)).append("\n");
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

