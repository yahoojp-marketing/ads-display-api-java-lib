package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceIsRemoveFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceResponsiveVideoAdオブジェクトは、動画広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがRESPONSIVE_VIDEO_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceResponsiveVideoAd object displays Video Ads information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is RESPONSIVE_VIDEO_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceResponsiveVideoAdオブジェクトは、動画広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがRESPONSIVE_VIDEO_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceResponsiveVideoAd object displays Video Ads information.<br> This field is optional.<br> *If adType is RESPONSIVE_VIDEO_AD, this field is required in ADD operation. </div> ")

public class AdGroupAdServiceResponsiveVideoAd   {
  @JsonProperty("buttonText")
  private JsonNullable<AdGroupAdServiceButtonText> buttonText = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("displayUrl")
  private JsonNullable<String> displayUrl = JsonNullable.undefined();

  @JsonProperty("headline")
  private JsonNullable<String> headline = JsonNullable.undefined();

  @JsonProperty("isRemoveLogoMediaId")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveLogoMediaId = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo10SecBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo10SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo25PercentBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo25PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo3SecBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo3SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo50PercentBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo50PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideo75PercentBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo75PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideoCompleteBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideoCompleteBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveVideoStartBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideoStartBeaconUrls = JsonNullable.undefined();

  @JsonProperty("logoMediaId")
  private JsonNullable<Long> logoMediaId = JsonNullable.undefined();

  @JsonProperty("principal")
  private JsonNullable<String> principal = JsonNullable.undefined();

  @JsonProperty("thumbnailMediaId")
  private JsonNullable<Long> thumbnailMediaId = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  @JsonProperty("video10SecBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video10SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video25PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video25PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video3SecBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video3SecBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video50PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video50PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("video75PercentBeaconUrls")
  @Valid
  private JsonNullable<List<String>> video75PercentBeaconUrls = JsonNullable.undefined();

  @JsonProperty("videoCompleteBeaconUrls")
  @Valid
  private JsonNullable<List<String>> videoCompleteBeaconUrls = JsonNullable.undefined();

  @JsonProperty("videoStartBeaconUrls")
  @Valid
  private JsonNullable<List<String>> videoStartBeaconUrls = JsonNullable.undefined();

  public AdGroupAdServiceResponsiveVideoAd buttonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = JsonNullable.of(buttonText);
    return this;
  }

