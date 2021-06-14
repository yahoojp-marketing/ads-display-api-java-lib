package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedServiceControlTypeは、制御タイプを表します。</div> <div lang=\"en\">FeedServiceControlType serves control type.</div> <dl class=term>   <dt class=\"term__item\">UPLOAD_COUNT_LIMIT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アップロード回数上限</span><span lang=\"en\">Upload limit.</span></dd>   <dt class=\"term__item\">FILE_ROWS_LIMIT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイル行数上限</span><span lang=\"en\">File line limit.</span></dd>   <dt class=\"term__item\">FILE_SIZE_LIMIT_COMPRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルサイズ上限(圧縮)</span><span lang=\"en\">File size limit (compressed).</span></dd>   <dt class=\"term__item\">FILE_SIZE_LIMIT_UNCOMPRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルサイズ上限(非圧縮)</span><span lang=\"en\">File size limit (uncompressed).</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedServiceControlType {
  
  UPLOAD_COUNT_LIMIT("UPLOAD_COUNT_LIMIT"),
  
  FILE_ROWS_LIMIT("FILE_ROWS_LIMIT"),
  
  FILE_SIZE_LIMIT_COMPRESS("FILE_SIZE_LIMIT_COMPRESS"),
  
  FILE_SIZE_LIMIT_UNCOMPRESS("FILE_SIZE_LIMIT_UNCOMPRESS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedServiceControlType(String value) {
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
  public static FeedServiceControlType fromValue(String value) {
    for (FeedServiceControlType b : FeedServiceControlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

