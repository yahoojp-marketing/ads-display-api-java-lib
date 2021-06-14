package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountAuthority;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAuthorityServiceValueオブジェクトは、アカウント権限情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountAuthorityServiceValue object is a container for storing account authority information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountAuthorityServiceValueオブジェクトは、アカウント権限情報を格納するコンテナです。</div> <div lang=\"en\">The AccountAuthorityServiceValue object is a container for storing account authority information.</div> ")

public class AccountAuthorityServiceValue   {
  @JsonProperty("accountAuthority")
  private JsonNullable<AccountAuthority> accountAuthority = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public AccountAuthorityServiceValue accountAuthority(AccountAuthority accountAuthority) {
    this.accountAuthority = JsonNullable.of(accountAuthority);
    return this;
  }

  /**
   * Get accountAuthority
   * @return accountAuthority
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountAuthority> getAccountAuthority() {
    return accountAuthority;
  }

  public void setAccountAuthority(JsonNullable<AccountAuthority> accountAuthority) {
    this.accountAuthority = accountAuthority;
  }

  public AccountAuthorityServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public AccountAuthorityServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public AccountAuthorityServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAuthorityServiceValue accountAuthorityServiceValue = (AccountAuthorityServiceValue) o;
    return Objects.equals(this.accountAuthority, accountAuthorityServiceValue.accountAuthority) &&
        Objects.equals(this.errors, accountAuthorityServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountAuthorityServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAuthority, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAuthorityServiceValue {\n");
    
    sb.append("    accountAuthority: ").append(toIndentedString(accountAuthority)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

