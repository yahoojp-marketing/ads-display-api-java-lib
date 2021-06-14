package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePositionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedPositionTargetオブジェクトは、ポジションターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedPositionTarget object holds configuration information of psition targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedPositionTargetオブジェクトは、ポジションターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedPositionTarget object holds configuration information of psition targeting.</div> ")

public class GuaranteedSimulationServicePermittedPositionTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("positionType")
  private JsonNullable<GuaranteedSimulationServicePositionType> positionType = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedPositionTarget targetId(String targetId) {
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

  public GuaranteedSimulationServicePermittedPositionTarget positionType(GuaranteedSimulationServicePositionType positionType) {
    this.positionType = JsonNullable.of(positionType);
    return this;
  }

  /**
   * Get positionType
   * @return positionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePositionType> getPositionType() {
    return positionType;
  }

  public void setPositionType(JsonNullable<GuaranteedSimulationServicePositionType> positionType) {
    this.positionType = positionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedPositionTarget guaranteedSimulationServicePermittedPositionTarget = (GuaranteedSimulationServicePermittedPositionTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedPositionTarget.targetId) &&
        Objects.equals(this.positionType, guaranteedSimulationServicePermittedPositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedPositionTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
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

