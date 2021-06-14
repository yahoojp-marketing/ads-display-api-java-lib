package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedPreviewServiceAdType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。</div> <div lang=\"en\">GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).</div> ")

public class GuaranteedPreviewServiceMaterialMedia   {
  @JsonProperty("adType")
  private JsonNullable<GuaranteedPreviewServiceAdType> adType = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("thumbnailMediaId")
  private JsonNullable<Long> thumbnailMediaId = JsonNullable.undefined();

  @JsonProperty("adLeftSideMediaId")
  private JsonNullable<Long> adLeftSideMediaId = JsonNullable.undefined();

  @JsonProperty("adRightSideMediaId")
  private JsonNullable<Long> adRightSideMediaId = JsonNullable.undefined();

  @JsonProperty("adCenterMediaId")
  private JsonNullable<Long> adCenterMediaId = JsonNullable.undefined();

  @JsonProperty("adShrinkMainMediaId")
  private JsonNullable<Long> adShrinkMainMediaId = JsonNullable.undefined();

  public GuaranteedPreviewServiceMaterialMedia adType(GuaranteedPreviewServiceAdType adType) {
    this.adType = JsonNullable.of(adType);
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedPreviewServiceAdType> getAdType() {
    return adType;
  }

  public void setAdType(JsonNullable<GuaranteedPreviewServiceAdType> adType) {
    this.adType = adType;
  }

  public GuaranteedPreviewServiceMaterialMedia mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in requests. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia thumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = JsonNullable.of(thumbnailMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is optional in requests. </div> 
   * @return thumbnailMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getThumbnailMediaId() {
    return thumbnailMediaId;
  }

  public void setThumbnailMediaId(JsonNullable<Long> thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = JsonNullable.of(adLeftSideMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(JsonNullable<Long> adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = JsonNullable.of(adRightSideMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getAdRightSideMediaId() {
    return adRightSideMediaId;
  }

  public void setAdRightSideMediaId(JsonNullable<Long> adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = JsonNullable.of(adCenterMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> センター画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is optional in requests. </div> 
   * @return adCenterMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> センター画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getAdCenterMediaId() {
    return adCenterMediaId;
  }

  public void setAdCenterMediaId(JsonNullable<Long> adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = JsonNullable.of(adShrinkMainMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reduced main image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adShrinkMainMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reduced main image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }

  public void setAdShrinkMainMediaId(JsonNullable<Long> adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServiceMaterialMedia guaranteedPreviewServiceMaterialMedia = (GuaranteedPreviewServiceMaterialMedia) o;
    return Objects.equals(this.adType, guaranteedPreviewServiceMaterialMedia.adType) &&
        Objects.equals(this.mediaId, guaranteedPreviewServiceMaterialMedia.mediaId) &&
        Objects.equals(this.thumbnailMediaId, guaranteedPreviewServiceMaterialMedia.thumbnailMediaId) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedPreviewServiceMaterialMedia.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedPreviewServiceMaterialMedia.adRightSideMediaId) &&
        Objects.equals(this.adCenterMediaId, guaranteedPreviewServiceMaterialMedia.adCenterMediaId) &&
        Objects.equals(this.adShrinkMainMediaId, guaranteedPreviewServiceMaterialMedia.adShrinkMainMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mediaId, thumbnailMediaId, adLeftSideMediaId, adRightSideMediaId, adCenterMediaId, adShrinkMainMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServiceMaterialMedia {\n");
    
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thumbnailMediaId: ").append(toIndentedString(thumbnailMediaId)).append("\n");
    sb.append("    adLeftSideMediaId: ").append(toIndentedString(adLeftSideMediaId)).append("\n");
    sb.append("    adRightSideMediaId: ").append(toIndentedString(adRightSideMediaId)).append("\n");
    sb.append("    adCenterMediaId: ").append(toIndentedString(adCenterMediaId)).append("\n");
    sb.append("    adShrinkMainMediaId: ").append(toIndentedString(adShrinkMainMediaId)).append("\n");
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

