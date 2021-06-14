package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDeviceAppType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAPP_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAppTarget object is a container for storing app targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is APP_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAPP_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAppTarget object is a container for storing app targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is APP_TARGET, this field is required. </div> ")

public class GuaranteedSimulationServiceAppTarget   {
  @JsonProperty("deviceAppType")
  private JsonNullable<GuaranteedSimulationServiceDeviceAppType> deviceAppType = JsonNullable.undefined();

  public GuaranteedSimulationServiceAppTarget deviceAppType(GuaranteedSimulationServiceDeviceAppType deviceAppType) {
    this.deviceAppType = JsonNullable.of(deviceAppType);
    return this;
  }

  /**
   * Get deviceAppType
   * @return deviceAppType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceDeviceAppType> getDeviceAppType() {
    return deviceAppType;
  }

  public void setDeviceAppType(JsonNullable<GuaranteedSimulationServiceDeviceAppType> deviceAppType) {
    this.deviceAppType = deviceAppType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAppTarget guaranteedSimulationServiceAppTarget = (GuaranteedSimulationServiceAppTarget) o;
    return Objects.equals(this.deviceAppType, guaranteedSimulationServiceAppTarget.deviceAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAppType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAppTarget {\n");
    
    sb.append("    deviceAppType: ").append(toIndentedString(deviceAppType)).append("\n");
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

