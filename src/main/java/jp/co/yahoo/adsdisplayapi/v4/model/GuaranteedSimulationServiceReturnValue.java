package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceReturnValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーションを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceReturnValue object contains the guaranteed campaign delivery simulation including the operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceReturnValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーションを格納するコンテナです。</div> <div lang=\"en\">GuaranteedSimulationServiceReturnValue object contains the guaranteed campaign delivery simulation including the operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<GuaranteedSimulationServiceValue> values = null;

  public GuaranteedSimulationServiceReturnValue values(List<GuaranteedSimulationServiceValue> values) {
    this.values = values;
    return this;
  }

  public GuaranteedSimulationServiceReturnValue addValuesItem(GuaranteedSimulationServiceValue valuesItem) {
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

  public List<GuaranteedSimulationServiceValue> getValues() {
    return values;
  }

  public void setValues(List<GuaranteedSimulationServiceValue> values) {
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
    GuaranteedSimulationServiceReturnValue guaranteedSimulationServiceReturnValue = (GuaranteedSimulationServiceReturnValue) o;
    return Objects.equals(this.values, guaranteedSimulationServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceReturnValue {\n");
    
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

