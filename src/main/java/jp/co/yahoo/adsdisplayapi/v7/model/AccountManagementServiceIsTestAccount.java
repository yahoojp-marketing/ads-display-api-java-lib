package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceIsTestAccountは、テストアカウントかどうかを表すフラグです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AccountManagementServiceIsTestAccount describes whether the account is a test account or not.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テストアカウントです。</span><span lang=\"en\">Test account.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Productionアカウント(テストアカウントではありません)です。</span><span lang=\"en\">Production (non-test) account.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountManagementServiceIsTestAccount {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceIsTestAccount(String value) {
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
  public static AccountManagementServiceIsTestAccount fromValue(String value) {
    for (AccountManagementServiceIsTestAccount b : AccountManagementServiceIsTestAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

