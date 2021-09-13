package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">VideoServiceProcessStatusは、動画の処理状況です。</div> <div lang=\"en\">VideoServiceProcessStatus display the process status of videos.</div> <dl class=term>   <dt class=\"term__item\">PROCESSING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理中です。</span><span lang=\"en\">It is in process.</span></dd>   <dt class=\"term__item\">FINISHED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理を完了しました。</span><span lang=\"en\">The process  has been completed.</span></dd>   <dt class=\"term__item\">FAILED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理を失敗しました。</span><span lang=\"en\">The process failed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum VideoServiceProcessStatus {
  
  PROCESSING("PROCESSING"),
  
  FINISHED("FINISHED"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceProcessStatus(String value) {
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
  public static VideoServiceProcessStatus fromValue(String value) {
    for (VideoServiceProcessStatus b : VideoServiceProcessStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

