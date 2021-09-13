package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> FeedFtpServiceScheduleWeekは、曜日を表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> FeedFtpServiceScheduleWeek serves the days of the week.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">SUN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日曜日です。</span><span lang=\"en\">Sunday</span></dd>   <dt class=\"term__item\">MON</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月曜日です。</span><span lang=\"en\">Monday</span></dd>   <dt class=\"term__item\">TUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">火曜日です。</span><span lang=\"en\">Tuesday</span></dd>   <dt class=\"term__item\">WED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">水曜日です。</span><span lang=\"en\">Wednesday</span></dd>   <dt class=\"term__item\">THU</dt>   <dd class=\"term__desc\"><span lang=\"ja\">木曜日です。</span><span lang=\"en\">Thursday</span></dd>   <dt class=\"term__item\">FRI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">金曜日です。</span><span lang=\"en\">Friday</span></dd>   <dt class=\"term__item\">SAT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">土曜日です。</span><span lang=\"en\">Saturday</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedFtpServiceScheduleWeek {
  
  SUN("SUN"),
  
  MON("MON"),
  
  TUE("TUE"),
  
  WED("WED"),
  
  THU("THU"),
  
  FRI("FRI"),
  
  SAT("SAT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedFtpServiceScheduleWeek(String value) {
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
  public static FeedFtpServiceScheduleWeek fromValue(String value) {
    for (FeedFtpServiceScheduleWeek b : FeedFtpServiceScheduleWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

