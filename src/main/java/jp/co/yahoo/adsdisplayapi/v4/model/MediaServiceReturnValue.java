package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.MediaServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MediaServiceReturnValueオブジェクトは、画像の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The MediaServiceReturnValue object is a container for storing media information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">MediaServiceReturnValueオブジェクトは、画像の情報を格納するコンテナです。</div> <div lang=\"en\">The MediaServiceReturnValue object is a container for storing media information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MediaServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<MediaServiceValue> values = null;

  public MediaServiceReturnValue values(List<MediaServiceValue> values) {
    this.values = values;
    return this;
  }

  public MediaServiceReturnValue addValuesItem(MediaServiceValue valuesItem) {
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

  public List<MediaServiceValue> getValues() {
    return values;
  }

  public void setValues(List<MediaServiceValue> values) {
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
    MediaServiceReturnValue mediaServiceReturnValue = (MediaServiceReturnValue) o;
    return Objects.equals(this.values, mediaServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaServiceReturnValue {\n");
    
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

