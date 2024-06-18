/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ConversionTrackerServiceStatsPeriodCustomDateは、統計情報の取得日を保持するオブジェクトです。&lt;br&gt; ADD、SET時のレスポンスではnullで返却されます。必要な場合はGETしてください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ConversionTrackerServiceStatsPeriodCustomDate object contains date of acquisition of stats information.&lt;br&gt; ADD and SET responses will return null. Please GET if necessary. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServiceStatsPeriodCustomDate.JSON_PROPERTY_STATS_END_DATE,
  ConversionTrackerServiceStatsPeriodCustomDate.JSON_PROPERTY_STATS_START_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceStatsPeriodCustomDate {
  public static final String JSON_PROPERTY_STATS_END_DATE = "statsEndDate";
  private String statsEndDate;

  public static final String JSON_PROPERTY_STATS_START_DATE = "statsStartDate";
  private String statsStartDate;

  public ConversionTrackerServiceStatsPeriodCustomDate() {
  }

  public ConversionTrackerServiceStatsPeriodCustomDate statsEndDate(String statsEndDate) {
    
    this.statsEndDate = statsEndDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 統計情報取得終了日です。&lt;br&gt; ※yyyyMMdd形式です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Acquisition end date of stats information.&lt;br&gt; ∗ Format: yyyyMMdd. &lt;/div&gt; 
   * @return statsEndDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatsEndDate() {
    return statsEndDate;
  }


  @JsonProperty(JSON_PROPERTY_STATS_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatsEndDate(String statsEndDate) {
    this.statsEndDate = statsEndDate;
  }


  public ConversionTrackerServiceStatsPeriodCustomDate statsStartDate(String statsStartDate) {
    
    this.statsStartDate = statsStartDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 統計情報取得開始日です。&lt;br&gt; ※yyyyMMdd形式です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Acquisition start date of stats information.&lt;br&gt; ∗ Format: yyyyMMdd. &lt;/div&gt; 
   * @return statsStartDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATS_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatsStartDate() {
    return statsStartDate;
  }


  @JsonProperty(JSON_PROPERTY_STATS_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatsStartDate(String statsStartDate) {
    this.statsStartDate = statsStartDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceStatsPeriodCustomDate conversionTrackerServiceStatsPeriodCustomDate = (ConversionTrackerServiceStatsPeriodCustomDate) o;
    return Objects.equals(this.statsEndDate, conversionTrackerServiceStatsPeriodCustomDate.statsEndDate) &&
        Objects.equals(this.statsStartDate, conversionTrackerServiceStatsPeriodCustomDate.statsStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statsEndDate, statsStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceStatsPeriodCustomDate {\n");
    sb.append("    statsEndDate: ").append(toIndentedString(statsEndDate)).append("\n");
    sb.append("    statsStartDate: ").append(toIndentedString(statsStartDate)).append("\n");
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

