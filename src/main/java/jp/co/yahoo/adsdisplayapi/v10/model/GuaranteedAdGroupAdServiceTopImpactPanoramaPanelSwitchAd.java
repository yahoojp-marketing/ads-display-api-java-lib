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
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v10.model.GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitch;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、トップインパクト パノラマ パネルスイッチ広告の情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information of Top Impact Panorama Panel-switch ad.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; * Not Available. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAdオブジェクトは、トップインパクト パノラマ パネルスイッチ広告の情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※現在利用できません </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd object describes the information of Top Impact Panorama Panel-switch ad.<br> This field will be returned in the response, it will be ignored on input.<br> * Not Available. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_AD_SHRINK_MAIN_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_PANELS,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
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

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd() { 
  }

  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd adShrinkMainMediaId(Long adShrinkMainMediaId) {
    
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


  public GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd trackingUrl(String trackingUrl) {
    
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
    GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd = (GuaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd) o;
    return Objects.equals(this.adShrinkMainMediaId, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.adShrinkMainMediaId) &&
        Objects.equals(this.panels, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.panels) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.finalUrl) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.displayUrlLevel) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.customParameters) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceTopImpactPanoramaPanelSwitchAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adShrinkMainMediaId, panels, finalUrl, displayUrlLevel, customParameters, trackingUrl);
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

