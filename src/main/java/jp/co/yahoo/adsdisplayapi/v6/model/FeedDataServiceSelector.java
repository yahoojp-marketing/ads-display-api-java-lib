package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.FeedDataServiceFileUploadDateRange;
import jp.co.yahoo.adsdisplayapi.v6.model.FeedDataServiceFileUploadStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;get操作の検索条件を保持するオブジェクト&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceSelector object retains search condition of get operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">get操作の検索条件を保持するオブジェクト</div> <div lang=\"en\">FeedDataServiceSelector object retains search condition of get operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedDataServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("feedIds")
  @Valid
  private List<Long> feedIds = null;

  @JsonProperty("fileUploadDateRange")
  private FeedDataServiceFileUploadDateRange fileUploadDateRange = null;

  @JsonProperty("itemListUploadIds")
  @Valid
  private List<Long> itemListUploadIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("uploadStatuses")
  @Valid
  private List<FeedDataServiceFileUploadStatus> uploadStatuses = null;

  public FeedDataServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedDataServiceSelector feedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
    return this;
  }

  public FeedDataServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">FeedID</div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">FeedID</div> ")

@Size(max=200) 
  public List<Long> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }

  public FeedDataServiceSelector fileUploadDateRange(FeedDataServiceFileUploadDateRange fileUploadDateRange) {
    this.fileUploadDateRange = fileUploadDateRange;
    return this;
  }

  /**
   * Get fileUploadDateRange
   * @return fileUploadDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedDataServiceFileUploadDateRange getFileUploadDateRange() {
    return fileUploadDateRange;
  }

  public void setFileUploadDateRange(FeedDataServiceFileUploadDateRange fileUploadDateRange) {
    this.fileUploadDateRange = fileUploadDateRange;
  }

  public FeedDataServiceSelector itemListUploadIds(List<Long> itemListUploadIds) {
    this.itemListUploadIds = itemListUploadIds;
    return this;
  }

  public FeedDataServiceSelector addItemListUploadIdsItem(Long itemListUploadIdsItem) {
    if (this.itemListUploadIds == null) {
      this.itemListUploadIds = new ArrayList<>();
    }
    this.itemListUploadIds.add(itemListUploadIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードした商品情報ID</div> <div lang=\"en\">Uploaded item list ID.</div> 
   * @return itemListUploadIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードした商品情報ID</div> <div lang=\"en\">Uploaded item list ID.</div> ")

@Size(max=200) 
  public List<Long> getItemListUploadIds() {
    return itemListUploadIds;
  }

  public void setItemListUploadIds(List<Long> itemListUploadIds) {
    this.itemListUploadIds = itemListUploadIds;
  }

  public FeedDataServiceSelector numberResults(Integer numberResults) {
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

  public FeedDataServiceSelector startIndex(Integer startIndex) {
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

  public FeedDataServiceSelector uploadStatuses(List<FeedDataServiceFileUploadStatus> uploadStatuses) {
    this.uploadStatuses = uploadStatuses;
    return this;
  }

  public FeedDataServiceSelector addUploadStatusesItem(FeedDataServiceFileUploadStatus uploadStatusesItem) {
    if (this.uploadStatuses == null) {
      this.uploadStatuses = new ArrayList<>();
    }
    this.uploadStatuses.add(uploadStatusesItem);
    return this;
  }

  /**
   * Get uploadStatuses
   * @return uploadStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<FeedDataServiceFileUploadStatus> getUploadStatuses() {
    return uploadStatuses;
  }

  public void setUploadStatuses(List<FeedDataServiceFileUploadStatus> uploadStatuses) {
    this.uploadStatuses = uploadStatuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDataServiceSelector feedDataServiceSelector = (FeedDataServiceSelector) o;
    return Objects.equals(this.accountId, feedDataServiceSelector.accountId) &&
        Objects.equals(this.feedIds, feedDataServiceSelector.feedIds) &&
        Objects.equals(this.fileUploadDateRange, feedDataServiceSelector.fileUploadDateRange) &&
        Objects.equals(this.itemListUploadIds, feedDataServiceSelector.itemListUploadIds) &&
        Objects.equals(this.numberResults, feedDataServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, feedDataServiceSelector.startIndex) &&
        Objects.equals(this.uploadStatuses, feedDataServiceSelector.uploadStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedIds, fileUploadDateRange, itemListUploadIds, numberResults, startIndex, uploadStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDataServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    fileUploadDateRange: ").append(toIndentedString(fileUploadDateRange)).append("\n");
    sb.append("    itemListUploadIds: ").append(toIndentedString(itemListUploadIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    uploadStatuses: ").append(toIndentedString(uploadStatuses)).append("\n");
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

