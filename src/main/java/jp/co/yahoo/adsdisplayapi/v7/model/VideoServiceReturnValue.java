package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.VideoServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServiceReturnValueオブジェクトは、メソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServiceReturnValue object stores operation results (list of all entities) of method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServiceReturnValueオブジェクトは、メソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">VideoServiceReturnValue object stores operation results (list of all entities) of method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VideoServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<VideoServiceValue> values = null;

  public VideoServiceReturnValue values(List<VideoServiceValue> values) {
    this.values = values;
    return this;
  }

  public VideoServiceReturnValue addValuesItem(VideoServiceValue valuesItem) {
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

  public List<VideoServiceValue> getValues() {
    return values;
  }

  public void setValues(List<VideoServiceValue> values) {
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
    VideoServiceReturnValue videoServiceReturnValue = (VideoServiceReturnValue) o;
    return Objects.equals(this.values, videoServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServiceReturnValue {\n");
    
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

