package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceEstimateFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceGender;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetServiceGenderTargetオブジェクトは、性別ターゲティングの設定を保持します。&lt;br&gt; ADD、SETおよびREPLACE時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがGENDER_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTargetServiceGenderTarget object is a container for storing gender targeting settings.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation.&lt;br&gt; ∗If targetType is GENDER_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetServiceGenderTargetオブジェクトは、性別ターゲティングの設定を保持します。<br> ADD、SETおよびREPLACE時、このフィールドは省略可能となります。<br> ※targetTypeがGENDER_TARGETの場合は必須です。 </div> <div lang=\"en\"> AdGroupTargetServiceGenderTarget object is a container for storing gender targeting settings.<br> This field is optional in ADD, SET and REPLACE operation.<br> ∗If targetType is GENDER_TARGET, this field is required. </div> ")

public class AdGroupTargetServiceGenderTarget   {
  @JsonProperty("estimateFlg")
  private JsonNullable<AdGroupTargetServiceEstimateFlg> estimateFlg = JsonNullable.undefined();

  @JsonProperty("gender")
  private JsonNullable<AdGroupTargetServiceGender> gender = JsonNullable.undefined();

  public AdGroupTargetServiceGenderTarget estimateFlg(AdGroupTargetServiceEstimateFlg estimateFlg) {
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

  public AdGroupTargetServiceGenderTarget gender(AdGroupTargetServiceGender gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceGender> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<AdGroupTargetServiceGender> gender) {
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
    AdGroupTargetServiceGenderTarget adGroupTargetServiceGenderTarget = (AdGroupTargetServiceGenderTarget) o;
    return Objects.equals(this.estimateFlg, adGroupTargetServiceGenderTarget.estimateFlg) &&
        Objects.equals(this.gender, adGroupTargetServiceGenderTarget.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateFlg, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceGenderTarget {\n");
    
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

