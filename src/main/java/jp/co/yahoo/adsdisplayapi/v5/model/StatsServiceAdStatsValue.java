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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdStatsValueオブジェクトは、広告の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdStatsValue object contains Ad stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAdStatsValueオブジェクトは、広告の統計情報を保持します。</div> <div lang=\"en\">StatsServiceAdStatsValue object contains Ad stats information.</div> ")

public class StatsServiceAdStatsValue   {
  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("adId")
  private JsonNullable<Long> adId = JsonNullable.undefined();

  @JsonProperty("adName")
  private JsonNullable<String> adName = JsonNullable.undefined();

  @JsonProperty("stats")
  private JsonNullable<Stats> stats = JsonNullable.undefined();

  public StatsServiceAdStatsValue campaignId(Long campaignId) {
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

  public StatsServiceAdStatsValue campaignName(String campaignName) {
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

  public StatsServiceAdStatsValue adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループID</div> <div lang=\"en\">Ad group ID</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループID</div> <div lang=\"en\">Ad group ID</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public StatsServiceAdStatsValue adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名</div> <div lang=\"en\">Ad group name</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名</div> <div lang=\"en\">Ad group name</div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public StatsServiceAdStatsValue adId(Long adId) {
    this.adId = JsonNullable.of(adId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告ID</div> <div lang=\"en\">Ad ID</div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告ID</div> <div lang=\"en\">Ad ID</div> ")


  public JsonNullable<Long> getAdId() {
    return adId;
  }

  public void setAdId(JsonNullable<Long> adId) {
    this.adId = adId;
  }

  public StatsServiceAdStatsValue adName(String adName) {
    this.adName = JsonNullable.of(adName);
    return this;
  }

  /**
   * <div lang=\"ja\">広告名</div> <div lang=\"en\">Ad name</div> 
   * @return adName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告名</div> <div lang=\"en\">Ad name</div> ")


  public JsonNullable<String> getAdName() {
    return adName;
  }

  public void setAdName(JsonNullable<String> adName) {
    this.adName = adName;
  }

  public StatsServiceAdStatsValue stats(Stats stats) {
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
    StatsServiceAdStatsValue statsServiceAdStatsValue = (StatsServiceAdStatsValue) o;
    return Objects.equals(this.campaignId, statsServiceAdStatsValue.campaignId) &&
        Objects.equals(this.campaignName, statsServiceAdStatsValue.campaignName) &&
        Objects.equals(this.adGroupId, statsServiceAdStatsValue.adGroupId) &&
        Objects.equals(this.adGroupName, statsServiceAdStatsValue.adGroupName) &&
        Objects.equals(this.adId, statsServiceAdStatsValue.adId) &&
        Objects.equals(this.adName, statsServiceAdStatsValue.adName) &&
        Objects.equals(this.stats, statsServiceAdStatsValue.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, adGroupId, adGroupName, adId, adName, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAdStatsValue {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
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

