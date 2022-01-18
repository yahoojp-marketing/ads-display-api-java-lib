package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServiceInventoryUnitは、在庫確認単位を表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">GuaranteedInventoryServiceInventoryUnit describes the unit of inventoy check. <br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">DAILY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日毎です。</span><span lang=\"en\">Daily.</span></dd>   <dt class=\"term__item\">WEEKLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">週毎です。</span><span lang=\"en\">Weekly.</span></dd>   <dt class=\"term__item\">MONTHLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月毎です。</span><span lang=\"en\">Monthly.</span></dd>   <dt class=\"term__item\">LIFETIME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通期です。</span><span lang=\"en\">Lifetime.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceInventoryUnit {
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  MONTHLY("MONTHLY"),
  
  LIFETIME("LIFETIME"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceInventoryUnit(String value) {
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
  public static GuaranteedInventoryServiceInventoryUnit fromValue(String value) {
    for (GuaranteedInventoryServiceInventoryUnit b : GuaranteedInventoryServiceInventoryUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

