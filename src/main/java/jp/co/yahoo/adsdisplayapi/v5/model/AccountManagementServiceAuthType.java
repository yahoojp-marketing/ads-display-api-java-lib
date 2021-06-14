package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">権限タイプです。</div> <div lang=\"en\">Access roles.</div> <dl class=term>   <dt class=\"term__item\">REFERABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">参照権限です。</span><span lang=\"en\">Read-only</span></dd>   <dt class=\"term__item\">UPDATABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">更新権限です。</span><span lang=\"en\">Write</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountManagementServiceAuthType {
  
  REFERABLE("REFERABLE"),
  
  UPDATABLE("UPDATABLE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceAuthType(String value) {
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
  public static AccountManagementServiceAuthType fromValue(String value) {
    for (AccountManagementServiceAuthType b : AccountManagementServiceAuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

