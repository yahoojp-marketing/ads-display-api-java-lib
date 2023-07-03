/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SearchKeywordListServiceSearchKeywordオブジェクトは、サーチキーワードを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SearchKeywordListServiceSearchKeyword is an object to display the search keyword.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  SearchKeywordListServiceSearchKeyword.JSON_PROPERTY_SEARCH_KEYWORD_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchKeywordListServiceSearchKeyword {
  public static final String JSON_PROPERTY_SEARCH_KEYWORD_ID = "searchKeywordId";
  private Long searchKeywordId;

  public SearchKeywordListServiceSearchKeyword() {
  }

  public SearchKeywordListServiceSearchKeyword searchKeywordId(Long searchKeywordId) {
    
    this.searchKeywordId = searchKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サーチキーワードIDです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Search keyword ID.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return searchKeywordId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSearchKeywordId() {
    return searchKeywordId;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordId(Long searchKeywordId) {
    this.searchKeywordId = searchKeywordId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordListServiceSearchKeyword searchKeywordListServiceSearchKeyword = (SearchKeywordListServiceSearchKeyword) o;
    return Objects.equals(this.searchKeywordId, searchKeywordListServiceSearchKeyword.searchKeywordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordListServiceSearchKeyword {\n");
    sb.append("    searchKeywordId: ").append(toIndentedString(searchKeywordId)).append("\n");
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

