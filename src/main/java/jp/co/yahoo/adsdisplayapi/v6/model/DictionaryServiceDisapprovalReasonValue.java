package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.DictionaryServiceDisapprovalReason;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReasonValueオブジェクトは、 EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReasonValue object is a container of EditorialReason list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceDisapprovalReasonValueオブジェクトは、 EditorialReason一覧を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceDisapprovalReasonValue object is a container of EditorialReason list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceDisapprovalReasonValue   {
  @JsonProperty("disapprovalReason")
  private DictionaryServiceDisapprovalReason disapprovalReason = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public DictionaryServiceDisapprovalReasonValue disapprovalReason(DictionaryServiceDisapprovalReason disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
    return this;
  }

  /**
   * Get disapprovalReason
   * @return disapprovalReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceDisapprovalReason getDisapprovalReason() {
    return disapprovalReason;
  }

  public void setDisapprovalReason(DictionaryServiceDisapprovalReason disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
  }

  public DictionaryServiceDisapprovalReasonValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public DictionaryServiceDisapprovalReasonValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceDisapprovalReasonValue operationSucceeded(Boolean operationSucceeded) {
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
    DictionaryServiceDisapprovalReasonValue dictionaryServiceDisapprovalReasonValue = (DictionaryServiceDisapprovalReasonValue) o;
    return Objects.equals(this.disapprovalReason, dictionaryServiceDisapprovalReasonValue.disapprovalReason) &&
        Objects.equals(this.errors, dictionaryServiceDisapprovalReasonValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceDisapprovalReasonValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReason, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReasonValue {\n");
    
    sb.append("    disapprovalReason: ").append(toIndentedString(disapprovalReason)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

