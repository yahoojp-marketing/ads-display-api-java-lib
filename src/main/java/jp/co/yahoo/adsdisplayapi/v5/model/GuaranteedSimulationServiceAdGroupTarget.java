package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceTarget;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAdGroupTargetオブジェクトは、予約型キャンペーンの配信シミュレーションのターゲティング情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAdGroupTarget object holds the targeting information about the delivery simulation of the guaranteed campaign.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAdGroupTargetオブジェクトは、予約型キャンペーンの配信シミュレーションのターゲティング情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAdGroupTarget object holds the targeting information about the delivery simulation of the guaranteed campaign.<br> This field is optional in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceAdGroupTarget   {
  @JsonProperty("target")
  private GuaranteedSimulationServiceTarget target = null;

  public GuaranteedSimulationServiceAdGroupTarget target(GuaranteedSimulationServiceTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceTarget getTarget() {
    return target;
  }

  public void setTarget(GuaranteedSimulationServiceTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAdGroupTarget guaranteedSimulationServiceAdGroupTarget = (GuaranteedSimulationServiceAdGroupTarget) o;
    return Objects.equals(this.target, guaranteedSimulationServiceAdGroupTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAdGroupTarget {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

