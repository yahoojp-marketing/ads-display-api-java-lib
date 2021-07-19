package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceUrlTypeは、申し込みURL種別を表します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。 </div> <div lang=\"en\"> AccountManagementServiceUrlType describes the type of application url.<br> This field is required in ADD operation, and will be ignored in SET operation. </div> <dl class=term>   <dt class=\"term__item\">PC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PCです。</span><span lang=\"en\">PC.</span></dd>   <dt class=\"term__item\">DOCOMO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ドコモです。</span><span lang=\"en\">Docomo.</span></dd>   <dt class=\"term__item\">KDDI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">auです。</span><span lang=\"en\">au.</span></dd>   <dt class=\"term__item\">SOFTBANK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ソフトバンクです。</span><span lang=\"en\">Softbank.</span></dd>   <dt class=\"term__item\">OTHER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他です。</span><span lang=\"en\">other.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServiceUrlType {
  
  PC("PC"),
  
  DOCOMO("DOCOMO"),
  
  KDDI("KDDI"),
  
  SOFTBANK("SOFTBANK"),
  
  SMART_PHONE("SMART_PHONE"),
  
  OTHER("OTHER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceUrlType(String value) {
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
  public static AccountManagementServiceUrlType fromValue(String value) {
    for (AccountManagementServiceUrlType b : AccountManagementServiceUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

