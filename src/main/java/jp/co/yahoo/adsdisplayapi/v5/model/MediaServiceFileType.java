package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> MediaServiceFileTypeは、画像のファイルタイプです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> MediaServiceFileType serves the file type of media.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">GIF</dt>   <dd class=\"term__desc\"><span lang=\"ja\">GIF（静止画）です。</span><span lang=\"en\">GIF image.</span></dd>   <dt class=\"term__item\">PNG</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PNGです。</span><span lang=\"en\">PNG image.</span></dd>   <dt class=\"term__item\">JPEG</dt>   <dd class=\"term__desc\"><span lang=\"ja\">JPEGです。</span><span lang=\"en\">JPEG image.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum MediaServiceFileType {
  
  JPEG("JPEG"),
  
  GIF("GIF"),
  
  PNG("PNG"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  MediaServiceFileType(String value) {
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
  public static MediaServiceFileType fromValue(String value) {
    for (MediaServiceFileType b : MediaServiceFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

