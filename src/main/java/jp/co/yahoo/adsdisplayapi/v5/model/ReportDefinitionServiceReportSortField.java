package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceReportSortType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceReportSortFieldオブジェクトは、レポート定義のソート詳細を表します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceReportSortField object describes sort details of report definition.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceReportSortFieldオブジェクトは、レポート定義のソート詳細を表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> ReportDefinitionServiceReportSortField object describes sort details of report definition.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation. </div> ")

public class ReportDefinitionServiceReportSortField   {
  @JsonProperty("field")
  private JsonNullable<String> field = JsonNullable.undefined();

  @JsonProperty("reportSortType")
  private JsonNullable<ReportDefinitionServiceReportSortType> reportSortType = JsonNullable.undefined();

  public ReportDefinitionServiceReportSortField field(String field) {
    this.field = JsonNullable.of(field);
    return this;
  }

  /**
   * <div lang=\"ja\"> レポート定義のソート対象です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Sort object (field) of report definition.<br> This field is required in ADD operation. </div> 
   * @return field
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> レポート定義のソート対象です。<br> このフィールドは、ADD時に必須となります。 </div> <div lang=\"en\"> Sort object (field) of report definition.<br> This field is required in ADD operation. </div> ")


  public JsonNullable<String> getField() {
    return field;
  }

  public void setField(JsonNullable<String> field) {
    this.field = field;
  }

  public ReportDefinitionServiceReportSortField reportSortType(ReportDefinitionServiceReportSortType reportSortType) {
    this.reportSortType = JsonNullable.of(reportSortType);
    return this;
  }

  /**
   * Get reportSortType
   * @return reportSortType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceReportSortType> getReportSortType() {
    return reportSortType;
  }

  public void setReportSortType(JsonNullable<ReportDefinitionServiceReportSortType> reportSortType) {
    this.reportSortType = reportSortType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReportSortField reportDefinitionServiceReportSortField = (ReportDefinitionServiceReportSortField) o;
    return Objects.equals(this.field, reportDefinitionServiceReportSortField.field) &&
        Objects.equals(this.reportSortType, reportDefinitionServiceReportSortField.reportSortType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, reportSortType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportSortField {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    reportSortType: ").append(toIndentedString(reportSortType)).append("\n");
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

