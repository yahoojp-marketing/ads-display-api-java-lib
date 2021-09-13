package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SearchKeywordIdeaServiceSortTypeオブジェクトは、ソート方法を表します。</div> <div lang=\"en\">SearchKeywordIdeaServiceSortType object is sorting method.</div> <dl class=term>   <dt class=\"term__item\">ASC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">昇順です。</span><span lang=\"en\">Ascending order</span></dd>   <dt class=\"term__item\">DESC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">降順です。</span><span lang=\"en\">Descending order</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordIdeaServiceSortType {
  
  ASC("ASC"),
  
  DESC("DESC"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordIdeaServiceSortType(String value) {
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
  public static SearchKeywordIdeaServiceSortType fromValue(String value) {
    for (SearchKeywordIdeaServiceSortType b : SearchKeywordIdeaServiceSortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

