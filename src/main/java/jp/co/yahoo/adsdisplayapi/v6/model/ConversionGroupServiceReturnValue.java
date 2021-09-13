package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ConversionGroupServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceReturnValueオブジェクトは、操作結果を含むコンバージョングループ情報のコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A container of ConversionGroup information includes operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionGroupServiceReturnValueオブジェクトは、操作結果を含むコンバージョングループ情報のコンテナです。</div> <div lang=\"en\">A container of ConversionGroup information includes operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionGroupServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<ConversionGroupServiceValue> values = null;

  public ConversionGroupServiceReturnValue values(List<ConversionGroupServiceValue> values) {
    this.values = values;
    return this;
  }

  public ConversionGroupServiceReturnValue addValuesItem(ConversionGroupServiceValue valuesItem) {
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

  public List<ConversionGroupServiceValue> getValues() {
    return values;
  }

  public void setValues(List<ConversionGroupServiceValue> values) {
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
    ConversionGroupServiceReturnValue conversionGroupServiceReturnValue = (ConversionGroupServiceReturnValue) o;
    return Objects.equals(this.values, conversionGroupServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceReturnValue {\n");
    
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

