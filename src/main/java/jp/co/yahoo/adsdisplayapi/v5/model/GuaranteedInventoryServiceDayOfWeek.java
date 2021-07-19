package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">GuaranteedInventoryServiceDayOfWeekは、配信する曜日を表します。</div> <div lang=\"en\">GuaranteedInventoryServiceDayOfWeek serves the days of the week for delivery.</div> <dl class=term>   <dt class=\"term__item\">MONDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月曜日です。</span><span lang=\"en\">Monday</span></dd>   <dt class=\"term__item\">TUESDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">火曜日です。</span><span lang=\"en\">Tuesday</span></dd>   <dt class=\"term__item\">WEDNESDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">水曜日です。</span><span lang=\"en\">Wednesday</span></dd>   <dt class=\"term__item\">THURSDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">木曜日です。</span><span lang=\"en\">Thursday</span></dd>   <dt class=\"term__item\">FRIDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">金曜日です。</span><span lang=\"en\">Friday</span></dd>   <dt class=\"term__item\">SATURDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">土曜日です。</span><span lang=\"en\">Saturday</span></dd>   <dt class=\"term__item\">SUNDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日曜日です。</span><span lang=\"en\">Sunday</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedInventoryServiceDayOfWeek {
  
  MONDAY("MONDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY"),
  
  THURSDAY("THURSDAY"),
  
  FRIDAY("FRIDAY"),
  
  SATURDAY("SATURDAY"),
  
  SUNDAY("SUNDAY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedInventoryServiceDayOfWeek(String value) {
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
  public static GuaranteedInventoryServiceDayOfWeek fromValue(String value) {
    for (GuaranteedInventoryServiceDayOfWeek b : GuaranteedInventoryServiceDayOfWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
