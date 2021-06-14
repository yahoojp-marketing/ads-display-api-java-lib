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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ErrorDetailオブジェクトは、エラーの詳細な内容を表します。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Detailed information of error.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">ErrorDetailオブジェクトは、エラーの詳細な内容を表します。</div><div lang=\"en\">Detailed information of error.</div>")

public class ErrorDetail   {
  @JsonProperty("requestKey")
  private JsonNullable<String> requestKey = JsonNullable.undefined();

  @JsonProperty("requestValue")
  private JsonNullable<String> requestValue = JsonNullable.undefined();

  public ErrorDetail requestKey(String requestKey) {
    this.requestKey = JsonNullable.of(requestKey);
    return this;
  }

  /**
   * <div lang=\"ja\">エラーが発生したフィールドです。</div><div lang=\"en\">The file that occured the error.</div>
   * @return requestKey
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーが発生したフィールドです。</div><div lang=\"en\">The file that occured the error.</div>")


  public JsonNullable<String> getRequestKey() {
    return requestKey;
  }

  public void setRequestKey(JsonNullable<String> requestKey) {
    this.requestKey = requestKey;
  }

  public ErrorDetail requestValue(String requestValue) {
    this.requestValue = JsonNullable.of(requestValue);
    return this;
  }

  /**
   * <div lang=\"ja\">エラーが発生した値です。</div><div lang=\"en\">The data that caused the error.</div>
   * @return requestValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーが発生した値です。</div><div lang=\"en\">The data that caused the error.</div>")


  public JsonNullable<String> getRequestValue() {
    return requestValue;
  }

  public void setRequestValue(JsonNullable<String> requestValue) {
    this.requestValue = requestValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.requestKey, errorDetail.requestKey) &&
        Objects.equals(this.requestValue, errorDetail.requestValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestKey, requestValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    
    sb.append("    requestKey: ").append(toIndentedString(requestKey)).append("\n");
    sb.append("    requestValue: ").append(toIndentedString(requestValue)).append("\n");
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

