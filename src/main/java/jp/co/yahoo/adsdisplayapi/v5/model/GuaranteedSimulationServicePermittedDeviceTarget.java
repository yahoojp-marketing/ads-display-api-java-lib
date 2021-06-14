package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDeviceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedDeviceTargetオブジェクトは、デバイスターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedDeviceTarget object holds configuration information of device targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedDeviceTargetオブジェクトは、デバイスターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedDeviceTarget object holds configuration information of device targeting.</div> ")

public class GuaranteedSimulationServicePermittedDeviceTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("deviceType")
  private JsonNullable<GuaranteedSimulationServiceDeviceType> deviceType = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedDeviceTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedDeviceTarget deviceType(GuaranteedSimulationServiceDeviceType deviceType) {
    this.deviceType = JsonNullable.of(deviceType);
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceDeviceType> getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(JsonNullable<GuaranteedSimulationServiceDeviceType> deviceType) {
    this.deviceType = deviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedDeviceTarget guaranteedSimulationServicePermittedDeviceTarget = (GuaranteedSimulationServicePermittedDeviceTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedDeviceTarget.targetId) &&
        Objects.equals(this.deviceType, guaranteedSimulationServicePermittedDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedDeviceTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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

