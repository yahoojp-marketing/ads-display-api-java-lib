package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedServiceSourceTypeは、ファイルアップロード実施ツールの種別を表します。</div> <div lang=\"en\">FeedServiceSourceType serves file upload tool type.</div> <dl class=term>   <dt class=\"term__item\">FTP_SCHEDULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">FTP(スケジュール)によるアップロードです。</span><span lang=\"en\">Upload by FTP(SCHEDULE).</span></dd>   <dt class=\"term__item\">FTP_DIRECT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">FTP(即時)によるアップロードです。</span><span lang=\"en\">Upload by FTP(DIRECT).</span></dd>   <dt class=\"term__item\">API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">APIによるアップロードです。</span><span lang=\"en\">Upload by API.</span></dd>   <dt class=\"term__item\">FTP_AND_API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">FTP+APIによるアップロードです。</span><span lang=\"en\">Upload by FTP and API.</span></dd>   <dt class=\"term__item\">CAMPAIGN_MANAGEMENT_TOOL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告管理ツールによるアップロードです。</span><span lang=\"en\">Upload by Campaign Management Tool.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedServiceSourceType {
  
  FTP_SCHEDULE("FTP_SCHEDULE"),
  
  FTP_DIRECT("FTP_DIRECT"),
  
  API("API"),
  
  FTP_AND_API("FTP_AND_API"),
  
  CAMPAIGN_MANAGEMENT_TOOL("CAMPAIGN_MANAGEMENT_TOOL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedServiceSourceType(String value) {
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
  public static FeedServiceSourceType fromValue(String value) {
    for (FeedServiceSourceType b : FeedServiceSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

