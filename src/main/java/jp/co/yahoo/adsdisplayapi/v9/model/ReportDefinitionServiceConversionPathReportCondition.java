/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

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
import jp.co.yahoo.adsdisplayapi.v9.model.ReportDefinitionServiceConversionPathAccountSetting;
import jp.co.yahoo.adsdisplayapi.v9.model.ReportDefinitionServiceConversionPathFilter;
import jp.co.yahoo.adsdisplayapi.v9.model.ReportDefinitionServiceIncludeViewInteractionFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceConversionPathReportConditionオブジェクトは、コンバージョン経路レポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;CONVERSION_PATH&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceConversionPathReportCondition describes the condition to create Conversion Path Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If reportType is &lt;code&gt;CONVERSION_PATH&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   ReportDefinitionServiceConversionPathReportConditionオブジェクトは、コンバージョン経路レポートの作成条件を表します。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、reportTypeが<code>CONVERSION_PATH</code>の場合は必須です。 </div> <div lang=\"en\">   ReportDefinitionServiceConversionPathReportCondition describes the condition to create Conversion Path Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If reportType is <code>CONVERSION_PATH</code>, this field is required in ADD operation. </div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceConversionPathReportCondition.JSON_PROPERTY_LOOKBACK_WINDOW,
  ReportDefinitionServiceConversionPathReportCondition.JSON_PROPERTY_INCLUDE_VIEW_INTERACTION,
  ReportDefinitionServiceConversionPathReportCondition.JSON_PROPERTY_CONVERSION_PATH_FILTERS,
  ReportDefinitionServiceConversionPathReportCondition.JSON_PROPERTY_CONVERSION_PATH_ACCOUNT_SETTING
})
@JsonTypeName("ReportDefinitionServiceConversionPathReportCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceConversionPathReportCondition {
  public static final String JSON_PROPERTY_LOOKBACK_WINDOW = "lookbackWindow";
  private Long lookbackWindow;

  public static final String JSON_PROPERTY_INCLUDE_VIEW_INTERACTION = "includeViewInteraction";
  private ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction;

  public static final String JSON_PROPERTY_CONVERSION_PATH_FILTERS = "conversionPathFilters";
  private List<ReportDefinitionServiceConversionPathFilter> conversionPathFilters = null;

  public static final String JSON_PROPERTY_CONVERSION_PATH_ACCOUNT_SETTING = "conversionPathAccountSetting";
  private ReportDefinitionServiceConversionPathAccountSetting conversionPathAccountSetting;

  public ReportDefinitionServiceConversionPathReportCondition() { 
  }

  public ReportDefinitionServiceConversionPathReportCondition lookbackWindow(Long lookbackWindow) {
    
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ルックバック期間（日数）です。&lt;br&gt;   指定できる値の下限は0、上限は90です。&lt;br&gt;   このフィールドは、ADDに必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Look back period (number of days). &lt;br&gt;   The lower limit of the value that can be specified is 0, and the upper limit is 90.&lt;br&gt;   This field is required in ADD operation.  &lt;/div&gt; 
   * @return lookbackWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   ルックバック期間（日数）です。<br>   指定できる値の下限は0、上限は90です。<br>   このフィールドは、ADDに必須となります。 </div> <div lang=\"en\">   Look back period (number of days). <br>   The lower limit of the value that can be specified is 0, and the upper limit is 90.<br>   This field is required in ADD operation.  </div> ")
  @JsonProperty(JSON_PROPERTY_LOOKBACK_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLookbackWindow() {
    return lookbackWindow;
  }


  @JsonProperty(JSON_PROPERTY_LOOKBACK_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookbackWindow(Long lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }


  public ReportDefinitionServiceConversionPathReportCondition includeViewInteraction(ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction) {
    
    this.includeViewInteraction = includeViewInteraction;
    return this;
  }

   /**
   * Get includeViewInteraction
   * @return includeViewInteraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_VIEW_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceIncludeViewInteractionFlg getIncludeViewInteraction() {
    return includeViewInteraction;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_VIEW_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeViewInteraction(ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction) {
    this.includeViewInteraction = includeViewInteraction;
  }


  public ReportDefinitionServiceConversionPathReportCondition conversionPathFilters(List<ReportDefinitionServiceConversionPathFilter> conversionPathFilters) {
    
    this.conversionPathFilters = conversionPathFilters;
    return this;
  }

  public ReportDefinitionServiceConversionPathReportCondition addConversionPathFiltersItem(ReportDefinitionServiceConversionPathFilter conversionPathFiltersItem) {
    if (this.conversionPathFilters == null) {
      this.conversionPathFilters = new ArrayList<>();
    }
    this.conversionPathFilters.add(conversionPathFiltersItem);
    return this;
  }

   /**
   * Get conversionPathFilters
   * @return conversionPathFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceConversionPathFilter> getConversionPathFilters() {
    return conversionPathFilters;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionPathFilters(List<ReportDefinitionServiceConversionPathFilter> conversionPathFilters) {
    this.conversionPathFilters = conversionPathFilters;
  }


  public ReportDefinitionServiceConversionPathReportCondition conversionPathAccountSetting(ReportDefinitionServiceConversionPathAccountSetting conversionPathAccountSetting) {
    
    this.conversionPathAccountSetting = conversionPathAccountSetting;
    return this;
  }

   /**
   * Get conversionPathAccountSetting
   * @return conversionPathAccountSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_ACCOUNT_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceConversionPathAccountSetting getConversionPathAccountSetting() {
    return conversionPathAccountSetting;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_PATH_ACCOUNT_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionPathAccountSetting(ReportDefinitionServiceConversionPathAccountSetting conversionPathAccountSetting) {
    this.conversionPathAccountSetting = conversionPathAccountSetting;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

