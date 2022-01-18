package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.Balance;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BalanceValueオブジェクトは、選択したアカウントの未消化予算を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BalanceValue object is a container for storing balance information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BalanceValueオブジェクトは、選択したアカウントの未消化予算を表します。</div> <div lang=\"en\">The BalanceValue object is a container for storing balance information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BalanceServiceValue   {
  @JsonProperty("balance")
  private Balance balance = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public BalanceServiceValue balance(Balance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(value = "")

  @Valid

  public Balance getBalance() {
    return balance;
  }

  public void setBalance(Balance balance) {
    this.balance = balance;
  }

  public BalanceServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public BalanceServiceValue addErrorsItem(Error errorsItem) {
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

  public BalanceServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">A result of operation.</div> ")


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
    BalanceServiceValue balanceServiceValue = (BalanceServiceValue) o;
    return Objects.equals(this.balance, balanceServiceValue.balance) &&
        Objects.equals(this.errors, balanceServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, balanceServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceServiceValue {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

