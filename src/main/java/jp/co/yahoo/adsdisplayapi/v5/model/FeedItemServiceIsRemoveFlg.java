package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> FeedItemServiceIsRemoveFlgは、項目を削除するフラグです。<br> 設定値が「TRUE」の場合、設定されている値が無効になります。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> FeedItemServiceIsRemoveFlg is a flag for removing an information item.<br> If the set value is 'TRUE', the set value will be invalid.<br> This field is optional in requests. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">項目の削除です。</span><span lang=\"en\">removes the information item.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">項目の削除なしです。</span><span lang=\"en\">not remove the information item.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum FeedItemServiceIsRemoveFlg {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceIsRemoveFlg(String value) {
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
  public static FeedItemServiceIsRemoveFlg fromValue(String value) {
    for (FeedItemServiceIsRemoveFlg b : FeedItemServiceIsRemoveFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

