/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v12.model.GuaranteedAdGroupAdServiceCustomParameter;
import jp.co.yahoo.adsdisplayapi.v12.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdServiceCustomParametersは、カスタムパラメータの設定を表します。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedAdGroupAdServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupAdServiceCustomParametersは、カスタムパラメータの設定を表します。<br> finalUrlを指定するときのみ、任意で指定できます。<br> ※現在利用できません </div> <div lang=\"en\">GuaranteedAdGroupAdServiceCustomParameters displays the setting of custom parameters.<br> This field can be optionally specified only when specifying finalUrl.<br> * Not Available. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceCustomParameters.JSON_PROPERTY_IS_REMOVE,
  GuaranteedAdGroupAdServiceCustomParameters.JSON_PROPERTY_PARAMETERS
})
@JsonTypeName("GuaranteedAdGroupAdServiceCustomParameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceCustomParameters {
  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemove;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<GuaranteedAdGroupAdServiceCustomParameter> parameters = null;

  public GuaranteedAdGroupAdServiceCustomParameters() { 
  }

  public GuaranteedAdGroupAdServiceCustomParameters isRemove(GuaranteedAdGroupAdServiceIsRemoveFlg isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemove(GuaranteedAdGroupAdServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
  }


  public GuaranteedAdGroupAdServiceCustomParameters parameters(List<GuaranteedAdGroupAdServiceCustomParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public GuaranteedAdGroupAdServiceCustomParameters addParametersItem(GuaranteedAdGroupAdServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupAdServiceCustomParameter> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<GuaranteedAdGroupAdServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCustomParameters guaranteedAdGroupAdServiceCustomParameters = (GuaranteedAdGroupAdServiceCustomParameters) o;
    return Objects.equals(this.isRemove, guaranteedAdGroupAdServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, guaranteedAdGroupAdServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCustomParameters {\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

