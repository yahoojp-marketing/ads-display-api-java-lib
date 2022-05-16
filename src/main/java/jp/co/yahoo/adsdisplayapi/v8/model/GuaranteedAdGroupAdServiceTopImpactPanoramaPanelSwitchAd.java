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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがTOP_IMPACT_PANORAMA_PANEL_SWITCHの場合は必須です。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is TOP_IMPACT_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがTOP_IMPACT_PANORAMA_PANEL_SWITCHの場合は必須です。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image.<br> This field is optional.<br> *If adType is TOP_IMPACT_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.<br> * Not Available. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_PANELS,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_TRACKING_URL
})
@JsonTypeName("GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd {
  public static final String JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID = "adShrinkMainMediaId";
  private Long adShrinkMainMediaId;

  public static final String JSON_PROPERTY_PANELS = "panels";
  private List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> panels = null;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd() { 
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd adShrinkMainMediaId(Long adShrinkMainMediaId) {
    
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 縮小メイン画像です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reduced main image.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adShrinkMainMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd panels(List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> panels) {
    
    this.panels = panels;
    return this;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd addPanelsItem(GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch panelsItem) {
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

  public List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> getPanels() {
    return panels;
  }


  @JsonProperty(JSON_PROPERTY_PANELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPanels(List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> panels) {
    this.panels = panels;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

   /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    this.displayUrlLevel = displayUrlLevel;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※SET時、こちらが審査中の場合、編集はできません。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *In SET operation, cannot update it when this field is in editorial review.&lt;br&gt; &lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingUrl() {
    return trackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd = (GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd) o;
    return Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.adShrinkMainMediaId) &&
        Objects.equals(this.panels, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.panels) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.finalUrl) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.displayUrlLevel) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.customParameters) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adShrinkMainMediaId, panels, finalUrl, displayUrlLevel, customParameters, isRemoveTrackingUrl, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd {\n");
    sb.append("    adShrinkMainMediaId: ").append(toIndentedString(adShrinkMainMediaId)).append("\n");
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

