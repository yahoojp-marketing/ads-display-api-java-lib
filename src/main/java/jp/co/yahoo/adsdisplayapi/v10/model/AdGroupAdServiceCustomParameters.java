/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.AdGroupAdServiceCustomParameter;
import jp.co.yahoo.adsdisplayapi.v10.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceCustomParametersは、カスタムパラメータの設定を表します。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; SET時にurlを指定する場合、このフィールドの値はクリアされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; If url is specified in SET operation, the value in this field will be cleared. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceCustomParameters.JSON_PROPERTY_IS_REMOVE,
  AdGroupAdServiceCustomParameters.JSON_PROPERTY_PARAMETERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceCustomParameters {
  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private AdGroupAdServiceIsRemoveFlg isRemove;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<AdGroupAdServiceCustomParameter> parameters;

  public AdGroupAdServiceCustomParameters() {
  }

  public AdGroupAdServiceCustomParameters isRemove(AdGroupAdServiceIsRemoveFlg isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemove(AdGroupAdServiceIsRemoveFlg isRemove) {
    this.isRemove = isRemove;
  }


  public AdGroupAdServiceCustomParameters parameters(List<AdGroupAdServiceCustomParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public AdGroupAdServiceCustomParameters addParametersItem(AdGroupAdServiceCustomParameter parametersItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceCustomParameter> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<AdGroupAdServiceCustomParameter> parameters) {
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
    AdGroupAdServiceCustomParameters adGroupAdServiceCustomParameters = (AdGroupAdServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupAdServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupAdServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceCustomParameters {\n");
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

