package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> BudgetOrderServiceLimitChargeTypeは、アカウントの予算種別を表します。<br> SET時、このフィールドは省略可能となります。また、月額予算を変更する場合は<code>MONTHLY</code>を指定します。 </div> <div lang=\"en\"> BudgetOrderServiceLimitChargeType serves the account's budget allotment.<br> This field is optional in SET operation. Specify <code>MONTHLY</code> to change the monthly budget. </div> <dl class=term>   <dt class=\"term__item\">SUM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">総額アカウントです。</span><span lang=\"en\">Total amount</span></dd>   <dt class=\"term__item\">MONTHLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月額アカウントです。</span><span lang=\"en\">Monthly amount</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BudgetOrderServiceLimitChargeType {
  
  SUM("SUM"),
  
  MONTHLY("MONTHLY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BudgetOrderServiceLimitChargeType(String value) {
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
  public static BudgetOrderServiceLimitChargeType fromValue(String value) {
    for (BudgetOrderServiceLimitChargeType b : BudgetOrderServiceLimitChargeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

