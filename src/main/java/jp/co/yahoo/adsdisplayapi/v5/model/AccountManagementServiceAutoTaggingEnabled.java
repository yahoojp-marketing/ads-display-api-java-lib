package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AccountManagementServiceAutoTaggingEnabledは、自動タグ設定をするかしないかの管理フラグです。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値はTRUEとなります。 </div> <div lang=\"en\"> AccountManagementServiceAutoTaggingEnabled is management flag for whether or not to set auto tag.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be TRUE. </div> <dl class=term>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">しない</span><span lang=\"en\">not setting.</span></dd>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">する</span><span lang=\"en\">setting.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum AccountManagementServiceAutoTaggingEnabled {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceAutoTaggingEnabled(String value) {
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
  public static AccountManagementServiceAutoTaggingEnabled fromValue(String value) {
    for (AccountManagementServiceAutoTaggingEnabled b : AccountManagementServiceAutoTaggingEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

