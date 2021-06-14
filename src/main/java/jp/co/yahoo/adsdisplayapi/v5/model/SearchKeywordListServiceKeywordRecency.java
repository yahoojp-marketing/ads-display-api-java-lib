package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> SearchKeywordListServiceKeywordRecencyは、サーチキーワードの有効期間を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時のデフォルト設定値はWITHIN_30DAYSとなります。 </div> <div lang=\"en\"> SearchKeywordListServiceKeywordRecency is an object for storing the effective period information of Search Keyword.<br> This field is optional in ADD and SET operation. <br> *The default value in ADD operation will be WITHIN_30DAYS. </div> <dl class=term>   <dt class=\"term__item\">WITHIN_1DAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日以内。</span><span lang=\"en\">within one day</span></dd>   <dt class=\"term__item\">WITHIN_3DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">3日以内。</span><span lang=\"en\">for three days</span></dd>   <dt class=\"term__item\">WITHIN_7DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">7日以内。</span><span lang=\"en\">for seven days</span></dd>   <dt class=\"term__item\">WITHIN_14DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">14日以内。</span><span lang=\"en\">for fourteen days</span></dd>   <dt class=\"term__item\">WITHIN_30DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">30日以内。</span><span lang=\"en\">for thirty days</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordListServiceKeywordRecency {
  
  WITHIN_1DAY("WITHIN_1DAY"),
  
  WITHIN_3DAYS("WITHIN_3DAYS"),
  
  WITHIN_7DAYS("WITHIN_7DAYS"),
  
  WITHIN_14DAYS("WITHIN_14DAYS"),
  
  WITHIN_30DAYS("WITHIN_30DAYS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordListServiceKeywordRecency(String value) {
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
  public static SearchKeywordListServiceKeywordRecency fromValue(String value) {
    for (SearchKeywordListServiceKeywordRecency b : SearchKeywordListServiceKeywordRecency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

