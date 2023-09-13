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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v12.model.DictionaryServiceDisapprovalReason;
import jp.co.yahoo.adsdisplayapi.v12.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReasonValueオブジェクトは、 EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReasonValue object is a container of EditorialReason list.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceDisapprovalReasonValue.JSON_PROPERTY_DISAPPROVAL_REASON,
  DictionaryServiceDisapprovalReasonValue.JSON_PROPERTY_ERRORS,
  DictionaryServiceDisapprovalReasonValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceDisapprovalReasonValue {
  public static final String JSON_PROPERTY_DISAPPROVAL_REASON = "disapprovalReason";
  private DictionaryServiceDisapprovalReason disapprovalReason;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public DictionaryServiceDisapprovalReasonValue() {
  }

  public DictionaryServiceDisapprovalReasonValue disapprovalReason(DictionaryServiceDisapprovalReason disapprovalReason) {
    
    this.disapprovalReason = disapprovalReason;
    return this;
  }

   /**
   * Get disapprovalReason
   * @return disapprovalReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceDisapprovalReason getDisapprovalReason() {
    return disapprovalReason;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReason(DictionaryServiceDisapprovalReason disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
  }


  public DictionaryServiceDisapprovalReasonValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public DictionaryServiceDisapprovalReasonValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
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


  public DictionaryServiceDisapprovalReasonValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
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
    DictionaryServiceDisapprovalReasonValue dictionaryServiceDisapprovalReasonValue = (DictionaryServiceDisapprovalReasonValue) o;
    return Objects.equals(this.disapprovalReason, dictionaryServiceDisapprovalReasonValue.disapprovalReason) &&
        Objects.equals(this.errors, dictionaryServiceDisapprovalReasonValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceDisapprovalReasonValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReason, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReasonValue {\n");
    sb.append("    disapprovalReason: ").append(toIndentedString(disapprovalReason)).append("\n");
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

