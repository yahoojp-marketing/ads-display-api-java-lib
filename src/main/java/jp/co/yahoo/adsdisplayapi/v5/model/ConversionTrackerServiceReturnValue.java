package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ConversionTrackerServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceReturnValueオブジェクトは、操作結果を含むコンバージョントラッカー情報のコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A container of ConversionTracker information includes operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceReturnValueオブジェクトは、操作結果を含むコンバージョントラッカー情報のコンテナです。</div> <div lang=\"en\">A container of ConversionTracker information includes operation results.</div> ")

public class ConversionTrackerServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<ConversionTrackerServiceValue>> values = JsonNullable.undefined();

  public ConversionTrackerServiceReturnValue values(List<ConversionTrackerServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public ConversionTrackerServiceReturnValue addValuesItem(ConversionTrackerServiceValue valuesItem) {
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

  public JsonNullable<List<ConversionTrackerServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<ConversionTrackerServiceValue>> values) {
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
    ConversionTrackerServiceReturnValue conversionTrackerServiceReturnValue = (ConversionTrackerServiceReturnValue) o;
    return Objects.equals(this.values, conversionTrackerServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceReturnValue {\n");
    
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

