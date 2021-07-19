package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedFtpRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpRequestServiceValueオブジェクトは、操作結果を含む即時アップロードリクエスト情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpRequestServiceValue object describes Item List information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpRequestServiceValueオブジェクトは、操作結果を含む即時アップロードリクエスト情報を表します。</div> <div lang=\"en\">FeedFtpRequestServiceValue object describes Item List information including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedFtpRequestServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("feedFtpRequest")
  private FeedFtpRequest feedFtpRequest = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public FeedFtpRequestServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public FeedFtpRequestServiceValue addErrorsItem(Error errorsItem) {
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

  public FeedFtpRequestServiceValue feedFtpRequest(FeedFtpRequest feedFtpRequest) {
    this.feedFtpRequest = feedFtpRequest;
    return this;
  }

  /**
   * Get feedFtpRequest
   * @return feedFtpRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedFtpRequest getFeedFtpRequest() {
    return feedFtpRequest;
  }

  public void setFeedFtpRequest(FeedFtpRequest feedFtpRequest) {
    this.feedFtpRequest = feedFtpRequest;
  }

  public FeedFtpRequestServiceValue operationSucceeded(Boolean operationSucceeded) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedFtpRequestServiceValue feedFtpRequestServiceValue = (FeedFtpRequestServiceValue) o;
    return Objects.equals(this.errors, feedFtpRequestServiceValue.errors) &&
        Objects.equals(this.feedFtpRequest, feedFtpRequestServiceValue.feedFtpRequest) &&
        Objects.equals(this.operationSucceeded, feedFtpRequestServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, feedFtpRequest, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpRequestServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    feedFtpRequest: ").append(toIndentedString(feedFtpRequest)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

