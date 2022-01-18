package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountManagementServiceInvoice object describes the invoice information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AccountManagementServiceInvoice object describes the invoice information.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceInvoice   {
  @JsonProperty("budgetAmount")
  private Long budgetAmount = null;

  public AccountManagementServiceInvoice budgetAmount(Long budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * <div lang=\"ja\"> 金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Budget Amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return budgetAmount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Budget Amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Long budgetAmount) {
    this.budgetAmount = budgetAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementServiceInvoice accountManagementServiceInvoice = (AccountManagementServiceInvoice) o;
    return Objects.equals(this.budgetAmount, accountManagementServiceInvoice.budgetAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceInvoice {\n");
    
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
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

