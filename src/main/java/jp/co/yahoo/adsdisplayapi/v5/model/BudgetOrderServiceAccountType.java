package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">BudgetOrderServiceAccountTypeは、アカウントの料金支払い種別を表します。</div> <div lang=\"en\">BudgetOrderServiceAccountType displays the account charge type.</div> <dl class=term>   <dt class=\"term__item\">PREPAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クレジットカードや銀行振込などの前払い方式です。</span><span lang=\"en\">Creditcardor bank transfer.</span></dd>   <dt class=\"term__item\">INVOICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">代理店クライアントなどの請求書方式です。</span><span lang=\"en\">Invoice Type.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BudgetOrderServiceAccountType {
  
  PREPAY("PREPAY"),
  
  INVOICE("INVOICE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BudgetOrderServiceAccountType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BudgetOrderServiceAccountType fromValue(String value) {
    for (BudgetOrderServiceAccountType b : BudgetOrderServiceAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

