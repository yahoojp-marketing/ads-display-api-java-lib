package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceMediaAdFormat object contains the information of media format.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。</div> <div lang=\"en\">DictionaryServiceMediaAdFormat object contains the information of media format.</div> ")

public class DictionaryServiceMediaAdFormat   {
  @JsonProperty("adFormat")
  private JsonNullable<String> adFormat = JsonNullable.undefined();

  @JsonProperty("aspect")
  private JsonNullable<Boolean> aspect = JsonNullable.undefined();

  @JsonProperty("aspectHeight")
  private JsonNullable<Long> aspectHeight = JsonNullable.undefined();

  @JsonProperty("aspectRatio")
  private JsonNullable<String> aspectRatio = JsonNullable.undefined();

  @JsonProperty("aspectWidth")
  private JsonNullable<Long> aspectWidth = JsonNullable.undefined();

  @JsonProperty("campaignBanner")
  private JsonNullable<Boolean> campaignBanner = JsonNullable.undefined();

  @JsonProperty("height")
  private JsonNullable<Long> height = JsonNullable.undefined();

  @JsonProperty("logo")
  private JsonNullable<Boolean> logo = JsonNullable.undefined();

  @JsonProperty("maxHeight")
  private JsonNullable<Long> maxHeight = JsonNullable.undefined();

  @JsonProperty("maxWidth")
  private JsonNullable<Long> maxWidth = JsonNullable.undefined();

  @JsonProperty("size")
  private JsonNullable<Long> size = JsonNullable.undefined();

  @JsonProperty("sizeTo")
  private JsonNullable<Long> sizeTo = JsonNullable.undefined();

  @JsonProperty("staticImage")
  private JsonNullable<Boolean> staticImage = JsonNullable.undefined();

  @JsonProperty("thumbnail")
  private JsonNullable<Boolean> thumbnail = JsonNullable.undefined();

  @JsonProperty("transparent")
  private JsonNullable<Boolean> transparent = JsonNullable.undefined();

  @JsonProperty("width")
  private JsonNullable<Long> width = JsonNullable.undefined();

  @JsonProperty("richFormat")
  private JsonNullable<Boolean> richFormat = JsonNullable.undefined();

  public DictionaryServiceMediaAdFormat adFormat(String adFormat) {
    this.adFormat = JsonNullable.of(adFormat);
    return this;
  }

