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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceGeoTarget object holds configuration information of Geo targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceGeoTarget object holds configuration information of Geo targeting.</div> ")

public class StatsServiceGeoTarget   {
  @JsonProperty("geoNameEn")
  private JsonNullable<String> geoNameEn = JsonNullable.undefined();

  @JsonProperty("geoNameJa")
  private JsonNullable<String> geoNameJa = JsonNullable.undefined();

  public StatsServiceGeoTarget geoNameEn(String geoNameEn) {
    this.geoNameEn = JsonNullable.of(geoNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\">地域名（英語）</div> <div lang=\"en\">Geo name(English)</div> 
   * @return geoNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域名（英語）</div> <div lang=\"en\">Geo name(English)</div> ")


  public JsonNullable<String> getGeoNameEn() {
    return geoNameEn;
  }

  public void setGeoNameEn(JsonNullable<String> geoNameEn) {
    this.geoNameEn = geoNameEn;
  }

  public StatsServiceGeoTarget geoNameJa(String geoNameJa) {
    this.geoNameJa = JsonNullable.of(geoNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\">地域名（日本語）</div> <div lang=\"en\">Geo name(Japanese)</div> 
   * @return geoNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域名（日本語）</div> <div lang=\"en\">Geo name(Japanese)</div> ")


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
    StatsServiceGeoTarget statsServiceGeoTarget = (StatsServiceGeoTarget) o;
    return Objects.equals(this.geoNameEn, statsServiceGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, statsServiceGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceGeoTarget {\n");
    
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

