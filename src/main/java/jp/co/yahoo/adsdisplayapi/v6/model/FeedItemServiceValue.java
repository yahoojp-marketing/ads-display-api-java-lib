package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceValueオブジェクトは、処理結果を含む商品に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceValue object describes information about item including the result of process.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceValueオブジェクトは、処理結果を含む商品に関する情報を表します。</div> <div lang=\"en\">FeedItemServiceValue object describes information about item including the result of process.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("requestReceived")
  private Boolean requestReceived = null;

  public FeedItemServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public FeedItemServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public FeedItemServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public FeedItemServiceValue requestReceived(Boolean requestReceived) {
    this.requestReceived = requestReceived;
    return this;
  }

  /**
   * <div lang=\"ja\">リクエストを受け付けた結果です。</div> <div lang=\"en\">Result of request</div> 
   * @return requestReceived
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リクエストを受け付けた結果です。</div> <div lang=\"en\">Result of request</div> ")


  public Boolean getRequestReceived() {
    return requestReceived;
  }

  public void setRequestReceived(Boolean requestReceived) {
    this.requestReceived = requestReceived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceValue feedItemServiceValue = (FeedItemServiceValue) o;
    return Objects.equals(this.errors, feedItemServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, feedItemServiceValue.operationSucceeded) &&
        Objects.equals(this.requestReceived, feedItemServiceValue.requestReceived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, requestReceived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    requestReceived: ").append(toIndentedString(requestReceived)).append("\n");
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