  /**
   * Get buttonText
   * @return buttonText
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceButtonText> getButtonText() {
    return buttonText;
  }

  public void setButtonText(JsonNullable<AdGroupAdServiceButtonText> buttonText) {
    this.buttonText = buttonText;
  }

  public AdGroupAdServiceResponsiveVideoAd description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public AdGroupAdServiceResponsiveVideoAd displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd headline(String headline) {
    this.headline = JsonNullable.of(headline);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getHeadline() {
    return headline;
  }

  public void setHeadline(JsonNullable<String> headline) {
    this.headline = headline;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = JsonNullable.of(isRemoveLogoMediaId);
    return this;
  }

  /**
   * Get isRemoveLogoMediaId
   * @return isRemoveLogoMediaId
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }

  public void setIsRemoveLogoMediaId(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = JsonNullable.of(isRemoveVideo10SecBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo10SecBeaconUrls
   * @return isRemoveVideo10SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }

  public void setIsRemoveVideo10SecBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = JsonNullable.of(isRemoveVideo25PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo25PercentBeaconUrls
   * @return isRemoveVideo25PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }

  public void setIsRemoveVideo25PercentBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = JsonNullable.of(isRemoveVideo3SecBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo3SecBeaconUrls
   * @return isRemoveVideo3SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }

  public void setIsRemoveVideo3SecBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = JsonNullable.of(isRemoveVideo50PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo50PercentBeaconUrls
   * @return isRemoveVideo50PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }

  public void setIsRemoveVideo50PercentBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = JsonNullable.of(isRemoveVideo75PercentBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideo75PercentBeaconUrls
   * @return isRemoveVideo75PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }

  public void setIsRemoveVideo75PercentBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = JsonNullable.of(isRemoveVideoCompleteBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideoCompleteBeaconUrls
   * @return isRemoveVideoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }

  public void setIsRemoveVideoCompleteBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = JsonNullable.of(isRemoveVideoStartBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveVideoStartBeaconUrls
   * @return isRemoveVideoStartBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }

  public void setIsRemoveVideoStartBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = JsonNullable.of(logoMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(JsonNullable<Long> logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd principal(String principal) {
    this.principal = JsonNullable.of(principal);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> ")


  public JsonNullable<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(JsonNullable<String> principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceResponsiveVideoAd thumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = JsonNullable.of(thumbnailMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return thumbnailMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getThumbnailMediaId() {
    return thumbnailMediaId;
  }

  public void setThumbnailMediaId(JsonNullable<Long> thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public AdGroupAdServiceResponsiveVideoAd video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = JsonNullable.of(video10SecBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null || !this.video10SecBeaconUrls.isPresent()) {
      this.video10SecBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video10SecBeaconUrls.get().add(video10SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video10SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo10SecBeaconUrls() {
    return video10SecBeaconUrls;
  }

  public void setVideo10SecBeaconUrls(JsonNullable<List<String>> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = video10SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = JsonNullable.of(video25PercentBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null || !this.video25PercentBeaconUrls.isPresent()) {
      this.video25PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video25PercentBeaconUrls.get().add(video25PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video25PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo25PercentBeaconUrls() {
    return video25PercentBeaconUrls;
  }

  public void setVideo25PercentBeaconUrls(JsonNullable<List<String>> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = JsonNullable.of(video3SecBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null || !this.video3SecBeaconUrls.isPresent()) {
      this.video3SecBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video3SecBeaconUrls.get().add(video3SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video3SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo3SecBeaconUrls() {
    return video3SecBeaconUrls;
  }

  public void setVideo3SecBeaconUrls(JsonNullable<List<String>> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = video3SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = JsonNullable.of(video50PercentBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null || !this.video50PercentBeaconUrls.isPresent()) {
      this.video50PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video50PercentBeaconUrls.get().add(video50PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video50PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo50PercentBeaconUrls() {
    return video50PercentBeaconUrls;
  }

  public void setVideo50PercentBeaconUrls(JsonNullable<List<String>> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = JsonNullable.of(video75PercentBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null || !this.video75PercentBeaconUrls.isPresent()) {
      this.video75PercentBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.video75PercentBeaconUrls.get().add(video75PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video75PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideo75PercentBeaconUrls() {
    return video75PercentBeaconUrls;
  }

  public void setVideo75PercentBeaconUrls(JsonNullable<List<String>> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = JsonNullable.of(videoCompleteBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null || !this.videoCompleteBeaconUrls.isPresent()) {
      this.videoCompleteBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.videoCompleteBeaconUrls.get().add(videoCompleteBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideoCompleteBeaconUrls() {
    return videoCompleteBeaconUrls;
  }

  public void setVideoCompleteBeaconUrls(JsonNullable<List<String>> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = JsonNullable.of(videoStartBeaconUrls);
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null || !this.videoStartBeaconUrls.isPresent()) {
      this.videoStartBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.videoStartBeaconUrls.get().add(videoStartBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoStartBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public JsonNullable<List<String>> getVideoStartBeaconUrls() {
    return videoStartBeaconUrls;
  }

  public void setVideoStartBeaconUrls(JsonNullable<List<String>> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = videoStartBeaconUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceResponsiveVideoAd adGroupAdServiceResponsiveVideoAd = (AdGroupAdServiceResponsiveVideoAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceResponsiveVideoAd.buttonText) &&
        Objects.equals(this.description, adGroupAdServiceResponsiveVideoAd.description) &&
        Objects.equals(this.displayUrl, adGroupAdServiceResponsiveVideoAd.displayUrl) &&
        Objects.equals(this.headline, adGroupAdServiceResponsiveVideoAd.headline) &&
        Objects.equals(this.isRemoveLogoMediaId, adGroupAdServiceResponsiveVideoAd.isRemoveLogoMediaId) &&
        Objects.equals(this.isRemoveVideo10SecBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideo10SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo25PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideo25PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo3SecBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideo3SecBeaconUrls) &&
        Objects.equals(this.isRemoveVideo50PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideo50PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideo75PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideo75PercentBeaconUrls) &&
        Objects.equals(this.isRemoveVideoCompleteBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideoCompleteBeaconUrls) &&
        Objects.equals(this.isRemoveVideoStartBeaconUrls, adGroupAdServiceResponsiveVideoAd.isRemoveVideoStartBeaconUrls) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceResponsiveVideoAd.logoMediaId) &&
        Objects.equals(this.principal, adGroupAdServiceResponsiveVideoAd.principal) &&
        Objects.equals(this.thumbnailMediaId, adGroupAdServiceResponsiveVideoAd.thumbnailMediaId) &&
        Objects.equals(this.url, adGroupAdServiceResponsiveVideoAd.url) &&
        Objects.equals(this.video10SecBeaconUrls, adGroupAdServiceResponsiveVideoAd.video10SecBeaconUrls) &&
        Objects.equals(this.video25PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.video25PercentBeaconUrls) &&
        Objects.equals(this.video3SecBeaconUrls, adGroupAdServiceResponsiveVideoAd.video3SecBeaconUrls) &&
        Objects.equals(this.video50PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.video50PercentBeaconUrls) &&
        Objects.equals(this.video75PercentBeaconUrls, adGroupAdServiceResponsiveVideoAd.video75PercentBeaconUrls) &&
        Objects.equals(this.videoCompleteBeaconUrls, adGroupAdServiceResponsiveVideoAd.videoCompleteBeaconUrls) &&
        Objects.equals(this.videoStartBeaconUrls, adGroupAdServiceResponsiveVideoAd.videoStartBeaconUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, description, displayUrl, headline, isRemoveLogoMediaId, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, logoMediaId, principal, thumbnailMediaId, url, video10SecBeaconUrls, video25PercentBeaconUrls, video3SecBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveVideoAd {\n");
    
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    isRemoveLogoMediaId: ").append(toIndentedString(isRemoveLogoMediaId)).append("\n");
    sb.append("    isRemoveVideo10SecBeaconUrls: ").append(toIndentedString(isRemoveVideo10SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo25PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo25PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo3SecBeaconUrls: ").append(toIndentedString(isRemoveVideo3SecBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo50PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo50PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideo75PercentBeaconUrls: ").append(toIndentedString(isRemoveVideo75PercentBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoCompleteBeaconUrls: ").append(toIndentedString(isRemoveVideoCompleteBeaconUrls)).append("\n");
    sb.append("    isRemoveVideoStartBeaconUrls: ").append(toIndentedString(isRemoveVideoStartBeaconUrls)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

