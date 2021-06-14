package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceDeviceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceDeviceTargetオブジェクトは、デバイスターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceDeviceTarget object holds configuration information of device targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceDeviceTargetオブジェクトは、デバイスターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceDeviceTarget object holds configuration information of device targeting.</div> ")

public class StatsServiceDeviceTarget   {
  @JsonProperty("deviceType")
  private JsonNullable<StatsServiceDeviceType> deviceType = JsonNullable.undefined();

  public StatsServiceDeviceTarget deviceType(StatsServiceDeviceType deviceType) {
    this.deviceType = JsonNullable.of(deviceType);
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceDeviceType> getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(JsonNullable<StatsServiceDeviceType> deviceType) {
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
    StatsServiceDeviceTarget statsServiceDeviceTarget = (StatsServiceDeviceTarget) o;
    return Objects.equals(this.deviceType, statsServiceDeviceTarget.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceDeviceTarget {\n");
    
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

