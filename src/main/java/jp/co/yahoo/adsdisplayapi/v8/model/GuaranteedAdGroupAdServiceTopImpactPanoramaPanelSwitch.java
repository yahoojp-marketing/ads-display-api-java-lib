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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の詳細情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の詳細情報を表します。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch object describes detailed information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_DISPLAY_ORDER,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_SWITCH_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID
})
@JsonTypeName("GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch {
  public static final String JSON_PROPERTY_DISPLAY_ORDER = "displayOrder";
  private Long displayOrder;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_SWITCH_MEDIA_ID = "switchMediaId";
  private Long switchMediaId;

  public static final String JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID = "adLeftSideMediaId";
  private Long adLeftSideMediaId;

  public static final String JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID = "adRightSideMediaId";
  private Long adRightSideMediaId;

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch() { 
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch displayOrder(Long displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; パネルの表示順です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※指定しない場合は自動で設定されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Panel display order.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If not specified, it will be set automatically. &lt;/div&gt; 
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> パネルの表示順です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※指定しない場合は自動で設定されます。 </div> <div lang=\"en\"> Panel display order.<br> This field is optional in ADD and SET operation.<br> *If not specified, it will be set automatically. </div> ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDisplayOrder() {
    return displayOrder;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalUrl() {
    return finalUrl;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; メディアIDです。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID.<br> This field is required in ADD and SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch switchMediaId(Long switchMediaId) {
    
    this.switchMediaId = switchMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; スイッチ画像のメディアIDです。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of switch image.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return switchMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> スイッチ画像のメディアIDです。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Media ID of switch image.<br> This field is required in ADD and SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch adLeftSideMediaId(Long adLeftSideMediaId) {
    
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 左サイド画像です。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Left side image.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return adLeftSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD and SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch adRightSideMediaId(Long adRightSideMediaId) {
    
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 右サイド画像です。&lt;br&gt; このフィールドは、ADD時およびSET時に必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Right side image.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return adRightSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時およびSET時に必須です。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD and SET operation. </div> ")
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
    GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch = (GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch) o;
    return Objects.equals(this.displayOrder, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.displayOrder) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.finalUrl) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.mediaId) &&
        Objects.equals(this.switchMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.switchMediaId) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch.adRightSideMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrder, finalUrl, mediaId, switchMediaId, adLeftSideMediaId, adRightSideMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch {\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
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
