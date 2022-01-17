package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceAvailabilityStatus;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceKeywordFrequency;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceKeywordRecency;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceMatchType;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceSortField;
import jp.co.yahoo.adsdisplayapi.v6.model.SearchKeywordIdeaServiceSortType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordIdeaServiceSelectorオブジェクトは、サーチターゲティング対象キーワードのリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordIdeaServiceSelector object displays the list of keyword for search targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordIdeaServiceSelectorオブジェクトは、サーチターゲティング対象キーワードのリストを表します。</div> <div lang=\"en\">SearchKeywordIdeaServiceSelector object displays the list of keyword for search targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SearchKeywordIdeaServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("keywordFrequency")
  private SearchKeywordIdeaServiceKeywordFrequency keywordFrequency = null;

  @JsonProperty("keywordIds")
  @Valid
  private List<Long> keywordIds = null;

  @JsonProperty("keywordRecency")
  private SearchKeywordIdeaServiceKeywordRecency keywordRecency = null;

  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("matchType")
  private SearchKeywordIdeaServiceMatchType matchType = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("sortField")
  private SearchKeywordIdeaServiceSortField sortField = null;

  @JsonProperty("sortType")
  private SearchKeywordIdeaServiceSortType sortType = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("availabilityStatus")
  private SearchKeywordIdeaServiceAvailabilityStatus availabilityStatus = null;

  public SearchKeywordIdeaServiceSelector keywordFrequency(SearchKeywordIdeaServiceKeywordFrequency keywordFrequency) {
    this.keywordFrequency = keywordFrequency;
    return this;
  }

  /**
   * Get keywordFrequency
   * @return keywordFrequency
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceKeywordFrequency getKeywordFrequency() {
    return keywordFrequency;
  }

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
   * <div lang=\"ja\"> 検索条件：キーワードID<br> ※キーワード検索用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\">Search condition : Keyword ID.<br> *Keyword for searching.<br> *Can not specify Keyword and Keyword ID at the same time. </div> 
   * @return keywordIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索条件：キーワードID<br> ※キーワード検索用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\">Search condition : Keyword ID.<br> *Keyword for searching.<br> *Can not specify Keyword and Keyword ID at the same time. </div> ")

@Size(max=500) 
  public List<Long> getKeywordIds() {
    return keywordIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceKeywordRecency getKeywordRecency() {
    return keywordRecency;
  }

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
   * <div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> 
   * @return keywords
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索条件：キーワード<br> ※キーワード提案用<br> ※キーワード、キーワードIDの同時指定はできません。 </div> <div lang=\"en\"> Search condition : Keyword.<br> *Keyword for suggesting.<br> *Can not specify Keyword and Keyword ID at the same time. </div> ")

@Size(max=200) 
  public List<String> getKeywords() {
    return keywords;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(SearchKeywordIdeaServiceMatchType matchType) {
    this.matchType = matchType;
  }

  public SearchKeywordIdeaServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceSortField getSortField() {
    return sortField;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceSortType getSortType() {
    return sortType;
  }

  public void setSortType(SearchKeywordIdeaServiceSortType sortType) {
    this.sortType = sortType;
  }

  public SearchKeywordIdeaServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchKeywordIdeaServiceAvailabilityStatus getAvailabilityStatus() {
    return availabilityStatus;
  }

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

