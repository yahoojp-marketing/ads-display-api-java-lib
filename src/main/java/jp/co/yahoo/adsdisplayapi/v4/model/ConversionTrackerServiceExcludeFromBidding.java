package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceExcludeFromBiddingは、自動入札においての使用有無を表します。<br> このフィールドは、リクエストの場合は省略可能です。ADD時のデフォルト設定値はFALSEとなります。 </div> <div lang=\"en\"> ConversionTrackerServiceExcludeFromBidding displays use or not for auto bidding.<br> This field is optional in requests. The default value in ADD operation will be FALSE. </div> <dl class=term>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">使用します。</span><span lang=\"en\">Include.</span></dd>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">使用しません。</span><span lang=\"en\">Exclude.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceExcludeFromBidding {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceExcludeFromBidding(String value) {
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
  public static ConversionTrackerServiceExcludeFromBidding fromValue(String value) {
    for (ConversionTrackerServiceExcludeFromBidding b : ConversionTrackerServiceExcludeFromBidding.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

