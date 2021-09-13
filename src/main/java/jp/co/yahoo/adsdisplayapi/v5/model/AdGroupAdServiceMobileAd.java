package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceCarrierName;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceMobileAdオブジェクトは、モバイル広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがTEXT_SHORT_AD1またはTEXT_SHORT_AD2の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceMobileAd object describes mobile ad information.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is TEXT_SHORT_AD1 or TEXT_SHORT_AD2, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceMobileAdオブジェクトは、モバイル広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがTEXT_SHORT_AD1またはTEXT_SHORT_AD2の場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceMobileAd object describes mobile ad information.<br> This field is optional.<br> *If adType is TEXT_SHORT_AD1 or TEXT_SHORT_AD2, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceMobileAd   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("description2")
  private String description2 = null;

  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("mobileCarriers")
  @Valid
  private List<AdGroupAdServiceCarrierName> mobileCarriers = null;

  @JsonProperty("url")
  private String url = null;

  public AdGroupAdServiceMobileAd description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文（1行目）です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Description text (line 1).<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return description
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文（1行目）です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Description text (line 1).<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdGroupAdServiceMobileAd description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * <div lang=\"ja\"> 説明文（2行目）です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description text (line 2).<br> This field is optional in ADD and SET operation. </div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文（2行目）です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description text (line 2).<br> This field is optional in ADD and SET operation. </div> ")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public AdGroupAdServiceMobileAd displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ただし、キャンペーン目的「アプリ訴求」の場合は、ADD、SETのどちらも指定できません。キャンペーンで指定したDeviceOsTypeに基づき、以下のいずれかのURLが自動で設定されます。<br> - iOSの場合：itunes.apple.com<br> - Androidの場合：play.google.com </div> <div lang=\"en\"> Display URL.<br> This field is optional in ADD and SET operation.<br> However, not allowed for ADD and SET when a campaign goal is \"app promotion\". Based on DeviceOsType specified on the campaign, any of the following URLs will be automatically set.<br> - For iOS : itunes.apple.com<br> - For Android : play.google.com </div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceMobileAd headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * <div lang=\"ja\"> タイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return headline
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> タイトルです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Title.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getHeadline() {
    return headline;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAdServiceCarrierName> getMobileCarriers() {
    return mobileCarriers;
  }

  public void setMobileCarriers(List<AdGroupAdServiceCarrierName> mobileCarriers) {
    this.mobileCarriers = mobileCarriers;
  }

  public AdGroupAdServiceMobileAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"/reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"/reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


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

