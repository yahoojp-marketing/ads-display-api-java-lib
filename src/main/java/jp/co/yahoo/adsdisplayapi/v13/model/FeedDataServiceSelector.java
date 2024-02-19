/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v13.model.FeedDataServiceFileUploadDateRange;
import jp.co.yahoo.adsdisplayapi.v13.model.FeedDataServiceFileUploadStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;get操作の検索条件を保持するオブジェクト&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedDataServiceSelector object retains search condition of get operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">get操作の検索条件を保持するオブジェクト</div> <div lang=\"en\">FeedDataServiceSelector object retains search condition of get operation.</div> ")
@JsonPropertyOrder({
  FeedDataServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  FeedDataServiceSelector.JSON_PROPERTY_FEED_IDS,
  FeedDataServiceSelector.JSON_PROPERTY_FILE_UPLOAD_DATE_RANGE,
  FeedDataServiceSelector.JSON_PROPERTY_ITEM_LIST_UPLOAD_IDS,
  FeedDataServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  FeedDataServiceSelector.JSON_PROPERTY_START_INDEX,
  FeedDataServiceSelector.JSON_PROPERTY_UPLOAD_STATUSES
})
@JsonTypeName("FeedDataServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedDataServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_FEED_IDS = "feedIds";
  private List<Long> feedIds = null;

  public static final String JSON_PROPERTY_FILE_UPLOAD_DATE_RANGE = "fileUploadDateRange";
  private FeedDataServiceFileUploadDateRange fileUploadDateRange;

  public static final String JSON_PROPERTY_ITEM_LIST_UPLOAD_IDS = "itemListUploadIds";
  private List<Long> itemListUploadIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 20;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_UPLOAD_STATUSES = "uploadStatuses";
  private List<FeedDataServiceFileUploadStatus> uploadStatuses = null;

  public FeedDataServiceSelector() { 
  }

  public FeedDataServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;/div&gt; 
   * @return feedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID.</div> ")
  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedIds() {
    return feedIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedDataServiceFileUploadDateRange getFileUploadDateRange() {
    return fileUploadDateRange;
  }


  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードした商品情報ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Uploaded item list ID.&lt;/div&gt; 
   * @return itemListUploadIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードした商品情報ID</div> <div lang=\"en\">Uploaded item list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getItemListUploadIds() {
    return itemListUploadIds;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_LIST_UPLOAD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemListUploadIds(List<Long> itemListUploadIds) {
    this.itemListUploadIds = itemListUploadIds;
  }


  public FeedDataServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public FeedDataServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 0.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedDataServiceFileUploadStatus> getUploadStatuses() {
    return uploadStatuses;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

