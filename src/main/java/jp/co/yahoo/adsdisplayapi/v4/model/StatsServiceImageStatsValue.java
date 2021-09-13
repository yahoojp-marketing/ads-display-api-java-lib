package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.Stats;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceImageStatsValuesオブジェクトは、画像の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceImageStatsValues object contains Image stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceImageStatsValuesオブジェクトは、画像の統計情報を保持します。</div> <div lang=\"en\">StatsServiceImageStatsValues object contains Image stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceImageStatsValue   {
  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("mediaName")
  private String mediaName = null;

  @JsonProperty("mediaTitle")
  private String mediaTitle = null;

  @JsonProperty("stats")
  private Stats stats = null;

  public StatsServiceImageStatsValue mediaId(Long mediaId) {
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

  public StatsServiceImageStatsValue mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

  /**
   * <div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> 
   * @return mediaName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> ")


  public String getMediaName() {
    return mediaName;
  }

  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }

  public StatsServiceImageStatsValue mediaTitle(String mediaTitle) {
    this.mediaTitle = mediaTitle;
    return this;
  }

  /**
   * <div lang=\"ja\">メディア名</div> <div lang=\"en\">Media title</div> 
   * @return mediaTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディア名</div> <div lang=\"en\">Media title</div> ")


  public String getMediaTitle() {
    return mediaTitle;
  }

  public void setMediaTitle(String mediaTitle) {
    this.mediaTitle = mediaTitle;
  }

  public StatsServiceImageStatsValue stats(Stats stats) {
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
    StatsServiceImageStatsValue statsServiceImageStatsValue = (StatsServiceImageStatsValue) o;
    return Objects.equals(this.mediaId, statsServiceImageStatsValue.mediaId) &&
        Objects.equals(this.mediaName, statsServiceImageStatsValue.mediaName) &&
        Objects.equals(this.mediaTitle, statsServiceImageStatsValue.mediaTitle) &&
        Objects.equals(this.stats, statsServiceImageStatsValue.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaName, mediaTitle, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceImageStatsValue {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    mediaTitle: ").append(toIndentedString(mediaTitle)).append("\n");
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

