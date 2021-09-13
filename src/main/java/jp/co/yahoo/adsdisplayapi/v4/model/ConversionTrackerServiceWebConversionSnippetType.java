package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\"> ConversionTrackerServiceWebConversionSnippetTypeは、トラッキングスクリプトのタイプを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> ConversionTrackerServiceWebConversionSnippetType displays the type of tracking script.<br> Although this field will be returned in the response, it will be ignored on input. </div> <dl class=term>   <dt class=\"term__item\">IMG</dt>   <dd class=\"term__desc\"><span lang=\"ja\">画像タグです。</span><span lang=\"en\">Image tag</span></dd>   <dt class=\"term__item\">JS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Javascriptタグです。</span><span lang=\"en\">Javascript tag</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceWebConversionSnippetType {
  
  IMG("IMG"),
  
  JS("JS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceWebConversionSnippetType(String value) {
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
  public static ConversionTrackerServiceWebConversionSnippetType fromValue(String value) {
    for (ConversionTrackerServiceWebConversionSnippetType b : ConversionTrackerServiceWebConversionSnippetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

