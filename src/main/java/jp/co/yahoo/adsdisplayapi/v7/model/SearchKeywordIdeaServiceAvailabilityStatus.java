package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SearchKeywordIdeaServiceAvailabilityStatusオブジェクトは、サーチターゲティング対象キーワードの利用可否を表します。</div> <div lang=\"en\">SearchKeywordIdeaServiceAvailabilityStatus object is the availability of keywords for search targeting.</div> <dl class=term>   <dt class=\"term__item\">AVAILABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用可です。</span><span lang=\"en\">Available</span></dd>   <dt class=\"term__item\">UNAVAILABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用不可です。</span><span lang=\"en\">Unavailable</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SearchKeywordIdeaServiceAvailabilityStatus {
  
  AVAILABLE("AVAILABLE"),
  
  UNAVAILABLE("UNAVAILABLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SearchKeywordIdeaServiceAvailabilityStatus(String value) {
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
  public static SearchKeywordIdeaServiceAvailabilityStatus fromValue(String value) {
    for (SearchKeywordIdeaServiceAvailabilityStatus b : SearchKeywordIdeaServiceAvailabilityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

