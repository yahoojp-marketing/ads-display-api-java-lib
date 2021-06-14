package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.StatsServiceDayOfWeek;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.</div> ")

public class StatsServiceAdScheduleTarget   {
  @JsonProperty("dayOfWeek")
  private JsonNullable<StatsServiceDayOfWeek> dayOfWeek = JsonNullable.undefined();

  @JsonProperty("endHour")
  private JsonNullable<Integer> endHour = JsonNullable.undefined();

  @JsonProperty("startHour")
  private JsonNullable<Integer> startHour = JsonNullable.undefined();

  public StatsServiceAdScheduleTarget dayOfWeek(StatsServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = JsonNullable.of(dayOfWeek);
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<StatsServiceDayOfWeek> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(JsonNullable<StatsServiceDayOfWeek> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public StatsServiceAdScheduleTarget endHour(Integer endHour) {
    this.endHour = JsonNullable.of(endHour);
    return this;
  }

  /**
   * <div lang=\"ja\">終了時間(時のみ)</div> <div lang=\"en\">End time (hour only)</div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了時間(時のみ)</div> <div lang=\"en\">End time (hour only)</div> ")


  public JsonNullable<Integer> getEndHour() {
    return endHour;
  }

  public void setEndHour(JsonNullable<Integer> endHour) {
    this.endHour = endHour;
  }

  public StatsServiceAdScheduleTarget startHour(Integer startHour) {
    this.startHour = JsonNullable.of(startHour);
    return this;
  }

  /**
   * <div lang=\"ja\">開始時間(時のみ)</div> <div lang=\"en\">Start time (hour only)</div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始時間(時のみ)</div> <div lang=\"en\">Start time (hour only)</div> ")


  public JsonNullable<Integer> getStartHour() {
    return startHour;
  }

  public void setStartHour(JsonNullable<Integer> startHour) {
    this.startHour = startHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

