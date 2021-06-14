package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceTarget;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServiceAdGroupTargetオブジェクトは、予約型キャンペーンの配信シミュレーションのターゲティング情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServiceAdGroupTarget object holds the targeting information about the delivery simulation of the guaranteed campaign.&lt;br&gt; This field is optional in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServiceAdGroupTargetオブジェクトは、予約型キャンペーンの配信シミュレーションのターゲティング情報を保持します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> GuaranteedInventoryServiceAdGroupTarget object holds the targeting information about the delivery simulation of the guaranteed campaign.<br> This field is optional in ADD operation. </div> ")

public class GuaranteedInventoryServiceAdGroupTarget   {
  @JsonProperty("target")
  private JsonNullable<GuaranteedInventoryServiceTarget> target = JsonNullable.undefined();

  public GuaranteedInventoryServiceAdGroupTarget target(GuaranteedInventoryServiceTarget target) {
    this.target = JsonNullable.of(target);
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceTarget> getTarget() {
    return target;
  }

  public void setTarget(JsonNullable<GuaranteedInventoryServiceTarget> target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceAdGroupTarget guaranteedInventoryServiceAdGroupTarget = (GuaranteedInventoryServiceAdGroupTarget) o;
    return Objects.equals(this.target, guaranteedInventoryServiceAdGroupTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceAdGroupTarget {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

