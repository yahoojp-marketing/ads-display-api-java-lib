package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceProcessStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceSelectorオブジェクトは、入稿済みの動画の情報を取得します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The VideoServiceSelector object is a container for storing added video information and filtering condition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceSelectorオブジェクトは、入稿済みの動画の情報を取得します。</div> <div lang=\"en\">The VideoServiceSelector object is a container for storing added video information and filtering condition.</div> ")

public class VideoServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("approvalStatuses")
  @Valid
  private JsonNullable<List<VideoServiceApprovalStatus>> approvalStatuses = JsonNullable.undefined();

  @JsonProperty("mediaIds")
  @Valid
  private JsonNullable<List<Long>> mediaIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("processStatuses")
  @Valid
  private JsonNullable<List<VideoServiceProcessStatus>> processStatuses = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("userStatuses")
  @Valid
  private JsonNullable<List<VideoServiceUserStatus>> userStatuses = JsonNullable.undefined();

  @JsonProperty("createdDateRange")
  private JsonNullable<VideoServiceCreatedDateRange> createdDateRange = JsonNullable.undefined();

  public VideoServiceSelector accountId(Long accountId) {
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

  public VideoServiceSelector approvalStatuses(List<VideoServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = JsonNullable.of(approvalStatuses);
    return this;
  }

  public VideoServiceSelector addApprovalStatusesItem(VideoServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null || !this.approvalStatuses.isPresent()) {
      this.approvalStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.approvalStatuses.get().add(approvalStatusesItem);
    return this;
  }

  /**
   * Get approvalStatuses
   * @return approvalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public JsonNullable<List<VideoServiceApprovalStatus>> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(JsonNullable<List<VideoServiceApprovalStatus>> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public VideoServiceSelector mediaIds(List<Long> mediaIds) {
    this.mediaIds = JsonNullable.of(mediaIds);
    return this;
  }

  public VideoServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null || !this.mediaIds.isPresent()) {
      this.mediaIds = JsonNullable.of(new ArrayList<>());
    }
    this.mediaIds.get().add(mediaIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">メディアIDです。</div> <div lang=\"en\">Media ID.</div> 
   * @return mediaIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアIDです。</div> <div lang=\"en\">Media ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(JsonNullable<List<Long>> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public VideoServiceSelector numberResults(Integer numberResults) {
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

  public VideoServiceSelector processStatuses(List<VideoServiceProcessStatus> processStatuses) {
    this.processStatuses = JsonNullable.of(processStatuses);
    return this;
  }

  public VideoServiceSelector addProcessStatusesItem(VideoServiceProcessStatus processStatusesItem) {
    if (this.processStatuses == null || !this.processStatuses.isPresent()) {
      this.processStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.processStatuses.get().add(processStatusesItem);
    return this;
  }

  /**
   * Get processStatuses
   * @return processStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public JsonNullable<List<VideoServiceProcessStatus>> getProcessStatuses() {
    return processStatuses;
  }

  public void setProcessStatuses(JsonNullable<List<VideoServiceProcessStatus>> processStatuses) {
    this.processStatuses = processStatuses;
  }

  public VideoServiceSelector startIndex(Integer startIndex) {
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

  public VideoServiceSelector userStatuses(List<VideoServiceUserStatus> userStatuses) {
    this.userStatuses = JsonNullable.of(userStatuses);
    return this;
  }

  public VideoServiceSelector addUserStatusesItem(VideoServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null || !this.userStatuses.isPresent()) {
      this.userStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.userStatuses.get().add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<VideoServiceUserStatus>> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(JsonNullable<List<VideoServiceUserStatus>> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public VideoServiceSelector createdDateRange(VideoServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = JsonNullable.of(createdDateRange);
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceCreatedDateRange> getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(JsonNullable<VideoServiceCreatedDateRange> createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.numberResults, videoServiceSelector.numberResults) &&
        Objects.equals(this.processStatuses, videoServiceSelector.processStatuses) &&
        Objects.equals(this.startIndex, videoServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, videoServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, videoServiceSelector.createdDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatuses, mediaIds, numberResults, processStatuses, startIndex, userStatuses, createdDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    processStatuses: ").append(toIndentedString(processStatuses)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

