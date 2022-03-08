/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceMediaAdFormat object contains the information of media format.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceMediaAdFormatオブジェクトは、メディアフォーマットの情報を保持します。</div> <div lang=\"en\">DictionaryServiceMediaAdFormat object contains the information of media format.</div> ")
@JsonPropertyOrder({
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_AD_FORMAT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_ASPECT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_ASPECT_HEIGHT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_ASPECT_RATIO,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_ASPECT_WIDTH,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_CAMPAIGN_BANNER,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_HEIGHT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_LOGO,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_MAX_HEIGHT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_MAX_WIDTH,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_SIZE,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_SIZE_TO,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_STATIC_IMAGE,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_THUMBNAIL,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_TRANSPARENT,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_WIDTH,
  DictionaryServiceMediaAdFormat.JSON_PROPERTY_RICH_FORMAT
})
@JsonTypeName("DictionaryServiceMediaAdFormat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceMediaAdFormat {
  public static final String JSON_PROPERTY_AD_FORMAT = "adFormat";
  private String adFormat;

  public static final String JSON_PROPERTY_ASPECT = "aspect";
  private Boolean aspect;

  public static final String JSON_PROPERTY_ASPECT_HEIGHT = "aspectHeight";
  private Long aspectHeight;

  public static final String JSON_PROPERTY_ASPECT_RATIO = "aspectRatio";
  private String aspectRatio;

  public static final String JSON_PROPERTY_ASPECT_WIDTH = "aspectWidth";
  private Long aspectWidth;

  public static final String JSON_PROPERTY_CAMPAIGN_BANNER = "campaignBanner";
  private Boolean campaignBanner;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private Boolean logo;

  public static final String JSON_PROPERTY_MAX_HEIGHT = "maxHeight";
  private Long maxHeight;

  public static final String JSON_PROPERTY_MAX_WIDTH = "maxWidth";
  private Long maxWidth;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_SIZE_TO = "sizeTo";
  private Long sizeTo;

  public static final String JSON_PROPERTY_STATIC_IMAGE = "staticImage";
  private Boolean staticImage;

  public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
  private Boolean thumbnail;

  public static final String JSON_PROPERTY_TRANSPARENT = "transparent";
  private Boolean transparent;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_RICH_FORMAT = "richFormat";
  private Boolean richFormat;

  public DictionaryServiceMediaAdFormat() { 
  }

  public DictionaryServiceMediaAdFormat adFormat(String adFormat) {
    
    this.adFormat = adFormat;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ディスプレイ（画像）広告のフォーマットです。&lt;br&gt; ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Format of display (image) ads.&lt;br&gt; *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. &lt;/div&gt; 
   * @return adFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ディスプレイ（画像）広告のフォーマットです。<br> ※YJ_1350_760, YJ_450_150は予約型広告専用のadFormatとなります。 </div> <div lang=\"en\"> Format of display (image) ads.<br> *YJ_1350_760 and YJ_450_150 are adFormat exclusive for Guaranteed ads. </div> ")
  @JsonProperty(JSON_PROPERTY_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdFormat() {
    return adFormat;
  }


  @JsonProperty(JSON_PROPERTY_AD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdFormat(String adFormat) {
    this.adFormat = adFormat;
  }


  public DictionaryServiceMediaAdFormat aspect(Boolean aspect) {
    
    this.aspect = aspect;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アスペクト比対応かどうかを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether the aspect ratio is supported.&lt;/div&gt; 
   * @return aspect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比対応かどうかを示します。</div> <div lang=\"en\">This field indicates whether the aspect ratio is supported.</div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAspect() {
    return aspect;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspect(Boolean aspect) {
    this.aspect = aspect;
  }


  public DictionaryServiceMediaAdFormat aspectHeight(Long aspectHeight) {
    
    this.aspectHeight = aspectHeight;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像アスペクト比：高さ [ratio]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Image aspect ratio: height [ratio]&lt;/div&gt; 
   * @return aspectHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：高さ [ratio]です。</div> <div lang=\"en\">Image aspect ratio: height [ratio]</div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAspectHeight() {
    return aspectHeight;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectHeight(Long aspectHeight) {
    this.aspectHeight = aspectHeight;
  }


  public DictionaryServiceMediaAdFormat aspectRatio(String aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アスペクト比です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Aspect ratio.&lt;/div&gt; 
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アスペクト比です。</div> <div lang=\"en\">Aspect ratio.</div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAspectRatio() {
    return aspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public DictionaryServiceMediaAdFormat aspectWidth(Long aspectWidth) {
    
    this.aspectWidth = aspectWidth;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像アスペクト比：幅 [ratio]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Image aspect ratio: width [ratio]&lt;/div&gt; 
   * @return aspectWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像アスペクト比：幅 [ratio]です。</div> <div lang=\"en\">Image aspect ratio: width [ratio]</div> ")
  @JsonProperty(JSON_PROPERTY_ASPECT_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAspectWidth() {
    return aspectWidth;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectWidth(Long aspectWidth) {
    this.aspectWidth = aspectWidth;
  }


  public DictionaryServiceMediaAdFormat campaignBanner(Boolean campaignBanner) {
    
    this.campaignBanner = campaignBanner;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether it is a campaign banner image or not.&lt;/div&gt; 
   * @return campaignBanner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンバナー画像である/キャンペーンバナー画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a campaign banner image or not.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCampaignBanner() {
    return campaignBanner;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BANNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBanner(Boolean campaignBanner) {
    this.campaignBanner = campaignBanner;
  }


  public DictionaryServiceMediaAdFormat height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最小画像サイズ：高さ [pixel]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum image size: height [pixel]&lt;/div&gt; 
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：高さ [pixel]です。</div> <div lang=\"en\">Minimum image size: height [pixel]</div> ")
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


  public DictionaryServiceMediaAdFormat logo(Boolean logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ロゴ画像である/ロゴ画像ではないことを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether it is a logo image or not.&lt;/div&gt; 
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ロゴ画像である/ロゴ画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a logo image or not.</div> ")
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(Boolean logo) {
    this.logo = logo;
  }


  public DictionaryServiceMediaAdFormat maxHeight(Long maxHeight) {
    
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイズ上限：高さ [pixel]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Size limit: height [pixel]&lt;/div&gt; 
   * @return maxHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：高さ [pixel]です。</div> <div lang=\"en\">Size limit: height [pixel]</div> ")
  @JsonProperty(JSON_PROPERTY_MAX_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxHeight() {
    return maxHeight;
  }


  @JsonProperty(JSON_PROPERTY_MAX_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
  }


  public DictionaryServiceMediaAdFormat maxWidth(Long maxWidth) {
    
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイズ上限：幅 [pixel]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Size limit: width [pixel]&lt;/div&gt; 
   * @return maxWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイズ上限：幅 [pixel]です。</div> <div lang=\"en\">Size limit: width [pixel]</div> ")
  @JsonProperty(JSON_PROPERTY_MAX_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxWidth() {
    return maxWidth;
  }


  @JsonProperty(JSON_PROPERTY_MAX_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
  }


  public DictionaryServiceMediaAdFormat size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像の最大容量：[byte]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum image capacity: [byte]&lt;/div&gt; 
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像の最大容量：[byte]です。</div> <div lang=\"en\">Maximum image capacity: [byte]</div> ")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public DictionaryServiceMediaAdFormat sizeTo(Long sizeTo) {
    
    this.sizeTo = sizeTo;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像圧縮後の容量：[byte]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Image compression capacity: [byte]&lt;/div&gt; 
   * @return sizeTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像圧縮後の容量：[byte]です。</div> <div lang=\"en\">Image compression capacity: [byte]</div> ")
  @JsonProperty(JSON_PROPERTY_SIZE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSizeTo() {
    return sizeTo;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizeTo(Long sizeTo) {
    this.sizeTo = sizeTo;
  }


  public DictionaryServiceMediaAdFormat staticImage(Boolean staticImage) {
    
    this.staticImage = staticImage;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;静止画用の画像かどうかを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether it is a static image.&lt;/div&gt; 
   * @return staticImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">静止画用の画像かどうかを示します。</div> <div lang=\"en\">This field indicates whether it is a static image.</div> ")
  @JsonProperty(JSON_PROPERTY_STATIC_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStaticImage() {
    return staticImage;
  }


  @JsonProperty(JSON_PROPERTY_STATIC_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStaticImage(Boolean staticImage) {
    this.staticImage = staticImage;
  }


  public DictionaryServiceMediaAdFormat thumbnail(Boolean thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サムネイル画像である/サムネイル画像ではないことを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether it is a thumbnail image image or not.&lt;/div&gt; 
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サムネイル画像である/サムネイル画像ではないことを示します。</div> <div lang=\"en\">This field indicates whether it is a thumbnail image image or not.</div> ")
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThumbnail() {
    return thumbnail;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnail(Boolean thumbnail) {
    this.thumbnail = thumbnail;
  }


  public DictionaryServiceMediaAdFormat transparent(Boolean transparent) {
    
    this.transparent = transparent;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;透過画像の許可/不許可を示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field indicates whether transparent image is permitted.&lt;/div&gt; 
   * @return transparent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">透過画像の許可/不許可を示します。</div> <div lang=\"en\">This field indicates whether transparent image is permitted.</div> ")
  @JsonProperty(JSON_PROPERTY_TRANSPARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTransparent() {
    return transparent;
  }


  @JsonProperty(JSON_PROPERTY_TRANSPARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransparent(Boolean transparent) {
    this.transparent = transparent;
  }


  public DictionaryServiceMediaAdFormat width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最小画像サイズ：幅 [pixel]です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum image size: width [pixel]&lt;/div&gt; 
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最小画像サイズ：幅 [pixel]です。</div> <div lang=\"en\">Minimum image size: width [pixel]</div> ")
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


  public DictionaryServiceMediaAdFormat richFormat(Boolean richFormat) {
    
    this.richFormat = richFormat;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;リッチフォーマット用の画像かどうかを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Indicates whether the image is for rich format.&lt;/div&gt; 
   * @return richFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">リッチフォーマット用の画像かどうかを示します。</div> <div lang=\"en\">Indicates whether the image is for rich format.</div> ")
  @JsonProperty(JSON_PROPERTY_RICH_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRichFormat() {
    return richFormat;
  }


  @JsonProperty(JSON_PROPERTY_RICH_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

