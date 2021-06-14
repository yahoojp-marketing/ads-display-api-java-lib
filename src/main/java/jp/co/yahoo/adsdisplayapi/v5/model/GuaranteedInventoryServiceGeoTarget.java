package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceGeoTargetオブジェクトは、地域ターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがGEO_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceGeoTarget object is a container for storing geological targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is GEO_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceGeoTargetオブジェクトは、地域ターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがGEO_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceGeoTarget object is a container for storing geological targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is GEO_TARGET, this field is required. </div> ")

public class GuaranteedInventoryServiceGeoTarget   {
  @JsonProperty("geoNameEn")
  private JsonNullable<String> geoNameEn = JsonNullable.undefined();

  @JsonProperty("geoNameJa")
  private JsonNullable<String> geoNameJa = JsonNullable.undefined();

  public GuaranteedInventoryServiceGeoTarget geoNameEn(String geoNameEn) {
    this.geoNameEn = JsonNullable.of(geoNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Region name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return geoNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Region name (English).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getGeoNameEn() {
    return geoNameEn;
  }

  public void setGeoNameEn(JsonNullable<String> geoNameEn) {
    this.geoNameEn = geoNameEn;
  }

  public GuaranteedInventoryServiceGeoTarget geoNameJa(String geoNameJa) {
    this.geoNameJa = JsonNullable.of(geoNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Region name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return geoNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Region name (Japanese).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getGeoNameJa() {
    return geoNameJa;
  }

  public void setGeoNameJa(JsonNullable<String> geoNameJa) {
    this.geoNameJa = geoNameJa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceGeoTarget guaranteedInventoryServiceGeoTarget = (GuaranteedInventoryServiceGeoTarget) o;
    return Objects.equals(this.geoNameEn, guaranteedInventoryServiceGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, guaranteedInventoryServiceGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceGeoTarget {\n");
    
    sb.append("    geoNameEn: ").append(toIndentedString(geoNameEn)).append("\n");
    sb.append("    geoNameJa: ").append(toIndentedString(geoNameJa)).append("\n");
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

