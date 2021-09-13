package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceAdFormatConditionsオブジェクトは、広告掲載フォーマットの情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PlacementUrlIdeaServiceAdFormatConditions stores Ad Distribution format information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceAdFormatConditionsオブジェクトは、広告掲載フォーマットの情報を保持するオブジェクトです。</div> <div lang=\"en\">PlacementUrlIdeaServiceAdFormatConditions stores Ad Distribution format information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlIdeaServiceAdFormatConditions   {
  @JsonProperty("adStyle")
  private String adStyle = null;

  @JsonProperty("mediaAdFormat")
  private String mediaAdFormat = null;

  public PlacementUrlIdeaServiceAdFormatConditions adStyle(String adStyle) {
    this.adStyle = adStyle;
    return this;
  }

  /**
   * <div lang=\"ja\">広告スタイルです。</div> <div lang=\"en\">Ad style.</div> 
   * @return adStyle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告スタイルです。</div> <div lang=\"en\">Ad style.</div> ")


  public String getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(String adStyle) {
    this.adStyle = adStyle;
  }

  public PlacementUrlIdeaServiceAdFormatConditions mediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
    return this;
  }

  /**
   * <div lang=\"ja\">メディアフォーマットです。</div> <div lang=\"en\">Media format.</div> 
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアフォーマットです。</div> <div lang=\"en\">Media format.</div> ")


  public String getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementUrlIdeaServiceAdFormatConditions placementUrlIdeaServiceAdFormatConditions = (PlacementUrlIdeaServiceAdFormatConditions) o;
    return Objects.equals(this.adStyle, placementUrlIdeaServiceAdFormatConditions.adStyle) &&
        Objects.equals(this.mediaAdFormat, placementUrlIdeaServiceAdFormatConditions.mediaAdFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStyle, mediaAdFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlIdeaServiceAdFormatConditions {\n");
    
    sb.append("    adStyle: ").append(toIndentedString(adStyle)).append("\n");
    sb.append("    mediaAdFormat: ").append(toIndentedString(mediaAdFormat)).append("\n");
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

