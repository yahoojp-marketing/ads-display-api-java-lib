package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.VideoServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;VideoServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;VideoServicePage object is a container that includes the execution result (list of all entities) of get methods.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">VideoServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">VideoServicePage object is a container that includes the execution result (list of all entities) of get methods.</div> ")

public class VideoServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<VideoServiceValue>> values = JsonNullable.undefined();

  public VideoServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * Get totalNumEntries
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public VideoServicePage values(List<VideoServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public VideoServicePage addValuesItem(VideoServiceValue valuesItem) {
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

  public JsonNullable<List<VideoServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<VideoServiceValue>> values) {
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
    VideoServicePage videoServicePage = (VideoServicePage) o;
    return Objects.equals(this.totalNumEntries, videoServicePage.totalNumEntries) &&
        Objects.equals(this.values, videoServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoServicePage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

