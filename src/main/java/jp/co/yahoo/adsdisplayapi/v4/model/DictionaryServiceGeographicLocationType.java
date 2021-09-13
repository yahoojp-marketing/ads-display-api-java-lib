package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">DictionaryServiceGeographicLocationTypeは、地域情報の種別を表します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationType describes the type of location information.</div> <dl class=term>   <dt class=\"term__item\">TARGETING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲティング用です。</span><span lang=\"en\">For Targeting</span></dd>   <dt class=\"term__item\">FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Feedの商品情報用です。</span><span lang=\"en\">For Feed product information</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum DictionaryServiceGeographicLocationType {
  
  TARGETING("TARGETING"),
  
  FEED("FEED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DictionaryServiceGeographicLocationType(String value) {
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
  public static DictionaryServiceGeographicLocationType fromValue(String value) {
    for (DictionaryServiceGeographicLocationType b : DictionaryServiceGeographicLocationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

