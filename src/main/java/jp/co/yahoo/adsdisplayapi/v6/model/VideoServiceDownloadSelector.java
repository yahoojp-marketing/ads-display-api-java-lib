package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.VideoServiceQualityType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビデオをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Download the video.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ビデオをダウンロードします。</div> <div lang=\"en\"> Download the video.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceDownloadSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("mediaId")
  private Long mediaId;

  @JsonProperty("qualityType")
  private VideoServiceQualityType qualityType = null;

  public VideoServiceDownloadSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public VideoServiceDownloadSelector mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> 
   * @return mediaId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">メディアID</div> <div lang=\"en\">Media ID</div> ")
  @NotNull


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public VideoServiceDownloadSelector qualityType(VideoServiceQualityType qualityType) {
    this.qualityType = qualityType;
    return this;
  }

  /**
   * Get qualityType
   * @return qualityType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VideoServiceQualityType getQualityType() {
    return qualityType;
  }

  public void setQualityType(VideoServiceQualityType qualityType) {
    this.qualityType = qualityType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceDownloadSelector videoServiceDownloadSelector = (VideoServiceDownloadSelector) o;
    return Objects.equals(this.accountId, videoServiceDownloadSelector.accountId) &&
        Objects.equals(this.mediaId, videoServiceDownloadSelector.mediaId) &&
        Objects.equals(this.qualityType, videoServiceDownloadSelector.qualityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mediaId, qualityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    qualityType: ").append(toIndentedString(qualityType)).append("\n");
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

