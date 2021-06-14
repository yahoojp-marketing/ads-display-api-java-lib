package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceScheduleDailyオブジェクトは、定期アップロードを何時に実行するかを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceScheduleDaily object displays the execution time of the day for Periodic Upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpServiceScheduleDailyオブジェクトは、定期アップロードを何時に実行するかを表します。</div> <div lang=\"en\">FeedFtpServiceScheduleDaily object displays the execution time of the day for Periodic Upload.</div> ")

public class FeedFtpServiceScheduleDaily   {
  @JsonProperty("time")
  private JsonNullable<Integer> time = JsonNullable.undefined();

  public FeedFtpServiceScheduleDaily time(Integer time) {
    this.time = JsonNullable.of(time);
    return this;
  }

  /**
   * <div lang=\"ja\"> 何時に実行するかを表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Execution time.<br> This field is required in requests. </div> 
   * @return time
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 何時に実行するかを表します。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Execution time.<br> This field is required in requests. </div> ")


  public JsonNullable<Integer> getTime() {
    return time;
  }

  public void setTime(JsonNullable<Integer> time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpServiceScheduleDaily feedFtpServiceScheduleDaily = (FeedFtpServiceScheduleDaily) o;
    return Objects.equals(this.time, feedFtpServiceScheduleDaily.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceScheduleDaily {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

