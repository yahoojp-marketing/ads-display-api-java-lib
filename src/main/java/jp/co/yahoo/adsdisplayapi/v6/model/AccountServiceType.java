package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountServiceTypeは、アカウントの料金支払い種別を表します。<br> MCCアカウントの場合、このフィールドは返却されません。</div> <div lang=\"en\">AccountServiceType displays the account charge type.<br> If isManagerAccount is \"TRUE\", this field will not be returned.</div> <dl class=term>   <dt class=\"term__item\">PREPAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クレジットカードや銀行振込などの前払い方式です。</span><span lang=\"en\">Creditcardor bank transfer.</span></dd>   <dt class=\"term__item\">INVOICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">代理店クライアントなどの請求書方式です。</span><span lang=\"en\">Invoice Type.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceType {
  
  PREPAY("PREPAY"),
  
  INVOICE("INVOICE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceType(String value) {
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
  public static AccountServiceType fromValue(String value) {
    for (AccountServiceType b : AccountServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

