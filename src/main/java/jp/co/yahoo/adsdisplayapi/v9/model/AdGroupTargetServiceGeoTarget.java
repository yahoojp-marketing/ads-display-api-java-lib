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
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupTargetServiceAreaSearchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceGeoTargetオブジェクトは、地域ターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがGEO_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceGeoTarget object is a container for storing geological targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is GEO_TARGET, this field is required. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_AREA_SEARCH_TYPE,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_LATITUDE_IN_MICRO_DEGREES,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_LONGITUDE_IN_MICRO_DEGREES,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_RADIUS,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_DESCRIPTION,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_GEO_NAME_EN,
  AdGroupTargetServiceGeoTarget.JSON_PROPERTY_GEO_NAME_JA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceGeoTarget {
  public static final String JSON_PROPERTY_AREA_SEARCH_TYPE = "areaSearchType";
  private AdGroupTargetServiceAreaSearchType areaSearchType;

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

  public AdGroupTargetServiceGeoTarget() {
  }

  public AdGroupTargetServiceGeoTarget areaSearchType(AdGroupTargetServiceAreaSearchType areaSearchType) {
    
    this.areaSearchType = areaSearchType;
    return this;
  }

   /**
   * Get areaSearchType
   * @return areaSearchType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AREA_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceAreaSearchType getAreaSearchType() {
    return areaSearchType;
  }


  @JsonProperty(JSON_PROPERTY_AREA_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaSearchType(AdGroupTargetServiceAreaSearchType areaSearchType) {
    this.areaSearchType = areaSearchType;
  }


  public AdGroupTargetServiceGeoTarget latitudeInMicroDegrees(Integer latitudeInMicroDegrees) {
    
    this.latitudeInMicroDegrees = latitudeInMicroDegrees;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;マイクロ表記の緯度です。&lt;br&gt; 1度と指定したい場合は、1000000を指定します。&lt;br&gt; ADおよびREPLACE時、areaSearchTypeがRADIUSの場合は必須です。areaSearchTypeがGEOの場合は指定できません。&lt;br&gt; 日本国内のみ指定できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Micro degrees for the latitude.&lt;br&gt; To specify 1 degree, specify 1000000.&lt;br&gt; In ADD and REPLACE operation, Required if areaSearchType is RADIUS, and cannot be specified if areaSearchType is GEO.&lt;br&gt; Can be specified only in Japan.&lt;/div&gt; 
   * @return latitudeInMicroDegrees
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceGeoTarget longitudeInMicroDegrees(Integer longitudeInMicroDegrees) {
    
    this.longitudeInMicroDegrees = longitudeInMicroDegrees;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;マイクロ表記の経度です。&lt;br&gt; 1度と指定したい場合は、1000000を指定します。&lt;br&gt; ADおよびREPLACE時、areaSearchTypeがRADIUSの場合は必須です。areaSearchTypeがGEOの場合は指定できません。&lt;br&gt; 日本国内のみ指定できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Micro degrees for the longitude.&lt;br&gt; To specify 1 degree, specify 1000000.&lt;br&gt; In ADD and REPLACE operation, Required if areaSearchType is RADIUS, and cannot be specified if areaSearchType is GEO.&lt;br&gt; Can be specified only in Japan.&lt;/div&gt; 
   * @return longitudeInMicroDegrees
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceGeoTarget radius(Integer radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;半径(km)です。&lt;br&gt; ADDおよびREPLACE時、areaSearchTypeがRADIUSの場合は必須です。areaSearchTypeがGEOの場合は指定できません。&lt;br&gt; 最大80kmまで指定できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Radius(km).&lt;br&gt; In ADD and REPLACE operation, Required if areaSearchType is RADIUS, and cannot be specified if areaSearchType is GEO.&lt;br&gt; Can be specified up to 80km.&lt;/div&gt; 
   * @return radius
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceGeoTarget description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;指定した地点の説明です。&lt;br&gt; ADDおよびREPLACE時、areaSearchTypeがRADIUSの場合は任意で指定できます。areaSearchTypeがGEOの場合は指定できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A description of the specified location.&lt;br&gt; In ADD and REPLACE operation, Optional if areaSearchType is RADIUS, and cannot be specified if areaSearchType is GEO.&lt;/div&gt; 
   * @return description
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceGeoTarget geoNameEn(String geoNameEn) {
    
    this.geoNameEn = geoNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 地域名（英語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Region name (English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; If areaSearchType is RADIUS, it will not be returned. &lt;/div&gt; 
   * @return geoNameEn
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupTargetServiceGeoTarget geoNameJa(String geoNameJa) {
    
    this.geoNameJa = geoNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 地域名（日本語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; areaSearchTypeがRADIUSの場合はレスポンスの際に返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Region name (Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; If areaSearchType is RADIUS, it will not be returned. &lt;/div&gt; 
   * @return geoNameJa
  **/
  @jakarta.annotation.Nullable
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
    AdGroupTargetServiceGeoTarget adGroupTargetServiceGeoTarget = (AdGroupTargetServiceGeoTarget) o;
    return Objects.equals(this.areaSearchType, adGroupTargetServiceGeoTarget.areaSearchType) &&
        Objects.equals(this.latitudeInMicroDegrees, adGroupTargetServiceGeoTarget.latitudeInMicroDegrees) &&
        Objects.equals(this.longitudeInMicroDegrees, adGroupTargetServiceGeoTarget.longitudeInMicroDegrees) &&
        Objects.equals(this.radius, adGroupTargetServiceGeoTarget.radius) &&
        Objects.equals(this.description, adGroupTargetServiceGeoTarget.description) &&
        Objects.equals(this.geoNameEn, adGroupTargetServiceGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, adGroupTargetServiceGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaSearchType, latitudeInMicroDegrees, longitudeInMicroDegrees, radius, description, geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceGeoTarget {\n");
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

