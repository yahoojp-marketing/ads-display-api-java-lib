package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> フリークエンシー制限単位を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Frequency setting level.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン単位でのフリークエンシー設定です。</span><span lang=\"en\">Frequency Setting per Campaign</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceFrequencyLevel {
  
  CAMPAIGN("CAMPAIGN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceFrequencyLevel(String value) {
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
  public static GuaranteedInventoryServiceFrequencyLevel fromValue(String value) {
    for (GuaranteedInventoryServiceFrequencyLevel b : GuaranteedInventoryServiceFrequencyLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
