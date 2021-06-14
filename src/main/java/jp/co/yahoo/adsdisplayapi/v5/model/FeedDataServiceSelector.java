package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceFileUploadDateRange;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceFileUploadStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;get操作の検索条件を保持するオブジェクト&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceSelector object retains search condition of get operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">get操作の検索条件を保持するオブジェクト</div> <div lang=\"en\">FeedDataServiceSelector object retains search condition of get operation.</div> ")

public class FeedDataServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("feedIds")
  @Valid
  private JsonNullable<List<Long>> feedIds = JsonNullable.undefined();

  @JsonProperty("fileUploadDateRange")
  private JsonNullable<FeedDataServiceFileUploadDateRange> fileUploadDateRange = JsonNullable.undefined();

  @JsonProperty("itemListUploadIds")
  @Valid
  private JsonNullable<List<Long>> itemListUploadIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("uploadStatuses")
  @Valid
  private JsonNullable<List<FeedDataServiceFileUploadStatus>> uploadStatuses = JsonNullable.undefined();

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
    this.feedIds = JsonNullable.of(feedIds);
    return this;
  }

  public FeedDataServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null || !this.feedIds.isPresent()) {
      this.feedIds = JsonNullable.of(new ArrayList<>());
    }
    this.feedIds.get().add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">FeedID</div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">FeedID</div> ")

@Size(max=200) 
  public JsonNullable<List<Long>> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(JsonNullable<List<Long>> feedIds) {
    this.feedIds = feedIds;
  }

  public FeedDataServiceSelector fileUploadDateRange(FeedDataServiceFileUploadDateRange fileUploadDateRange) {
    this.fileUploadDateRange = JsonNullable.of(fileUploadDateRange);
    return this;
  }

  /**
   * Get fileUploadDateRange
   * @return fileUploadDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedDataServiceFileUploadDateRange> getFileUploadDateRange() {
    return fileUploadDateRange;
  }

  public void setFileUploadDateRange(JsonNullable<FeedDataServiceFileUploadDateRange> fileUploadDateRange) {
    this.fileUploadDateRange = fileUploadDateRange;
  }

  public FeedDataServiceSelector itemListUploadIds(List<Long> itemListUploadIds) {
    this.itemListUploadIds = JsonNullable.of(itemListUploadIds);
    return this;
  }

  public FeedDataServiceSelector addItemListUploadIdsItem(Long itemListUploadIdsItem) {
    if (this.itemListUploadIds == null || !this.itemListUploadIds.isPresent()) {
      this.itemListUploadIds = JsonNullable.of(new ArrayList<>());
    }
    this.itemListUploadIds.get().add(itemListUploadIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードした商品情報ID</div> <div lang=\"en\">Uploaded item list ID.</div> 
   * @return itemListUploadIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードした商品情報ID</div> <div lang=\"en\">Uploaded item list ID.</div> ")

@Size(max=200) 
  public JsonNullable<List<Long>> getItemListUploadIds() {
    return itemListUploadIds;
  }

  public void setItemListUploadIds(JsonNullable<List<Long>> itemListUploadIds) {
    this.itemListUploadIds = itemListUploadIds;
  }

  public FeedDataServiceSelector numberResults(Integer numberResults) {
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

  public FeedDataServiceSelector startIndex(Integer startIndex) {
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

  public FeedDataServiceSelector uploadStatuses(List<FeedDataServiceFileUploadStatus> uploadStatuses) {
    this.uploadStatuses = JsonNullable.of(uploadStatuses);
    return this;
  }

  public FeedDataServiceSelector addUploadStatusesItem(FeedDataServiceFileUploadStatus uploadStatusesItem) {
    if (this.uploadStatuses == null || !this.uploadStatuses.isPresent()) {
      this.uploadStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.uploadStatuses.get().add(uploadStatusesItem);
    return this;
  }

  /**
   * Get uploadStatuses
   * @return uploadStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public JsonNullable<List<FeedDataServiceFileUploadStatus>> getUploadStatuses() {
    return uploadStatuses;
  }

  public void setUploadStatuses(JsonNullable<List<FeedDataServiceFileUploadStatus>> uploadStatuses) {
    this.uploadStatuses = uploadStatuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

