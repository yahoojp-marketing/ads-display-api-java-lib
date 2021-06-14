package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VideoServiceUploadData
 */

public class VideoServiceUploadData   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("videoName")
  private JsonNullable<String> videoName = JsonNullable.undefined();

  @JsonProperty("videoTitle")
  private JsonNullable<String> videoTitle = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<VideoServiceUserStatus> userStatus = JsonNullable.undefined();

  public VideoServiceUploadData accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public VideoServiceUploadData mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public VideoServiceUploadData videoName(String videoName) {
    this.videoName = JsonNullable.of(videoName);
    return this;
  }

  /**
   * <div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> 
   * @return videoName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> ")


  public JsonNullable<String> getVideoName() {
    return videoName;
  }

  public void setVideoName(JsonNullable<String> videoName) {
    this.videoName = videoName;
  }

  public VideoServiceUploadData videoTitle(String videoTitle) {
    this.videoTitle = JsonNullable.of(videoTitle);
    return this;
  }

  /**
   * <div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title</div> 
   * @return videoTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title</div> ")


  public JsonNullable<String> getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(JsonNullable<String> videoTitle) {
    this.videoTitle = videoTitle;
  }

  public VideoServiceUploadData userStatus(VideoServiceUserStatus userStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceUploadData videoServiceUploadData = (VideoServiceUploadData) o;
    return Objects.equals(this.accountId, videoServiceUploadData.accountId) &&
        Objects.equals(this.mediaId, videoServiceUploadData.mediaId) &&
        Objects.equals(this.videoName, videoServiceUploadData.videoName) &&
        Objects.equals(this.videoTitle, videoServiceUploadData.videoTitle) &&
        Objects.equals(this.userStatus, videoServiceUploadData.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mediaId, videoName, videoTitle, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceUploadData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

