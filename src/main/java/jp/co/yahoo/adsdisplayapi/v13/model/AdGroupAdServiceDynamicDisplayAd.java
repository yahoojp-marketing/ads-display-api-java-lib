/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v13.model.AdGroupAdServiceButtonText;
import jp.co.yahoo.adsdisplayapi.v13.model.AdGroupAdServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceDynamicDisplayAdオブジェクトは、動的ディスプレイ広告の情報を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、adTypeがDYNAMIC_DISPLAY_ADの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceDynamicDisplayAd object describes information regarding dynamic ads for display.&lt;br&gt; This field is optional.&lt;br&gt; *If adType is DYNAMIC_DISPLAY_AD, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_BRAND_COLOR,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_BUTTON_TEXT,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID2,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID3,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID4,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_CAMPAIGN_BANNER_URL,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID2,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID3,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID4,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_URL,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_LOGO_MEDIA_ID,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_LOGO_MEDIA_ID2,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_LOGO_MEDIA_ID3,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_PREFIX,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_PRINCIPAL,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_SUFFIX,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_PREFIX,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_SUFFIX,
  AdGroupAdServiceDynamicDisplayAd.JSON_PROPERTY_IS_REMOVE_BRAND_COLOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceDynamicDisplayAd {
  public static final String JSON_PROPERTY_BRAND_COLOR = "brandColor";
  private String brandColor;

  public static final String JSON_PROPERTY_BUTTON_TEXT = "buttonText";
  private AdGroupAdServiceButtonText buttonText;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID = "campaignBannerMediaId";
  private Long campaignBannerMediaId;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID2 = "campaignBannerMediaId2";
  private Long campaignBannerMediaId2;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID3 = "campaignBannerMediaId3";
  private Long campaignBannerMediaId3;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID4 = "campaignBannerMediaId4";
  private Long campaignBannerMediaId4;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER_URL = "campaignBannerUrl";
  private String campaignBannerUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID = "isRemoveCampaignBannerMediaId";
  private AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId;

  public static final String JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID2 = "isRemoveCampaignBannerMediaId2";
  private AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId2;

  public static final String JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID3 = "isRemoveCampaignBannerMediaId3";
  private AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId3;

  public static final String JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID4 = "isRemoveCampaignBannerMediaId4";
  private AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId4;

  public static final String JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_URL = "isRemoveCampaignBannerUrl";
  private AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerUrl;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID = "logoMediaId";
  private Long logoMediaId;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID2 = "logoMediaId2";
  private Long logoMediaId2;

  public static final String JSON_PROPERTY_LOGO_MEDIA_ID3 = "logoMediaId3";
  private Long logoMediaId3;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private String suffix;

  public static final String JSON_PROPERTY_IS_REMOVE_PREFIX = "isRemovePrefix";
  private AdGroupAdServiceIsRemoveFlg isRemovePrefix;

  public static final String JSON_PROPERTY_IS_REMOVE_SUFFIX = "isRemoveSuffix";
  private AdGroupAdServiceIsRemoveFlg isRemoveSuffix;

  public static final String JSON_PROPERTY_IS_REMOVE_BRAND_COLOR = "isRemoveBrandColor";
  private AdGroupAdServiceIsRemoveFlg isRemoveBrandColor;

  public AdGroupAdServiceDynamicDisplayAd() {
  }

  public AdGroupAdServiceDynamicDisplayAd brandColor(String brandColor) {
    
    this.brandColor = brandColor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ブランドカラーです。&lt;br&gt; ※RGB、HEX指定です。&lt;br&gt; 設定例：#FFFFFF&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Brand color.&lt;br&gt; Format :RGB or HEX&lt;br&gt; e.g.：#FFFFFF&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return brandColor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandColor() {
    return brandColor;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }


  public AdGroupAdServiceDynamicDisplayAd buttonText(AdGroupAdServiceButtonText buttonText) {
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAdServiceDynamicDisplayAd campaignBannerMediaId(Long campaignBannerMediaId) {
    
    this.campaignBannerMediaId = campaignBannerMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンバナー画像のメディアIDです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign banner media ID.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return campaignBannerMediaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignBannerMediaId() {
    return campaignBannerMediaId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerMediaId(Long campaignBannerMediaId) {
    this.campaignBannerMediaId = campaignBannerMediaId;
  }


  public AdGroupAdServiceDynamicDisplayAd campaignBannerMediaId2(Long campaignBannerMediaId2) {
    
    this.campaignBannerMediaId2 = campaignBannerMediaId2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンバナー画像のメディアID 2です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign banner media ID 2.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return campaignBannerMediaId2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignBannerMediaId2() {
    return campaignBannerMediaId2;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerMediaId2(Long campaignBannerMediaId2) {
    this.campaignBannerMediaId2 = campaignBannerMediaId2;
  }


  public AdGroupAdServiceDynamicDisplayAd campaignBannerMediaId3(Long campaignBannerMediaId3) {
    
    this.campaignBannerMediaId3 = campaignBannerMediaId3;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンバナー画像のメディアID 3です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign banner media ID 3.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return campaignBannerMediaId3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignBannerMediaId3() {
    return campaignBannerMediaId3;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerMediaId3(Long campaignBannerMediaId3) {
    this.campaignBannerMediaId3 = campaignBannerMediaId3;
  }


  public AdGroupAdServiceDynamicDisplayAd campaignBannerMediaId4(Long campaignBannerMediaId4) {
    
    this.campaignBannerMediaId4 = campaignBannerMediaId4;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンバナー画像のメディアID 4です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign banner media ID 4.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return campaignBannerMediaId4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignBannerMediaId4() {
    return campaignBannerMediaId4;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_MEDIA_ID4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerMediaId4(Long campaignBannerMediaId4) {
    this.campaignBannerMediaId4 = campaignBannerMediaId4;
  }


  public AdGroupAdServiceDynamicDisplayAd campaignBannerUrl(String campaignBannerUrl) {
    
    this.campaignBannerUrl = campaignBannerUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンバナーURLです。&lt;br&gt; このフィールドは省略可能となります。&lt;br&gt; ADD時、設定する場合は以下のいずれかの指定が必要となります。&lt;br&gt; - campaignBannerMediaId&lt;br&gt; - campaignBannerMediaId2&lt;br&gt; - campaignBannerMediaId3&lt;br&gt; - campaignBannerMediaId4 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign banner URL.&lt;br&gt; This field is optional.&lt;br&gt; For setting in ADD operation, one of the following is required:&lt;br&gt; - campaignBannerMediaId&lt;br&gt; - campaignBannerMediaId2&lt;br&gt; - campaignBannerMediaId3&lt;br&gt; - campaignBannerMediaId4 &lt;/div&gt; 
   * @return campaignBannerUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignBannerUrl() {
    return campaignBannerUrl;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBannerUrl(String campaignBannerUrl) {
    this.campaignBannerUrl = campaignBannerUrl;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveCampaignBannerMediaId(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId) {
    
    this.isRemoveCampaignBannerMediaId = isRemoveCampaignBannerMediaId;
    return this;
  }

   /**
   * Get isRemoveCampaignBannerMediaId
   * @return isRemoveCampaignBannerMediaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveCampaignBannerMediaId() {
    return isRemoveCampaignBannerMediaId;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCampaignBannerMediaId(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId) {
    this.isRemoveCampaignBannerMediaId = isRemoveCampaignBannerMediaId;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveCampaignBannerMediaId2(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId2) {
    
    this.isRemoveCampaignBannerMediaId2 = isRemoveCampaignBannerMediaId2;
    return this;
  }

   /**
   * Get isRemoveCampaignBannerMediaId2
   * @return isRemoveCampaignBannerMediaId2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveCampaignBannerMediaId2() {
    return isRemoveCampaignBannerMediaId2;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCampaignBannerMediaId2(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId2) {
    this.isRemoveCampaignBannerMediaId2 = isRemoveCampaignBannerMediaId2;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveCampaignBannerMediaId3(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId3) {
    
    this.isRemoveCampaignBannerMediaId3 = isRemoveCampaignBannerMediaId3;
    return this;
  }

   /**
   * Get isRemoveCampaignBannerMediaId3
   * @return isRemoveCampaignBannerMediaId3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveCampaignBannerMediaId3() {
    return isRemoveCampaignBannerMediaId3;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCampaignBannerMediaId3(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId3) {
    this.isRemoveCampaignBannerMediaId3 = isRemoveCampaignBannerMediaId3;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveCampaignBannerMediaId4(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId4) {
    
    this.isRemoveCampaignBannerMediaId4 = isRemoveCampaignBannerMediaId4;
    return this;
  }

   /**
   * Get isRemoveCampaignBannerMediaId4
   * @return isRemoveCampaignBannerMediaId4
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveCampaignBannerMediaId4() {
    return isRemoveCampaignBannerMediaId4;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_MEDIA_ID4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCampaignBannerMediaId4(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerMediaId4) {
    this.isRemoveCampaignBannerMediaId4 = isRemoveCampaignBannerMediaId4;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveCampaignBannerUrl(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerUrl) {
    
    this.isRemoveCampaignBannerUrl = isRemoveCampaignBannerUrl;
    return this;
  }

   /**
   * Get isRemoveCampaignBannerUrl
   * @return isRemoveCampaignBannerUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveCampaignBannerUrl() {
    return isRemoveCampaignBannerUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAMPAIGN_BANNER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCampaignBannerUrl(AdGroupAdServiceIsRemoveFlg isRemoveCampaignBannerUrl) {
    this.isRemoveCampaignBannerUrl = isRemoveCampaignBannerUrl;
  }


  public AdGroupAdServiceDynamicDisplayAd logoMediaId(Long logoMediaId) {
    
    this.logoMediaId = logoMediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴ画像のメディアIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of logo image.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return logoMediaId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAdServiceDynamicDisplayAd logoMediaId2(Long logoMediaId2) {
    
    this.logoMediaId2 = logoMediaId2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴ画像のメディアID 2です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of logo image 2.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return logoMediaId2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogoMediaId2() {
    return logoMediaId2;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoMediaId2(Long logoMediaId2) {
    this.logoMediaId2 = logoMediaId2;
  }


  public AdGroupAdServiceDynamicDisplayAd logoMediaId3(Long logoMediaId3) {
    
    this.logoMediaId3 = logoMediaId3;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ロゴ画像のメディアID 3です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID of logo image 3.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return logoMediaId3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogoMediaId3() {
    return logoMediaId3;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_MEDIA_ID3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoMediaId3(Long logoMediaId3) {
    this.logoMediaId3 = logoMediaId3;
  }


  public AdGroupAdServiceDynamicDisplayAd prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; プレフィックスです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Prefix.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public AdGroupAdServiceDynamicDisplayAd principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告の主体者表記です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Advertiser indication.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
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


  public AdGroupAdServiceDynamicDisplayAd suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; サフィックスです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Suffix.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return suffix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuffix() {
    return suffix;
  }


  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemovePrefix(AdGroupAdServiceIsRemoveFlg isRemovePrefix) {
    
    this.isRemovePrefix = isRemovePrefix;
    return this;
  }

   /**
   * Get isRemovePrefix
   * @return isRemovePrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemovePrefix() {
    return isRemovePrefix;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemovePrefix(AdGroupAdServiceIsRemoveFlg isRemovePrefix) {
    this.isRemovePrefix = isRemovePrefix;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveSuffix(AdGroupAdServiceIsRemoveFlg isRemoveSuffix) {
    
    this.isRemoveSuffix = isRemoveSuffix;
    return this;
  }

   /**
   * Get isRemoveSuffix
   * @return isRemoveSuffix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveSuffix() {
    return isRemoveSuffix;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSuffix(AdGroupAdServiceIsRemoveFlg isRemoveSuffix) {
    this.isRemoveSuffix = isRemoveSuffix;
  }


  public AdGroupAdServiceDynamicDisplayAd isRemoveBrandColor(AdGroupAdServiceIsRemoveFlg isRemoveBrandColor) {
    
    this.isRemoveBrandColor = isRemoveBrandColor;
    return this;
  }

   /**
   * Get isRemoveBrandColor
   * @return isRemoveBrandColor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemoveFlg getIsRemoveBrandColor() {
    return isRemoveBrandColor;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_BRAND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveBrandColor(AdGroupAdServiceIsRemoveFlg isRemoveBrandColor) {
    this.isRemoveBrandColor = isRemoveBrandColor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceDynamicDisplayAd adGroupAdServiceDynamicDisplayAd = (AdGroupAdServiceDynamicDisplayAd) o;
    return Objects.equals(this.brandColor, adGroupAdServiceDynamicDisplayAd.brandColor) &&
        Objects.equals(this.buttonText, adGroupAdServiceDynamicDisplayAd.buttonText) &&
        Objects.equals(this.campaignBannerMediaId, adGroupAdServiceDynamicDisplayAd.campaignBannerMediaId) &&
        Objects.equals(this.campaignBannerMediaId2, adGroupAdServiceDynamicDisplayAd.campaignBannerMediaId2) &&
        Objects.equals(this.campaignBannerMediaId3, adGroupAdServiceDynamicDisplayAd.campaignBannerMediaId3) &&
        Objects.equals(this.campaignBannerMediaId4, adGroupAdServiceDynamicDisplayAd.campaignBannerMediaId4) &&
        Objects.equals(this.campaignBannerUrl, adGroupAdServiceDynamicDisplayAd.campaignBannerUrl) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId, adGroupAdServiceDynamicDisplayAd.isRemoveCampaignBannerMediaId) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId2, adGroupAdServiceDynamicDisplayAd.isRemoveCampaignBannerMediaId2) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId3, adGroupAdServiceDynamicDisplayAd.isRemoveCampaignBannerMediaId3) &&
        Objects.equals(this.isRemoveCampaignBannerMediaId4, adGroupAdServiceDynamicDisplayAd.isRemoveCampaignBannerMediaId4) &&
        Objects.equals(this.isRemoveCampaignBannerUrl, adGroupAdServiceDynamicDisplayAd.isRemoveCampaignBannerUrl) &&
        Objects.equals(this.logoMediaId, adGroupAdServiceDynamicDisplayAd.logoMediaId) &&
        Objects.equals(this.logoMediaId2, adGroupAdServiceDynamicDisplayAd.logoMediaId2) &&
        Objects.equals(this.logoMediaId3, adGroupAdServiceDynamicDisplayAd.logoMediaId3) &&
        Objects.equals(this.prefix, adGroupAdServiceDynamicDisplayAd.prefix) &&
        Objects.equals(this.principal, adGroupAdServiceDynamicDisplayAd.principal) &&
        Objects.equals(this.suffix, adGroupAdServiceDynamicDisplayAd.suffix) &&
        Objects.equals(this.isRemovePrefix, adGroupAdServiceDynamicDisplayAd.isRemovePrefix) &&
        Objects.equals(this.isRemoveSuffix, adGroupAdServiceDynamicDisplayAd.isRemoveSuffix) &&
        Objects.equals(this.isRemoveBrandColor, adGroupAdServiceDynamicDisplayAd.isRemoveBrandColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandColor, buttonText, campaignBannerMediaId, campaignBannerMediaId2, campaignBannerMediaId3, campaignBannerMediaId4, campaignBannerUrl, isRemoveCampaignBannerMediaId, isRemoveCampaignBannerMediaId2, isRemoveCampaignBannerMediaId3, isRemoveCampaignBannerMediaId4, isRemoveCampaignBannerUrl, logoMediaId, logoMediaId2, logoMediaId3, prefix, principal, suffix, isRemovePrefix, isRemoveSuffix, isRemoveBrandColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceDynamicDisplayAd {\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    campaignBannerMediaId: ").append(toIndentedString(campaignBannerMediaId)).append("\n");
    sb.append("    campaignBannerMediaId2: ").append(toIndentedString(campaignBannerMediaId2)).append("\n");
    sb.append("    campaignBannerMediaId3: ").append(toIndentedString(campaignBannerMediaId3)).append("\n");
    sb.append("    campaignBannerMediaId4: ").append(toIndentedString(campaignBannerMediaId4)).append("\n");
    sb.append("    campaignBannerUrl: ").append(toIndentedString(campaignBannerUrl)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

