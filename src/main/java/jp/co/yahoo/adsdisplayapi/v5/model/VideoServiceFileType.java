package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">VideoServiceFileTypeは、動画のファイルタイプを表します。</div> <div lang=\"en\">VideoServiceFileType object stores the file type of videos.</div> <dl class=term>   <dt class=\"term__item\">MP4</dt>   <dd class=\"term__desc\"><span lang=\"ja\">MP4形式です。</span><span lang=\"en\">MP4 format.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum VideoServiceFileType {
  
  MP4("MP4"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceFileType(String value) {
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
  public static VideoServiceFileType fromValue(String value) {
    for (VideoServiceFileType b : VideoServiceFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

