package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupTargetServiceDeviceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。&lt;br&gt; SET時のみ指定可能です。ADD、REMOVEおよびREPLACE時、このフィールドは無視されます。&lt;br&gt; SET時に必要なtargetIdは、AdGroupオブジェクトにデバイスが設定されている場合にレスポンスされます。&lt;br&gt; ※SET時、入札価格調整率のみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceDeviceTarget object is a container for storing device targeting settings.&lt;br&gt; This field can be specified only in SET operation and is ignored in ADD, REMOVE and REPLACE operation.&lt;br&gt; The targetId required on SET will be responded when devices are set on AdGroup object.&lt;br&gt; *Can set only bid adjustment in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceDeviceTargetオブジェクトは、デバイスターゲティングの設定情報を保持します。<br> SET時のみ指定可能です。ADD、REMOVEおよびREPLACE時、このフィールドは無視されます。<br> SET時に必要なtargetIdは、AdGroupオブジェクトにデバイスが設定されている場合にレスポンスされます。<br> ※SET時、入札価格調整率のみ設定可能です。 </div> <div lang=\"en\"> AdGroupTargetServiceDeviceTarget object is a container for storing device targeting settings.<br> This field can be specified only in SET operation and is ignored in ADD, REMOVE and REPLACE operation.<br> The targetId required on SET will be responded when devices are set on AdGroup object.<br> *Can set only bid adjustment in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceDeviceTarget   {
  @JsonProperty("deviceType")
  private AdGroupTargetServiceDeviceType deviceType = null;

  public AdGroupTargetServiceDeviceTarget deviceType(AdGroupTargetServiceDeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupTargetServiceDeviceType getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(AdGroupTargetServiceDeviceType deviceType) {
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
    AdGroupTargetServiceDeviceTarget adGroupTargetServiceDeviceTarget = (AdGroupTargetServiceDeviceTarget) o;
    return Objects.equals(this.deviceType, adGroupTargetServiceDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceDeviceTarget {\n");
    
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

