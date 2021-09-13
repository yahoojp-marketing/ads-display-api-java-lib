package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupServiceBidTypeは、入札方法の種類を表します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceBidType serves types of bidding strategies.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> <dl class=term>   <dt class=\"term__item\">MANUAL_CPC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札（CPC）</span><span lang=\"en\">Manual CPC.</span></dd>   <dt class=\"term__item\">MANUAL_CPV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札（CPV）</span><span lang=\"en\">Manual CPV.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceBidType {
  
  MANUAL_CPC("MANUAL_CPC"),
  
  MANUAL_CPV("MANUAL_CPV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceBidType(String value) {
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
  public static AdGroupServiceBidType fromValue(String value) {
    for (AdGroupServiceBidType b : AdGroupServiceBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
