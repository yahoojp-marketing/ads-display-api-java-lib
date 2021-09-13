package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceDynamicAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceMobileAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServicePosAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceResponsiveImageAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceResponsiveVideoAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceStaticFrameAd;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceTextAd;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AdGroupAdServiceAd object is a container for storing ads.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceAd   {
  @JsonProperty("adType")
  private AdGroupAdServiceAdType adType = null;

  @JsonProperty("bannerImageAd")
  private AdGroupAdServiceBannerImageAd bannerImageAd = null;

  @JsonProperty("bannerVideoAd")
  private AdGroupAdServiceBannerVideoAd bannerVideoAd = null;

  @JsonProperty("dynamicAd")
  private AdGroupAdServiceDynamicAd dynamicAd = null;

  @JsonProperty("mobileAd")
  private AdGroupAdServiceMobileAd mobileAd = null;

  @JsonProperty("posAd")
  private AdGroupAdServicePosAd posAd = null;

  @JsonProperty("responsiveImageAd")
  private AdGroupAdServiceResponsiveImageAd responsiveImageAd = null;

  @JsonProperty("responsiveVideoAd")
  private AdGroupAdServiceResponsiveVideoAd responsiveVideoAd = null;

  @JsonProperty("staticFrameAd")
  private AdGroupAdServiceStaticFrameAd staticFrameAd = null;

  @JsonProperty("textAd")
  private AdGroupAdServiceTextAd textAd = null;

  @JsonProperty("carouselAd")
  private AdGroupAdServiceCarouselAd carouselAd = null;

  public AdGroupAdServiceAd adType(AdGroupAdServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAdType getAdType() {
    return adType;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceBannerImageAd getBannerImageAd() {
    return bannerImageAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceBannerVideoAd getBannerVideoAd() {
    return bannerVideoAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceDynamicAd getDynamicAd() {
    return dynamicAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceMobileAd getMobileAd() {
    return mobileAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServicePosAd getPosAd() {
    return posAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceResponsiveImageAd getResponsiveImageAd() {
    return responsiveImageAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceResponsiveVideoAd getResponsiveVideoAd() {
    return responsiveVideoAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceStaticFrameAd getStaticFrameAd() {
    return staticFrameAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceTextAd getTextAd() {
    return textAd;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceCarouselAd getCarouselAd() {
    return carouselAd;
  }

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

