/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedPreviewServicePanelSwitchオブジェクトは、プレビュー素材（スイッチ画像）の情報を保持します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedPreviewServicePanelSwitch object holds information about the preview material (switch image). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedPreviewServicePanelSwitchオブジェクトは、プレビュー素材（スイッチ画像）の情報を保持します。<br> </div> <div lang=\"en\"> GuaranteedPreviewServicePanelSwitch object holds information about the preview material (switch image). </div> ")
@JsonPropertyOrder({
  GuaranteedPreviewServicePanelSwitch.JSON_PROPERTY_MEDIA_ID,
  GuaranteedPreviewServicePanelSwitch.JSON_PROPERTY_SWITCH_MEDIA_ID,
  GuaranteedPreviewServicePanelSwitch.JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID,
  GuaranteedPreviewServicePanelSwitch.JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID
})
@JsonTypeName("GuaranteedPreviewServicePanelSwitch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedPreviewServicePanelSwitch {
  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_SWITCH_MEDIA_ID = "switchMediaId";
  private Long switchMediaId;

  public static final String JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID = "adLeftSideMediaId";
  private Long adLeftSideMediaId;

  public static final String JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID = "adRightSideMediaId";
  private Long adRightSideMediaId;

  public GuaranteedPreviewServicePanelSwitch() { 
  }

  public GuaranteedPreviewServicePanelSwitch mediaId(Long mediaId) {
    
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


  public GuaranteedPreviewServicePanelSwitch switchMediaId(Long switchMediaId) {
    
    this.switchMediaId = switchMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; スイッチ画像のメディアIDです。&lt;br&gt; このフィールドは、リクエストの場合は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of switch image.&lt;br&gt; This field is optional in requests. 
   * @return switchMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is optional in requests. ")
  @JsonProperty(JSON_PROPERTY_SWITCH_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSwitchMediaId() {
    return switchMediaId;
  }


  @JsonProperty(JSON_PROPERTY_SWITCH_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwitchMediaId(Long switchMediaId) {
    this.switchMediaId = switchMediaId;
  }


  public GuaranteedPreviewServicePanelSwitch adLeftSideMediaId(Long adLeftSideMediaId) {
    
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


  public GuaranteedPreviewServicePanelSwitch adRightSideMediaId(Long adRightSideMediaId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedPreviewServicePanelSwitch guaranteedPreviewServicePanelSwitch = (GuaranteedPreviewServicePanelSwitch) o;
    return Objects.equals(this.mediaId, guaranteedPreviewServicePanelSwitch.mediaId) &&
        Objects.equals(this.switchMediaId, guaranteedPreviewServicePanelSwitch.switchMediaId) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedPreviewServicePanelSwitch.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedPreviewServicePanelSwitch.adRightSideMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, switchMediaId, adLeftSideMediaId, adRightSideMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedPreviewServicePanelSwitch {\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    switchMediaId: ").append(toIndentedString(switchMediaId)).append("\n");
    sb.append("    adLeftSideMediaId: ").append(toIndentedString(adLeftSideMediaId)).append("\n");
    sb.append("    adRightSideMediaId: ").append(toIndentedString(adRightSideMediaId)).append("\n");
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

