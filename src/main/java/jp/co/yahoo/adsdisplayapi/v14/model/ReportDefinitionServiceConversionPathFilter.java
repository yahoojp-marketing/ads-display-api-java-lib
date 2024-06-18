/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.ReportDefinitionServiceConversionPathFilterOperator;
import jp.co.yahoo.adsdisplayapi.v14.model.ReportDefinitionServiceConversionPathFilterType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceConversionPathFilterオブジェクトは、コンバージョン経路レポートのフィルタ条件を表します。&lt;br&gt;   複数指定した場合、AND条件になります。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceConversionPathFilter describes the filter condition of Conversion Path Report. &lt;br&gt;    If multiple values are specified, the condition will be \&quot;AND.\&quot; &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceConversionPathFilterオブジェクトは、コンバージョン経路レポートのフィルタ条件を表します。<br>   複数指定した場合、AND条件になります。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathFilter describes the filter condition of Conversion Path Report. <br>    If multiple values are specified, the condition will be \"AND.\" <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation.  </div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceConversionPathFilter.JSON_PROPERTY_CONVERSION_PATH_FILTER_TYPE,
  ReportDefinitionServiceConversionPathFilter.JSON_PROPERTY_CONVERSION_PATH_FILTER_OPERATOR,
  ReportDefinitionServiceConversionPathFilter.JSON_PROPERTY_VALUES
})
@JsonTypeName("ReportDefinitionServiceConversionPathFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceConversionPathFilter {
  public static final String JSON_PROPERTY_CONVERSION_PATH_FILTER_TYPE = "conversionPathFilterType";
  private ReportDefinitionServiceConversionPathFilterType conversionPathFilterType;

  public static final String JSON_PROPERTY_CONVERSION_PATH_FILTER_OPERATOR = "conversionPathFilterOperator";
  private ReportDefinitionServiceConversionPathFilterOperator conversionPathFilterOperator;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public ReportDefinitionServiceConversionPathFilter() { 
  }

  public ReportDefinitionServiceConversionPathFilter conversionPathFilterType(ReportDefinitionServiceConversionPathFilterType conversionPathFilterType) {
    
    this.conversionPathFilterType = conversionPathFilterType;
    return this;
  }

   /**
   * Get conversionPathFilterType
   * @return conversionPathFilterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceConversionPathFilterType getConversionPathFilterType() {
    return conversionPathFilterType;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceConversionPathFilterOperator getConversionPathFilterOperator() {
    return conversionPathFilterOperator;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;条件値です。複数指定した場合は、OR条件になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Condition value. If multiple values are specified, the condition will be \&quot;OR.\&quot; &lt;/div&gt; 
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">条件値です。複数指定した場合は、OR条件になります。</div> <div lang=\"en\">Condition value. If multiple values are specified, the condition will be \"OR.\" </div> ")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

