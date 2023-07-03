/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.VideoServiceExtraSpecs;
import jp.co.yahoo.adsdisplayapi.v9.model.VideoServiceFileType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceSettingオブジェクトは、動画の設定内容を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceSetting object stores the setting information of videos.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  VideoServiceSetting.JSON_PROPERTY_EXTRA_SPECS,
  VideoServiceSetting.JSON_PROPERTY_FILE_SIZE,
  VideoServiceSetting.JSON_PROPERTY_FILE_TYPE,
  VideoServiceSetting.JSON_PROPERTY_HEIGHT,
  VideoServiceSetting.JSON_PROPERTY_PLAYBACK_TIME,
  VideoServiceSetting.JSON_PROPERTY_VIDEO_AD_FORMAT,
  VideoServiceSetting.JSON_PROPERTY_VIDEO_ASPECT_RATIO,
  VideoServiceSetting.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoServiceSetting {
  public static final String JSON_PROPERTY_EXTRA_SPECS = "extraSpecs";
  private List<VideoServiceExtraSpecs> extraSpecs;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Long fileSize;

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  private VideoServiceFileType fileType;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_PLAYBACK_TIME = "playbackTime";
  private Long playbackTime;

  public static final String JSON_PROPERTY_VIDEO_AD_FORMAT = "videoAdFormat";
  private String videoAdFormat;

  public static final String JSON_PROPERTY_VIDEO_ASPECT_RATIO = "videoAspectRatio";
  private String videoAspectRatio;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public VideoServiceSetting() {
  }

  public VideoServiceSetting extraSpecs(List<VideoServiceExtraSpecs> extraSpecs) {
    
    this.extraSpecs = extraSpecs;
    return this;
  }

  public VideoServiceSetting addExtraSpecsItem(VideoServiceExtraSpecs extraSpecsItem) {
    if (this.extraSpecs == null) {
      this.extraSpecs = new ArrayList<>();
    }
    this.extraSpecs.add(extraSpecsItem);
    return this;
  }

   /**
   * Get extraSpecs
   * @return extraSpecs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRA_SPECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VideoServiceExtraSpecs> getExtraSpecs() {
    return extraSpecs;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_SPECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraSpecs(List<VideoServiceExtraSpecs> extraSpecs) {
    this.extraSpecs = extraSpecs;
  }


  public VideoServiceSetting fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画のファイルサイズです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;File size of the video.&lt;/div&gt; 
   * @return fileSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public VideoServiceSetting fileType(VideoServiceFileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VideoServiceFileType getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(VideoServiceFileType fileType) {
    this.fileType = fileType;
  }


  public VideoServiceSetting height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画の高さ（縦の長さ）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Height (vertical length) of the video.&lt;/div&gt; 
   * @return height
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Long height) {
    this.height = height;
  }


  public VideoServiceSetting playbackTime(Long playbackTime) {
    
    this.playbackTime = playbackTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画再生時間（秒）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Play time (sec) of the video.&lt;/div&gt; 
   * @return playbackTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAYBACK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPlaybackTime() {
    return playbackTime;
  }


  @JsonProperty(JSON_PROPERTY_PLAYBACK_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaybackTime(Long playbackTime) {
    this.playbackTime = playbackTime;
  }


  public VideoServiceSetting videoAdFormat(String videoAdFormat) {
    
    this.videoAdFormat = videoAdFormat;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画広告の種類です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad format type of the video ad.&lt;/div&gt; 
   * @return videoAdFormat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoAdFormat() {
    return videoAdFormat;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoAdFormat(String videoAdFormat) {
    this.videoAdFormat = videoAdFormat;
  }


  public VideoServiceSetting videoAspectRatio(String videoAspectRatio) {
    
    this.videoAspectRatio = videoAspectRatio;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 動画アスペクト比の種類です。&lt;br&gt; ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Type of aspect ratio.&lt;br&gt; * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. &lt;/div&gt; 
   * @return videoAspectRatio
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoAspectRatio() {
    return videoAspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoAspectRatio(String videoAspectRatio) {
    this.videoAspectRatio = videoAspectRatio;
  }


  public VideoServiceSetting width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;動画の横幅です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Width of the video.&lt;/div&gt; 
   * @return width
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Long width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceSetting videoServiceSetting = (VideoServiceSetting) o;
    return Objects.equals(this.extraSpecs, videoServiceSetting.extraSpecs) &&
        Objects.equals(this.fileSize, videoServiceSetting.fileSize) &&
        Objects.equals(this.fileType, videoServiceSetting.fileType) &&
        Objects.equals(this.height, videoServiceSetting.height) &&
        Objects.equals(this.playbackTime, videoServiceSetting.playbackTime) &&
        Objects.equals(this.videoAdFormat, videoServiceSetting.videoAdFormat) &&
        Objects.equals(this.videoAspectRatio, videoServiceSetting.videoAspectRatio) &&
        Objects.equals(this.width, videoServiceSetting.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraSpecs, fileSize, fileType, height, playbackTime, videoAdFormat, videoAspectRatio, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceSetting {\n");
    sb.append("    extraSpecs: ").append(toIndentedString(extraSpecs)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    playbackTime: ").append(toIndentedString(playbackTime)).append("\n");
    sb.append("    videoAdFormat: ").append(toIndentedString(videoAdFormat)).append("\n");
    sb.append("    videoAspectRatio: ").append(toIndentedString(videoAspectRatio)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

