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
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceAvailabilityStatus;
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceKeywordFrequency;
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceKeywordRecency;
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceMatchType;
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceSortField;
import jp.co.yahoo.adsdisplayapi.v11.model.SearchKeywordIdeaServiceSortType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaServiceSelectorオブジェクトは、サーチターゲティング対象キーワードのリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdeaServiceSelector object displays the list of keyword for search targeting.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORD_FREQUENCY,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORD_IDS,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORD_RECENCY,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_KEYWORDS,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_MATCH_TYPE,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_SORT_FIELD,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_SORT_TYPE,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_START_INDEX,
  SearchKeywordIdeaServiceSelector.JSON_PROPERTY_AVAILABILITY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchKeywordIdeaServiceSelector {
  public static final String JSON_PROPERTY_KEYWORD_FREQUENCY = "keywordFrequency";
  private SearchKeywordIdeaServiceKeywordFrequency keywordFrequency;

  public static final String JSON_PROPERTY_KEYWORD_IDS = "keywordIds";
  private List<Long> keywordIds;

  public static final String JSON_PROPERTY_KEYWORD_RECENCY = "keywordRecency";
  private SearchKeywordIdeaServiceKeywordRecency keywordRecency;

  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private SearchKeywordIdeaServiceMatchType matchType;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 1000;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private SearchKeywordIdeaServiceSortField sortField;

  public static final String JSON_PROPERTY_SORT_TYPE = "sortType";
  private SearchKeywordIdeaServiceSortType sortType;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_AVAILABILITY_STATUS = "availabilityStatus";
  private SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus;

  public SearchKeywordIdeaServiceSelector() {
  }

  public SearchKeywordIdeaServiceSelector keywordFrequency(SearchKeywordIdeaServiceKeywordFrequency keywordFrequency) {
    
    this.keywordFrequency = keywordFrequency;
    return this;
  }

   /**
   * Get keywordFrequency
   * @return keywordFrequency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordIdeaServiceKeywordFrequency getKeywordFrequency() {
    return keywordFrequency;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordFrequency(SearchKeywordIdeaServiceKeywordFrequency keywordFrequency) {
    this.keywordFrequency = keywordFrequency;
  }


  public SearchKeywordIdeaServiceSelector keywordIds(List<Long> keywordIds) {
    
    this.keywordIds = keywordIds;
    return this;
  }

  public SearchKeywordIdeaServiceSelector addKeywordIdsItem(Long keywordIdsItem) {
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


  public SearchKeywordIdeaServiceSelector keywordRecency(SearchKeywordIdeaServiceKeywordRecency keywordRecency) {
    
    this.keywordRecency = keywordRecency;
    return this;
  }

   /**
   * Get keywordRecency
   * @return keywordRecency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordIdeaServiceKeywordRecency getKeywordRecency() {
    return keywordRecency;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_RECENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordRecency(SearchKeywordIdeaServiceKeywordRecency keywordRecency) {
    this.keywordRecency = keywordRecency;
  }


  public SearchKeywordIdeaServiceSelector keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public SearchKeywordIdeaServiceSelector addKeywordsItem(String keywordsItem) {
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


  public SearchKeywordIdeaServiceSelector matchType(SearchKeywordIdeaServiceMatchType matchType) {
    
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

  public SearchKeywordIdeaServiceMatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(SearchKeywordIdeaServiceMatchType matchType) {
    this.matchType = matchType;
  }


  public SearchKeywordIdeaServiceSelector numberResults(Integer numberResults) {
    
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


  public SearchKeywordIdeaServiceSelector sortField(SearchKeywordIdeaServiceSortField sortField) {
    
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

  public SearchKeywordIdeaServiceSortField getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(SearchKeywordIdeaServiceSortField sortField) {
    this.sortField = sortField;
  }


  public SearchKeywordIdeaServiceSelector sortType(SearchKeywordIdeaServiceSortType sortType) {
    
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

  public SearchKeywordIdeaServiceSortType getSortType() {
    return sortType;
  }


  @JsonProperty(JSON_PROPERTY_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortType(SearchKeywordIdeaServiceSortType sortType) {
    this.sortType = sortType;
  }


  public SearchKeywordIdeaServiceSelector startIndex(Integer startIndex) {
    
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


  public SearchKeywordIdeaServiceSelector availabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    
    this.availabilityStatus = availabilityStatus;
    return this;
  }

   /**
   * Get availabilityStatus
   * @return availabilityStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchKeywordIdeaServiceAvailabilityStatus getAvailabilityStatus() {
    return availabilityStatus;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordIdeaServiceSelector searchKeywordIdeaServiceSelector = (SearchKeywordIdeaServiceSelector) o;
    return Objects.equals(this.keywordFrequency, searchKeywordIdeaServiceSelector.keywordFrequency) &&
        Objects.equals(this.keywordIds, searchKeywordIdeaServiceSelector.keywordIds) &&
        Objects.equals(this.keywordRecency, searchKeywordIdeaServiceSelector.keywordRecency) &&
        Objects.equals(this.keywords, searchKeywordIdeaServiceSelector.keywords) &&
        Objects.equals(this.matchType, searchKeywordIdeaServiceSelector.matchType) &&
        Objects.equals(this.numberResults, searchKeywordIdeaServiceSelector.numberResults) &&
        Objects.equals(this.sortField, searchKeywordIdeaServiceSelector.sortField) &&
        Objects.equals(this.sortType, searchKeywordIdeaServiceSelector.sortType) &&
        Objects.equals(this.startIndex, searchKeywordIdeaServiceSelector.startIndex) &&
        Objects.equals(this.availabilityStatus, searchKeywordIdeaServiceSelector.availabilityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordFrequency, keywordIds, keywordRecency, keywords, matchType, numberResults, sortField, sortType, startIndex, availabilityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordIdeaServiceSelector {\n");
    sb.append("    keywordFrequency: ").append(toIndentedString(keywordFrequency)).append("\n");
    sb.append("    keywordIds: ").append(toIndentedString(keywordIds)).append("\n");
    sb.append("    keywordRecency: ").append(toIndentedString(keywordRecency)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
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

