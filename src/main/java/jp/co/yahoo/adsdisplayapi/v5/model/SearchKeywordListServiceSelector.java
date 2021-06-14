package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SearchKeywordListServiceSelectorオブジェクトは、選択するサーチキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SearchKeywordListServiceSelector object displays the selected search keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SearchKeywordListServiceSelectorオブジェクトは、選択するサーチキーワードリストを表します。</div> <div lang=\"en\">SearchKeywordListServiceSelector object displays the selected search keyword list.</div> ")

public class SearchKeywordListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("searchKeywordListIds")
  @Valid
  private JsonNullable<List<Long>> searchKeywordListIds = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public SearchKeywordListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public SearchKeywordListServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public SearchKeywordListServiceSelector searchKeywordListIds(List<Long> searchKeywordListIds) {
    this.searchKeywordListIds = JsonNullable.of(searchKeywordListIds);
    return this;
  }

  public SearchKeywordListServiceSelector addSearchKeywordListIdsItem(Long searchKeywordListIdsItem) {
    if (this.searchKeywordListIds == null || !this.searchKeywordListIds.isPresent()) {
      this.searchKeywordListIds = JsonNullable.of(new ArrayList<>());
    }
    this.searchKeywordListIds.get().add(searchKeywordListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> 
   * @return searchKeywordListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サーチキーワードIDです。</div> <div lang=\"en\">Search keyword ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getSearchKeywordListIds() {
    return searchKeywordListIds;
  }

  public void setSearchKeywordListIds(JsonNullable<List<Long>> searchKeywordListIds) {
    this.searchKeywordListIds = searchKeywordListIds;
  }

  public SearchKeywordListServiceSelector startIndex(Integer startIndex) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchKeywordListServiceSelector searchKeywordListServiceSelector = (SearchKeywordListServiceSelector) o;
    return Objects.equals(this.accountId, searchKeywordListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, searchKeywordListServiceSelector.numberResults) &&
        Objects.equals(this.searchKeywordListIds, searchKeywordListServiceSelector.searchKeywordListIds) &&
        Objects.equals(this.startIndex, searchKeywordListServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, searchKeywordListIds, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchKeywordListServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    searchKeywordListIds: ").append(toIndentedString(searchKeywordListIds)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

