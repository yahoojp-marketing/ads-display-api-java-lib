package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> 定期アップロードのスケジュールタイプです。<br> ADD時およびSET時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedFtpServiceScheduleType displays the schedule type of Periodic Upload.<br> This field is required in ADD and SET operation. </div> <dl class=term>   <dt class=\"term__item\">HOURLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">時間</span><span lang=\"en\">Hourly</span></dd>   <dt class=\"term__item\">DAILY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">毎日</span><span lang=\"en\">Daily</span></dd>   <dt class=\"term__item\">WEEKLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">毎週</span><span lang=\"en\">Weekly</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedFtpServiceScheduleType {
  
  HOURLY("HOURLY"),
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedFtpServiceScheduleType(String value) {
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
  public static FeedFtpServiceScheduleType fromValue(String value) {
    for (FeedFtpServiceScheduleType b : FeedFtpServiceScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

