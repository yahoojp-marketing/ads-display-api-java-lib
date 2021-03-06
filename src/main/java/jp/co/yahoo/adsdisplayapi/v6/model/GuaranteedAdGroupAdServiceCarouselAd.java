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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedAdGroupAdServiceCarousel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is CAROUSEL_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedAdGroupAdServiceCarouselAdオブジェクトはカルーセル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがCAROUSEL_ADの場合は必須です。 </div> <div lang=\"en\"> GuaranteedAdGroupAdServiceCarouselAd obeject describes information of carousel ad.<br> This field is optional.<br> *If adType is CAROUSEL_AD, this field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceCarouselAd.JSON_PROPERTY_DISPLAY_URL,
  GuaranteedAdGroupAdServiceCarouselAd.JSON_PROPERTY_LOGO_MEDIA_ID,
  GuaranteedAdGroupAdServiceCarouselAd.JSON_PROPERTY_PRINCIPAL,
  GuaranteedAdGroupAdServiceCarouselAd.JSON_PROPERTY_URL,
  GuaranteedAdGroupAdServiceCarouselAd.JSON_PROPERTY_CAROUSELS
})
@JsonTypeName("GuaranteedAdGroupAdServiceCarouselAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceCarouselAd {
  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID = "logoMediaId";
  private Long logoMediaId;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CAROUSELS = "carousels";
  private List<GuaranteedAdGroupAdServiceCarousel> carousels = null;

  public GuaranteedAdGroupAdServiceCarouselAd() { 
  }

  public GuaranteedAdGroupAdServiceCarouselAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ・標準キャンペーンの場合&lt;br&gt; &amp;nbsp;&amp;nbsp;ADDでは入力必須です。SETでの入力は任意です。&lt;br&gt; ・アプリキャンペーンの場合&lt;br&gt; &amp;nbsp;&amp;nbsp;ADD、SETのどちらも指定できません。&lt;br&gt; &amp;nbsp;&amp;nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;- iOSの場合：itunes.apple.com&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;- Androidの場合：play.google.com &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; - Standard campaign:&lt;br&gt; &amp;nbsp;&amp;nbsp;Required for ADD, optional for SET.&lt;br&gt; - Mobile app campaign:&lt;br&gt; &amp;nbsp;&amp;nbsp;Not allowed for ADD and SET.&lt;br&gt; &amp;nbsp;&amp;nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;- For iOS : itunes.apple.com&lt;br&gt; &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;- For Android : play.google.com&lt;br&gt; &lt;/div&gt; 
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ・標準キャンペーンの場合<br> &nbsp;&nbsp;ADDでは入力必須です。SETでの入力は任意です。<br> ・アプリキャンペーンの場合<br> &nbsp;&nbsp;ADD、SETのどちらも指定できません。<br> &nbsp;&nbsp;※アプリキャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> &nbsp;&nbsp;&nbsp;&nbsp;- iOSの場合：itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> - Standard campaign:<br> &nbsp;&nbsp;Required for ADD, optional for SET.<br> - Mobile app campaign:<br> &nbsp;&nbsp;Not allowed for ADD and SET.<br> &nbsp;&nbsp;*Based on DeviceOsType specified on Mobile app campaign, any of the following URLs will be automatically set.<br> &nbsp;&nbsp;&nbsp;&nbsp;- For iOS : itunes.apple.com<br> &nbsp;&nbsp;&nbsp;&nbsp;- For Android : play.google.com<br> </div> ")
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


  public GuaranteedAdGroupAdServiceCarouselAd logoMediaId(Long logoMediaId) {
    
    this.logoMediaId = logoMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴの画像IDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Logo image ID.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return logoMediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴの画像IDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Logo image ID.<br> This field is optional in ADD and SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceCarouselAd principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の主体者表記です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Advertiser Indication of the ad.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication of the ad.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceCarouselAd url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public GuaranteedAdGroupAdServiceCarouselAd carousels(List<GuaranteedAdGroupAdServiceCarousel> carousels) {
    
    this.carousels = carousels;
    return this;
  }

  public GuaranteedAdGroupAdServiceCarouselAd addCarouselsItem(GuaranteedAdGroupAdServiceCarousel carouselsItem) {
    if (this.carousels == null) {
      this.carousels = new ArrayList<>();
    }
    this.carousels.add(carouselsItem);
    return this;
  }

   /**
   * Get carousels
   * @return carousels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAROUSELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupAdServiceCarousel> getCarousels() {
    return carousels;
  }


  @JsonProperty(JSON_PROPERTY_CAROUSELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarousels(List<GuaranteedAdGroupAdServiceCarousel> carousels) {
    this.carousels = carousels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceCarouselAd guaranteedAdGroupAdServiceCarouselAd = (GuaranteedAdGroupAdServiceCarouselAd) o;
    return Objects.equals(this.displayUrl, guaranteedAdGroupAdServiceCarouselAd.displayUrl) &&
        Objects.equals(this.logoMediaId, guaranteedAdGroupAdServiceCarouselAd.logoMediaId) &&
        Objects.equals(this.principal, guaranteedAdGroupAdServiceCarouselAd.principal) &&
        Objects.equals(this.url, guaranteedAdGroupAdServiceCarouselAd.url) &&
        Objects.equals(this.carousels, guaranteedAdGroupAdServiceCarouselAd.carousels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrl, logoMediaId, principal, url, carousels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceCarouselAd {\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    carousels: ").append(toIndentedString(carousels)).append("\n");
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

