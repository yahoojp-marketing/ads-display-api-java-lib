/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v10.model.FeedFtpServiceScheduleDaily;
import jp.co.yahoo.adsdisplayapi.v10.model.FeedFtpServiceScheduleHourly;
import jp.co.yahoo.adsdisplayapi.v10.model.FeedFtpServiceScheduleType;
import jp.co.yahoo.adsdisplayapi.v10.model.FeedFtpServiceScheduleWeekly;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedFtpServiceScheduleオブジェクトは、定期アップロードのスケジュールを表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedFtpServiceSchedule object displays Periodic Upload schedule.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedFtpServiceScheduleオブジェクトは、定期アップロードのスケジュールを表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> FeedFtpServiceSchedule object displays Periodic Upload schedule.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@JsonPropertyOrder({
  FeedFtpServiceSchedule.JSON_PROPERTY_SCHEDULE_DAILY,
  FeedFtpServiceSchedule.JSON_PROPERTY_SCHEDULE_HOURLY,
  FeedFtpServiceSchedule.JSON_PROPERTY_SCHEDULE_TYPE,
  FeedFtpServiceSchedule.JSON_PROPERTY_SCHEDULE_WEEKLY
})
@JsonTypeName("FeedFtpServiceSchedule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedFtpServiceSchedule {
  public static final String JSON_PROPERTY_SCHEDULE_DAILY = "scheduleDaily";
  private FeedFtpServiceScheduleDaily scheduleDaily;

  public static final String JSON_PROPERTY_SCHEDULE_HOURLY = "scheduleHourly";
  private FeedFtpServiceScheduleHourly scheduleHourly;

  public static final String JSON_PROPERTY_SCHEDULE_TYPE = "scheduleType";
  private FeedFtpServiceScheduleType scheduleType;

  public static final String JSON_PROPERTY_SCHEDULE_WEEKLY = "scheduleWeekly";
  private FeedFtpServiceScheduleWeekly scheduleWeekly;

  public FeedFtpServiceSchedule() { 
  }

  public FeedFtpServiceSchedule scheduleDaily(FeedFtpServiceScheduleDaily scheduleDaily) {
    
    this.scheduleDaily = scheduleDaily;
    return this;
  }

   /**
   * Get scheduleDaily
   * @return scheduleDaily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DAILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceScheduleDaily getScheduleDaily() {
    return scheduleDaily;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DAILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleDaily(FeedFtpServiceScheduleDaily scheduleDaily) {
    this.scheduleDaily = scheduleDaily;
  }


  public FeedFtpServiceSchedule scheduleHourly(FeedFtpServiceScheduleHourly scheduleHourly) {
    
    this.scheduleHourly = scheduleHourly;
    return this;
  }

   /**
   * Get scheduleHourly
   * @return scheduleHourly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_HOURLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceScheduleHourly getScheduleHourly() {
    return scheduleHourly;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_HOURLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleHourly(FeedFtpServiceScheduleHourly scheduleHourly) {
    this.scheduleHourly = scheduleHourly;
  }


  public FeedFtpServiceSchedule scheduleType(FeedFtpServiceScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceScheduleType getScheduleType() {
    return scheduleType;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleType(FeedFtpServiceScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public FeedFtpServiceSchedule scheduleWeekly(FeedFtpServiceScheduleWeekly scheduleWeekly) {
    
    this.scheduleWeekly = scheduleWeekly;
    return this;
  }

   /**
   * Get scheduleWeekly
   * @return scheduleWeekly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_WEEKLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedFtpServiceScheduleWeekly getScheduleWeekly() {
    return scheduleWeekly;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_WEEKLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleWeekly(FeedFtpServiceScheduleWeekly scheduleWeekly) {
    this.scheduleWeekly = scheduleWeekly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpServiceSchedule feedFtpServiceSchedule = (FeedFtpServiceSchedule) o;
    return Objects.equals(this.scheduleDaily, feedFtpServiceSchedule.scheduleDaily) &&
        Objects.equals(this.scheduleHourly, feedFtpServiceSchedule.scheduleHourly) &&
        Objects.equals(this.scheduleType, feedFtpServiceSchedule.scheduleType) &&
        Objects.equals(this.scheduleWeekly, feedFtpServiceSchedule.scheduleWeekly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleDaily, scheduleHourly, scheduleType, scheduleWeekly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceSchedule {\n");
    sb.append("    scheduleDaily: ").append(toIndentedString(scheduleDaily)).append("\n");
    sb.append("    scheduleHourly: ").append(toIndentedString(scheduleHourly)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleWeekly: ").append(toIndentedString(scheduleWeekly)).append("\n");
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
