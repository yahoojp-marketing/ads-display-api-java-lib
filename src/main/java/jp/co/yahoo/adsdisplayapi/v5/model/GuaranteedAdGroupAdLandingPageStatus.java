package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedAdGroupAdLandingPageStatusは、リンク先ページのステータスです。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdLandingPageStatus describes the status of the landing page.<br> </div> <dl class=term>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完成/公開済み</span><span lang=\"en\">Completed/Published</span></dd>   <dt class=\"term__item\">SPECIFIED_UPDATE_SCHEDULED_TIME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">公開日時を指定中(後日更新/公開予定)</span><span lang=\"en\">The release date is being specified (will be updated and released later)</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedAdGroupAdLandingPageStatus {
  
  COMPLETED("COMPLETED"),
  
  SPECIFIED_UPDATE_SCHEDULED_TIME("SPECIFIED_UPDATE_SCHEDULED_TIME"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedAdGroupAdLandingPageStatus(String value) {
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
  public static GuaranteedAdGroupAdLandingPageStatus fromValue(String value) {
    for (GuaranteedAdGroupAdLandingPageStatus b : GuaranteedAdGroupAdLandingPageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

