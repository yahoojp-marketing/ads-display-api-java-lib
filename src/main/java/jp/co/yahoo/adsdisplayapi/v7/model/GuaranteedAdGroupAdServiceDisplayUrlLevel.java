package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> GuaranteedAdGroupAdServiceDisplayUrlLevelは、表示するURLの階層を表します。<br> ADDおよびSET時にfinalUrlを指定する場合、このフィールドは必須となります。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceDisplayUrlLevel describes a level of URL to display.<br> If finalUrl is specified in ADD and SET operation, this field is required.<br> * Not Available. </div> <dl class=term>   <dt class=\"term__item\">DOMAIN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ドメイン</span><span lang=\"en\">Domain</span></dd>   <dt class=\"term__item\">FIRST_LEVEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">第一階層</span><span lang=\"en\">First level</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum GuaranteedAdGroupAdServiceDisplayUrlLevel {
  
  DOMAIN("DOMAIN"),
  
  FIRST_LEVEL("FIRST_LEVEL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  GuaranteedAdGroupAdServiceDisplayUrlLevel(String value) {
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
  public static GuaranteedAdGroupAdServiceDisplayUrlLevel fromValue(String value) {
    for (GuaranteedAdGroupAdServiceDisplayUrlLevel b : GuaranteedAdGroupAdServiceDisplayUrlLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

