/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v10.model.Stats;
import jp.co.yahoo.adsdisplayapi.v10.model.StatsServiceTarget;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceTargetStatsValuesオブジェクトは、ターゲティングの統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceTargetStatsValues object contains Target stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceTargetStatsValuesオブジェクトは、ターゲティングの統計情報を保持します。</div> <div lang=\"en\">StatsServiceTargetStatsValues object contains Target stats information.</div> ")
@JsonPropertyOrder({
  StatsServiceTargetStatsValue.JSON_PROPERTY_CAMPAIGN_ID,
  StatsServiceTargetStatsValue.JSON_PROPERTY_CAMPAIGN_NAME,
  StatsServiceTargetStatsValue.JSON_PROPERTY_AD_GROUP_ID,
  StatsServiceTargetStatsValue.JSON_PROPERTY_AD_GROUP_NAME,
  StatsServiceTargetStatsValue.JSON_PROPERTY_STATS,
  StatsServiceTargetStatsValue.JSON_PROPERTY_TARGET
})
@JsonTypeName("StatsServiceTargetStatsValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceTargetStatsValue {
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

  public static final String JSON_PROPERTY_TARGET = "target";
  private StatsServiceTarget target;

  public StatsServiceTargetStatsValue() { 
  }

  public StatsServiceTargetStatsValue campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> ")
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


  public StatsServiceTargetStatsValue campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名</div> <div lang=\"en\">Campaign name</div> ")
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


  public StatsServiceTargetStatsValue adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループID</div> <div lang=\"en\">Ad group ID</div> ")
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


  public StatsServiceTargetStatsValue adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name&lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名</div> <div lang=\"en\">Ad group name</div> ")
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


  public StatsServiceTargetStatsValue stats(Stats stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public StatsServiceTargetStatsValue target(StatsServiceTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceTarget getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(StatsServiceTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceTargetStatsValue statsServiceTargetStatsValue = (StatsServiceTargetStatsValue) o;
    return Objects.equals(this.campaignId, statsServiceTargetStatsValue.campaignId) &&
        Objects.equals(this.campaignName, statsServiceTargetStatsValue.campaignName) &&
        Objects.equals(this.adGroupId, statsServiceTargetStatsValue.adGroupId) &&
        Objects.equals(this.adGroupName, statsServiceTargetStatsValue.adGroupName) &&
        Objects.equals(this.stats, statsServiceTargetStatsValue.stats) &&
        Objects.equals(this.target, statsServiceTargetStatsValue.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, adGroupId, adGroupName, stats, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceTargetStatsValue {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

