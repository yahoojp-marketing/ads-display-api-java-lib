package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AccountLink;
import jp.co.yahoo.adsdisplayapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkServiceValueオブジェクトは、アカウントリンク情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountLinkServiceValue object is a container for storing account link information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountLinkServiceValueオブジェクトは、アカウントリンク情報を格納するコンテナです。</div> <div lang=\"en\">The AccountLinkServiceValue object is a container for storing account link information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountLinkServiceValue   {
  @JsonProperty("accountLink")
  private AccountLink accountLink = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AccountLinkServiceValue accountLink(AccountLink accountLink) {
    this.accountLink = accountLink;
    return this;
  }

  /**
   * Get accountLink
   * @return accountLink
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountLink getAccountLink() {
    return accountLink;
  }

  public void setAccountLink(AccountLink accountLink) {
    this.accountLink = accountLink;
  }

  public AccountLinkServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AccountLinkServiceValue addErrorsItem(Error errorsItem) {
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

  public AccountLinkServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AccountLinkServiceValue accountLinkServiceValue = (AccountLinkServiceValue) o;
    return Objects.equals(this.accountLink, accountLinkServiceValue.accountLink) &&
        Objects.equals(this.errors, accountLinkServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountLinkServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLink, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinkServiceValue {\n");
    
    sb.append("    accountLink: ").append(toIndentedString(accountLink)).append("\n");
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

