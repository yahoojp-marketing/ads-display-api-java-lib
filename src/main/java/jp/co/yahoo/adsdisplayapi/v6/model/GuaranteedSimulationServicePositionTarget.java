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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがPOSITION_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServicePositionTarget object is a container for storing position targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; ∗If targetType is POSITION_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServicePositionTargetオブジェクトは、ポジションターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがPOSITION_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServicePositionTarget object is a container for storing position targeting settings.<br> This field is optional in ADD operation.<br> ∗If targetType is POSITION_TARGET, this field is required. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePositionTarget.JSON_PROPERTY_POSITION_TYPE
})
@JsonTypeName("GuaranteedSimulationServicePositionTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePositionTarget {
  public static final String JSON_PROPERTY_POSITION_TYPE = "positionType";
  private GuaranteedSimulationServicePositionType positionType;

  public GuaranteedSimulationServicePositionTarget() { 
  }

  public GuaranteedSimulationServicePositionTarget positionType(GuaranteedSimulationServicePositionType positionType) {
    
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
    GuaranteedSimulationServicePositionTarget guaranteedSimulationServicePositionTarget = (GuaranteedSimulationServicePositionTarget) o;
    return Objects.equals(this.positionType, guaranteedSimulationServicePositionTarget.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePositionTarget {\n");
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

