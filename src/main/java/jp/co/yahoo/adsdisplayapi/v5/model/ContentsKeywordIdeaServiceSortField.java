package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ContentsKeywordIdeaServiceSortFieldオブジェクトは、ソート対象項目です。</div> <div lang=\"en\">ContentsKeywordIdeaServiceSortField object is sorting item.</div> <dl class=term>   <dt class=\"term__item\">KEYWORD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードです。</span><span lang=\"en\">Keyword</span></dd>   <dt class=\"term__item\">KEYWORD_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードIDです。</span><span lang=\"en\">Keyword ID</span></dd>   <dt class=\"term__item\">SEARCH_VOLUME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リーチ数です。</span><span lang=\"en\">Reach Number</span></dd>   <dt class=\"term__item\">CREATED_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワード作成日です。</span><span lang=\"en\">Date for keyword</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ContentsKeywordIdeaServiceSortField {
  
  KEYWORD("KEYWORD"),
  
  KEYWORD_ID("KEYWORD_ID"),
  
  SEARCH_VOLUME("SEARCH_VOLUME"),
  
  CREATED_DATE("CREATED_DATE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ContentsKeywordIdeaServiceSortField(String value) {
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
  public static ContentsKeywordIdeaServiceSortField fromValue(String value) {
    for (ContentsKeywordIdeaServiceSortField b : ContentsKeywordIdeaServiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

