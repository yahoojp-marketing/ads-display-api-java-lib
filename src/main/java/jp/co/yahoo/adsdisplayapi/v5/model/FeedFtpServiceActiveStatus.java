package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> FTPスケジュールの有効/無効を表します。<br> このフィールドは、リクエストの場合は省略可能です。<br> ADD時のデフォルト設定値はACTIVEとなります。 </div> <div lang=\"en\"> FeedFtpServiceActiveStatus object displays status of FTP schedule.<br> This field is optional in requests.<br> The default value in ADD operation will be ACTIVE. </div> <ht> <dl class=term>   <dt class=\"term__item\">INACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">無効</span><span lang=\"en\">Inactive</span></dd>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">有効</span><span lang=\"en\">Active</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedFtpServiceActiveStatus {
  
  INACTIVE("INACTIVE"),
  
  ACTIVE("ACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedFtpServiceActiveStatus(String value) {
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
  public static FeedFtpServiceActiveStatus fromValue(String value) {
    for (FeedFtpServiceActiveStatus b : FeedFtpServiceActiveStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

