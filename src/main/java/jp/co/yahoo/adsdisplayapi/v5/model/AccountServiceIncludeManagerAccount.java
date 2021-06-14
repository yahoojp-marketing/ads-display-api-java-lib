package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountServiceIncludeManagerAccountオブジェクトは、取得するアカウントにMCCアカウントを含むかどうかを表します。</div> <div lang=\"en\">AccountServiceIncludeManagerAccount represents whether the account to be retrieved includes an MCC account.</div> <dl class=term>   <dt class=\"term__item\">ONLY_MANAGER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">MCCアカウントのみです。</span><span lang=\"en\">MCC account only.</span></dd>   <dt class=\"term__item\">EXCLUDE_MANAGER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">MCCアカウントを除外します。</span><span lang=\"en\">Exclude MCC accounts.</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">全てのアカウントです。</span><span lang=\"en\">All accounts.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceIncludeManagerAccount {
  
  ONLY_MANAGER("ONLY_MANAGER"),
  
  EXCLUDE_MANAGER("EXCLUDE_MANAGER"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceIncludeManagerAccount(String value) {
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
  public static AccountServiceIncludeManagerAccount fromValue(String value) {
    for (AccountServiceIncludeManagerAccount b : AccountServiceIncludeManagerAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

