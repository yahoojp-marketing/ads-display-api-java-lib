package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.BudgetOrder;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BudgetOrderServiceValueオブジェクトは、アカウント予算情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BudgetOrderServiceValue object is a container for storing account budget.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BudgetOrderServiceValueオブジェクトは、アカウント予算情報を格納するコンテナです。</div> <div lang=\"en\">The BudgetOrderServiceValue object is a container for storing account budget.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BudgetOrderServiceValue   {
  @JsonProperty("budgetOrder")
  private BudgetOrder budgetOrder = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public BudgetOrderServiceValue budgetOrder(BudgetOrder budgetOrder) {
    this.budgetOrder = budgetOrder;
    return this;
  }

  /**
   * Get budgetOrder
   * @return budgetOrder
  */
  @ApiModelProperty(value = "")

  @Valid

  public BudgetOrder getBudgetOrder() {
    return budgetOrder;
  }

  public void setBudgetOrder(BudgetOrder budgetOrder) {
    this.budgetOrder = budgetOrder;
  }

  public BudgetOrderServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public BudgetOrderServiceValue addErrorsItem(Error errorsItem) {
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

  public BudgetOrderServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    BudgetOrderServiceValue budgetOrderServiceValue = (BudgetOrderServiceValue) o;
    return Objects.equals(this.budgetOrder, budgetOrderServiceValue.budgetOrder) &&
        Objects.equals(this.errors, budgetOrderServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, budgetOrderServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetOrder, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetOrderServiceValue {\n");
    
    sb.append("    budgetOrder: ").append(toIndentedString(budgetOrder)).append("\n");
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

