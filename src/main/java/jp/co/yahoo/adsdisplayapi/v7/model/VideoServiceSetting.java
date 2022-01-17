package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.VideoServiceExtraSpecs;
import jp.co.yahoo.adsdisplayapi.v7.model.VideoServiceFileType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceSettingオブジェクトは、動画の設定内容を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceSetting object stores the setting information of videos.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceSettingオブジェクトは、動画の設定内容を保持します。</div> <div lang=\"en\">VideoServiceSetting object stores the setting information of videos.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceSetting   {
  @JsonProperty("extraSpecs")
  @Valid
  private List<VideoServiceExtraSpecs> extraSpecs = null;

  @JsonProperty("fileSize")
  private Long fileSize = null;

  @JsonProperty("fileType")
  private VideoServiceFileType fileType = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("playbackTime")
  private Long playbackTime = null;

  @JsonProperty("videoAdFormat")
  private String videoAdFormat = null;

  @JsonProperty("videoAspectRatio")
  private String videoAspectRatio = null;

  @JsonProperty("width")
  private Long width = null;

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VideoServiceExtraSpecs> getExtraSpecs() {
    return extraSpecs;
  }

  public void setExtraSpecs(List<VideoServiceExtraSpecs> extraSpecs) {
    this.extraSpecs = extraSpecs;
  }

  public VideoServiceSetting fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * <div lang=\"ja\">動画のファイルサイズです。</div> <div lang=\"en\">File size of the video.</div> 
   * @return fileSize
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画のファイルサイズです。</div> <div lang=\"en\">File size of the video.</div> ")


  public Long getFileSize() {
    return fileSize;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public VideoServiceFileType getFileType() {
    return fileType;
  }

  public void setFileType(VideoServiceFileType fileType) {
    this.fileType = fileType;
  }

  public VideoServiceSetting height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の高さ（縦の長さ）です。</div> <div lang=\"en\">Height (vertical length) of the video.</div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の高さ（縦の長さ）です。</div> <div lang=\"en\">Height (vertical length) of the video.</div> ")


  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public VideoServiceSetting playbackTime(Long playbackTime) {
    this.playbackTime = playbackTime;
    return this;
  }

  /**
   * <div lang=\"ja\">動画再生時間（秒）です。</div> <div lang=\"en\">Play time (sec) of the video.</div> 
   * @return playbackTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画再生時間（秒）です。</div> <div lang=\"en\">Play time (sec) of the video.</div> ")


  public Long getPlaybackTime() {
    return playbackTime;
  }

  public void setPlaybackTime(Long playbackTime) {
    this.playbackTime = playbackTime;
  }

  public VideoServiceSetting videoAdFormat(String videoAdFormat) {
    this.videoAdFormat = videoAdFormat;
    return this;
  }

  /**
   * <div lang=\"ja\">動画広告の種類です。</div> <div lang=\"en\">Ad format type of the video ad.</div> 
   * @return videoAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画広告の種類です。</div> <div lang=\"en\">Ad format type of the video ad.</div> ")


  public String getVideoAdFormat() {
    return videoAdFormat;
  }

  public void setVideoAdFormat(String videoAdFormat) {
    this.videoAdFormat = videoAdFormat;
  }

  public VideoServiceSetting videoAspectRatio(String videoAspectRatio) {
    this.videoAspectRatio = videoAspectRatio;
    return this;
  }

  /**
   * <div lang=\"ja\"> 動画アスペクト比の種類です。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> Type of aspect ratio.<br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return videoAspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 動画アスペクト比の種類です。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> Type of aspect ratio.<br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public String getVideoAspectRatio() {
    return videoAspectRatio;
  }

  public void setVideoAspectRatio(String videoAspectRatio) {
    this.videoAspectRatio = videoAspectRatio;
  }

  public VideoServiceSetting width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の横幅です。</div> <div lang=\"en\">Width of the video.</div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の横幅です。</div> <div lang=\"en\">Width of the video.</div> ")


  public Long getWidth() {
    return width;
  }

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

