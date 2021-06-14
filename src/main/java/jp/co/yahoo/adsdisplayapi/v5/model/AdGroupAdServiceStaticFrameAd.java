package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceIsRemoveFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is STATIC_FRAME_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceStaticFrameAdオブジェクトは、広告枠サイズ固定広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがSTATIC_FRAME_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceStaticFrameAd object describes the Static Frame Ad information.<br> This field is optional.<br> *If adType is STATIC_FRAME_AD, this field is required in ADD operation. </div> ")

public class AdGroupAdServiceStaticFrameAd   {
  @JsonProperty("buttonText")
  private JsonNullable<AdGroupAdServiceButtonText> buttonText = JsonNullable.undefined();

  @JsonProperty("colorSetId")
  private JsonNullable<Long> colorSetId = JsonNullable.undefined();

  @JsonProperty("description")
  private JsonNullable<String> description = JsonNullable.undefined();

  @JsonProperty("displayUrl")
  private JsonNullable<String> displayUrl = JsonNullable.undefined();

  @JsonProperty("headline")
  private JsonNullable<String> headline = JsonNullable.undefined();

  @JsonProperty("isRemoveLogoMediaId")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveLogoMediaId = JsonNullable.undefined();

  @JsonProperty("layout")
  private JsonNullable<String> layout = JsonNullable.undefined();

  @JsonProperty("logoMediaId")
  private JsonNullable<Long> logoMediaId = JsonNullable.undefined();

  @JsonProperty("principal")
  private JsonNullable<String> principal = JsonNullable.undefined();

  @JsonProperty("size")
  private JsonNullable<String> size = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  public AdGroupAdServiceStaticFrameAd buttonText(AdGroupAdServiceButtonText buttonText) {
    this.buttonText = JsonNullable.of(buttonText);
    return this;
  }

  /**
   * Get buttonText
   * @return buttonText
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceButtonText> getButtonText() {
    return buttonText;
  }

  public void setButtonText(JsonNullable<AdGroupAdServiceButtonText> buttonText) {
    this.buttonText = buttonText;
  }

  public AdGroupAdServiceStaticFrameAd colorSetId(Long colorSetId) {
    this.colorSetId = JsonNullable.of(colorSetId);
    return this;
  }

  /**
   * <div lang=\"ja\"> カラーセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color set ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return colorSetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> カラーセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Color set ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getColorSetId() {
    return colorSetId;
  }

  public void setColorSetId(JsonNullable<Long> colorSetId) {
    this.colorSetId = colorSetId;
  }

  public AdGroupAdServiceStaticFrameAd description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Description.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public AdGroupAdServiceStaticFrameAd displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Display URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Display URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceStaticFrameAd headline(String headline) {
    this.headline = JsonNullable.of(headline);
    return this;
  }

  /**
   * <div lang=\"ja\"> タイトルです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Title.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Title.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getHeadline() {
    return headline;
  }

  public void setHeadline(JsonNullable<String> headline) {
    this.headline = headline;
  }

  public AdGroupAdServiceStaticFrameAd isRemoveLogoMediaId(AdGroupAdServiceIsRemoveFlg isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = JsonNullable.of(isRemoveLogoMediaId);
    return this;
  }

  /**
   * Get isRemoveLogoMediaId
   * @return isRemoveLogoMediaId
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveLogoMediaId() {
    return isRemoveLogoMediaId;
  }

  public void setIsRemoveLogoMediaId(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveLogoMediaId) {
    this.isRemoveLogoMediaId = isRemoveLogoMediaId;
  }

  public AdGroupAdServiceStaticFrameAd layout(String layout) {
    this.layout = JsonNullable.of(layout);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告レイアウトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Layout.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return layout
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告レイアウトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Layout.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getLayout() {
    return layout;
  }

  public void setLayout(JsonNullable<String> layout) {
    this.layout = layout;
  }

  public AdGroupAdServiceStaticFrameAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = JsonNullable.of(logoMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Media ID of logo image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Media ID of logo image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(JsonNullable<Long> logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceStaticFrameAd principal(String principal) {
    this.principal = JsonNullable.of(principal);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Advertiser Indication.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Advertiser Indication.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(JsonNullable<String> principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceStaticFrameAd size(String size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告サイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Size.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return size
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告サイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad Size.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getSize() {
    return size;
  }

  public void setSize(JsonNullable<String> size) {
    this.size = size;
  }

  public AdGroupAdServiceStaticFrameAd url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Destination URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Destination URL.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

