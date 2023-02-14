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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.AdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v10.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupTargetServiceValueオブジェクトは、メソッドの実行結果（1エンティティ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupTargetServiceValue object contains the result (1 entity) for method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupTargetServiceValueオブジェクトは、メソッドの実行結果（1エンティティ）を保持します。</div> <div lang=\"en\">The AdGroupTargetServiceValue object contains the result (1 entity) for method.</div> ")
@JsonPropertyOrder({
  AdGroupTargetServiceValue.JSON_PROPERTY_AD_GROUP_TARGET_LIST,
  AdGroupTargetServiceValue.JSON_PROPERTY_ERRORS,
  AdGroupTargetServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("AdGroupTargetServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTargetServiceValue {
  public static final String JSON_PROPERTY_AD_GROUP_TARGET_LIST = "adGroupTargetList";
  private AdGroupTarget adGroupTargetList;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public AdGroupTargetServiceValue() { 
  }

  public AdGroupTargetServiceValue adGroupTargetList(AdGroupTarget adGroupTargetList) {
    
    this.adGroupTargetList = adGroupTargetList;
    return this;
  }

   /**
   * Get adGroupTargetList
   * @return adGroupTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTarget getAdGroupTargetList() {
    return adGroupTargetList;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupTargetList(AdGroupTarget adGroupTargetList) {
    this.adGroupTargetList = adGroupTargetList;
  }


  public AdGroupTargetServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupTargetServiceValue addErrorsItem(Error errorsItem) {
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


  public AdGroupTargetServiceValue operationSucceeded(Boolean operationSucceeded) {
    
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
    AdGroupTargetServiceValue adGroupTargetServiceValue = (AdGroupTargetServiceValue) o;
    return Objects.equals(this.adGroupTargetList, adGroupTargetServiceValue.adGroupTargetList) &&
        Objects.equals(this.errors, adGroupTargetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupTargetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupTargetList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceValue {\n");
    sb.append("    adGroupTargetList: ").append(toIndentedString(adGroupTargetList)).append("\n");
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

