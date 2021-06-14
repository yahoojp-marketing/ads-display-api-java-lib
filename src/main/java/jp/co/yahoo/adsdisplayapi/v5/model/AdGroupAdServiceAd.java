package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceDynamicAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceMobileAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServicePosAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceResponsiveImageAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceResponsiveVideoAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceStaticFrameAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceTextAd;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AdGroupAdServiceAd object is a container for storing ads.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")

public class AdGroupAdServiceAd   {
  @JsonProperty("adType")
  private JsonNullable<AdGroupAdServiceAdType> adType = JsonNullable.undefined();

  @JsonProperty("bannerImageAd")
  private JsonNullable<AdGroupAdServiceBannerImageAd> bannerImageAd = JsonNullable.undefined();

  @JsonProperty("bannerVideoAd")
  private JsonNullable<AdGroupAdServiceBannerVideoAd> bannerVideoAd = JsonNullable.undefined();

  @JsonProperty("dynamicAd")
  private JsonNullable<AdGroupAdServiceDynamicAd> dynamicAd = JsonNullable.undefined();

  @JsonProperty("mobileAd")
  private JsonNullable<AdGroupAdServiceMobileAd> mobileAd = JsonNullable.undefined();

  @JsonProperty("posAd")
  private JsonNullable<AdGroupAdServicePosAd> posAd = JsonNullable.undefined();

  @JsonProperty("responsiveImageAd")
  private JsonNullable<AdGroupAdServiceResponsiveImageAd> responsiveImageAd = JsonNullable.undefined();

  @JsonProperty("responsiveVideoAd")
  private JsonNullable<AdGroupAdServiceResponsiveVideoAd> responsiveVideoAd = JsonNullable.undefined();

  @JsonProperty("staticFrameAd")
  private JsonNullable<AdGroupAdServiceStaticFrameAd> staticFrameAd = JsonNullable.undefined();

  @JsonProperty("textAd")
  private JsonNullable<AdGroupAdServiceTextAd> textAd = JsonNullable.undefined();

  @JsonProperty("carouselAd")
  private JsonNullable<AdGroupAdServiceCarouselAd> carouselAd = JsonNullable.undefined();

  public AdGroupAdServiceAd adType(AdGroupAdServiceAdType adType) {
    this.adType = JsonNullable.of(adType);
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceAdType> getAdType() {
    return adType;
  }

  public void setAdType(JsonNullable<AdGroupAdServiceAdType> adType) {
    this.adType = adType;
  }

  public AdGroupAdServiceAd bannerImageAd(AdGroupAdServiceBannerImageAd bannerImageAd) {
    this.bannerImageAd = JsonNullable.of(bannerImageAd);
    return this;
  }

  /**
   * Get bannerImageAd
   * @return bannerImageAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceBannerImageAd> getBannerImageAd() {
    return bannerImageAd;
  }

  public void setBannerImageAd(JsonNullable<AdGroupAdServiceBannerImageAd> bannerImageAd) {
    this.bannerImageAd = bannerImageAd;
  }

  public AdGroupAdServiceAd bannerVideoAd(AdGroupAdServiceBannerVideoAd bannerVideoAd) {
    this.bannerVideoAd = JsonNullable.of(bannerVideoAd);
    return this;
  }

  /**
   * Get bannerVideoAd
   * @return bannerVideoAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceBannerVideoAd> getBannerVideoAd() {
    return bannerVideoAd;
  }

  public void setBannerVideoAd(JsonNullable<AdGroupAdServiceBannerVideoAd> bannerVideoAd) {
    this.bannerVideoAd = bannerVideoAd;
  }

  public AdGroupAdServiceAd dynamicAd(AdGroupAdServiceDynamicAd dynamicAd) {
    this.dynamicAd = JsonNullable.of(dynamicAd);
    return this;
  }

  /**
   * Get dynamicAd
   * @return dynamicAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceDynamicAd> getDynamicAd() {
    return dynamicAd;
  }

  public void setDynamicAd(JsonNullable<AdGroupAdServiceDynamicAd> dynamicAd) {
    this.dynamicAd = dynamicAd;
  }

  public AdGroupAdServiceAd mobileAd(AdGroupAdServiceMobileAd mobileAd) {
    this.mobileAd = JsonNullable.of(mobileAd);
    return this;
  }

  /**
   * Get mobileAd
   * @return mobileAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceMobileAd> getMobileAd() {
    return mobileAd;
  }

  public void setMobileAd(JsonNullable<AdGroupAdServiceMobileAd> mobileAd) {
    this.mobileAd = mobileAd;
  }

  public AdGroupAdServiceAd posAd(AdGroupAdServicePosAd posAd) {
    this.posAd = JsonNullable.of(posAd);
    return this;
  }

  /**
   * Get posAd
   * @return posAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServicePosAd> getPosAd() {
    return posAd;
  }

  public void setPosAd(JsonNullable<AdGroupAdServicePosAd> posAd) {
    this.posAd = posAd;
  }

  public AdGroupAdServiceAd responsiveImageAd(AdGroupAdServiceResponsiveImageAd responsiveImageAd) {
    this.responsiveImageAd = JsonNullable.of(responsiveImageAd);
    return this;
  }

  /**
   * Get responsiveImageAd
   * @return responsiveImageAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceResponsiveImageAd> getResponsiveImageAd() {
    return responsiveImageAd;
  }

  public void setResponsiveImageAd(JsonNullable<AdGroupAdServiceResponsiveImageAd> responsiveImageAd) {
    this.responsiveImageAd = responsiveImageAd;
  }

  public AdGroupAdServiceAd responsiveVideoAd(AdGroupAdServiceResponsiveVideoAd responsiveVideoAd) {
    this.responsiveVideoAd = JsonNullable.of(responsiveVideoAd);
    return this;
  }

  /**
   * Get responsiveVideoAd
   * @return responsiveVideoAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceResponsiveVideoAd> getResponsiveVideoAd() {
    return responsiveVideoAd;
  }

  public void setResponsiveVideoAd(JsonNullable<AdGroupAdServiceResponsiveVideoAd> responsiveVideoAd) {
    this.responsiveVideoAd = responsiveVideoAd;
  }

  public AdGroupAdServiceAd staticFrameAd(AdGroupAdServiceStaticFrameAd staticFrameAd) {
    this.staticFrameAd = JsonNullable.of(staticFrameAd);
    return this;
  }

  /**
   * Get staticFrameAd
   * @return staticFrameAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceStaticFrameAd> getStaticFrameAd() {
    return staticFrameAd;
  }

  public void setStaticFrameAd(JsonNullable<AdGroupAdServiceStaticFrameAd> staticFrameAd) {
    this.staticFrameAd = staticFrameAd;
  }

  public AdGroupAdServiceAd textAd(AdGroupAdServiceTextAd textAd) {
    this.textAd = JsonNullable.of(textAd);
    return this;
  }

  /**
   * Get textAd
   * @return textAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceTextAd> getTextAd() {
    return textAd;
  }

  public void setTextAd(JsonNullable<AdGroupAdServiceTextAd> textAd) {
    this.textAd = textAd;
  }

  public AdGroupAdServiceAd carouselAd(AdGroupAdServiceCarouselAd carouselAd) {
    this.carouselAd = JsonNullable.of(carouselAd);
    return this;
  }

  /**
   * Get carouselAd
   * @return carouselAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceCarouselAd> getCarouselAd() {
    return carouselAd;
  }

  public void setCarouselAd(JsonNullable<AdGroupAdServiceCarouselAd> carouselAd) {
    this.carouselAd = carouselAd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

