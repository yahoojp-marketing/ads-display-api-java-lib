package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReturnValueオブジェクトは、操作結果を含むレポート定義のコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The ReportDefinitionServiceReturnValue object is a container that holds report definitions, including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReturnValueオブジェクトは、操作結果を含むレポート定義のコンテナです。</div> <div lang=\"en\">The ReportDefinitionServiceReturnValue object is a container that holds report definitions, including operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<ReportDefinitionServiceValue> values = null;

  public ReportDefinitionServiceReturnValue values(List<ReportDefinitionServiceValue> values) {
    this.values = values;
    return this;
  }

  public ReportDefinitionServiceReturnValue addValuesItem(ReportDefinitionServiceValue valuesItem) {
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

  public List<ReportDefinitionServiceValue> getValues() {
    return values;
  }

  public void setValues(List<ReportDefinitionServiceValue> values) {
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
    ReportDefinitionServiceReturnValue reportDefinitionServiceReturnValue = (ReportDefinitionServiceReturnValue) o;
    return Objects.equals(this.values, reportDefinitionServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReturnValue {\n");
    
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

