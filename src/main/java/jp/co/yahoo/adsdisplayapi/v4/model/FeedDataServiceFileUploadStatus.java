package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ファイルアップロード状況</div> <div lang=\"en\">FeedDataServiceFileUploadStatus object displays status of file upload.</div> <dl class=term>   <dt class=\"term__item\">UPLOADED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アップロード済み 処理中</span><span lang=\"en\">Uploaded (in progress).</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完了</span><span lang=\"en\">Completed.</span></dd>   <dt class=\"term__item\">FILE_FORMAT_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アップロードファイルに不備あり</span><span lang=\"en\">File format error occurred.</span></dd>   <dt class=\"term__item\">SYSTEM_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">システムエラー</span><span lang=\"en\">System error occurred.</span></dd>   <dt class=\"term__item\">NETWORK_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ネットワークエラー</span><span lang=\"en\">Network error occurred.</span></dd>   <dt class=\"term__item\">FILE_NOT_FOUND_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象ファイルなし</span><span lang=\"en\">File not found.</span></dd>   <dt class=\"term__item\">FILE_SIZE_OVER_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルサイズ上限を超過</span><span lang=\"en\">File size limit exceeded.</span></dd>   <dt class=\"term__item\">AUTH_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">認証エラー</span><span lang=\"en\">Authentication error occurred.</span></dd>   <dt class=\"term__item\">UPLOAD_COUNT_OVER_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アップロード回数上限を超過</span><span lang=\"en\">Upload count limit exceeded.</span></dd>   <dt class=\"term__item\">NOT_MODIFIED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイル内容に差分なし（未取得）</span><span lang=\"en\">No difference, not uploaded.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedDataServiceFileUploadStatus {
  
  UPLOADED("UPLOADED"),
  
  COMPLETED("COMPLETED"),
  
  FILE_FORMAT_ERROR("FILE_FORMAT_ERROR"),
  
  SYSTEM_ERROR("SYSTEM_ERROR"),
  
  NETWORK_ERROR("NETWORK_ERROR"),
  
  FILE_NOT_FOUND_ERROR("FILE_NOT_FOUND_ERROR"),
  
  FILE_SIZE_OVER_ERROR("FILE_SIZE_OVER_ERROR"),
  
  AUTH_ERROR("AUTH_ERROR"),
  
  UPLOAD_COUNT_OVER_ERROR("UPLOAD_COUNT_OVER_ERROR"),
  
  NOT_MODIFIED("NOT_MODIFIED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedDataServiceFileUploadStatus(String value) {
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
  public static FeedDataServiceFileUploadStatus fromValue(String value) {
    for (FeedDataServiceFileUploadStatus b : FeedDataServiceFileUploadStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

