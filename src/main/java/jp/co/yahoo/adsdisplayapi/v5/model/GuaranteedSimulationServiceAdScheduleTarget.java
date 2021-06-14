package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDayOfWeek;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceAdScheduleTargetオブジェクトは、時間帯ターゲティングの設定情報を保持します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; ※targetTypeがAD_SCHEDULE_TARGETの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;br&gt; This field is optional in ADD operation.&lt;br&gt; *If targetType is AD_SCHEDULE_TARGET, this field is required. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceAdScheduleTargetオブジェクトは、時間帯ターゲティングの設定情報を保持します。<br> ADD時、このフィールドは省略可能となります。<br> ※targetTypeがAD_SCHEDULE_TARGETの場合は必須です。 </div> <div lang=\"en\"> GuaranteedSimulationServiceAdScheduleTarget object is a container for storing day of week/hours targeting settings.<br> This field is optional in ADD operation.<br> *If targetType is AD_SCHEDULE_TARGET, this field is required. </div> ")

public class GuaranteedSimulationServiceAdScheduleTarget   {
  @JsonProperty("dayOfWeek")
  private JsonNullable<GuaranteedSimulationServiceDayOfWeek> dayOfWeek = JsonNullable.undefined();

  @JsonProperty("endHour")
  private JsonNullable<Integer> endHour = JsonNullable.undefined();

  @JsonProperty("startHour")
  private JsonNullable<Integer> startHour = JsonNullable.undefined();

  public GuaranteedSimulationServiceAdScheduleTarget dayOfWeek(GuaranteedSimulationServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = JsonNullable.of(dayOfWeek);
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceDayOfWeek> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(JsonNullable<GuaranteedSimulationServiceDayOfWeek> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public GuaranteedSimulationServiceAdScheduleTarget endHour(Integer endHour) {
    this.endHour = JsonNullable.of(endHour);
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了時間（時のみ）です。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> End time (hour only).<br> This field is required in ADD operation. </div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了時間（時のみ）です。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> End time (hour only).<br> This field is required in ADD operation. </div> ")


  public JsonNullable<Integer> getEndHour() {
    return endHour;
  }

  public void setEndHour(JsonNullable<Integer> endHour) {
    this.endHour = endHour;
  }

  public GuaranteedSimulationServiceAdScheduleTarget startHour(Integer startHour) {
    this.startHour = JsonNullable.of(startHour);
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始時間（時のみ）です。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> Start time (hour only).<br> This field is required in ADD operation. </div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始時間（時のみ）です。<br> このフィールドは、ADD時は必須となります。 </div> <div lang=\"en\"> Start time (hour only).<br> This field is required in ADD operation. </div> ")


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
    GuaranteedSimulationServiceAdScheduleTarget guaranteedSimulationServiceAdScheduleTarget = (GuaranteedSimulationServiceAdScheduleTarget) o;
    return Objects.equals(this.dayOfWeek, guaranteedSimulationServiceAdScheduleTarget.dayOfWeek) &&
        Objects.equals(this.endHour, guaranteedSimulationServiceAdScheduleTarget.endHour) &&
        Objects.equals(this.startHour, guaranteedSimulationServiceAdScheduleTarget.startHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, startHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceAdScheduleTarget {\n");
    
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

