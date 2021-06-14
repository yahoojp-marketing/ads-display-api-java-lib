package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceConversionPathAccountSetting;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceConversionPathFilter;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceIncludeViewInteractionFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceConversionPathReportConditionオブジェクトは、コンバージョン経路レポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;CONVERSION_PATH&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceConversionPathReportCondition describes the condition to create Conversion Path Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If reportType is &lt;code&gt;CONVERSION_PATH&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceConversionPathReportConditionオブジェクトは、コンバージョン経路レポートの作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、reportTypeが<code>CONVERSION_PATH</code>の場合は必須です。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathReportCondition describes the condition to create Conversion Path Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If reportType is <code>CONVERSION_PATH</code>, this field is required in ADD operation. </div> ")

public class ReportDefinitionServiceConversionPathReportCondition   {
  @JsonProperty("lookbackWindow")
  private JsonNullable<Long> lookbackWindow = JsonNullable.undefined();

  @JsonProperty("includeViewInteraction")
  private JsonNullable<ReportDefinitionServiceIncludeViewInteractionFlg> includeViewInteraction = JsonNullable.undefined();

  @JsonProperty("conversionPathFilters")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceConversionPathFilter>> conversionPathFilters = JsonNullable.undefined();

  @JsonProperty("conversionPathAccountSetting")
  private JsonNullable<ReportDefinitionServiceConversionPathAccountSetting> conversionPathAccountSetting = JsonNullable.undefined();

  public ReportDefinitionServiceConversionPathReportCondition lookbackWindow(Long lookbackWindow) {
    this.lookbackWindow = JsonNullable.of(lookbackWindow);
    return this;
  }

  /**
   * <div lang=\"ja\">   ルックバック期間（日数）です。<br>   指定できる値の下限は0、上限は90です。<br>   このフィールドは、ADDに必須となります。 </div> <div lang=\"en\">   Look back period (number of days). <br>   The lower limit of the value that can be specified is 0, and the upper limit is 90.<br>   This field is required in ADD operation.  </div> 
   * @return lookbackWindow
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   ルックバック期間（日数）です。<br>   指定できる値の下限は0、上限は90です。<br>   このフィールドは、ADDに必須となります。 </div> <div lang=\"en\">   Look back period (number of days). <br>   The lower limit of the value that can be specified is 0, and the upper limit is 90.<br>   This field is required in ADD operation.  </div> ")


  public JsonNullable<Long> getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(JsonNullable<Long> lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  public ReportDefinitionServiceConversionPathReportCondition includeViewInteraction(ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction) {
    this.includeViewInteraction = JsonNullable.of(includeViewInteraction);
    return this;
  }

  /**
   * Get includeViewInteraction
   * @return includeViewInteraction
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceIncludeViewInteractionFlg> getIncludeViewInteraction() {
    return includeViewInteraction;
  }

  public void setIncludeViewInteraction(JsonNullable<ReportDefinitionServiceIncludeViewInteractionFlg> includeViewInteraction) {
    this.includeViewInteraction = includeViewInteraction;
  }

  public ReportDefinitionServiceConversionPathReportCondition conversionPathFilters(List<ReportDefinitionServiceConversionPathFilter> conversionPathFilters) {
    this.conversionPathFilters = JsonNullable.of(conversionPathFilters);
    return this;
  }

  public ReportDefinitionServiceConversionPathReportCondition addConversionPathFiltersItem(ReportDefinitionServiceConversionPathFilter conversionPathFiltersItem) {
    if (this.conversionPathFilters == null || !this.conversionPathFilters.isPresent()) {
      this.conversionPathFilters = JsonNullable.of(new ArrayList<>());
    }
    this.conversionPathFilters.get().add(conversionPathFiltersItem);
    return this;
  }

  /**
   * Get conversionPathFilters
   * @return conversionPathFilters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceConversionPathFilter>> getConversionPathFilters() {
    return conversionPathFilters;
  }

  public void setConversionPathFilters(JsonNullable<List<ReportDefinitionServiceConversionPathFilter>> conversionPathFilters) {
    this.conversionPathFilters = conversionPathFilters;
  }

  public ReportDefinitionServiceConversionPathReportCondition conversionPathAccountSetting(ReportDefinitionServiceConversionPathAccountSetting conversionPathAccountSetting) {
    this.conversionPathAccountSetting = JsonNullable.of(conversionPathAccountSetting);
    return this;
  }

  /**
   * Get conversionPathAccountSetting
   * @return conversionPathAccountSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceConversionPathAccountSetting> getConversionPathAccountSetting() {
    return conversionPathAccountSetting;
  }

  public void setConversionPathAccountSetting(JsonNullable<ReportDefinitionServiceConversionPathAccountSetting> conversionPathAccountSetting) {
    this.conversionPathAccountSetting = conversionPathAccountSetting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceConversionPathReportCondition reportDefinitionServiceConversionPathReportCondition = (ReportDefinitionServiceConversionPathReportCondition) o;
    return Objects.equals(this.lookbackWindow, reportDefinitionServiceConversionPathReportCondition.lookbackWindow) &&
        Objects.equals(this.includeViewInteraction, reportDefinitionServiceConversionPathReportCondition.includeViewInteraction) &&
        Objects.equals(this.conversionPathFilters, reportDefinitionServiceConversionPathReportCondition.conversionPathFilters) &&
        Objects.equals(this.conversionPathAccountSetting, reportDefinitionServiceConversionPathReportCondition.conversionPathAccountSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookbackWindow, includeViewInteraction, conversionPathFilters, conversionPathAccountSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceConversionPathReportCondition {\n");
    
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    includeViewInteraction: ").append(toIndentedString(includeViewInteraction)).append("\n");
    sb.append("    conversionPathFilters: ").append(toIndentedString(conversionPathFilters)).append("\n");
    sb.append("    conversionPathAccountSetting: ").append(toIndentedString(conversionPathAccountSetting)).append("\n");
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

