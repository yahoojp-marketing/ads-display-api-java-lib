/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v15.model.Stats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdGroupStatsValueオブジェクトは、広告グループの統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdGroupStatsValue object contains Ad Group stats information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceAdGroupStatsValue.JSON_PROPERTY_CAMPAIGN_ID,
  StatsServiceAdGroupStatsValue.JSON_PROPERTY_CAMPAIGN_NAME,
  StatsServiceAdGroupStatsValue.JSON_PROPERTY_AD_GROUP_ID,
  StatsServiceAdGroupStatsValue.JSON_PROPERTY_AD_GROUP_NAME,
  StatsServiceAdGroupStatsValue.JSON_PROPERTY_STATS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAdGroupStatsValue {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_STATS = "stats";
  private Stats stats;

  public StatsServiceAdGroupStatsValue() {
  }

  public StatsServiceAdGroupStatsValue campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID&lt;/div&gt; 
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public StatsServiceAdGroupStatsValue campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name&lt;/div&gt; 
   * @return campaignName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public StatsServiceAdGroupStatsValue adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID&lt;/div&gt; 
   * @return adGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public StatsServiceAdGroupStatsValue adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name&lt;/div&gt; 
   * @return adGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public StatsServiceAdGroupStatsValue stats(Stats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Stats getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(Stats stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAdGroupStatsValue statsServiceAdGroupStatsValue = (StatsServiceAdGroupStatsValue) o;
    return Objects.equals(this.campaignId, statsServiceAdGroupStatsValue.campaignId) &&
        Objects.equals(this.campaignName, statsServiceAdGroupStatsValue.campaignName) &&
        Objects.equals(this.adGroupId, statsServiceAdGroupStatsValue.adGroupId) &&
        Objects.equals(this.adGroupName, statsServiceAdGroupStatsValue.adGroupName) &&
        Objects.equals(this.stats, statsServiceAdGroupStatsValue.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, adGroupId, adGroupName, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAdGroupStatsValue {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
