package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.ErrorDetail;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Errorオブジェクトは、エラー内容を表します。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Error information.&lt;/div&gt;
 */
@ApiModel(description = "<div lang=\"ja\">Errorオブジェクトは、エラー内容を表します。</div><div lang=\"en\">Error information.</div>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Error   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("details")
  @Valid
  private List<ErrorDetail> details = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * <div lang=\"ja\">エラーコードです。</div><div lang=\"en\">The error code.</div>
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーコードです。</div><div lang=\"en\">The error code.</div>")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <div lang=\"ja\">エラーメッセージです。</div><div lang=\"en\">A simple string representation of the error and reason.</div>
   * @return message
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーメッセージです。</div><div lang=\"en\">A simple string representation of the error and reason.</div>")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error details(List<ErrorDetail> details) {
    this.details = details;
    return this;
  }

  public Error addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ErrorDetail> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

