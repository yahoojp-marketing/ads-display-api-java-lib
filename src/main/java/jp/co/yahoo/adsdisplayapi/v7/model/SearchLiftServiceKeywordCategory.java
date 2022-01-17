package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> SearchLiftServiceKeywordCategoryは、キーワードカテゴリを表します。 </div> <div lang=\"en\"> SearchLiftServiceKeywordCategory describes the keyword category. </div> <dl class=term>   <dt class=\"term__item\">BRAND</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ブランドです。</span><span lang=\"en\">Brand</span></dd>   <dt class=\"term__item\">SERVICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サービスです。</span><span lang=\"en\">Service</span></dd>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンです。</span><span lang=\"en\">Campaign</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchLiftServiceKeywordCategory {
  
  BRAND("BRAND"),
  
  SERVICE("SERVICE"),
  
  CAMPAIGN("CAMPAIGN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchLiftServiceKeywordCategory(String value) {
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
  public static SearchLiftServiceKeywordCategory fromValue(String value) {
    for (SearchLiftServiceKeywordCategory b : SearchLiftServiceKeywordCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

