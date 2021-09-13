package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServicePositionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPOSITION_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServicePositionTarget object is a container for storing position targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is POSITION_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがPOSITION_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServicePositionTarget object is a container for storing position targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is POSITION_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePositionTarget   {
  @JsonProperty("positionType")
  private GuaranteedSimulationServicePositionType positionType = null;

  public GuaranteedSimulationServicePositionTarget positionType(GuaranteedSimulationServicePositionType positionType) {
    this.positionType = positionType;
    return this;
  }

  /**
   * Get positionType
   * @return positionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePositionType getPositionType() {
    return positionType;
  }

  public void setPositionType(GuaranteedSimulationServicePositionType positionType) {
    this.positionType = positionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePositionTarget guaranteedSimulationServicePositionTarget = (GuaranteedSimulationServicePositionTarget) o;
    return Objects.equals(this.positionType, guaranteedSimulationServicePositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePositionTarget {\n");
    
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
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