  /**
   * <div lang=\"ja\"> ディスプレイ（画像）広告のフォーマットです。<br> ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 </div> <div lang=\"en\"> Format of display (image) ads.<br> *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. </div> 
   * @return adFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ディスプレイ（画像）広告のフォーマットです。<br> ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 </div> <div lang=\"en\"> Format of display (image) ads.<br> *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. </div> ")


  public JsonNullable<String> getAdFormat() {
    return adFormat;
  }

  public void setAdFormat(JsonNullable<String> adFormat) {
    this.adFormat = adFormat;
  }

  public DictionaryServiceMediaAdFormat aspect(Boolean aspect) {
    this.aspect = JsonNullable.of(aspect);
    return this;
  }

  /**
   * <div lang=\"ja\">アスペクト比対応かどうかを示します。</div> <div lang=\"en\">This field indicates whether the aspect ratio is supported.</div> 
   * @return aspect
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比対応かどうかを示します。</div> <div lang=\"en\">This field indicates whether the aspect ratio is supported.</div> ")


  public JsonNullable<Boolean> getAspect() {
    return aspect;
  }

  public void setAspect(JsonNullable<Boolean> aspect) {
    this.aspect = aspect;
  }

  public DictionaryServiceMediaAdFormat aspectHeight(Long aspectHeight) {
    this.aspectHeight = JsonNullable.of(aspectHeight);
    return this;
  }

  /**
   * <div lang=\"ja\">画像アスペクト比：高さ [ratio]です。</div> <div lang=\"en\">Image aspect ratio: height [ratio]</div> 
   * @return aspectHeight
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：高さ [ratio]です。</div> <div lang=\"en\">Image aspect ratio: height [ratio]</div> ")


  public JsonNullable<Long> getAspectHeight() {
    return aspectHeight;
  }

  public void setAspectHeight(JsonNullable<Long> aspectHeight) {
    this.aspectHeight = aspectHeight;
  }

  public DictionaryServiceMediaAdFormat aspectRatio(String aspectRatio) {
    this.aspectRatio = JsonNullable.of(aspectRatio);
    return this;
  }

  /**
   * <div lang=\"ja\">アスペクト比です。</div> <div lang=\"en\">Aspect ratio.</div> 
   * @return aspectRatio
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比です。</div> <div lang=\"en\">Aspect ratio.</div> ")


  public JsonNullable<String> getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(JsonNullable<String> aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public DictionaryServiceMediaAdFormat aspectWidth(Long aspectWidth) {
    this.aspectWidth = JsonNullable.of(aspectWidth);
    return this;
  }

  /**
   * <div lang=\"ja\">画像アスペクト比：幅 [ratio]です。</div> <div lang=\"en\">Image aspect ratio: width [ratio]</div> 
   * @return aspectWidth
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：幅 [ratio]です。</div> <div lang=\"en\">Image aspect ratio: width [ratio]</div> ")


  public JsonNullable<Long> getAspectWidth() {
    return aspectWidth;
  }

  public void setAspectWidth(JsonNullable<Long> aspectWidth) {
    this.aspectWidth = aspectWidth;
  }

  public DictionaryServiceMediaAdFormat campaignBanner(Boolean campaignBanner) {
    this.campaignBanner = JsonNullable.of(campaignBanner);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a campaign banner image or not.</div> 
   * @return campaignBanner
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a campaign banner image or not.</div> ")


  public JsonNullable<Boolean> getCampaignBanner() {
    return campaignBanner;
  }

  public void setCampaignBanner(JsonNullable<Boolean> campaignBanner) {
    this.campaignBanner = campaignBanner;
  }

  public DictionaryServiceMediaAdFormat height(Long height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * <div lang=\"ja\">最小画像サイズ：高さ [pixel]です。</div> <div lang=\"en\">Minimum image size: height [pixel]</div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：高さ [pixel]です。</div> <div lang=\"en\">Minimum image size: height [pixel]</div> ")


  public JsonNullable<Long> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Long> height) {
    this.height = height;
  }

  public DictionaryServiceMediaAdFormat logo(Boolean logo) {
    this.logo = JsonNullable.of(logo);
    return this;
  }

  /**
   * <div lang=\"ja\">ロゴ画像である/ロゴ画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a logo image or not.</div> 
   * @return logo
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ロゴ画像である/ロゴ画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a logo image or not.</div> ")


  public JsonNullable<Boolean> getLogo() {
    return logo;
  }

  public void setLogo(JsonNullable<Boolean> logo) {
    this.logo = logo;
  }

  public DictionaryServiceMediaAdFormat maxHeight(Long maxHeight) {
    this.maxHeight = JsonNullable.of(maxHeight);
    return this;
  }

  /**
   * <div lang=\"ja\">サイズ上限：高さ [pixel]です。</div> <div lang=\"en\">Size limit: height [pixel]</div> 
   * @return maxHeight
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：高さ [pixel]です。</div> <div lang=\"en\">Size limit: height [pixel]</div> ")


  public JsonNullable<Long> getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(JsonNullable<Long> maxHeight) {
    this.maxHeight = maxHeight;
  }

  public DictionaryServiceMediaAdFormat maxWidth(Long maxWidth) {
    this.maxWidth = JsonNullable.of(maxWidth);
    return this;
  }

  /**
   * <div lang=\"ja\">サイズ上限：幅 [pixel]です。</div> <div lang=\"en\">Size limit: width [pixel]</div> 
   * @return maxWidth
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：幅 [pixel]です。</div> <div lang=\"en\">Size limit: width [pixel]</div> ")


  public JsonNullable<Long> getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(JsonNullable<Long> maxWidth) {
    this.maxWidth = maxWidth;
  }

  public DictionaryServiceMediaAdFormat size(Long size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * <div lang=\"ja\">画像の最大容量：[byte]です。</div> <div lang=\"en\">Maximum image capacity: [byte]</div> 
   * @return size
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像の最大容量：[byte]です。</div> <div lang=\"en\">Maximum image capacity: [byte]</div> ")


  public JsonNullable<Long> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Long> size) {
    this.size = size;
  }

  public DictionaryServiceMediaAdFormat sizeTo(Long sizeTo) {
    this.sizeTo = JsonNullable.of(sizeTo);
    return this;
  }

  /**
   * <div lang=\"ja\">画像圧縮後の容量：[byte]です。</div> <div lang=\"en\">Image compression capacity: [byte]</div> 
   * @return sizeTo
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像圧縮後の容量：[byte]です。</div> <div lang=\"en\">Image compression capacity: [byte]</div> ")


  public JsonNullable<Long> getSizeTo() {
    return sizeTo;
  }

  public void setSizeTo(JsonNullable<Long> sizeTo) {
    this.sizeTo = sizeTo;
  }

  public DictionaryServiceMediaAdFormat staticImage(Boolean staticImage) {
    this.staticImage = JsonNullable.of(staticImage);
    return this;
  }

  /**
   * <div lang=\"ja\">静止画用の画像かどうかを示します。</div> <div lang=\"en\">This field indicates whether it is a static image.</div> 
   * @return staticImage
  */
  @ApiModelProperty(value = "<div lang=\"ja\">静止画用の画像かどうかを示します。</div> <div lang=\"en\">This field indicates whether it is a static image.</div> ")


