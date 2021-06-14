package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountAdProduct;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountAdProductServiceValueオブジェクトは、広告掲載方式を含むコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountAdProductServiceValue object that includes the ad display methods.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountAdProductServiceValueオブジェクトは、広告掲載方式を含むコンテナです。</div> <div lang=\"en\">AccountAdProductServiceValue object that includes the ad display methods.</div> ")

public class AccountAdProductServiceValue   {
  @JsonProperty("accountAdProduct")
  private JsonNullable<AccountAdProduct> accountAdProduct = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public AccountAdProductServiceValue accountAdProduct(AccountAdProduct accountAdProduct) {
    this.accountAdProduct = JsonNullable.of(accountAdProduct);
    return this;
  }

  /**
   * Get accountAdProduct
   * @return accountAdProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountAdProduct> getAccountAdProduct() {
    return accountAdProduct;
  }

  public void setAccountAdProduct(JsonNullable<AccountAdProduct> accountAdProduct) {
    this.accountAdProduct = accountAdProduct;
  }

  public AccountAdProductServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public AccountAdProductServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public AccountAdProductServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AccountAdProductServiceValue accountAdProductServiceValue = (AccountAdProductServiceValue) o;
    return Objects.equals(this.accountAdProduct, accountAdProductServiceValue.accountAdProduct) &&
        Objects.equals(this.errors, accountAdProductServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountAdProductServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAdProduct, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAdProductServiceValue {\n");
    
    sb.append("    accountAdProduct: ").append(toIndentedString(accountAdProduct)).append("\n");
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

