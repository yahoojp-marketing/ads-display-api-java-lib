package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.StatsServiceDayOfWeek;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServiceAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。</div> <div lang=\"en\">StatsServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServiceAdScheduleTarget   {
  @JsonProperty("dayOfWeek")
  private StatsServiceDayOfWeek dayOfWeek = null;

  @JsonProperty("endHour")
  private Integer endHour = null;

  @JsonProperty("startHour")
  private Integer startHour = null;

  public StatsServiceAdScheduleTarget dayOfWeek(StatsServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(StatsServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public StatsServiceAdScheduleTarget endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * <div lang=\"ja\">終了時間(時のみ)</div> <div lang=\"en\">End time (hour only)</div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了時間(時のみ)</div> <div lang=\"en\">End time (hour only)</div> ")


  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  public StatsServiceAdScheduleTarget startHour(Integer startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * <div lang=\"ja\">開始時間(時のみ)</div> <div lang=\"en\">Start time (hour only)</div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始時間(時のみ)</div> <div lang=\"en\">Start time (hour only)</div> ")


  public Integer getStartHour() {
    return startHour;
  }

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

