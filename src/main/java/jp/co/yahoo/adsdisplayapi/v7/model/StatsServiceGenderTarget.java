package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceEstimateFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceGender;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceGenderTargetオブジェクトは、性別ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceGenderTarget object holds configuration information of gender targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceGenderTargetオブジェクトは、性別ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceGenderTarget object holds configuration information of gender targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceGenderTarget   {
  @JsonProperty("estimateFlg")
  private StatsServiceEstimateFlg estimateFlg = null;

  @JsonProperty("gender")
  private StatsServiceGender gender = null;

  public StatsServiceGenderTarget estimateFlg(StatsServiceEstimateFlg estimateFlg) {
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

  public StatsServiceGenderTarget gender(StatsServiceGender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceGender getGender() {
    return gender;
  }

  public void setGender(StatsServiceGender gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceGenderTarget statsServiceGenderTarget = (StatsServiceGenderTarget) o;
    return Objects.equals(this.estimateFlg, statsServiceGenderTarget.estimateFlg) &&
        Objects.equals(this.gender, statsServiceGenderTarget.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateFlg, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceGenderTarget {\n");
    
    sb.append("    estimateFlg: ").append(toIndentedString(estimateFlg)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

