package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceCampaignBannerFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceImageMedia;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceLogoFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceRichFormatFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceThumbnailFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MediaServiceRecordオブジェクトは、画像の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The MediaServiceRecord object is a container for the information of media (image data).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">MediaServiceRecordオブジェクトは、画像の情報を表します。</div> <div lang=\"en\">The MediaServiceRecord object is a container for the information of media (image data).</div> ")

public class MediaServiceRecord   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<MediaServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("campaignBannerFlg")
  private JsonNullable<MediaServiceCampaignBannerFlg> campaignBannerFlg = JsonNullable.undefined();

  @JsonProperty("creationTime")
  private JsonNullable<String> creationTime = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("logoFlg")
  private JsonNullable<MediaServiceLogoFlg> logoFlg = JsonNullable.undefined();

  @JsonProperty("imageMedia")
  private JsonNullable<MediaServiceImageMedia> imageMedia = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("mediaName")
  private JsonNullable<String> mediaName = JsonNullable.undefined();

  @JsonProperty("mediaTitle")
  private JsonNullable<String> mediaTitle = JsonNullable.undefined();

  @JsonProperty("thumbnailFlg")
  private JsonNullable<MediaServiceThumbnailFlg> thumbnailFlg = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<MediaServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("mediaRichFormatFlg")
  private JsonNullable<MediaServiceRichFormatFlg> mediaRichFormatFlg = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  public MediaServiceRecord accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\">Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\">Account ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public MediaServiceRecord approvalStatus(MediaServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<MediaServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public MediaServiceRecord campaignBannerFlg(MediaServiceCampaignBannerFlg campaignBannerFlg) {
    this.campaignBannerFlg = JsonNullable.of(campaignBannerFlg);
    return this;
  }

  /**
   * Get campaignBannerFlg
   * @return campaignBannerFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceCampaignBannerFlg> getCampaignBannerFlg() {
    return campaignBannerFlg;
  }

  public void setCampaignBannerFlg(JsonNullable<MediaServiceCampaignBannerFlg> campaignBannerFlg) {
    this.campaignBannerFlg = campaignBannerFlg;
  }

  public MediaServiceRecord creationTime(String creationTime) {
    this.creationTime = JsonNullable.of(creationTime);
    return this;
  }

  /**
   * <div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Date and time of creation.</div> 
   * @return creationTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Date and time of creation.</div> ")


  public JsonNullable<String> getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(JsonNullable<String> creationTime) {
    this.creationTime = creationTime;
  }

  public MediaServiceRecord disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public MediaServiceRecord addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">掲載拒否の理由です。</div> <div lang=\"en\">Reason code why it&#39;s disapproved on the review.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">掲載拒否の理由です。</div> <div lang=\"en\">Reason code why it&#39;s disapproved on the review.</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public MediaServiceRecord logoFlg(MediaServiceLogoFlg logoFlg) {
    this.logoFlg = JsonNullable.of(logoFlg);
    return this;
  }

  /**
   * Get logoFlg
   * @return logoFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceLogoFlg> getLogoFlg() {
    return logoFlg;
  }

  public void setLogoFlg(JsonNullable<MediaServiceLogoFlg> logoFlg) {
    this.logoFlg = logoFlg;
  }

  public MediaServiceRecord imageMedia(MediaServiceImageMedia imageMedia) {
    this.imageMedia = JsonNullable.of(imageMedia);
    return this;
  }

  /**
   * Get imageMedia
   * @return imageMedia
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceImageMedia> getImageMedia() {
    return imageMedia;
  }

  public void setImageMedia(JsonNullable<MediaServiceImageMedia> imageMedia) {
    this.imageMedia = imageMedia;
  }

  public MediaServiceRecord mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\">画像IDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\">Media ID (image ID). <br> This field is required in SET and REMOVE operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像IDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\">Media ID (image ID). <br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public MediaServiceRecord mediaName(String mediaName) {
    this.mediaName = JsonNullable.of(mediaName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 実ファイル名です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\">File name. <br> This field is required in ADD operation. </div> 
   * @return mediaName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 実ファイル名です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\">File name. <br> This field is required in ADD operation. </div> ")


  public JsonNullable<String> getMediaName() {
    return mediaName;
  }

  public void setMediaName(JsonNullable<String> mediaName) {
    this.mediaName = mediaName;
  }

  public MediaServiceRecord mediaTitle(String mediaTitle) {
    this.mediaTitle = JsonNullable.of(mediaTitle);
    return this;
  }

  /**
   * <div lang=\"ja\">画像名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Image name. <br> This field is required in ADD operation, and is optional in SET operation. </div> 
   * @return mediaTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Image name. <br> This field is required in ADD operation, and is optional in SET operation. </div> ")


  public JsonNullable<String> getMediaTitle() {
    return mediaTitle;
  }

  public void setMediaTitle(JsonNullable<String> mediaTitle) {
    this.mediaTitle = mediaTitle;
  }

  public MediaServiceRecord thumbnailFlg(MediaServiceThumbnailFlg thumbnailFlg) {
    this.thumbnailFlg = JsonNullable.of(thumbnailFlg);
    return this;
  }

  /**
   * Get thumbnailFlg
   * @return thumbnailFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceThumbnailFlg> getThumbnailFlg() {
    return thumbnailFlg;
  }

  public void setThumbnailFlg(JsonNullable<MediaServiceThumbnailFlg> thumbnailFlg) {
    this.thumbnailFlg = thumbnailFlg;
  }

  public MediaServiceRecord userStatus(MediaServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<MediaServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public MediaServiceRecord mediaRichFormatFlg(MediaServiceRichFormatFlg mediaRichFormatFlg) {
    this.mediaRichFormatFlg = JsonNullable.of(mediaRichFormatFlg);
    return this;
  }

  /**
   * Get mediaRichFormatFlg
   * @return mediaRichFormatFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceRichFormatFlg> getMediaRichFormatFlg() {
    return mediaRichFormatFlg;
  }

  public void setMediaRichFormatFlg(JsonNullable<MediaServiceRichFormatFlg> mediaRichFormatFlg) {
    this.mediaRichFormatFlg = mediaRichFormatFlg;
  }

  public MediaServiceRecord createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">データが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Media made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">データが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Media made.<br>* Format: yyyyMMdd</div> ")


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
    MediaServiceRecord mediaServiceRecord = (MediaServiceRecord) o;
    return Objects.equals(this.accountId, mediaServiceRecord.accountId) &&
        Objects.equals(this.approvalStatus, mediaServiceRecord.approvalStatus) &&
        Objects.equals(this.campaignBannerFlg, mediaServiceRecord.campaignBannerFlg) &&
        Objects.equals(this.creationTime, mediaServiceRecord.creationTime) &&
        Objects.equals(this.disapprovalReasonCodes, mediaServiceRecord.disapprovalReasonCodes) &&
        Objects.equals(this.logoFlg, mediaServiceRecord.logoFlg) &&
        Objects.equals(this.imageMedia, mediaServiceRecord.imageMedia) &&
        Objects.equals(this.mediaId, mediaServiceRecord.mediaId) &&
        Objects.equals(this.mediaName, mediaServiceRecord.mediaName) &&
        Objects.equals(this.mediaTitle, mediaServiceRecord.mediaTitle) &&
        Objects.equals(this.thumbnailFlg, mediaServiceRecord.thumbnailFlg) &&
        Objects.equals(this.userStatus, mediaServiceRecord.userStatus) &&
        Objects.equals(this.mediaRichFormatFlg, mediaServiceRecord.mediaRichFormatFlg) &&
        Objects.equals(this.createdDate, mediaServiceRecord.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, campaignBannerFlg, creationTime, disapprovalReasonCodes, logoFlg, imageMedia, mediaId, mediaName, mediaTitle, thumbnailFlg, userStatus, mediaRichFormatFlg, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaServiceRecord {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    campaignBannerFlg: ").append(toIndentedString(campaignBannerFlg)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    logoFlg: ").append(toIndentedString(logoFlg)).append("\n");
    sb.append("    imageMedia: ").append(toIndentedString(imageMedia)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    mediaTitle: ").append(toIndentedString(mediaTitle)).append("\n");
    sb.append("    thumbnailFlg: ").append(toIndentedString(thumbnailFlg)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    mediaRichFormatFlg: ").append(toIndentedString(mediaRichFormatFlg)).append("\n");
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

