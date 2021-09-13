package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceIsPreviousConversionは、コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョントラッカー情報を含むかどうかを表すフラグです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *コンバージョンラベルが設定されていないコンバージョンタグを含むコンバージョントラッカー情報は、キャンペーンに紐づけることはできません。 </div> <div lang=\"en\"> ConversionTrackerServiceIsPreviousConversion is a flag that indicates whether to include conversion tracker information that includes conversion tag which conversion label is not set.<br> Although this field will be returned in the response, it will be ignored on input.<br> Conversion tracker information including previous conversion tags cannot be linked to a campaign. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンラベルが設定されていないコンバージョンタグを含みます。</span><span lang=\"en\">Includes conversion tags which conversion label is not set.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンラベルが設定されていないコンバージョンタグを含みません。</span><span lang=\"en\">Does not include conversion tags which conversion label is not set.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceIsPreviousConversion {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceIsPreviousConversion(String value) {
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
  public static ConversionTrackerServiceIsPreviousConversion fromValue(String value) {
    for (ConversionTrackerServiceIsPreviousConversion b : ConversionTrackerServiceIsPreviousConversion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

