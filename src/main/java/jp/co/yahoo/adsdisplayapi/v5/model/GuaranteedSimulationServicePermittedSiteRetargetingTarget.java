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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedSiteRetargetingTarget object is a container for site retargeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedSiteRetargetingTargetオブジェクトは、サイトリターゲティングの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedSiteRetargetingTarget object is a container for site retargeting settings.</div> ")

public class GuaranteedSimulationServicePermittedSiteRetargetingTarget   {
  @JsonProperty("targetId")
  private JsonNullable<String> targetId = JsonNullable.undefined();

  @JsonProperty("targetListDeliverType")
  private JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> targetListDeliverType = JsonNullable.undefined();

  @JsonProperty("targetListName")
  private JsonNullable<String> targetListName = JsonNullable.undefined();

  public GuaranteedSimulationServicePermittedSiteRetargetingTarget targetId(String targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> ")


  public JsonNullable<String> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<String> targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedSiteRetargetingTarget targetListDeliverType(GuaranteedSimulationServiceTargetListDeliverType targetListDeliverType) {
    this.targetListDeliverType = JsonNullable.of(targetListDeliverType);
    return this;
  }

  /**
   * Get targetListDeliverType
   * @return targetListDeliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> getTargetListDeliverType() {
    return targetListDeliverType;
  }

  public void setTargetListDeliverType(JsonNullable<GuaranteedSimulationServiceTargetListDeliverType> targetListDeliverType) {
    this.targetListDeliverType = targetListDeliverType;
  }

  public GuaranteedSimulationServicePermittedSiteRetargetingTarget targetListName(String targetListName) {
    this.targetListName = JsonNullable.of(targetListName);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリスト名です。</div> <div lang=\"en\">Target list name.</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名です。</div> <div lang=\"en\">Target list name.</div> ")


  public JsonNullable<String> getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(JsonNullable<String> targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedSiteRetargetingTarget guaranteedSimulationServicePermittedSiteRetargetingTarget = (GuaranteedSimulationServicePermittedSiteRetargetingTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedSiteRetargetingTarget.targetId) &&
        Objects.equals(this.targetListDeliverType, guaranteedSimulationServicePermittedSiteRetargetingTarget.targetListDeliverType) &&
        Objects.equals(this.targetListName, guaranteedSimulationServicePermittedSiteRetargetingTarget.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, targetListDeliverType, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedSiteRetargetingTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetListDeliverType: ").append(toIndentedString(targetListDeliverType)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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

