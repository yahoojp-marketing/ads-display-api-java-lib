package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedGeoTarget object holds configuration information of Geo targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedGeoTargetオブジェクトは、地域ターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedGeoTarget object holds configuration information of Geo targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedGeoTarget   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("geoNameEn")
  private String geoNameEn = null;

  @JsonProperty("geoNameJa")
  private String geoNameJa = null;

  public GuaranteedSimulationServicePermittedGeoTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedGeoTarget geoNameEn(String geoNameEn) {
    this.geoNameEn = geoNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（英語）です。<br> </div> <div lang=\"en\"> Region name (English).<br> </div> 
   * @return geoNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（英語）です。<br> </div> <div lang=\"en\"> Region name (English).<br> </div> ")


  public String getGeoNameEn() {
    return geoNameEn;
  }

  public void setGeoNameEn(String geoNameEn) {
    this.geoNameEn = geoNameEn;
  }

  public GuaranteedSimulationServicePermittedGeoTarget geoNameJa(String geoNameJa) {
    this.geoNameJa = geoNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\"> 地域名（日本語）です。<br> </div> <div lang=\"en\">Region name (Japanese).<br> </div> 
   * @return geoNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 地域名（日本語）です。<br> </div> <div lang=\"en\">Region name (Japanese).<br> </div> ")


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
    GuaranteedSimulationServicePermittedGeoTarget guaranteedSimulationServicePermittedGeoTarget = (GuaranteedSimulationServicePermittedGeoTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedGeoTarget.targetId) &&
        Objects.equals(this.geoNameEn, guaranteedSimulationServicePermittedGeoTarget.geoNameEn) &&
        Objects.equals(this.geoNameJa, guaranteedSimulationServicePermittedGeoTarget.geoNameJa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, geoNameEn, geoNameJa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedGeoTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

