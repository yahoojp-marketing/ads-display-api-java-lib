package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ContentsKeywordIdeaServiceKeyword;
import jp.co.yahoo.adsdisplayapi.v5.model.ContentsKeywordIdeaServiceSortField;
import jp.co.yahoo.adsdisplayapi.v5.model.ContentsKeywordIdeaServiceSortType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordIdeaServiceSelectorオブジェクトは、コンテンツターゲティング対象キーワードのリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordIdeaServiceSelector object displays the list of keyword for contents targeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordIdeaServiceSelectorオブジェクトは、コンテンツターゲティング対象キーワードのリストを表します。</div> <div lang=\"en\">ContentsKeywordIdeaServiceSelector object displays the list of keyword for contents targeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordIdeaServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("keywordIds")
  @Valid
  private List<Long> keywordIds = null;

  @JsonProperty("keyword")
  private ContentsKeywordIdeaServiceKeyword keyword = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("sortField")
  private ContentsKeywordIdeaServiceSortField sortField = null;

  @JsonProperty("sortType")
  private ContentsKeywordIdeaServiceSortType sortType = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

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

  public ContentsKeywordIdeaServiceSelector keyword(ContentsKeywordIdeaServiceKeyword keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordIdeaServiceKeyword getKeyword() {
    return keyword;
  }

  public void setKeyword(ContentsKeywordIdeaServiceKeyword keyword) {
    this.keyword = keyword;
  }

  public ContentsKeywordIdeaServiceSelector numberResults(Integer numberResults) {
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

  public ContentsKeywordIdeaServiceSelector sortField(ContentsKeywordIdeaServiceSortField sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * Get sortField
   * @return sortField
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordIdeaServiceSortField getSortField() {
    return sortField;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContentsKeywordIdeaServiceSortType getSortType() {
    return sortType;
  }

  public void setSortType(ContentsKeywordIdeaServiceSortType sortType) {
    this.sortType = sortType;
  }

  public ContentsKeywordIdeaServiceSelector startIndex(Integer startIndex) {
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

