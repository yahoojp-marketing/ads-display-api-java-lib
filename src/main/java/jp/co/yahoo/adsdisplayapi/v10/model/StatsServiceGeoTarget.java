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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v10.model.StatsServiceAreaSearchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceGeoTarget object holds configuration information of Geo targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceGeoTarget object holds configuration information of Geo targeting.</div> ")
@JsonPropertyOrder({
  StatsServiceGeoTarget.JSON_PROPERTY_AREA_SEARCH_TYPE,
  StatsServiceGeoTarget.JSON_PROPERTY_LATITUDE_IN_MICRO_DEGREES,
  StatsServiceGeoTarget.JSON_PROPERTY_LONGITUDE_IN_MICRO_DEGREES,
  StatsServiceGeoTarget.JSON_PROPERTY_RADIUS,
  StatsServiceGeoTarget.JSON_PROPERTY_DESCRIPTION,
  StatsServiceGeoTarget.JSON_PROPERTY_GEO_NAME_EN,
  StatsServiceGeoTarget.JSON_PROPERTY_GEO_NAME_JA
})
@JsonTypeName("StatsServiceGeoTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceGeoTarget {
  public static final String JSON_PROPERTY_AREA_SEARCH_TYPE = "areaSearchType";
  private StatsServiceAreaSearchType areaSearchType;

  public static final String JSON_PROPERTY_LATITUDE_IN_MICRO_DEGREES = "latitudeInMicroDegrees";
  private Integer latitudeInMicroDegrees;

  public static final String JSON_PROPERTY_LONGITUDE_IN_MICRO_DEGREES = "longitudeInMicroDegrees";
  private Integer longitudeInMicroDegrees;

  public static final String JSON_PROPERTY_RADIUS = "radius";
  private Integer radius;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GEO_NAME_EN = "geoNameEn";
  private String geoNameEn;

  public static final String JSON_PROPERTY_GEO_NAME_JA = "geoNameJa";
  private String geoNameJa;

  public StatsServiceGeoTarget() { 
  }

  public StatsServiceGeoTarget areaSearchType(StatsServiceAreaSearchType areaSearchType) {
    
    this.areaSearchType = areaSearchType;
    return this;
  }

   /**
   * Get areaSearchType
   * @return areaSearchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AREA_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceAreaSearchType getAreaSearchType() {
    return areaSearchType;
  }


  @JsonProperty(JSON_PROPERTY_AREA_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaSearchType(StatsServiceAreaSearchType areaSearchType) {
    this.areaSearchType = areaSearchType;
  }


  public StatsServiceGeoTarget latitudeInMicroDegrees(Integer latitudeInMicroDegrees) {
    
    this.latitudeInMicroDegrees = latitudeInMicroDegrees;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;マイクロ表記の緯度です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Micro degrees for the latitude.&lt;/div&gt; 
   * @return latitudeInMicroDegrees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">マイクロ表記の緯度です。</div> <div lang=\"en\">Micro degrees for the latitude.</div> ")
  @JsonProperty(JSON_PROPERTY_LATITUDE_IN_MICRO_DEGREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLatitudeInMicroDegrees() {
    return latitudeInMicroDegrees;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE_IN_MICRO_DEGREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitudeInMicroDegrees(Integer latitudeInMicroDegrees) {
    this.latitudeInMicroDegrees = latitudeInMicroDegrees;
  }


  public StatsServiceGeoTarget longitudeInMicroDegrees(Integer longitudeInMicroDegrees) {
    
    this.longitudeInMicroDegrees = longitudeInMicroDegrees;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;マイクロ表記の経度です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Micro degrees for the longitude.&lt;/div&gt; 
   * @return longitudeInMicroDegrees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">マイクロ表記の経度です。</div> <div lang=\"en\">Micro degrees for the longitude.</div> ")
  @JsonProperty(JSON_PROPERTY_LONGITUDE_IN_MICRO_DEGREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLongitudeInMicroDegrees() {
    return longitudeInMicroDegrees;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE_IN_MICRO_DEGREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitudeInMicroDegrees(Integer longitudeInMicroDegrees) {
    this.longitudeInMicroDegrees = longitudeInMicroDegrees;
  }


  public StatsServiceGeoTarget radius(Integer radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;半径(km)です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Radius(km).&lt;/div&gt; 
   * @return radius
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">半径(km)です。</div> <div lang=\"en\">Radius(km).</div> ")
  @JsonProperty(JSON_PROPERTY_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRadius() {
    return radius;
  }


  @JsonProperty(JSON_PROPERTY_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  public StatsServiceGeoTarget description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description.&lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明です。</div> <div lang=\"en\">Description.</div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public StatsServiceGeoTarget geoNameEn(String geoNameEn) {
    
    this.geoNameEn = geoNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域名（英語）&lt;br&gt;areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Geo name(English)&lt;br&gt;If areaSearchType is RADIUS, it will not be returned.&lt;/div&gt; 
   * @return geoNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域名（英語）<br>areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。</div> <div lang=\"en\">Geo name(English)<br>If areaSearchType is RADIUS, it will not be returned.</div> ")
  @JsonProperty(JSON_PROPERTY_GEO_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoNameEn() {
    return geoNameEn;
  }


  @JsonProperty(JSON_PROPERTY_GEO_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoNameEn(String geoNameEn) {
    this.geoNameEn = geoNameEn;
  }


  public StatsServiceGeoTarget geoNameJa(String geoNameJa) {
    
    this.geoNameJa = geoNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域名（日本語）&lt;br&gt;areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Geo name(Japanese)&lt;br&gt;If areaSearchType is RADIUS, it will not be returned.&lt;/div&gt; 
   * @return geoNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域名（日本語）<br>areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。</div> <div lang=\"en\">Geo name(Japanese)<br>If areaSearchType is RADIUS, it will not be returned.</div> ")
  @JsonProperty(JSON_PROPERTY_GEO_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoNameJa() {
    return geoNameJa;
  }


  @JsonProperty(JSON_PROPERTY_GEO_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoNameJa(String geoNameJa) {
    this.geoNameJa = geoNameJa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceGeoTarget statsServiceGeoTarget = (StatsServiceGeoTarget) o;
    return Objects.equals(this.areaSearchType, statsServiceGeoTarget.areaSearchType) &&
        Objects.equals(this.latitudeInMicroDegrees, statsServiceGeoTarget.latitudeInMicroDegrees) &&
        Objects.equals(this.longitudeInMicroDegrees, statsServiceGeoTarget.longitudeInMicroDegrees) &&
        Objects.equals(this.radius, statsServiceGeoTarget.radius) &&
        Objects.equals(this.description, statsServiceGeoTarget.description) &&
        Objects.equals(this.geoNameEn, statsServiceGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, statsServiceGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaSearchType, latitudeInMicroDegrees, longitudeInMicroDegrees, radius, description, geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceGeoTarget {\n");
    sb.append("    areaSearchType: ").append(toIndentedString(areaSearchType)).append("\n");
    sb.append("    latitudeInMicroDegrees: ").append(toIndentedString(latitudeInMicroDegrees)).append("\n");
    sb.append("    longitudeInMicroDegrees: ").append(toIndentedString(longitudeInMicroDegrees)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    geoNameEn: ").append(toIndentedString(geoNameEn)).append("\n");
    sb.append("    geoNameJa: ").append(toIndentedString(geoNameJa)).append("\n");
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

