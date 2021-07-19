package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceIsRemoveFlg;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is STATIC_FRAME_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.<br> This field is optional.<br> *If adType is STATIC_FRAME_AD, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceStaticFrameAd   {
  @JsonProperty("buttonText")
  private AdGroupAdServiceButtonText buttonText = null;

  @JsonProperty("colorSetId")
  private Long colorSetId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("isRemoveLogoMediaId")
  private AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId = null;

  @JsonProperty("layout")
  private String layout = null;

  @JsonProperty("logoMediaId")
  private Long logoMediaId = null;

  @JsonProperty("principal")
  private String principal = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("url")
  private String url = null;

  public AdGroupAdServiceStaticFrameAd buttonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   * @return buttonText
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceButtonText getButtonText() {
    return buttonText;
  }

  public void setButtonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = buttonText;
  }

  public AdGroupAdServiceStaticFrameAd colorSetId(Long colorSetId) {
    this.colorSetId = colorSetId;
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color set ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return colorSetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color set ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getColorSetId() {
    return colorSetId;
  }

  public void setColorSetId(Long colorSetId) {
    this.colorSetId = colorSetId;
  }

  public AdGroupAdServiceStaticFrameAd description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdGroupAdServiceStaticFrameAd displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Display URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Display URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceStaticFrameAd headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> タイトルです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Title.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Title.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getHeadline() {
    return headline;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }

  public void setIsRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }

  public AdGroupAdServiceStaticFrameAd layout(String layout) {
    this.layout = layout;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告レイアウトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Layout.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return layout
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告レイアウトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Layout.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getLayout() {
    return layout;
  }

  public void setLayout(String layout) {
    this.layout = layout;
  }

  public AdGroupAdServiceStaticFrameAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Media ID of logo image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Media ID of logo image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(Long logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceStaticFrameAd principal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Advertiser Indication.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Advertiser Indication.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceStaticFrameAd size(String size) {
    this.size = size;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告サイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Size.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return size
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告サイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Size.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public AdGroupAdServiceStaticFrameAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Destination URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Destination URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getUrl() {
    return url;
  }

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

