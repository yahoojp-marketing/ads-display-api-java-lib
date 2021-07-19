package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountServiceIsTestAccountはテストアカウントかどうかを表します。<br> MCCアカウントの場合、このフィールドは<code>FALSE</code>になります。</div> <div lang=\"en\">AccountServiceIsTestAccount indicates whether it is a test account.<br> If isManagerAccount is \"TRUE\", this field will be <code>FALSE</code>.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テストアカウント</span><span lang=\"en\">Test account.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Productionアカウント(テストアカウントではありません)</span><span lang=\"en\">Production (non-test) account.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceIsTestAccount {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceIsTestAccount(String value) {
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
  public static AccountServiceIsTestAccount fromValue(String value) {
    for (AccountServiceIsTestAccount b : AccountServiceIsTestAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

