package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountServiceAutoTaggingEnabledは、自動タグ設定をするかしないかの管理フラグです。<br> SET時、このフィールドは省略可能となります。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。 </div> <div lang=\"en\"> AccountServiceAutoTaggingEnabled is management flag for whether or not to set auto tag.<br> This field is optional in SET operation.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request. </div> <dl class=term>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">しない</span><span lang=\"en\">not setting</span></dd>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">する</span><span lang=\"en\">setting</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceAutoTaggingEnabled {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceAutoTaggingEnabled(String value) {
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
  public static AccountServiceAutoTaggingEnabled fromValue(String value) {
    for (AccountServiceAutoTaggingEnabled b : AccountServiceAutoTaggingEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

