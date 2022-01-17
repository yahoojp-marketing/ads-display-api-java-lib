package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountLinkServiceAudienceListSharingEnabledは、オーディエンスリスト共有が有効なリンクかどうかを表します。<br> </div> <div lang=\"en\"> AccountLinkServiceAudienceListSharingEnabled describes whether the link is valid for the sharing of audience list.<br> </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスリスト共有が有効なリンクです。</span><span lang=\"en\">Audience list sharing is a enable.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オーディエンスリスト共有が無効なリンクです。</span><span lang=\"en\">Audience list sharing is a disable.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountLinkServiceAudienceListSharingEnabled {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceAudienceListSharingEnabled(String value) {
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
  public static AccountLinkServiceAudienceListSharingEnabled fromValue(String value) {
    for (AccountLinkServiceAudienceListSharingEnabled b : AccountLinkServiceAudienceListSharingEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

