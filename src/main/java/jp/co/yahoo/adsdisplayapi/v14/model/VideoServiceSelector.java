/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.VideoServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v14.model.VideoServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v14.model.VideoServiceProcessStatus;
import jp.co.yahoo.adsdisplayapi.v14.model.VideoServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceSelectorオブジェクトは、入稿済みの動画の情報を取得します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The VideoServiceSelector object is a container for storing added video information and filtering condition.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  VideoServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  VideoServiceSelector.JSON_PROPERTY_APPROVAL_STATUSES,
  VideoServiceSelector.JSON_PROPERTY_MEDIA_IDS,
  VideoServiceSelector.JSON_PROPERTY_PROCESS_STATUSES,
  VideoServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  VideoServiceSelector.JSON_PROPERTY_START_INDEX,
  VideoServiceSelector.JSON_PROPERTY_USER_STATUSES,
  VideoServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVAL_STATUSES = "approvalStatuses";
  private List<VideoServiceApprovalStatus> approvalStatuses;

  public static final String JSON_PROPERTY_MEDIA_IDS = "mediaIds";
  private List<Long> mediaIds;

  public static final String JSON_PROPERTY_PROCESS_STATUSES = "processStatuses";
  private List<VideoServiceProcessStatus> processStatuses;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<VideoServiceUserStatus> userStatuses;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private VideoServiceCreatedDateRange createdDateRange;

  public VideoServiceSelector() {
  }

  public VideoServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
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


  public VideoServiceSelector approvalStatuses(List<VideoServiceApprovalStatus> approvalStatuses) {
    
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public VideoServiceSelector addApprovalStatusesItem(VideoServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null) {
      this.approvalStatuses = new ArrayList<>();
    }
    this.approvalStatuses.add(approvalStatusesItem);
    return this;
  }

   /**
   * Get approvalStatuses
   * @return approvalStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VideoServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatuses(List<VideoServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }


  public VideoServiceSelector mediaIds(List<Long> mediaIds) {
    
    this.mediaIds = mediaIds;
    return this;
  }

  public VideoServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディアIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID.&lt;/div&gt; 
   * @return mediaIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getMediaIds() {
    return mediaIds;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
  }


  public VideoServiceSelector processStatuses(List<VideoServiceProcessStatus> processStatuses) {
    
    this.processStatuses = processStatuses;
    return this;
  }

  public VideoServiceSelector addProcessStatusesItem(VideoServiceProcessStatus processStatusesItem) {
    if (this.processStatuses == null) {
      this.processStatuses = new ArrayList<>();
    }
    this.processStatuses.add(processStatusesItem);
    return this;
  }

   /**
   * Get processStatuses
   * @return processStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESS_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VideoServiceProcessStatus> getProcessStatuses() {
    return processStatuses;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessStatuses(List<VideoServiceProcessStatus> processStatuses) {
    this.processStatuses = processStatuses;
  }


  public VideoServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
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


  public VideoServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
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


  public VideoServiceSelector userStatuses(List<VideoServiceUserStatus> userStatuses) {
    
    this.userStatuses = userStatuses;
    return this;
  }

  public VideoServiceSelector addUserStatusesItem(VideoServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null) {
      this.userStatuses = new ArrayList<>();
    }
    this.userStatuses.add(userStatusesItem);
    return this;
  }

   /**
   * Get userStatuses
   * @return userStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VideoServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatuses(List<VideoServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }


  public VideoServiceSelector createdDateRange(VideoServiceCreatedDateRange createdDateRange) {
    
    this.createdDateRange = createdDateRange;
    return this;
  }

   /**
   * Get createdDateRange
   * @return createdDateRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateRange(VideoServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceSelector videoServiceSelector = (VideoServiceSelector) o;
    return Objects.equals(this.accountId, videoServiceSelector.accountId) &&
        Objects.equals(this.approvalStatuses, videoServiceSelector.approvalStatuses) &&
        Objects.equals(this.mediaIds, videoServiceSelector.mediaIds) &&
        Objects.equals(this.processStatuses, videoServiceSelector.processStatuses) &&
        Objects.equals(this.numberResults, videoServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, videoServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, videoServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, videoServiceSelector.createdDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatuses, mediaIds, processStatuses, numberResults, startIndex, userStatuses, createdDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    processStatuses: ").append(toIndentedString(processStatuses)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
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

