package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceBiddingStrategyTypeは、入札方法の種類を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AdGroupAdServiceBiddingStrategyType serves types of bidding strategies.<br> This field is required in ADD operation, and will be optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">MANUAL_CPC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札（CPC）</span><span lang=\"en\">Manual CPC.</span></dd>   <dt class=\"term__item\">MANUAL_CPV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札（CPV）</span><span lang=\"en\">Manual CPV.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceBiddingStrategyType {
  
  MANUAL_CPC("MANUAL_CPC"),
  
  MANUAL_CPV("MANUAL_CPV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceBiddingStrategyType(String value) {
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
  public static AdGroupAdServiceBiddingStrategyType fromValue(String value) {
    for (AdGroupAdServiceBiddingStrategyType b : AdGroupAdServiceBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

