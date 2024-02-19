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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.ContentsKeywordIdeaServiceMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceKeywordオブジェクトは、コンテンツターゲティングの検索条件です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceKeyword object is search condition for contents targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ContentsKeywordIdeaServiceKeyword.JSON_PROPERTY_KEYWORDS,
  ContentsKeywordIdeaServiceKeyword.JSON_PROPERTY_MATCH_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordIdeaServiceKeyword {
  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private ContentsKeywordIdeaServiceMatchType matchType;

  public ContentsKeywordIdeaServiceKeyword() {
  }

  public ContentsKeywordIdeaServiceKeyword keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public ContentsKeywordIdeaServiceKeyword addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 検索条件：キーワード&lt;br&gt; ※キーワード提案用&lt;br&gt; ※キーワード、キーワードIDの同時指定はできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Search condition : Keyword.&lt;br&gt; *Keyword for suggesting.&lt;br&gt; *Can not specify Keyword and Keyword ID at the same time. &lt;/div&gt; 
   * @return keywords
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public ContentsKeywordIdeaServiceKeyword matchType(ContentsKeywordIdeaServiceMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordIdeaServiceMatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(ContentsKeywordIdeaServiceMatchType matchType) {
    this.matchType = matchType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdeaServiceKeyword contentsKeywordIdeaServiceKeyword = (ContentsKeywordIdeaServiceKeyword) o;
    return Objects.equals(this.keywords, contentsKeywordIdeaServiceKeyword.keywords) &&
        Objects.equals(this.matchType, contentsKeywordIdeaServiceKeyword.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, matchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdeaServiceKeyword {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

