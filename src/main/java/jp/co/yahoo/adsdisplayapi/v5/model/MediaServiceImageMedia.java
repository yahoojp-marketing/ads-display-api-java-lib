package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceFileType;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; MediaServiceImageMediaオブジェクトは、画像を格納するコンテナです。&lt;br&gt; このフィールドは、SET時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The MediaServiceImageMedia object is a container for storing image. &lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> MediaServiceImageMediaオブジェクトは、画像を格納するコンテナです。<br> このフィールドは、SET時に必須となります。 </div> <div lang=\"en\"> The MediaServiceImageMedia object is a container for storing image. <br> This field is required in SET operation. </div> ")

public class MediaServiceImageMedia   {
  @JsonProperty("mediaType")
  private JsonNullable<MediaServiceType> mediaType = JsonNullable.undefined();

  @JsonProperty("aspectRatio")
  private JsonNullable<String> aspectRatio = JsonNullable.undefined();

  @JsonProperty("data")
  private JsonNullable<byte[]> data = JsonNullable.undefined();

  @JsonProperty("fileSize")
  private JsonNullable<Long> fileSize = JsonNullable.undefined();

  @JsonProperty("height")
  private JsonNullable<Long> height = JsonNullable.undefined();

  @JsonProperty("mediaAdFormat")
  private JsonNullable<String> mediaAdFormat = JsonNullable.undefined();

  @JsonProperty("mediaFileType")
  private JsonNullable<MediaServiceFileType> mediaFileType = JsonNullable.undefined();

  @JsonProperty("width")
  private JsonNullable<Long> width = JsonNullable.undefined();

  public MediaServiceImageMedia mediaType(MediaServiceType mediaType) {
    this.mediaType = JsonNullable.of(mediaType);
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceType> getMediaType() {
    return mediaType;
  }

  public void setMediaType(JsonNullable<MediaServiceType> mediaType) {
    this.mediaType = mediaType;
  }

  public MediaServiceImageMedia aspectRatio(String aspectRatio) {
    this.aspectRatio = JsonNullable.of(aspectRatio);
    return this;
  }

  /**
   * <div lang=\"ja\"> 画像アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> The type of aspect ratio.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return aspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像アスペクト比の種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのaspectRatioフィールドをご確認ください。 </div> <div lang=\"en\"> The type of aspect ratio.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to aspectRatio field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public JsonNullable<String> getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(JsonNullable<String> aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public MediaServiceImageMedia data(byte[] data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * <div lang=\"ja\">画像ファイルのbase64エンコードです。ADD時のみ指定可能で、GET時のレスポンスでは値は取得されません。</div> <div lang=\"en\">The image file in base64 encode. It can be specified on ADD, however no value returns on the response of GET.</div> 
   * @return data
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像ファイルのbase64エンコードです。ADD時のみ指定可能で、GET時のレスポンスでは値は取得されません。</div> <div lang=\"en\">The image file in base64 encode. It can be specified on ADD, however no value returns on the response of GET.</div> ")


  public JsonNullable<byte[]> getData() {
    return data;
  }

  public void setData(JsonNullable<byte[]> data) {
    this.data = data;
  }

  public MediaServiceImageMedia fileSize(Long fileSize) {
    this.fileSize = JsonNullable.of(fileSize);
    return this;
  }

  /**
   * <div lang=\"ja\"> ファイルサイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The file size of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return fileSize
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ファイルサイズです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The file size of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getFileSize() {
    return fileSize;
  }

  public void setFileSize(JsonNullable<Long> fileSize) {
    this.fileSize = fileSize;
  }

  public MediaServiceImageMedia height(Long height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * <div lang=\"ja\"> 縦の長さです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The height of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 縦の長さです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The height of image. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Long> height) {
    this.height = height;
  }

  public MediaServiceImageMedia mediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = JsonNullable.of(mediaAdFormat);
    return this;
  }

  /**
   * <div lang=\"ja\"> 画像フォーマットの種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> The type of image format.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to adFormat field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> 
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 画像フォーマットの種類です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※指定可能な値は、DictionaryServiceのgetMediaAdFormatで取得されるDictionaryServiceMediaAdFormatのadFormatフィールドをご確認ください。 </div> <div lang=\"en\"> The type of image format.<br> Although this field will be returned in the response, it will be ignored on input. <br> * Available values can be referred to adFormat field of DictionaryServiceMediaAdFormat object obtained by getMediaAdFormat operation of DictionaryService. </div> ")


  public JsonNullable<String> getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(JsonNullable<String> mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }

  public MediaServiceImageMedia mediaFileType(MediaServiceFileType mediaFileType) {
    this.mediaFileType = JsonNullable.of(mediaFileType);
    return this;
  }

  /**
   * Get mediaFileType
   * @return mediaFileType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<MediaServiceFileType> getMediaFileType() {
    return mediaFileType;
  }

  public void setMediaFileType(JsonNullable<MediaServiceFileType> mediaFileType) {
    this.mediaFileType = mediaFileType;
  }

  public MediaServiceImageMedia width(Long width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * <div lang=\"ja\"> 横幅です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The width of image.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 横幅です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The width of image.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


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
    MediaServiceImageMedia mediaServiceImageMedia = (MediaServiceImageMedia) o;
    return Objects.equals(this.mediaType, mediaServiceImageMedia.mediaType) &&
        Objects.equals(this.aspectRatio, mediaServiceImageMedia.aspectRatio) &&
        Objects.equals(this.data, mediaServiceImageMedia.data) &&
        Objects.equals(this.fileSize, mediaServiceImageMedia.fileSize) &&
        Objects.equals(this.height, mediaServiceImageMedia.height) &&
        Objects.equals(this.mediaAdFormat, mediaServiceImageMedia.mediaAdFormat) &&
        Objects.equals(this.mediaFileType, mediaServiceImageMedia.mediaFileType) &&
        Objects.equals(this.width, mediaServiceImageMedia.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, aspectRatio, data, fileSize, height, mediaAdFormat, mediaFileType, width);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

