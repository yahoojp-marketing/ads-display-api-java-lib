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
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceDynamicAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceMobileAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServicePosAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceResponsiveImageAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceResponsiveVideoAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceStaticFrameAd;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupAdServiceTextAd;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AdGroupAdServiceAd object is a container for storing ads.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@JsonPropertyOrder({
  AdGroupAdServiceAd.JSON_PROPERTY_AD_TYPE,
  AdGroupAdServiceAd.JSON_PROPERTY_BANNER_IMAGE_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_BANNER_VIDEO_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_DYNAMIC_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_MOBILE_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_POS_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_RESPONSIVE_IMAGE_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_RESPONSIVE_VIDEO_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_STATIC_FRAME_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_TEXT_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_CAROUSEL_AD
})
@JsonTypeName("AdGroupAdServiceAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceAd {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private AdGroupAdServiceAdType adType;

  public static final String JSON_PROPERTY_BANNER_IMAGE_AD = "bannerImageAd";
  private AdGroupAdServiceBannerImageAd bannerImageAd;

  public static final String JSON_PROPERTY_BANNER_VIDEO_AD = "bannerVideoAd";
  private AdGroupAdServiceBannerVideoAd bannerVideoAd;

  public static final String JSON_PROPERTY_DYNAMIC_AD = "dynamicAd";
  private AdGroupAdServiceDynamicAd dynamicAd;

  public static final String JSON_PROPERTY_MOBILE_AD = "mobileAd";
  private AdGroupAdServiceMobileAd mobileAd;

  public static final String JSON_PROPERTY_POS_AD = "posAd";
  private AdGroupAdServicePosAd posAd;

  public static final String JSON_PROPERTY_RESPONSIVE_IMAGE_AD = "responsiveImageAd";
  private AdGroupAdServiceResponsiveImageAd responsiveImageAd;

  public static final String JSON_PROPERTY_RESPONSIVE_VIDEO_AD = "responsiveVideoAd";
  private AdGroupAdServiceResponsiveVideoAd responsiveVideoAd;

  public static final String JSON_PROPERTY_STATIC_FRAME_AD = "staticFrameAd";
  private AdGroupAdServiceStaticFrameAd staticFrameAd;

  public static final String JSON_PROPERTY_TEXT_AD = "textAd";
  private AdGroupAdServiceTextAd textAd;

  public static final String JSON_PROPERTY_CAROUSEL_AD = "carouselAd";
  private AdGroupAdServiceCarouselAd carouselAd;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AdGroupAdServiceAd bannerImageAd(AdGroupAdServiceBannerImageAd bannerImageAd) {
    
    this.bannerImageAd = bannerImageAd;
    return this;
  }

   /**
   * Get bannerImageAd
   * @return bannerImageAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNER_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceBannerImageAd getBannerImageAd() {
    return bannerImageAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannerImageAd(AdGroupAdServiceBannerImageAd bannerImageAd) {
    this.bannerImageAd = bannerImageAd;
  }


  public AdGroupAdServiceAd bannerVideoAd(AdGroupAdServiceBannerVideoAd bannerVideoAd) {
    
    this.bannerVideoAd = bannerVideoAd;
    return this;
  }

   /**
   * Get bannerVideoAd
   * @return bannerVideoAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNER_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceBannerVideoAd getBannerVideoAd() {
    return bannerVideoAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannerVideoAd(AdGroupAdServiceBannerVideoAd bannerVideoAd) {
    this.bannerVideoAd = bannerVideoAd;
  }


  public AdGroupAdServiceAd dynamicAd(AdGroupAdServiceDynamicAd dynamicAd) {
    
    this.dynamicAd = dynamicAd;
    return this;
  }

   /**
   * Get dynamicAd
   * @return dynamicAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DYNAMIC_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceDynamicAd getDynamicAd() {
    return dynamicAd;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicAd(AdGroupAdServiceDynamicAd dynamicAd) {
    this.dynamicAd = dynamicAd;
  }


  public AdGroupAdServiceAd mobileAd(AdGroupAdServiceMobileAd mobileAd) {
    
    this.mobileAd = mobileAd;
    return this;
  }

   /**
   * Get mobileAd
   * @return mobileAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceMobileAd getMobileAd() {
    return mobileAd;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileAd(AdGroupAdServiceMobileAd mobileAd) {
    this.mobileAd = mobileAd;
  }


  public AdGroupAdServiceAd posAd(AdGroupAdServicePosAd posAd) {
    
    this.posAd = posAd;
    return this;
  }

   /**
   * Get posAd
   * @return posAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POS_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServicePosAd getPosAd() {
    return posAd;
  }


  @JsonProperty(JSON_PROPERTY_POS_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosAd(AdGroupAdServicePosAd posAd) {
    this.posAd = posAd;
  }


  public AdGroupAdServiceAd responsiveImageAd(AdGroupAdServiceResponsiveImageAd responsiveImageAd) {
    
    this.responsiveImageAd = responsiveImageAd;
    return this;
  }

   /**
   * Get responsiveImageAd
   * @return responsiveImageAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSIVE_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceResponsiveImageAd getResponsiveImageAd() {
    return responsiveImageAd;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSIVE_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponsiveImageAd(AdGroupAdServiceResponsiveImageAd responsiveImageAd) {
    this.responsiveImageAd = responsiveImageAd;
  }


  public AdGroupAdServiceAd responsiveVideoAd(AdGroupAdServiceResponsiveVideoAd responsiveVideoAd) {
    
    this.responsiveVideoAd = responsiveVideoAd;
    return this;
  }

   /**
   * Get responsiveVideoAd
   * @return responsiveVideoAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSIVE_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceResponsiveVideoAd getResponsiveVideoAd() {
    return responsiveVideoAd;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSIVE_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponsiveVideoAd(AdGroupAdServiceResponsiveVideoAd responsiveVideoAd) {
    this.responsiveVideoAd = responsiveVideoAd;
  }


  public AdGroupAdServiceAd staticFrameAd(AdGroupAdServiceStaticFrameAd staticFrameAd) {
    
    this.staticFrameAd = staticFrameAd;
    return this;
  }

   /**
   * Get staticFrameAd
   * @return staticFrameAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATIC_FRAME_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceStaticFrameAd getStaticFrameAd() {
    return staticFrameAd;
  }


  @JsonProperty(JSON_PROPERTY_STATIC_FRAME_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStaticFrameAd(AdGroupAdServiceStaticFrameAd staticFrameAd) {
    this.staticFrameAd = staticFrameAd;
  }


  public AdGroupAdServiceAd textAd(AdGroupAdServiceTextAd textAd) {
    
    this.textAd = textAd;
    return this;
  }

   /**
   * Get textAd
   * @return textAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AdGroupAdServiceAd carouselAd(AdGroupAdServiceCarouselAd carouselAd) {
    
    this.carouselAd = carouselAd;
    return this;
  }

   /**
   * Get carouselAd
   * @return carouselAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
        Objects.equals(this.bannerImageAd, adGroupAdServiceAd.bannerImageAd) &&
        Objects.equals(this.bannerVideoAd, adGroupAdServiceAd.bannerVideoAd) &&
        Objects.equals(this.dynamicAd, adGroupAdServiceAd.dynamicAd) &&
        Objects.equals(this.mobileAd, adGroupAdServiceAd.mobileAd) &&
        Objects.equals(this.posAd, adGroupAdServiceAd.posAd) &&
        Objects.equals(this.responsiveImageAd, adGroupAdServiceAd.responsiveImageAd) &&
        Objects.equals(this.responsiveVideoAd, adGroupAdServiceAd.responsiveVideoAd) &&
        Objects.equals(this.staticFrameAd, adGroupAdServiceAd.staticFrameAd) &&
        Objects.equals(this.textAd, adGroupAdServiceAd.textAd) &&
        Objects.equals(this.carouselAd, adGroupAdServiceAd.carouselAd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bannerImageAd, bannerVideoAd, dynamicAd, mobileAd, posAd, responsiveImageAd, responsiveVideoAd, staticFrameAd, textAd, carouselAd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAd {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    bannerImageAd: ").append(toIndentedString(bannerImageAd)).append("\n");
    sb.append("    bannerVideoAd: ").append(toIndentedString(bannerVideoAd)).append("\n");
    sb.append("    dynamicAd: ").append(toIndentedString(dynamicAd)).append("\n");
    sb.append("    mobileAd: ").append(toIndentedString(mobileAd)).append("\n");
    sb.append("    posAd: ").append(toIndentedString(posAd)).append("\n");
    sb.append("    responsiveImageAd: ").append(toIndentedString(responsiveImageAd)).append("\n");
    sb.append("    responsiveVideoAd: ").append(toIndentedString(responsiveVideoAd)).append("\n");
    sb.append("    staticFrameAd: ").append(toIndentedString(staticFrameAd)).append("\n");
    sb.append("    textAd: ").append(toIndentedString(textAd)).append("\n");
    sb.append("    carouselAd: ").append(toIndentedString(carouselAd)).append("\n");
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