  public JsonNullable<Boolean> getStaticImage() {
    return staticImage;
  }

  public void setStaticImage(JsonNullable<Boolean> staticImage) {
    this.staticImage = staticImage;
  }

  public DictionaryServiceMediaAdFormat thumbnail(Boolean thumbnail) {
    this.thumbnail = JsonNullable.of(thumbnail);
    return this;
  }

  /**
   * <div lang=\"ja\">サムネイル画像である/サムネイル画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a thumbnail image image or not.</div> 
   * @return thumbnail
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サムネイル画像である/サムネイル画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a thumbnail image image or not.</div> ")


  public JsonNullable<Boolean> getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(JsonNullable<Boolean> thumbnail) {
    this.thumbnail = thumbnail;
  }

  public DictionaryServiceMediaAdFormat transparent(Boolean transparent) {
    this.transparent = JsonNullable.of(transparent);
    return this;
  }

  /**
   * <div lang=\"ja\">透過画像の許可/不許可を示します。</div> <div lang=\"en\">This field indicates whether transparent image is permitted.</div> 
   * @return transparent
  */
  @ApiModelProperty(value = "<div lang=\"ja\">透過画像の許可/不許可を示します。</div> <div lang=\"en\">This field indicates whether transparent image is permitted.</div> ")


  public JsonNullable<Boolean> getTransparent() {
    return transparent;
  }

  public void setTransparent(JsonNullable<Boolean> transparent) {
    this.transparent = transparent;
  }

  public DictionaryServiceMediaAdFormat width(Long width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * <div lang=\"ja\">最小画像サイズ：幅 [pixel]です。</div> <div lang=\"en\">Minimum image size: width [pixel]</div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：幅 [pixel]です。</div> <div lang=\"en\">Minimum image size: width [pixel]</div> ")


  public JsonNullable<Long> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Long> width) {
    this.width = width;
  }

  public DictionaryServiceMediaAdFormat richFormat(Boolean richFormat) {
    this.richFormat = JsonNullable.of(richFormat);
    return this;
  }

  /**
   * <div lang=\"ja\">リッチフォーマット用の画像かどうかを示します。</div> <div lang=\"en\">Indicates whether the image is for rich format.</div> 
   * @return richFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リッチフォーマット用の画像かどうかを示します。</div> <div lang=\"en\">Indicates whether the image is for rich format.</div> ")


  public JsonNullable<Boolean> getRichFormat() {
    return richFormat;
  }

  public void setRichFormat(JsonNullable<Boolean> richFormat) {
    this.richFormat = richFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

