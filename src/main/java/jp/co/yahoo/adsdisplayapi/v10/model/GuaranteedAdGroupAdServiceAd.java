/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceBannerAd;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceBrandPanelPanorama;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceBrandPanelQuintie;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceCarouselAd;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceInstreamAd;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceMainMediaFormat;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPanorama;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitch;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPanoramaSideVision;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactQuintie;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactSquare;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactTheater;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceAdオブジェクトは、広告を格納するコンテナです。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceAd object is a container for storing ads.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_AD_TYPE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_MAIN_MEDIA_FORMAT,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BANNER_AD,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_CAROUSEL_AD,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_INSTREAM_AD,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_QUINTIE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_PANORAMA,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_BRAND_PANEL_PANORAMA_PANEL_SWITCH,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_SQUARE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_QUINTIE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_THEATER,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH,
  GuaranteedAdGroupAdServiceAd.JSON_PROPERTY_TOP_IMPACT_PANORAMA_PANEL_SWITCH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceAd {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private GuaranteedAdGroupAdServiceAdType adType;

  public static final String JSON_PROPERTY_MAIN_MEDIA_FORMAT = "mainMediaFormat";
  private GuaranteedAdGroupAdServiceMainMediaFormat mainMediaFormat;

  public static final String JSON_PROPERTY_BANNER_AD = "bannerAd";
  private GuaranteedAdGroupAdServiceBannerAd bannerAd;

  public static final String JSON_PROPERTY_CAROUSEL_AD = "carouselAd";
  private GuaranteedAdGroupAdServiceCarouselAd carouselAd;

  public static final String JSON_PROPERTY_INSTREAM_AD = "instreamAd";
  private GuaranteedAdGroupAdServiceInstreamAd instreamAd;

  public static final String JSON_PROPERTY_BRAND_PANEL_QUINTIE = "brandPanelQuintie";
  private GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie;

  public static final String JSON_PROPERTY_BRAND_PANEL_PANORAMA = "brandPanelPanorama";
  private GuaranteedAdGroupAdServiceBrandPanelPanorama brandPanelPanorama;

  public static final String JSON_PROPERTY_BRAND_PANEL_PANORAMA_PANEL_SWITCH = "brandPanelPanoramaPanelSwitch";
  private GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd brandPanelPanoramaPanelSwitch;

  public static final String JSON_PROPERTY_TOP_IMPACT_SQUARE = "topImpactSquare";
  private GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare;

  public static final String JSON_PROPERTY_TOP_IMPACT_QUINTIE = "topImpactQuintie";
  private GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie;

  public static final String JSON_PROPERTY_TOP_IMPACT_THEATER = "topImpactTheater";
  private GuaranteedAdGroupAdServiceTopImpactTheater topImpactTheater;

  public static final String JSON_PROPERTY_TOP_IMPACT_PRIME_DISPLAY_DOUBLE = "topImpactPrimeDisplayDouble";
  private GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA = "topImpactPanorama";
  private GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION = "topImpactPanoramaSideVision";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideVision topImpactPanoramaSideVision;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH = "topImpactPanoramaSideSwitch";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitch topImpactPanoramaSideSwitch;

  public static final String JSON_PROPERTY_TOP_IMPACT_PANORAMA_PANEL_SWITCH = "topImpactPanoramaPanelSwitch";
  private GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd topImpactPanoramaPanelSwitch;

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
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd mainMediaFormat(GuaranteedAdGroupAdServiceMainMediaFormat mainMediaFormat) {
    
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

  public GuaranteedAdGroupAdServiceMainMediaFormat getMainMediaFormat() {
    return mainMediaFormat;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_MEDIA_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainMediaFormat(GuaranteedAdGroupAdServiceMainMediaFormat mainMediaFormat) {
    this.mainMediaFormat = mainMediaFormat;
  }


  public GuaranteedAdGroupAdServiceAd bannerAd(GuaranteedAdGroupAdServiceBannerAd bannerAd) {
    
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

  public GuaranteedAdGroupAdServiceBannerAd getBannerAd() {
    return bannerAd;
  }


  @JsonProperty(JSON_PROPERTY_BANNER_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannerAd(GuaranteedAdGroupAdServiceBannerAd bannerAd) {
    this.bannerAd = bannerAd;
  }


  public GuaranteedAdGroupAdServiceAd carouselAd(GuaranteedAdGroupAdServiceCarouselAd carouselAd) {
    
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

  public GuaranteedAdGroupAdServiceCarouselAd getCarouselAd() {
    return carouselAd;
  }


  @JsonProperty(JSON_PROPERTY_CAROUSEL_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarouselAd(GuaranteedAdGroupAdServiceCarouselAd carouselAd) {
    this.carouselAd = carouselAd;
  }


  public GuaranteedAdGroupAdServiceAd instreamAd(GuaranteedAdGroupAdServiceInstreamAd instreamAd) {
    
    this.instreamAd = instreamAd;
    return this;
  }

   /**
   * Get instreamAd
   * @return instreamAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTREAM_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceInstreamAd getInstreamAd() {
    return instreamAd;
  }


  @JsonProperty(JSON_PROPERTY_INSTREAM_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstreamAd(GuaranteedAdGroupAdServiceInstreamAd instreamAd) {
    this.instreamAd = instreamAd;
  }


  public GuaranteedAdGroupAdServiceAd brandPanelQuintie(GuaranteedAdGroupAdServiceBrandPanelQuintie brandPanelQuintie) {
    
    this.brandPanelQuintie = brandPanelQuintie;
    return this;
  }

   /**
   * Get brandPanelQuintie
   * @return brandPanelQuintie
  **/
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd brandPanelPanoramaPanelSwitch(GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd brandPanelPanoramaPanelSwitch) {
    
    this.brandPanelPanoramaPanelSwitch = brandPanelPanoramaPanelSwitch;
    return this;
  }

   /**
   * Get brandPanelPanoramaPanelSwitch
   * @return brandPanelPanoramaPanelSwitch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA_PANEL_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd getBrandPanelPanoramaPanelSwitch() {
    return brandPanelPanoramaPanelSwitch;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_PANEL_PANORAMA_PANEL_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandPanelPanoramaPanelSwitch(GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd brandPanelPanoramaPanelSwitch) {
    this.brandPanelPanoramaPanelSwitch = brandPanelPanoramaPanelSwitch;
  }


  public GuaranteedAdGroupAdServiceAd topImpactSquare(GuaranteedAdGroupAdServiceTopImpactSquare topImpactSquare) {
    
    this.topImpactSquare = topImpactSquare;
    return this;
  }

   /**
   * Get topImpactSquare
   * @return topImpactSquare
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd topImpactQuintie(GuaranteedAdGroupAdServiceTopImpactQuintie topImpactQuintie) {
    
    this.topImpactQuintie = topImpactQuintie;
    return this;
  }

   /**
   * Get topImpactQuintie
   * @return topImpactQuintie
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd topImpactTheater(GuaranteedAdGroupAdServiceTopImpactTheater topImpactTheater) {
    
    this.topImpactTheater = topImpactTheater;
    return this;
  }

   /**
   * Get topImpactTheater
   * @return topImpactTheater
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_THEATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactTheater getTopImpactTheater() {
    return topImpactTheater;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_THEATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpactTheater(GuaranteedAdGroupAdServiceTopImpactTheater topImpactTheater) {
    this.topImpactTheater = topImpactTheater;
  }


  public GuaranteedAdGroupAdServiceAd topImpactPrimeDisplayDouble(GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble topImpactPrimeDisplayDouble) {
    
    this.topImpactPrimeDisplayDouble = topImpactPrimeDisplayDouble;
    return this;
  }

   /**
   * Get topImpactPrimeDisplayDouble
   * @return topImpactPrimeDisplayDouble
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd topImpactPanorama(GuaranteedAdGroupAdServiceTopImpactPanorama topImpactPanorama) {
    
    this.topImpactPanorama = topImpactPanorama;
    return this;
  }

   /**
   * Get topImpactPanorama
   * @return topImpactPanorama
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideVision(GuaranteedAdGroupAdServiceTopImpactPanoramaSideVision topImpactPanoramaSideVision) {
    
    this.topImpactPanoramaSideVision = topImpactPanoramaSideVision;
    return this;
  }

   /**
   * Get topImpactPanoramaSideVision
   * @return topImpactPanoramaSideVision
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideVision getTopImpactPanoramaSideVision() {
    return topImpactPanoramaSideVision;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_VISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpactPanoramaSideVision(GuaranteedAdGroupAdServiceTopImpactPanoramaSideVision topImpactPanoramaSideVision) {
    this.topImpactPanoramaSideVision = topImpactPanoramaSideVision;
  }


  public GuaranteedAdGroupAdServiceAd topImpactPanoramaSideSwitch(GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitch topImpactPanoramaSideSwitch) {
    
    this.topImpactPanoramaSideSwitch = topImpactPanoramaSideSwitch;
    return this;
  }

   /**
   * Get topImpactPanoramaSideSwitch
   * @return topImpactPanoramaSideSwitch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitch getTopImpactPanoramaSideSwitch() {
    return topImpactPanoramaSideSwitch;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_SIDE_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpactPanoramaSideSwitch(GuaranteedAdGroupAdServiceTopImpactPanoramaSideSwitch topImpactPanoramaSideSwitch) {
    this.topImpactPanoramaSideSwitch = topImpactPanoramaSideSwitch;
  }


  public GuaranteedAdGroupAdServiceAd topImpactPanoramaPanelSwitch(GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd topImpactPanoramaPanelSwitch) {
    
    this.topImpactPanoramaPanelSwitch = topImpactPanoramaPanelSwitch;
    return this;
  }

   /**
   * Get topImpactPanoramaPanelSwitch
   * @return topImpactPanoramaPanelSwitch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_PANEL_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd getTopImpactPanoramaPanelSwitch() {
    return topImpactPanoramaPanelSwitch;
  }


  @JsonProperty(JSON_PROPERTY_TOP_IMPACT_PANORAMA_PANEL_SWITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopImpactPanoramaPanelSwitch(GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd topImpactPanoramaPanelSwitch) {
    this.topImpactPanoramaPanelSwitch = topImpactPanoramaPanelSwitch;
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
        Objects.equals(this.mainMediaFormat, guaranteedAdGroupAdServiceAd.mainMediaFormat) &&
        Objects.equals(this.bannerAd, guaranteedAdGroupAdServiceAd.bannerAd) &&
        Objects.equals(this.carouselAd, guaranteedAdGroupAdServiceAd.carouselAd) &&
        Objects.equals(this.instreamAd, guaranteedAdGroupAdServiceAd.instreamAd) &&
        Objects.equals(this.brandPanelQuintie, guaranteedAdGroupAdServiceAd.brandPanelQuintie) &&
        Objects.equals(this.brandPanelPanorama, guaranteedAdGroupAdServiceAd.brandPanelPanorama) &&
        Objects.equals(this.brandPanelPanoramaPanelSwitch, guaranteedAdGroupAdServiceAd.brandPanelPanoramaPanelSwitch) &&
        Objects.equals(this.topImpactSquare, guaranteedAdGroupAdServiceAd.topImpactSquare) &&
        Objects.equals(this.topImpactQuintie, guaranteedAdGroupAdServiceAd.topImpactQuintie) &&
        Objects.equals(this.topImpactTheater, guaranteedAdGroupAdServiceAd.topImpactTheater) &&
        Objects.equals(this.topImpactPrimeDisplayDouble, guaranteedAdGroupAdServiceAd.topImpactPrimeDisplayDouble) &&
        Objects.equals(this.topImpactPanorama, guaranteedAdGroupAdServiceAd.topImpactPanorama) &&
        Objects.equals(this.topImpactPanoramaSideVision, guaranteedAdGroupAdServiceAd.topImpactPanoramaSideVision) &&
        Objects.equals(this.topImpactPanoramaSideSwitch, guaranteedAdGroupAdServiceAd.topImpactPanoramaSideSwitch) &&
        Objects.equals(this.topImpactPanoramaPanelSwitch, guaranteedAdGroupAdServiceAd.topImpactPanoramaPanelSwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mainMediaFormat, bannerAd, carouselAd, instreamAd, brandPanelQuintie, brandPanelPanorama, brandPanelPanoramaPanelSwitch, topImpactSquare, topImpactQuintie, topImpactTheater, topImpactPrimeDisplayDouble, topImpactPanorama, topImpactPanoramaSideVision, topImpactPanoramaSideSwitch, topImpactPanoramaPanelSwitch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceAd {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    mainMediaFormat: ").append(toIndentedString(mainMediaFormat)).append("\n");
    sb.append("    bannerAd: ").append(toIndentedString(bannerAd)).append("\n");
    sb.append("    carouselAd: ").append(toIndentedString(carouselAd)).append("\n");
    sb.append("    instreamAd: ").append(toIndentedString(instreamAd)).append("\n");
    sb.append("    brandPanelQuintie: ").append(toIndentedString(brandPanelQuintie)).append("\n");
    sb.append("    brandPanelPanorama: ").append(toIndentedString(brandPanelPanorama)).append("\n");
    sb.append("    brandPanelPanoramaPanelSwitch: ").append(toIndentedString(brandPanelPanoramaPanelSwitch)).append("\n");
    sb.append("    topImpactSquare: ").append(toIndentedString(topImpactSquare)).append("\n");
    sb.append("    topImpactQuintie: ").append(toIndentedString(topImpactQuintie)).append("\n");
    sb.append("    topImpactTheater: ").append(toIndentedString(topImpactTheater)).append("\n");
    sb.append("    topImpactPrimeDisplayDouble: ").append(toIndentedString(topImpactPrimeDisplayDouble)).append("\n");
    sb.append("    topImpactPanorama: ").append(toIndentedString(topImpactPanorama)).append("\n");
    sb.append("    topImpactPanoramaSideVision: ").append(toIndentedString(topImpactPanoramaSideVision)).append("\n");
    sb.append("    topImpactPanoramaSideSwitch: ").append(toIndentedString(topImpactPanoramaSideSwitch)).append("\n");
    sb.append("    topImpactPanoramaPanelSwitch: ").append(toIndentedString(topImpactPanoramaPanelSwitch)).append("\n");
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

