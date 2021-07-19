package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceCountingTypeは、コンバージョンの計測方法を表します。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> ConversionTrackerServiceCountingType displays conversion measurement method.<br> This field is optional in requests. </div> <dl class=term>   <dt class=\"term__item\">ONE_PER_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ユニークコンバージョンです。</span><span lang=\"en\">Unique conversion.</span></dd>   <dt class=\"term__item\">MANY_PER_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">総コンバージョンです。</span><span lang=\"en\">Total conversion.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceCountingType {
  
  ONE_PER_CLICK("ONE_PER_CLICK"),
  
  MANY_PER_CLICK("MANY_PER_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceCountingType(String value) {
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
  public static ConversionTrackerServiceCountingType fromValue(String value) {
    for (ConversionTrackerServiceCountingType b : ConversionTrackerServiceCountingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

