/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v15.model.FeedDataServiceFileUploadSource;
import jp.co.yahoo.adsdisplayapi.v15.model.FeedDataServiceFileUploadStatus;
import jp.co.yahoo.adsdisplayapi.v15.model.FeedDataServiceItemListUploadType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedDataServiceRecordオブジェクトは、アップロードした商品情報(ファイル形式)の状態を保持する。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceRecord object retains status of uploaded item list(file format).&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedDataServiceRecord.JSON_PROPERTY_ACCOUNT_ID,
  FeedDataServiceRecord.JSON_PROPERTY_COMPLETE_DATE,
  FeedDataServiceRecord.JSON_PROPERTY_ERROR_COUNT,
  FeedDataServiceRecord.JSON_PROPERTY_ERROR_RATE,
  FeedDataServiceRecord.JSON_PROPERTY_FEED_ID,
  FeedDataServiceRecord.JSON_PROPERTY_FILE_UPLOAD_SOURCE,
  FeedDataServiceRecord.JSON_PROPERTY_FILE_UPLOAD_STATUS,
  FeedDataServiceRecord.JSON_PROPERTY_IS_DEBUG,
  FeedDataServiceRecord.JSON_PROPERTY_ITEM_LIST_UPLOAD_ID,
  FeedDataServiceRecord.JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE,
  FeedDataServiceRecord.JSON_PROPERTY_UPLOAD_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedDataServiceRecord {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_COMPLETE_DATE = "completeDate";
  private String completeDate;

  public static final String JSON_PROPERTY_ERROR_COUNT = "errorCount";
  private Long errorCount;

  public static final String JSON_PROPERTY_ERROR_RATE = "errorRate";
  private Double errorRate;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FILE_UPLOAD_SOURCE = "fileUploadSource";
  private FeedDataServiceFileUploadSource fileUploadSource;

  public static final String JSON_PROPERTY_FILE_UPLOAD_STATUS = "fileUploadStatus";
  private FeedDataServiceFileUploadStatus fileUploadStatus;

  public static final String JSON_PROPERTY_IS_DEBUG = "isDebug";
  private Boolean isDebug;

  public static final String JSON_PROPERTY_ITEM_LIST_UPLOAD_ID = "itemListUploadId";
  private Long itemListUploadId;

  public static final String JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE = "itemListUploadType";
  private FeedDataServiceItemListUploadType itemListUploadType;

  public static final String JSON_PROPERTY_UPLOAD_DATE = "uploadDate";
  private String uploadDate;

  public FeedDataServiceRecord() {
  }

  public FeedDataServiceRecord accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public FeedDataServiceRecord completeDate(String completeDate) {
    
    this.completeDate = completeDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取り込み完了日(yyyyMMdd)&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Complete date.&lt;br&gt; Format: yyyyMMdd &lt;/div&gt; 
   * @return completeDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompleteDate() {
    return completeDate;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleteDate(String completeDate) {
    this.completeDate = completeDate;
  }


  public FeedDataServiceRecord errorCount(Long errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;不備がある商品情報の件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of item list with error.&lt;/div&gt; 
   * @return errorCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getErrorCount() {
    return errorCount;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCount(Long errorCount) {
    this.errorCount = errorCount;
  }


  public FeedDataServiceRecord errorRate(Double errorRate) {
    
    this.errorRate = errorRate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エラー率&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Error rate.&lt;/div&gt; 
   * @return errorRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getErrorRate() {
    return errorRate;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorRate(Double errorRate) {
    this.errorRate = errorRate;
  }


  public FeedDataServiceRecord feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedを識別するId&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public FeedDataServiceRecord fileUploadSource(FeedDataServiceFileUploadSource fileUploadSource) {
    
    this.fileUploadSource = fileUploadSource;
    return this;
  }

   /**
   * Get fileUploadSource
   * @return fileUploadSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedDataServiceFileUploadSource getFileUploadSource() {
    return fileUploadSource;
  }


  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileUploadSource(FeedDataServiceFileUploadSource fileUploadSource) {
    this.fileUploadSource = fileUploadSource;
  }


  public FeedDataServiceRecord fileUploadStatus(FeedDataServiceFileUploadStatus fileUploadStatus) {
    
    this.fileUploadStatus = fileUploadStatus;
    return this;
  }

   /**
   * Get fileUploadStatus
   * @return fileUploadStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedDataServiceFileUploadStatus getFileUploadStatus() {
    return fileUploadStatus;
  }


  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileUploadStatus(FeedDataServiceFileUploadStatus fileUploadStatus) {
    this.fileUploadStatus = fileUploadStatus;
  }


  public FeedDataServiceRecord isDebug(Boolean isDebug) {
    
    this.isDebug = isDebug;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;trueはデバッグモードでの実行を意味します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;&amp;#34;true&amp;#34; means to run in debug mode.&lt;/div&gt; 
   * @return isDebug
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEBUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDebug() {
    return isDebug;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEBUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDebug(Boolean isDebug) {
    this.isDebug = isDebug;
  }


  public FeedDataServiceRecord itemListUploadId(Long itemListUploadId) {
    
    this.itemListUploadId = itemListUploadId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードした商品情報を識別するID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Uploaded item list ID.&lt;/div&gt; 
   * @return itemListUploadId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getItemListUploadId() {
    return itemListUploadId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedDataServiceItemListUploadType getItemListUploadType() {
    return itemListUploadType;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemListUploadType(FeedDataServiceItemListUploadType itemListUploadType) {
    this.itemListUploadType = itemListUploadType;
  }


  public FeedDataServiceRecord uploadDate(String uploadDate) {
    
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロード日(yyyyMMdd)&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Upload date.&lt;br&gt; Format: yyyyMMdd &lt;/div&gt; 
   * @return uploadDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadDate() {
    return uploadDate;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.fileUploadSource, feedDataServiceRecord.fileUploadSource) &&
        Objects.equals(this.fileUploadStatus, feedDataServiceRecord.fileUploadStatus) &&
        Objects.equals(this.isDebug, feedDataServiceRecord.isDebug) &&
        Objects.equals(this.itemListUploadId, feedDataServiceRecord.itemListUploadId) &&
        Objects.equals(this.itemListUploadType, feedDataServiceRecord.itemListUploadType) &&
        Objects.equals(this.uploadDate, feedDataServiceRecord.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completeDate, errorCount, errorRate, feedId, fileUploadSource, fileUploadStatus, isDebug, itemListUploadId, itemListUploadType, uploadDate);
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
    sb.append("    fileUploadSource: ").append(toIndentedString(fileUploadSource)).append("\n");
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

