package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.Stats;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdGroupStatsValueオブジェクトは、広告グループの統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdGroupStatsValue object contains Ad Group stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAdGroupStatsValueオブジェクトは、広告グループの統計情報を保持します。</div> <div lang=\"en\">StatsServiceAdGroupStatsValue object contains Ad Group stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAdGroupStatsValue   {
  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("stats")
  private Stats stats = null;

  public StatsServiceAdGroupStatsValue campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public StatsServiceAdGroupStatsValue campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名</div> <div lang=\"en\">Campaign name</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名</div> <div lang=\"en\">Campaign name</div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public StatsServiceAdGroupStatsValue adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループID</div> <div lang=\"en\">Ad group ID</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループID</div> <div lang=\"en\">Ad group ID</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public StatsServiceAdGroupStatsValue adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名</div> <div lang=\"en\">Ad group name</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名</div> <div lang=\"en\">Ad group name</div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public Stats getStats() {
    return stats;
  }

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

