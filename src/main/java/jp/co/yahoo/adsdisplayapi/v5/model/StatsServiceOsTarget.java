package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceDeviceOsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceOsTargetオブジェクトは、OSターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceOsTarget object holds configuration information of OS targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceOsTargetオブジェクトは、OSターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceOsTarget object holds configuration information of OS targeting.</div> ")

public class StatsServiceOsTarget   {
  @JsonProperty("deviceOsType")
  private JsonNullable<StatsServiceDeviceOsType> deviceOsType = JsonNullable.undefined();

  public StatsServiceOsTarget deviceOsType(StatsServiceDeviceOsType deviceOsType) {
    this.deviceOsType = JsonNullable.of(deviceOsType);
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceDeviceOsType> getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(JsonNullable<StatsServiceDeviceOsType> deviceOsType) {
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
    StatsServiceOsTarget statsServiceOsTarget = (StatsServiceOsTarget) o;
    return Objects.equals(this.deviceOsType, statsServiceOsTarget.deviceOsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceOsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceOsTarget {\n");
    
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

