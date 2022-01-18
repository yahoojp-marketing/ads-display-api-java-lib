package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCarousel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is CAROUSEL_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.<br> This field is optional.<br> *If adType is CAROUSEL_AD, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceCarouselAd   {
  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("logoMediaId")
  private Long logoMediaId = null;

  @JsonProperty("principal")
  private String principal = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("customParameters")
  private GuaranteedAdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("displayUrlLevel")
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("isRemoveSmartphoneFinalUrl")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl = null;

  @JsonProperty("isRemoveTrackingUrl")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("carousels")
  @Valid
  private List<GuaranteedAdGroupAdServiceCarousel> carousels = null;

  public GuaranteedAdGroupAdServiceCarouselAd displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ・標準キャンペーンの場合<br> &nbsp;&nbsp;ADDでは入力必須です。SETでの入力は任意です。<br> ・アプリキャンペーンの場合<br> &nbsp;&nbsp;ADD、SETのどちらも指定できません。<br> &nbsp;&nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> &nbsp;&nbsp;&nbsp;&nbsp;- iOSの場合：itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> - Standard campaign:<br> &nbsp;&nbsp;Required for ADD, optional for SET.<br> - Mobile app campaign:<br> &nbsp;&nbsp;Not allowed for ADD and SET.<br> &nbsp;&nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.<br> &nbsp;&nbsp;&nbsp;&nbsp;- For iOS : itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- For Android : play.google.com<br> </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ・標準キャンペーンの場合<br> &nbsp;&nbsp;ADDでは入力必須です。SETでの入力は任意です。<br> ・アプリキャンペーンの場合<br> &nbsp;&nbsp;ADD、SETのどちらも指定できません。<br> &nbsp;&nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> &nbsp;&nbsp;&nbsp;&nbsp;- iOSの場合：itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> - Standard campaign:<br> &nbsp;&nbsp;Required for ADD, optional for SET.<br> - Mobile app campaign:<br> &nbsp;&nbsp;Not allowed for ADD and SET.<br> &nbsp;&nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.<br> &nbsp;&nbsp;&nbsp;&nbsp;- For iOS : itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- For Android : play.google.com<br> </div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd logoMediaId(Long logoMediaId) {
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

  public GuaranteedAdGroupAdServiceCarouselAd principal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public GuaranteedAdGroupAdServiceCarouselAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GuaranteedAdGroupAdServiceCarouselAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public GuaranteedAdGroupAdServiceCarouselAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

  /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }

  public void setDisplayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }

  public GuaranteedAdGroupAdServiceCarouselAd finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> * Not Available. </div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、finalUrlフィールドとurlフィールドは同時に設定することはできず、どちらか片方の設定が必須となります。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> In ADD operation, finalUrl field and url field cannot be set at the same time, and one of them must be set.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is optional in SET operation.<br> * Not Available. </div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> * Not Available. </div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> * Not Available. </div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd isRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

  /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }

  public void setIsRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

  /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }

  public void setIsRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared.<br> * Not Available. </div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> If url is specified in SET operation, the value in this field will be cleared.<br> * Not Available. </div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public GuaranteedAdGroupAdServiceCarouselAd carousels(List<GuaranteedAdGroupAdServiceCarousel> carousels) {
    this.carousels = carousels;
    return this;
  }

  public GuaranteedAdGroupAdServiceCarouselAd addCarouselsItem(GuaranteedAdGroupAdServiceCarousel carouselsItem) {
    if (this.carousels == null) {
      this.carousels = new ArrayList<>();
    }
    this.carousels.add(carouselsItem);
    return this;
  }

  /**
   * Get carousels
   * @return carousels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedAdGroupAdServiceCarousel> getCarousels() {
    return carousels;
  }

  public void setCarousels(List<GuaranteedAdGroupAdServiceCarousel> carousels) {
    this.carousels = carousels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCarouselAd guaranteedAdGroupAdServiceCarouselAd = (GuaranteedAdGroupAdServiceCarouselAd) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceCarouselAd.displayUrl) &&
        Objects.equals(this.logoMediaId, guaranteedAdGroupAdServiceCarouselAd.logoMediaId) &&
        Objects.equals(this.principal, guaranteedAdGroupAdServiceCarouselAd.principal) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceCarouselAd.url) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceCarouselAd.customParameters) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceCarouselAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceCarouselAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, guaranteedAdGroupAdServiceCarouselAd.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, guaranteedAdGroupAdServiceCarouselAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceCarouselAd.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceCarouselAd.trackingUrl) &&
        Objects.equals(this.carousels, guaranteedAdGroupAdServiceCarouselAd.carousels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, logoMediaId, principal, url, customParameters, displayUrlLevel, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl, isRemoveTrackingUrl, trackingUrl, carousels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCarouselAd {\n");
    
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    carousels: ").append(toIndentedString(carousels)).append("\n");
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

