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
import jp.co.yahoo.adsdisplayapi.v17.model.FeedFtpServiceScheduleWeek;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceScheduleWeeklyオブジェクトは、定期アップロードを何曜日の何時に実行するかを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceScheduleWeekly object displays what day of the week and what time of the day the Periodic Upload runs.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedFtpServiceScheduleWeekly.JSON_PROPERTY_SCHEDULE_WEEK,
  FeedFtpServiceScheduleWeekly.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedFtpServiceScheduleWeekly {
  public static final String JSON_PROPERTY_SCHEDULE_WEEK = "scheduleWeek";
  private FeedFtpServiceScheduleWeek scheduleWeek;

  public static final String JSON_PROPERTY_TIME = "time";
  private Integer time;

  public FeedFtpServiceScheduleWeekly() {
  }

  public FeedFtpServiceScheduleWeekly scheduleWeek(FeedFtpServiceScheduleWeek scheduleWeek) {
    
    this.scheduleWeek = scheduleWeek;
    return this;
  }

   /**
   * Get scheduleWeek
   * @return scheduleWeek
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceScheduleWeek getScheduleWeek() {
    return scheduleWeek;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleWeek(FeedFtpServiceScheduleWeek scheduleWeek) {
    this.scheduleWeek = scheduleWeek;
  }


  public FeedFtpServiceScheduleWeekly time(Integer time) {
    
    this.time = time;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 何時に実行するかを表します。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Execution time.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return time
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(Integer time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpServiceScheduleWeekly feedFtpServiceScheduleWeekly = (FeedFtpServiceScheduleWeekly) o;
    return Objects.equals(this.scheduleWeek, feedFtpServiceScheduleWeekly.scheduleWeek) &&
        Objects.equals(this.time, feedFtpServiceScheduleWeekly.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleWeek, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceScheduleWeekly {\n");
    sb.append("    scheduleWeek: ").append(toIndentedString(scheduleWeek)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

