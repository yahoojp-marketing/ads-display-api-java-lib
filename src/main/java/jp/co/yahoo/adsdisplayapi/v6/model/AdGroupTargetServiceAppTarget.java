package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupTargetServiceDeviceAppType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceAppTarget object is a container for storing app targeting settings.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceAppTargetオブジェクトは、アプリターゲティングの設定情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupTargetServiceAppTarget object is a container for storing app targeting settings.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceAppTarget   {
  @JsonProperty("deviceAppType")
  private AdGroupTargetServiceDeviceAppType deviceAppType = null;

  public AdGroupTargetServiceAppTarget deviceAppType(AdGroupTargetServiceDeviceAppType deviceAppType) {
    this.deviceAppType = deviceAppType;
    return this;
  }

  /**
   * Get deviceAppType
   * @return deviceAppType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceDeviceAppType getDeviceAppType() {
    return deviceAppType;
  }

  public void setDeviceAppType(AdGroupTargetServiceDeviceAppType deviceAppType) {
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
    AdGroupTargetServiceAppTarget adGroupTargetServiceAppTarget = (AdGroupTargetServiceAppTarget) o;
    return Objects.equals(this.deviceAppType, adGroupTargetServiceAppTarget.deviceAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAppType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceAppTarget {\n");
    
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

