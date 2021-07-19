package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> 商品リストファイルアップロード時の取り込み種別です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> FeedFtpServiceItemListUploadType object displays the upload type of Item List file.<br> This field is required in ADD operation, and will be optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">UPDATE_PART</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分更新</span><span lang=\"en\">Update partially.</span></dd>   <dt class=\"term__item\">UPDATE_ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全件更新</span><span lang=\"en\">Update all.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedFtpServiceItemListUploadType {
  
  UPDATE_PART("UPDATE_PART"),
  
  UPDATE_ALL("UPDATE_ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedFtpServiceItemListUploadType(String value) {
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
  public static FeedFtpServiceItemListUploadType fromValue(String value) {
    for (FeedFtpServiceItemListUploadType b : FeedFtpServiceItemListUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

