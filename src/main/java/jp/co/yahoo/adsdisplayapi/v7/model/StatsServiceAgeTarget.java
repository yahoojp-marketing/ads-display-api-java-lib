package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceAge;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceEstimateFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAgeTarget object holds configuration information of age targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAgeTarget object holds configuration information of age targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAgeTarget   {
  @JsonProperty("age")
  private StatsServiceAge age = null;

  @JsonProperty("estimateFlg")
  private StatsServiceEstimateFlg estimateFlg = null;

  public StatsServiceAgeTarget age(StatsServiceAge age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceAge getAge() {
    return age;
  }

  public void setAge(StatsServiceAge age) {
    this.age = age;
  }

  public StatsServiceAgeTarget estimateFlg(StatsServiceEstimateFlg estimateFlg) {
    this.estimateFlg = estimateFlg;
    return this;
  }

  /**
   * Get estimateFlg
   * @return estimateFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceEstimateFlg getEstimateFlg() {
    return estimateFlg;
  }

  public void setEstimateFlg(StatsServiceEstimateFlg estimateFlg) {
    this.estimateFlg = estimateFlg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAgeTarget statsServiceAgeTarget = (StatsServiceAgeTarget) o;
    return Objects.equals(this.age, statsServiceAgeTarget.age) &&
        Objects.equals(this.estimateFlg, statsServiceAgeTarget.estimateFlg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, estimateFlg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAgeTarget {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    estimateFlg: ").append(toIndentedString(estimateFlg)).append("\n");
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

