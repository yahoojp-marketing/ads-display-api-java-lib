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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlIdeaServiceAdFormatConditionsオブジェクトは、広告掲載フォーマットの情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PlacementUrlIdeaServiceAdFormatConditions stores Ad Distribution format information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlIdeaServiceAdFormatConditionsオブジェクトは、広告掲載フォーマットの情報を保持するオブジェクトです。</div> <div lang=\"en\">PlacementUrlIdeaServiceAdFormatConditions stores Ad Distribution format information.</div> ")

public class PlacementUrlIdeaServiceAdFormatConditions   {
  @JsonProperty("adStyle")
  private JsonNullable<String> adStyle = JsonNullable.undefined();

  @JsonProperty("mediaAdFormat")
  private JsonNullable<String> mediaAdFormat = JsonNullable.undefined();

  public PlacementUrlIdeaServiceAdFormatConditions adStyle(String adStyle) {
    this.adStyle = JsonNullable.of(adStyle);
    return this;
  }

  /**
   * <div lang=\"ja\">広告スタイルです。</div> <div lang=\"en\">Ad style.</div> 
   * @return adStyle
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告スタイルです。</div> <div lang=\"en\">Ad style.</div> ")


  public JsonNullable<String> getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(JsonNullable<String> adStyle) {
    this.adStyle = adStyle;
  }

  public PlacementUrlIdeaServiceAdFormatConditions mediaAdFormat(String mediaAdFormat) {
    this.mediaAdFormat = JsonNullable.of(mediaAdFormat);
    return this;
  }

  /**
   * <div lang=\"ja\">メディアフォーマットです。</div> <div lang=\"en\">Media format.</div> 
   * @return mediaAdFormat
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メディアフォーマットです。</div> <div lang=\"en\">Media format.</div> ")


  public JsonNullable<String> getMediaAdFormat() {
    return mediaAdFormat;
  }

  public void setMediaAdFormat(JsonNullable<String> mediaAdFormat) {
    this.mediaAdFormat = mediaAdFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

