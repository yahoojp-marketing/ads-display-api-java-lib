package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePositionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPOSITION_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServicePositionTarget object is a container for storing position targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is POSITION_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがPOSITION_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedInventoryServicePositionTarget object is a container for storing position targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is POSITION_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServicePositionTarget   {
  @JsonProperty("positionType")
  private GuaranteedInventoryServicePositionType positionType = null;

  public GuaranteedInventoryServicePositionTarget positionType(GuaranteedInventoryServicePositionType positionType) {
    this.positionType = positionType;
    return this;
  }

  /**
   * Get positionType
   * @return positionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePositionType getPositionType() {
    return positionType;
  }

  public void setPositionType(GuaranteedInventoryServicePositionType positionType) {
    this.positionType = positionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServicePositionTarget guaranteedInventoryServicePositionTarget = (GuaranteedInventoryServicePositionTarget) o;
    return Objects.equals(this.positionType, guaranteedInventoryServicePositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServicePositionTarget {\n");
    
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
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

