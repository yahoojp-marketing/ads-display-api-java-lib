/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v15.model.GuaranteedAdGroupAdServiceCustomParameters;
import jp.co.yahoo.adsdisplayapi.v15.model.GuaranteedAdGroupAdServiceDisplayUrlLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceTopPageTopicsPRAdオブジェクトは、トップページ トピックスPR広告の情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceTopPageTopicsPRAd object describes the information of Top Page Topics PR ad.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_DISPLAY_URL_LEVEL,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_FINAL_URL,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_HEADLINE,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_PRINCIPAL,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  GuaranteedAdGroupAdServiceTopPageTopicsPRAd.JSON_PROPERTY_TRACKING_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceTopPageTopicsPRAd {
  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private GuaranteedAdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_DISPLAY_URL_LEVEL = "displayUrlLevel";
  private GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd() {
  }

  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd customParameters(GuaranteedAdGroupAdServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; &lt;/div&gt; 
   * @return displayUrl
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd displayUrlLevel(GuaranteedAdGroupAdServiceDisplayUrlLevel displayUrlLevel) {
    
    this.displayUrlLevel = displayUrlLevel;
    return this;
  }

   /**
   * Get displayUrlLevel
   * @return displayUrlLevel
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return finalUrl
  **/
  @jakarta.annotation.Nullable
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


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ヘッドラインです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Headline.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の主体者表記です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Advertiser Indication of the ad.&lt;br&gt; This field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return principal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;br&gt; finalUrlを指定するときのみ、任意で指定できます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Final URL (smartphone).&lt;br&gt; This field can be optionally specified only when specifying finalUrl. 
   * @return smartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }


  public GuaranteedAdGroupAdServiceTopPageTopicsPRAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field will be returned in the response, it will be ignored on input.&lt;br&gt; &lt;/div&gt; 
   * @return trackingUrl
  **/
  @jakarta.annotation.Nullable
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
    GuaranteedAdGroupAdServiceTopPageTopicsPRAd guaranteedAdGroupAdServiceTopPageTopicsPRAd = (GuaranteedAdGroupAdServiceTopPageTopicsPRAd) o;
    return Objects.equals(this.customParameters, guaranteedAdGroupAdServiceTopPageTopicsPRAd.customParameters) &&
        Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceTopPageTopicsPRAd.displayUrl) &&
        Objects.equals(this.displayUrlLevel, guaranteedAdGroupAdServiceTopPageTopicsPRAd.displayUrlLevel) &&
        Objects.equals(this.finalUrl, guaranteedAdGroupAdServiceTopPageTopicsPRAd.finalUrl) &&
        Objects.equals(this.headline, guaranteedAdGroupAdServiceTopPageTopicsPRAd.headline) &&
        Objects.equals(this.principal, guaranteedAdGroupAdServiceTopPageTopicsPRAd.principal) &&
        Objects.equals(this.smartphoneFinalUrl, guaranteedAdGroupAdServiceTopPageTopicsPRAd.smartphoneFinalUrl) &&
        Objects.equals(this.trackingUrl, guaranteedAdGroupAdServiceTopPageTopicsPRAd.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customParameters, displayUrl, displayUrlLevel, finalUrl, headline, principal, smartphoneFinalUrl, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceTopPageTopicsPRAd {\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    displayUrlLevel: ").append(toIndentedString(displayUrlLevel)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
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
