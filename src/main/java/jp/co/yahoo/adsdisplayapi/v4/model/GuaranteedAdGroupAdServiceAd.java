package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBrandPanelPanorama;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBrandPanelQuintie;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceBrandPanelQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceInstreamVideoAd;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPanorama;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactQuintie;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactSquare;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecial;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactSquareVideo;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceTopImpactTheaterVideo;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceAd object is a container for storing ads.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceAd   {
  @JsonProperty("adType")
  private GuaranteedAdGroupAdServiceAdType adType = null;

  @JsonProperty("bannerImageAd")
  private GuaranteedAdGroupAdServiceBannerImageAd bannerImageAd = null;

  @JsonProperty("bannerVideoAd")
  private GuaranteedAdGroupAdServiceBannerVideoAd bannerVideoAd = null;

  @JsonProperty("brandPanelQuintie")
  private GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie = null;

  @JsonProperty("brandPanelPanorama")
  private GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama = null;

  @JsonProperty("brandPanelPanoramaVideo")
  private GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo brandPanelPanoramaVideo = null;

  @JsonProperty("brandPanelQuintieVideo")
  private GuaranteedAdGroupAdServiceBrandPanelQuintieVideo brandPanelQuintieVideo = null;

  @JsonProperty("topImpactSquare")
  private GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare = null;

  @JsonProperty("topImpactSquareVideo")
  private GuaranteedAdGroupAdServiceTopImpactSquareVideo topImpactSquareVideo = null;

  @JsonProperty("topImpactQuintie")
  private GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie = null;

  @JsonProperty("topImpactQuintieVideo")
  private GuaranteedAdGroupAdServiceTopImpactQuintieVideo topImpactQuintieVideo = null;

  @JsonProperty("topImpactPanorama")
  private GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama = null;

  @JsonProperty("topImpactPanoramaVideo")
  private GuaranteedAdGroupAdServiceTopImpactPanoramaVideo topImpactPanoramaVideo = null;

  @JsonProperty("topImpactPanoramaSideVisionVideo")
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo topImpactPanoramaSideVisionVideo = null;

  @JsonProperty("topImpactPanoramaSideSwitchVideo")
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo topImpactPanoramaSideSwitchVideo = null;

  @JsonProperty("topImpactTheaterVideo")
  private GuaranteedAdGroupAdServiceTopImpactTheaterVideo topImpactTheaterVideo = null;

  @JsonProperty("topImpactSquareSpecial")
  private GuaranteedAdGroupAdServiceTopImpactSquareSpecial topImpactSquareSpecial = null;

  @JsonProperty("topImpactSquareSpecialVideo")
  private GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo topImpactSquareSpecialVideo = null;

  @JsonProperty("topImpactPrimeDisplayDouble")
  private GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble = null;

  @JsonProperty("topImpactPrimeDisplayDoubleVideo")
  private GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo topImpactPrimeDisplayDoubleVideo = null;

  @JsonProperty("instreamVideo")
  private GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo = null;

  public GuaranteedAdGroupAdServiceAd adType(GuaranteedAdGroupAdServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceAdType getAdType() {
    return adType;
  }

  public void setAdType(GuaranteedAdGroupAdServiceAdType adType) {
    this.adType = adType;
  }

  public GuaranteedAdGroupAdServiceAd bannerImageAd(GuaranteedAdGroupAdServiceBannerImageAd bannerImageAd) {
    this.bannerImageAd = bannerImageAd;
    return this;
  }

  /**
   * Get bannerImageAd
   * @return bannerImageAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBannerImageAd getBannerImageAd() {
    return bannerImageAd;
  }

  public void setBannerImageAd(GuaranteedAdGroupAdServiceBannerImageAd bannerImageAd) {
    this.bannerImageAd = bannerImageAd;
  }

  public GuaranteedAdGroupAdServiceAd bannerVideoAd(GuaranteedAdGroupAdServiceBannerVideoAd bannerVideoAd) {
    this.bannerVideoAd = bannerVideoAd;
    return this;
  }

  /**
   * Get bannerVideoAd
   * @return bannerVideoAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBannerVideoAd getBannerVideoAd() {
    return bannerVideoAd;
  }

  public void setBannerVideoAd(GuaranteedAdGroupAdServiceBannerVideoAd bannerVideoAd) {
    this.bannerVideoAd = bannerVideoAd;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelQuintie(GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie) {
    this.brandPanelQuintie = brandPanelQuintie;
    return this;
  }

  /**
   * Get brandPanelQuintie
   * @return brandPanelQuintie
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBrandPanelQuintie getBrandPanelQuintie() {
    return brandPanelQuintie;
  }

  public void setBrandPanelQuintie(GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie) {
    this.brandPanelQuintie = brandPanelQuintie;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelPanorama(GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama) {
    this.brandPanelPanorama = brandPanelPanorama;
    return this;
  }

  /**
   * Get brandPanelPanorama
   * @return brandPanelPanorama
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBrandPanelPanorama getBrandPanelPanorama() {
    return brandPanelPanorama;
  }

  public void setBrandPanelPanorama(GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama) {
    this.brandPanelPanorama = brandPanelPanorama;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelPanoramaVideo(GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo brandPanelPanoramaVideo) {
    this.brandPanelPanoramaVideo = brandPanelPanoramaVideo;
    return this;
  }

  /**
   * Get brandPanelPanoramaVideo
   * @return brandPanelPanoramaVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo getBrandPanelPanoramaVideo() {
    return brandPanelPanoramaVideo;
  }

  public void setBrandPanelPanoramaVideo(GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo brandPanelPanoramaVideo) {
    this.brandPanelPanoramaVideo = brandPanelPanoramaVideo;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelQuintieVideo(GuaranteedAdGroupAdServiceBrandPanelQuintieVideo brandPanelQuintieVideo) {
    this.brandPanelQuintieVideo = brandPanelQuintieVideo;
    return this;
  }

  /**
   * Get brandPanelQuintieVideo
   * @return brandPanelQuintieVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo getBrandPanelQuintieVideo() {
    return brandPanelQuintieVideo;
  }

  public void setBrandPanelQuintieVideo(GuaranteedAdGroupAdServiceBrandPanelQuintieVideo brandPanelQuintieVideo) {
    this.brandPanelQuintieVideo = brandPanelQuintieVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquare(GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare) {
    this.topImpactSquare = topImpactSquare;
    return this;
  }

  /**
   * Get topImpactSquare
   * @return topImpactSquare
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactSquare getTopImpactSquare() {
    return topImpactSquare;
  }

  public void setTopImpactSquare(GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare) {
    this.topImpactSquare = topImpactSquare;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareVideo(GuaranteedAdGroupAdServiceTopImpactSquareVideo topImpactSquareVideo) {
    this.topImpactSquareVideo = topImpactSquareVideo;
    return this;
  }

  /**
   * Get topImpactSquareVideo
   * @return topImpactSquareVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactSquareVideo getTopImpactSquareVideo() {
    return topImpactSquareVideo;
  }

  public void setTopImpactSquareVideo(GuaranteedAdGroupAdServiceTopImpactSquareVideo topImpactSquareVideo) {
    this.topImpactSquareVideo = topImpactSquareVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactQuintie(GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie) {
    this.topImpactQuintie = topImpactQuintie;
    return this;
  }

  /**
   * Get topImpactQuintie
   * @return topImpactQuintie
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactQuintie getTopImpactQuintie() {
    return topImpactQuintie;
  }

  public void setTopImpactQuintie(GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie) {
    this.topImpactQuintie = topImpactQuintie;
  }

  public GuaranteedAdGroupAdServiceAd topImpactQuintieVideo(GuaranteedAdGroupAdServiceTopImpactQuintieVideo topImpactQuintieVideo) {
    this.topImpactQuintieVideo = topImpactQuintieVideo;
    return this;
  }

  /**
   * Get topImpactQuintieVideo
   * @return topImpactQuintieVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactQuintieVideo getTopImpactQuintieVideo() {
    return topImpactQuintieVideo;
  }

  public void setTopImpactQuintieVideo(GuaranteedAdGroupAdServiceTopImpactQuintieVideo topImpactQuintieVideo) {
    this.topImpactQuintieVideo = topImpactQuintieVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanorama(GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama) {
    this.topImpactPanorama = topImpactPanorama;
    return this;
  }

  /**
   * Get topImpactPanorama
   * @return topImpactPanorama
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPanorama getTopImpactPanorama() {
    return topImpactPanorama;
  }

  public void setTopImpactPanorama(GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama) {
    this.topImpactPanorama = topImpactPanorama;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaVideo topImpactPanoramaVideo) {
    this.topImpactPanoramaVideo = topImpactPanoramaVideo;
    return this;
  }

  /**
   * Get topImpactPanoramaVideo
   * @return topImpactPanoramaVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPanoramaVideo getTopImpactPanoramaVideo() {
    return topImpactPanoramaVideo;
  }

  public void setTopImpactPanoramaVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaVideo topImpactPanoramaVideo) {
    this.topImpactPanoramaVideo = topImpactPanoramaVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideVisionVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo topImpactPanoramaSideVisionVideo) {
    this.topImpactPanoramaSideVisionVideo = topImpactPanoramaSideVisionVideo;
    return this;
  }

  /**
   * Get topImpactPanoramaSideVisionVideo
   * @return topImpactPanoramaSideVisionVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo getTopImpactPanoramaSideVisionVideo() {
    return topImpactPanoramaSideVisionVideo;
  }

  public void setTopImpactPanoramaSideVisionVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo topImpactPanoramaSideVisionVideo) {
    this.topImpactPanoramaSideVisionVideo = topImpactPanoramaSideVisionVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideSwitchVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo topImpactPanoramaSideSwitchVideo) {
    this.topImpactPanoramaSideSwitchVideo = topImpactPanoramaSideSwitchVideo;
    return this;
  }

  /**
   * Get topImpactPanoramaSideSwitchVideo
   * @return topImpactPanoramaSideSwitchVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo getTopImpactPanoramaSideSwitchVideo() {
    return topImpactPanoramaSideSwitchVideo;
  }

  public void setTopImpactPanoramaSideSwitchVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo topImpactPanoramaSideSwitchVideo) {
    this.topImpactPanoramaSideSwitchVideo = topImpactPanoramaSideSwitchVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactTheaterVideo(GuaranteedAdGroupAdServiceTopImpactTheaterVideo topImpactTheaterVideo) {
    this.topImpactTheaterVideo = topImpactTheaterVideo;
    return this;
  }

  /**
   * Get topImpactTheaterVideo
   * @return topImpactTheaterVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactTheaterVideo getTopImpactTheaterVideo() {
    return topImpactTheaterVideo;
  }

  public void setTopImpactTheaterVideo(GuaranteedAdGroupAdServiceTopImpactTheaterVideo topImpactTheaterVideo) {
    this.topImpactTheaterVideo = topImpactTheaterVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareSpecial(GuaranteedAdGroupAdServiceTopImpactSquareSpecial topImpactSquareSpecial) {
    this.topImpactSquareSpecial = topImpactSquareSpecial;
    return this;
  }

  /**
   * Get topImpactSquareSpecial
   * @return topImpactSquareSpecial
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactSquareSpecial getTopImpactSquareSpecial() {
    return topImpactSquareSpecial;
  }

  public void setTopImpactSquareSpecial(GuaranteedAdGroupAdServiceTopImpactSquareSpecial topImpactSquareSpecial) {
    this.topImpactSquareSpecial = topImpactSquareSpecial;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareSpecialVideo(GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo topImpactSquareSpecialVideo) {
    this.topImpactSquareSpecialVideo = topImpactSquareSpecialVideo;
    return this;
  }

  /**
   * Get topImpactSquareSpecialVideo
   * @return topImpactSquareSpecialVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo getTopImpactSquareSpecialVideo() {
    return topImpactSquareSpecialVideo;
  }

  public void setTopImpactSquareSpecialVideo(GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo topImpactSquareSpecialVideo) {
    this.topImpactSquareSpecialVideo = topImpactSquareSpecialVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPrimeDisplayDouble(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble) {
    this.topImpactPrimeDisplayDouble = topImpactPrimeDisplayDouble;
    return this;
  }

  /**
   * Get topImpactPrimeDisplayDouble
   * @return topImpactPrimeDisplayDouble
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble getTopImpactPrimeDisplayDouble() {
    return topImpactPrimeDisplayDouble;
  }

  public void setTopImpactPrimeDisplayDouble(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble) {
    this.topImpactPrimeDisplayDouble = topImpactPrimeDisplayDouble;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPrimeDisplayDoubleVideo(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo topImpactPrimeDisplayDoubleVideo) {
    this.topImpactPrimeDisplayDoubleVideo = topImpactPrimeDisplayDoubleVideo;
    return this;
  }

  /**
   * Get topImpactPrimeDisplayDoubleVideo
   * @return topImpactPrimeDisplayDoubleVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo getTopImpactPrimeDisplayDoubleVideo() {
    return topImpactPrimeDisplayDoubleVideo;
  }

  public void setTopImpactPrimeDisplayDoubleVideo(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo topImpactPrimeDisplayDoubleVideo) {
    this.topImpactPrimeDisplayDoubleVideo = topImpactPrimeDisplayDoubleVideo;
  }

  public GuaranteedAdGroupAdServiceAd instreamVideo(GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo) {
    this.instreamVideo = instreamVideo;
    return this;
  }

  /**
   * Get instreamVideo
   * @return instreamVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceInstreamVideoAd getInstreamVideo() {
    return instreamVideo;
  }

  public void setInstreamVideo(GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo) {
    this.instreamVideo = instreamVideo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceAd guaranteedAdGroupAdServiceAd = (GuaranteedAdGroupAdServiceAd) o;
    return Objects.equals(this.adType, guaranteedAdGroupAdServiceAd.adType) &&
        Objects.equals(this.bannerImageAd, guaranteedAdGroupAdServiceAd.bannerImageAd) &&
        Objects.equals(this.bannerVideoAd, guaranteedAdGroupAdServiceAd.bannerVideoAd) &&
        Objects.equals(this.brandPanelQuintie, guaranteedAdGroupAdServiceAd.brandPanelQuintie) &&
        Objects.equals(this.brandPanelPanorama, guaranteedAdGroupAdServiceAd.brandPanelPanorama) &&
        Objects.equals(this.brandPanelPanoramaVideo, guaranteedAdGroupAdServiceAd.brandPanelPanoramaVideo) &&
        Objects.equals(this.brandPanelQuintieVideo, guaranteedAdGroupAdServiceAd.brandPanelQuintieVideo) &&
        Objects.equals(this.topImpactSquare, guaranteedAdGroupAdServiceAd.topImpactSquare) &&
        Objects.equals(this.topImpactSquareVideo, guaranteedAdGroupAdServiceAd.topImpactSquareVideo) &&
        Objects.equals(this.topImpactQuintie, guaranteedAdGroupAdServiceAd.topImpactQuintie) &&
        Objects.equals(this.topImpactQuintieVideo, guaranteedAdGroupAdServiceAd.topImpactQuintieVideo) &&
        Objects.equals(this.topImpactPanorama, guaranteedAdGroupAdServiceAd.topImpactPanorama) &&
        Objects.equals(this.topImpactPanoramaVideo, guaranteedAdGroupAdServiceAd.topImpactPanoramaVideo) &&
        Objects.equals(this.topImpactPanoramaSideVisionVideo, guaranteedAdGroupAdServiceAd.topImpactPanoramaSideVisionVideo) &&
        Objects.equals(this.topImpactPanoramaSideSwitchVideo, guaranteedAdGroupAdServiceAd.topImpactPanoramaSideSwitchVideo) &&
        Objects.equals(this.topImpactTheaterVideo, guaranteedAdGroupAdServiceAd.topImpactTheaterVideo) &&
        Objects.equals(this.topImpactSquareSpecial, guaranteedAdGroupAdServiceAd.topImpactSquareSpecial) &&
        Objects.equals(this.topImpactSquareSpecialVideo, guaranteedAdGroupAdServiceAd.topImpactSquareSpecialVideo) &&
        Objects.equals(this.topImpactPrimeDisplayDouble, guaranteedAdGroupAdServiceAd.topImpactPrimeDisplayDouble) &&
        Objects.equals(this.topImpactPrimeDisplayDoubleVideo, guaranteedAdGroupAdServiceAd.topImpactPrimeDisplayDoubleVideo) &&
        Objects.equals(this.instreamVideo, guaranteedAdGroupAdServiceAd.instreamVideo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bannerImageAd, bannerVideoAd, brandPanelQuintie, brandPanelPanorama, brandPanelPanoramaVideo, brandPanelQuintieVideo, topImpactSquare, topImpactSquareVideo, topImpactQuintie, topImpactQuintieVideo, topImpactPanorama, topImpactPanoramaVideo, topImpactPanoramaSideVisionVideo, topImpactPanoramaSideSwitchVideo, topImpactTheaterVideo, topImpactSquareSpecial, topImpactSquareSpecialVideo, topImpactPrimeDisplayDouble, topImpactPrimeDisplayDoubleVideo, instreamVideo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceAd {\n");
    
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    bannerImageAd: ").append(toIndentedString(bannerImageAd)).append("\n");
    sb.append("    bannerVideoAd: ").append(toIndentedString(bannerVideoAd)).append("\n");
    sb.append("    brandPanelQuintie: ").append(toIndentedString(brandPanelQuintie)).append("\n");
    sb.append("    brandPanelPanorama: ").append(toIndentedString(brandPanelPanorama)).append("\n");
    sb.append("    brandPanelPanoramaVideo: ").append(toIndentedString(brandPanelPanoramaVideo)).append("\n");
    sb.append("    brandPanelQuintieVideo: ").append(toIndentedString(brandPanelQuintieVideo)).append("\n");
    sb.append("    topImpactSquare: ").append(toIndentedString(topImpactSquare)).append("\n");
    sb.append("    topImpactSquareVideo: ").append(toIndentedString(topImpactSquareVideo)).append("\n");
    sb.append("    topImpactQuintie: ").append(toIndentedString(topImpactQuintie)).append("\n");
    sb.append("    topImpactQuintieVideo: ").append(toIndentedString(topImpactQuintieVideo)).append("\n");
    sb.append("    topImpactPanorama: ").append(toIndentedString(topImpactPanorama)).append("\n");
    sb.append("    topImpactPanoramaVideo: ").append(toIndentedString(topImpactPanoramaVideo)).append("\n");
    sb.append("    topImpactPanoramaSideVisionVideo: ").append(toIndentedString(topImpactPanoramaSideVisionVideo)).append("\n");
    sb.append("    topImpactPanoramaSideSwitchVideo: ").append(toIndentedString(topImpactPanoramaSideSwitchVideo)).append("\n");
    sb.append("    topImpactTheaterVideo: ").append(toIndentedString(topImpactTheaterVideo)).append("\n");
    sb.append("    topImpactSquareSpecial: ").append(toIndentedString(topImpactSquareSpecial)).append("\n");
    sb.append("    topImpactSquareSpecialVideo: ").append(toIndentedString(topImpactSquareSpecialVideo)).append("\n");
    sb.append("    topImpactPrimeDisplayDouble: ").append(toIndentedString(topImpactPrimeDisplayDouble)).append("\n");
    sb.append("    topImpactPrimeDisplayDoubleVideo: ").append(toIndentedString(topImpactPrimeDisplayDoubleVideo)).append("\n");
    sb.append("    instreamVideo: ").append(toIndentedString(instreamVideo)).append("\n");
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

