/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v15.model.RecommendationServiceSearchKeywordIdeaSearchKeywordList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;追加を推奨するサーチキーワードに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This describes the information of a recommended search keyword to add.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RecommendationServiceSearchKeywordIdea.JSON_PROPERTY_SEARCH_KEYWORD_IDEA_SEARCH_KEYWORD_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecommendationServiceSearchKeywordIdea {
  public static final String JSON_PROPERTY_SEARCH_KEYWORD_IDEA_SEARCH_KEYWORD_LIST = "searchKeywordIdeaSearchKeywordList";
  private List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList;

  public RecommendationServiceSearchKeywordIdea() {
  }

  public RecommendationServiceSearchKeywordIdea searchKeywordIdeaSearchKeywordList(List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList) {
    
    this.searchKeywordIdeaSearchKeywordList = searchKeywordIdeaSearchKeywordList;
    return this;
  }

  public RecommendationServiceSearchKeywordIdea addSearchKeywordIdeaSearchKeywordListItem(RecommendationServiceSearchKeywordIdeaSearchKeywordList searchKeywordIdeaSearchKeywordListItem) {
    if (this.searchKeywordIdeaSearchKeywordList == null) {
      this.searchKeywordIdeaSearchKeywordList = new ArrayList<>();
    }
    this.searchKeywordIdeaSearchKeywordList.add(searchKeywordIdeaSearchKeywordListItem);
    return this;
  }

   /**
   * Get searchKeywordIdeaSearchKeywordList
   * @return searchKeywordIdeaSearchKeywordList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_IDEA_SEARCH_KEYWORD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> getSearchKeywordIdeaSearchKeywordList() {
    return searchKeywordIdeaSearchKeywordList;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORD_IDEA_SEARCH_KEYWORD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywordIdeaSearchKeywordList(List<RecommendationServiceSearchKeywordIdeaSearchKeywordList> searchKeywordIdeaSearchKeywordList) {
    this.searchKeywordIdeaSearchKeywordList = searchKeywordIdeaSearchKeywordList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationServiceSearchKeywordIdea recommendationServiceSearchKeywordIdea = (RecommendationServiceSearchKeywordIdea) o;
    return Objects.equals(this.searchKeywordIdeaSearchKeywordList, recommendationServiceSearchKeywordIdea.searchKeywordIdeaSearchKeywordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeywordIdeaSearchKeywordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationServiceSearchKeywordIdea {\n");
    sb.append("    searchKeywordIdeaSearchKeywordList: ").append(toIndentedString(searchKeywordIdeaSearchKeywordList)).append("\n");
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

