/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v15.model.ReportDefinitionServiceFrequencyRange;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceReachReportConditionオブジェクトは、リーチレポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;REACH&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceReachReportCondition describes the condition to create Reach Report. &lt;br&gt;    This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;    *If reportType is &lt;code&gt;REACH&lt;/code&gt;, this field is required in ADD operation.  &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceReachReportCondition.JSON_PROPERTY_FREQUENCY_RANGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceReachReportCondition {
  public static final String JSON_PROPERTY_FREQUENCY_RANGE = "frequencyRange";
  private ReportDefinitionServiceFrequencyRange frequencyRange;

  public ReportDefinitionServiceReachReportCondition() {
  }

  public ReportDefinitionServiceReachReportCondition frequencyRange(ReportDefinitionServiceFrequencyRange frequencyRange) {
    
    this.frequencyRange = frequencyRange;
    return this;
  }

   /**
   * Get frequencyRange
   * @return frequencyRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceFrequencyRange getFrequencyRange() {
    return frequencyRange;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

