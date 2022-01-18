package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePeriodDatetimeオブジェクトは、統計情報の処理を開始/完了した日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePeriodDatetime object describes date and time when stats information processing started or completed.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePeriodDatetimeオブジェクトは、統計情報の処理を開始/完了した日時です。</div> <div lang=\"en\">ConversionTrackerServicePeriodDatetime object describes date and time when stats information processing started or completed.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServicePeriodDatetime   {
  @JsonProperty("periodDate")
  private String periodDate = null;

  @JsonProperty("periodTime")
  private String periodTime = null;

  public ConversionTrackerServicePeriodDatetime periodDate(String periodDate) {
    this.periodDate = periodDate;
    return this;
  }

  /**
   * <div lang=\"ja\">日です。<br>※yyyyMMdd形式です。</div> <div lang=\"en\">Date.<br>∗ Format: yyyyMMdd</div> 
   * @return periodDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">日です。<br>※yyyyMMdd形式です。</div> <div lang=\"en\">Date.<br>∗ Format: yyyyMMdd</div> ")


  public String getPeriodDate() {
    return periodDate;
  }

  public void setPeriodDate(String periodDate) {
    this.periodDate = periodDate;
  }

  public ConversionTrackerServicePeriodDatetime periodTime(String periodTime) {
    this.periodTime = periodTime;
    return this;
  }

  /**
   * <div lang=\"ja\">時分です。<br>※HHmmss形式です。</div> <div lang=\"en\">Hours and minutes.<br>∗ Format: HHmmss</div> 
   * @return periodTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">時分です。<br>※HHmmss形式です。</div> <div lang=\"en\">Hours and minutes.<br>∗ Format: HHmmss</div> ")


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
    ConversionTrackerServicePeriodDatetime conversionTrackerServicePeriodDatetime = (ConversionTrackerServicePeriodDatetime) o;
    return Objects.equals(this.periodDate, conversionTrackerServicePeriodDatetime.periodDate) &&
        Objects.equals(this.periodTime, conversionTrackerServicePeriodDatetime.periodTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodDate, periodTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePeriodDatetime {\n");
    
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

