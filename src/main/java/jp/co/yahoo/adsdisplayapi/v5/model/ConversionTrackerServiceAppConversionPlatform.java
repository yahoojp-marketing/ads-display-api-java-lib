package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceAppConversionPlatformは、アプリコンバージョンの対象プラットフォームを表します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceAppConversionPlatform displays a target platform of the app conversion.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> <dl class=term>   <dt class=\"term__item\">ITUNES</dt>   <dd class=\"term__desc\"><span lang=\"ja\">App Store</span><span lang=\"en\">App Store</span></dd>   <dt class=\"term__item\">ANDROID_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Google Play ストア</span><span lang=\"en\">Google Play Store</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceAppConversionPlatform {
  
  ITUNES("ITUNES"),
  
  ANDROID_MARKET("ANDROID_MARKET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceAppConversionPlatform(String value) {
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
  public static ConversionTrackerServiceAppConversionPlatform fromValue(String value) {
    for (ConversionTrackerServiceAppConversionPlatform b : ConversionTrackerServiceAppConversionPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

