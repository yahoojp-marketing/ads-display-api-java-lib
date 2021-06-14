package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceFileUploadSrc;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceFileUploadStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedDataServiceItemListUploadType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedDataServiceRecordオブジェクトは、アップロードした商品情報(ファイル形式)の状態を保持する。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceRecord object retains status of uploaded item list(file format).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedDataServiceRecordオブジェクトは、アップロードした商品情報(ファイル形式)の状態を保持する。</div> <div lang=\"en\">FeedDataServiceRecord object retains status of uploaded item list(file format).</div> ")

public class FeedDataServiceRecord   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("completeDate")
  private JsonNullable<String> completeDate = JsonNullable.undefined();

  @JsonProperty("errorCount")
  private JsonNullable<Long> errorCount = JsonNullable.undefined();

  @JsonProperty("errorRate")
  private JsonNullable<Double> errorRate = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("fileUploadSrc")
  private JsonNullable<FeedDataServiceFileUploadSrc> fileUploadSrc = JsonNullable.undefined();

  @JsonProperty("fileUploadStatus")
  private JsonNullable<FeedDataServiceFileUploadStatus> fileUploadStatus = JsonNullable.undefined();

  @JsonProperty("isDebug")
  private JsonNullable<Boolean> isDebug = JsonNullable.undefined();

  @JsonProperty("itemListUploadId")
  private JsonNullable<Long> itemListUploadId = JsonNullable.undefined();

  @JsonProperty("itemListUploadType")
  private JsonNullable<FeedDataServiceItemListUploadType> itemListUploadType = JsonNullable.undefined();

  @JsonProperty("uploadDate")
  private JsonNullable<String> uploadDate = JsonNullable.undefined();

  public FeedDataServiceRecord accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public FeedDataServiceRecord completeDate(String completeDate) {
    this.completeDate = JsonNullable.of(completeDate);
    return this;
  }

  /**
   * <div lang=\"ja\">取り込み完了日(yyyyMMdd)</div> <div lang=\"en\"> Complete date.<br> Format: yyyyMMdd </div> 
   * @return completeDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取り込み完了日(yyyyMMdd)</div> <div lang=\"en\"> Complete date.<br> Format: yyyyMMdd </div> ")


  public JsonNullable<String> getCompleteDate() {
    return completeDate;
  }

  public void setCompleteDate(JsonNullable<String> completeDate) {
    this.completeDate = completeDate;
  }

  public FeedDataServiceRecord errorCount(Long errorCount) {
    this.errorCount = JsonNullable.of(errorCount);
    return this;
  }

  /**
   * <div lang=\"ja\">不備がある商品情報の件数</div> <div lang=\"en\">Number of item list with error.</div> 
   * @return errorCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">不備がある商品情報の件数</div> <div lang=\"en\">Number of item list with error.</div> ")


  public JsonNullable<Long> getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(JsonNullable<Long> errorCount) {
    this.errorCount = errorCount;
  }

  public FeedDataServiceRecord errorRate(Double errorRate) {
    this.errorRate = JsonNullable.of(errorRate);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー率</div> <div lang=\"en\">Error rate.</div> 
   * @return errorRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー率</div> <div lang=\"en\">Error rate.</div> ")


  public JsonNullable<Double> getErrorRate() {
    return errorRate;
  }

  public void setErrorRate(JsonNullable<Double> errorRate) {
    this.errorRate = errorRate;
  }

  public FeedDataServiceRecord feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\">Feedを識別するId</div> <div lang=\"en\">Feed ID.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedを識別するId</div> <div lang=\"en\">Feed ID.</div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public FeedDataServiceRecord fileUploadSrc(FeedDataServiceFileUploadSrc fileUploadSrc) {
    this.fileUploadSrc = JsonNullable.of(fileUploadSrc);
    return this;
  }

  /**
   * Get fileUploadSrc
   * @return fileUploadSrc
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedDataServiceFileUploadSrc> getFileUploadSrc() {
    return fileUploadSrc;
  }

  public void setFileUploadSrc(JsonNullable<FeedDataServiceFileUploadSrc> fileUploadSrc) {
    this.fileUploadSrc = fileUploadSrc;
  }

  public FeedDataServiceRecord fileUploadStatus(FeedDataServiceFileUploadStatus fileUploadStatus) {
    this.fileUploadStatus = JsonNullable.of(fileUploadStatus);
    return this;
  }

  /**
   * Get fileUploadStatus
   * @return fileUploadStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedDataServiceFileUploadStatus> getFileUploadStatus() {
    return fileUploadStatus;
  }

  public void setFileUploadStatus(JsonNullable<FeedDataServiceFileUploadStatus> fileUploadStatus) {
    this.fileUploadStatus = fileUploadStatus;
  }

  public FeedDataServiceRecord isDebug(Boolean isDebug) {
    this.isDebug = JsonNullable.of(isDebug);
    return this;
  }

  /**
   * <div lang=\"ja\">trueはデバッグモードでの実行を意味します。</div> <div lang=\"en\">&#34;true&#34; means to run in debug mode.</div> 
   * @return isDebug
  */
  @ApiModelProperty(value = "<div lang=\"ja\">trueはデバッグモードでの実行を意味します。</div> <div lang=\"en\">&#34;true&#34; means to run in debug mode.</div> ")


  public JsonNullable<Boolean> getIsDebug() {
    return isDebug;
  }

  public void setIsDebug(JsonNullable<Boolean> isDebug) {
    this.isDebug = isDebug;
  }

  public FeedDataServiceRecord itemListUploadId(Long itemListUploadId) {
    this.itemListUploadId = JsonNullable.of(itemListUploadId);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードした商品情報を識別するID</div> <div lang=\"en\">Uploaded item list ID.</div> 
   * @return itemListUploadId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードした商品情報を識別するID</div> <div lang=\"en\">Uploaded item list ID.</div> ")


  public JsonNullable<Long> getItemListUploadId() {
    return itemListUploadId;
  }

  public void setItemListUploadId(JsonNullable<Long> itemListUploadId) {
    this.itemListUploadId = itemListUploadId;
  }

  public FeedDataServiceRecord itemListUploadType(FeedDataServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = JsonNullable.of(itemListUploadType);
    return this;
  }

  /**
   * Get itemListUploadType
   * @return itemListUploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedDataServiceItemListUploadType> getItemListUploadType() {
    return itemListUploadType;
  }

  public void setItemListUploadType(JsonNullable<FeedDataServiceItemListUploadType> itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
  }

  public FeedDataServiceRecord uploadDate(String uploadDate) {
    this.uploadDate = JsonNullable.of(uploadDate);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード日(yyyyMMdd)</div> <div lang=\"en\"> Upload date.<br> Format: yyyyMMdd </div> 
   * @return uploadDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日(yyyyMMdd)</div> <div lang=\"en\"> Upload date.<br> Format: yyyyMMdd </div> ")


  public JsonNullable<String> getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(JsonNullable<String> uploadDate) {
    this.uploadDate = uploadDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDataServiceRecord feedDataServiceRecord = (FeedDataServiceRecord) o;
    return Objects.equals(this.accountId, feedDataServiceRecord.accountId) &&
        Objects.equals(this.completeDate, feedDataServiceRecord.completeDate) &&
        Objects.equals(this.errorCount, feedDataServiceRecord.errorCount) &&
        Objects.equals(this.errorRate, feedDataServiceRecord.errorRate) &&
        Objects.equals(this.feedId, feedDataServiceRecord.feedId) &&
        Objects.equals(this.fileUploadSrc, feedDataServiceRecord.fileUploadSrc) &&
        Objects.equals(this.fileUploadStatus, feedDataServiceRecord.fileUploadStatus) &&
        Objects.equals(this.isDebug, feedDataServiceRecord.isDebug) &&
        Objects.equals(this.itemListUploadId, feedDataServiceRecord.itemListUploadId) &&
        Objects.equals(this.itemListUploadType, feedDataServiceRecord.itemListUploadType) &&
        Objects.equals(this.uploadDate, feedDataServiceRecord.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completeDate, errorCount, errorRate, feedId, fileUploadSrc, fileUploadStatus, isDebug, itemListUploadId, itemListUploadType, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDataServiceRecord {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    completeDate: ").append(toIndentedString(completeDate)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorRate: ").append(toIndentedString(errorRate)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    fileUploadSrc: ").append(toIndentedString(fileUploadSrc)).append("\n");
    sb.append("    fileUploadStatus: ").append(toIndentedString(fileUploadStatus)).append("\n");
    sb.append("    isDebug: ").append(toIndentedString(isDebug)).append("\n");
    sb.append("    itemListUploadId: ").append(toIndentedString(itemListUploadId)).append("\n");
    sb.append("    itemListUploadType: ").append(toIndentedString(itemListUploadType)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
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

