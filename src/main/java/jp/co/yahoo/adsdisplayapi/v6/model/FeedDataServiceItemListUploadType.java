package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">商品リストファイルアップロード時の取り込み種別です。</div> <div lang=\"en\">FeedDataServiceItemListUploadType object displays upload type of item list.</div> <dl class=term>   <dt class=\"term__item\">UPDATE_PART</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分更新</span><span lang=\"en\">Update Partially</span></dd>   <dt class=\"term__item\">UPDATE_ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全件更新</span><span lang=\"en\">Update All</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedDataServiceItemListUploadType {
  
  UPDATE_PART("UPDATE_PART"),
  
  UPDATE_ALL("UPDATE_ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedDataServiceItemListUploadType(String value) {
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
  public static FeedDataServiceItemListUploadType fromValue(String value) {
    for (FeedDataServiceItemListUploadType b : FeedDataServiceItemListUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

