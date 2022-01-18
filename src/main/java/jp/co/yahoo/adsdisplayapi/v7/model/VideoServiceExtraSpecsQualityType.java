package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">VideoServiceExtraSpecsQualityTypeは、通常の画質（低画質、中画質、高画質）の他に追加で利用できる画質の種類を表します。</div> <div lang=\"en\">VideoServiceExtraSpecsQualityType describes the type of video quality that can be used other than the regular video qualities (low-quality, medium-quality, high-quality).</div> <dl class=term>   <dt class=\"term__item\">FULLHD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フルHD画質</span><span lang=\"en\">Full HD quality</span></dd>   <dt class=\"term__item\">HD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">HD画質</span><span lang=\"en\">HD quality</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum VideoServiceExtraSpecsQualityType {
  
  FULLHD("FULLHD"),
  
  HD("HD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  VideoServiceExtraSpecsQualityType(String value) {
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
  public static VideoServiceExtraSpecsQualityType fromValue(String value) {
    for (VideoServiceExtraSpecsQualityType b : VideoServiceExtraSpecsQualityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

