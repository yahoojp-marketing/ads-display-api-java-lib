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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceDynamicAdオブジェクトは、動的ディスプレイ広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがDYNAMIC_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceDynamicAd object describes information regarding dynamic ads for display.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is DYNAMIC_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceDynamicAdオブジェクトは、動的ディスプレイ広告の情報を表します。<br> このフィールドは、省略可能となります。<br> ※ADD時、adTypeがDYNAMIC_ADの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceDynamicAd object describes information regarding dynamic ads for display.<br> This field is optional.<br> *If adType is DYNAMIC_AD, this field is required in ADD operation. </div> ")

public class AdGroupAdServiceDynamicAd   {
  @JsonProperty("brandColor")
  private JsonNullable<String> brandColor = JsonNullable.undefined();

  @JsonProperty("buttonText")
  private JsonNullable<AdGroupAdServiceButtonText> buttonText = JsonNullable.undefined();

  @JsonProperty("campaignBannerMediaId")
  private JsonNullable<Long> campaignBannerMediaId = JsonNullable.undefined();

  @JsonProperty("campaignBannerMediaId2")
  private JsonNullable<Long> campaignBannerMediaId2 = JsonNullable.undefined();

  @JsonProperty("campaignBannerMediaId3")
  private JsonNullable<Long> campaignBannerMediaId3 = JsonNullable.undefined();

  @JsonProperty("campaignBannerMediaId4")
  private JsonNullable<Long> campaignBannerMediaId4 = JsonNullable.undefined();

  @JsonProperty("campaignBannerUrl")
  private JsonNullable<String> campaignBannerUrl = JsonNullable.undefined();

  @JsonProperty("displayUrl")
  private JsonNullable<String> displayUrl = JsonNullable.undefined();

  @JsonProperty("isRemoveCampaignBannerMediaId")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId = JsonNullable.undefined();

  @JsonProperty("isRemoveCampaignBannerMediaId2")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId2 = JsonNullable.undefined();

  @JsonProperty("isRemoveCampaignBannerMediaId3")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId3 = JsonNullable.undefined();

  @JsonProperty("isRemoveCampaignBannerMediaId4")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId4 = JsonNullable.undefined();

  @JsonProperty("isRemoveCampaignBannerUrl")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerUrl = JsonNullable.undefined();

  @JsonProperty("logoMediaId")
  private JsonNullable<Long> logoMediaId = JsonNullable.undefined();

  @JsonProperty("logoMediaId2")
  private JsonNullable<Long> logoMediaId2 = JsonNullable.undefined();

  @JsonProperty("logoMediaId3")
  private JsonNullable<Long> logoMediaId3 = JsonNullable.undefined();

  @JsonProperty("prefix")
  private JsonNullable<String> prefix = JsonNullable.undefined();

  @JsonProperty("principal")
  private JsonNullable<String> principal = JsonNullable.undefined();

  @JsonProperty("suffix")
  private JsonNullable<String> suffix = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  @JsonProperty("isRemovePrefix")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemovePrefix = JsonNullable.undefined();

  @JsonProperty("isRemoveSuffix")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveSuffix = JsonNullable.undefined();

  @JsonProperty("isRemoveBrandColor")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveBrandColor = JsonNullable.undefined();

  public AdGroupAdServiceDynamicAd brandColor(String brandColor) {
    this.brandColor = JsonNullable.of(brandColor);
    return this;
  }

