/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

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
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAdオブジェクトは、ブランドパネル パノラマ パネルスイッチ広告の情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd object describes the information of Brand Panel Panorama Panel-switch ad.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAdオブジェクトは、ブランドパネル パノラマ パネルスイッチ広告の情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd object describes the information of Brand Panel Panorama Panel-switch ad.<br> This field will be returned in the response, it will be ignored on input.<br> * Not Available. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_PANELS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.JSON_PROPERTY_TRACKING_URL
})
@JsonTypeName("GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd {
  public static final String JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID = "adShrinkMainMediaId";
  private Long adShrinkMainMediaId;

  public static final String JSON_PROPERTY_PANELS = "panels";
  private List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> panels = null;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd() { 
  }

  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd adShrinkMainMediaId(Long adShrinkMainMediaId) {
    
    this.adShrinkMainMediaId = adShrinkMainMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 縮小メイン画像です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Reduced main image.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adShrinkMainMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 縮小メイン画像です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reduced main image.<br> This field will be returned in the response, it will be ignored on input. </div> ")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PANELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> getPanels() {
    return panels;
  }


  @JsonProperty(JSON_PROPERTY_PANELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPanels(List<GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitch> panels) {
    this.panels = panels;
  }


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Final URL.<br> This field will be returned in the response, it will be ignored on input. </div> ")
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
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


  public GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; &lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> </div> <div lang=\"en\">Tracking URL.<br> This field will be returned in the response, it will be ignored on input.<br> </div> ")
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
    GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd = (GuaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd) o;
    return Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.adShrinkMainMediaId) &&
        Objects.equals(this.panels, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.panels) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.finalUrl) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.displayUrlLevel) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.customParameters) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceBrandPanelPanoramaPanelSwitchAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adShrinkMainMediaId, panels, finalUrl, displayUrlLevel, customParameters, trackingUrl);
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

