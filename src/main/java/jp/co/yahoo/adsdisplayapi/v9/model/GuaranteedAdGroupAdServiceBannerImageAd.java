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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBannerImageAdオブジェクトは、画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBannerImageAd object describes information regarding ads composed of images.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBannerImageAdオブジェクトは、画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBannerImageAd object describes information regarding ads composed of images.<br> This field is optional.<br> </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  GuaranteedAdGroupAdServiceBannerImageAd.JSON_PROPERTY_TRACKING_URL
})
@JsonTypeName("GuaranteedAdGroupAdServiceBannerImageAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceBannerImageAd {
  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL = "isRemoveSmartphoneFinalUrl";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public GuaranteedAdGroupAdServiceBannerImageAd() { 
  }

  public GuaranteedAdGroupAdServiceBannerImageAd displayUrl(String displayUrl) {
    
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


  public GuaranteedAdGroupAdServiceBannerImageAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public GuaranteedAdGroupAdServiceBannerImageAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

   /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public GuaranteedAdGroupAdServiceBannerImageAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; If you specify finalUrl, trackingUrl and customParameters will be optional.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\">Final URL.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is required in ADD operation, and will be optional in SET operation.<br> * Not Available. </div> ")
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


  public GuaranteedAdGroupAdServiceBannerImageAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL (smartphone).&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; * Not Available. &lt;/div&gt; 
   * @return smartphoneFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Final URL (smartphone).<br> This field can be optionally specified only when specifying finalUrl.<br> * Not Available. </div> ")
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


  public GuaranteedAdGroupAdServiceBannerImageAd isRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

   /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSmartphoneFinalUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  public GuaranteedAdGroupAdServiceBannerImageAd isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public GuaranteedAdGroupAdServiceBannerImageAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※SET時、こちらが審査中の場合、編集はできません。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; *In SET operation, cannot update it when this field is in editorial review.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; * Not Available. &lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> This field can be optionally specified only when specifying finalUrl.<br> * Not Available. </div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceBannerImageAd guaranteedAdGroupAdServiceBannerImageAd = (GuaranteedAdGroupAdServiceBannerImageAd) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceBannerImageAd.displayUrl) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceBannerImageAd.customParameters) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceBannerImageAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceBannerImageAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, guaranteedAdGroupAdServiceBannerImageAd.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, guaranteedAdGroupAdServiceBannerImageAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceBannerImageAd.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceBannerImageAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, customParameters, displayUrlLevel, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl, isRemoveTrackingUrl, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBannerImageAd {\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

