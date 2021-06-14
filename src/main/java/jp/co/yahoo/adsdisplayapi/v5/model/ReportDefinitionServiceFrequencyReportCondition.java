package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceFrequencyRange;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceFrequencyReportConditionオブジェクトは、フリークエンシーレポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;FREQUENCY&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceFrequencyReportCondition describes the condition to create Frequency Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;    *If reportType is &lt;code&gt;FREQUENCY&lt;/code&gt;, this field is required in ADD operation.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceFrequencyReportConditionオブジェクトは、フリークエンシーレポートの作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、reportTypeが<code>FREQUENCY</code>の場合は必須です。 </div> <div lang=\"en\">   ReportDefinitionServiceFrequencyReportCondition describes the condition to create Frequency Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>    *If reportType is <code>FREQUENCY</code>, this field is required in ADD operation.  </div> ")

public class ReportDefinitionServiceFrequencyReportCondition   {
  @JsonProperty("frequencyRange")
  private JsonNullable<ReportDefinitionServiceFrequencyRange> frequencyRange = JsonNullable.undefined();

  public ReportDefinitionServiceFrequencyReportCondition frequencyRange(ReportDefinitionServiceFrequencyRange frequencyRange) {
    this.frequencyRange = JsonNullable.of(frequencyRange);
    return this;
  }

  /**
   * Get frequencyRange
   * @return frequencyRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceFrequencyRange> getFrequencyRange() {
    return frequencyRange;
  }

  public void setFrequencyRange(JsonNullable<ReportDefinitionServiceFrequencyRange> frequencyRange) {
    this.frequencyRange = frequencyRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceFrequencyReportCondition reportDefinitionServiceFrequencyReportCondition = (ReportDefinitionServiceFrequencyReportCondition) o;
    return Objects.equals(this.frequencyRange, reportDefinitionServiceFrequencyReportCondition.frequencyRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceFrequencyReportCondition {\n");
    
    sb.append("    frequencyRange: ").append(toIndentedString(frequencyRange)).append("\n");
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

