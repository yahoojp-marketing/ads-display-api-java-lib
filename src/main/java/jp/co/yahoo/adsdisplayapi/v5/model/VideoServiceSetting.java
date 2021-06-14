package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceFileType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceSettingオブジェクトは、動画の設定内容を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceSetting object stores the setting information of videos.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceSettingオブジェクトは、動画の設定内容を保持します。</div> <div lang=\"en\">VideoServiceSetting object stores the setting information of videos.</div> ")

public class VideoServiceSetting   {
  @JsonProperty("fileSize")
  private JsonNullable<Long> fileSize = JsonNullable.undefined();

  @JsonProperty("fileType")
  private JsonNullable<VideoServiceFileType> fileType = JsonNullable.undefined();

  @JsonProperty("height")
  private JsonNullable<Long> height = JsonNullable.undefined();

  @JsonProperty("playbackTime")
  private JsonNullable<Long> playbackTime = JsonNullable.undefined();

  @JsonProperty("videoAdFormat")
  private JsonNullable<String> videoAdFormat = JsonNullable.undefined();

  @JsonProperty("videoAspectRatio")
  private JsonNullable<String> videoAspectRatio = JsonNullable.undefined();

  @JsonProperty("width")
  private JsonNullable<Long> width = JsonNullable.undefined();

  public VideoServiceSetting fileSize(Long fileSize) {
    this.fileSize = JsonNullable.of(fileSize);
    return this;
  }

  /**
   * <div lang=\"ja\">動画のファイルサイズです。</div> <div lang=\"en\">File size of the video.</div> 
   * @return fileSize
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画のファイルサイズです。</div> <div lang=\"en\">File size of the video.</div> ")


  public JsonNullable<Long> getFileSize() {
    return fileSize;
  }

  public void setFileSize(JsonNullable<Long> fileSize) {
    this.fileSize = fileSize;
  }

  public VideoServiceSetting fileType(VideoServiceFileType fileType) {
    this.fileType = JsonNullable.of(fileType);
    return this;
  }

  /**
   * Get fileType
   * @return fileType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VideoServiceFileType> getFileType() {
    return fileType;
  }

  public void setFileType(JsonNullable<VideoServiceFileType> fileType) {
    this.fileType = fileType;
  }

  public VideoServiceSetting height(Long height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の高さ（縦の長さ）です。</div> <div lang=\"en\">Height (vertical length) of the video.</div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の高さ（縦の長さ）です。</div> <div lang=\"en\">Height (vertical length) of the video.</div> ")


  public JsonNullable<Long> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Long> height) {
    this.height = height;
  }

  public VideoServiceSetting playbackTime(Long playbackTime) {
    this.playbackTime = JsonNullable.of(playbackTime);
    return this;
  }

  /**
   * <div lang=\"ja\">動画再生時間（秒）です。</div> <div lang=\"en\">Play time (sec) of the video.</div> 
   * @return playbackTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画再生時間（秒）です。</div> <div lang=\"en\">Play time (sec) of the video.</div> ")


  public JsonNullable<Long> getPlaybackTime() {
    return playbackTime;
  }

  public void setPlaybackTime(JsonNullable<Long> playbackTime) {
    this.playbackTime = playbackTime;
  }

  public VideoServiceSetting videoAdFormat(String videoAdFormat) {
    this.videoAdFormat = JsonNullable.of(videoAdFormat);
    return this;
  }

  /**
   * <div lang=\"ja\">動画広告の種類です。</div> <div lang=\"en\">Ad format type of the video ad.</div> 
   * @return videoAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画広告の種類です。</div> <div lang=\"en\">Ad format type of the video ad.</div> ")


  public JsonNullable<String> getVideoAdFormat() {
    return videoAdFormat;
  }

  public void setVideoAdFormat(JsonNullable<String> videoAdFormat) {
    this.videoAdFormat = videoAdFormat;
  }

  public VideoServiceSetting videoAspectRatio(String videoAspectRatio) {
    this.videoAspectRatio = JsonNullable.of(videoAspectRatio);
    return this;
  }

  /**
   * <div lang=\"ja\"> 動画アスペクト比の種類です。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> Type of aspect ratio.<br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return videoAspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 動画アスペクト比の種類です。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> Type of aspect ratio.<br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public JsonNullable<String> getVideoAspectRatio() {
    return videoAspectRatio;
  }

  public void setVideoAspectRatio(JsonNullable<String> videoAspectRatio) {
    this.videoAspectRatio = videoAspectRatio;
  }

  public VideoServiceSetting width(Long width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の横幅です。</div> <div lang=\"en\">Width of the video.</div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の横幅です。</div> <div lang=\"en\">Width of the video.</div> ")


  public JsonNullable<Long> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Long> width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceSetting videoServiceSetting = (VideoServiceSetting) o;
    return Objects.equals(this.fileSize, videoServiceSetting.fileSize) &&
        Objects.equals(this.fileType, videoServiceSetting.fileType) &&
        Objects.equals(this.height, videoServiceSetting.height) &&
        Objects.equals(this.playbackTime, videoServiceSetting.playbackTime) &&
        Objects.equals(this.videoAdFormat, videoServiceSetting.videoAdFormat) &&
        Objects.equals(this.videoAspectRatio, videoServiceSetting.videoAspectRatio) &&
        Objects.equals(this.width, videoServiceSetting.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileType, height, playbackTime, videoAdFormat, videoAspectRatio, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceSetting {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

