package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceProcessStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceSetting;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Videoオブジェクトは、動画情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Video object is a container for the information of videos.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Videoオブジェクトは、動画情報を保持します。</div> <div lang=\"en\">Video object is a container for the information of videos.</div> ")

public class Video   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<VideoServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("creationTime")
  private JsonNullable<String> creationTime = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("processStatus")
  private JsonNullable<VideoServiceProcessStatus> processStatus = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<VideoServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("videoName")
  private JsonNullable<String> videoName = JsonNullable.undefined();

  @JsonProperty("videoSetting")
  private JsonNullable<VideoServiceSetting> videoSetting = JsonNullable.undefined();

  @JsonProperty("videoTitle")
  private JsonNullable<String> videoTitle = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  public Video accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Video approvalStatus(VideoServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<VideoServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Video creationTime(String creationTime) {
    this.creationTime = JsonNullable.of(creationTime);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の入稿日時です。</div> <div lang=\"en\">Time and date when the video was submitted.</div> 
   * @return creationTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の入稿日時です。</div> <div lang=\"en\">Time and date when the video was submitted.</div> ")


  public JsonNullable<String> getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(JsonNullable<String> creationTime) {
    this.creationTime = creationTime;
  }

  public Video disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public Video addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の掲載拒否理由です。</div> <div lang=\"en\">Disapproval reason of the video.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の掲載拒否理由です。</div> <div lang=\"en\">Disapproval reason of the video.</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public Video mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Media ID.<br> This field is required in SET and REMOVE operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Media ID.<br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public Video processStatus(VideoServiceProcessStatus processStatus) {
    this.processStatus = JsonNullable.of(processStatus);
    return this;
  }

  /**
   * Get processStatus
   * @return processStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceProcessStatus> getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(JsonNullable<VideoServiceProcessStatus> processStatus) {
    this.processStatus = processStatus;
  }

  public Video userStatus(VideoServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<VideoServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public Video videoName(String videoName) {
    this.videoName = JsonNullable.of(videoName);
    return this;
  }

  /**
   * <div lang=\"ja\">動画のファイル名です。</div> <div lang=\"en\">Video file name.</div> 
   * @return videoName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画のファイル名です。</div> <div lang=\"en\">Video file name.</div> ")


  public JsonNullable<String> getVideoName() {
    return videoName;
  }

  public void setVideoName(JsonNullable<String> videoName) {
    this.videoName = videoName;
  }

  public Video videoSetting(VideoServiceSetting videoSetting) {
    this.videoSetting = JsonNullable.of(videoSetting);
    return this;
  }

  /**
   * Get videoSetting
   * @return videoSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceSetting> getVideoSetting() {
    return videoSetting;
  }

  public void setVideoSetting(JsonNullable<VideoServiceSetting> videoSetting) {
    this.videoSetting = videoSetting;
  }

  public Video videoTitle(String videoTitle) {
    this.videoTitle = JsonNullable.of(videoTitle);
    return this;
  }

  /**
   * <div lang=\"ja\"> 動画名です。<br> このフィールドは、SET時に省略可能となります。 </div> <div lang=\"en\"> Video name.<br> This field is optional in SET operation. </div> 
   * @return videoTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 動画名です。<br> このフィールドは、SET時に省略可能となります。 </div> <div lang=\"en\"> Video name.<br> This field is optional in SET operation. </div> ")


  public JsonNullable<String> getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(JsonNullable<String> videoTitle) {
    this.videoTitle = videoTitle;
  }

  public Video createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の作成日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date when the video was made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の作成日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date when the video was made.<br>* Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<String> createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.accountId, video.accountId) &&
        Objects.equals(this.approvalStatus, video.approvalStatus) &&
        Objects.equals(this.creationTime, video.creationTime) &&
        Objects.equals(this.disapprovalReasonCodes, video.disapprovalReasonCodes) &&
        Objects.equals(this.mediaId, video.mediaId) &&
        Objects.equals(this.processStatus, video.processStatus) &&
        Objects.equals(this.userStatus, video.userStatus) &&
        Objects.equals(this.videoName, video.videoName) &&
        Objects.equals(this.videoSetting, video.videoSetting) &&
        Objects.equals(this.videoTitle, video.videoTitle) &&
        Objects.equals(this.createdDate, video.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, creationTime, disapprovalReasonCodes, mediaId, processStatus, userStatus, videoName, videoSetting, videoTitle, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    videoSetting: ").append(toIndentedString(videoSetting)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

