package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.PlacementUrlListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PlacementUrlListServiceReturnValueオブジェクトは、メソッドの実行結果（全Entityのリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The objects to keep execution result of method (All Entity list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PlacementUrlListServiceReturnValueオブジェクトは、メソッドの実行結果（全Entityのリスト）を保持するオブジェクトです。</div> <div lang=\"en\">The objects to keep execution result of method (All Entity list).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlacementUrlListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<PlacementUrlListServiceValue> values = null;

  public PlacementUrlListServiceReturnValue values(List<PlacementUrlListServiceValue> values) {
    this.values = values;
    return this;
  }

  public PlacementUrlListServiceReturnValue addValuesItem(PlacementUrlListServiceValue valuesItem) {
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

  public List<PlacementUrlListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<PlacementUrlListServiceValue> values) {
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
    PlacementUrlListServiceReturnValue placementUrlListServiceReturnValue = (PlacementUrlListServiceReturnValue) o;
    return Objects.equals(this.values, placementUrlListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementUrlListServiceReturnValue {\n");
    
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

