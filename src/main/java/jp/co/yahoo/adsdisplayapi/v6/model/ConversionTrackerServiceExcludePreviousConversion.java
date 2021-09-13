package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceExcludePreviousConversionは、コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョントラッカー情報をを除外するかどうかを表すフラグです。<br> このフィールドは、リクエストの場合は省略可能です。GET時のデフォルト設定値はFALSEとなります。<br> *コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョントラッカー情報は、キャンペーンに紐づけることはできません。 </div> <div lang=\"en\"> ConversionTrackerServiceExcludePreviousConversion is a flag that indicates whether to include conversion tracker information that includes conversion tag which conversion label is not set.<br> This field is optional in requests. The default value in GET operation will be FALSE.<br> Conversion tracker information including previous conversion tags cannot be linked to a campaign. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンラベルが設定されていないコンバージョンタグを除外します。</span><span lang=\"en\">Exclude conversion tags which conversion label is not set.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンラベルが設定されていないコンバージョンタグを除外しません。</span><span lang=\"en\">Does not Exclude conversion tags which conversion label is not set.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceExcludePreviousConversion {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceExcludePreviousConversion(String value) {
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
  public static ConversionTrackerServiceExcludePreviousConversion fromValue(String value) {
    for (ConversionTrackerServiceExcludePreviousConversion b : ConversionTrackerServiceExcludePreviousConversion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

