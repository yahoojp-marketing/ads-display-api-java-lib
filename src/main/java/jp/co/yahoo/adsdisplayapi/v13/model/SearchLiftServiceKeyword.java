/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v13.model.SearchLiftServiceKeywordCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchLiftServiceKeywordオブジェクトは、サーチリフトのキーワード情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchLiftServiceKeyword object describes information about the keyword of the search lift.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SearchLiftServiceKeyword.JSON_PROPERTY_KEYWORD,
  SearchLiftServiceKeyword.JSON_PROPERTY_KEYWORD_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchLiftServiceKeyword {
  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_KEYWORD_CATEGORY = "keywordCategory";
  private SearchLiftServiceKeywordCategory keywordCategory;

  public SearchLiftServiceKeyword() {
  }

  public SearchLiftServiceKeyword keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword.&lt;/div&gt; 
   * @return keyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public SearchLiftServiceKeyword keywordCategory(SearchLiftServiceKeywordCategory keywordCategory) {
    
    this.keywordCategory = keywordCategory;
    return this;
  }

   /**
   * Get keywordCategory
   * @return keywordCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchLiftServiceKeywordCategory getKeywordCategory() {
    return keywordCategory;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordCategory(SearchLiftServiceKeywordCategory keywordCategory) {
    this.keywordCategory = keywordCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchLiftServiceKeyword searchLiftServiceKeyword = (SearchLiftServiceKeyword) o;
    return Objects.equals(this.keyword, searchLiftServiceKeyword.keyword) &&
        Objects.equals(this.keywordCategory, searchLiftServiceKeyword.keywordCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, keywordCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchLiftServiceKeyword {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordCategory: ").append(toIndentedString(keywordCategory)).append("\n");
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
