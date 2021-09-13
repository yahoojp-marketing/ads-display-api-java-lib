package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceUploadUserListCompressTypeは、アップロードする連携データファイルの圧縮形式を表します。</div> <div lang=\"en\">RetargetingListServiceUploadUserListCompressType displays kind of compress type of upload file.</div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">非圧縮形式です。</span><span lang=\"en\">Uncompressed format.</span></dd>   <dt class=\"term__item\">ZIP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP形式です。</span><span lang=\"en\">ZIP format.</span></dd>   <dt class=\"term__item\">GZIP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">GZIP形式です。</span><span lang=\"en\">GZIP format.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceUploadUserListCompressType {
  
  NONE("NONE"),
  
  ZIP("ZIP"),
  
  GZIP("GZIP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceUploadUserListCompressType(String value) {
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
  public static RetargetingListServiceUploadUserListCompressType fromValue(String value) {
    for (RetargetingListServiceUploadUserListCompressType b : RetargetingListServiceUploadUserListCompressType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

