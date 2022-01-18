package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">VideoServiceQualityTypeは、動画の画質を表します。</div> <div lang=\"en\">VideoServiceQualityType describes the video quality.</div> <dl class=term>   <dt class=\"term__item\">FULLHD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フルHD画質</span><span lang=\"en\">Full HD quality</span></dd>   <dt class=\"term__item\">HD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">HD画質</span><span lang=\"en\">HD quality</span></dd>   <dt class=\"term__item\">HIGH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">高画質</span><span lang=\"en\">High-quality</span></dd>   <dt class=\"term__item\">MIDDLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">中画質</span><span lang=\"en\">Medium-quality</span></dd>   <dt class=\"term__item\">LOW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">低画質</span><span lang=\"en\">Low-quality</span></dd>   <dt class=\"term__item\">ORIGINAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">オリジナル</span><span lang=\"en\">Original</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum VideoServiceQualityType {
  
  FULLHD("FULLHD"),
  
  HD("HD"),
  
  HIGH("HIGH"),
  
  MIDDLE("MIDDLE"),
  
  LOW("LOW"),
  
  ORIGINAL("ORIGINAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceQualityType(String value) {
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
  public static VideoServiceQualityType fromValue(String value) {
    for (VideoServiceQualityType b : VideoServiceQualityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