  /**
   * <div lang=\"ja\"> ブランドカラーです。<br> ※RGB、HEX指定です。<br> 設定例：#FFFFFF<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Brand color.<br> Format :RGB or HEX<br> e.g.：#FFFFFF<br> This field is optional in ADD and SET operation. </div> 
   * @return brandColor
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ブランドカラーです。<br> ※RGB、HEX指定です。<br> 設定例：#FFFFFF<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Brand color.<br> Format :RGB or HEX<br> e.g.：#FFFFFF<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(JsonNullable<String> brandColor) {
    this.brandColor = brandColor;
  }

  public AdGroupAdServiceDynamicAd buttonText(AdGroupAdServiceButtonText buttonText) {
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

  public AdGroupAdServiceDynamicAd campaignBannerMediaId(Long campaignBannerMediaId) {
    this.campaignBannerMediaId = JsonNullable.of(campaignBannerMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンバナー画像のメディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return campaignBannerMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンバナー画像のメディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getCampaignBannerMediaId() {
    return campaignBannerMediaId;
  }

  public void setCampaignBannerMediaId(JsonNullable<Long> campaignBannerMediaId) {
    this.campaignBannerMediaId = campaignBannerMediaId;
  }

  public AdGroupAdServiceDynamicAd campaignBannerMediaId2(Long campaignBannerMediaId2) {
    this.campaignBannerMediaId2 = JsonNullable.of(campaignBannerMediaId2);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンバナー画像のメディアID 2です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 2.<br> This field is optional in ADD and SET operation. </div> 
   * @return campaignBannerMediaId2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンバナー画像のメディアID 2です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 2.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getCampaignBannerMediaId2() {
    return campaignBannerMediaId2;
  }

  public void setCampaignBannerMediaId2(JsonNullable<Long> campaignBannerMediaId2) {
    this.campaignBannerMediaId2 = campaignBannerMediaId2;
  }

  public AdGroupAdServiceDynamicAd campaignBannerMediaId3(Long campaignBannerMediaId3) {
    this.campaignBannerMediaId3 = JsonNullable.of(campaignBannerMediaId3);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンバナー画像のメディアID 3です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 3.<br> This field is optional in ADD and SET operation. </div> 
   * @return campaignBannerMediaId3
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンバナー画像のメディアID 3です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 3.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getCampaignBannerMediaId3() {
    return campaignBannerMediaId3;
  }

  public void setCampaignBannerMediaId3(JsonNullable<Long> campaignBannerMediaId3) {
    this.campaignBannerMediaId3 = campaignBannerMediaId3;
  }

  public AdGroupAdServiceDynamicAd campaignBannerMediaId4(Long campaignBannerMediaId4) {
    this.campaignBannerMediaId4 = JsonNullable.of(campaignBannerMediaId4);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンバナー画像のメディアID 4です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 4.<br> This field is optional in ADD and SET operation. </div> 
   * @return campaignBannerMediaId4
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンバナー画像のメディアID 4です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Campaign banner media ID 4.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getCampaignBannerMediaId4() {
    return campaignBannerMediaId4;
  }

  public void setCampaignBannerMediaId4(JsonNullable<Long> campaignBannerMediaId4) {
    this.campaignBannerMediaId4 = campaignBannerMediaId4;
  }

  public AdGroupAdServiceDynamicAd campaignBannerUrl(String campaignBannerUrl) {
    this.campaignBannerUrl = JsonNullable.of(campaignBannerUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンバナーURLです。<br> このフィールドは省略可能となります。<br> ADD時、設定する場合は以下のいずれかの指定が必要となります。<br> - campaignBannerMediaId<br> - campaignBannerMediaId2<br> - campaignBannerMediaId3<br> - campaignBannerMediaId4 </div> <div lang=\"en\"> Campaign banner URL.<br> This field is optional.<br> For setting in ADD operation, one of the following is required:<br> - campaignBannerMediaId<br> - campaignBannerMediaId2<br> - campaignBannerMediaId3<br> - campaignBannerMediaId4 </div> 
   * @return campaignBannerUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンバナーURLです。<br> このフィールドは省略可能となります。<br> ADD時、設定する場合は以下のいずれかの指定が必要となります。<br> - campaignBannerMediaId<br> - campaignBannerMediaId2<br> - campaignBannerMediaId3<br> - campaignBannerMediaId4 </div> <div lang=\"en\"> Campaign banner URL.<br> This field is optional.<br> For setting in ADD operation, one of the following is required:<br> - campaignBannerMediaId<br> - campaignBannerMediaId2<br> - campaignBannerMediaId3<br> - campaignBannerMediaId4 </div> ")


  public JsonNullable<String> getCampaignBannerUrl() {
    return campaignBannerUrl;
  }

  public void setCampaignBannerUrl(JsonNullable<String> campaignBannerUrl) {
    this.campaignBannerUrl = campaignBannerUrl;
  }

  public AdGroupAdServiceDynamicAd displayUrl(String displayUrl) {
    this.displayUrl = JsonNullable.of(displayUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 表示URLです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Display URL.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(JsonNullable<String> displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceDynamicAd isRemoveCampaignBannerMediaId(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId) {
    this.isRemoveCampaignBannerMediaId = JsonNullable.of(isRemoveCampaignBannerMediaId);
    return this;
  }

  /**
   * Get isRemoveCampaignBannerMediaId
   * @return isRemoveCampaignBannerMediaId
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveCampaignBannerMediaId() {
    return isRemoveCampaignBannerMediaId;
  }

  public void setIsRemoveCampaignBannerMediaId(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId) {
    this.isRemoveCampaignBannerMediaId = isRemoveCampaignBannerMediaId;
  }

  public AdGroupAdServiceDynamicAd isRemoveCampaignBannerMediaId2(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId2) {
    this.isRemoveCampaignBannerMediaId2 = JsonNullable.of(isRemoveCampaignBannerMediaId2);
    return this;
  }

  /**
   * Get isRemoveCampaignBannerMediaId2
   * @return isRemoveCampaignBannerMediaId2
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveCampaignBannerMediaId2() {
    return isRemoveCampaignBannerMediaId2;
  }

  public void setIsRemoveCampaignBannerMediaId2(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId2) {
    this.isRemoveCampaignBannerMediaId2 = isRemoveCampaignBannerMediaId2;
  }

  public AdGroupAdServiceDynamicAd isRemoveCampaignBannerMediaId3(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId3) {
    this.isRemoveCampaignBannerMediaId3 = JsonNullable.of(isRemoveCampaignBannerMediaId3);
    return this;
  }

  /**
   * Get isRemoveCampaignBannerMediaId3
   * @return isRemoveCampaignBannerMediaId3
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveCampaignBannerMediaId3() {
    return isRemoveCampaignBannerMediaId3;
  }

  public void setIsRemoveCampaignBannerMediaId3(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId3) {
    this.isRemoveCampaignBannerMediaId3 = isRemoveCampaignBannerMediaId3;
  }

  public AdGroupAdServiceDynamicAd isRemoveCampaignBannerMediaId4(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId4) {
    this.isRemoveCampaignBannerMediaId4 = JsonNullable.of(isRemoveCampaignBannerMediaId4);
    return this;
  }

  /**
   * Get isRemoveCampaignBannerMediaId4
   * @return isRemoveCampaignBannerMediaId4
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveCampaignBannerMediaId4() {
    return isRemoveCampaignBannerMediaId4;
  }

  public void setIsRemoveCampaignBannerMediaId4(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerMediaId4) {
    this.isRemoveCampaignBannerMediaId4 = isRemoveCampaignBannerMediaId4;
  }

  public AdGroupAdServiceDynamicAd isRemoveCampaignBannerUrl(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerUrl) {
    this.isRemoveCampaignBannerUrl = JsonNullable.of(isRemoveCampaignBannerUrl);
    return this;
  }

  /**
   * Get isRemoveCampaignBannerUrl
   * @return isRemoveCampaignBannerUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveCampaignBannerUrl() {
    return isRemoveCampaignBannerUrl;
  }

  public void setIsRemoveCampaignBannerUrl(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveCampaignBannerUrl) {
    this.isRemoveCampaignBannerUrl = isRemoveCampaignBannerUrl;
  }

  public AdGroupAdServiceDynamicAd logoMediaId(Long logoMediaId) {
    this.logoMediaId = JsonNullable.of(logoMediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return logoMediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getLogoMediaId() {
    return logoMediaId;
  }

  public void setLogoMediaId(JsonNullable<Long> logoMediaId) {
    this.logoMediaId = logoMediaId;
  }

  public AdGroupAdServiceDynamicAd logoMediaId2(Long logoMediaId2) {
    this.logoMediaId2 = JsonNullable.of(logoMediaId2);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアID 2です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image 2.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return logoMediaId2
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアID 2です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image 2.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getLogoMediaId2() {
    return logoMediaId2;
  }

  public void setLogoMediaId2(JsonNullable<Long> logoMediaId2) {
    this.logoMediaId2 = logoMediaId2;
  }

  public AdGroupAdServiceDynamicAd logoMediaId3(Long logoMediaId3) {
    this.logoMediaId3 = JsonNullable.of(logoMediaId3);
    return this;
  }

  /**
   * <div lang=\"ja\"> ロゴ画像のメディアID 3です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image 3.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return logoMediaId3
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ロゴ画像のメディアID 3です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Media ID of logo image 3.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getLogoMediaId3() {
    return logoMediaId3;
  }

  public void setLogoMediaId3(JsonNullable<Long> logoMediaId3) {
    this.logoMediaId3 = logoMediaId3;
  }

  public AdGroupAdServiceDynamicAd prefix(String prefix) {
    this.prefix = JsonNullable.of(prefix);
    return this;
  }

  /**
   * <div lang=\"ja\"> プレフィックスです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Prefix.<br> This field is optional in ADD and SET operation. </div> 
   * @return prefix
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> プレフィックスです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Prefix.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getPrefix() {
    return prefix;
  }

  public void setPrefix(JsonNullable<String> prefix) {
    this.prefix = prefix;
  }

  public AdGroupAdServiceDynamicAd principal(String principal) {
    this.principal = JsonNullable.of(principal);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return principal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告の主体者表記です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Advertiser Indication.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(JsonNullable<String> principal) {
    this.principal = principal;
  }

  public AdGroupAdServiceDynamicAd suffix(String suffix) {
    this.suffix = JsonNullable.of(suffix);
    return this;
  }

  /**
   * <div lang=\"ja\"> サフィックスです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Suffix.<br> This field is optional in ADD and SET operation. </div> 
   * @return suffix
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> サフィックスです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Suffix.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getSuffix() {
    return suffix;
  }

  public void setSuffix(JsonNullable<String> suffix) {
    this.suffix = suffix;
  }

  public AdGroupAdServiceDynamicAd url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先URLです。<br> アプリ訴求キャンペーンで設定可能なリンク先URLについては<a href=\"reference/ads-display-api/v5/CampaignService/get/\">こちら</a>をご参照ください。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Destination URL.<br> For information about the destination URL that can be set with campaigns for \"app promotion\", refer to <a href=\"reference/ads-display-api/v5/CampaignService/get/en/\">this page</a>.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public AdGroupAdServiceDynamicAd isRemovePrefix(AdGroupAdServiceIsRemoveFlg isRemovePrefix) {
    this.isRemovePrefix = JsonNullable.of(isRemovePrefix);
    return this;
  }

  /**
   * Get isRemovePrefix
   * @return isRemovePrefix
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemovePrefix() {
    return isRemovePrefix;
  }

  public void setIsRemovePrefix(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemovePrefix) {
    this.isRemovePrefix = isRemovePrefix;
  }

  public AdGroupAdServiceDynamicAd isRemoveSuffix(AdGroupAdServiceIsRemoveFlg isRemoveSuffix) {
    this.isRemoveSuffix = JsonNullable.of(isRemoveSuffix);
    return this;
  }

  /**
   * Get isRemoveSuffix
   * @return isRemoveSuffix
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveSuffix() {
    return isRemoveSuffix;
  }

  public void setIsRemoveSuffix(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveSuffix) {
    this.isRemoveSuffix = isRemoveSuffix;
  }

  public AdGroupAdServiceDynamicAd isRemoveBrandColor(AdGroupAdServiceIsRemoveFlg isRemoveBrandColor) {
    this.isRemoveBrandColor = JsonNullable.of(isRemoveBrandColor);
    return this;
  }

  /**
   * Get isRemoveBrandColor
   * @return isRemoveBrandColor
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveBrandColor() {
    return isRemoveBrandColor;
  }

  public void setIsRemoveBrandColor(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveBrandColor) {
    this.isRemoveBrandColor = isRemoveBrandColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceDynamicAd adGroupAdServiceDynamicAd = (AdGroupAdServiceDynamicAd) o;
    return Objects.equals(this.brandColor, adGroupAdServiceDynamicAd.brandColor) &&
        Objects.equals(this.buttonText, adGroupAdServiceDynamicAd.buttonText) &&
        Objects.equals(this.campaignBannerMediaId, adGroupAdServiceDynamicAd.campaignBannerMediaId) &&
        Objects.equals(this.campaignBannerMediaId2, adGroupAdServiceDynamicAd.campaignBannerMediaId2) &&
        Objects.equals(this.campaignBannerMediaId3, adGroupAdServiceDynamicAd.campaignBannerMediaId3) &&
        Objects.equals(this.campaignBannerMediaId4, adGroupAdServiceDynamicAd.campaignBannerMediaId4) &&
        Objects.equals(this.campaignBannerUrl, adGroupAdServiceDynamicAd.campaignBannerUrl) &&
        Objects.equals(this.displayUrl, adGroupAdServiceDynamicAd.displayUrl) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId, adGroupAdServiceDynamicAd.isRemoveCampaignBannerMediaId) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId2, adGroupAdServiceDynamicAd.isRemoveCampaignBannerMediaId2) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId3, adGroupAdServiceDynamicAd.isRemoveCampaignBannerMediaId3) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId4, adGroupAdServiceDynamicAd.isRemoveCampaignBannerMediaId4) &&
        Objects.equals(this.isRemoveCampaignBannerUrl, adGroupAdServiceDynamicAd.isRemoveCampaignBannerUrl) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceDynamicAd.logoMediaId) &&
        Objects.equals(this.logoMediaId2, adGroupAdServiceDynamicAd.logoMediaId2) &&
        Objects.equals(this.logoMediaId3, adGroupAdServiceDynamicAd.logoMediaId3) &&
        Objects.equals(this.prefix, adGroupAdServiceDynamicAd.prefix) &&
        Objects.equals(this.principal, adGroupAdServiceDynamicAd.principal) &&
        Objects.equals(this.suffix, adGroupAdServiceDynamicAd.suffix) &&
        Objects.equals(this.url, adGroupAdServiceDynamicAd.url) &&
        Objects.equals(this.isRemovePrefix, adGroupAdServiceDynamicAd.isRemovePrefix) &&
        Objects.equals(this.isRemoveSuffix, adGroupAdServiceDynamicAd.isRemoveSuffix) &&
        Objects.equals(this.isRemoveBrandColor, adGroupAdServiceDynamicAd.isRemoveBrandColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandColor, buttonText, campaignBannerMediaId, campaignBannerMediaId2, campaignBannerMediaId3, campaignBannerMediaId4, campaignBannerUrl, displayUrl, isRemoveCampaignBannerMediaId, isRemoveCampaignBannerMediaId2, isRemoveCampaignBannerMediaId3, isRemoveCampaignBannerMediaId4, isRemoveCampaignBannerUrl, logoMediaId, logoMediaId2, logoMediaId3, prefix, principal, suffix, url, isRemovePrefix, isRemoveSuffix, isRemoveBrandColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceDynamicAd {\n");
    
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    campaignBannerMediaId: ").append(toIndentedString(campaignBannerMediaId)).append("\n");
    sb.append("    campaignBannerMediaId2: ").append(toIndentedString(campaignBannerMediaId2)).append("\n");
    sb.append("    campaignBannerMediaId3: ").append(toIndentedString(campaignBannerMediaId3)).append("\n");
    sb.append("    campaignBannerMediaId4: ").append(toIndentedString(campaignBannerMediaId4)).append("\n");
    sb.append("    campaignBannerUrl: ").append(toIndentedString(campaignBannerUrl)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    isRemoveCampaignBannerMediaId: ").append(toIndentedString(isRemoveCampaignBannerMediaId)).append("\n");
    sb.append("    isRemoveCampaignBannerMediaId2: ").append(toIndentedString(isRemoveCampaignBannerMediaId2)).append("\n");
    sb.append("    isRemoveCampaignBannerMediaId3: ").append(toIndentedString(isRemoveCampaignBannerMediaId3)).append("\n");
    sb.append("    isRemoveCampaignBannerMediaId4: ").append(toIndentedString(isRemoveCampaignBannerMediaId4)).append("\n");
    sb.append("    isRemoveCampaignBannerUrl: ").append(toIndentedString(isRemoveCampaignBannerUrl)).append("\n");
    sb.append("    logoMediaId: ").append(toIndentedString(logoMediaId)).append("\n");
    sb.append("    logoMediaId2: ").append(toIndentedString(logoMediaId2)).append("\n");
    sb.append("    logoMediaId3: ").append(toIndentedString(logoMediaId3)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isRemovePrefix: ").append(toIndentedString(isRemovePrefix)).append("\n");
    sb.append("    isRemoveSuffix: ").append(toIndentedString(isRemoveSuffix)).append("\n");
    sb.append("    isRemoveBrandColor: ").append(toIndentedString(isRemoveBrandColor)).append("\n");
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

