/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

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
import jp.co.yahoo.adsdisplayapi.v8.model.ReportDefinitionServiceFilterOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceFilterオブジェクトは、フィルター定義を表します。&lt;br&gt; フィルタ条件は最大6つまで設定が可能です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceFilter object serves filter definitions. &lt;br&gt; Filter condition can set up to 6.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceFilterオブジェクトは、フィルター定義を表します。<br> フィルタ条件は最大6つまで設定が可能です。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceFilter object serves filter definitions. <br> Filter condition can set up to 6.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceFilter.JSON_PROPERTY_FIELD,
  ReportDefinitionServiceFilter.JSON_PROPERTY_FILTER_OPERATOR,
  ReportDefinitionServiceFilter.JSON_PROPERTY_VALUES
})
@JsonTypeName("ReportDefinitionServiceFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceFilter {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FILTER_OPERATOR = "filterOperator";
  private ReportDefinitionServiceFilterOperator filterOperator;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public ReportDefinitionServiceFilter() { 
  }

  public ReportDefinitionServiceFilter field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; フィルター対象となるフィールドです。&lt;br&gt; このフィールドは、ADD時に必須となります。&lt;br&gt; ※getReportFieldsのレスポンスで「filterable&#x3D;true」のフィールドのみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Field to be filtered.&lt;br&gt; This field is required in ADD operation.&lt;br&gt; ※Can be specified for the field with &amp;#34;filterable&#x3D;true&amp;#34; on the response of getReportFields. &lt;/div&gt; 
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> フィルター対象となるフィールドです。<br> このフィールドは、ADD時に必須となります。<br> ※getReportFieldsのレスポンスで「filterable=true」のフィールドのみ指定可能です。 </div> <div lang=\"en\"> Field to be filtered.<br> This field is required in ADD operation.<br> ※Can be specified for the field with &#34;filterable=true&#34; on the response of getReportFields. </div> ")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceFilterOperator getFilterOperator() {
    return filterOperator;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 条件値です。&lt;br&gt; このフィールドは、ADD時に必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Value for condition. &lt;br&gt; This field is required in ADD operation. &lt;/div&gt; 
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 条件値です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Value for condition. <br> This field is required in ADD operation. </div> ")
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

