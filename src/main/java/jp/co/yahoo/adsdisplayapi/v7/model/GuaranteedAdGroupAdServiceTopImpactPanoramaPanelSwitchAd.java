package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがTOP_IMPACT_PANORAMA_PANEL_SWITCHの場合は必須です。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is TOP_IMPACT_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナー、右サイド画像、左サイド画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがTOP_IMPACT_PANORAMA_PANEL_SWITCHの場合は必須です。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, 16:9 reduced banner, the right side image, and the left side image.<br> This field is optional.<br> *If adType is TOP_IMPACT_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.<br> * Not Available. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd   {
  @JsonProperty("adShrinkMainMediaId")
  private Long adShrinkMainMediaId = null;

  @JsonProperty("panels")
  @Valid
  private List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> panels = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("displayUrlLevel")
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel = null;

  @JsonProperty("customParameters")
  private GuaranteedAdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("isRemoveTrackingUrl")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd adShrinkMainMediaId(Long adShrinkMainMediaId) {
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adShrinkMainMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Reduced main image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getAdShrinkMainMediaId() {
    return adShrinkMainMediaId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> getPanels() {
    return panels;
  }

  public void setPanels(List<GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch> panels) {
    this.panels = panels;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\">Final URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceDisplayUrlLevel getDisplayUrlLevel() {
    return displayUrlLevel;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }

  public void setIsRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> </div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※SET時、こちらが審査中の場合、編集はできません。<br> </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *In SET operation, cannot update it when this field is in editorial review.<br> </div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

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

