package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">   RetargetingListServiceUploadUserListUploadTypeは、アップロードする方法の種類を表します。<br>   <code>MAIL_ADDRESS</code>ではハッシュ化が必須となります。<br>   メールアドレスのハッシュ化の詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=ja&aid=69234\" target=\"_blank\">ヘルプ</a>を参照してください。 </div> <div lang=\"en\">   RetargetingListServiceUploadUserListUploadType displays kind of upload method.<br>   Hashing process is requied when RetargetingListServiceUploadUserListUploadType is <code>MAIL_ADDRESS</code>.<br>   More details for hashing of email are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/display/articledetail?lan=en&aid=37704&o=default\">Import data and create custom list</a>. </div> <dl class=term>   <dt class=\"term__item\">IDFA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS端末用広告識別子です。</span><span lang=\"en\">Ad identifier for iOS devices.</span></li>   <dt class=\"term__item\">AAID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android端末用広告識別子です。</span><span lang=\"en\">Ad identifier for Android devices.</span></li>   <dt class=\"term__item\">MAIL_ADDRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ハッシュ化メールアドレスです。</span><span lang=\"en\">Hashed email address.</span></li>   <dt class=\"term__item\">CUSTOM_UID_KEY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意のユーザー識別子です。</span><span lang=\"en\">Any user identifier.</span></li>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceUploadUserListUploadType {
  
  IDFA("IDFA"),
  
  AAID("AAID"),
  
  MAIL_ADDRESS("MAIL_ADDRESS"),
  
  CUSTOM_UID_KEY("CUSTOM_UID_KEY"),
  
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

