package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagement;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceValueオブジェクトは、アカウント情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountManagementServiceValue object is a container for storing account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceValueオブジェクトは、アカウント情報を格納するコンテナです。</div> <div lang=\"en\">The AccountManagementServiceValue object is a container for storing account information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceValue   {
  @JsonProperty("accountManagement")
  private AccountManagement accountManagement = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AccountManagementServiceValue accountManagement(AccountManagement accountManagement) {
    this.accountManagement = accountManagement;
    return this;
  }

  /**
   * Get accountManagement
   * @return accountManagement
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagement getAccountManagement() {
    return accountManagement;
  }

  public void setAccountManagement(AccountManagement accountManagement) {
    this.accountManagement = accountManagement;
  }

  public AccountManagementServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AccountManagementServiceValue addErrorsItem(Error errorsItem) {
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

  public AccountManagementServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


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
    AccountManagementServiceValue accountManagementServiceValue = (AccountManagementServiceValue) o;
    return Objects.equals(this.accountManagement, accountManagementServiceValue.accountManagement) &&
        Objects.equals(this.errors, accountManagementServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountManagementServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountManagement, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceValue {\n");
    
    sb.append("    accountManagement: ").append(toIndentedString(accountManagement)).append("\n");
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

