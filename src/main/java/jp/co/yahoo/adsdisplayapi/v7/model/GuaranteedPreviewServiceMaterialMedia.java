package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServiceAdType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServicePanelSwitch;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。</div> <div lang=\"en\">GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedPreviewServiceMaterialMedia   {
  @JsonProperty("adType")
  private GuaranteedPreviewServiceAdType adType = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("thumbnailMediaId")
  private Long thumbnailMediaId = null;

  @JsonProperty("adLeftSideMediaId")
  private Long adLeftSideMediaId = null;

  @JsonProperty("adRightSideMediaId")
  private Long adRightSideMediaId = null;

  @JsonProperty("adCenterMediaId")
  private Long adCenterMediaId = null;

  @JsonProperty("adShrinkMainMediaId")
  private Long adShrinkMainMediaId = null;

  @JsonProperty("panels")
  @Valid
  private List<GuaranteedPreviewServicePanelSwitch> panels = null;

  public GuaranteedPreviewServiceMaterialMedia adType(GuaranteedPreviewServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedPreviewServiceAdType getAdType() {
    return adType;
  }

  public void setAdType(GuaranteedPreviewServiceAdType adType) {
    this.adType = adType;
  }

  public GuaranteedPreviewServiceMaterialMedia mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in requests. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in requests. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia thumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is optional in requests. </div> 
   * @return thumbnailMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is optional in requests. </div> ")


  public Long getThumbnailMediaId() {
    return thumbnailMediaId;
  }

  public void setThumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> 
   * @return adLeftSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> ")


  public Long getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }

  public void setAdLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> 
   * @return adRightSideMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> ")


  public Long getAdRightSideMediaId() {
    return adRightSideMediaId;
  }

  public void setAdRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> センター画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is optional in requests. </div> 
   * @return adCenterMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> センター画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is optional in requests. </div> ")


  public Long getAdCenterMediaId() {
    return adCenterMediaId;
  }

  public void setAdCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia adShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reduced main image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adShrinkMainMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reduced main image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }

  public void setAdShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
  }

  public GuaranteedPreviewServiceMaterialMedia panels(List<GuaranteedPreviewServicePanelSwitch> panels) {
    this.panels = panels;
    return this;
  }

  public GuaranteedPreviewServiceMaterialMedia addPanelsItem(GuaranteedPreviewServicePanelSwitch panelsItem) {
    if (this.panels == null) {
      this.panels = new ArrayList<>();
    }
    this.panels.add(panelsItem);
    return this;
  }

  /**
   * Get panels
   * @return panels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedPreviewServicePanelSwitch> getPanels() {
    return panels;
  }

  public void setPanels(List<GuaranteedPreviewServicePanelSwitch> panels) {
    this.panels = panels;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.adShrinkMainMediaId, guaranteedPreviewServiceMaterialMedia.adShrinkMainMediaId) &&
        Objects.equals(this.panels, guaranteedPreviewServiceMaterialMedia.panels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, mediaId, thumbnailMediaId, adLeftSideMediaId, adRightSideMediaId, adCenterMediaId, adShrinkMainMediaId, panels);
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
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
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

