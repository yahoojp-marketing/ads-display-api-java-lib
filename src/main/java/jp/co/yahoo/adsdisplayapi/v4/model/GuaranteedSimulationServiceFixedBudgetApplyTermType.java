package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   GuaranteedSimulationServiceFixedBudgetApplyTermTypeは、商品固定価格適用期間を表します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceFixedBudgetApplyTermType describes the application period of fixed product price.<br>   Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">SINGLE_DAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">単1日です。</span><span lang=\"en\">Single day.</span></dd>   <dt class=\"term__item\">LIFETIME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通期です。<br>※この「通期」は、予約型キャンペーンの開始から終了までの全期間を意味します。</span><span lang=\"en\">Lifetime.<br>* \"lifetime\" means the entire period from the start to the end of the guaranteed campaign.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedSimulationServiceFixedBudgetApplyTermType {
  
  SINGLE_DAY("SINGLE_DAY"),
  
  LIFETIME("LIFETIME"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedSimulationServiceFixedBudgetApplyTermType(String value) {
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
  public static GuaranteedSimulationServiceFixedBudgetApplyTermType fromValue(String value) {
    for (GuaranteedSimulationServiceFixedBudgetApplyTermType b : GuaranteedSimulationServiceFixedBudgetApplyTermType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

