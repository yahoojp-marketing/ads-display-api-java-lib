package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceDeviceAppType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAppTarget object holds configuration information of app targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAppTarget object holds configuration information of app targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAppTarget   {
  @JsonProperty("deviceAppType")
  private StatsServiceDeviceAppType deviceAppType = null;

  public StatsServiceAppTarget deviceAppType(StatsServiceDeviceAppType deviceAppType) {
    this.deviceAppType = deviceAppType;
    return this;
  }

  /**
   * Get deviceAppType
   * @return deviceAppType
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceDeviceAppType getDeviceAppType() {
    return deviceAppType;
  }

  public void setDeviceAppType(StatsServiceDeviceAppType deviceAppType) {
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
    StatsServiceAppTarget statsServiceAppTarget = (StatsServiceAppTarget) o;
    return Objects.equals(this.deviceAppType, statsServiceAppTarget.deviceAppType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAppType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAppTarget {\n");
    
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

