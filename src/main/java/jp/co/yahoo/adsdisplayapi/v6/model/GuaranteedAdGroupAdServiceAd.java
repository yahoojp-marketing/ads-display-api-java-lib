/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBannerImageAd;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBannerVideoAd;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBrandPanelPanorama;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBrandPanelQuintie;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceBrandPanelQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceInstreamVideoAd;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPanorama;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPanoramaVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactQuintie;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactQuintieVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactSquare;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecial;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactSquareVideo;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceTopImpactTheaterVideo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceAd object is a container for storing ads.<br> </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_AD_TYPE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BANNER_IMAGE_AD,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BANNER_VIDEO_AD,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_QUINTIE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_PANORAMA,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_PANORAMA_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_QUINTIE_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_SQUARE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_SQUARE_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_QUINTIE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_QUINTIE_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_THEATER_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_INSTREAM_VIDEO,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_CAROUSEL_AD
})
@JsonTypeName("GuaranteedAdGroupAdServiceAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceAd {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private GuaranteedAdGroupAdServiceAdType adType;

  public static final String JSON_PROPERTY_BANNER_IMAGE_AD = "bannerImageAd";
  private GuaranteedAdGroupAdServiceBannerImageAd bannerImageAd;

  public static final String JSON_PROPERTY_BANNER_VIDEO_AD = "bannerVideoAd";
  private GuaranteedAdGroupAdServiceBannerVideoAd bannerVideoAd;

  public static final String JSON_PROPERTY_BRAND_PANEL_QUINTIE = "brandPanelQuintie";
  private GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie;

  public static final String JSON_PROPERTY_BRAND_PANEL_PANORAMA = "brandPanelPanorama";
  private GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama;

  public static final String JSON_PROPERTY_BRAND_PANEL_PANORAMA_VIDEO = "brandPanelPanoramaVideo";
  private GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo brandPanelPanoramaVideo;

  public static final String JSON_PROPERTY_BRAND_PANEL_QUINTIE_VIDEO = "brandPanelQuintieVideo";
  private GuaranteedAdGroupAdServiceBrandPanelQuintieVideo brandPanelQuintieVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_SQUARE = "topImpactSquare";
  private GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare;

  public static final String JSON_PROPERTY_TOP_IMPACT_SQUARE_VIDEO = "topImpactSquareVideo";
  private GuaranteedAdGroupAdServiceTopImpactSquareVideo topImpactSquareVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_QUINTIE = "topImpactQuintie";
  private GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie;

  public static final String JSON_PROPERTY_TOP_IMPACT_QUINTIE_VIDEO = "topImpactQuintieVideo";
  private GuaranteedAdGroupAdServiceTopImpactQuintieVideo topImpactQuintieVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA = "topImpactPanorama";
  private GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_VIDEO = "topImpactPanoramaVideo";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaVideo topImpactPanoramaVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO = "topImpactPanoramaSideVisionVideo";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo topImpactPanoramaSideVisionVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO = "topImpactPanoramaSideSwitchVideo";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo topImpactPanoramaSideSwitchVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_THEATER_VIDEO = "topImpactTheaterVideo";
  private GuaranteedAdGroupAdServiceTopImpactTheaterVideo topImpactTheaterVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL = "topImpactSquareSpecial";
  private GuaranteedAdGroupAdServiceTopImpactSquareSpecial topImpactSquareSpecial;

  public static final String JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL_VIDEO = "topImpactSquareSpecialVideo";
  private GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo topImpactSquareSpecialVideo;

  public static final String JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE = "topImpactPrimeDisplayDouble";
  private GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble;

  public static final String JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO = "topImpactPrimeDisplayDoubleVideo";
  private GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo topImpactPrimeDisplayDoubleVideo;

  public static final String JSON_PROPERTY_INSTREAM_VIDEO = "instreamVideo";
  private GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo;

  public static final String JSON_PROPERTY_CAROUSEL_AD = "carouselAd";
  private GuaranteedAdGroupAdServiceCarouselAd carouselAd;

  public GuaranteedAdGroupAdServiceAd() { 
  }

  public GuaranteedAdGroupAdServiceAd adType(GuaranteedAdGroupAdServiceAdType adType) {
    
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

  public GuaranteedAdGroupAdServiceAdType getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNER_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBannerImageAd getBannerImageAd() {
    return bannerImageAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_IMAGE_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNER_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBannerVideoAd getBannerVideoAd() {
    return bannerVideoAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_VIDEO_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_QUINTIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBrandPanelQuintie getBrandPanelQuintie() {
    return brandPanelQuintie;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_QUINTIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBrandPanelPanorama getBrandPanelPanorama() {
    return brandPanelPanorama;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaVideo getBrandPanelPanoramaVideo() {
    return brandPanelPanoramaVideo;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_QUINTIE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBrandPanelQuintieVideo getBrandPanelQuintieVideo() {
    return brandPanelQuintieVideo;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_QUINTIE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactSquare getTopImpactSquare() {
    return topImpactSquare;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactSquareVideo getTopImpactSquareVideo() {
    return topImpactSquareVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_QUINTIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactQuintie getTopImpactQuintie() {
    return topImpactQuintie;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_QUINTIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_QUINTIE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactQuintieVideo getTopImpactQuintieVideo() {
    return topImpactQuintieVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_QUINTIE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanorama getTopImpactPanorama() {
    return topImpactPanorama;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaVideo getTopImpactPanoramaVideo() {
    return topImpactPanoramaVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideVisionVideo getTopImpactPanoramaSideVisionVideo() {
    return topImpactPanoramaSideVisionVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitchVideo getTopImpactPanoramaSideSwitchVideo() {
    return topImpactPanoramaSideSwitchVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_THEATER_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactTheaterVideo getTopImpactTheaterVideo() {
    return topImpactTheaterVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_THEATER_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactSquareSpecial getTopImpactSquareSpecial() {
    return topImpactSquareSpecial;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactSquareSpecialVideo getTopImpactSquareSpecialVideo() {
    return topImpactSquareSpecialVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_SQUARE_SPECIAL_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble getTopImpactPrimeDisplayDouble() {
    return topImpactPrimeDisplayDouble;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleVideo getTopImpactPrimeDisplayDoubleVideo() {
    return topImpactPrimeDisplayDoubleVideo;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTREAM_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceInstreamVideoAd getInstreamVideo() {
    return instreamVideo;
  }


  @JsonProperty(JSON_PROPERTY_INSTREAM_VIDEO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstreamVideo(GuaranteedAdGroupAdServiceInstreamVideoAd instreamVideo) {
    this.instreamVideo = instreamVideo;
  }


  public GuaranteedAdGroupAdServiceAd carouselAd(GuaranteedAdGroupAdServiceCarouselAd carouselAd) {
    
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

  public GuaranteedAdGroupAdServiceCarouselAd getCarouselAd() {
    return carouselAd;
  }


  @JsonProperty(JSON_PROPERTY_CAROUSEL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarouselAd(GuaranteedAdGroupAdServiceCarouselAd carouselAd) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

