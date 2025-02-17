/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v16.model.VideoServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VideoServiceUploadData
 */
@JsonPropertyOrder({
  VideoServiceUploadData.JSON_PROPERTY_ACCOUNT_ID,
  VideoServiceUploadData.JSON_PROPERTY_MEDIA_ID,
  VideoServiceUploadData.JSON_PROPERTY_VIDEO_NAME,
  VideoServiceUploadData.JSON_PROPERTY_VIDEO_TITLE,
  VideoServiceUploadData.JSON_PROPERTY_USER_STATUS
})
@JsonTypeName("VideoServiceUploadData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoServiceUploadData {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_VIDEO_NAME = "videoName";
  private String videoName;

  public static final String JSON_PROPERTY_VIDEO_TITLE = "videoTitle";
  private String videoTitle;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private VideoServiceUserStatus userStatus;

  public VideoServiceUploadData() { 
  }

  public VideoServiceUploadData accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
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


  public VideoServiceUploadData mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディアID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID.&lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID.</div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public VideoServiceUploadData videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;実ファイル名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;File name.&lt;/div&gt; 
   * @return videoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name.</div> ")
  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoName() {
    return videoName;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public VideoServiceUploadData videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビデオ名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Video title.&lt;/div&gt; 
   * @return videoTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title.</div> ")
  @JsonProperty(JSON_PROPERTY_VIDEO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoTitle() {
    return videoTitle;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public VideoServiceUploadData userStatus(VideoServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(VideoServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

