package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBrandPanelPanorama;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBrandPanelQuintie;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceBrandPanelQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceInstreamVideoAd;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPanorama;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactQuintie;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactSquare;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecial;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactSquareVideo;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupAdServiceTopImpactTheaterVideo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceAd object is a container for storing ads.<br> </div> ")

public class GuaranteedAdGroupAdServiceAd   {
  @JsonProperty("adType")
  private JsonNullable<GuaranteedAdGroupAdServiceAdType> adType = JsonNullable.undefined();

  @JsonProperty("bannerImageAd")
  private JsonNullable<GuaranteedAdGroupAdServiceBannerImageAd> bannerImageAd = JsonNullable.undefined();

  @JsonProperty("bannerVideoAd")
  private JsonNullable<GuaranteedAdGroupAdServiceBannerVideoAd> bannerVideoAd = JsonNullable.undefined();

  @JsonProperty("brandPanelQuintie")
  private JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintie> brandPanelQuintie = JsonNullable.undefined();

  @JsonProperty("brandPanelPanorama")
  private JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanorama> brandPanelPanorama = JsonNullable.undefined();

  @JsonProperty("brandPanelPanoramaVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo> brandPanelPanoramaVideo = JsonNullable.undefined();

  @JsonProperty("brandPanelQuintieVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintieVideo> brandPanelQuintieVideo = JsonNullable.undefined();

  @JsonProperty("topImpactSquare")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquare> topImpactSquare = JsonNullable.undefined();

  @JsonProperty("topImpactSquareVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareVideo> topImpactSquareVideo = JsonNullable.undefined();

  @JsonProperty("topImpactQuintie")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintie> topImpactQuintie = JsonNullable.undefined();

  @JsonProperty("topImpactQuintieVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintieVideo> topImpactQuintieVideo = JsonNullable.undefined();

  @JsonProperty("topImpactPanorama")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanorama> topImpactPanorama = JsonNullable.undefined();

  @JsonProperty("topImpactPanoramaVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaVideo> topImpactPanoramaVideo = JsonNullable.undefined();

  @JsonProperty("topImpactPanoramaSideVisionVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo> topImpactPanoramaSideVisionVideo = JsonNullable.undefined();

  @JsonProperty("topImpactPanoramaSideSwitchVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo> topImpactPanoramaSideSwitchVideo = JsonNullable.undefined();

  @JsonProperty("topImpactTheaterVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactTheaterVideo> topImpactTheaterVideo = JsonNullable.undefined();

  @JsonProperty("topImpactSquareSpecial")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecial> topImpactSquareSpecial = JsonNullable.undefined();

  @JsonProperty("topImpactSquareSpecialVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo> topImpactSquareSpecialVideo = JsonNullable.undefined();

  @JsonProperty("topImpactPrimeDisplayDouble")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble> topImpactPrimeDisplayDouble = JsonNullable.undefined();

  @JsonProperty("topImpactPrimeDisplayDoubleVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo> topImpactPrimeDisplayDoubleVideo = JsonNullable.undefined();

  @JsonProperty("instreamVideo")
  private JsonNullable<GuaranteedAdGroupAdServiceInstreamVideoAd> instreamVideo = JsonNullable.undefined();

  @JsonProperty("carouselAd")
  private JsonNullable<GuaranteedAdGroupAdServiceCarouselAd> carouselAd = JsonNullable.undefined();

  public GuaranteedAdGroupAdServiceAd adType(GuaranteedAdGroupAdServiceAdType adType) {
    this.adType = JsonNullable.of(adType);
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceAdType> getAdType() {
    return adType;
  }

  public void setAdType(JsonNullable<GuaranteedAdGroupAdServiceAdType> adType) {
    this.adType = adType;
  }

  public GuaranteedAdGroupAdServiceAd bannerImageAd(GuaranteedAdGroupAdServiceBannerImageAd bannerImageAd) {
    this.bannerImageAd = JsonNullable.of(bannerImageAd);
    return this;
  }

  /**
   * Get bannerImageAd
   * @return bannerImageAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBannerImageAd> getBannerImageAd() {
    return bannerImageAd;
  }

  public void setBannerImageAd(JsonNullable<GuaranteedAdGroupAdServiceBannerImageAd> bannerImageAd) {
    this.bannerImageAd = bannerImageAd;
  }

  public GuaranteedAdGroupAdServiceAd bannerVideoAd(GuaranteedAdGroupAdServiceBannerVideoAd bannerVideoAd) {
    this.bannerVideoAd = JsonNullable.of(bannerVideoAd);
    return this;
  }

  /**
   * Get bannerVideoAd
   * @return bannerVideoAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBannerVideoAd> getBannerVideoAd() {
    return bannerVideoAd;
  }

  public void setBannerVideoAd(JsonNullable<GuaranteedAdGroupAdServiceBannerVideoAd> bannerVideoAd) {
    this.bannerVideoAd = bannerVideoAd;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelQuintie(GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie) {
    this.brandPanelQuintie = JsonNullable.of(brandPanelQuintie);
    return this;
  }

  /**
   * Get brandPanelQuintie
   * @return brandPanelQuintie
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintie> getBrandPanelQuintie() {
    return brandPanelQuintie;
  }

  public void setBrandPanelQuintie(JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintie> brandPanelQuintie) {
    this.brandPanelQuintie = brandPanelQuintie;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelPanorama(GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama) {
    this.brandPanelPanorama = JsonNullable.of(brandPanelPanorama);
    return this;
  }

  /**
   * Get brandPanelPanorama
   * @return brandPanelPanorama
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanorama> getBrandPanelPanorama() {
    return brandPanelPanorama;
  }

  public void setBrandPanelPanorama(JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanorama> brandPanelPanorama) {
    this.brandPanelPanorama = brandPanelPanorama;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelPanoramaVideo(GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo brandPanelPanoramaVideo) {
    this.brandPanelPanoramaVideo = JsonNullable.of(brandPanelPanoramaVideo);
    return this;
  }

  /**
   * Get brandPanelPanoramaVideo
   * @return brandPanelPanoramaVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo> getBrandPanelPanoramaVideo() {
    return brandPanelPanoramaVideo;
  }

  public void setBrandPanelPanoramaVideo(JsonNullable<GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo> brandPanelPanoramaVideo) {
    this.brandPanelPanoramaVideo = brandPanelPanoramaVideo;
  }

  public GuaranteedAdGroupAdServiceAd brandPanelQuintieVideo(GuaranteedAdGroupAdServiceBrandPanelQuintieVideo brandPanelQuintieVideo) {
    this.brandPanelQuintieVideo = JsonNullable.of(brandPanelQuintieVideo);
    return this;
  }

  /**
   * Get brandPanelQuintieVideo
   * @return brandPanelQuintieVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintieVideo> getBrandPanelQuintieVideo() {
    return brandPanelQuintieVideo;
  }

  public void setBrandPanelQuintieVideo(JsonNullable<GuaranteedAdGroupAdServiceBrandPanelQuintieVideo> brandPanelQuintieVideo) {
    this.brandPanelQuintieVideo = brandPanelQuintieVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquare(GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare) {
    this.topImpactSquare = JsonNullable.of(topImpactSquare);
    return this;
  }

  /**
   * Get topImpactSquare
   * @return topImpactSquare
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquare> getTopImpactSquare() {
    return topImpactSquare;
  }

  public void setTopImpactSquare(JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquare> topImpactSquare) {
    this.topImpactSquare = topImpactSquare;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareVideo(GuaranteedAdGroupAdServiceTopImpactSquareVideo topImpactSquareVideo) {
    this.topImpactSquareVideo = JsonNullable.of(topImpactSquareVideo);
    return this;
  }

  /**
   * Get topImpactSquareVideo
   * @return topImpactSquareVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareVideo> getTopImpactSquareVideo() {
    return topImpactSquareVideo;
  }

  public void setTopImpactSquareVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareVideo> topImpactSquareVideo) {
    this.topImpactSquareVideo = topImpactSquareVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactQuintie(GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie) {
    this.topImpactQuintie = JsonNullable.of(topImpactQuintie);
    return this;
  }

  /**
   * Get topImpactQuintie
   * @return topImpactQuintie
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintie> getTopImpactQuintie() {
    return topImpactQuintie;
  }

  public void setTopImpactQuintie(JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintie> topImpactQuintie) {
    this.topImpactQuintie = topImpactQuintie;
  }

  public GuaranteedAdGroupAdServiceAd topImpactQuintieVideo(GuaranteedAdGroupAdServiceTopImpactQuintieVideo topImpactQuintieVideo) {
    this.topImpactQuintieVideo = JsonNullable.of(topImpactQuintieVideo);
    return this;
  }

  /**
   * Get topImpactQuintieVideo
   * @return topImpactQuintieVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintieVideo> getTopImpactQuintieVideo() {
    return topImpactQuintieVideo;
  }

  public void setTopImpactQuintieVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactQuintieVideo> topImpactQuintieVideo) {
    this.topImpactQuintieVideo = topImpactQuintieVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanorama(GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama) {
    this.topImpactPanorama = JsonNullable.of(topImpactPanorama);
    return this;
  }

  /**
   * Get topImpactPanorama
   * @return topImpactPanorama
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanorama> getTopImpactPanorama() {
    return topImpactPanorama;
  }

  public void setTopImpactPanorama(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanorama> topImpactPanorama) {
    this.topImpactPanorama = topImpactPanorama;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaVideo topImpactPanoramaVideo) {
    this.topImpactPanoramaVideo = JsonNullable.of(topImpactPanoramaVideo);
    return this;
  }

  /**
   * Get topImpactPanoramaVideo
   * @return topImpactPanoramaVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaVideo> getTopImpactPanoramaVideo() {
    return topImpactPanoramaVideo;
  }

  public void setTopImpactPanoramaVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaVideo> topImpactPanoramaVideo) {
    this.topImpactPanoramaVideo = topImpactPanoramaVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideVisionVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo topImpactPanoramaSideVisionVideo) {
    this.topImpactPanoramaSideVisionVideo = JsonNullable.of(topImpactPanoramaSideVisionVideo);
    return this;
  }

  /**
   * Get topImpactPanoramaSideVisionVideo
   * @return topImpactPanoramaSideVisionVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo> getTopImpactPanoramaSideVisionVideo() {
    return topImpactPanoramaSideVisionVideo;
  }

  public void setTopImpactPanoramaSideVisionVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo> topImpactPanoramaSideVisionVideo) {
    this.topImpactPanoramaSideVisionVideo = topImpactPanoramaSideVisionVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideSwitchVideo(GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo topImpactPanoramaSideSwitchVideo) {
    this.topImpactPanoramaSideSwitchVideo = JsonNullable.of(topImpactPanoramaSideSwitchVideo);
    return this;
  }

  /**
   * Get topImpactPanoramaSideSwitchVideo
   * @return topImpactPanoramaSideSwitchVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo> getTopImpactPanoramaSideSwitchVideo() {
    return topImpactPanoramaSideSwitchVideo;
  }

  public void setTopImpactPanoramaSideSwitchVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo> topImpactPanoramaSideSwitchVideo) {
    this.topImpactPanoramaSideSwitchVideo = topImpactPanoramaSideSwitchVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactTheaterVideo(GuaranteedAdGroupAdServiceTopImpactTheaterVideo topImpactTheaterVideo) {
    this.topImpactTheaterVideo = JsonNullable.of(topImpactTheaterVideo);
    return this;
  }

  /**
   * Get topImpactTheaterVideo
   * @return topImpactTheaterVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactTheaterVideo> getTopImpactTheaterVideo() {
    return topImpactTheaterVideo;
  }

  public void setTopImpactTheaterVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactTheaterVideo> topImpactTheaterVideo) {
    this.topImpactTheaterVideo = topImpactTheaterVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareSpecial(GuaranteedAdGroupAdServiceTopImpactSquareSpecial topImpactSquareSpecial) {
    this.topImpactSquareSpecial = JsonNullable.of(topImpactSquareSpecial);
    return this;
  }

  /**
   * Get topImpactSquareSpecial
   * @return topImpactSquareSpecial
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecial> getTopImpactSquareSpecial() {
    return topImpactSquareSpecial;
  }

  public void setTopImpactSquareSpecial(JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecial> topImpactSquareSpecial) {
    this.topImpactSquareSpecial = topImpactSquareSpecial;
  }

  public GuaranteedAdGroupAdServiceAd topImpactSquareSpecialVideo(GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo topImpactSquareSpecialVideo) {
    this.topImpactSquareSpecialVideo = JsonNullable.of(topImpactSquareSpecialVideo);
    return this;
  }

  /**
   * Get topImpactSquareSpecialVideo
   * @return topImpactSquareSpecialVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo> getTopImpactSquareSpecialVideo() {
    return topImpactSquareSpecialVideo;
  }

  public void setTopImpactSquareSpecialVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo> topImpactSquareSpecialVideo) {
    this.topImpactSquareSpecialVideo = topImpactSquareSpecialVideo;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPrimeDisplayDouble(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble) {
    this.topImpactPrimeDisplayDouble = JsonNullable.of(topImpactPrimeDisplayDouble);
    return this;
  }

  /**
   * Get topImpactPrimeDisplayDouble
   * @return topImpactPrimeDisplayDouble
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble> getTopImpactPrimeDisplayDouble() {
    return topImpactPrimeDisplayDouble;
  }

  public void setTopImpactPrimeDisplayDouble(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble> topImpactPrimeDisplayDouble) {
    this.topImpactPrimeDisplayDouble = topImpactPrimeDisplayDouble;
  }

  public GuaranteedAdGroupAdServiceAd topImpactPrimeDisplayDoubleVideo(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo topImpactPrimeDisplayDoubleVideo) {
    this.topImpactPrimeDisplayDoubleVideo = JsonNullable.of(topImpactPrimeDisplayDoubleVideo);
    return this;
  }

  /**
   * Get topImpactPrimeDisplayDoubleVideo
   * @return topImpactPrimeDisplayDoubleVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo> getTopImpactPrimeDisplayDoubleVideo() {
    return topImpactPrimeDisplayDoubleVideo;
  }

  public void setTopImpactPrimeDisplayDoubleVideo(JsonNullable<GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo> topImpactPrimeDisplayDoubleVideo) {
    this.topImpactPrimeDisplayDoubleVideo = topImpactPrimeDisplayDoubleVideo;
  }

  public GuaranteedAdGroupAdServiceAd instreamVideo(GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo) {
    this.instreamVideo = JsonNullable.of(instreamVideo);
    return this;
  }

  /**
   * Get instreamVideo
   * @return instreamVideo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceInstreamVideoAd> getInstreamVideo() {
    return instreamVideo;
  }

  public void setInstreamVideo(JsonNullable<GuaranteedAdGroupAdServiceInstreamVideoAd> instreamVideo) {
    this.instreamVideo = instreamVideo;
  }

  public GuaranteedAdGroupAdServiceAd carouselAd(GuaranteedAdGroupAdServiceCarouselAd carouselAd) {
    this.carouselAd = JsonNullable.of(carouselAd);
    return this;
  }

  /**
   * Get carouselAd
   * @return carouselAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupAdServiceCarouselAd> getCarouselAd() {
    return carouselAd;
  }

  public void setCarouselAd(JsonNullable<GuaranteedAdGroupAdServiceCarouselAd> carouselAd) {
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
        Objects.equals(this.instreamVideo, guaranteedAdGroupAdServiceAd.instreamVideo) &&
        Objects.equals(this.carouselAd, guaranteedAdGroupAdServiceAd.carouselAd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bannerImageAd, bannerVideoAd, brandPanelQuintie, brandPanelPanorama, brandPanelPanoramaVideo, brandPanelQuintieVideo, topImpactSquare, topImpactSquareVideo, topImpactQuintie, topImpactQuintieVideo, topImpactPanorama, topImpactPanoramaVideo, topImpactPanoramaSideVisionVideo, topImpactPanoramaSideSwitchVideo, topImpactTheaterVideo, topImpactSquareSpecial, topImpactSquareSpecialVideo, topImpactPrimeDisplayDouble, topImpactPrimeDisplayDoubleVideo, instreamVideo, carouselAd);
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

