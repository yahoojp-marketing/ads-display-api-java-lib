package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceResponsiveImageAdオブジェクトは、レスポンシブ広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがRESPONSIVE_IMAGE_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceResponsiveImageAd object describes the Responsive Ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is RESPONSIVE_IMAGE_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceResponsiveImageAdオブジェクトは、レスポンシブ広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがRESPONSIVE_IMAGE_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceResponsiveImageAd object describes the Responsive Ad information.<br> This field is optional.<br> *If adType is RESPONSIVE_IMAGE_AD, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceResponsiveImageAd   {
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

  @JsonProperty("logoMediaId")
  private Long logoMediaId = null;

  @JsonProperty("principal")
  private String principal = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("url")
  private String url = null;

  public AdGroupAdServiceResponsiveImageAd buttonText(AdGroupAdServiceButtonText buttonText) {
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

  public AdGroupAdServiceResponsiveImageAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
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

  public AdGroupAdServiceResponsiveImageAd description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Description.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdGroupAdServiceResponsiveImageAd displayUrl(String displayUrl) {
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

  public AdGroupAdServiceResponsiveImageAd displayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
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

  public AdGroupAdServiceResponsiveImageAd finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、smartphoneFinalUrl、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, smartphoneFinalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public AdGroupAdServiceResponsiveImageAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> Not allowed for ADD and SET when a campaign goal is \"app promotion\".<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public AdGroupAdServiceResponsiveImageAd headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> タイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getHeadline() {
    return headline;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }

  public void setIsRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  public AdGroupAdServiceResponsiveImageAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image.<br> This field is optional in ADD and SET operation. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image.<br> This field is optional in ADD and SET operation. </div> ")


  public Long getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceResponsiveImageAd principal(String principal) {
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

  public AdGroupAdServiceResponsiveImageAd trackingUrl(String trackingUrl) {
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

  public AdGroupAdServiceResponsiveImageAd url(String url) {
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
        Objects.equals(this.url, adGroupAdServiceResponsiveImageAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, customParameters, description, displayUrl, displayUrlLevel, finalUrl, smartphoneFinalUrl, headline, isRemoveSmartphoneFinalUrl, isRemoveLogoMediaId, isRemoveTrackingUrl, logoMediaId, principal, trackingUrl, url);
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
