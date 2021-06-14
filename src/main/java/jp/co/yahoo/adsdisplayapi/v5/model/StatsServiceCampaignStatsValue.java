package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.Stats;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceCampaignStatsValueオブジェクトは、キャンペーンの統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceCampaignStatsValue object contains Campaign stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceCampaignStatsValueオブジェクトは、キャンペーンの統計情報を保持します。</div> <div lang=\"en\">StatsServiceCampaignStatsValue object contains Campaign stats information.</div> ")

public class StatsServiceCampaignStatsValue   {
  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("stats")
  private JsonNullable<Stats> stats = JsonNullable.undefined();

  public StatsServiceCampaignStatsValue campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public StatsServiceCampaignStatsValue campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名</div> <div lang=\"en\">Campaign name</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名</div> <div lang=\"en\">Campaign name</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public StatsServiceCampaignStatsValue stats(Stats stats) {
    this.stats = JsonNullable.of(stats);
    return this;
  }

  /**
   * Get stats
   * @return stats
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<Stats> getStats() {
    return stats;
  }

  public void setStats(JsonNullable<Stats> stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceCampaignStatsValue statsServiceCampaignStatsValue = (StatsServiceCampaignStatsValue) o;
    return Objects.equals(this.campaignId, statsServiceCampaignStatsValue.campaignId) &&
        Objects.equals(this.campaignName, statsServiceCampaignStatsValue.campaignName) &&
        Objects.equals(this.stats, statsServiceCampaignStatsValue.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceCampaignStatsValue {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

