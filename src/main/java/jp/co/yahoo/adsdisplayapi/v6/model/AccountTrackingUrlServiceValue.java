package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountTrackingUrl;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むトラッキング情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrlServiceValue object describes the tracking details per entity result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlServiceValueオブジェクトは、実行結果（1 Entity）を含むトラッキング情報を表します。</div> <div lang=\"en\">AccountTrackingUrlServiceValue object describes the tracking details per entity result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountTrackingUrlServiceValue   {
  @JsonProperty("accountTrackingUrl")
  private AccountTrackingUrl accountTrackingUrl = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AccountTrackingUrlServiceValue accountTrackingUrl(AccountTrackingUrl accountTrackingUrl) {
    this.accountTrackingUrl = accountTrackingUrl;
    return this;
  }

  /**
   * Get accountTrackingUrl
   * @return accountTrackingUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountTrackingUrl getAccountTrackingUrl() {
    return accountTrackingUrl;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public AccountTrackingUrlServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

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

