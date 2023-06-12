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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceBannerAdオブジェクトは、バナー広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがBANNER_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceBannerAd object describes information of Banner ad.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is BANNER_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceBannerAdオブジェクトは、バナー広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがBANNER_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceBannerAd object describes information of Banner ad.<br> This field is optional.<br> *If adType is BANNER_AD, this field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_THUMBNAIL_MEDIA_ID,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS,
  AdGroupAdServiceBannerAd.JSON_PROPERTY_VIDEO_START_BEACON_URLS
})
@JsonTypeName("AdGroupAdServiceBannerAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceBannerAd {
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

  public static final String JSON_PROPERTY_THUMBNAIL_MEDIA_ID = "thumbnailMediaId";
  private Long thumbnailMediaId;

  public static final String JSON_PROPERTY_VIDEO10_SEC_BEACON_URLS = "video10SecBeaconUrls";
  private List<String> video10SecBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO25_PERCENT_BEACON_URLS = "video25PercentBeaconUrls";
  private List<String> video25PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO3_SEC_BEACON_URLS = "video3SecBeaconUrls";
  private List<String> video3SecBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO50_PERCENT_BEACON_URLS = "video50PercentBeaconUrls";
  private List<String> video50PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO75_PERCENT_BEACON_URLS = "video75PercentBeaconUrls";
  private List<String> video75PercentBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO_COMPLETE_BEACON_URLS = "videoCompleteBeaconUrls";
  private List<String> videoCompleteBeaconUrls = null;

  public static final String JSON_PROPERTY_VIDEO_START_BEACON_URLS = "videoStartBeaconUrls";
  private List<String> videoStartBeaconUrls = null;

  public AdGroupAdServiceBannerAd() { 
  }

  public AdGroupAdServiceBannerAd isRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO10_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO25_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO3_SEC_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO50_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO75_PERCENT_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_COMPLETE_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }


  public AdGroupAdServiceBannerAd isRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    
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

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_VIDEO_START_BEACON_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }


  public AdGroupAdServiceBannerAd thumbnailMediaId(Long thumbnailMediaId) {
    
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サムネイルIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※mainMediaFormatがVIDEOの場合にのみ指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Thumbnail ID.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *If mainMediaFormat is VIDEO, this field can be specified. &lt;/div&gt; 
   * @return thumbnailMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    
    this.video10SecBeaconUrls = video10SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    
    this.video3SecBeaconUrls = video3SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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


  public AdGroupAdServiceBannerAd videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    
    this.videoStartBeaconUrls = videoStartBeaconUrls;
    return this;
  }

  public AdGroupAdServiceBannerAd addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。<br> ※mainMediaFormatがVIDEOの場合にのみ指定できます。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;.<br> *If mainMediaFormat is VIDEO, this field can be specified. </div> ")
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
    AdGroupAdServiceBannerAd adGroupAdServiceBannerAd = (AdGroupAdServiceBannerAd) o;
    return Objects.equals(this.isRemoveVideo10SecBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, adGroupAdServiceBannerAd.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.thumbnailMediaId, adGroupAdServiceBannerAd.thumbnailMediaId) &&
        Objects.equals(this.video10SecBeaconUrls, adGroupAdServiceBannerAd.video10SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, adGroupAdServiceBannerAd.video25PercentBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, adGroupAdServiceBannerAd.video3SecBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, adGroupAdServiceBannerAd.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, adGroupAdServiceBannerAd.video75PercentBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, adGroupAdServiceBannerAd.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, adGroupAdServiceBannerAd.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, thumbnailMediaId, video10SecBeaconUrls, video25PercentBeaconUrls, video3SecBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceBannerAd {\n");
    sb.append("    isRemoveVideo10SecBeaconUrls: ").append(toIndentedString(isRemoveVideo10SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo25PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo25PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo3SecBeaconUrls: ").append(toIndentedString(isRemoveVideo3SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo50PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo50PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo75PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo75PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoCompleteBeaconUrls: ").append(toIndentedString(isRemoveVideoCompleteBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoStartBeaconUrls: ").append(toIndentedString(isRemoveVideoStartBeaconUrls)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
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

