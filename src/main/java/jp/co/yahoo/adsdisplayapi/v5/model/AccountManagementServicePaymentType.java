package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServicePaymentTypeは、支払種別を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AccountManagementServicePaymentType describes the type of payment.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">PREPAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">前課金です。</span><span lang=\"en\">Prepayment.</span></dd>   <dt class=\"term__item\">INVOICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">後請求です。</span><span lang=\"en\">Invoice payment.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServicePaymentType {
  
  PREPAY("PREPAY"),
  
  INVOICE("INVOICE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServicePaymentType(String value) {
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
  public static AccountManagementServicePaymentType fromValue(String value) {
    for (AccountManagementServicePaymentType b : AccountManagementServicePaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

