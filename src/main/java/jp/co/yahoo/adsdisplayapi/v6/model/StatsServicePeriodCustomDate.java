package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;StatsServicePeriodCustomDateは、統計情報の取得日を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;StatsServicePeriodCustomDate object contains date of acquisition of stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">StatsServicePeriodCustomDateは、統計情報の取得日を保持するオブジェクトです。</div> <div lang=\"en\">StatsServicePeriodCustomDate object contains date of acquisition of stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StatsServicePeriodCustomDate   {
  @JsonProperty("statsEndDate")
  private String statsEndDate = null;

  @JsonProperty("statsStartDate")
  private String statsStartDate = null;

  public StatsServicePeriodCustomDate statsEndDate(String statsEndDate) {
    this.statsEndDate = statsEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 統計情報取得終了日時<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Acquisition end date of stats information<br> ∗ Format: yyyyMMdd </div> 
   * @return statsEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 統計情報取得終了日時<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Acquisition end date of stats information<br> ∗ Format: yyyyMMdd </div> ")


  public String getStatsEndDate() {
    return statsEndDate;
  }

  public void setStatsEndDate(String statsEndDate) {
    this.statsEndDate = statsEndDate;
  }

  public StatsServicePeriodCustomDate statsStartDate(String statsStartDate) {
    this.statsStartDate = statsStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 統計情報取得開始日時<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Acquisition start date of stats information<br> ∗ Format: yyyyMMdd </div> 
   * @return statsStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 統計情報取得開始日時<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Acquisition start date of stats information<br> ∗ Format: yyyyMMdd </div> ")


  public String getStatsStartDate() {
    return statsStartDate;
  }

  public void setStatsStartDate(String statsStartDate) {
    this.statsStartDate = statsStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsServicePeriodCustomDate statsServicePeriodCustomDate = (StatsServicePeriodCustomDate) o;
    return Objects.equals(this.statsEndDate, statsServicePeriodCustomDate.statsEndDate) &&
        Objects.equals(this.statsStartDate, statsServicePeriodCustomDate.statsStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statsEndDate, statsStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsServicePeriodCustomDate {\n");
    
    sb.append("    statsEndDate: ").append(toIndentedString(statsEndDate)).append("\n");
    sb.append("    statsStartDate: ").append(toIndentedString(statsStartDate)).append("\n");
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

