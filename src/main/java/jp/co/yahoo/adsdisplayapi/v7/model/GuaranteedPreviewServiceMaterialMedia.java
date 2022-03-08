/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

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
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServiceAdType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedPreviewServicePanelSwitch;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。&lt;br&gt; ※materialTypeがMEDIAの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).&lt;br&gt; *If materialType is MEDIA, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedPreviewServiceMaterialMediaオブジェクトは、プレビュー素材（メディア）の情報を保持します。<br> ※materialTypeがMEDIAの場合は必須です。 </div> <div lang=\"en\"> GuaranteedPreviewServiceMaterialMedia object holds information about the preview material (media).<br> *If materialType is MEDIA, this field is required. </div> ")
@JsonPropertyOrder({
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_AD_TYPE,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_THUMBNAIL_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_AD_CENTER_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID,
  GuaranteedPreviewServiceMaterialMedia.JSON_PROPERTY_PANELS
})
@JsonTypeName("GuaranteedPreviewServiceMaterialMedia")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedPreviewServiceMaterialMedia {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private GuaranteedPreviewServiceAdType adType;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_THUMBNAIL_MEDIA_ID = "thumbnailMediaId";
  private Long thumbnailMediaId;

  public static final String JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID = "adLeftSideMediaId";
  private Long adLeftSideMediaId;

  public static final String JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID = "adRightSideMediaId";
  private Long adRightSideMediaId;

  public static final String JSON_PROPERTY_AD_CENTER_MEDIA_ID = "adCenterMediaId";
  private Long adCenterMediaId;

  public static final String JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID = "adShrinkMainMediaId";
  private Long adShrinkMainMediaId;

  public static final String JSON_PROPERTY_PANELS = "panels";
  private List<GuaranteedPreviewServicePanelSwitch> panels = null;

  public GuaranteedPreviewServiceMaterialMedia() { 
  }

  public GuaranteedPreviewServiceMaterialMedia adType(GuaranteedPreviewServiceAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedPreviewServiceAdType getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(GuaranteedPreviewServiceAdType adType) {
    this.adType = adType;
  }


  public GuaranteedPreviewServiceMaterialMedia mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in requests. </div> ")
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


  public GuaranteedPreviewServiceMaterialMedia thumbnailMediaId(Long thumbnailMediaId) {
    
    this.thumbnailMediaId = thumbnailMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サムネイルIDです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Thumbnail ID.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return thumbnailMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> サムネイルIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Thumbnail ID.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getThumbnailMediaId() {
    return thumbnailMediaId;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnailMediaId(Long thumbnailMediaId) {
    this.thumbnailMediaId = thumbnailMediaId;
  }


  public GuaranteedPreviewServiceMaterialMedia adLeftSideMediaId(Long adLeftSideMediaId) {
    
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 左サイド画像です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Left side image.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return adLeftSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdLeftSideMediaId() {
    return adLeftSideMediaId;
  }


  @JsonProperty(JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdLeftSideMediaId(Long adLeftSideMediaId) {
    this.adLeftSideMediaId = adLeftSideMediaId;
  }


  public GuaranteedPreviewServiceMaterialMedia adRightSideMediaId(Long adRightSideMediaId) {
    
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 右サイド画像です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Right side image.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return adRightSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdRightSideMediaId() {
    return adRightSideMediaId;
  }


  @JsonProperty(JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdRightSideMediaId(Long adRightSideMediaId) {
    this.adRightSideMediaId = adRightSideMediaId;
  }


  public GuaranteedPreviewServiceMaterialMedia adCenterMediaId(Long adCenterMediaId) {
    
    this.adCenterMediaId = adCenterMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; センター画像です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Center image.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return adCenterMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> センター画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Center image.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_CENTER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdCenterMediaId() {
    return adCenterMediaId;
  }


  @JsonProperty(JSON_PROPERTY_AD_CENTER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdCenterMediaId(Long adCenterMediaId) {
    this.adCenterMediaId = adCenterMediaId;
  }


  public GuaranteedPreviewServiceMaterialMedia adShrinkMainMediaId(Long adShrinkMainMediaId) {
    
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 縮小メイン画像です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reduced main image.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return adShrinkMainMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }


  @JsonProperty(JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PANELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedPreviewServicePanelSwitch> getPanels() {
    return panels;
  }


  @JsonProperty(JSON_PROPERTY_PANELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

