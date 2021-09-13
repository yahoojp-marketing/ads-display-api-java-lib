package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.StatsServicePeriodDatetime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePeriodオブジェクトは、統計情報の更新日を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePeriod object contains the update date of stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePeriodオブジェクトは、統計情報の更新日を保持します。</div> <div lang=\"en\">StatsServicePeriod object contains the update date of stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServicePeriod   {
  @JsonProperty("periodEndDate")
  private StatsServicePeriodDatetime periodEndDate = null;

  @JsonProperty("periodStartDate")
  private StatsServicePeriodDatetime periodStartDate = null;

  public StatsServicePeriod periodEndDate(StatsServicePeriodDatetime periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * Get periodEndDate
   * @return periodEndDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServicePeriodDatetime getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(StatsServicePeriodDatetime periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public StatsServicePeriod periodStartDate(StatsServicePeriodDatetime periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * Get periodStartDate
   * @return periodStartDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatsServicePeriodDatetime getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(StatsServicePeriodDatetime periodStartDate) {
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
    StatsServicePeriod statsServicePeriod = (StatsServicePeriod) o;
    return Objects.equals(this.periodEndDate, statsServicePeriod.periodEndDate) &&
        Objects.equals(this.periodStartDate, statsServicePeriod.periodStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEndDate, periodStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePeriod {\n");
    
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

