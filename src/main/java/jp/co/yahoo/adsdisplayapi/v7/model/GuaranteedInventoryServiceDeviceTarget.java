package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceDeviceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがDEVICE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceDeviceTarget object is a container for storing device targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is DEVICE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがDEVICE_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceDeviceTarget object is a container for storing device targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is DEVICE_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceDeviceTarget   {
  @JsonProperty("deviceType")
  private GuaranteedInventoryServiceDeviceType deviceType = null;

  public GuaranteedInventoryServiceDeviceTarget deviceType(GuaranteedInventoryServiceDeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceDeviceType getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(GuaranteedInventoryServiceDeviceType deviceType) {
    this.deviceType = deviceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceDeviceTarget guaranteedInventoryServiceDeviceTarget = (GuaranteedInventoryServiceDeviceTarget) o;
    return Objects.equals(this.deviceType, guaranteedInventoryServiceDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceDeviceTarget {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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

