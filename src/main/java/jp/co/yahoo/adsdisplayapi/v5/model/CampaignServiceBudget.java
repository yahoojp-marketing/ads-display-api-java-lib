package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceBudgetDeliveryMethod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceBudgetオブジェクトは、キャンペーン予算に関する情報を表します。&lt;br&gt; このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The CampaignServiceBudget object serves campaign budgets.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceBudgetオブジェクトは、キャンペーン予算に関する情報を表します。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> The CampaignServiceBudget object serves campaign budgets.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. </div> ")

public class CampaignServiceBudget   {
  @JsonProperty("amount")
  private JsonNullable<Long> amount = JsonNullable.undefined();

  @JsonProperty("budgetDeliveryMethod")
  private JsonNullable<CampaignServiceBudgetDeliveryMethod> budgetDeliveryMethod = JsonNullable.undefined();

  public CampaignServiceBudget amount(Long amount) {
    this.amount = JsonNullable.of(amount);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの一日あたりの予算（一日単位の利用金額）です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時は無視されます。<br> budgetDeliveryMethodがSTANDARDの場合はADDおよびSET時に必須です。<br> ※目的ありの場合、ADD時に必須となります。 </div> <div lang=\"en\"> The daily budget. <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> This field is required in ADD and SET operation if budgetDeliveryMethod is STANDARD.<br> *For campaigns with campaign goal, this field is required in ADD operation. </div> 
   * @return amount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの一日あたりの予算（一日単位の利用金額）です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時は無視されます。<br> budgetDeliveryMethodがSTANDARDの場合はADDおよびSET時に必須です。<br> ※目的ありの場合、ADD時に必須となります。 </div> <div lang=\"en\"> The daily budget. <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br> This field is required in ADD and SET operation if budgetDeliveryMethod is STANDARD.<br> *For campaigns with campaign goal, this field is required in ADD operation. </div> ")


  public JsonNullable<Long> getAmount() {
    return amount;
  }

  public void setAmount(JsonNullable<Long> amount) {
    this.amount = amount;
  }

  public CampaignServiceBudget budgetDeliveryMethod(CampaignServiceBudgetDeliveryMethod budgetDeliveryMethod) {
    this.budgetDeliveryMethod = JsonNullable.of(budgetDeliveryMethod);
    return this;
  }

  /**
   * Get budgetDeliveryMethod
   * @return budgetDeliveryMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBudgetDeliveryMethod> getBudgetDeliveryMethod() {
    return budgetDeliveryMethod;
  }

  public void setBudgetDeliveryMethod(JsonNullable<CampaignServiceBudgetDeliveryMethod> budgetDeliveryMethod) {
    this.budgetDeliveryMethod = budgetDeliveryMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBudget campaignServiceBudget = (CampaignServiceBudget) o;
    return Objects.equals(this.amount, campaignServiceBudget.amount) &&
        Objects.equals(this.budgetDeliveryMethod, campaignServiceBudget.budgetDeliveryMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, budgetDeliveryMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBudget {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    budgetDeliveryMethod: ").append(toIndentedString(budgetDeliveryMethod)).append("\n");
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

