/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceBannerAd;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceDynamicDisplayAd;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceMainMediaFormat;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceResponsiveAd;
import jp.co.yahoo.adsdisplayapi.v14.model.AdGroupAdServiceTextAd;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceAd.JSON_PROPERTY_AD_TYPE,
  AdGroupAdServiceAd.JSON_PROPERTY_MAIN_MEDIA_FORMAT,
  AdGroupAdServiceAd.JSON_PROPERTY_BANNER_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_CAROUSEL_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_DYNAMIC_DISPLAY_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_RESPONSIVE_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_TEXT_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  AdGroupAdServiceAd.JSON_PROPERTY_DISPLAY_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  AdGroupAdServiceAd.JSON_PROPERTY_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_TRACKING_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_IS_REMOVE_TRACKING_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceAd {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private AdGroupAdServiceAdType adType;

  public static final String JSON_PROPERTY_MAIN_MEDIA_FORMAT = "mainMediaFormat";
  private AdGroupAdServiceMainMediaFormat mainMediaFormat;

  public static final String JSON_PROPERTY_BANNER_AD = "bannerAd";
  private AdGroupAdServiceBannerAd bannerAd;

  public static final String JSON_PROPERTY_CAROUSEL_AD = "carouselAd";
  private AdGroupAdServiceCarouselAd carouselAd;

  public static final String JSON_PROPERTY_DYNAMIC_DISPLAY_AD = "dynamicDisplayAd";
  private AdGroupAdServiceDynamicDisplayAd dynamicDisplayAd;

  public static final String JSON_PROPERTY_RESPONSIVE_AD = "responsiveAd";
  private AdGroupAdServiceResponsiveAd responsiveAd;

  public static final String JSON_PROPERTY_TEXT_AD = "textAd";
  private AdGroupAdServiceTextAd textAd;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private AdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private AdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL = "isRemoveSmartphoneFinalUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl;

  public AdGroupAdServiceAd() {
  }

  public AdGroupAdServiceAd adType(AdGroupAdServiceAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAdType getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(AdGroupAdServiceAdType adType) {
    this.adType = adType;
  }


  public AdGroupAdServiceAd mainMediaFormat(AdGroupAdServiceMainMediaFormat mainMediaFormat) {
    
    this.mainMediaFormat = mainMediaFormat;
    return this;
  }

   /**
   * Get mainMediaFormat
   * @return mainMediaFormat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_MEDIA_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceMainMediaFormat getMainMediaFormat() {
    return mainMediaFormat;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_MEDIA_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainMediaFormat(AdGroupAdServiceMainMediaFormat mainMediaFormat) {
    this.mainMediaFormat = mainMediaFormat;
  }


  public AdGroupAdServiceAd bannerAd(AdGroupAdServiceBannerAd bannerAd) {
    
    this.bannerAd = bannerAd;
    return this;
  }

   /**
   * Get bannerAd
   * @return bannerAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANNER_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceBannerAd getBannerAd() {
    return bannerAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannerAd(AdGroupAdServiceBannerAd bannerAd) {
    this.bannerAd = bannerAd;
  }


  public AdGroupAdServiceAd carouselAd(AdGroupAdServiceCarouselAd carouselAd) {
    
    this.carouselAd = carouselAd;
    return this;
  }

   /**
   * Get carouselAd
   * @return carouselAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAROUSEL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceCarouselAd getCarouselAd() {
    return carouselAd;
  }


  @JsonProperty(JSON_PROPERTY_CAROUSEL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarouselAd(AdGroupAdServiceCarouselAd carouselAd) {
    this.carouselAd = carouselAd;
  }


  public AdGroupAdServiceAd dynamicDisplayAd(AdGroupAdServiceDynamicDisplayAd dynamicDisplayAd) {
    
    this.dynamicDisplayAd = dynamicDisplayAd;
    return this;
  }

   /**
   * Get dynamicDisplayAd
   * @return dynamicDisplayAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DYNAMIC_DISPLAY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceDynamicDisplayAd getDynamicDisplayAd() {
    return dynamicDisplayAd;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_DISPLAY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicDisplayAd(AdGroupAdServiceDynamicDisplayAd dynamicDisplayAd) {
    this.dynamicDisplayAd = dynamicDisplayAd;
  }


  public AdGroupAdServiceAd responsiveAd(AdGroupAdServiceResponsiveAd responsiveAd) {
    
    this.responsiveAd = responsiveAd;
    return this;
  }

   /**
   * Get responsiveAd
   * @return responsiveAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSIVE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceResponsiveAd getResponsiveAd() {
    return responsiveAd;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSIVE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponsiveAd(AdGroupAdServiceResponsiveAd responsiveAd) {
    this.responsiveAd = responsiveAd;
  }


  public AdGroupAdServiceAd textAd(AdGroupAdServiceTextAd textAd) {
    
    this.textAd = textAd;
    return this;
  }

   /**
   * Get textAd
   * @return textAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceTextAd getTextAd() {
    return textAd;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextAd(AdGroupAdServiceTextAd textAd) {
    this.textAd = textAd;
  }


  public AdGroupAdServiceAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
    
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

  public AdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public AdGroupAdServiceAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; このフィールドを指定することはできません。代わりにfinalUrlから生成された値が自動で設定されます。&lt;br&gt; ただし、キャンペーン目的「アプリ訴求」の場合は、キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。&lt;br&gt; - iOSの場合：itunes.apple.com&lt;br&gt; - Androidの場合：play.google.com &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field cannot be specified. Instead, the value generated from finalUrl will be set automatically.&lt;br&gt; However, When a campaign goal is \&quot;app promotion\&quot;, Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.&lt;br&gt; - For iOS : itunes.apple.com&lt;br&gt; - For Android : play.google.com &lt;/div&gt; 
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


  public AdGroupAdServiceAd displayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
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

  public AdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrlLevel(AdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }


  public AdGroupAdServiceAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; &lt;/div&gt; 
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


  public AdGroupAdServiceAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL (smartphone).&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; Not allowed for ADD and SET when a campaign goal is \&quot;app promotion.\&quot; &lt;/div&gt; 
   * @return smartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAdServiceAd isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

   /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemoveFlg isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  public AdGroupAdServiceAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared. &lt;/div&gt; 
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


  public AdGroupAdServiceAd isRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(AdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAd adGroupAdServiceAd = (AdGroupAdServiceAd) o;
    return Objects.equals(this.adType, adGroupAdServiceAd.adType) &&
        Objects.equals(this.mainMediaFormat, adGroupAdServiceAd.mainMediaFormat) &&
        Objects.equals(this.bannerAd, adGroupAdServiceAd.bannerAd) &&
        Objects.equals(this.carouselAd, adGroupAdServiceAd.carouselAd) &&
        Objects.equals(this.dynamicDisplayAd, adGroupAdServiceAd.dynamicDisplayAd) &&
        Objects.equals(this.responsiveAd, adGroupAdServiceAd.responsiveAd) &&
        Objects.equals(this.textAd, adGroupAdServiceAd.textAd) &&
        Objects.equals(this.customParameters, adGroupAdServiceAd.customParameters) &&
        Objects.equals(this.displayUrl, adGroupAdServiceAd.displayUrl) &&
        Objects.equals(this.displayUrlLevel, adGroupAdServiceAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, adGroupAdServiceAd.finalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceAd.smartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.trackingUrl, adGroupAdServiceAd.trackingUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroupAdServiceAd.isRemoveTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mainMediaFormat, bannerAd, carouselAd, dynamicDisplayAd, responsiveAd, textAd, customParameters, displayUrl, displayUrlLevel, finalUrl, smartphoneFinalUrl, isRemoveSmartphoneFinalUrl, trackingUrl, isRemoveTrackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAd {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    mainMediaFormat: ").append(toIndentedString(mainMediaFormat)).append("\n");
    sb.append("    bannerAd: ").append(toIndentedString(bannerAd)).append("\n");
    sb.append("    carouselAd: ").append(toIndentedString(carouselAd)).append("\n");
    sb.append("    dynamicDisplayAd: ").append(toIndentedString(dynamicDisplayAd)).append("\n");
    sb.append("    responsiveAd: ").append(toIndentedString(responsiveAd)).append("\n");
    sb.append("    textAd: ").append(toIndentedString(textAd)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
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

