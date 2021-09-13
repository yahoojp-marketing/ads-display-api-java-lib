package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceTypeは、コンバージョンの種別を表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> ConversionTrackerServiceType describes conversion type.<br> This field is required in requests. </div> <dl class=term>   <dt class=\"term__item\">WEB_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブコンバージョン</span><span lang=\"en\">Web page conversions</span></dd>   <dt class=\"term__item\">APP_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリコンバージョン</span><span lang=\"en\">Mobile app conversions</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceType {
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  APP_CONVERSION("APP_CONVERSION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceType(String value) {
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
  public static ConversionTrackerServiceType fromValue(String value) {
    for (ConversionTrackerServiceType b : ConversionTrackerServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

