package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountLinkServiceOwnerShipTypeは、リンク先のアカウントが同一企業内のアカウントかどうかを表します。<br> </div> <div lang=\"en\"> AccountLinkServiceOwnerShipType describes whether the linked account is an account within the same company.<br> </div> <dl class=term>   <dt class=\"term__item\">OWNER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リンク先のアカウントは同一企業内のアカウントです。</span><span lang=\"en\">The linked account is an account within the same company.</span></dd>   <dt class=\"term__item\">NON_OWNER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リンク先のアカウントは他企業のアカウントです。</span><span lang=\"en\">The linked account is an account of another company.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountLinkServiceOwnerShipType {
  
  OWNER("OWNER"),
  
  NON_OWNER("NON_OWNER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceOwnerShipType(String value) {
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
  public static AccountLinkServiceOwnerShipType fromValue(String value) {
    for (AccountLinkServiceOwnerShipType b : AccountLinkServiceOwnerShipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

