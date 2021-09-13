package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedInventoryServiceDeviceAppType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAPP_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAppTarget object is a container for storing app targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is APP_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAPP_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAppTarget object is a container for storing app targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is APP_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceAppTarget   {
  @JsonProperty("deviceAppType")
  private GuaranteedInventoryServiceDeviceAppType deviceAppType = null;

  public GuaranteedInventoryServiceAppTarget deviceAppType(GuaranteedInventoryServiceDeviceAppType deviceAppType) {
    this.deviceAppType = deviceAppType;
    return this;
  }

  /**
   * Get deviceAppType
   * @return deviceAppType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceDeviceAppType getDeviceAppType() {
    return deviceAppType;
  }

  public void setDeviceAppType(GuaranteedInventoryServiceDeviceAppType deviceAppType) {
    this.deviceAppType = deviceAppType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceAppTarget guaranteedInventoryServiceAppTarget = (GuaranteedInventoryServiceAppTarget) o;
    return Objects.equals(this.deviceAppType, guaranteedInventoryServiceAppTarget.deviceAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAppType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAppTarget {\n");
    
    sb.append("    deviceAppType: ").append(toIndentedString(deviceAppType)).append("\n");
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

