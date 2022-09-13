/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
import jp.co.yahoo.adsdisplayapi.v9.model.AccountTrackingUrl;
import jp.co.yahoo.adsdisplayapi.v9.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むトラッキング情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrlServiceValue object describes the tracking details per entity result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むトラッキング情報を表します。</div> <div lang=\"en\">AccountTrackingUrlServiceValue object describes the tracking details per entity result.</div> ")
@JsonPropertyOrder({
  AccountTrackingUrlServiceValue.JSON_PROPERTY_ACCOUNT_TRACKING_URL,
  AccountTrackingUrlServiceValue.JSON_PROPERTY_ERRORS,
  AccountTrackingUrlServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("AccountTrackingUrlServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountTrackingUrlServiceValue {
  public static final String JSON_PROPERTY_ACCOUNT_TRACKING_URL = "accountTrackingUrl";
  private AccountTrackingUrl accountTrackingUrl;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public AccountTrackingUrlServiceValue() { 
  }

  public AccountTrackingUrlServiceValue accountTrackingUrl(AccountTrackingUrl accountTrackingUrl) {
    
    this.accountTrackingUrl = accountTrackingUrl;
    return this;
  }

   /**
   * Get accountTrackingUrl
   * @return accountTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountTrackingUrl getAccountTrackingUrl() {
    return accountTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountTrackingUrl(AccountTrackingUrl accountTrackingUrl) {
    this.accountTrackingUrl = accountTrackingUrl;
  }


  public AccountTrackingUrlServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AccountTrackingUrlServiceValue addErrorsItem(Error errorsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AccountTrackingUrlServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果を表示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Displays process result.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> ")
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
    AccountTrackingUrlServiceValue accountTrackingUrlServiceValue = (AccountTrackingUrlServiceValue) o;
    return Objects.equals(this.accountTrackingUrl, accountTrackingUrlServiceValue.accountTrackingUrl) &&
        Objects.equals(this.errors, accountTrackingUrlServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountTrackingUrlServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountTrackingUrl, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrlServiceValue {\n");
    sb.append("    accountTrackingUrl: ").append(toIndentedString(accountTrackingUrl)).append("\n");
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

