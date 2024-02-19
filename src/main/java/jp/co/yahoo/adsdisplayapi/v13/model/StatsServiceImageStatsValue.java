/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v13.model.Stats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceImageStatsValuesオブジェクトは、画像の統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceImageStatsValues object contains Image stats information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  StatsServiceImageStatsValue.JSON_PROPERTY_MEDIA_ID,
  StatsServiceImageStatsValue.JSON_PROPERTY_MEDIA_NAME,
  StatsServiceImageStatsValue.JSON_PROPERTY_MEDIA_TITLE,
  StatsServiceImageStatsValue.JSON_PROPERTY_STATS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceImageStatsValue {
  public static final String JSON_PROPERTY_MEDIA_ID = "mediaId";
  private Long mediaId;

  public static final String JSON_PROPERTY_MEDIA_NAME = "mediaName";
  private String mediaName;

  public static final String JSON_PROPERTY_MEDIA_TITLE = "mediaTitle";
  private String mediaTitle;

  public static final String JSON_PROPERTY_STATS = "stats";
  private Stats stats;

  public StatsServiceImageStatsValue() {
  }

  public StatsServiceImageStatsValue mediaId(Long mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディアID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media ID&lt;/div&gt; 
   * @return mediaId
  **/
  @jakarta.annotation.Nullable
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


  public StatsServiceImageStatsValue mediaName(String mediaName) {
    
    this.mediaName = mediaName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;実ファイル名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;File name&lt;/div&gt; 
   * @return mediaName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  public StatsServiceImageStatsValue mediaTitle(String mediaTitle) {
    
    this.mediaTitle = mediaTitle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;メディア名&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Media title&lt;/div&gt; 
   * @return mediaTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaTitle() {
    return mediaTitle;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

