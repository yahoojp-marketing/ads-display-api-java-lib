package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> コンバージョントラッカー情報のステータスを表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> It shows ConversionTracker status.<br> This field is required in ADD operation, and will be optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">ENABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョントラッカーを使用できます。</span><span lang=\"en\">Can use Conversion Tracker.</span></dd>   <dt class=\"term__item\">DISABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョントラッカーを使用できません。</span><span lang=\"en\">Cannot use Conversion Tracker.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceStatus {
  
  ENABLED("ENABLED"),
  
  DISABLED("DISABLED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceStatus(String value) {
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
  public static ConversionTrackerServiceStatus fromValue(String value) {
    for (ConversionTrackerServiceStatus b : ConversionTrackerServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

