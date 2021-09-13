package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import jp.co.yahoo.adsdisplayapi.v6.model.MediaServiceFileType;
import jp.co.yahoo.adsdisplayapi.v6.model.MediaServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; MediaServiceImageMediaオブジェクトは、画像を格納するコンテナです。&lt;br&gt; このフィールドは、SET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The MediaServiceImageMedia object is a container for storing image. &lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> MediaServiceImageMediaオブジェクトは、画像を格納するコンテナです。<br> このフィールドは、SET時に必須となります。 </div> <div lang=\"en\"> The MediaServiceImageMedia object is a container for storing image. <br> This field is required in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MediaServiceImageMedia   {
  @JsonProperty("mediaType")
  private MediaServiceType mediaType = null;

  @JsonProperty("aspectRatio")
  private String aspectRatio = null;

  @JsonProperty("data")
  private byte[] data = null;

  @JsonProperty("fileSize")
  private Long fileSize = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("mediaAdFormat")
  private String mediaAdFormat = null;

  @JsonProperty("mediaFileType")
  private MediaServiceFileType mediaFileType = null;

  @JsonProperty("width")
  private Long width = null;

  public MediaServiceImageMedia mediaType(MediaServiceType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  @ApiModelProperty(value = "")

  @Valid

  public MediaServiceType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaServiceType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaServiceImageMedia aspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * <div lang=\"ja\"> 画像アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> The type of aspect ratio.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return aspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> The type of aspect ratio.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public String getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public MediaServiceImageMedia data(byte[] data) {
    this.data = data;
    return this;
  }

  /**
   * <div lang=\"ja\">画像ファイルのbase64エンコードです。ADD時のみ指定可能で、GET時のレスポンスでは値は取得されません。</div> <div lang=\"en\">The image file in base64 encode. It can be specified on ADD, however no value returns on the response of GET.</div> 
   * @return data
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像ファイルのbase64エンコードです。ADD時のみ指定可能で、GET時のレスポンスでは値は取得されません。</div> <div lang=\"en\">The image file in base64 encode. It can be specified on ADD, however no value returns on the response of GET.</div> ")


  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public MediaServiceImageMedia fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * <div lang=\"ja\"> ファイルサイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The file size of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return fileSize
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ファイルサイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The file size of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public MediaServiceImageMedia height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * <div lang=\"ja\"> 縦の長さです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The height of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縦の長さです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The height of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public MediaServiceImageMedia mediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

  /**
   * <div lang=\"ja\"> 画像フォーマットの種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> The type of image format.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to adFormat field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像フォーマットの種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> The type of image format.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to adFormat field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public String getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }

  public MediaServiceImageMedia mediaFileType(MediaServiceFileType mediaFileType) {
    this.mediaFileType = mediaFileType;
    return this;
  }

  /**
   * Get mediaFileType
   * @return mediaFileType
  */
  @ApiModelProperty(value = "")

  @Valid

  public MediaServiceFileType getMediaFileType() {
    return mediaFileType;
  }

  public void setMediaFileType(MediaServiceFileType mediaFileType) {
    this.mediaFileType = mediaFileType;
  }

  public MediaServiceImageMedia width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <div lang=\"ja\"> 横幅です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The width of image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 横幅です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The width of image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


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
    MediaServiceImageMedia mediaServiceImageMedia = (MediaServiceImageMedia) o;
    return Objects.equals(this.mediaType, mediaServiceImageMedia.mediaType) &&
        Objects.equals(this.aspectRatio, mediaServiceImageMedia.aspectRatio) &&
        Arrays.equals(this.data, mediaServiceImageMedia.data) &&
        Objects.equals(this.fileSize, mediaServiceImageMedia.fileSize) &&
        Objects.equals(this.height, mediaServiceImageMedia.height) &&
        Objects.equals(this.mediaAdFormat, mediaServiceImageMedia.mediaAdFormat) &&
        Objects.equals(this.mediaFileType, mediaServiceImageMedia.mediaFileType) &&
        Objects.equals(this.width, mediaServiceImageMedia.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, aspectRatio, Arrays.hashCode(data), fileSize, height, mediaAdFormat, mediaFileType, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaServiceImageMedia {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
    sb.append("    mediaFileType: ").append(toIndentedString(mediaFileType)).append("\n");
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

