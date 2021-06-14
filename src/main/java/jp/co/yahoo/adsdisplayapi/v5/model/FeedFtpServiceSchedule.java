package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceScheduleDaily;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceScheduleHourly;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceScheduleType;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceScheduleWeekly;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; FeedFtpServiceScheduleオブジェクトは、定期アップロードのスケジュールを表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; FeedFtpServiceSchedule object displays Periodic Upload schedule.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> FeedFtpServiceScheduleオブジェクトは、定期アップロードのスケジュールを表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> FeedFtpServiceSchedule object displays Periodic Upload schedule.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")

public class FeedFtpServiceSchedule   {
  @JsonProperty("scheduleDaily")
  private JsonNullable<FeedFtpServiceScheduleDaily> scheduleDaily = JsonNullable.undefined();

  @JsonProperty("scheduleHourly")
  private JsonNullable<FeedFtpServiceScheduleHourly> scheduleHourly = JsonNullable.undefined();

  @JsonProperty("scheduleType")
  private JsonNullable<FeedFtpServiceScheduleType> scheduleType = JsonNullable.undefined();

  @JsonProperty("scheduleWeekly")
  private JsonNullable<FeedFtpServiceScheduleWeekly> scheduleWeekly = JsonNullable.undefined();

  public FeedFtpServiceSchedule scheduleDaily(FeedFtpServiceScheduleDaily scheduleDaily) {
    this.scheduleDaily = JsonNullable.of(scheduleDaily);
    return this;
  }

  /**
   * Get scheduleDaily
   * @return scheduleDaily
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceScheduleDaily> getScheduleDaily() {
    return scheduleDaily;
  }

  public void setScheduleDaily(JsonNullable<FeedFtpServiceScheduleDaily> scheduleDaily) {
    this.scheduleDaily = scheduleDaily;
  }

  public FeedFtpServiceSchedule scheduleHourly(FeedFtpServiceScheduleHourly scheduleHourly) {
    this.scheduleHourly = JsonNullable.of(scheduleHourly);
    return this;
  }

  /**
   * Get scheduleHourly
   * @return scheduleHourly
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceScheduleHourly> getScheduleHourly() {
    return scheduleHourly;
  }

  public void setScheduleHourly(JsonNullable<FeedFtpServiceScheduleHourly> scheduleHourly) {
    this.scheduleHourly = scheduleHourly;
  }

  public FeedFtpServiceSchedule scheduleType(FeedFtpServiceScheduleType scheduleType) {
    this.scheduleType = JsonNullable.of(scheduleType);
    return this;
  }

  /**
   * Get scheduleType
   * @return scheduleType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceScheduleType> getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(JsonNullable<FeedFtpServiceScheduleType> scheduleType) {
    this.scheduleType = scheduleType;
  }

  public FeedFtpServiceSchedule scheduleWeekly(FeedFtpServiceScheduleWeekly scheduleWeekly) {
    this.scheduleWeekly = JsonNullable.of(scheduleWeekly);
    return this;
  }

  /**
   * Get scheduleWeekly
   * @return scheduleWeekly
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceScheduleWeekly> getScheduleWeekly() {
    return scheduleWeekly;
  }

  public void setScheduleWeekly(JsonNullable<FeedFtpServiceScheduleWeekly> scheduleWeekly) {
    this.scheduleWeekly = scheduleWeekly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

