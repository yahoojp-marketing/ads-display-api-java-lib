package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceDeviceOsType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedOsTargetオブジェクトは、OSターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedOsTarget object holds configuration information of OS targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedOsTargetオブジェクトは、OSターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedOsTarget object holds configuration information of OS targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedOsTarget   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("osType")
  private GuaranteedSimulationServiceDeviceOsType osType = null;

  public GuaranteedSimulationServicePermittedOsTarget targetId(String targetId) {
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

  public GuaranteedSimulationServicePermittedOsTarget osType(GuaranteedSimulationServiceDeviceOsType osType) {
    this.osType = osType;
    return this;
  }

  /**
   * Get osType
   * @return osType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceDeviceOsType getOsType() {
    return osType;
  }

  public void setOsType(GuaranteedSimulationServiceDeviceOsType osType) {
    this.osType = osType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedOsTarget guaranteedSimulationServicePermittedOsTarget = (GuaranteedSimulationServicePermittedOsTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedOsTarget.targetId) &&
        Objects.equals(this.osType, guaranteedSimulationServicePermittedOsTarget.osType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, osType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedOsTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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

