package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceGeoTargetオブジェクトは、地域ターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがGEO_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceGeoTarget object is a container for storing geological targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is GEO_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceGeoTargetオブジェクトは、地域ターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがGEO_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceGeoTarget object is a container for storing geological targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is GEO_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceGeoTarget   {
  @JsonProperty("geoNameEn")
  private String geoNameEn = null;

  @JsonProperty("geoNameJa")
  private String geoNameJa = null;

  public AdGroupTargetServiceGeoTarget geoNameEn(String geoNameEn) {
    this.geoNameEn = geoNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Region name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return geoNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Region name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getGeoNameEn() {
    return geoNameEn;
  }

  public void setGeoNameEn(String geoNameEn) {
    this.geoNameEn = geoNameEn;
  }

  public AdGroupTargetServiceGeoTarget geoNameJa(String geoNameJa) {
    this.geoNameJa = geoNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Region name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return geoNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Region name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getGeoNameJa() {
    return geoNameJa;
  }

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
    return Objects.equals(this.geoNameEn, adGroupTargetServiceGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, adGroupTargetServiceGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceGeoTarget {\n");
    
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

