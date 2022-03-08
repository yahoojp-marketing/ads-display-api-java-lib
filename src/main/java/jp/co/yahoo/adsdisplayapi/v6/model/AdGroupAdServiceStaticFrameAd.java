/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is STATIC_FRAME_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.<br> This field is optional.<br> *If adType is STATIC_FRAME_AD, this field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_BUTTON_TEXT,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_COLOR_SET_ID,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_DISPLAY_URL,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_LAYOUT,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_LOGO_MEDIA_ID,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_PRINCIPAL,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_SIZE,
  AdGroupAdServiceStaticFrameAd.JSON_PROPERTY_URL
})
@JsonTypeName("AdGroupAdServiceStaticFrameAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceStaticFrameAd {
  public static final String JSON_PROPERTY_BUTTON_TEXT = "buttonText";
  private AdGroupAdServiceButtonText buttonText;

  public static final String JSON_PROPERTY_COLOR_SET_ID = "colorSetId";
  private Long colorSetId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID = "isRemoveLogoMediaId";
  private AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private String layout;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID = "logoMediaId";
  private Long logoMediaId;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public AdGroupAdServiceStaticFrameAd() { 
  }

  public AdGroupAdServiceStaticFrameAd buttonText(AdGroupAdServiceButtonText buttonText) {
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUTTON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceButtonText getButtonText() {
    return buttonText;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
  }


  public AdGroupAdServiceStaticFrameAd colorSetId(Long colorSetId) {
    
    this.colorSetId = colorSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; カラーセットIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Color set ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return colorSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color set ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_COLOR_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getColorSetId() {
    return colorSetId;
  }


  @JsonProperty(JSON_PROPERTY_COLOR_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorSetId(Long colorSetId) {
    this.colorSetId = colorSetId;
  }


  public AdGroupAdServiceStaticFrameAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 説明文です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AdGroupAdServiceStaticFrameAd displayUrl(String displayUrl) {
    
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


  public AdGroupAdServiceStaticFrameAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; タイトルです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Title.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Title.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupAdServiceStaticFrameAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
    return this;
  }

   /**
   * Get isRemoveLogoMediaId
   * @return isRemoveLogoMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }


  public AdGroupAdServiceStaticFrameAd layout(String layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告レイアウトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad Layout.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告レイアウトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Layout.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLayout() {
    return layout;
  }


  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLayout(String layout) {
    this.layout = layout;
  }


  public AdGroupAdServiceStaticFrameAd logoMediaId(Long logoMediaId) {
    
    this.logoMediaId = logoMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴ画像のメディアIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of logo image.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return logoMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Media ID of logo image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogoMediaId() {
    return logoMediaId;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
  }


  public AdGroupAdServiceStaticFrameAd principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の主体者表記です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Advertiser Indication.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Advertiser Indication.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupAdServiceStaticFrameAd size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告サイズです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad Size.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告サイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Size.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }


  public AdGroupAdServiceStaticFrameAd url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Destination URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceStaticFrameAd adGroupAdServiceStaticFrameAd = (AdGroupAdServiceStaticFrameAd) o;
    return Objects.equals(this.buttonText, adGroupAdServiceStaticFrameAd.buttonText) &&
        Objects.equals(this.colorSetId, adGroupAdServiceStaticFrameAd.colorSetId) &&
        Objects.equals(this.description, adGroupAdServiceStaticFrameAd.description) &&
        Objects.equals(this.displayUrl, adGroupAdServiceStaticFrameAd.displayUrl) &&
        Objects.equals(this.headline, adGroupAdServiceStaticFrameAd.headline) &&
        Objects.equals(this.isRemoveLogoMediaId, adGroupAdServiceStaticFrameAd.isRemoveLogoMediaId) &&
        Objects.equals(this.layout, adGroupAdServiceStaticFrameAd.layout) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceStaticFrameAd.logoMediaId) &&
        Objects.equals(this.principal, adGroupAdServiceStaticFrameAd.principal) &&
        Objects.equals(this.size, adGroupAdServiceStaticFrameAd.size) &&
        Objects.equals(this.url, adGroupAdServiceStaticFrameAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, colorSetId, description, displayUrl, headline, isRemoveLogoMediaId, layout, logoMediaId, principal, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceStaticFrameAd {\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    colorSetId: ").append(toIndentedString(colorSetId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    isRemoveLogoMediaId: ").append(toIndentedString(isRemoveLogoMediaId)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

