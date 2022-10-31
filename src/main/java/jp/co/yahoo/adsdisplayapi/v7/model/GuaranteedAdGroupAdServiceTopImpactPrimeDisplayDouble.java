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
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleオブジェクトは、予約型専用広告：メインの2:1の画像と、右サイド画像、左サイド画像で構成される広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble object describes information about a guaranteed ad composed of the main 2:1 video, the right side image, and the left side image.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDoubleオブジェクトは、予約型専用広告：メインの2:1の画像と、右サイド画像、左サイド画像で構成される広告の情報を表します。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble object describes information about a guaranteed ad composed of the main 2:1 video, the right side image, and the left side image.<br> This field is optional.<br> </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_URL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_TRACKING_URL,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID,
  GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID
})
@JsonTypeName("GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble {
  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_AD_LEFT_SIDE_MEDIA_ID = "adLeftSideMediaId";
  private Long adLeftSideMediaId;

  public static final String JSON_PROPERTY_AD_RIGHT_SIDE_MEDIA_ID = "adRightSideMediaId";
  private Long adRightSideMediaId;

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble() { 
  }

  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Display URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayUrl() {
    return displayUrl;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※現在利用できません &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; * Not Available. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ※現在利用できません </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation.<br> * Not Available. </div> ")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; If you specify finalUrl, trackingUrl and customParameters will be optional.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; &lt;/div&gt; 
   * @return finalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> finalUrlフィールドを設定する場合、trackingUrl、customParametersは任意になります。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> </div> <div lang=\"en\">Final URL.<br> If you specify finalUrl, trackingUrl and customParameters will be optional.<br> This field is required in ADD operation, and will be optional in SET operation.<br> </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble isRemoveTrackingUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveTrackingUrl) {
    
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; This field can be optionally specified only when specifying finalUrl.&lt;br&gt; &lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。<br> finalUrlを指定するときのみ、任意で指定できます。<br> </div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.<br> This field can be optionally specified only when specifying finalUrl.<br> </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble adLeftSideMediaId(Long adLeftSideMediaId) {
    
    this.adLeftSideMediaId = adLeftSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 左サイド画像です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Left side image.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adLeftSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 左サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Left side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble adRightSideMediaId(Long adRightSideMediaId) {
    
    this.adRightSideMediaId = adRightSideMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 右サイド画像です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Right side image.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adRightSideMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 右サイド画像です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Right side image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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
    GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble = (GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.displayUrl) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.url) &&
        Objects.equals(this.customParameters, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.customParameters) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.finalUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.isRemoveTrackingUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.trackingUrl) &&
        Objects.equals(this.adLeftSideMediaId, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.adLeftSideMediaId) &&
        Objects.equals(this.adRightSideMediaId, guaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble.adRightSideMediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, url, customParameters, displayUrlLevel, finalUrl, isRemoveTrackingUrl, trackingUrl, adLeftSideMediaId, adRightSideMediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopImpactPrimeDisplayDouble {\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

