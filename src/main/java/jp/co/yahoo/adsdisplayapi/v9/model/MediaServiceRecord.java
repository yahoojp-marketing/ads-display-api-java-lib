/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceCampaignBannerFlg;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceImageMedia;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceLogoFlg;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceRichFormatFlg;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceThumbnailFlg;
import jp.co.yahoo.adsdisplayapi.v9.model.MediaServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MediaServiceRecordオブジェクトは、画像の情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The MediaServiceRecord object is a container for the information of media (image data).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">MediaServiceRecordオブジェクトは、画像の情報を表します。</div> <div lang=\"en\">The MediaServiceRecord object is a container for the information of media (image data).</div> ")
@JsonPropertyOrder({
  MediaServiceRecord.JSON_PROPERTY_ACCOUNT_ID,
  MediaServiceRecord.JSON_PROPERTY_APPROVAL_STATUS,
  MediaServiceRecord.JSON_PROPERTY_CAMPAIGN_BANNER_FLG,
  MediaServiceRecord.JSON_PROPERTY_CREATION_TIME,
  MediaServiceRecord.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  MediaServiceRecord.JSON_PROPERTY_LOGO_FLG,
  MediaServiceRecord.JSON_PROPERTY_IMAGE_MEDIA,
  MediaServiceRecord.JSON_PROPERTY_MEDIA_ID,
  MediaServiceRecord.JSON_PROPERTY_MEDIA_NAME,
  MediaServiceRecord.JSON_PROPERTY_MEDIA_TITLE,
  MediaServiceRecord.JSON_PROPERTY_THUMBNAIL_FLG,
  MediaServiceRecord.JSON_PROPERTY_USER_STATUS,
  MediaServiceRecord.JSON_PROPERTY_MEDIA_RICH_FORMAT_FLG,
  MediaServiceRecord.JSON_PROPERTY_CREATED_DATE
})
@JsonTypeName("MediaServiceRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MediaServiceRecord {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private MediaServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_FLG = "campaignBannerFlg";
  private MediaServiceCampaignBannerFlg campaignBannerFlg;

  public static final String JSON_PROPERTY_CREATION_TIME = "creationTime";
  private String creationTime;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public static final String JSON_PROPERTY_LOGO_FLG = "logoFlg";
  private MediaServiceLogoFlg logoFlg;

  public static final String JSON_PROPERTY_IMAGE_MEDIA = "imageMedia";
  private MediaServiceImageMedia imageMedia;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_MEDIA_NAME = "mediaName";
  private String mediaName;

  public static final String JSON_PROPERTY_MEDIA_TITLE = "mediaTitle";
  private String mediaTitle;

  public static final String JSON_PROPERTY_THUMBNAIL_FLG = "thumbnailFlg";
  private MediaServiceThumbnailFlg thumbnailFlg;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private MediaServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_MEDIA_RICH_FORMAT_FLG = "mediaRichFormatFlg";
  private MediaServiceRichFormatFlg mediaRichFormatFlg;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public MediaServiceRecord() { 
  }

  public MediaServiceRecord accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\">Account ID.<br> This field is required in requests. </div> ")
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


  public MediaServiceRecord approvalStatus(MediaServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(MediaServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public MediaServiceRecord campaignBannerFlg(MediaServiceCampaignBannerFlg campaignBannerFlg) {
    
    this.campaignBannerFlg = campaignBannerFlg;
    return this;
  }

   /**
   * Get campaignBannerFlg
   * @return campaignBannerFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceCampaignBannerFlg getCampaignBannerFlg() {
    return campaignBannerFlg;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerFlg(MediaServiceCampaignBannerFlg campaignBannerFlg) {
    this.campaignBannerFlg = campaignBannerFlg;
  }


  public MediaServiceRecord creationTime(String creationTime) {
    
    this.creationTime = creationTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入稿日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date and time of creation.&lt;/div&gt; 
   * @return creationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Date and time of creation.</div> ")
  @JsonProperty(JSON_PROPERTY_CREATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreationTime() {
    return creationTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }


  public MediaServiceRecord disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public MediaServiceRecord addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載拒否の理由です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reason code why it&amp;#39;s disapproved on the review.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">掲載拒否の理由です。</div> <div lang=\"en\">Reason code why it&#39;s disapproved on the review.</div> ")
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


  public MediaServiceRecord logoFlg(MediaServiceLogoFlg logoFlg) {
    
    this.logoFlg = logoFlg;
    return this;
  }

   /**
   * Get logoFlg
   * @return logoFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceLogoFlg getLogoFlg() {
    return logoFlg;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoFlg(MediaServiceLogoFlg logoFlg) {
    this.logoFlg = logoFlg;
  }


  public MediaServiceRecord imageMedia(MediaServiceImageMedia imageMedia) {
    
    this.imageMedia = imageMedia;
    return this;
  }

   /**
   * Get imageMedia
   * @return imageMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceImageMedia getImageMedia() {
    return imageMedia;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageMedia(MediaServiceImageMedia imageMedia) {
    this.imageMedia = imageMedia;
  }


  public MediaServiceRecord mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像IDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID (image ID). &lt;br&gt; This field is required in SET and REMOVE operation. &lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像IDです。<br> このフィールドは、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\">Media ID (image ID). <br> This field is required in SET and REMOVE operation. </div> ")
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


  public MediaServiceRecord mediaName(String mediaName) {
    
    this.mediaName = mediaName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 実ファイル名です。&lt;br&gt; このフィールドは、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;File name. &lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
   * @return mediaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 実ファイル名です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\">File name. <br> This field is required in ADD operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  public MediaServiceRecord mediaTitle(String mediaTitle) {
    
    this.mediaTitle = mediaTitle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Image name. &lt;br&gt; This field is required in ADD operation, and is optional in SET operation. &lt;/div&gt; 
   * @return mediaTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。 </div> <div lang=\"en\">Image name. <br> This field is required in ADD operation, and is optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaTitle() {
    return mediaTitle;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaTitle(String mediaTitle) {
    this.mediaTitle = mediaTitle;
  }


  public MediaServiceRecord thumbnailFlg(MediaServiceThumbnailFlg thumbnailFlg) {
    
    this.thumbnailFlg = thumbnailFlg;
    return this;
  }

   /**
   * Get thumbnailFlg
   * @return thumbnailFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceThumbnailFlg getThumbnailFlg() {
    return thumbnailFlg;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailFlg(MediaServiceThumbnailFlg thumbnailFlg) {
    this.thumbnailFlg = thumbnailFlg;
  }


  public MediaServiceRecord userStatus(MediaServiceUserStatus userStatus) {
    
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

  public MediaServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(MediaServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public MediaServiceRecord mediaRichFormatFlg(MediaServiceRichFormatFlg mediaRichFormatFlg) {
    
    this.mediaRichFormatFlg = mediaRichFormatFlg;
    return this;
  }

   /**
   * Get mediaRichFormatFlg
   * @return mediaRichFormatFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_RICH_FORMAT_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaServiceRichFormatFlg getMediaRichFormatFlg() {
    return mediaRichFormatFlg;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_RICH_FORMAT_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaRichFormatFlg(MediaServiceRichFormatFlg mediaRichFormatFlg) {
    this.mediaRichFormatFlg = mediaRichFormatFlg;
  }


  public MediaServiceRecord createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;データが作成された日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Media made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">データが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Media made.<br>* Format: yyyyMMdd</div> ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

