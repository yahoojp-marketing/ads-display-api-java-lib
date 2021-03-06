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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.AvailableBalance;
import jp.co.yahoo.adsdisplayapi.v8.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BalanceServiceAvailableBalanceValueオブジェクトは、選択したアカウントの推定現金残高を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BalanceServiceAvailableBalanceValue object describes estimated cash balance for the selected account.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BalanceServiceAvailableBalanceValueオブジェクトは、選択したアカウントの推定現金残高を表します。</div> <div lang=\"en\">BalanceServiceAvailableBalanceValue object describes estimated cash balance for the selected account.</div> ")
@JsonPropertyOrder({
  BalanceServiceAvailableBalanceValue.JSON_PROPERTY_AVAILABLE_BALANCE,
  BalanceServiceAvailableBalanceValue.JSON_PROPERTY_ERRORS,
  BalanceServiceAvailableBalanceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("BalanceServiceAvailableBalanceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BalanceServiceAvailableBalanceValue {
  public static final String JSON_PROPERTY_AVAILABLE_BALANCE = "availableBalance";
  private AvailableBalance availableBalance;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public BalanceServiceAvailableBalanceValue() { 
  }

  public BalanceServiceAvailableBalanceValue availableBalance(AvailableBalance availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailableBalance getAvailableBalance() {
    return availableBalance;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableBalance(AvailableBalance availableBalance) {
    this.availableBalance = availableBalance;
  }


  public BalanceServiceAvailableBalanceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public BalanceServiceAvailableBalanceValue addErrorsItem(Error errorsItem) {
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


  public BalanceServiceAvailableBalanceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A result of operation.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> ")
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
    BalanceServiceAvailableBalanceValue balanceServiceAvailableBalanceValue = (BalanceServiceAvailableBalanceValue) o;
    return Objects.equals(this.availableBalance, balanceServiceAvailableBalanceValue.availableBalance) &&
        Objects.equals(this.errors, balanceServiceAvailableBalanceValue.errors) &&
        Objects.equals(this.operationSucceeded, balanceServiceAvailableBalanceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBalance, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceServiceAvailableBalanceValue {\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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

