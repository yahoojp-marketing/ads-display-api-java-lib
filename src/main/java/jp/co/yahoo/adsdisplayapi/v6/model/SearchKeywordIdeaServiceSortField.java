package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SearchKeywordIdeaServiceSortFieldオブジェクトは、ソート対象項目です。</div> <div lang=\"en\">SearchKeywordIdeaServiceSortField object is sorting item.</div> <dl class=term>   <dt class=\"term__item\">KEYWORD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードです。</span><span lang=\"en\">Keyword</span></dd>   <dt class=\"term__item\">KEYWORD_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードIDです。</span><span lang=\"en\">Keyword ID</span></dd>   <dt class=\"term__item\">DESKTOP_SEARCH_VOLUME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PCのリーチ数です。</span><span lang=\"en\">Reach Number of PC</span></dd>   <dt class=\"term__item\">SMART_PHONE_SEARCH_VOLUME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマホのリーチ数です。</span><span lang=\"en\">Reach Number of smart phone</span></dd>   <dt class=\"term__item\">TABLET_SEARCH_VOLUME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレットのリーチ数です。</span><span lang=\"en\">Reach Number of tablet</span></dd>   <dt class=\"term__item\">RELEASE_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワード追加日です。</span><span lang=\"en\">Date for keyword</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordIdeaServiceSortField {
  
  KEYWORD("KEYWORD"),
  
  KEYWORD_ID("KEYWORD_ID"),
  
  DESKTOP_SEARCH_VOLUME("DESKTOP_SEARCH_VOLUME"),
  
  SMART_PHONE_SEARCH_VOLUME("SMART_PHONE_SEARCH_VOLUME"),
  
  TABLET_SEARCH_VOLUME("TABLET_SEARCH_VOLUME"),
  
  RELEASE_DATE("RELEASE_DATE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordIdeaServiceSortField(String value) {
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
  public static SearchKeywordIdeaServiceSortField fromValue(String value) {
    for (SearchKeywordIdeaServiceSortField b : SearchKeywordIdeaServiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

