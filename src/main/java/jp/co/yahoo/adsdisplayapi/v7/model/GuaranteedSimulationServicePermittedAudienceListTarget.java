package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulationServiceAudienceListDeliverType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAudienceListTarget object is a container for audience list targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAudienceListTarget object is a container for audience list targeting settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedAudienceListTarget   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("audienceListDeliverType")
  private GuaranteedSimulationServiceAudienceListDeliverType audienceListDeliverType = null;

  @JsonProperty("audienceListName")
  private String audienceListName = null;

  public GuaranteedSimulationServicePermittedAudienceListTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedAudienceListTarget audienceListDeliverType(GuaranteedSimulationServiceAudienceListDeliverType audienceListDeliverType) {
    this.audienceListDeliverType = audienceListDeliverType;
    return this;
  }

  /**
   * Get audienceListDeliverType
   * @return audienceListDeliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAudienceListDeliverType getAudienceListDeliverType() {
    return audienceListDeliverType;
  }

  public void setAudienceListDeliverType(GuaranteedSimulationServiceAudienceListDeliverType audienceListDeliverType) {
    this.audienceListDeliverType = audienceListDeliverType;
  }

  public GuaranteedSimulationServicePermittedAudienceListTarget audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\">オーディエンスリスト名です。</div> <div lang=\"en\">Audience list name.</div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリスト名です。</div> <div lang=\"en\">Audience list name.</div> ")


  public String getAudienceListName() {
    return audienceListName;
  }

  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAudienceListTarget guaranteedSimulationServicePermittedAudienceListTarget = (GuaranteedSimulationServicePermittedAudienceListTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAudienceListTarget.targetId) &&
        Objects.equals(this.audienceListDeliverType, guaranteedSimulationServicePermittedAudienceListTarget.audienceListDeliverType) &&
        Objects.equals(this.audienceListName, guaranteedSimulationServicePermittedAudienceListTarget.audienceListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, audienceListDeliverType, audienceListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAudienceListTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    audienceListDeliverType: ").append(toIndentedString(audienceListDeliverType)).append("\n");
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
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

