package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePeriodDatetimeオブジェクトは、統計情報の処理を開始/完了した日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePeriodDatetime object describes date and time when stats information processing started or completed.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePeriodDatetimeオブジェクトは、統計情報の処理を開始/完了した日時です。</div> <div lang=\"en\">StatsServicePeriodDatetime object describes date and time when stats information processing started or completed.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServicePeriodDatetime   {
  @JsonProperty("periodDate")
  private String periodDate = null;

  @JsonProperty("periodTime")
  private String periodTime = null;

  public StatsServicePeriodDatetime periodDate(String periodDate) {
    this.periodDate = periodDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 日<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Date<br> ∗ Format: yyyyMMdd </div> 
   * @return periodDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 日<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Date<br> ∗ Format: yyyyMMdd </div> ")


  public String getPeriodDate() {
    return periodDate;
  }

  public void setPeriodDate(String periodDate) {
    this.periodDate = periodDate;
  }

  public StatsServicePeriodDatetime periodTime(String periodTime) {
    this.periodTime = periodTime;
    return this;
  }

  /**
   * <div lang=\"ja\"> 時分<br> ※フォーマット：HHmmss </div> <div lang=\"en\"> Hour and minute<br> ∗ Format: HHmmss </div> 
   * @return periodTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 時分<br> ※フォーマット：HHmmss </div> <div lang=\"en\"> Hour and minute<br> ∗ Format: HHmmss </div> ")


  public String getPeriodTime() {
    return periodTime;
  }

  public void setPeriodTime(String periodTime) {
    this.periodTime = periodTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePeriodDatetime statsServicePeriodDatetime = (StatsServicePeriodDatetime) o;
    return Objects.equals(this.periodDate, statsServicePeriodDatetime.periodDate) &&
        Objects.equals(this.periodTime, statsServicePeriodDatetime.periodTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodDate, periodTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePeriodDatetime {\n");
    
    sb.append("    periodDate: ").append(toIndentedString(periodDate)).append("\n");
    sb.append("    periodTime: ").append(toIndentedString(periodTime)).append("\n");
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

