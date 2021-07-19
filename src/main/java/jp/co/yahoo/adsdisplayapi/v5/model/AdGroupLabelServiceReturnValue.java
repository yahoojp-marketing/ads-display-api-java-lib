package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupLabelServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupLabelServiceReturnValueオブジェクトは、広告グループのラベル情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupLabelServiceReturnValue object describes value returned as operation result including ad group label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupLabelServiceReturnValueオブジェクトは、広告グループのラベル情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">AdGroupLabelServiceReturnValue object describes value returned as operation result including ad group label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupLabelServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupLabelServiceValue> values = null;

  public AdGroupLabelServiceReturnValue values(List<AdGroupLabelServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupLabelServiceReturnValue addValuesItem(AdGroupLabelServiceValue valuesItem) {
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

  public List<AdGroupLabelServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupLabelServiceValue> values) {
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
    AdGroupLabelServiceReturnValue adGroupLabelServiceReturnValue = (AdGroupLabelServiceReturnValue) o;
    return Objects.equals(this.values, adGroupLabelServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupLabelServiceReturnValue {\n");
    
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

