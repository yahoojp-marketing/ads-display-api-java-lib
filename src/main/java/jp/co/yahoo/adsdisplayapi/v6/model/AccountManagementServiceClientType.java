package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceClientTypeは、クライアント種別を表します。<br> このフィールドは、ADD時に必須となり、SET時に無視されます。 </div> <div lang=\"en\"> AccountManagementServiceClientType object describes the type of client.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> <dl class=term>   <dt class=\"term__item\">AGENT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">代理出稿</span><span lang=\"en\">AGENT</span></dd>   <dt class=\"term__item\">SELF</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自社出稿</span><span lang=\"en\">SELF</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServiceClientType {
  
  AGENT("AGENT"),
  
  SELF("SELF"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceClientType(String value) {
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
  public static AccountManagementServiceClientType fromValue(String value) {
    for (AccountManagementServiceClientType b : AccountManagementServiceClientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

