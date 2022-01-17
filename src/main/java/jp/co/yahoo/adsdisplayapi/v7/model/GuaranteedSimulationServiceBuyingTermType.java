package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   商品購入期間種別を表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   Type of package purchase term.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">SINGLE_DAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">単一日です。</span><span lang=\"en\">Single day.</span></dd>   <dt class=\"term__item\">SINGLE_TERM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">単一期間です。</span><span lang=\"en\">Single term.</span></dd>   <dt class=\"term__item\">CUSTOM_RANGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意の範囲です。</span><span lang=\"en\">Custom range.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceBuyingTermType {
  
  SINGLE_DAY("SINGLE_DAY"),
  
  SINGLE_TERM("SINGLE_TERM"),
  
  CUSTOM_RANGE("CUSTOM_RANGE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceBuyingTermType(String value) {
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
  public static GuaranteedSimulationServiceBuyingTermType fromValue(String value) {
    for (GuaranteedSimulationServiceBuyingTermType b : GuaranteedSimulationServiceBuyingTermType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

