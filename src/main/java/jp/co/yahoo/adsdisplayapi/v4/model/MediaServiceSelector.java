package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.MediaServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.MediaServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v4.model.MediaServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MediaServiceSelectorオブジェクトは、操作の対象とする画像およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The MediaServiceSelector object serves operation target media and filtering condition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">MediaServiceSelectorオブジェクトは、操作の対象とする画像およびフィルタ条件を表します。</div> <div lang=\"en\">The MediaServiceSelector object serves operation target media and filtering condition.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MediaServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("approvalStatuses")
  @Valid
  private List<MediaServiceApprovalStatus> approvalStatuses = null;

  @JsonProperty("mediaIds")
  @Valid
  private List<Long> mediaIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<MediaServiceUserStatus> userStatuses = null;

  @JsonProperty("createdDateRange")
  private MediaServiceCreatedDateRange createdDateRange = null;

  public MediaServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public MediaServiceSelector approvalStatuses(List<MediaServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public MediaServiceSelector addApprovalStatusesItem(MediaServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null) {
      this.approvalStatuses = new ArrayList<>();
    }
    this.approvalStatuses.add(approvalStatusesItem);
    return this;
  }

  /**
   * Get approvalStatuses
   * @return approvalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<MediaServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(List<MediaServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public MediaServiceSelector mediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public MediaServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">画像IDです。</div> <div lang=\"en\">The media ID.</div> 
   * @return mediaIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像IDです。</div> <div lang=\"en\">The media ID.</div> ")

@Size(max=500) 
  public List<Long> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public MediaServiceSelector numberResults(Integer numberResults) {
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

  public MediaServiceSelector startIndex(Integer startIndex) {
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

  public MediaServiceSelector userStatuses(List<MediaServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  public MediaServiceSelector addUserStatusesItem(MediaServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null) {
      this.userStatuses = new ArrayList<>();
    }
    this.userStatuses.add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<MediaServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(List<MediaServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public MediaServiceSelector createdDateRange(MediaServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public MediaServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(MediaServiceCreatedDateRange createdDateRange) {
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
    MediaServiceSelector mediaServiceSelector = (MediaServiceSelector) o;
    return Objects.equals(this.accountId, mediaServiceSelector.accountId) &&
        Objects.equals(this.approvalStatuses, mediaServiceSelector.approvalStatuses) &&
        Objects.equals(this.mediaIds, mediaServiceSelector.mediaIds) &&
        Objects.equals(this.numberResults, mediaServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, mediaServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, mediaServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, mediaServiceSelector.createdDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatuses, mediaIds, numberResults, startIndex, userStatuses, createdDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
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

