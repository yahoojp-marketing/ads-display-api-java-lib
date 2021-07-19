package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceScheduleHourlyオブジェクトは、定期アップロードを何時間ごとに実行するかを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceScheduleHourly object displays hourly interval of execution time for Periodic Upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpServiceScheduleHourlyオブジェクトは、定期アップロードを何時間ごとに実行するかを表します。</div> <div lang=\"en\">FeedFtpServiceScheduleHourly object displays hourly interval of execution time for Periodic Upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedFtpServiceScheduleHourly   {
  @JsonProperty("interval")
  private Integer interval = null;

  public FeedFtpServiceScheduleHourly interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * <div lang=\"ja\"> 何時間ごとに実行するかの間隔です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Interval of the execution time.<br> This field is required in requests. </div> 
   * @return interval
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 何時間ごとに実行するかの間隔です。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Interval of the execution time.<br> This field is required in requests. </div> ")


  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpServiceScheduleHourly feedFtpServiceScheduleHourly = (FeedFtpServiceScheduleHourly) o;
    return Objects.equals(this.interval, feedFtpServiceScheduleHourly.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceScheduleHourly {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

