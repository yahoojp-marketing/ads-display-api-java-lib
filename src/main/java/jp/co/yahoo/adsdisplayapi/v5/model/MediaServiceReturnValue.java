package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.MediaServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MediaServiceReturnValueオブジェクトは、画像の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The MediaServiceReturnValue object is a container for storing media information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">MediaServiceReturnValueオブジェクトは、画像の情報を格納するコンテナです。</div> <div lang=\"en\">The MediaServiceReturnValue object is a container for storing media information.</div> ")

public class MediaServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<MediaServiceValue>> values = JsonNullable.undefined();

  public MediaServiceReturnValue values(List<MediaServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public MediaServiceReturnValue addValuesItem(MediaServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<MediaServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<MediaServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

