/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.StatsServicePeriodCustomDate;
import jp.co.yahoo.adsdisplayapi.v17.model.StatsServiceStatsPeriod;
import jp.co.yahoo.adsdisplayapi.v17.model.StatsServiceTargetType;
import jp.co.yahoo.adsdisplayapi.v17.model.StatsServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceSelector object is a container that includes the search conditions (execution parameters) of get methods.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  StatsServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  StatsServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  StatsServiceSelector.JSON_PROPERTY_AD_IDS,
  StatsServiceSelector.JSON_PROPERTY_MEDIA_IDS,
  StatsServiceSelector.JSON_PROPERTY_STATS_PERIOD,
  StatsServiceSelector.JSON_PROPERTY_PERIOD_CUSTOM_DATE,
  StatsServiceSelector.JSON_PROPERTY_TARGET_TYPES,
  StatsServiceSelector.JSON_PROPERTY_TYPE,
  StatsServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  StatsServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds;

  public static final String JSON_PROPERTY_AD_IDS = "adIds";
  private List<Long> adIds;

  public static final String JSON_PROPERTY_MEDIA_IDS = "mediaIds";
  private List<Long> mediaIds;

  public static final String JSON_PROPERTY_STATS_PERIOD = "statsPeriod";
  private StatsServiceStatsPeriod statsPeriod;

  public static final String JSON_PROPERTY_PERIOD_CUSTOM_DATE = "periodCustomDate";
  private StatsServicePeriodCustomDate periodCustomDate;

  public static final String JSON_PROPERTY_TARGET_TYPES = "targetTypes";
  private List<StatsServiceTargetType> targetTypes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StatsServiceType type;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public StatsServiceSelector() {
  }

  public StatsServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
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


  public StatsServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public StatsServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンID&lt;br&gt; typeで「CAMPAIGN」または「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; Available only when &amp;#34;CAMPAIGN&amp;#34; or &amp;#34;ADGROUP&amp;#34; or &amp;#34;AD&amp;#34; or &amp;#34;TARGET&amp;#34; is specified for type. &lt;/div&gt; 
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


  public StatsServiceSelector adGroupIds(List<Long> adGroupIds) {
    
    this.adGroupIds = adGroupIds;
    return this;
  }

  public StatsServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループID&lt;br&gt; typeで「ADGROUP」または「AD」または「TARGET」を指定した場合のみ有効です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; Available only when &amp;#34;ADGROUP&amp;#34; or &amp;#34;AD&amp;#34; or &amp;#34;TARGET&amp;#34; is specified for type. &lt;/div&gt; 
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


  public StatsServiceSelector adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public StatsServiceSelector addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告ID&lt;br&gt; typeで「AD」を指定した場合のみ有効です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad ID.&lt;br&gt; Available only when &amp;#34;AD&amp;#34; is specified for type. &lt;/div&gt; 
   * @return adIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdIds() {
    return adIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public StatsServiceSelector mediaIds(List<Long> mediaIds) {
    
    this.mediaIds = mediaIds;
    return this;
  }

  public StatsServiceSelector addMediaIdsItem(Long mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 画像ID&lt;br&gt; typeで「MEDIA」を指定した場合のみ有効です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Media ID.&lt;br&gt; Available only when &amp;#34;MEDIA&amp;#34; is specified for type. &lt;/div&gt; 
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


  public StatsServiceSelector statsPeriod(StatsServiceStatsPeriod statsPeriod) {
    
    this.statsPeriod = statsPeriod;
    return this;
  }

   /**
   * Get statsPeriod
   * @return statsPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceStatsPeriod getStatsPeriod() {
    return statsPeriod;
  }


  @JsonProperty(JSON_PROPERTY_STATS_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatsPeriod(StatsServiceStatsPeriod statsPeriod) {
    this.statsPeriod = statsPeriod;
  }


  public StatsServiceSelector periodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    
    this.periodCustomDate = periodCustomDate;
    return this;
  }

   /**
   * Get periodCustomDate
   * @return periodCustomDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePeriodCustomDate getPeriodCustomDate() {
    return periodCustomDate;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_CUSTOM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodCustomDate(StatsServicePeriodCustomDate periodCustomDate) {
    this.periodCustomDate = periodCustomDate;
  }


  public StatsServiceSelector targetTypes(List<StatsServiceTargetType> targetTypes) {
    
    this.targetTypes = targetTypes;
    return this;
  }

  public StatsServiceSelector addTargetTypesItem(StatsServiceTargetType targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

   /**
   * Get targetTypes
   * @return targetTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StatsServiceTargetType> getTargetTypes() {
    return targetTypes;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTypes(List<StatsServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
  }


  public StatsServiceSelector type(StatsServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(StatsServiceType type) {
    this.type = type;
  }


  public StatsServiceSelector numberResults(Integer numberResults) {
    
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


  public StatsServiceSelector startIndex(Integer startIndex) {
    
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
    StatsServiceSelector statsServiceSelector = (StatsServiceSelector) o;
    return Objects.equals(this.accountId, statsServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, statsServiceSelector.campaignIds) &&
        Objects.equals(this.adGroupIds, statsServiceSelector.adGroupIds) &&
        Objects.equals(this.adIds, statsServiceSelector.adIds) &&
        Objects.equals(this.mediaIds, statsServiceSelector.mediaIds) &&
        Objects.equals(this.statsPeriod, statsServiceSelector.statsPeriod) &&
        Objects.equals(this.periodCustomDate, statsServiceSelector.periodCustomDate) &&
        Objects.equals(this.targetTypes, statsServiceSelector.targetTypes) &&
        Objects.equals(this.type, statsServiceSelector.type) &&
        Objects.equals(this.numberResults, statsServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, statsServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, adGroupIds, adIds, mediaIds, statsPeriod, periodCustomDate, targetTypes, type, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    statsPeriod: ").append(toIndentedString(statsPeriod)).append("\n");
    sb.append("    periodCustomDate: ").append(toIndentedString(periodCustomDate)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

