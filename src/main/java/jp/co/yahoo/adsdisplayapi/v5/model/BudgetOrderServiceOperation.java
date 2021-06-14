package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.BudgetOrder;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BudgetOrderServiceOperationオブジェクトは、操作の対象となるアカウント予算情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BudgetOrderServiceOperation object is a container for storing account budget information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BudgetOrderServiceOperationオブジェクトは、操作の対象となるアカウント予算情報を表します。</div> <div lang=\"en\">The BudgetOrderServiceOperation object is a container for storing account budget information.</div> ")

public class BudgetOrderServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<BudgetOrder> operand = new ArrayList<>();

  public BudgetOrderServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public BudgetOrderServiceOperation operand(List<BudgetOrder> operand) {
    this.operand = operand;
    return this;
  }

  public BudgetOrderServiceOperation addOperandItem(BudgetOrder operandItem) {
    this.operand.add(operandItem);
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=1) 
  public List<BudgetOrder> getOperand() {
    return operand;
  }

  public void setOperand(List<BudgetOrder> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetOrderServiceOperation budgetOrderServiceOperation = (BudgetOrderServiceOperation) o;
    return Objects.equals(this.accountId, budgetOrderServiceOperation.accountId) &&
        Objects.equals(this.operand, budgetOrderServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetOrderServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

