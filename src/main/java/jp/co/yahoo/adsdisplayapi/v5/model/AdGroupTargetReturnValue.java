package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupTargetReturnValueオブジェクトは、mutateメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupTargetReturnValue object contains the results (a list of all entities) for mutate method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupTargetReturnValueオブジェクトは、mutateメソッドの実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">The AdGroupTargetReturnValue object contains the results (a list of all entities) for mutate method.</div> ")

public class AdGroupTargetReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AdGroupTargetServiceValue>> values = JsonNullable.undefined();

  public AdGroupTargetReturnValue values(List<AdGroupTargetServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AdGroupTargetReturnValue addValuesItem(AdGroupTargetServiceValue valuesItem) {
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

  public JsonNullable<List<AdGroupTargetServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AdGroupTargetServiceValue>> values) {
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
    AdGroupTargetReturnValue adGroupTargetReturnValue = (AdGroupTargetReturnValue) o;
    return Objects.equals(this.values, adGroupTargetReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetReturnValue {\n");
    
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

