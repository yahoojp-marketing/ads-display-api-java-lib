package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAge;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAGE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAgeTarget object is a container for storing age targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AGE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAGE_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAgeTarget object is a container for storing age targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AGE_TARGET, this field is required. </div> ")

public class GuaranteedInventoryServiceAgeTarget   {
  @JsonProperty("age")
  private JsonNullable<GuaranteedInventoryServiceAge> age = JsonNullable.undefined();

  public GuaranteedInventoryServiceAgeTarget age(GuaranteedInventoryServiceAge age) {
    this.age = JsonNullable.of(age);
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceAge> getAge() {
    return age;
  }

  public void setAge(JsonNullable<GuaranteedInventoryServiceAge> age) {
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
    GuaranteedInventoryServiceAgeTarget guaranteedInventoryServiceAgeTarget = (GuaranteedInventoryServiceAgeTarget) o;
    return Objects.equals(this.age, guaranteedInventoryServiceAgeTarget.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAgeTarget {\n");
    
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

