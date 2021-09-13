package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceAppConversionTypeは、アプリコンバージョンの計測タイプを表します。<br> このフィールドは、ADD時は省略可能となり、SET時は無視されます。ADD時のデフォルト設定値はFIRST_OPENとなります。 </div> <div lang=\"en\"> ConversionTrackerServiceAppConversionType displays type of counting conversions for app.<br> This field is optional in ADD operation, and will be ignored in SET operation. The default value in ADD operation will be FIRST_OPEN. </div> <dl class=term>   <dt class=\"term__item\">FIRST_OPEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリインストールのコンバージョン<br>※アプリキャンペーンではアプリの初回起動をアプリのインストールとして測定します。</span><span lang=\"en\">Conversion of app install<br>∗&#39;FIRST_OPEN&#39; will be counted as one conversion of app install for mobile app campaign, when the app first opened.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceAppConversionType {
  
  FIRST_OPEN("FIRST_OPEN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceAppConversionType(String value) {
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
  public static ConversionTrackerServiceAppConversionType fromValue(String value) {
    for (ConversionTrackerServiceAppConversionType b : ConversionTrackerServiceAppConversionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

