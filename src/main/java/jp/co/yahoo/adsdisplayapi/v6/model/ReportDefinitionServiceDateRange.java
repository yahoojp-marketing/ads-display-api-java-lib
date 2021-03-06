/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceDateRangeオブジェクトは、レポートの集計対象期間を表します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; DateRangeTypeがCUSTOM_DATEの場合、必須項目です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The ReportDefinitionServiceDateRange object serves the report compilation target period. &lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt; This field is required if DateRangeType is set to &amp;#34;CUSTOM DATE&amp;#34;. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceDateRangeオブジェクトは、レポートの集計対象期間を表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br> DateRangeTypeがCUSTOM_DATEの場合、必須項目です。 </div> <div lang=\"en\"> The ReportDefinitionServiceDateRange object serves the report compilation target period. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. <br> This field is required if DateRangeType is set to &#34;CUSTOM DATE&#34;. </div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceDateRange.JSON_PROPERTY_END_DATE,
  ReportDefinitionServiceDateRange.JSON_PROPERTY_START_DATE
})
@JsonTypeName("ReportDefinitionServiceDateRange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceDateRange {
  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public ReportDefinitionServiceDateRange() { 
  }

  public ReportDefinitionServiceDateRange endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 集計終了日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The compilation end date. &lt;br&gt; ∗ Format: yyyyMMdd&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 集計終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation end date. <br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ReportDefinitionServiceDateRange startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 集計開始日です。&lt;br&gt; ※フォーマット：yyyyMMdd&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The compilation start date.&lt;br&gt; ∗ Format: yyyyMMdd&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 集計開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation start date.<br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceDateRange reportDefinitionServiceDateRange = (ReportDefinitionServiceDateRange) o;
    return Objects.equals(this.endDate, reportDefinitionServiceDateRange.endDate) &&
        Objects.equals(this.startDate, reportDefinitionServiceDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceDateRange {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

