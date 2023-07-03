/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePeriodDatetimeオブジェクトは、統計情報の処理を開始/完了した日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePeriodDatetime object describes date and time when stats information processing started or completed.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServicePeriodDatetime.JSON_PROPERTY_PERIOD_DATE,
  ConversionTrackerServicePeriodDatetime.JSON_PROPERTY_PERIOD_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServicePeriodDatetime {
  public static final String JSON_PROPERTY_PERIOD_DATE = "periodDate";
  private String periodDate;

  public static final String JSON_PROPERTY_PERIOD_TIME = "periodTime";
  private String periodTime;

  public ConversionTrackerServicePeriodDatetime() {
  }

  public ConversionTrackerServicePeriodDatetime periodDate(String periodDate) {
    
    this.periodDate = periodDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;日です。&lt;br&gt;※yyyyMMdd形式です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date.&lt;br&gt;∗ Format: yyyyMMdd&lt;/div&gt; 
   * @return periodDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodDate() {
    return periodDate;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodDate(String periodDate) {
    this.periodDate = periodDate;
  }


  public ConversionTrackerServicePeriodDatetime periodTime(String periodTime) {
    
    this.periodTime = periodTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;時分です。&lt;br&gt;※HHmmss形式です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Hours and minutes.&lt;br&gt;∗ Format: HHmmss&lt;/div&gt; 
   * @return periodTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodTime() {
    return periodTime;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodTime(String periodTime) {
    this.periodTime = periodTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServicePeriodDatetime conversionTrackerServicePeriodDatetime = (ConversionTrackerServicePeriodDatetime) o;
    return Objects.equals(this.periodDate, conversionTrackerServicePeriodDatetime.periodDate) &&
        Objects.equals(this.periodTime, conversionTrackerServicePeriodDatetime.periodTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodDate, periodTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePeriodDatetime {\n");
    sb.append("    periodDate: ").append(toIndentedString(periodDate)).append("\n");
    sb.append("    periodTime: ").append(toIndentedString(periodTime)).append("\n");
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

