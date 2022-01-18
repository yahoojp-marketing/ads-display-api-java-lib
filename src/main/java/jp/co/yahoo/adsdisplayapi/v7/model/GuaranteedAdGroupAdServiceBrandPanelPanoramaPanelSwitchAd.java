package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナーで構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがBRANDPANEL_PANORAMA_PANEL_SWITCHの場合は必須です。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, and 16:9 reduced banner.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is BRANDPANEL_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAdオブジェクトは、予約型専用広告：メインの3:1の画像と、1:1のスイッチ画像、16:9の縮小バナーで構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがBRANDPANEL_PANORAMA_PANEL_SWITCHの場合は必須です。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd object describes the information about guaranteed ad composed of the main 3:1 image, 1:1 switch image, and 16:9 reduced banner.<br> This field is optional.<br> *If adType is BRANDPANEL_PANORAMA_PANEL_SWITCH, this field is required in ADD operation.<br> * Not Available. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd   {
  @JsonProperty("adShrinkMainMediaId")
  private Long adShrinkMainMediaId = null;

  @JsonProperty("panels")
  @Valid
  private List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> panels = null;

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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd adShrinkMainMediaId(Long adShrinkMainMediaId) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd panels(List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> panels) {
    this.panels = panels;
    return this;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd addPanelsItem(GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch panelsItem) {
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

  public List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> getPanels() {
    return panels;
  }

  public void setPanels(List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> panels) {
    this.panels = panels;
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd finalUrl(String finalUrl) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
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

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd trackingUrl(String trackingUrl) {
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
    GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd = (GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd) o;
    return Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.adShrinkMainMediaId) &&
        Objects.equals(this.panels, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.panels) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.finalUrl) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.displayUrlLevel) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.customParameters) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adShrinkMainMediaId, panels, finalUrl, displayUrlLevel, customParameters, isRemoveTrackingUrl, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd {\n");
    
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

