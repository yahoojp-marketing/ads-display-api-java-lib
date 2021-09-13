package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceDisplayUrlLevelは、表示するURLの階層を表します。<br> キャンペーン目的「アプリ訴求」の場合はdisplayUrlLevelは無視されます。<br> SET時にurlを指定する場合、このフィールドの値はクリアされます。 <br>※現在利用できません </div> <div lang=\"en\"> AdGroupAdServiceDisplayUrlLevel describes a level of URL to display.<br> If campaignGoal is APP_PROMOTION, displayUrlLevel will be ignored.<br> If url is specified in SET operation, the value in this field will be cleared. <br>* Not Available. </div> <dl class=term>   <dt class=\"term__item\">DOMAIN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ドメイン</span><span lang=\"en\">Domain</span></dd>   <dt class=\"term__item\">FIRST_LEVEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">第一階層</span><span lang=\"en\">First level</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceDisplayUrlLevel {
  
  DOMAIN("DOMAIN"),
  
  FIRST_LEVEL("FIRST_LEVEL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceDisplayUrlLevel(String value) {
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
  public static AdGroupAdServiceDisplayUrlLevel fromValue(String value) {
    for (AdGroupAdServiceDisplayUrlLevel b : AdGroupAdServiceDisplayUrlLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

