/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v17.model.ConversionTrackerServicePeriod;
import jp.co.yahoo.adsdisplayapi.v17.model.ConversionTrackerServiceValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePageオブジェクトは、getメソッドの実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePage object contains the results (a list of all entities) for get method.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServicePage.JSON_PROPERTY_PERIOD,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_ALL_CONVERSION_VALUE,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_ALL_CONVERSIONS,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_CONVERSION_VALUE,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_CONVERSION_VALUE_VIA_AD_CLICK,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_CONVERSIONS,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_CONVERSIONS_VIA_AD_CLICK,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_CROSS_DEVICE_CONVERSIONS,
  ConversionTrackerServicePage.JSON_PROPERTY_TOTAL_NUM_ENTRIES,
  ConversionTrackerServicePage.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServicePage {
  public static final String JSON_PROPERTY_PERIOD = "period";
  private ConversionTrackerServicePeriod period;

  public static final String JSON_PROPERTY_TOTAL_ALL_CONVERSION_VALUE = "totalAllConversionValue";
  private String totalAllConversionValue;

  public static final String JSON_PROPERTY_TOTAL_ALL_CONVERSIONS = "totalAllConversions";
  private Long totalAllConversions;

  public static final String JSON_PROPERTY_TOTAL_CONVERSION_VALUE = "totalConversionValue";
  private String totalConversionValue;

  public static final String JSON_PROPERTY_TOTAL_CONVERSION_VALUE_VIA_AD_CLICK = "totalConversionValueViaAdClick";
  private String totalConversionValueViaAdClick;

  public static final String JSON_PROPERTY_TOTAL_CONVERSIONS = "totalConversions";
  private Long totalConversions;

  public static final String JSON_PROPERTY_TOTAL_CONVERSIONS_VIA_AD_CLICK = "totalConversionsViaAdClick";
  private Long totalConversionsViaAdClick;

  public static final String JSON_PROPERTY_TOTAL_CROSS_DEVICE_CONVERSIONS = "totalCrossDeviceConversions";
  private Long totalCrossDeviceConversions;

  public static final String JSON_PROPERTY_TOTAL_NUM_ENTRIES = "totalNumEntries";
  private Integer totalNumEntries;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<ConversionTrackerServiceValue> values;

  public ConversionTrackerServicePage() {
  }

  public ConversionTrackerServicePage period(ConversionTrackerServicePeriod period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServicePeriod getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(ConversionTrackerServicePeriod period) {
    this.period = period;
  }


  public ConversionTrackerServicePage totalAllConversionValue(String totalAllConversionValue) {
    
    this.totalAllConversionValue = totalAllConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンの価値（全て）の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conv. value (all).&lt;/div&gt; 
   * @return totalAllConversionValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAllConversionValue() {
    return totalAllConversionValue;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
  }


  public ConversionTrackerServicePage totalAllConversions(Long totalAllConversions) {
    
    this.totalAllConversions = totalAllConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数（全て）の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conversions (all).&lt;/div&gt; 
   * @return totalAllConversions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalAllConversions() {
    return totalAllConversions;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
  }


  public ConversionTrackerServicePage totalConversionValue(String totalConversionValue) {
    
    this.totalConversionValue = totalConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンの価値の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conv. value.&lt;/div&gt; 
   * @return totalConversionValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalConversionValue() {
    return totalConversionValue;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
  }


  public ConversionTrackerServicePage totalConversionValueViaAdClick(String totalConversionValueViaAdClick) {
    
    this.totalConversionValueViaAdClick = totalConversionValueViaAdClick;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンの価値の合計（クリック経由）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conv. value (via click).&lt;/div&gt; 
   * @return totalConversionValueViaAdClick
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSION_VALUE_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalConversionValueViaAdClick() {
    return totalConversionValueViaAdClick;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSION_VALUE_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalConversionValueViaAdClick(String totalConversionValueViaAdClick) {
    this.totalConversionValueViaAdClick = totalConversionValueViaAdClick;
  }


  public ConversionTrackerServicePage totalConversions(Long totalConversions) {
    
    this.totalConversions = totalConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conversions.&lt;/div&gt; 
   * @return totalConversions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalConversions() {
    return totalConversions;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
  }


  public ConversionTrackerServicePage totalConversionsViaAdClick(Long totalConversionsViaAdClick) {
    
    this.totalConversionsViaAdClick = totalConversionsViaAdClick;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数の合計（クリック経由）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of conversions (via click).&lt;/div&gt; 
   * @return totalConversionsViaAdClick
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSIONS_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalConversionsViaAdClick() {
    return totalConversionsViaAdClick;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CONVERSIONS_VIA_AD_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalConversionsViaAdClick(Long totalConversionsViaAdClick) {
    this.totalConversionsViaAdClick = totalConversionsViaAdClick;
  }


  public ConversionTrackerServicePage totalCrossDeviceConversions(Long totalCrossDeviceConversions) {
    
    this.totalCrossDeviceConversions = totalCrossDeviceConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クロスデバイスコンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total of cross-device conv.&lt;/div&gt; 
   * @return totalCrossDeviceConversions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_CROSS_DEVICE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalCrossDeviceConversions() {
    return totalCrossDeviceConversions;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_CROSS_DEVICE_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCrossDeviceConversions(Long totalCrossDeviceConversions) {
    this.totalCrossDeviceConversions = totalCrossDeviceConversions;
  }


  public ConversionTrackerServicePage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of items to be retrieved.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }


  public ConversionTrackerServicePage values(List<ConversionTrackerServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public ConversionTrackerServicePage addValuesItem(ConversionTrackerServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceValue> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<ConversionTrackerServiceValue> values) {
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
    ConversionTrackerServicePage conversionTrackerServicePage = (ConversionTrackerServicePage) o;
    return Objects.equals(this.period, conversionTrackerServicePage.period) &&
        Objects.equals(this.totalAllConversionValue, conversionTrackerServicePage.totalAllConversionValue) &&
        Objects.equals(this.totalAllConversions, conversionTrackerServicePage.totalAllConversions) &&
        Objects.equals(this.totalConversionValue, conversionTrackerServicePage.totalConversionValue) &&
        Objects.equals(this.totalConversionValueViaAdClick, conversionTrackerServicePage.totalConversionValueViaAdClick) &&
        Objects.equals(this.totalConversions, conversionTrackerServicePage.totalConversions) &&
        Objects.equals(this.totalConversionsViaAdClick, conversionTrackerServicePage.totalConversionsViaAdClick) &&
        Objects.equals(this.totalCrossDeviceConversions, conversionTrackerServicePage.totalCrossDeviceConversions) &&
        Objects.equals(this.totalNumEntries, conversionTrackerServicePage.totalNumEntries) &&
        Objects.equals(this.values, conversionTrackerServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, totalAllConversionValue, totalAllConversions, totalConversionValue, totalConversionValueViaAdClick, totalConversions, totalConversionsViaAdClick, totalCrossDeviceConversions, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePage {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalAllConversionValue: ").append(toIndentedString(totalAllConversionValue)).append("\n");
    sb.append("    totalAllConversions: ").append(toIndentedString(totalAllConversions)).append("\n");
    sb.append("    totalConversionValue: ").append(toIndentedString(totalConversionValue)).append("\n");
    sb.append("    totalConversionValueViaAdClick: ").append(toIndentedString(totalConversionValueViaAdClick)).append("\n");
    sb.append("    totalConversions: ").append(toIndentedString(totalConversions)).append("\n");
    sb.append("    totalConversionsViaAdClick: ").append(toIndentedString(totalConversionsViaAdClick)).append("\n");
    sb.append("    totalCrossDeviceConversions: ").append(toIndentedString(totalCrossDeviceConversions)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

