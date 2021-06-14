package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceAvailabilityStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceKeywordFrequency;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceKeywordRecency;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceMatchType;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceSortField;
import jp.co.yahoo.adsdisplayapi.v5.model.SearchKeywordIdeaServiceSortType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaServiceSelectorオブジェクトは、サーチターゲティング対象キーワードのリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdeaServiceSelector object displays the list of keyword for search targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordIdeaServiceSelectorオブジェクトは、サーチターゲティング対象キーワードのリストを表します。</div> <div lang=\"en\">SearchKeywordIdeaServiceSelector object displays the list of keyword for search targeting.</div> ")

public class SearchKeywordIdeaServiceSelector   {
  @JsonProperty("keywordFrequency")
  private JsonNullable<SearchKeywordIdeaServiceKeywordFrequency> keywordFrequency = JsonNullable.undefined();

  @JsonProperty("keywordIds")
  @Valid
  private JsonNullable<List<Long>> keywordIds = JsonNullable.undefined();

  @JsonProperty("keywordRecency")
  private JsonNullable<SearchKeywordIdeaServiceKeywordRecency> keywordRecency = JsonNullable.undefined();

  @JsonProperty("keywords")
  @Valid
  private JsonNullable<List<String>> keywords = JsonNullable.undefined();

  @JsonProperty("matchType")
  private JsonNullable<SearchKeywordIdeaServiceMatchType> matchType = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("sortField")
  private JsonNullable<SearchKeywordIdeaServiceSortField> sortField = JsonNullable.undefined();

  @JsonProperty("sortType")
  private JsonNullable<SearchKeywordIdeaServiceSortType> sortType = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("availabilityStatus")
  private JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> availabilityStatus = JsonNullable.undefined();

  public SearchKeywordIdeaServiceSelector keywordFrequency(SearchKeywordIdeaServiceKeywordFrequency keywordFrequency) {
    this.keywordFrequency = JsonNullable.of(keywordFrequency);
    return this;
  }

  /**
   * Get keywordFrequency
   * @return keywordFrequency
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceKeywordFrequency> getKeywordFrequency() {
    return keywordFrequency;
  }

  public void setKeywordFrequency(JsonNullable<SearchKeywordIdeaServiceKeywordFrequency> keywordFrequency) {
    this.keywordFrequency = keywordFrequency;
  }

  public SearchKeywordIdeaServiceSelector keywordIds(List<Long> keywordIds) {
    this.keywordIds = JsonNullable.of(keywordIds);
    return this;
  }

  public SearchKeywordIdeaServiceSelector addKeywordIdsItem(Long keywordIdsItem) {
    if (this.keywordIds == null || !this.keywordIds.isPresent()) {
      this.keywordIds = JsonNullable.of(new ArrayList<>());
    }
    this.keywordIds.get().add(keywordIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索条件：キーワードID<br> ※キーワード検索用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\">Search condition : Keyword ID.<br> *Keyword for searching.<br> *Can not specify Keyword and Keyword ID at the same time. </div> 
   * @return keywordIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索条件：キーワードID<br> ※キーワード検索用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\">Search condition : Keyword ID.<br> *Keyword for searching.<br> *Can not specify Keyword and Keyword ID at the same time. </div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getKeywordIds() {
    return keywordIds;
  }

  public void setKeywordIds(JsonNullable<List<Long>> keywordIds) {
    this.keywordIds = keywordIds;
  }

  public SearchKeywordIdeaServiceSelector keywordRecency(SearchKeywordIdeaServiceKeywordRecency keywordRecency) {
    this.keywordRecency = JsonNullable.of(keywordRecency);
    return this;
  }

  /**
   * Get keywordRecency
   * @return keywordRecency
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceKeywordRecency> getKeywordRecency() {
    return keywordRecency;
  }

  public void setKeywordRecency(JsonNullable<SearchKeywordIdeaServiceKeywordRecency> keywordRecency) {
    this.keywordRecency = keywordRecency;
  }

  public SearchKeywordIdeaServiceSelector keywords(List<String> keywords) {
    this.keywords = JsonNullable.of(keywords);
    return this;
  }

  public SearchKeywordIdeaServiceSelector addKeywordsItem(String keywordsItem) {
    if (this.keywords == null || !this.keywords.isPresent()) {
      this.keywords = JsonNullable.of(new ArrayList<>());
    }
    this.keywords.get().add(keywordsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> 
   * @return keywords
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> ")

@Size(max=200) 
  public JsonNullable<List<String>> getKeywords() {
    return keywords;
  }

  public void setKeywords(JsonNullable<List<String>> keywords) {
    this.keywords = keywords;
  }

  public SearchKeywordIdeaServiceSelector matchType(SearchKeywordIdeaServiceMatchType matchType) {
    this.matchType = JsonNullable.of(matchType);
    return this;
  }

  /**
   * Get matchType
   * @return matchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceMatchType> getMatchType() {
    return matchType;
  }

  public void setMatchType(JsonNullable<SearchKeywordIdeaServiceMatchType> matchType) {
    this.matchType = matchType;
  }

  public SearchKeywordIdeaServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public SearchKeywordIdeaServiceSelector sortField(SearchKeywordIdeaServiceSortField sortField) {
    this.sortField = JsonNullable.of(sortField);
    return this;
  }

  /**
   * Get sortField
   * @return sortField
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceSortField> getSortField() {
    return sortField;
  }

  public void setSortField(JsonNullable<SearchKeywordIdeaServiceSortField> sortField) {
    this.sortField = sortField;
  }

  public SearchKeywordIdeaServiceSelector sortType(SearchKeywordIdeaServiceSortType sortType) {
    this.sortType = JsonNullable.of(sortType);
    return this;
  }

  /**
   * Get sortType
   * @return sortType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceSortType> getSortType() {
    return sortType;
  }

  public void setSortType(JsonNullable<SearchKeywordIdeaServiceSortType> sortType) {
    this.sortType = sortType;
  }

  public SearchKeywordIdeaServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public SearchKeywordIdeaServiceSelector availabilityStatus(SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus) {
    this.availabilityStatus = JsonNullable.of(availabilityStatus);
    return this;
  }

  /**
   * Get availabilityStatus
   * @return availabilityStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(JsonNullable<SearchKeywordIdeaServiceAvailabilityStatus> availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

