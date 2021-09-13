package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> AdGroupAdServiceAdStyleは、掲載フォーマットの種別を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> AdGroupAdServiceAdStyle displays the ad style type.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">TEXT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テキストの掲載フォーマット</span><span lang=\"en\">Text ad style</span></dd>   <dt class=\"term__item\">IMAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像の掲載フォーマット</span><span lang=\"en\">Image ad style</span></dd>   <dt class=\"term__item\">ANIMATION_IMAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アニメーション画像の掲載フォーマット</span><span lang=\"en\">Animated image ad style</span></dd>   <dt class=\"term__item\">VIDEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動画の掲載フォーマット</span><span lang=\"en\">Video ad style</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceAdStyle {
  
  TEXT("TEXT"),
  
  IMAGE("IMAGE"),
  
  ANIMATION_IMAGE("ANIMATION_IMAGE"),
  
  VIDEO("VIDEO"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceAdStyle(String value) {
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
  public static AdGroupAdServiceAdStyle fromValue(String value) {
    for (AdGroupAdServiceAdStyle b : AdGroupAdServiceAdStyle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

