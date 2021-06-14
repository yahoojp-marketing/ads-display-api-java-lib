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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListServiceSelectorオブジェクトは、選択するコンテンツキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordListServiceSelector object displays the selected contents keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordListServiceSelectorオブジェクトは、選択するコンテンツキーワードリストを表します。</div> <div lang=\"en\">ContentsKeywordListServiceSelector object displays the selected contents keyword list.</div> ")

public class ContentsKeywordListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("contentsKeywordListIds")
  @Valid
  private JsonNullable<List<Long>> contentsKeywordListIds = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public ContentsKeywordListServiceSelector accountId(Long accountId) {
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

  public ContentsKeywordListServiceSelector numberResults(Integer numberResults) {
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

  public ContentsKeywordListServiceSelector contentsKeywordListIds(List<Long> contentsKeywordListIds) {
    this.contentsKeywordListIds = JsonNullable.of(contentsKeywordListIds);
    return this;
  }

  public ContentsKeywordListServiceSelector addContentsKeywordListIdsItem(Long contentsKeywordListIdsItem) {
    if (this.contentsKeywordListIds == null || !this.contentsKeywordListIds.isPresent()) {
      this.contentsKeywordListIds = JsonNullable.of(new ArrayList<>());
    }
    this.contentsKeywordListIds.get().add(contentsKeywordListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> 
   * @return contentsKeywordListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getContentsKeywordListIds() {
    return contentsKeywordListIds;
  }

  public void setContentsKeywordListIds(JsonNullable<List<Long>> contentsKeywordListIds) {
    this.contentsKeywordListIds = contentsKeywordListIds;
  }

  public ContentsKeywordListServiceSelector startIndex(Integer startIndex) {
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
    ContentsKeywordListServiceSelector contentsKeywordListServiceSelector = (ContentsKeywordListServiceSelector) o;
    return Objects.equals(this.accountId, contentsKeywordListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, contentsKeywordListServiceSelector.numberResults) &&
        Objects.equals(this.contentsKeywordListIds, contentsKeywordListServiceSelector.contentsKeywordListIds) &&
        Objects.equals(this.startIndex, contentsKeywordListServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, contentsKeywordListIds, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentsKeywordListServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    contentsKeywordListIds: ").append(toIndentedString(contentsKeywordListIds)).append("\n");
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

