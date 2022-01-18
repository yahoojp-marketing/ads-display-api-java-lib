package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> 在庫状況です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> FeedItemServiceAvailability describes stock status.<br> This field is optional in requests. </div> <dl class=term>   <dt class=\"term__item\">OUT_OF_STOCK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">在庫なしです。</span><span lang=\"en\">Out of stock</span></dd>   <dt class=\"term__item\">IN_STOCK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">在庫ありです。</span><span lang=\"en\">In stock</span></dd>   <dt class=\"term__item\">PREORDER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約です。</span><span lang=\"en\">Preorder</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceAvailability {
  
  OUT_OF_STOCK("OUT_OF_STOCK"),
  
  IN_STOCK("IN_STOCK"),
  
  PREORDER("PREORDER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceAvailability(String value) {
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
  public static FeedItemServiceAvailability fromValue(String value) {
    for (FeedItemServiceAvailability b : FeedItemServiceAvailability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

