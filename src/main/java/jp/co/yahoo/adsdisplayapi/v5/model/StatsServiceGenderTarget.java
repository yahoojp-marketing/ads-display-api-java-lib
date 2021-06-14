package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceEstimateFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceGender;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceGenderTargetオブジェクトは、性別ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceGenderTarget object holds configuration information of gender targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceGenderTargetオブジェクトは、性別ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceGenderTarget object holds configuration information of gender targeting.</div> ")

public class StatsServiceGenderTarget   {
  @JsonProperty("estimateFlg")
  private JsonNullable<StatsServiceEstimateFlg> estimateFlg = JsonNullable.undefined();

  @JsonProperty("gender")
  private JsonNullable<StatsServiceGender> gender = JsonNullable.undefined();

  public StatsServiceGenderTarget estimateFlg(StatsServiceEstimateFlg estimateFlg) {
    this.estimateFlg = JsonNullable.of(estimateFlg);
    return this;
  }

  /**
   * Get estimateFlg
   * @return estimateFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceEstimateFlg> getEstimateFlg() {
    return estimateFlg;
  }

  public void setEstimateFlg(JsonNullable<StatsServiceEstimateFlg> estimateFlg) {
    this.estimateFlg = estimateFlg;
  }

  public StatsServiceGenderTarget gender(StatsServiceGender gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceGender> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<StatsServiceGender> gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

