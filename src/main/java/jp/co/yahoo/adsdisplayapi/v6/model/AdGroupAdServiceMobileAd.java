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
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupAdServiceCarrierName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceMobileAdオブジェクトは、モバイル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがTEXT_SHORT_AD1またはTEXT_SHORT_AD2の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceMobileAd object describes mobile ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is TEXT_SHORT_AD1 or TEXT_SHORT_AD2, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceMobileAdオブジェクトは、モバイル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがTEXT_SHORT_AD1またはTEXT_SHORT_AD2の場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceMobileAd object describes mobile ad information.<br> This field is optional.<br> *If adType is TEXT_SHORT_AD1 or TEXT_SHORT_AD2, this field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  AdGroupAdServiceMobileAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceMobileAd.JSON_PROPERTY_DESCRIPTION2,
  AdGroupAdServiceMobileAd.JSON_PROPERTY_DISPLAY_URL,
  AdGroupAdServiceMobileAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceMobileAd.JSON_PROPERTY_MOBILE_CARRIERS,
  AdGroupAdServiceMobileAd.JSON_PROPERTY_URL
})
@JsonTypeName("AdGroupAdServiceMobileAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceMobileAd {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_MOBILE_CARRIERS = "mobileCarriers";
  private List<AdGroupAdServiceCarrierName> mobileCarriers = null;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public AdGroupAdServiceMobileAd() { 
  }

  public AdGroupAdServiceMobileAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 説明文（1行目）です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description text (line 1).&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文（1行目）です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Description text (line 1).<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public AdGroupAdServiceMobileAd description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 説明文（2行目）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description text (line 2).&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return description2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文（2行目）です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description text (line 2).<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  public AdGroupAdServiceMobileAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 表示URLです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。&lt;br&gt; - iOSの場合：itunes.apple.com&lt;br&gt; - Androidの場合：play.google.com &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display URL.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; However, not allowed for ADD and SET when a campaign goal is \&quot;app promotion\&quot;. Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.&lt;br&gt; - For iOS : itunes.apple.com&lt;br&gt; - For Android : play.google.com &lt;/div&gt; 
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")
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


  public AdGroupAdServiceMobileAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; タイトルです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Title.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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


  public AdGroupAdServiceMobileAd mobileCarriers(List<AdGroupAdServiceCarrierName> mobileCarriers) {
    
    this.mobileCarriers = mobileCarriers;
    return this;
  }

  public AdGroupAdServiceMobileAd addMobileCarriersItem(AdGroupAdServiceCarrierName mobileCarriersItem) {
    if (this.mobileCarriers == null) {
      this.mobileCarriers = new ArrayList<>();
    }
    this.mobileCarriers.add(mobileCarriersItem);
    return this;
  }

   /**
   * Get mobileCarriers
   * @return mobileCarriers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_CARRIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceCarrierName> getMobileCarriers() {
    return mobileCarriers;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_CARRIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileCarriers(List<AdGroupAdServiceCarrierName> mobileCarriers) {
    this.mobileCarriers = mobileCarriers;
  }


  public AdGroupAdServiceMobileAd url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リンク先URLです。&lt;br&gt; アプリ訴求キャンペーンで設定可能なリンク先URLについては&lt;a href&#x3D;\&quot;/reference/ads-display-api/v6/CampaignService/get/\&quot;&gt;こちら&lt;/a&gt;をご参照ください。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Destination URL.&lt;br&gt; For information about the destination URL that can be set with campaigns for \&quot;app promotion\&quot;, refer to &lt;a href&#x3D;\&quot;/reference/ads-display-api/v6/CampaignService/get/en/\&quot;&gt;this page&lt;/a&gt;.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v6/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v6/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
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
    AdGroupAdServiceMobileAd adGroupAdServiceMobileAd = (AdGroupAdServiceMobileAd) o;
    return Objects.equals(this.description, adGroupAdServiceMobileAd.description) &&
        Objects.equals(this.description2, adGroupAdServiceMobileAd.description2) &&
        Objects.equals(this.displayUrl, adGroupAdServiceMobileAd.displayUrl) &&
        Objects.equals(this.headline, adGroupAdServiceMobileAd.headline) &&
        Objects.equals(this.mobileCarriers, adGroupAdServiceMobileAd.mobileCarriers) &&
        Objects.equals(this.url, adGroupAdServiceMobileAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, description2, displayUrl, headline, mobileCarriers, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceMobileAd {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    mobileCarriers: ").append(toIndentedString(mobileCarriers)).append("\n");
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

