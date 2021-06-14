package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceUploadUserListUploadTypeは、アップロードする方法の種類を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListUploadType displays kind of upload method.</div> <dl class=term>   <dt class=\"term__item\">IDFA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS端末用広告識別子です。</span><span lang=\"en\">Ad identifier for iOS devices.</span></li>   <dt class=\"term__item\">AAID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android端末用広告識別子です。</span><span lang=\"en\">Ad identifier for Android devices.</span></li>   <dt class=\"term__item\">MAIL_ADDRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ハッシュ化メールアドレスです。</span><span lang=\"en\">Hashed email address.</span></li>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceUploadUserListUploadType {
  
  IDFA("IDFA"),
  
  AAID("AAID"),
  
  MAIL_ADDRESS("MAIL_ADDRESS"),
  
  USERID("USERID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceUploadUserListUploadType(String value) {
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
  public static RetargetingListServiceUploadUserListUploadType fromValue(String value) {
    for (RetargetingListServiceUploadUserListUploadType b : RetargetingListServiceUploadUserListUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

