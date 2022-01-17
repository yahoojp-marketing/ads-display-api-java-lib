package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.VideoServiceExtraSpecsQualityType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceExtraSpecsは、通常の画質（低画質、中画質、高画質）の他に追加で利用できる画質です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceExtraSpecs is an additional video quality that can be used other than the regular video qualities (low-quality, medium-quality, high-quality).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceExtraSpecsは、通常の画質（低画質、中画質、高画質）の他に追加で利用できる画質です。</div> <div lang=\"en\">VideoServiceExtraSpecs is an additional video quality that can be used other than the regular video qualities (low-quality, medium-quality, high-quality).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceExtraSpecs   {
  @JsonProperty("qualityType")
  private VideoServiceExtraSpecsQualityType qualityType = null;

  public VideoServiceExtraSpecs qualityType(VideoServiceExtraSpecsQualityType qualityType) {
    this.qualityType = qualityType;
    return this;
  }

  /**
   * Get qualityType
   * @return qualityType
  */
  @ApiModelProperty(value = "")

  @Valid

  public VideoServiceExtraSpecsQualityType getQualityType() {
    return qualityType;
  }

  public void setQualityType(VideoServiceExtraSpecsQualityType qualityType) {
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
    VideoServiceExtraSpecs videoServiceExtraSpecs = (VideoServiceExtraSpecs) o;
    return Objects.equals(this.qualityType, videoServiceExtraSpecs.qualityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceExtraSpecs {\n");
    
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

