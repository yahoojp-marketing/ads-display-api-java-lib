package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> SearchKeywordListServiceKeywordFrequencyは、サーチキーワードの検索回数を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時のデフォルト設定値はONCE_OR_MOREとなります。 </div> <div lang=\"en\"> SearchKeywordListServiceKeywordFrequency is an object for storing the search frequency information on Search Keyword.<br> This field is optional in ADD and SET operation. <br> *The default value in ADD operation will be ONCE_OR_MORE. </div> <dl class=term>   <dt class=\"term__item\">ONCE_OR_MORE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1回以上。</span><span lang=\"en\">once or more</span></dd>   <dt class=\"term__item\">TWICE_OR_MORE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">2回以上。</span><span lang=\"en\">twice or more</span></dd>   <dt class=\"term__item\">THREE_TIMES_OR_MORE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">3回以上。</span><span lang=\"en\">three times or more</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordListServiceKeywordFrequency {
  
  ONCE_OR_MORE("ONCE_OR_MORE"),
  
  TWICE_OR_MORE("TWICE_OR_MORE"),
  
  THREE_TIMES_OR_MORE("THREE_TIMES_OR_MORE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordListServiceKeywordFrequency(String value) {
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
  public static SearchKeywordListServiceKeywordFrequency fromValue(String value) {
    for (SearchKeywordListServiceKeywordFrequency b : SearchKeywordListServiceKeywordFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

