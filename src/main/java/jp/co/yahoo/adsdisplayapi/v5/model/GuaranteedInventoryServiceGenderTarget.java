package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceGender;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceGenderTargetオブジェクトは、性別ターゲティングの設定を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがGENDER_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceGenderTarget object is a container for storing gender targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is GENDER_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceGenderTargetオブジェクトは、性別ターゲティングの設定を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがGENDER_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServiceGenderTarget object is a container for storing gender targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is GENDER_TARGET, this field is required. </div> ")

public class GuaranteedInventoryServiceGenderTarget   {
  @JsonProperty("gender")
  private JsonNullable<GuaranteedInventoryServiceGender> gender = JsonNullable.undefined();

  public GuaranteedInventoryServiceGenderTarget gender(GuaranteedInventoryServiceGender gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceGender> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<GuaranteedInventoryServiceGender> gender) {
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
    GuaranteedInventoryServiceGenderTarget guaranteedInventoryServiceGenderTarget = (GuaranteedInventoryServiceGenderTarget) o;
    return Objects.equals(this.gender, guaranteedInventoryServiceGenderTarget.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceGenderTarget {\n");
    
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

