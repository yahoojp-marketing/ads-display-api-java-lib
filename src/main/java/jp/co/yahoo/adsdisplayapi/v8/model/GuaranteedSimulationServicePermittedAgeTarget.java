/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceAge;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAgeTarget object holds configuration information of age targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAgeTargetオブジェクトは、年齢ターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAgeTarget object holds configuration information of age targeting.</div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePermittedAgeTarget.JSON_PROPERTY_TARGET_ID,
  GuaranteedSimulationServicePermittedAgeTarget.JSON_PROPERTY_AGE
})
@JsonTypeName("GuaranteedSimulationServicePermittedAgeTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePermittedAgeTarget {
  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_AGE = "age";
  private GuaranteedSimulationServiceAge age;

  public GuaranteedSimulationServicePermittedAgeTarget() { 
  }

  public GuaranteedSimulationServicePermittedAgeTarget targetId(String targetId) {
    
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


  public GuaranteedSimulationServicePermittedAgeTarget age(GuaranteedSimulationServiceAge age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceAge getAge() {
    return age;
  }


  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(GuaranteedSimulationServiceAge age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAgeTarget guaranteedSimulationServicePermittedAgeTarget = (GuaranteedSimulationServicePermittedAgeTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAgeTarget.targetId) &&
        Objects.equals(this.age, guaranteedSimulationServicePermittedAgeTarget.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAgeTarget {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
