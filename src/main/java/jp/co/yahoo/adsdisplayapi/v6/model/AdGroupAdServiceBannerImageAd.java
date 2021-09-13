package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceBannerImageAdオブジェクトは、画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがBANNER_IMAGE_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceBannerImageAd object describes information regarding ads composed of images.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is BANNER_IMAGE_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceBannerImageAdオブジェクトは、画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがBANNER_IMAGE_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceBannerImageAd object describes information regarding ads composed of images.<br> This field is optional.<br> *If adType is BANNER_IMAGE_AD, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceBannerImageAd   {
  @JsonProperty("customParameters")
  private AdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("displayUrlLevel")
  private AdGroupAdServiceDisplayUrlLevel displayUrlLevel = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("isRemoveSmartphoneFinalUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl = null;

  @JsonProperty("isRemoveTrackingUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("url")
  private String url = null;

  public AdGroupAdServiceBannerImageAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
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

  public AdGroupAdServiceBannerImageAd displayUrl(String displayUrl) {
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

  public AdGroupAdServiceBannerImageAd displayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
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

  public AdGroupAdServiceBannerImageAd finalUrl(String finalUrl) {
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

  public AdGroupAdServiceBannerImageAd smartphoneFinalUrl(String smartphoneFinalUrl) {
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

  public AdGroupAdServiceBannerImageAd isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
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

  public AdGroupAdServiceBannerImageAd isRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
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

  public AdGroupAdServiceBannerImageAd trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroupAdServiceBannerImageAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v6/CampaignService/get/\">こちら</a>をご参照ください。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> urlフィールドを設定する場合、displayUrlの指定が必須になります。またその際は、finalUrl、smartphoneFinalUrl、trackingUrl、customParametersは指定不可です。<br> SET時は省略可能となります。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v6/CampaignService/get/en/\">this page</a>.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> When url field is specified, displayUrl must be specified. In that case, finalUrl, smartphoneFinalUrl, trackingUrl and customParameters cannot be specified.<br> This field is optional in SET operation.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v6/CampaignService/get/\">こちら</a>をご参照ください。<br> ADD時、urlフィールドとfinalUrlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> urlフィールドを設定する場合、displayUrlの指定が必須になります。またその際は、finalUrl、smartphoneFinalUrl、trackingUrl、customParametersは指定不可です。<br> SET時は省略可能となります。<br> SET時にfinalUrlを指定する場合、このフィールドの値はクリアされます。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v6/CampaignService/get/en/\">this page</a>.<br> In ADD operation, url field and finalUrl field cannot be set at the same time, and one of them must be set.<br> When url field is specified, displayUrl must be specified. In that case, finalUrl, smartphoneFinalUrl, trackingUrl and customParameters cannot be specified.<br> This field is optional in SET operation.<br> If finalUrl is specified in SET operation, the value in this field will be cleared. </div> ")


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
    AdGroupAdServiceBannerImageAd adGroupAdServiceBannerImageAd = (AdGroupAdServiceBannerImageAd) o;
    return Objects.equals(this.customParameters, adGroupAdServiceBannerImageAd.customParameters) &&
        Objects.equals(this.displayUrl, adGroupAdServiceBannerImageAd.displayUrl) &&
        Objects.equals(this.displayUrlLevel, adGroupAdServiceBannerImageAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, adGroupAdServiceBannerImageAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceBannerImageAd.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceBannerImageAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroupAdServiceBannerImageAd.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, adGroupAdServiceBannerImageAd.trackingUrl) &&
        Objects.equals(this.url, adGroupAdServiceBannerImageAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customParameters, displayUrl, displayUrlLevel, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl, isRemoveTrackingUrl, trackingUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceBannerImageAd {\n");
    
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
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

