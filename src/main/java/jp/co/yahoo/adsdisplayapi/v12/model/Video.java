/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v12.model.VideoServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v12.model.VideoServiceProcessStatus;
import jp.co.yahoo.adsdisplayapi.v12.model.VideoServiceSetting;
import jp.co.yahoo.adsdisplayapi.v12.model.VideoServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Videoオブジェクトは、動画情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Video object is a container for the information of videos.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  Video.JSON_PROPERTY_ACCOUNT_ID,
  Video.JSON_PROPERTY_APPROVAL_STATUS,
  Video.JSON_PROPERTY_CREATED_DATE_TIME,
  Video.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  Video.JSON_PROPERTY_MEDIA_ID,
  Video.JSON_PROPERTY_PROCESS_STATUS,
  Video.JSON_PROPERTY_USER_STATUS,
  Video.JSON_PROPERTY_VIDEO_NAME,
  Video.JSON_PROPERTY_VIDEO_SETTING,
  Video.JSON_PROPERTY_VIDEO_TITLE,
  Video.JSON_PROPERTY_CREATED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Video {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private VideoServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CREATED_DATE_TIME = "createdDateTime";
  private String createdDateTime;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_PROCESS_STATUS = "processStatus";
  private VideoServiceProcessStatus processStatus;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private VideoServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_VIDEO_NAME = "videoName";
  private String videoName;

  public static final String JSON_PROPERTY_VIDEO_SETTING = "videoSetting";
  private VideoServiceSetting videoSetting;

  public static final String JSON_PROPERTY_VIDEO_TITLE = "videoTitle";
  private String videoTitle;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public Video() {
  }

  public Video accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
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


  public Video approvalStatus(VideoServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(VideoServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public Video createdDateTime(String createdDateTime) {
    
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 動画の入稿日時です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※フォーマット: yyyyMMddHHmmss &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Time and date when the video was submitted.&lt;br&gt; Although this field will be returned in the response, it will be ignored on request.&lt;br&gt; *Format: yyyyMMddHHmmss &lt;/div&gt; 
   * @return createdDateTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDateTime() {
    return createdDateTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  public Video disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public Video addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 動画の掲載拒否理由です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Disapproval reason of the video.&lt;br&gt; Although this field will be returned in the response, it will be ignored on request. &lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public Video mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return mediaId
  **/
  @jakarta.annotation.Nullable
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


  public Video processStatus(VideoServiceProcessStatus processStatus) {
    
    this.processStatus = processStatus;
    return this;
  }

   /**
   * Get processStatus
   * @return processStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceProcessStatus getProcessStatus() {
    return processStatus;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessStatus(VideoServiceProcessStatus processStatus) {
    this.processStatus = processStatus;
  }


  public Video userStatus(VideoServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @jakarta.annotation.Nullable
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


  public Video videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画のファイル名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Video file name.&lt;/div&gt; 
   * @return videoName
  **/
  @jakarta.annotation.Nullable
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


  public Video videoSetting(VideoServiceSetting videoSetting) {
    
    this.videoSetting = videoSetting;
    return this;
  }

   /**
   * Get videoSetting
   * @return videoSetting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceSetting getVideoSetting() {
    return videoSetting;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoSetting(VideoServiceSetting videoSetting) {
    this.videoSetting = videoSetting;
  }


  public Video videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 動画名です。&lt;br&gt; このフィールドは、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Video name.&lt;br&gt; This field is optional in SET operation. &lt;/div&gt; 
   * @return videoTitle
  **/
  @jakarta.annotation.Nullable
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


  public Video createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画の作成日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date when the video was made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.accountId, video.accountId) &&
        Objects.equals(this.approvalStatus, video.approvalStatus) &&
        Objects.equals(this.createdDateTime, video.createdDateTime) &&
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
    return Objects.hash(accountId, approvalStatus, createdDateTime, disapprovalReasonCodes, mediaId, processStatus, userStatus, videoName, videoSetting, videoTitle, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

