package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceAdFormatは、広告のフォーマットを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad Format.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceAdFormatは、広告のフォーマットを表します。</div> <div lang=\"en\">Ad Format.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlIdeaServiceAdFormat   {
  @JsonProperty("adStyle")
  private String adStyle = null;

  @JsonProperty("adType")
  private String adType = null;

  @JsonProperty("width")
  private Long width = null;

  @JsonProperty("height")
  private Long height = null;

  public PlacementUrlIdeaServiceAdFormat adStyle(String adStyle) {
    this.adStyle = adStyle;
    return this;
  }

  /**
   * <div lang=\"ja\">広告のスタイルです。</div> <div lang=\"en\">Ad Style of image.</div> 
   * @return adStyle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告のスタイルです。</div> <div lang=\"en\">Ad Style of image.</div> ")


  public String getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(String adStyle) {
    this.adStyle = adStyle;
  }

  public PlacementUrlIdeaServiceAdFormat adType(String adType) {
    this.adType = adType;
    return this;
  }

  /**
   * <div lang=\"ja\">広告のタイプです。</div> <div lang=\"en\">Ad Type of image.</div> 
   * @return adType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告のタイプです。</div> <div lang=\"en\">Ad Type of image.</div> ")


  public String getAdType() {
    return adType;
  }

  public void setAdType(String adType) {
    this.adType = adType;
  }

  public PlacementUrlIdeaServiceAdFormat width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * <div lang=\"ja\">画像の幅です。</div> <div lang=\"en\">Width of the image.</div> 
   * @return width
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像の幅です。</div> <div lang=\"en\">Width of the image.</div> ")


  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public PlacementUrlIdeaServiceAdFormat height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * <div lang=\"ja\">画像の高さです。</div> <div lang=\"en\">Height of the image.</div> 
   * @return height
  */
  @ApiModelProperty(value = "<div lang=\"ja\">画像の高さです。</div> <div lang=\"en\">Height of the image.</div> ")


  public Long getHeight() {
    return height;
  }

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

