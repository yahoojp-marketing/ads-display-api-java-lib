package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountTrackingUrlServiceIsRemoveFlgは、項目を削除するフラグです。<br> 設定値が「TRUE」の場合、設定されている値が無効になります。<br> SET時は省略可能となります。 </div> <div lang=\"en\"> AccountTrackingUrlServiceIsRemoveFlg is a flag for removing an information item.<br> If the set value is 'TRUE', the set value will be invalid.<br> This field is optional in SET operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">項目の削除。</span><span lang=\"en\">removes the information item.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">項目の削除なし。</span><span lang=\"en\">not remove the information item.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountTrackingUrlServiceIsRemoveFlg {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountTrackingUrlServiceIsRemoveFlg(String value) {
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
  public static AccountTrackingUrlServiceIsRemoveFlg fromValue(String value) {
    for (AccountTrackingUrlServiceIsRemoveFlg b : AccountTrackingUrlServiceIsRemoveFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

