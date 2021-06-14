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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpRequestオブジェクトは、即時アップロードリクエスト情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpRequest object holds FeedFtpRequest information that performs Upload (Upload now).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpRequestオブジェクトは、即時アップロードリクエスト情報を保持します。</div> <div lang=\"en\">FeedFtpRequest object holds FeedFtpRequest information that performs Upload (Upload now).</div> ")

public class FeedFtpRequest   {
  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  public FeedFtpRequest feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIdです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIdです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpRequest feedFtpRequest = (FeedFtpRequest) o;
    return Objects.equals(this.feedId, feedFtpRequest.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpRequest {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

