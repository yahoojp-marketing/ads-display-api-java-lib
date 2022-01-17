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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAudienceListTarget object is a container for storing audience list targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAudienceListTargetオブジェクトは、オーディエンスリストターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAUDIENCE_LIST_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAudienceListTarget object is a container for storing audience list targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is AUDIENCE_LIST_TARGET, this field is required. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceAudienceListTarget   {
  @JsonProperty("audienceListName")
  private String audienceListName = null;

  @JsonProperty("deliverType")
  private GuaranteedSimulationServiceAudienceListDeliverType deliverType = null;

  public GuaranteedSimulationServiceAudienceListTarget audienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
    return this;
  }

  /**
   * <div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return audienceListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> オーディエンスリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Audience list name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAudienceListName() {
    return audienceListName;
  }

  public void setAudienceListName(String audienceListName) {
    this.audienceListName = audienceListName;
  }

  public GuaranteedSimulationServiceAudienceListTarget deliverType(GuaranteedSimulationServiceAudienceListDeliverType deliverType) {
    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * @return deliverType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAudienceListDeliverType getDeliverType() {
    return deliverType;
  }

  public void setDeliverType(GuaranteedSimulationServiceAudienceListDeliverType deliverType) {
    this.deliverType = deliverType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceAudienceListTarget guaranteedSimulationServiceAudienceListTarget = (GuaranteedSimulationServiceAudienceListTarget) o;
    return Objects.equals(this.audienceListName, guaranteedSimulationServiceAudienceListTarget.audienceListName) &&
        Objects.equals(this.deliverType, guaranteedSimulationServiceAudienceListTarget.deliverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceListName, deliverType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAudienceListTarget {\n");
    
    sb.append("    audienceListName: ").append(toIndentedString(audienceListName)).append("\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
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

