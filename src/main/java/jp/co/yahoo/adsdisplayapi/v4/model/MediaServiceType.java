package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> MediaTypeは、画像の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> MediaServiceType serves the type of media. <br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">IMAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像です。</span><span lang=\"en\">Image.</span></dd>   <dt class=\"term__item\">ANIMATION_IMAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アニメーションGIFです。</span><span lang=\"en\">Animation GIF.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum MediaServiceType {
  
  IMAGE("IMAGE"),
  
  ANIMATION_IMAGE("ANIMATION_IMAGE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  MediaServiceType(String value) {
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
  public static MediaServiceType fromValue(String value) {
    for (MediaServiceType b : MediaServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

