/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupLabelServiceValueオブジェクトは、操作結果を含む広告グループラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupLabelServiceValue object describes ad group label information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupLabelServiceValueオブジェクトは、操作結果を含む広告グループラベルの情報を表します。</div> <div lang=\"en\">AdGroupLabelServiceValue object describes ad group label information including its operation results.</div> ")
@JsonPropertyOrder({
  AdGroupLabelServiceValue.JSON_PROPERTY_AD_GROUP_LABEL,
  AdGroupLabelServiceValue.JSON_PROPERTY_ERRORS,
  AdGroupLabelServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("AdGroupLabelServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupLabelServiceValue {
  public static final String JSON_PROPERTY_AD_GROUP_LABEL = "adGroupLabel";
  private AdGroupLabel adGroupLabel;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public AdGroupLabelServiceValue() { 
  }

  public AdGroupLabelServiceValue adGroupLabel(AdGroupLabel adGroupLabel) {
    
    this.adGroupLabel = adGroupLabel;
    return this;
  }

   /**
   * Get adGroupLabel
   * @return adGroupLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupLabel getAdGroupLabel() {
    return adGroupLabel;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupLabel(AdGroupLabel adGroupLabel) {
    this.adGroupLabel = adGroupLabel;
  }


  public AdGroupLabelServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupLabelServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エラー内容です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Error content.&lt;/div&gt; 
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public AdGroupLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupLabelServiceValue adGroupLabelServiceValue = (AdGroupLabelServiceValue) o;
    return Objects.equals(this.adGroupLabel, adGroupLabelServiceValue.adGroupLabel) &&
        Objects.equals(this.errors, adGroupLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupLabelServiceValue {\n");
    sb.append("    adGroupLabel: ").append(toIndentedString(adGroupLabel)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

