package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.ConversionTrackerServicePeriodDatetime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePeriodオブジェクトは、統計情報の更新日を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePeriod object contains the update date of stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePeriodオブジェクトは、統計情報の更新日を保持します。</div> <div lang=\"en\">ConversionTrackerServicePeriod object contains the update date of stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServicePeriod   {
  @JsonProperty("periodEndDate")
  private ConversionTrackerServicePeriodDatetime periodEndDate = null;

  @JsonProperty("periodStartDate")
  private ConversionTrackerServicePeriodDatetime periodStartDate = null;

  public ConversionTrackerServicePeriod periodEndDate(ConversionTrackerServicePeriodDatetime periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * Get periodEndDate
   * @return periodEndDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServicePeriodDatetime getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(ConversionTrackerServicePeriodDatetime periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public ConversionTrackerServicePeriod periodStartDate(ConversionTrackerServicePeriodDatetime periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * Get periodStartDate
   * @return periodStartDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServicePeriodDatetime getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(ConversionTrackerServicePeriodDatetime periodStartDate) {
    this.periodStartDate = periodStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServicePeriod conversionTrackerServicePeriod = (ConversionTrackerServicePeriod) o;
    return Objects.equals(this.periodEndDate, conversionTrackerServicePeriod.periodEndDate) &&
        Objects.equals(this.periodStartDate, conversionTrackerServicePeriod.periodStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEndDate, periodStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePeriod {\n");
    
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
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

