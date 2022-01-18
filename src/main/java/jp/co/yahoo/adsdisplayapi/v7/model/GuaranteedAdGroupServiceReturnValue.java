package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedAdGroupServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupServiceReturnValueオブジェクトは、予約型の広告グループの情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedAdGroupServiceReturnValue object contains information of guaranteed ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupServiceReturnValueオブジェクトは、予約型の広告グループの情報を格納するコンテナです。</div> <div lang=\"en\">GuaranteedAdGroupServiceReturnValue object contains information of guaranteed ad group.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<GuaranteedAdGroupServiceValue> values = null;

  public GuaranteedAdGroupServiceReturnValue values(List<GuaranteedAdGroupServiceValue> values) {
    this.values = values;
    return this;
  }

  public GuaranteedAdGroupServiceReturnValue addValuesItem(GuaranteedAdGroupServiceValue valuesItem) {
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

  public List<GuaranteedAdGroupServiceValue> getValues() {
    return values;
  }

  public void setValues(List<GuaranteedAdGroupServiceValue> values) {
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
    GuaranteedAdGroupServiceReturnValue guaranteedAdGroupServiceReturnValue = (GuaranteedAdGroupServiceReturnValue) o;
    return Objects.equals(this.values, guaranteedAdGroupServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupServiceReturnValue {\n");
    
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

