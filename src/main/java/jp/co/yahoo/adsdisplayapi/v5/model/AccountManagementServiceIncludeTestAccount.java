package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">取得アカウント制御</div> <div lang=\"en\">Control which accounts are retrieved.</div> <dl class=term>   <dt class=\"term__item\">ONLY_TEST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テストアカウントのみ</span><span lang=\"en\">Test account only.</span></dd>   <dt class=\"term__item\">EXCLUDE_TEST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テストアカウントを除外</span><span lang=\"en\">Exclude test accounts.</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全てのアカウント</span><span lang=\"en\">All accounts.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountManagementServiceIncludeTestAccount {
  
  ONLY_TEST("ONLY_TEST"),
  
  EXCLUDE_TEST("EXCLUDE_TEST"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceIncludeTestAccount(String value) {
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
  public static AccountManagementServiceIncludeTestAccount fromValue(String value) {
    for (AccountManagementServiceIncludeTestAccount b : AccountManagementServiceIncludeTestAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

