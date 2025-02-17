/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v16.model.ReportDefinitionServiceAttributionModel;
import jp.co.yahoo.adsdisplayapi.v16.model.ReportDefinitionServiceIncludeVideoInteractionFlg;
import jp.co.yahoo.adsdisplayapi.v16.model.ReportDefinitionServiceIncludeViewInteractionFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ReportDefinitionServiceModelComparisonReportConditionオブジェクトは、アトリビューションモデル比較レポートの作成条件を表します。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、reportTypeが&lt;code&gt;MODEL_COMPARISON&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   ReportDefinitionServiceModelComparisonReportCondition describes the condition to create Attribution Model Comparison Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If reportType is &lt;code&gt;MODEL_COMPARISON&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceModelComparisonReportCondition.JSON_PROPERTY_LOOKBACK_WINDOW,
  ReportDefinitionServiceModelComparisonReportCondition.JSON_PROPERTY_INCLUDE_VIEW_INTERACTION,
  ReportDefinitionServiceModelComparisonReportCondition.JSON_PROPERTY_INCLUDE_VIDEO_INTERACTION,
  ReportDefinitionServiceModelComparisonReportCondition.JSON_PROPERTY_BASE_MODEL,
  ReportDefinitionServiceModelComparisonReportCondition.JSON_PROPERTY_COMPARATIVE_MODEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceModelComparisonReportCondition {
  public static final String JSON_PROPERTY_LOOKBACK_WINDOW = "lookbackWindow";
  private Long lookbackWindow;

  public static final String JSON_PROPERTY_INCLUDE_VIEW_INTERACTION = "includeViewInteraction";
  private ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction;

  public static final String JSON_PROPERTY_INCLUDE_VIDEO_INTERACTION = "includeVideoInteraction";
  private ReportDefinitionServiceIncludeVideoInteractionFlg includeVideoInteraction;

  public static final String JSON_PROPERTY_BASE_MODEL = "baseModel";
  private ReportDefinitionServiceAttributionModel baseModel;

  public static final String JSON_PROPERTY_COMPARATIVE_MODEL = "comparativeModel";
  private ReportDefinitionServiceAttributionModel comparativeModel;

  public ReportDefinitionServiceModelComparisonReportCondition() {
  }

  public ReportDefinitionServiceModelComparisonReportCondition lookbackWindow(Long lookbackWindow) {
    
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ルックバック期間（日数）です。&lt;br&gt;   指定できる値の下限は0、上限は90です。&lt;br&gt;   このフィールドは、ADDに必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Look back period (number of days). &lt;br&gt;   The lower limit of the value that can be specified is 0, and the upper limit is 90.&lt;br&gt;   This field is required in ADD operation.  &lt;/div&gt; 
   * @return lookbackWindow
  **/
  @jakarta.annotation.Nullable
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


  public ReportDefinitionServiceModelComparisonReportCondition includeViewInteraction(ReportDefinitionServiceIncludeViewInteractionFlg includeViewInteraction) {
    
    this.includeViewInteraction = includeViewInteraction;
    return this;
  }

   /**
   * Get includeViewInteraction
   * @return includeViewInteraction
  **/
  @jakarta.annotation.Nullable
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


  public ReportDefinitionServiceModelComparisonReportCondition includeVideoInteraction(ReportDefinitionServiceIncludeVideoInteractionFlg includeVideoInteraction) {
    
    this.includeVideoInteraction = includeVideoInteraction;
    return this;
  }

   /**
   * Get includeVideoInteraction
   * @return includeVideoInteraction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_VIDEO_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceIncludeVideoInteractionFlg getIncludeVideoInteraction() {
    return includeVideoInteraction;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_VIDEO_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeVideoInteraction(ReportDefinitionServiceIncludeVideoInteractionFlg includeVideoInteraction) {
    this.includeVideoInteraction = includeVideoInteraction;
  }


  public ReportDefinitionServiceModelComparisonReportCondition baseModel(ReportDefinitionServiceAttributionModel baseModel) {
    
    this.baseModel = baseModel;
    return this;
  }

   /**
   * Get baseModel
   * @return baseModel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceAttributionModel getBaseModel() {
    return baseModel;
  }


  @JsonProperty(JSON_PROPERTY_BASE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseModel(ReportDefinitionServiceAttributionModel baseModel) {
    this.baseModel = baseModel;
  }


  public ReportDefinitionServiceModelComparisonReportCondition comparativeModel(ReportDefinitionServiceAttributionModel comparativeModel) {
    
    this.comparativeModel = comparativeModel;
    return this;
  }

   /**
   * Get comparativeModel
   * @return comparativeModel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARATIVE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceAttributionModel getComparativeModel() {
    return comparativeModel;
  }


  @JsonProperty(JSON_PROPERTY_COMPARATIVE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparativeModel(ReportDefinitionServiceAttributionModel comparativeModel) {
    this.comparativeModel = comparativeModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceModelComparisonReportCondition reportDefinitionServiceModelComparisonReportCondition = (ReportDefinitionServiceModelComparisonReportCondition) o;
    return Objects.equals(this.lookbackWindow, reportDefinitionServiceModelComparisonReportCondition.lookbackWindow) &&
        Objects.equals(this.includeViewInteraction, reportDefinitionServiceModelComparisonReportCondition.includeViewInteraction) &&
        Objects.equals(this.includeVideoInteraction, reportDefinitionServiceModelComparisonReportCondition.includeVideoInteraction) &&
        Objects.equals(this.baseModel, reportDefinitionServiceModelComparisonReportCondition.baseModel) &&
        Objects.equals(this.comparativeModel, reportDefinitionServiceModelComparisonReportCondition.comparativeModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookbackWindow, includeViewInteraction, includeVideoInteraction, baseModel, comparativeModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceModelComparisonReportCondition {\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    includeViewInteraction: ").append(toIndentedString(includeViewInteraction)).append("\n");
    sb.append("    includeVideoInteraction: ").append(toIndentedString(includeVideoInteraction)).append("\n");
    sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
    sb.append("    comparativeModel: ").append(toIndentedString(comparativeModel)).append("\n");
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

