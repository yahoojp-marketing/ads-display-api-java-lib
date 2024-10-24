/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountManagementServiceInvoice object describes the invoice information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AccountManagementServiceInvoice object describes the invoice information.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@JsonPropertyOrder({
  AccountManagementServiceInvoice.JSON_PROPERTY_BUDGET_AMOUNT
})
@JsonTypeName("AccountManagementServiceInvoice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountManagementServiceInvoice {
  public static final String JSON_PROPERTY_BUDGET_AMOUNT = "budgetAmount";
  private Long budgetAmount;

  public AccountManagementServiceInvoice() { 
  }

  public AccountManagementServiceInvoice budgetAmount(Long budgetAmount) {
    
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 金額です。&lt;br&gt; ※1,000単位、3,000以上999,999,999,999,000以内です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Budget Amount.&lt;br&gt; * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return budgetAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Budget Amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBudgetAmount() {
    return budgetAmount;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

