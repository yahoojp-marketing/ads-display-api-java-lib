package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceResponsiveVideoAdオブジェクトは、動画広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがRESPONSIVE_VIDEO_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceResponsiveVideoAd object displays Video Ads information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is RESPONSIVE_VIDEO_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceResponsiveVideoAdオブジェクトは、動画広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがRESPONSIVE_VIDEO_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceResponsiveVideoAd object displays Video Ads information.<br> This field is optional.<br> *If adType is RESPONSIVE_VIDEO_AD, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceResponsiveVideoAd   {
  @JsonProperty("buttonText")
  private AdGroupAdServiceButtonText buttonText = null;

  @JsonProperty("customParameters")
  private AdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("displayUrlLevel")
  private AdGroupAdServiceDisplayUrlLevel displayUrlLevel = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("isRemoveSmartphoneFinalUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl = null;

  @JsonProperty("isRemoveLogoMediaId")
  private AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId = null;

  @JsonProperty("isRemoveTrackingUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl = null;

  @JsonProperty("isRemoveVideo10SecBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls = null;

  @JsonProperty("isRemoveVideo25PercentBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls = null;

  @JsonProperty("isRemoveVideo3SecBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls = null;

  @JsonProperty("isRemoveVideo50PercentBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls = null;

  @JsonProperty("isRemoveVideo75PercentBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls = null;

  @JsonProperty("isRemoveVideoCompleteBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls = null;

  @JsonProperty("isRemoveVideoStartBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls = null;

  @JsonProperty("logoMediaId")
  private Long logoMediaId = null;

  @JsonProperty("principal")
  private String principal = null;

  @JsonProperty("thumbnailMediaId")
  private Long thumbnailMediaId = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("video10SecBeaconUrls")
  @Valid
  private List<String> video10SecBeaconUrls = null;

  @JsonProperty("video25PercentBeaconUrls")
  @Valid
  private List<String> video25PercentBeaconUrls = null;

  @JsonProperty("video3SecBeaconUrls")
  @Valid
  private List<String> video3SecBeaconUrls = null;

  @JsonProperty("video50PercentBeaconUrls")
  @Valid
  private List<String> video50PercentBeaconUrls = null;

  @JsonProperty("video75PercentBeaconUrls")
  @Valid
  private List<String> video75PercentBeaconUrls = null;

  @JsonProperty("videoCompleteBeaconUrls")
  @Valid
  private List<String> videoCompleteBeaconUrls = null;

  @JsonProperty("videoStartBeaconUrls")
  @Valid
  private List<String> videoStartBeaconUrls = null;

  public AdGroupAdServiceResponsiveVideoAd buttonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   * @return buttonText
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceButtonText getButtonText() {
    return buttonText;
  }

  public void setButtonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
  }

  public AdGroupAdServiceResponsiveVideoAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public AdGroupAdServiceResponsiveVideoAd description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdGroupAdServiceResponsiveVideoAd displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> SET時、このフィールドは省略可能となります。<br> ADD時にurlを指定する場合、このフィールドは必須です。<br> ADD時にfinalUrlを指定する場合、このフィールドを指定することはできません。代わりにfinalUrlから生成された値が自動で設定されます。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in SET operation.<br> If you specify url in ADD operation, this field is required.<br> When finalUrl is specified in ADD operation, this field cannot be specified. Instead, the value generated from finalUrl will be set automatically.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> SET時、このフィールドは省略可能となります。<br> ADD時にurlを指定する場合、このフィールドは必須です。<br> ADD時にfinalUrlを指定する場合、このフィールドを指定することはできません。代わりにfinalUrlから生成された値が自動で設定されます。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in SET operation.<br> If you specify url in ADD operation, this field is required.<br> When finalUrl is specified in ADD operation, this field cannot be specified. Instead, the value generated from finalUrl will be set automatically.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd displayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

  /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }

  public void setDisplayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }

  public AdGroupAdServiceResponsiveVideoAd finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available. </div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available. </div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告のタイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

  /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }

  public void setIsRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
    return this;
  }

  /**
   * Get isRemoveLogoMediaId
   * @return isRemoveLogoMediaId
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }

  public void setIsRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

  /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }

  public void setIsRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideo10SecBeaconUrls
   * @return isRemoveVideo10SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo10SecBeaconUrls() {
    return isRemoveVideo10SecBeaconUrls;
  }

  public void setIsRemoveVideo10SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo10SecBeaconUrls) {
    this.isRemoveVideo10SecBeaconUrls = isRemoveVideo10SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideo25PercentBeaconUrls
   * @return isRemoveVideo25PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo25PercentBeaconUrls() {
    return isRemoveVideo25PercentBeaconUrls;
  }

  public void setIsRemoveVideo25PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo25PercentBeaconUrls) {
    this.isRemoveVideo25PercentBeaconUrls = isRemoveVideo25PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideo3SecBeaconUrls
   * @return isRemoveVideo3SecBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo3SecBeaconUrls() {
    return isRemoveVideo3SecBeaconUrls;
  }

  public void setIsRemoveVideo3SecBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo3SecBeaconUrls) {
    this.isRemoveVideo3SecBeaconUrls = isRemoveVideo3SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideo50PercentBeaconUrls
   * @return isRemoveVideo50PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo50PercentBeaconUrls() {
    return isRemoveVideo50PercentBeaconUrls;
  }

  public void setIsRemoveVideo50PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo50PercentBeaconUrls) {
    this.isRemoveVideo50PercentBeaconUrls = isRemoveVideo50PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideo75PercentBeaconUrls
   * @return isRemoveVideo75PercentBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideo75PercentBeaconUrls() {
    return isRemoveVideo75PercentBeaconUrls;
  }

  public void setIsRemoveVideo75PercentBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideo75PercentBeaconUrls) {
    this.isRemoveVideo75PercentBeaconUrls = isRemoveVideo75PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideoCompleteBeaconUrls
   * @return isRemoveVideoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoCompleteBeaconUrls() {
    return isRemoveVideoCompleteBeaconUrls;
  }

  public void setIsRemoveVideoCompleteBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoCompleteBeaconUrls) {
    this.isRemoveVideoCompleteBeaconUrls = isRemoveVideoCompleteBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd isRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveVideoStartBeaconUrls
   * @return isRemoveVideoStartBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveVideoStartBeaconUrls() {
    return isRemoveVideoStartBeaconUrls;
  }

  public void setIsRemoveVideoStartBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveVideoStartBeaconUrls) {
    this.isRemoveVideoStartBeaconUrls = isRemoveVideoStartBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> ")


  public Long getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd principal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンのアプリ名と同一の値が自動的に設定され、アプリ名以外の値には変更できません。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation.<br> However, if campaignGoal is APP_PROMOTION, it will automatically be set to the same value as appName of campaign, and it cannot be changed to any other value. </div> ")


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceResponsiveVideoAd thumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return thumbnailMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getThumbnailMediaId() {
    return thumbnailMediaId;
  }

  public void setThumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  public AdGroupAdServiceResponsiveVideoAd trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available. </div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available. </div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroupAdServiceResponsiveVideoAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v6/CampaignService/get/\">こちら</a>をご参照ください。<br> SET時、このフィールドは省略可能となります。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> urlフィールドを設定する場合、displayUrlの指定が必須になります。またその際は、finalUrl、smartphoneFinalUrl、trackingUrl、customParametersは指定不可です。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v6/CampaignService/get/en/\">this page</a>.<br> This field is optional in SET operation.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> When url field is specified, displayUrl must be specified. In that case, finalUrl, smartphoneFinalUrl, trackingUrl and customParameters cannot be specified.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v6/CampaignService/get/\">こちら</a>をご参照ください。<br> SET時、このフィールドは省略可能となります。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> urlフィールドを設定する場合、displayUrlの指定が必須になります。またその際は、finalUrl、smartphoneFinalUrl、trackingUrl、customParametersは指定不可です。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v6/CampaignService/get/en/\">this page</a>.<br> This field is optional in SET operation.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> When url field is specified, displayUrl must be specified. In that case, finalUrl, smartphoneFinalUrl, trackingUrl and customParameters cannot be specified.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdGroupAdServiceResponsiveVideoAd video10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = video10SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo10SecBeaconUrlsItem(String video10SecBeaconUrlsItem) {
    if (this.video10SecBeaconUrls == null) {
      this.video10SecBeaconUrls = new ArrayList<>();
    }
    this.video10SecBeaconUrls.add(video10SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video10SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 10秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (10 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideo10SecBeaconUrls() {
    return video10SecBeaconUrls;
  }

  public void setVideo10SecBeaconUrls(List<String> video10SecBeaconUrls) {
    this.video10SecBeaconUrls = video10SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo25PercentBeaconUrlsItem(String video25PercentBeaconUrlsItem) {
    if (this.video25PercentBeaconUrls == null) {
      this.video25PercentBeaconUrls = new ArrayList<>();
    }
    this.video25PercentBeaconUrls.add(video25PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video25PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 25％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (25%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideo25PercentBeaconUrls() {
    return video25PercentBeaconUrls;
  }

  public void setVideo25PercentBeaconUrls(List<String> video25PercentBeaconUrls) {
    this.video25PercentBeaconUrls = video25PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = video3SecBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo3SecBeaconUrlsItem(String video3SecBeaconUrlsItem) {
    if (this.video3SecBeaconUrls == null) {
      this.video3SecBeaconUrls = new ArrayList<>();
    }
    this.video3SecBeaconUrls.add(video3SecBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video3SecBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 3秒視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (3 seconds).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideo3SecBeaconUrls() {
    return video3SecBeaconUrls;
  }

  public void setVideo3SecBeaconUrls(List<String> video3SecBeaconUrls) {
    this.video3SecBeaconUrls = video3SecBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo50PercentBeaconUrlsItem(String video50PercentBeaconUrlsItem) {
    if (this.video50PercentBeaconUrls == null) {
      this.video50PercentBeaconUrls = new ArrayList<>();
    }
    this.video50PercentBeaconUrls.add(video50PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video50PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 50％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (50%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideo50PercentBeaconUrls() {
    return video50PercentBeaconUrls;
  }

  public void setVideo50PercentBeaconUrls(List<String> video50PercentBeaconUrls) {
    this.video50PercentBeaconUrls = video50PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd video75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideo75PercentBeaconUrlsItem(String video75PercentBeaconUrlsItem) {
    if (this.video75PercentBeaconUrls == null) {
      this.video75PercentBeaconUrls = new ArrayList<>();
    }
    this.video75PercentBeaconUrls.add(video75PercentBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return video75PercentBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 75％再生視聴ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Playback viewing beacon URL (75%).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideo75PercentBeaconUrls() {
    return video75PercentBeaconUrls;
  }

  public void setVideo75PercentBeaconUrls(List<String> video75PercentBeaconUrls) {
    this.video75PercentBeaconUrls = video75PercentBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd videoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideoCompleteBeaconUrlsItem(String videoCompleteBeaconUrlsItem) {
    if (this.videoCompleteBeaconUrls == null) {
      this.videoCompleteBeaconUrls = new ArrayList<>();
    }
    this.videoCompleteBeaconUrls.add(videoCompleteBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoCompleteBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生完了ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (complete).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideoCompleteBeaconUrls() {
    return videoCompleteBeaconUrls;
  }

  public void setVideoCompleteBeaconUrls(List<String> videoCompleteBeaconUrls) {
    this.videoCompleteBeaconUrls = videoCompleteBeaconUrls;
  }

  public AdGroupAdServiceResponsiveVideoAd videoStartBeaconUrls(List<String> videoStartBeaconUrls) {
    this.videoStartBeaconUrls = videoStartBeaconUrls;
    return this;
  }

  public AdGroupAdServiceResponsiveVideoAd addVideoStartBeaconUrlsItem(String videoStartBeaconUrlsItem) {
    if (this.videoStartBeaconUrls == null) {
      this.videoStartBeaconUrls = new ArrayList<>();
    }
    this.videoStartBeaconUrls.add(videoStartBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> 
   * @return videoStartBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 再生開始ビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時はすべて上書きされます。<br> ※httpsのURLのみ設定可能です。 </div> <div lang=\"en\"> Viewing beacon URL (start).<br> This field is optional in ADD and SET operation.<br> ∗Replace all URLs in SET operation.<br> ∗Available URL is only &#34;https&#34;. </div> ")


  public List<String> getVideoStartBeaconUrls() {
    return videoStartBeaconUrls;
  }

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
    AdGroupAdServiceResponsiveVideoAd adGroupAdServiceResponsiveVideoAd = (AdGroupAdServiceResponsiveVideoAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceResponsiveVideoAd.buttonText) &&
        Objects.equals(this.customParameters, adGroupAdServiceResponsiveVideoAd.customParameters) &&
        Objects.equals(this.description, adGroupAdServiceResponsiveVideoAd.description) &&
        Objects.equals(this.displayUrl, adGroupAdServiceResponsiveVideoAd.displayUrl) &&
        Objects.equals(this.displayUrlLevel, adGroupAdServiceResponsiveVideoAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, adGroupAdServiceResponsiveVideoAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceResponsiveVideoAd.smartphoneFinalUrl) &&
        Objects.equals(this.headline, adGroupAdServiceResponsiveVideoAd.headline) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceResponsiveVideoAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveLogoMediaId, adGroupAdServiceResponsiveVideoAd.isRemoveLogoMediaId) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroupAdServiceResponsiveVideoAd.isRemoveTrackingUrl) &&
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
        Objects.equals(this.trackingUrl, adGroupAdServiceResponsiveVideoAd.trackingUrl) &&
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
    return Objects.hash(buttonText, customParameters, description, displayUrl, displayUrlLevel, finalUrl, smartphoneFinalUrl, headline, isRemoveSmartphoneFinalUrl, isRemoveLogoMediaId, isRemoveTrackingUrl, isRemoveVideo10SecBeaconUrls, isRemoveVideo25PercentBeaconUrls, isRemoveVideo3SecBeaconUrls, isRemoveVideo50PercentBeaconUrls, isRemoveVideo75PercentBeaconUrls, isRemoveVideoCompleteBeaconUrls, isRemoveVideoStartBeaconUrls, logoMediaId, principal, thumbnailMediaId, trackingUrl, url, video10SecBeaconUrls, video25PercentBeaconUrls, video3SecBeaconUrls, video50PercentBeaconUrls, video75PercentBeaconUrls, videoCompleteBeaconUrls, videoStartBeaconUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveVideoAd {\n");
    
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
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

