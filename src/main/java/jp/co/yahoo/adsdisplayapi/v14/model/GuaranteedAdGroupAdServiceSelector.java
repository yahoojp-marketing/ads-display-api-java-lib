/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.GuaranteedAdGroupAdServiceAdType;
import jp.co.yahoo.adsdisplayapi.v14.model.GuaranteedAdGroupAdServiceMainMediaFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedAdGroupAdServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_AD_GROUP_AD_IDS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_CONTAINS_LABEL_ID_FLG,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_LABEL_IDS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_MEDIA_IDS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_AD_TYPES,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_MAIN_MEDIA_FORMATS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  GuaranteedAdGroupAdServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroupAdServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds;

  public static final String JSON_PROPERTY_AD_GROUP_AD_IDS = "adGroupAdIds";
  private List<Long> adGroupAdIds;

  public static final String JSON_PROPERTY_CONTAINS_LABEL_ID_FLG = "containsLabelIdFlg";
  private Boolean containsLabelIdFlg;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds;

  public static final String JSON_PROPERTY_MEDIA_IDS = "mediaIds";
  private List<Long> mediaIds;

  public static final String JSON_PROPERTY_AD_TYPES = "adTypes";
  private List<GuaranteedAdGroupAdServiceAdType> adTypes;

  public static final String JSON_PROPERTY_MAIN_MEDIA_FORMATS = "mainMediaFormats";
  private List<GuaranteedAdGroupAdServiceMainMediaFormat> mainMediaFormats;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public GuaranteedAdGroupAdServiceSelector() {
  }

  public GuaranteedAdGroupAdServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public GuaranteedAdGroupAdServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID&lt;/div&gt; 
   * @return campaignIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public GuaranteedAdGroupAdServiceSelector adGroupIds(List<Long> adGroupIds) {
    
    this.adGroupIds = adGroupIds;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad group ID&lt;/div&gt; 
   * @return adGroupIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }


  public GuaranteedAdGroupAdServiceSelector adGroupAdIds(List<Long> adGroupAdIds) {
    
    this.adGroupAdIds = adGroupAdIds;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addAdGroupAdIdsItem(Long adGroupAdIdsItem) {
    if (this.adGroupAdIds == null) {
      this.adGroupAdIds = new ArrayList<>();
    }
    this.adGroupAdIds.add(adGroupAdIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 広告ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad ID&lt;/div&gt; 
   * @return adGroupAdIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdGroupAdIds() {
    return adGroupAdIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupAdIds(List<Long> adGroupAdIds) {
    this.adGroupAdIds = adGroupAdIds;
  }


  public GuaranteedAdGroupAdServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    
    this.containsLabelIdFlg = containsLabelIdFlg;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID取得フラグです。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label ID.&lt;br&gt; This field is optional. The default value will be false. &lt;/div&gt; 
   * @return containsLabelIdFlg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
  }


  public GuaranteedAdGroupAdServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : ラベルID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID&lt;/div&gt; 
   * @return labelIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  public GuaranteedAdGroupAdServiceSelector mediaIds(List<Long> mediaIds) {
    
    this.mediaIds = mediaIds;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : 画像ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Media ID&lt;/div&gt; 
   * @return mediaIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getMediaIds() {
    return mediaIds;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaIds(List<Long> mediaIds) {
    this.mediaIds = mediaIds;
  }


  public GuaranteedAdGroupAdServiceSelector adTypes(List<GuaranteedAdGroupAdServiceAdType> adTypes) {
    
    this.adTypes = adTypes;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addAdTypesItem(GuaranteedAdGroupAdServiceAdType adTypesItem) {
    if (this.adTypes == null) {
      this.adTypes = new ArrayList<>();
    }
    this.adTypes.add(adTypesItem);
    return this;
  }

   /**
   * Get adTypes
   * @return adTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupAdServiceAdType> getAdTypes() {
    return adTypes;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdTypes(List<GuaranteedAdGroupAdServiceAdType> adTypes) {
    this.adTypes = adTypes;
  }


  public GuaranteedAdGroupAdServiceSelector mainMediaFormats(List<GuaranteedAdGroupAdServiceMainMediaFormat> mainMediaFormats) {
    
    this.mainMediaFormats = mainMediaFormats;
    return this;
  }

  public GuaranteedAdGroupAdServiceSelector addMainMediaFormatsItem(GuaranteedAdGroupAdServiceMainMediaFormat mainMediaFormatsItem) {
    if (this.mainMediaFormats == null) {
      this.mainMediaFormats = new ArrayList<>();
    }
    this.mainMediaFormats.add(mainMediaFormatsItem);
    return this;
  }

   /**
   * Get mainMediaFormats
   * @return mainMediaFormats
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_MEDIA_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupAdServiceMainMediaFormat> getMainMediaFormats() {
    return mainMediaFormats;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_MEDIA_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainMediaFormats(List<GuaranteedAdGroupAdServiceMainMediaFormat> mainMediaFormats) {
    this.mainMediaFormats = mainMediaFormats;
  }


  public GuaranteedAdGroupAdServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public GuaranteedAdGroupAdServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAdServiceSelector guaranteedAdGroupAdServiceSelector = (GuaranteedAdGroupAdServiceSelector) o;
    return Objects.equals(this.accountId, guaranteedAdGroupAdServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, guaranteedAdGroupAdServiceSelector.campaignIds) &&
        Objects.equals(this.adGroupIds, guaranteedAdGroupAdServiceSelector.adGroupIds) &&
        Objects.equals(this.adGroupAdIds, guaranteedAdGroupAdServiceSelector.adGroupAdIds) &&
        Objects.equals(this.containsLabelIdFlg, guaranteedAdGroupAdServiceSelector.containsLabelIdFlg) &&
        Objects.equals(this.labelIds, guaranteedAdGroupAdServiceSelector.labelIds) &&
        Objects.equals(this.mediaIds, guaranteedAdGroupAdServiceSelector.mediaIds) &&
        Objects.equals(this.adTypes, guaranteedAdGroupAdServiceSelector.adTypes) &&
        Objects.equals(this.mainMediaFormats, guaranteedAdGroupAdServiceSelector.mainMediaFormats) &&
        Objects.equals(this.numberResults, guaranteedAdGroupAdServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, guaranteedAdGroupAdServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, adGroupIds, adGroupAdIds, containsLabelIdFlg, labelIds, mediaIds, adTypes, mainMediaFormats, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAdServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adGroupAdIds: ").append(toIndentedString(adGroupAdIds)).append("\n");
    sb.append("    containsLabelIdFlg: ").append(toIndentedString(containsLabelIdFlg)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    adTypes: ").append(toIndentedString(adTypes)).append("\n");
    sb.append("    mainMediaFormats: ").append(toIndentedString(mainMediaFormats)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

