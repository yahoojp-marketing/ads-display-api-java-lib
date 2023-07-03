/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v9.model.BudgetOrderServiceAccountType;
import jp.co.yahoo.adsdisplayapi.v9.model.BudgetOrderServiceLimitChargeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BudgetOrderオブジェクトは、アカウント予算情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BudgetOrder object is a container for storing the account budget.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  BudgetOrder.JSON_PROPERTY_ACCOUNT_ID,
  BudgetOrder.JSON_PROPERTY_ACCOUNT_TYPE,
  BudgetOrder.JSON_PROPERTY_AMOUNT,
  BudgetOrder.JSON_PROPERTY_LIMIT_CHARGE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BudgetOrder {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private BudgetOrderServiceAccountType accountType;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_LIMIT_CHARGE_TYPE = "limitChargeType";
  private BudgetOrderServiceLimitChargeType limitChargeType;

  public BudgetOrder() {
  }

  public BudgetOrder accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BudgetOrderServiceAccountType getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(BudgetOrderServiceAccountType accountType) {
    this.accountType = accountType;
  }


  public BudgetOrder amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントの広告予算金額です。&lt;br&gt; SET時、このフィールドは省略可能となります。 月額予算は、accountTypeが&lt;code&gt;INVOICE&lt;/code&gt;の場合のみ変更可能です。 また、予算額は1000円単位で指定する必要があります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Amount of budget.&lt;br&gt; This field is optional in SET operation. The monthly budget can be changed only when accountType is &lt;code&gt;INVOICE&lt;/code&gt;. In addition, the budget amount must be specified in units of 1000 yen. &lt;/div&gt; 
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BudgetOrderServiceLimitChargeType getLimitChargeType() {
    return limitChargeType;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

