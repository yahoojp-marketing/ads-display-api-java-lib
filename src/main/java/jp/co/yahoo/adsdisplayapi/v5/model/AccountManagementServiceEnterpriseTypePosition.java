package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceEnterpriseTypePositionは、企業形態の位置を表します。<br> このフィールドは、ADD時に省略可能となり、SET時は無視されます。<br> ※ADD時、enterpriseTypeがKOJIN（個人事業主）またはOTHER（その他法人）の場合は設定できません。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> AccountManagementServiceEnterpriseTypePosition describes the position of enterprise type.<br> This field is optional in ADD operation, and will be ignored in SET operation.<br> * Cannot be set when enterpriseType is KOJIN or OTHER in ADD operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> <dl class=term>   <dt class=\"term__item\">FRONT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">会社名の前です。</span><span lang=\"en\">Enterprise type is placed before the company name.</span></dd>   <dt class=\"term__item\">BACK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">会社名の後ろです。</span><span lang=\"en\">Enterprise type is placed after the company name.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServiceEnterpriseTypePosition {
  
  FRONT("FRONT"),
  
  BACK("BACK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceEnterpriseTypePosition(String value) {
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
  public static AccountManagementServiceEnterpriseTypePosition fromValue(String value) {
    for (AccountManagementServiceEnterpriseTypePosition b : AccountManagementServiceEnterpriseTypePosition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

