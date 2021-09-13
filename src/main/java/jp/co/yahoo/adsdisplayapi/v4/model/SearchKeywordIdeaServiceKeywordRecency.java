package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SearchKeywordIdeaServiceKeywordRecencyは、サーチキーワードの有効期間を表します。</div> <div lang=\"en\">SearchKeywordIdeaServiceKeywordRecency is an object for storing the effective period information of Search Keyword.</div> <dl class=term>   <dt class=\"term__item\">WITHIN_1DAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日以内です。</span><span lang=\"en\">within one day</span></dd>   <dt class=\"term__item\">WITHIN_3DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">3日以内です。</span><span lang=\"en\">for three days</span></dd>   <dt class=\"term__item\">WITHIN_7DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">7日以内です。</span><span lang=\"en\">for seven days</span></dd>   <dt class=\"term__item\">WITHIN_14DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">14日以内です。</span><span lang=\"en\">for fourteen days</span></dd>   <dt class=\"term__item\">WITHIN_30DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">30日以内です。</span><span lang=\"en\">for thirty days</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordIdeaServiceKeywordRecency {
  
  WITHIN_1DAY("WITHIN_1DAY"),
  
  WITHIN_3DAYS("WITHIN_3DAYS"),
  
  WITHIN_7DAYS("WITHIN_7DAYS"),
  
  WITHIN_14DAYS("WITHIN_14DAYS"),
  
  WITHIN_30DAYS("WITHIN_30DAYS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordIdeaServiceKeywordRecency(String value) {
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
  public static SearchKeywordIdeaServiceKeywordRecency fromValue(String value) {
    for (SearchKeywordIdeaServiceKeywordRecency b : SearchKeywordIdeaServiceKeywordRecency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

