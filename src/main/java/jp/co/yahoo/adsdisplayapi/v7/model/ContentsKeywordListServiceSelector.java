package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ContentsKeywordListServiceSelectorオブジェクトは、選択するコンテンツキーワードリストを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ContentsKeywordListServiceSelector object displays the selected contents keyword list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ContentsKeywordListServiceSelectorオブジェクトは、選択するコンテンツキーワードリストを表します。</div> <div lang=\"en\">ContentsKeywordListServiceSelector object displays the selected contents keyword list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentsKeywordListServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("contentsKeywordListIds")
  @Valid
  private List<Long> contentsKeywordListIds = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

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
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public ContentsKeywordListServiceSelector contentsKeywordListIds(List<Long> contentsKeywordListIds) {
    this.contentsKeywordListIds = contentsKeywordListIds;
    return this;
  }

  public ContentsKeywordListServiceSelector addContentsKeywordListIdsItem(Long contentsKeywordListIdsItem) {
    if (this.contentsKeywordListIds == null) {
      this.contentsKeywordListIds = new ArrayList<>();
    }
    this.contentsKeywordListIds.add(contentsKeywordListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> 
   * @return contentsKeywordListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンテンツキーワードIDです。</div> <div lang=\"en\">Contents keyword ID.</div> ")

@Size(max=1000) 
  public List<Long> getContentsKeywordListIds() {
    return contentsKeywordListIds;
  }

  public void setContentsKeywordListIds(List<Long> contentsKeywordListIds) {
    this.contentsKeywordListIds = contentsKeywordListIds;
  }

  public ContentsKeywordListServiceSelector startIndex(Integer startIndex) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

