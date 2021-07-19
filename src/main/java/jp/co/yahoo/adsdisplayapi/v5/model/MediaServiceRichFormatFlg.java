package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> MediaServiceRichFormatFlgは、予約型で提供するリッチフォーマット画像の設定フラグを表します。<br> このフィールドは、ADD時に省略可能となります。 </div> <div lang=\"en\"> MediaServiceRichFormatFlg displays the flag settings of rich format image of guaranteed campaign. <br> This field is optional in ADD operation. </div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リッチフォーマット画像です。</span><span lang=\"en\">Rich format image.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リッチフォーマット以外の画像です。</span><span lang=\"en\">Not rich format image.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum MediaServiceRichFormatFlg {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  MediaServiceRichFormatFlg(String value) {
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
  public static MediaServiceRichFormatFlg fromValue(String value) {
    for (MediaServiceRichFormatFlg b : MediaServiceRichFormatFlg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

