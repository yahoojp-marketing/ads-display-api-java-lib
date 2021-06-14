package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceTargetListDeliverType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがSITE_RETARGETINGの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceSiteRetargetingTarget object is a container for storing site retargeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is SITE_RETARGETING, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがSITE_RETARGETINGの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceSiteRetargetingTarget object is a container for storing site retargeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is SITE_RETARGETING, this field is required. </div> ")

public class GuaranteedSimulationServiceSiteRetargetingTarget   {
  @JsonProperty("targetListName")
  private JsonNullable<String> targetListName = JsonNullable.undefined();

  @JsonProperty("deliverType")
  private JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> deliverType = JsonNullable.undefined();

  public GuaranteedSimulationServiceSiteRetargetingTarget targetListName(String targetListName) {
    this.targetListName = JsonNullable.of(targetListName);
    return this;
  }

  /**
   * <div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Target list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(JsonNullable<String> targetListName) {
    this.targetListName = targetListName;
  }

  public GuaranteedSimulationServiceSiteRetargetingTarget deliverType(GuaranteedSimulationServiceTargetListDeliverType deliverType) {
    this.deliverType = JsonNullable.of(deliverType);
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> deliverType) {
    this.deliverType = deliverType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceSiteRetargetingTarget guaranteedSimulationServiceSiteRetargetingTarget = (GuaranteedSimulationServiceSiteRetargetingTarget) o;
    return Objects.equals(this.targetListName, guaranteedSimulationServiceSiteRetargetingTarget.targetListName) &&
        Objects.equals(this.deliverType, guaranteedSimulationServiceSiteRetargetingTarget.deliverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListName, deliverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSiteRetargetingTarget {\n");
    
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
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

