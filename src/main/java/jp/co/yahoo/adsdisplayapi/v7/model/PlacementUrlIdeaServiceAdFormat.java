/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceAdFormatは、広告のフォーマットを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad Format.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceAdFormatは、広告のフォーマットを表します。</div> <div lang=\"en\">Ad Format.</div> ")
@JsonPropertyOrder({
  PlacementUrlIdeaServiceAdFormat.JSON_PROPERTY_AD_STYLE,
  PlacementUrlIdeaServiceAdFormat.JSON_PROPERTY_AD_TYPE,
  PlacementUrlIdeaServiceAdFormat.JSON_PROPERTY_WIDTH,
  PlacementUrlIdeaServiceAdFormat.JSON_PROPERTY_HEIGHT
})
@JsonTypeName("PlacementUrlIdeaServiceAdFormat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementUrlIdeaServiceAdFormat {
  public static final String JSON_PROPERTY_AD_STYLE = "adStyle";
  private String adStyle;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private String adType;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public PlacementUrlIdeaServiceAdFormat() { 
  }

  public PlacementUrlIdeaServiceAdFormat adStyle(String adStyle) {
    
    this.adStyle = adStyle;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告のスタイルです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad Style of image.&lt;/div&gt; 
   * @return adStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告のスタイルです。</div> <div lang=\"en\">Ad Style of image.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdStyle() {
    return adStyle;
  }


  @JsonProperty(JSON_PROPERTY_AD_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdStyle(String adStyle) {
    this.adStyle = adStyle;
  }


  public PlacementUrlIdeaServiceAdFormat adType(String adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告のタイプです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad Type of image.&lt;/div&gt; 
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告のタイプです。</div> <div lang=\"en\">Ad Type of image.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(String adType) {
    this.adType = adType;
  }


  public PlacementUrlIdeaServiceAdFormat width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像の幅です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Width of the image.&lt;/div&gt; 
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像の幅です。</div> <div lang=\"en\">Width of the image.</div> ")
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


  public PlacementUrlIdeaServiceAdFormat height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;画像の高さです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Height of the image.&lt;/div&gt; 
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">画像の高さです。</div> <div lang=\"en\">Height of the image.</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdeaServiceAdFormat placementUrlIdeaServiceAdFormat = (PlacementUrlIdeaServiceAdFormat) o;
    return Objects.equals(this.adStyle, placementUrlIdeaServiceAdFormat.adStyle) &&
        Objects.equals(this.adType, placementUrlIdeaServiceAdFormat.adType) &&
        Objects.equals(this.width, placementUrlIdeaServiceAdFormat.width) &&
        Objects.equals(this.height, placementUrlIdeaServiceAdFormat.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStyle, adType, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdeaServiceAdFormat {\n");
    sb.append("    adStyle: ").append(toIndentedString(adStyle)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

