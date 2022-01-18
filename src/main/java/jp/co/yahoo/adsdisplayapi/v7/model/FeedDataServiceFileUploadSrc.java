package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">商品リストファイルのアップロード元種別です。</div> <div lang=\"en\">FeedDataServiceFileUploadSrc object displays source of item list upload.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN_MANAGEMENT_TOOL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告管理ツール</span><span lang=\"en\">Campaign Management Tool.</span></dd>   <dt class=\"term__item\">API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">API</span><span lang=\"en\">API.</span></dd>   <dt class=\"term__item\">FTP_SCHEDULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">FTP（定期アップロード）</span><span lang=\"en\">FTP (Periodic upload).</span></dd>   <dt class=\"term__item\">FTP_DIRECT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">FTP（即時実行）</span><span lang=\"en\">FTP (Immediate execution upload).</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedDataServiceFileUploadSrc {
  
  CAMPAIGN_MANAGEMENT_TOOL("CAMPAIGN_MANAGEMENT_TOOL"),
  
  API("API"),
  
  FTP_SCHEDULE("FTP_SCHEDULE"),
  
  FTP_DIRECT("FTP_DIRECT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedDataServiceFileUploadSrc(String value) {
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
  public static FeedDataServiceFileUploadSrc fromValue(String value) {
    for (FeedDataServiceFileUploadSrc b : FeedDataServiceFileUploadSrc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

