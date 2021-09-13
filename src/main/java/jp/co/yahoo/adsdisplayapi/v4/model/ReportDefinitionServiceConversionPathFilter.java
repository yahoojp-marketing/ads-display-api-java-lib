package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.ReportDefinitionServiceConversionPathFilterOperator;
import jp.co.yahoo.adsdisplayapi.v4.model.ReportDefinitionServiceConversionPathFilterType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceConversionPathFilterオブジェクトは、コンバージョン経路レポートのフィルタ条件を表します。&lt;br&gt;   複数指定した場合、AND条件になります。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceConversionPathFilter describes the filter condition of Conversion Path Report. &lt;br&gt;    If multiple values are specified, the condition will be \&quot;AND\&quot;. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceConversionPathFilterオブジェクトは、コンバージョン経路レポートのフィルタ条件を表します。<br>   複数指定した場合、AND条件になります。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathFilter describes the filter condition of Conversion Path Report. <br>    If multiple values are specified, the condition will be \"AND\". <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceConversionPathFilter   {
  @JsonProperty("conversionPathFilterType")
  private ReportDefinitionServiceConversionPathFilterType conversionPathFilterType = null;

  @JsonProperty("conversionPathFilterOperator")
  private ReportDefinitionServiceConversionPathFilterOperator conversionPathFilterOperator = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public ReportDefinitionServiceConversionPathFilter conversionPathFilterType(ReportDefinitionServiceConversionPathFilterType conversionPathFilterType) {
    this.conversionPathFilterType = conversionPathFilterType;
    return this;
  }

  /**
   * Get conversionPathFilterType
   * @return conversionPathFilterType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceConversionPathFilterType getConversionPathFilterType() {
    return conversionPathFilterType;
  }

  public void setConversionPathFilterType(ReportDefinitionServiceConversionPathFilterType conversionPathFilterType) {
    this.conversionPathFilterType = conversionPathFilterType;
  }

  public ReportDefinitionServiceConversionPathFilter conversionPathFilterOperator(ReportDefinitionServiceConversionPathFilterOperator conversionPathFilterOperator) {
    this.conversionPathFilterOperator = conversionPathFilterOperator;
    return this;
  }

  /**
   * Get conversionPathFilterOperator
   * @return conversionPathFilterOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceConversionPathFilterOperator getConversionPathFilterOperator() {
    return conversionPathFilterOperator;
  }

  public void setConversionPathFilterOperator(ReportDefinitionServiceConversionPathFilterOperator conversionPathFilterOperator) {
    this.conversionPathFilterOperator = conversionPathFilterOperator;
  }

  public ReportDefinitionServiceConversionPathFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ReportDefinitionServiceConversionPathFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">条件値です。複数指定した場合は、OR条件になります。</div> <div lang=\"en\">Condition value. If multiple values are specified, the condition will be \"OR\". </div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\">条件値です。複数指定した場合は、OR条件になります。</div> <div lang=\"en\">Condition value. If multiple values are specified, the condition will be \"OR\". </div> ")


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
    ReportDefinitionServiceConversionPathFilter reportDefinitionServiceConversionPathFilter = (ReportDefinitionServiceConversionPathFilter) o;
    return Objects.equals(this.conversionPathFilterType, reportDefinitionServiceConversionPathFilter.conversionPathFilterType) &&
        Objects.equals(this.conversionPathFilterOperator, reportDefinitionServiceConversionPathFilter.conversionPathFilterOperator) &&
        Objects.equals(this.values, reportDefinitionServiceConversionPathFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionPathFilterType, conversionPathFilterOperator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceConversionPathFilter {\n");
    
    sb.append("    conversionPathFilterType: ").append(toIndentedString(conversionPathFilterType)).append("\n");
    sb.append("    conversionPathFilterOperator: ").append(toIndentedString(conversionPathFilterOperator)).append("\n");
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

