package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.Stats;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceVideoStatsValueオブジェクトは、動画の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceVideoStatsValue object contains Video stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceVideoStatsValueオブジェクトは、動画の統計情報を保持します。</div> <div lang=\"en\">StatsServiceVideoStatsValue object contains Video stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceVideoStatsValue   {
  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("videoName")
  private String videoName = null;

  @JsonProperty("videoTitle")
  private String videoTitle = null;

  @JsonProperty("stats")
  private Stats stats = null;

  public StatsServiceVideoStatsValue mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public StatsServiceVideoStatsValue videoName(String videoName) {
    this.videoName = videoName;
    return this;
  }

  /**
   * <div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> 
   * @return videoName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> ")


  public String getVideoName() {
    return videoName;
  }

  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }

  public StatsServiceVideoStatsValue videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

  /**
   * <div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title</div> 
   * @return videoTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title</div> ")


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }

  public StatsServiceVideoStatsValue stats(Stats stats) {
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
    StatsServiceVideoStatsValue statsServiceVideoStatsValue = (StatsServiceVideoStatsValue) o;
    return Objects.equals(this.mediaId, statsServiceVideoStatsValue.mediaId) &&
        Objects.equals(this.videoName, statsServiceVideoStatsValue.videoName) &&
        Objects.equals(this.videoTitle, statsServiceVideoStatsValue.videoTitle) &&
        Objects.equals(this.stats, statsServiceVideoStatsValue.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, videoName, videoTitle, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceVideoStatsValue {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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

