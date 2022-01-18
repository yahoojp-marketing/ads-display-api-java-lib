package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceAge;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAGE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAgeTarget object is a container for storing age targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AGE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAGE_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAgeTarget object is a container for storing age targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AGE_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceAgeTarget   {
  @JsonProperty("age")
  private GuaranteedSimulationServiceAge age = null;

  public GuaranteedSimulationServiceAgeTarget age(GuaranteedSimulationServiceAge age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAge getAge() {
    return age;
  }

  public void setAge(GuaranteedSimulationServiceAge age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAgeTarget guaranteedSimulationServiceAgeTarget = (GuaranteedSimulationServiceAgeTarget) o;
    return Objects.equals(this.age, guaranteedSimulationServiceAgeTarget.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAgeTarget {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

