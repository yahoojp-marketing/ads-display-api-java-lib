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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAppTarget object holds configuration information of app targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAppTargetオブジェクトは、アプリターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAppTarget object holds configuration information of app targeting.</div> ")

public class GuaranteedSimulationServicePermittedAppTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("appType")
  private JsonNullable<GuaranteedSimulationServiceDeviceAppType> appType = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedAppTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedAppTarget appType(GuaranteedSimulationServiceDeviceAppType appType) {
    this.appType = JsonNullable.of(appType);
    return this;
  }

  /**
   * Get appType
   * @return appType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceDeviceAppType> getAppType() {
    return appType;
  }

  public void setAppType(JsonNullable<GuaranteedSimulationServiceDeviceAppType> appType) {
    this.appType = appType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAppTarget guaranteedSimulationServicePermittedAppTarget = (GuaranteedSimulationServicePermittedAppTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAppTarget.targetId) &&
        Objects.equals(this.appType, guaranteedSimulationServicePermittedAppTarget.appType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, appType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAppTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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

