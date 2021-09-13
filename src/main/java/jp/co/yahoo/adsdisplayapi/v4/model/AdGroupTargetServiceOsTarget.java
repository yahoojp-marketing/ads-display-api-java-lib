package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupTargetServiceDeviceOsType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceOsTargetオブジェクトは、OSターゲティングの設定情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceOsTarget object is a container for storing OS targeting settings.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceOsTargetオブジェクトは、OSターゲティングの設定情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupTargetServiceOsTarget object is a container for storing OS targeting settings.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceOsTarget   {
  @JsonProperty("deviceOsType")
  private AdGroupTargetServiceDeviceOsType deviceOsType = null;

  public AdGroupTargetServiceOsTarget deviceOsType(AdGroupTargetServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceDeviceOsType getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(AdGroupTargetServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceOsTarget adGroupTargetServiceOsTarget = (AdGroupTargetServiceOsTarget) o;
    return Objects.equals(this.deviceOsType, adGroupTargetServiceOsTarget.deviceOsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceOsTarget {\n");
    
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
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

