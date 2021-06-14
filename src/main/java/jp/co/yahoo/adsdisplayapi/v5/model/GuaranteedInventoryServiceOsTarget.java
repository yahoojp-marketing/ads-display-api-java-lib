package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceDeviceOsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceOsTargetオブジェクトは、OSターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがOS_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceOsTarget object is a container for storing OS targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is OS_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceOsTargetオブジェクトは、OSターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがOS_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceOsTarget object is a container for storing OS targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is OS_TARGET, this field is required. </div> ")

public class GuaranteedInventoryServiceOsTarget   {
  @JsonProperty("deviceOsType")
  private JsonNullable<GuaranteedInventoryServiceDeviceOsType> deviceOsType = JsonNullable.undefined();

  public GuaranteedInventoryServiceOsTarget deviceOsType(GuaranteedInventoryServiceDeviceOsType deviceOsType) {
    this.deviceOsType = JsonNullable.of(deviceOsType);
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceDeviceOsType> getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(JsonNullable<GuaranteedInventoryServiceDeviceOsType> deviceOsType) {
    this.deviceOsType = deviceOsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceOsTarget guaranteedInventoryServiceOsTarget = (GuaranteedInventoryServiceOsTarget) o;
    return Objects.equals(this.deviceOsType, guaranteedInventoryServiceOsTarget.deviceOsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceOsTarget {\n");
    
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
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

