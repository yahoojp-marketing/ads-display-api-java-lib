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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceImageStatsValuesオブジェクトは、画像の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceImageStatsValues object contains Image stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceImageStatsValuesオブジェクトは、画像の統計情報を保持します。</div> <div lang=\"en\">StatsServiceImageStatsValues object contains Image stats information.</div> ")

public class StatsServiceImageStatsValue   {
  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("mediaName")
  private JsonNullable<String> mediaName = JsonNullable.undefined();

  @JsonProperty("mediaTitle")
  private JsonNullable<String> mediaTitle = JsonNullable.undefined();

  @JsonProperty("stats")
  private JsonNullable<Stats> stats = JsonNullable.undefined();

  public StatsServiceImageStatsValue mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public StatsServiceImageStatsValue mediaName(String mediaName) {
    this.mediaName = JsonNullable.of(mediaName);
    return this;
  }

  /**
   * <div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> 
   * @return mediaName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name</div> ")


  public JsonNullable<String> getMediaName() {
    return mediaName;
  }

  public void setMediaName(JsonNullable<String> mediaName) {
    this.mediaName = mediaName;
  }

  public StatsServiceImageStatsValue mediaTitle(String mediaTitle) {
    this.mediaTitle = JsonNullable.of(mediaTitle);
    return this;
  }

  /**
   * <div lang=\"ja\">メディア名</div> <div lang=\"en\">Media title</div> 
   * @return mediaTitle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディア名</div> <div lang=\"en\">Media title</div> ")


  public JsonNullable<String> getMediaTitle() {
    return mediaTitle;
  }

  public void setMediaTitle(JsonNullable<String> mediaTitle) {
    this.mediaTitle = mediaTitle;
  }

  public StatsServiceImageStatsValue stats(Stats stats) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

