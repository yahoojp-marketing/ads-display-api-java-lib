/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v16.model.Stats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceVideoStatsValueオブジェクトは、動画の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceVideoStatsValue object contains Video stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceVideoStatsValueオブジェクトは、動画の統計情報を保持します。</div> <div lang=\"en\">StatsServiceVideoStatsValue object contains Video stats information.</div> ")
@JsonPropertyOrder({
  StatsServiceVideoStatsValue.JSON_PROPERTY_MEDIA_ID,
  StatsServiceVideoStatsValue.JSON_PROPERTY_VIDEO_NAME,
  StatsServiceVideoStatsValue.JSON_PROPERTY_VIDEO_TITLE,
  StatsServiceVideoStatsValue.JSON_PROPERTY_STATS
})
@JsonTypeName("StatsServiceVideoStatsValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceVideoStatsValue {
  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_VIDEO_NAME = "videoName";
  private String videoName;

  public static final String JSON_PROPERTY_VIDEO_TITLE = "videoTitle";
  private String videoTitle;

  public static final String JSON_PROPERTY_STATS = "stats";
  private Stats stats;

  public StatsServiceVideoStatsValue() { 
  }

  public StatsServiceVideoStatsValue mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディアID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID.&lt;/div&gt; 
   * @return mediaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID.</div> ")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }


  public StatsServiceVideoStatsValue videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;実ファイル名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;File name.&lt;/div&gt; 
   * @return videoName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">実ファイル名</div> <div lang=\"en\">File name.</div> ")
  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoName() {
    return videoName;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public StatsServiceVideoStatsValue videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビデオ名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Video title.&lt;/div&gt; 
   * @return videoTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビデオ名</div> <div lang=\"en\">Video title.</div> ")
  @JsonProperty(JSON_PROPERTY_VIDEO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoTitle() {
    return videoTitle;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

