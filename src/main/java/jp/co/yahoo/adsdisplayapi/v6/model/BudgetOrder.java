package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.BudgetOrderServiceAccountType;
import jp.co.yahoo.adsdisplayapi.v6.model.BudgetOrderServiceLimitChargeType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BudgetOrderオブジェクトは、アカウント予算情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BudgetOrder object is a container for storing the account budget.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BudgetOrderオブジェクトは、アカウント予算情報を示します。<br> </div> <div lang=\"en\">BudgetOrder object is a container for storing the account budget.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BudgetOrder   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("accountType")
  private BudgetOrderServiceAccountType accountType = null;

  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("limitChargeType")
  private BudgetOrderServiceLimitChargeType limitChargeType = null;

  public BudgetOrder accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public BudgetOrder accountType(BudgetOrderServiceAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")

  @Valid

  public BudgetOrderServiceAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(BudgetOrderServiceAccountType accountType) {
    this.accountType = accountType;
  }

  public BudgetOrder amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントの広告予算金額です。<br> SET時、このフィールドは省略可能となります。 月額予算は、accountTypeが<code>INVOICE</code>の場合のみ変更可能です。 また、予算額は1000円単位で指定する必要があります。 </div> <div lang=\"en\"> Amount of budget.<br> This field is optional in SET operation. The monthly budget can be changed only when accountType is <code>INVOICE</code>. In addition, the budget amount must be specified in units of 1000 yen. </div> 
   * @return amount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントの広告予算金額です。<br> SET時、このフィールドは省略可能となります。 月額予算は、accountTypeが<code>INVOICE</code>の場合のみ変更可能です。 また、予算額は1000円単位で指定する必要があります。 </div> <div lang=\"en\"> Amount of budget.<br> This field is optional in SET operation. The monthly budget can be changed only when accountType is <code>INVOICE</code>. In addition, the budget amount must be specified in units of 1000 yen. </div> ")


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public BudgetOrder limitChargeType(BudgetOrderServiceLimitChargeType limitChargeType) {
    this.limitChargeType = limitChargeType;
    return this;
  }

  /**
   * Get limitChargeType
   * @return limitChargeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public BudgetOrderServiceLimitChargeType getLimitChargeType() {
    return limitChargeType;
  }

  public void setLimitChargeType(BudgetOrderServiceLimitChargeType limitChargeType) {
    this.limitChargeType = limitChargeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetOrder budgetOrder = (BudgetOrder) o;
    return Objects.equals(this.accountId, budgetOrder.accountId) &&
        Objects.equals(this.accountType, budgetOrder.accountType) &&
        Objects.equals(this.amount, budgetOrder.amount) &&
        Objects.equals(this.limitChargeType, budgetOrder.limitChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, amount, limitChargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetOrder {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    limitChargeType: ").append(toIndentedString(limitChargeType)).append("\n");
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

