package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.ReportDefinitionServiceFilterOperator;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceFilterオブジェクトは、フィルター定義を表します。&lt;br&gt; フィルタ条件は最大6つまで設定が可能です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceFilter object serves filter definitions. &lt;br&gt; Filter condition can set up to 6.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceFilterオブジェクトは、フィルター定義を表します。<br> フィルタ条件は最大6つまで設定が可能です。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceFilter object serves filter definitions. <br> Filter condition can set up to 6.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceFilter   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("filterOperator")
  private ReportDefinitionServiceFilterOperator filterOperator = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public ReportDefinitionServiceFilter field(String field) {
    this.field = field;
    return this;
  }

  /**
   * <div lang=\"ja\"> フィルター対象となるフィールドです。<br> このフィールドは、ADD時に必須となります。<br> ※getReportFieldsのレスポンスで「filterable=true」のフィールドのみ指定可能です。 </div> <div lang=\"en\"> Field to be filtered.<br> This field is required in ADD operation.<br> ※Can be specified for the field with &#34;filterable=true&#34; on the response of getReportFields. </div> 
   * @return field
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> フィルター対象となるフィールドです。<br> このフィールドは、ADD時に必須となります。<br> ※getReportFieldsのレスポンスで「filterable=true」のフィールドのみ指定可能です。 </div> <div lang=\"en\"> Field to be filtered.<br> This field is required in ADD operation.<br> ※Can be specified for the field with &#34;filterable=true&#34; on the response of getReportFields. </div> ")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ReportDefinitionServiceFilter filterOperator(ReportDefinitionServiceFilterOperator filterOperator) {
    this.filterOperator = filterOperator;
    return this;
  }

  /**
   * Get filterOperator
   * @return filterOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceFilterOperator getFilterOperator() {
    return filterOperator;
  }

  public void setFilterOperator(ReportDefinitionServiceFilterOperator filterOperator) {
    this.filterOperator = filterOperator;
  }

  public ReportDefinitionServiceFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ReportDefinitionServiceFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 条件値です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Value for condition. <br> This field is required in ADD operation. </div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 条件値です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Value for condition. <br> This field is required in ADD operation. </div> ")


  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    ReportDefinitionServiceFilter reportDefinitionServiceFilter = (ReportDefinitionServiceFilter) o;
    return Objects.equals(this.field, reportDefinitionServiceFilter.field) &&
        Objects.equals(this.filterOperator, reportDefinitionServiceFilter.filterOperator) &&
        Objects.equals(this.values, reportDefinitionServiceFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, filterOperator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filterOperator: ").append(toIndentedString(filterOperator)).append("\n");
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

