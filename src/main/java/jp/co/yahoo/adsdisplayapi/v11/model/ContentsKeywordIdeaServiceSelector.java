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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.ContentsKeywordIdeaServiceKeyword;
import jp.co.yahoo.adsdisplayapi.v11.model.ContentsKeywordIdeaServiceSortField;
import jp.co.yahoo.adsdisplayapi.v11.model.ContentsKeywordIdeaServiceSortType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceSelectorオブジェクトは、コンテンツターゲティング対象キーワードのリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceSelector object displays the list of keyword for contents targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORD_IDS,
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORD,
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_SORT_FIELD,
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_SORT_TYPE,
  ContentsKeywordIdeaServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContentsKeywordIdeaServiceSelector {
  public static final String JSON_PROPERTY_KEYWORD_IDS = "keywordIds";
  private List<Long> keywordIds;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private ContentsKeywordIdeaServiceKeyword keyword;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 1000;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private ContentsKeywordIdeaServiceSortField sortField;

  public static final String JSON_PROPERTY_SORT_TYPE = "sortType";
  private ContentsKeywordIdeaServiceSortType sortType;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public ContentsKeywordIdeaServiceSelector() {
  }

  public ContentsKeywordIdeaServiceSelector keywordIds(List<Long> keywordIds) {
    
    this.keywordIds = keywordIds;
    return this;
  }

  public ContentsKeywordIdeaServiceSelector addKeywordIdsItem(Long keywordIdsItem) {
    if (this.keywordIds == null) {
      this.keywordIds = new ArrayList<>();
    }
    this.keywordIds.add(keywordIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 検索条件：キーワードID&lt;br&gt; ※キーワード検索用&lt;br&gt; ※キーワード、キーワードIDの同時指定はできません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition : Keyword ID.&lt;br&gt; *Keyword for searching.&lt;br&gt; *Can not specify Keyword and Keyword ID at the same time. &lt;/div&gt; 
   * @return keywordIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getKeywordIds() {
    return keywordIds;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordIds(List<Long> keywordIds) {
    this.keywordIds = keywordIds;
  }


  public ContentsKeywordIdeaServiceSelector keyword(ContentsKeywordIdeaServiceKeyword keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordIdeaServiceKeyword getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(ContentsKeywordIdeaServiceKeyword keyword) {
    this.keyword = keyword;
  }


  public ContentsKeywordIdeaServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public ContentsKeywordIdeaServiceSelector sortField(ContentsKeywordIdeaServiceSortField sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordIdeaServiceSortField getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(ContentsKeywordIdeaServiceSortField sortField) {
    this.sortField = sortField;
  }


  public ContentsKeywordIdeaServiceSelector sortType(ContentsKeywordIdeaServiceSortType sortType) {
    
    this.sortType = sortType;
    return this;
  }

   /**
   * Get sortType
   * @return sortType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentsKeywordIdeaServiceSortType getSortType() {
    return sortType;
  }


  @JsonProperty(JSON_PROPERTY_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortType(ContentsKeywordIdeaServiceSortType sortType) {
    this.sortType = sortType;
  }


  public ContentsKeywordIdeaServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentsKeywordIdeaServiceSelector contentsKeywordIdeaServiceSelector = (ContentsKeywordIdeaServiceSelector) o;
    return Objects.equals(this.keywordIds, contentsKeywordIdeaServiceSelector.keywordIds) &&
        Objects.equals(this.keyword, contentsKeywordIdeaServiceSelector.keyword) &&
        Objects.equals(this.numberResults, contentsKeywordIdeaServiceSelector.numberResults) &&
        Objects.equals(this.sortField, contentsKeywordIdeaServiceSelector.sortField) &&
        Objects.equals(this.sortType, contentsKeywordIdeaServiceSelector.sortType) &&
        Objects.equals(this.startIndex, contentsKeywordIdeaServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordIds, keyword, numberResults, sortField, sortType, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordIdeaServiceSelector {\n");
    sb.append("    keywordIds: ").append(toIndentedString(keywordIds)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

