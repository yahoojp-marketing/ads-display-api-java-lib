package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountLinkServiceRetargetingListSharingEnabledは、リターゲティングリスト共有が有効なリンクかどうかを表します。<br> </div> <div lang=\"en\"> AccountLinkServiceRetargetingListSharingEnabled describes whether the link is valid for the sharing of retargeting list.<br> </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リターゲティングリスト共有が有効なリンクです。</span><span lang=\"en\">Retargeting list sharing is a enable.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リターゲティングリスト共有が無効なリンクです。</span><span lang=\"en\">Retargeting list sharing is a disable.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountLinkServiceRetargetingListSharingEnabled {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceRetargetingListSharingEnabled(String value) {
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
  public static AccountLinkServiceRetargetingListSharingEnabled fromValue(String value) {
    for (AccountLinkServiceRetargetingListSharingEnabled b : AccountLinkServiceRetargetingListSharingEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

