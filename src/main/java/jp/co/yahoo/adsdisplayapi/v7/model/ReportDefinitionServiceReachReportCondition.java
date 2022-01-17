package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinitionServiceFrequencyRange;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReachReportConditionオブジェクトは、リーチレポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;REACH&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReachReportCondition describes the condition to create Reach Report. &lt;br&gt;    This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;    *If reportType is &lt;code&gt;REACH&lt;/code&gt;, this field is required in ADD operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceReachReportConditionオブジェクトは、リーチレポートの作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、reportTypeが<code>REACH</code>の場合は必須です。 </div> <div lang=\"en\">   ReportDefinitionServiceReachReportCondition describes the condition to create Reach Report. <br>    This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>    *If reportType is <code>REACH</code>, this field is required in ADD operation.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReachReportCondition   {
  @JsonProperty("frequencyRange")
  private ReportDefinitionServiceFrequencyRange frequencyRange = null;

  public ReportDefinitionServiceReachReportCondition frequencyRange(ReportDefinitionServiceFrequencyRange frequencyRange) {
    this.frequencyRange = frequencyRange;
    return this;
  }

  /**
   * Get frequencyRange
   * @return frequencyRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceFrequencyRange getFrequencyRange() {
    return frequencyRange;
  }

  public void setFrequencyRange(ReportDefinitionServiceFrequencyRange frequencyRange) {
    this.frequencyRange = frequencyRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReachReportCondition reportDefinitionServiceReachReportCondition = (ReportDefinitionServiceReachReportCondition) o;
    return Objects.equals(this.frequencyRange, reportDefinitionServiceReachReportCondition.frequencyRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReachReportCondition {\n");
    
    sb.append("    frequencyRange: ").append(toIndentedString(frequencyRange)).append("\n");
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
