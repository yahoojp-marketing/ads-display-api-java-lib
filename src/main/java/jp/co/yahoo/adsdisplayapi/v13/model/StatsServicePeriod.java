/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v13.model.StatsServicePeriodDatetime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePeriodオブジェクトは、統計情報の更新日を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePeriod object contains the update date of stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePeriodオブジェクトは、統計情報の更新日を保持します。</div> <div lang=\"en\">StatsServicePeriod object contains the update date of stats information.</div> ")
@JsonPropertyOrder({
  StatsServicePeriod.JSON_PROPERTY_PERIOD_END_DATE,
  StatsServicePeriod.JSON_PROPERTY_PERIOD_START_DATE
})
@JsonTypeName("StatsServicePeriod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServicePeriod {
  public static final String JSON_PROPERTY_PERIOD_END_DATE = "periodEndDate";
  private StatsServicePeriodDatetime periodEndDate;

  public static final String JSON_PROPERTY_PERIOD_START_DATE = "periodStartDate";
  private StatsServicePeriodDatetime periodStartDate;

  public StatsServicePeriod() { 
  }

  public StatsServicePeriod periodEndDate(StatsServicePeriodDatetime periodEndDate) {
    
    this.periodEndDate = periodEndDate;
    return this;
  }

   /**
   * Get periodEndDate
   * @return periodEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePeriodDatetime getPeriodEndDate() {
    return periodEndDate;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodEndDate(StatsServicePeriodDatetime periodEndDate) {
    this.periodEndDate = periodEndDate;
  }


  public StatsServicePeriod periodStartDate(StatsServicePeriodDatetime periodStartDate) {
    
    this.periodStartDate = periodStartDate;
    return this;
  }

   /**
   * Get periodStartDate
   * @return periodStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServicePeriodDatetime getPeriodStartDate() {
    return periodStartDate;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodStartDate(StatsServicePeriodDatetime periodStartDate) {
    this.periodStartDate = periodStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePeriod statsServicePeriod = (StatsServicePeriod) o;
    return Objects.equals(this.periodEndDate, statsServicePeriod.periodEndDate) &&
        Objects.equals(this.periodStartDate, statsServicePeriod.periodStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEndDate, periodStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePeriod {\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
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

