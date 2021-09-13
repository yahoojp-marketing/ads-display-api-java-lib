package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.FeedFtp;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedFtpServiceValueオブジェクトは、操作結果を含む定期アップロード設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedFtpServiceValue object displays Periodic Upload setting information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedFtpServiceValueオブジェクトは、操作結果を含む定期アップロード設定情報を表します。</div> <div lang=\"en\">FeedFtpServiceValue object displays Periodic Upload setting information including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedFtpServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("feedFtp")
  private FeedFtp feedFtp = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public FeedFtpServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public FeedFtpServiceValue addErrorsItem(Error errorsItem) {
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

  public FeedFtpServiceValue feedFtp(FeedFtp feedFtp) {
    this.feedFtp = feedFtp;
    return this;
  }

  /**
   * Get feedFtp
   * @return feedFtp
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedFtp getFeedFtp() {
    return feedFtp;
  }

  public void setFeedFtp(FeedFtp feedFtp) {
    this.feedFtp = feedFtp;
  }

  public FeedFtpServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    FeedFtpServiceValue feedFtpServiceValue = (FeedFtpServiceValue) o;
    return Objects.equals(this.errors, feedFtpServiceValue.errors) &&
        Objects.equals(this.feedFtp, feedFtpServiceValue.feedFtp) &&
        Objects.equals(this.operationSucceeded, feedFtpServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, feedFtp, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFtpServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    feedFtp: ").append(toIndentedString(feedFtp)).append("\n");
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

