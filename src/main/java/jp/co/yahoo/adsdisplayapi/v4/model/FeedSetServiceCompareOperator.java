package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> 商品セットの設定条件です。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> FeedSetServiceCompareOperator object describes setting conditions of Item Set.<br> This field is required in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">EQUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致</span><span lang=\"en\">Exact match</span></dd>   <dt class=\"term__item\">NOT_EQUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外</span><span lang=\"en\">Exclude</span></dd>   <dt class=\"term__item\">GREATER_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">以上</span><span lang=\"en\">Greater than or equals</span></dd>   <dt class=\"term__item\">LESS_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">以下</span><span lang=\"en\">Less than or equals</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedSetServiceCompareOperator {
  
  EQUAL("EQUAL"),
  
  NOT_EQUAL("NOT_EQUAL"),
  
  GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
  
  LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedSetServiceCompareOperator(String value) {
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
  public static FeedSetServiceCompareOperator fromValue(String value) {
    for (FeedSetServiceCompareOperator b : FeedSetServiceCompareOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

