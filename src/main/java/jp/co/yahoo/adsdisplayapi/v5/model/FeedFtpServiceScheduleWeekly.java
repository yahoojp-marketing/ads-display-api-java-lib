package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpServiceScheduleWeek;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceScheduleWeeklyオブジェクトは、定期アップロードを何曜日の何時に実行するかを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceScheduleWeekly object displays what day of the week and what time of the day the Periodic Upload runs.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpServiceScheduleWeeklyオブジェクトは、定期アップロードを何曜日の何時に実行するかを表します。</div> <div lang=\"en\">FeedFtpServiceScheduleWeekly object displays what day of the week and what time of the day the Periodic Upload runs.</div> ")

public class FeedFtpServiceScheduleWeekly   {
  @JsonProperty("scheduleWeek")
  private JsonNullable<FeedFtpServiceScheduleWeek> scheduleWeek = JsonNullable.undefined();

  @JsonProperty("time")
  private JsonNullable<Integer> time = JsonNullable.undefined();

  public FeedFtpServiceScheduleWeekly scheduleWeek(FeedFtpServiceScheduleWeek scheduleWeek) {
    this.scheduleWeek = JsonNullable.of(scheduleWeek);
    return this;
  }

  /**
   * Get scheduleWeek
   * @return scheduleWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedFtpServiceScheduleWeek> getScheduleWeek() {
    return scheduleWeek;
  }

  public void setScheduleWeek(JsonNullable<FeedFtpServiceScheduleWeek> scheduleWeek) {
    this.scheduleWeek = scheduleWeek;
  }

  public FeedFtpServiceScheduleWeekly time(Integer time) {
    this.time = JsonNullable.of(time);
    return this;
  }

  /**
   * <div lang=\"ja\"> 何時に実行するかを表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Execution time.<br> This field is required in requests. </div> 
   * @return time
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 何時に実行するかを表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Execution time.<br> This field is required in requests. </div> ")


  public JsonNullable<Integer> getTime() {
    return time;
  }

  public void setTime(JsonNullable<Integer> time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

