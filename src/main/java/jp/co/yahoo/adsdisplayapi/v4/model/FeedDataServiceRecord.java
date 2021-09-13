package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.FeedDataServiceFileUploadSrc;
import jp.co.yahoo.adsdisplayapi.v4.model.FeedDataServiceFileUploadStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.FeedDataServiceItemListUploadType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedDataServiceRecordオブジェクトは、アップロードした商品情報(ファイル形式)の状態を保持する。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceRecord object retains status of uploaded item list(file format).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedDataServiceRecordオブジェクトは、アップロードした商品情報(ファイル形式)の状態を保持する。</div> <div lang=\"en\">FeedDataServiceRecord object retains status of uploaded item list(file format).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedDataServiceRecord   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("completeDate")
  private String completeDate = null;

  @JsonProperty("errorCount")
  private Long errorCount = null;

  @JsonProperty("errorRate")
  private Double errorRate = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("fileUploadSrc")
  private FeedDataServiceFileUploadSrc fileUploadSrc = null;

  @JsonProperty("fileUploadStatus")
  private FeedDataServiceFileUploadStatus fileUploadStatus = null;

  @JsonProperty("isDebug")
  private Boolean isDebug = null;

  @JsonProperty("itemListUploadId")
  private Long itemListUploadId = null;

  @JsonProperty("itemListUploadType")
  private FeedDataServiceItemListUploadType itemListUploadType = null;

  @JsonProperty("uploadDate")
  private String uploadDate = null;

  public FeedDataServiceRecord accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedDataServiceRecord completeDate(String completeDate) {
    this.completeDate = completeDate;
    return this;
  }

  /**
   * <div lang=\"ja\">取り込み完了日(yyyyMMdd)</div> <div lang=\"en\"> Complete date.<br> Format: yyyyMMdd </div> 
   * @return completeDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取り込み完了日(yyyyMMdd)</div> <div lang=\"en\"> Complete date.<br> Format: yyyyMMdd </div> ")


  public String getCompleteDate() {
    return completeDate;
  }

  public void setCompleteDate(String completeDate) {
    this.completeDate = completeDate;
  }

  public FeedDataServiceRecord errorCount(Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * <div lang=\"ja\">不備がある商品情報の件数</div> <div lang=\"en\">Number of item list with error.</div> 
   * @return errorCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">不備がある商品情報の件数</div> <div lang=\"en\">Number of item list with error.</div> ")


  public Long getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Long errorCount) {
    this.errorCount = errorCount;
  }

  public FeedDataServiceRecord errorRate(Double errorRate) {
    this.errorRate = errorRate;
    return this;
  }

  /**
   * <div lang=\"ja\">エラー率</div> <div lang=\"en\">Error rate.</div> 
   * @return errorRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー率</div> <div lang=\"en\">Error rate.</div> ")


  public Double getErrorRate() {
    return errorRate;
  }

  public void setErrorRate(Double errorRate) {
    this.errorRate = errorRate;
  }

  public FeedDataServiceRecord feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">Feedを識別するId</div> <div lang=\"en\">Feed ID.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedを識別するId</div> <div lang=\"en\">Feed ID.</div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public FeedDataServiceRecord fileUploadSrc(FeedDataServiceFileUploadSrc fileUploadSrc) {
    this.fileUploadSrc = fileUploadSrc;
    return this;
  }

  /**
   * Get fileUploadSrc
   * @return fileUploadSrc
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedDataServiceFileUploadSrc getFileUploadSrc() {
    return fileUploadSrc;
  }

  public void setFileUploadSrc(FeedDataServiceFileUploadSrc fileUploadSrc) {
    this.fileUploadSrc = fileUploadSrc;
  }

  public FeedDataServiceRecord fileUploadStatus(FeedDataServiceFileUploadStatus fileUploadStatus) {
    this.fileUploadStatus = fileUploadStatus;
    return this;
  }

  /**
   * Get fileUploadStatus
   * @return fileUploadStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedDataServiceFileUploadStatus getFileUploadStatus() {
    return fileUploadStatus;
  }

  public void setFileUploadStatus(FeedDataServiceFileUploadStatus fileUploadStatus) {
    this.fileUploadStatus = fileUploadStatus;
  }

  public FeedDataServiceRecord isDebug(Boolean isDebug) {
    this.isDebug = isDebug;
    return this;
  }

  /**
   * <div lang=\"ja\">trueはデバッグモードでの実行を意味します。</div> <div lang=\"en\">&#34;true&#34; means to run in debug mode.</div> 
   * @return isDebug
  */
  @ApiModelProperty(value = "<div lang=\"ja\">trueはデバッグモードでの実行を意味します。</div> <div lang=\"en\">&#34;true&#34; means to run in debug mode.</div> ")


  public Boolean getIsDebug() {
    return isDebug;
  }

  public void setIsDebug(Boolean isDebug) {
    this.isDebug = isDebug;
  }

  public FeedDataServiceRecord itemListUploadId(Long itemListUploadId) {
    this.itemListUploadId = itemListUploadId;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードした商品情報を識別するID</div> <div lang=\"en\">Uploaded item list ID.</div> 
   * @return itemListUploadId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードした商品情報を識別するID</div> <div lang=\"en\">Uploaded item list ID.</div> ")


  public Long getItemListUploadId() {
    return itemListUploadId;
  }

  public void setItemListUploadId(Long itemListUploadId) {
    this.itemListUploadId = itemListUploadId;
  }

  public FeedDataServiceRecord itemListUploadType(FeedDataServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
    return this;
  }

  /**
   * Get itemListUploadType
   * @return itemListUploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedDataServiceItemListUploadType getItemListUploadType() {
    return itemListUploadType;
  }

  public void setItemListUploadType(FeedDataServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
  }

  public FeedDataServiceRecord uploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード日(yyyyMMdd)</div> <div lang=\"en\"> Upload date.<br> Format: yyyyMMdd </div> 
   * @return uploadDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日(yyyyMMdd)</div> <div lang=\"en\"> Upload date.<br> Format: yyyyMMdd </div> ")


  public String getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

