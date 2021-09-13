package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceDateRangeオブジェクトは、レポートの集計対象期間を表します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; DateRangeTypeがCUSTOM_DATEの場合、必須項目です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The ReportDefinitionServiceDateRange object serves the report compilation target period. &lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt; This field is required if DateRangeType is set to &amp;#34;CUSTOM DATE&amp;#34;. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceDateRangeオブジェクトは、レポートの集計対象期間を表します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br> DateRangeTypeがCUSTOM_DATEの場合、必須項目です。 </div> <div lang=\"en\"> The ReportDefinitionServiceDateRange object serves the report compilation target period. <br> This field is optional in ADD operation, and will be ignored in REMOVE operation. <br> This field is required if DateRangeType is set to &#34;CUSTOM DATE&#34;. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceDateRange   {
  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public ReportDefinitionServiceDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 集計終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation end date. <br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 集計終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation end date. <br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ReportDefinitionServiceDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 集計開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation start date.<br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 集計開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> The compilation start date.<br> ∗ Format: yyyyMMdd<br> This field is required in ADD operation, and will be ignored in REMOVE operation. </div> ")


  public String getStartDate() {
    return startDate;
  }

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

