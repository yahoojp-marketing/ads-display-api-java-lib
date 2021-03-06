/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServicePositionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedPositionTargetオブジェクトは、ポジションターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedPositionTarget object holds configuration information of psition targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedPositionTargetオブジェクトは、ポジションターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedPositionTarget object holds configuration information of psition targeting.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePermittedPositionTarget.JSON_PROPERTY_TARGET_ID,
  GuaranteedSimulationServicePermittedPositionTarget.JSON_PROPERTY_POSITION_TYPE
})
@JsonTypeName("GuaranteedSimulationServicePermittedPositionTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePermittedPositionTarget {
  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_POSITION_TYPE = "positionType";
  private GuaranteedSimulationServicePositionType positionType;

  public GuaranteedSimulationServicePermittedPositionTarget() { 
  }

  public GuaranteedSimulationServicePermittedPositionTarget targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ID&lt;/div&gt; 
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットID</div> <div lang=\"en\">Target ID</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public GuaranteedSimulationServicePermittedPositionTarget positionType(GuaranteedSimulationServicePositionType positionType) {
    
    this.positionType = positionType;
    return this;
  }

   /**
   * Get positionType
   * @return positionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServicePositionType getPositionType() {
    return positionType;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositionType(GuaranteedSimulationServicePositionType positionType) {
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
    GuaranteedSimulationServicePermittedPositionTarget guaranteedSimulationServicePermittedPositionTarget = (GuaranteedSimulationServicePermittedPositionTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedPositionTarget.targetId) &&
        Objects.equals(this.positionType, guaranteedSimulationServicePermittedPositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedPositionTarget {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

