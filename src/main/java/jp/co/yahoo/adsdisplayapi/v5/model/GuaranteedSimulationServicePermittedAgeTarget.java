package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAge;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAgeTarget object holds configuration information of age targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAgeTarget object holds configuration information of age targeting.</div> ")

public class GuaranteedSimulationServicePermittedAgeTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("age")
  private JsonNullable<GuaranteedSimulationServiceAge> age = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedAgeTarget targetId(String targetId) {
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

  public GuaranteedSimulationServicePermittedAgeTarget age(GuaranteedSimulationServiceAge age) {
    this.age = JsonNullable.of(age);
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAge> getAge() {
    return age;
  }

  public void setAge(JsonNullable<GuaranteedSimulationServiceAge> age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAgeTarget guaranteedSimulationServicePermittedAgeTarget = (GuaranteedSimulationServicePermittedAgeTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAgeTarget.targetId) &&
        Objects.equals(this.age, guaranteedSimulationServicePermittedAgeTarget.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAgeTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

