/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v16.model.DictionaryServiceLang;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceCategorySelectorオブジェクトは、取得するカテゴリー情報の言語を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceCategorySelector object displays the language of retrieved category information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceCategorySelectorオブジェクトは、取得するカテゴリー情報の言語を表します。</div> <div lang=\"en\">DictionaryServiceCategorySelector object displays the language of retrieved category information.</div> ")
@JsonPropertyOrder({
  DictionaryServiceCategorySelector.JSON_PROPERTY_LANG
})
@JsonTypeName("DictionaryServiceCategorySelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceCategorySelector {
  public static final String JSON_PROPERTY_LANG = "lang";
  private DictionaryServiceLang lang;

  public DictionaryServiceCategorySelector() { 
  }

  public DictionaryServiceCategorySelector lang(DictionaryServiceLang lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DictionaryServiceLang getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceCategorySelector dictionaryServiceCategorySelector = (DictionaryServiceCategorySelector) o;
    return Objects.equals(this.lang, dictionaryServiceCategorySelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceCategorySelector {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

