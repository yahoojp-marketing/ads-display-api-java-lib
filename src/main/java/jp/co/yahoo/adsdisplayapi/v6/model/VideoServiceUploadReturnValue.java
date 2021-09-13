package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.VideoServiceUploadValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VideoServiceUploadReturnValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceUploadReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<VideoServiceUploadValue> values = null;

  public VideoServiceUploadReturnValue values(List<VideoServiceUploadValue> values) {
    this.values = values;
    return this;
  }

  public VideoServiceUploadReturnValue addValuesItem(VideoServiceUploadValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VideoServiceUploadValue> getValues() {
    return values;
  }

  public void setValues(List<VideoServiceUploadValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoServiceUploadReturnValue videoServiceUploadReturnValue = (VideoServiceUploadReturnValue) o;
    return Objects.equals(this.values, videoServiceUploadReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceUploadReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

