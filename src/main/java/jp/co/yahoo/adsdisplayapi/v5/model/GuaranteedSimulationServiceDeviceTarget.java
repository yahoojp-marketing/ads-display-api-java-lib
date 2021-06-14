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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがDEVICE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceDeviceTarget object is a container for storing device targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is DEVICE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがDEVICE_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceDeviceTarget object is a container for storing device targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is DEVICE_TARGET, this field is required. </div> ")

public class GuaranteedSimulationServiceDeviceTarget   {
  @JsonProperty("deviceType")
  private JsonNullable<GuaranteedSimulationServiceDeviceType> deviceType = JsonNullable.undefined();

  public GuaranteedSimulationServiceDeviceTarget deviceType(GuaranteedSimulationServiceDeviceType deviceType) {
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
    GuaranteedSimulationServiceDeviceTarget guaranteedSimulationServiceDeviceTarget = (GuaranteedSimulationServiceDeviceTarget) o;
    return Objects.equals(this.deviceType, guaranteedSimulationServiceDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceDeviceTarget {\n");
    
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

