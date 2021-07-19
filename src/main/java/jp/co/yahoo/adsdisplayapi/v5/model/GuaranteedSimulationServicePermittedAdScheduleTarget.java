package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceDayOfWeek;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePermittedAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePermittedAdScheduleTarget object is a container for storing day of week/hours targeting settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePermittedAdScheduleTargetオブジェクトは、時間帯ターゲットの設定情報を保持します。</div> <div lang=\"en\">GuaranteedSimulationServicePermittedAdScheduleTarget object is a container for storing day of week/hours targeting settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePermittedAdScheduleTarget   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("dayOfWeek")
  private GuaranteedSimulationServiceDayOfWeek dayOfWeek = null;

  @JsonProperty("endHour")
  private Integer endHour = null;

  @JsonProperty("startHour")
  private Integer startHour = null;

  @JsonProperty("price")
  private Long price = null;

  public GuaranteedSimulationServicePermittedAdScheduleTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> ")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public GuaranteedSimulationServicePermittedAdScheduleTarget dayOfWeek(GuaranteedSimulationServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(GuaranteedSimulationServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public GuaranteedSimulationServicePermittedAdScheduleTarget endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * <div lang=\"ja\">終了時間(時のみ)です。</div> <div lang=\"en\">End time (hour only).</div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了時間(時のみ)です。</div> <div lang=\"en\">End time (hour only).</div> ")


  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  public GuaranteedSimulationServicePermittedAdScheduleTarget startHour(Integer startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * <div lang=\"ja\">開始時間(時のみ)です。</div> <div lang=\"en\">Start time (hour only).</div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始時間(時のみ)です。</div> <div lang=\"en\">Start time (hour only).</div> ")


  public Integer getStartHour() {
    return startHour;
  }

  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  public GuaranteedSimulationServicePermittedAdScheduleTarget price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * <div lang=\"ja\">   固定価格です。 </div> <div lang=\"en\">   Fixed price. </div> 
   * @return price
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   固定価格です。 </div> <div lang=\"en\">   Fixed price. </div> ")


  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePermittedAdScheduleTarget guaranteedSimulationServicePermittedAdScheduleTarget = (GuaranteedSimulationServicePermittedAdScheduleTarget) o;
    return Objects.equals(this.targetId, guaranteedSimulationServicePermittedAdScheduleTarget.targetId) &&
        Objects.equals(this.dayOfWeek, guaranteedSimulationServicePermittedAdScheduleTarget.dayOfWeek) &&
        Objects.equals(this.endHour, guaranteedSimulationServicePermittedAdScheduleTarget.endHour) &&
        Objects.equals(this.startHour, guaranteedSimulationServicePermittedAdScheduleTarget.startHour) &&
        Objects.equals(this.price, guaranteedSimulationServicePermittedAdScheduleTarget.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, dayOfWeek, endHour, startHour, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePermittedAdScheduleTarget {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

