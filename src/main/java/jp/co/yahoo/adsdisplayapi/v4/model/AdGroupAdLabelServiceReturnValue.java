package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdLabelServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdLabelServiceReturnValueオブジェクトは、広告のラベル情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdLabelServiceReturnValue object describes value returned as operation result including ad group ad label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdLabelServiceReturnValueオブジェクトは、広告のラベル情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">AdGroupAdLabelServiceReturnValue object describes value returned as operation result including ad group ad label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdLabelServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupAdLabelServiceValue> values = null;

  public AdGroupAdLabelServiceReturnValue values(List<AdGroupAdLabelServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupAdLabelServiceReturnValue addValuesItem(AdGroupAdLabelServiceValue valuesItem) {
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

  public List<AdGroupAdLabelServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupAdLabelServiceValue> values) {
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
    AdGroupAdLabelServiceReturnValue adGroupAdLabelServiceReturnValue = (AdGroupAdLabelServiceReturnValue) o;
    return Objects.equals(this.values, adGroupAdLabelServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdLabelServiceReturnValue {\n");
    
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

