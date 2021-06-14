package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceAge;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceEstimateFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAGE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceAgeTarget object is a container for storing age targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is AGE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceAgeTargetオブジェクトは、年齢ターゲティングの設定情報を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがAGE_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceAgeTarget object is a container for storing age targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is AGE_TARGET, this field is required. </div> ")

public class AdGroupTargetServiceAgeTarget   {
  @JsonProperty("age")
  private JsonNullable<AdGroupTargetServiceAge> age = JsonNullable.undefined();

  @JsonProperty("estimateFlg")
  private JsonNullable<AdGroupTargetServiceEstimateFlg> estimateFlg = JsonNullable.undefined();

  public AdGroupTargetServiceAgeTarget age(AdGroupTargetServiceAge age) {
    this.age = JsonNullable.of(age);
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceAge> getAge() {
    return age;
  }

  public void setAge(JsonNullable<AdGroupTargetServiceAge> age) {
    this.age = age;
  }

  public AdGroupTargetServiceAgeTarget estimateFlg(AdGroupTargetServiceEstimateFlg estimateFlg) {
    this.estimateFlg = JsonNullable.of(estimateFlg);
    return this;
  }

  /**
   * Get estimateFlg
   * @return estimateFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceEstimateFlg> getEstimateFlg() {
    return estimateFlg;
  }

  public void setEstimateFlg(JsonNullable<AdGroupTargetServiceEstimateFlg> estimateFlg) {
    this.estimateFlg = estimateFlg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceAgeTarget adGroupTargetServiceAgeTarget = (AdGroupTargetServiceAgeTarget) o;
    return Objects.equals(this.age, adGroupTargetServiceAgeTarget.age) &&
        Objects.equals(this.estimateFlg, adGroupTargetServiceAgeTarget.estimateFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, estimateFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceAgeTarget {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    estimateFlg: ").append(toIndentedString(estimateFlg)).append("\n");
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

