package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountLinkServiceLinkAccessPermissionは、アカウントリンクアクセス権限を表します。</div> <div lang=\"en\">AccountLinkServiceLinkAccessPermission displays the account link access permission.</div> <dl class=term>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全ての操作を許可します。</span><span lang=\"en\">Allows all operations.</span></dd>   <dt class=\"term__item\">READ_ONLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">参照のみ許可します。</span><span lang=\"en\">Only references are allowed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountLinkServiceLinkAccessPermission {
  
  ALL("ALL"),
  
  READ_ONLY("READ_ONLY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountLinkServiceLinkAccessPermission(String value) {
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
  public static AccountLinkServiceLinkAccessPermission fromValue(String value) {
    for (AccountLinkServiceLinkAccessPermission b : AccountLinkServiceLinkAccessPermission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

