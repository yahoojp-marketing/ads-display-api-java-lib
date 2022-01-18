package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">DictionaryServiceLangは、提供される一覧の言語選択を表します。</div> <div lang=\"en\">DictionaryServiceLang is a language selection of the list.</div> <dl class=term>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語です。</span><span lang=\"en\">English.</span></dd>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語です。</span><span lang=\"en\">Japanese.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum DictionaryServiceLang {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DictionaryServiceLang(String value) {
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
  public static DictionaryServiceLang fromValue(String value) {
    for (DictionaryServiceLang b : DictionaryServiceLang.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

