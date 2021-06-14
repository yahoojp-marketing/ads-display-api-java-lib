package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.ErrorDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Errorオブジェクトは、エラー内容を表します。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Error information.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">Errorオブジェクトは、エラー内容を表します。</div><div lang=\"en\">Error information.</div>")

public class Error   {
  @JsonProperty("code")
  private JsonNullable<String> code = JsonNullable.undefined();

  @JsonProperty("message")
  private JsonNullable<String> message = JsonNullable.undefined();

  @JsonProperty("details")
  @Valid
  private JsonNullable<List<ErrorDetail>> details = JsonNullable.undefined();

  public Error code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * <div lang=\"ja\">エラーコードです。</div><div lang=\"en\">The error code.</div>
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーコードです。</div><div lang=\"en\">The error code.</div>")


  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * <div lang=\"ja\">エラーメッセージです。</div><div lang=\"en\">A simple string representation of the error and reason.</div>
   * @return message
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーメッセージです。</div><div lang=\"en\">A simple string representation of the error and reason.</div>")


  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  public Error details(List<ErrorDetail> details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  public Error addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null || !this.details.isPresent()) {
      this.details = JsonNullable.of(new ArrayList<>());
    }
    this.details.get().add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ErrorDetail>> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<List<ErrorDetail>> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

