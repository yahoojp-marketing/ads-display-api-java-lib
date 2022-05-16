/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v8.model.StatsServiceDayOfWeek;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.</div> ")
@JsonPropertyOrder({
  StatsServiceAdScheduleTarget.JSON_PROPERTY_DAY_OF_WEEK,
  StatsServiceAdScheduleTarget.JSON_PROPERTY_END_HOUR,
  StatsServiceAdScheduleTarget.JSON_PROPERTY_START_HOUR
})
@JsonTypeName("StatsServiceAdScheduleTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatsServiceAdScheduleTarget {
  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private StatsServiceDayOfWeek dayOfWeek;

  public static final String JSON_PROPERTY_END_HOUR = "endHour";
  private Integer endHour;

  public static final String JSON_PROPERTY_START_HOUR = "startHour";
  private Integer startHour;

  public StatsServiceAdScheduleTarget() { 
  }

  public StatsServiceAdScheduleTarget dayOfWeek(StatsServiceDayOfWeek dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatsServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(StatsServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public StatsServiceAdScheduleTarget endHour(Integer endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;終了時間(時のみ)&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End time (hour only)&lt;/div&gt; 
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">終了時間(時のみ)</div> <div lang=\"en\">End time (hour only)</div> ")
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public StatsServiceAdScheduleTarget startHour(Integer startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始時間(時のみ)&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start time (hour only)&lt;/div&gt; 
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始時間(時のみ)</div> <div lang=\"en\">Start time (hour only)</div> ")
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServiceAdScheduleTarget statsServiceAdScheduleTarget = (StatsServiceAdScheduleTarget) o;
    return Objects.equals(this.dayOfWeek, statsServiceAdScheduleTarget.dayOfWeek) &&
        Objects.equals(this.endHour, statsServiceAdScheduleTarget.endHour) &&
        Objects.equals(this.startHour, statsServiceAdScheduleTarget.startHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, startHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServiceAdScheduleTarget {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
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

