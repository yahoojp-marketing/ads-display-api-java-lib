package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceEnterpriseTypeは、企業形態を表します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。<br> ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。 </div> <div lang=\"en\"> AccountManagementServiceEnterpriseType object describes type of enterprise.<br> This field is required in ADD operation, and will be ignored in SET operation.<br> * When clientType is \"SELF\", this field will be ignored in ADD and SET operations. </div> <dl class=term>   <dt class=\"term__item\">KABUSHIKI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">株式会社</span><span lang=\"en\">KABUSHIKI</span></dd>   <dt class=\"term__item\">YUGEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">有限会社</span><span lang=\"en\">YUGEN</span></dd>   <dt class=\"term__item\">GOSI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">合資会社</span><span lang=\"en\">GOSI</span></dd>   <dt class=\"term__item\">ZAIDAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">財団法人</span><span lang=\"en\">ZAIDAN</span></dd>   <dt class=\"term__item\">SYADAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">社団法人</span><span lang=\"en\">SYADAN</span></dd>   <dt class=\"term__item\">SYUKYO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">宗教法人</span><span lang=\"en\">SYUKYO</span></dd>   <dt class=\"term__item\">GAKKO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">学校法人</span><span lang=\"en\">GAKKO</span></dd>   <dt class=\"term__item\">KOJIN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">個人事業主</span><span lang=\"en\">KOJIN</span></dd>   <dt class=\"term__item\">OTHER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他法人</span><span lang=\"en\">OTHER</span></dd>   <dt class=\"term__item\">GOMEI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">合名会社</span><span lang=\"en\">GOMEI</span></dd>   <dt class=\"term__item\">HIEIRI</dt>   <dd class=\"term__desc\"><span lang=\"ja\">特定非営利活動法人</span><span lang=\"en\">HIEIRI</span></dd>   <dt class=\"term__item\">GODO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">合同会社</span><span lang=\"en\">GODO</span></dd>   <dt class=\"term__item\">KYODO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">協同組合</span><span lang=\"en\">KYODO</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountManagementServiceEnterpriseType {
  
  KABUSHIKI("KABUSHIKI"),
  
  YUGEN("YUGEN"),
  
  GOSI("GOSI"),
  
  ZAIDAN("ZAIDAN"),
  
  SYADAN("SYADAN"),
  
  SYUKYO("SYUKYO"),
  
  GAKKO("GAKKO"),
  
  KOJIN("KOJIN"),
  
  OTHER("OTHER"),
  
  GOMEI("GOMEI"),
  
  HIEIRI("HIEIRI"),
  
  GODO("GODO"),
  
  KYODO("KYODO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceEnterpriseType(String value) {
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
  public static AccountManagementServiceEnterpriseType fromValue(String value) {
    for (AccountManagementServiceEnterpriseType b : AccountManagementServiceEnterpriseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

