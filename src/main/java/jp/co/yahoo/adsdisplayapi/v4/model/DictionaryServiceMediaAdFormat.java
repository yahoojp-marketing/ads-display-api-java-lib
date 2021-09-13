package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceMediaAdFormat object contains the information of media format.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。</div> <div lang=\"en\">DictionaryServiceMediaAdFormat object contains the information of media format.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceMediaAdFormat   {
  @JsonProperty("adFormat")
  private String adFormat = null;

  @JsonProperty("aspect")
  private Boolean aspect = null;

  @JsonProperty("aspectHeight")
  private Long aspectHeight = null;

  @JsonProperty("aspectRatio")
  private String aspectRatio = null;

  @JsonProperty("aspectWidth")
  private Long aspectWidth = null;

  @JsonProperty("campaignBanner")
  private Boolean campaignBanner = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("logo")
  private Boolean logo = null;

  @JsonProperty("maxHeight")
  private Long maxHeight = null;

  @JsonProperty("maxWidth")
  private Long maxWidth = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("sizeTo")
  private Long sizeTo = null;

  @JsonProperty("staticImage")
  private Boolean staticImage = null;

  @JsonProperty("thumbnail")
  private Boolean thumbnail = null;

  @JsonProperty("transparent")
  private Boolean transparent = null;

  @JsonProperty("width")
  private Long width = null;

  @JsonProperty("richFormat")
  private Boolean richFormat = null;

  public DictionaryServiceMediaAdFormat adFormat(String adFormat) {
    this.adFormat = adFormat;
    return this;
  }

  /**
   * <div lang=\"ja\"> ディスプレイ（画像）広告のフォーマットです。<br> ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 </div> <div lang=\"en\"> Format of display (image) ads.<br> *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. </div> 
   * @return adFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ディスプレイ（画像）広告のフォーマットです。<br> ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 </div> <div lang=\"en\"> Format of display (image) ads.<br> *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. </div> ")


  public String getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(String adFormat) {
    this.adFormat = adFormat;
  }

  public DictionaryServiceMediaAdFormat aspect(Boolean aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * <div lang=\"ja\">アスペクト比対応かどうかを示します。</div> <div lang=\"en\">This field indicates whether the aspect ratio is supported.</div> 
   * @return aspect
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比対応かどうかを示します。</div> <div lang=\"en\">This field indicates whether the aspect ratio is supported.</div> ")


  public Boolean getAspect() {
    return aspect;
  }

  public void setAspect(Boolean aspect) {
    this.aspect = aspect;
  }

  public DictionaryServiceMediaAdFormat aspectHeight(Long aspectHeight) {
    this.aspectHeight = aspectHeight;
    return this;
  }

  /**
   * <div lang=\"ja\">画像アスペクト比：高さ [ratio]です。</div> <div lang=\"en\">Image aspect ratio: height [ratio]</div> 
   * @return aspectHeight
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：高さ [ratio]です。</div> <div lang=\"en\">Image aspect ratio: height [ratio]</div> ")


  public Long getAspectHeight() {
    return aspectHeight;
  }

  public void setAspectHeight(Long aspectHeight) {
    this.aspectHeight = aspectHeight;
  }

  public DictionaryServiceMediaAdFormat aspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * <div lang=\"ja\">アスペクト比です。</div> <div lang=\"en\">Aspect ratio.</div> 
   * @return aspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比です。</div> <div lang=\"en\">Aspect ratio.</div> ")


  public String getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public DictionaryServiceMediaAdFormat aspectWidth(Long aspectWidth) {
    this.aspectWidth = aspectWidth;
    return this;
  }

  /**
   * <div lang=\"ja\">画像アスペクト比：幅 [ratio]です。</div> <div lang=\"en\">Image aspect ratio: width [ratio]</div> 
   * @return aspectWidth
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：幅 [ratio]です。</div> <div lang=\"en\">Image aspect ratio: width [ratio]</div> ")


  public Long getAspectWidth() {
    return aspectWidth;
  }

  public void setAspectWidth(Long aspectWidth) {
    this.aspectWidth = aspectWidth;
  }

  public DictionaryServiceMediaAdFormat campaignBanner(Boolean campaignBanner) {
    this.campaignBanner = campaignBanner;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a campaign banner image or not.</div> 
   * @return campaignBanner
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a campaign banner image or not.</div> ")


  public Boolean getCampaignBanner() {
    return campaignBanner;
  }

  public void setCampaignBanner(Boolean campaignBanner) {
    this.campaignBanner = campaignBanner;
  }

  public DictionaryServiceMediaAdFormat height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * <div lang=\"ja\">最小画像サイズ：高さ [pixel]です。</div> <div lang=\"en\">Minimum image size: height [pixel]</div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：高さ [pixel]です。</div> <div lang=\"en\">Minimum image size: height [pixel]</div> ")


  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public DictionaryServiceMediaAdFormat logo(Boolean logo) {
    this.logo = logo;
    return this;
  }

  /**
   * <div lang=\"ja\">ロゴ画像である/ロゴ画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a logo image or not.</div> 
   * @return logo
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ロゴ画像である/ロゴ画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a logo image or not.</div> ")


  public Boolean getLogo() {
    return logo;
  }

  public void setLogo(Boolean logo) {
    this.logo = logo;
  }

  public DictionaryServiceMediaAdFormat maxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

  /**
   * <div lang=\"ja\">サイズ上限：高さ [pixel]です。</div> <div lang=\"en\">Size limit: height [pixel]</div> 
   * @return maxHeight
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：高さ [pixel]です。</div> <div lang=\"en\">Size limit: height [pixel]</div> ")


  public Long getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
  }

  public DictionaryServiceMediaAdFormat maxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

  /**
   * <div lang=\"ja\">サイズ上限：幅 [pixel]です。</div> <div lang=\"en\">Size limit: width [pixel]</div> 
   * @return maxWidth
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：幅 [pixel]です。</div> <div lang=\"en\">Size limit: width [pixel]</div> ")


  public Long getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
  }

  public DictionaryServiceMediaAdFormat size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <div lang=\"ja\">画像の最大容量：[byte]です。</div> <div lang=\"en\">Maximum image capacity: [byte]</div> 
   * @return size
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像の最大容量：[byte]です。</div> <div lang=\"en\">Maximum image capacity: [byte]</div> ")


  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DictionaryServiceMediaAdFormat sizeTo(Long sizeTo) {
    this.sizeTo = sizeTo;
    return this;
  }

  /**
   * <div lang=\"ja\">画像圧縮後の容量：[byte]です。</div> <div lang=\"en\">Image compression capacity: [byte]</div> 
   * @return sizeTo
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像圧縮後の容量：[byte]です。</div> <div lang=\"en\">Image compression capacity: [byte]</div> ")


  public Long getSizeTo() {
    return sizeTo;
  }

  public void setSizeTo(Long sizeTo) {
    this.sizeTo = sizeTo;
  }

  public DictionaryServiceMediaAdFormat staticImage(Boolean staticImage) {
    this.staticImage = staticImage;
    return this;
  }

  /**
   * <div lang=\"ja\">静止画用の画像かどうかを示します。</div> <div lang=\"en\">This field indicates whether it is a static image.</div> 
   * @return staticImage
  */
  @ApiModelProperty(value = "<div lang=\"ja\">静止画用の画像かどうかを示します。</div> <div lang=\"en\">This field indicates whether it is a static image.</div> ")


  public Boolean getStaticImage() {
    return staticImage;
  }

  public void setStaticImage(Boolean staticImage) {
    this.staticImage = staticImage;
  }

  public DictionaryServiceMediaAdFormat thumbnail(Boolean thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * <div lang=\"ja\">サムネイル画像である/サムネイル画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a thumbnail image image or not.</div> 
   * @return thumbnail
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サムネイル画像である/サムネイル画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a thumbnail image image or not.</div> ")


  public Boolean getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(Boolean thumbnail) {
    this.thumbnail = thumbnail;
  }

  public DictionaryServiceMediaAdFormat transparent(Boolean transparent) {
    this.transparent = transparent;
    return this;
  }

  /**
   * <div lang=\"ja\">透過画像の許可/不許可を示します。</div> <div lang=\"en\">This field indicates whether transparent image is permitted.</div> 
   * @return transparent
  */
  @ApiModelProperty(value = "<div lang=\"ja\">透過画像の許可/不許可を示します。</div> <div lang=\"en\">This field indicates whether transparent image is permitted.</div> ")


  public Boolean getTransparent() {
    return transparent;
  }

  public void setTransparent(Boolean transparent) {
    this.transparent = transparent;
  }

  public DictionaryServiceMediaAdFormat width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <div lang=\"ja\">最小画像サイズ：幅 [pixel]です。</div> <div lang=\"en\">Minimum image size: width [pixel]</div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：幅 [pixel]です。</div> <div lang=\"en\">Minimum image size: width [pixel]</div> ")


  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public DictionaryServiceMediaAdFormat richFormat(Boolean richFormat) {
    this.richFormat = richFormat;
    return this;
  }

  /**
   * <div lang=\"ja\">リッチフォーマット用の画像かどうかを示します。</div> <div lang=\"en\">Indicates whether the image is for rich format.</div> 
   * @return richFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リッチフォーマット用の画像かどうかを示します。</div> <div lang=\"en\">Indicates whether the image is for rich format.</div> ")


  public Boolean getRichFormat() {
    return richFormat;
  }

  public void setRichFormat(Boolean richFormat) {
    this.richFormat = richFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceMediaAdFormat dictionaryServiceMediaAdFormat = (DictionaryServiceMediaAdFormat) o;
    return Objects.equals(this.adFormat, dictionaryServiceMediaAdFormat.adFormat) &&
        Objects.equals(this.aspect, dictionaryServiceMediaAdFormat.aspect) &&
        Objects.equals(this.aspectHeight, dictionaryServiceMediaAdFormat.aspectHeight) &&
        Objects.equals(this.aspectRatio, dictionaryServiceMediaAdFormat.aspectRatio) &&
        Objects.equals(this.aspectWidth, dictionaryServiceMediaAdFormat.aspectWidth) &&
        Objects.equals(this.campaignBanner, dictionaryServiceMediaAdFormat.campaignBanner) &&
        Objects.equals(this.height, dictionaryServiceMediaAdFormat.height) &&
        Objects.equals(this.logo, dictionaryServiceMediaAdFormat.logo) &&
        Objects.equals(this.maxHeight, dictionaryServiceMediaAdFormat.maxHeight) &&
        Objects.equals(this.maxWidth, dictionaryServiceMediaAdFormat.maxWidth) &&
        Objects.equals(this.size, dictionaryServiceMediaAdFormat.size) &&
        Objects.equals(this.sizeTo, dictionaryServiceMediaAdFormat.sizeTo) &&
        Objects.equals(this.staticImage, dictionaryServiceMediaAdFormat.staticImage) &&
        Objects.equals(this.thumbnail, dictionaryServiceMediaAdFormat.thumbnail) &&
        Objects.equals(this.transparent, dictionaryServiceMediaAdFormat.transparent) &&
        Objects.equals(this.width, dictionaryServiceMediaAdFormat.width) &&
        Objects.equals(this.richFormat, dictionaryServiceMediaAdFormat.richFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adFormat, aspect, aspectHeight, aspectRatio, aspectWidth, campaignBanner, height, logo, maxHeight, maxWidth, size, sizeTo, staticImage, thumbnail, transparent, width, richFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceMediaAdFormat {\n");
    
    sb.append("    adFormat: ").append(toIndentedString(adFormat)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    aspectHeight: ").append(toIndentedString(aspectHeight)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    aspectWidth: ").append(toIndentedString(aspectWidth)).append("\n");
    sb.append("    campaignBanner: ").append(toIndentedString(campaignBanner)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeTo: ").append(toIndentedString(sizeTo)).append("\n");
    sb.append("    staticImage: ").append(toIndentedString(staticImage)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    richFormat: ").append(toIndentedString(richFormat)).append("\n");
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

