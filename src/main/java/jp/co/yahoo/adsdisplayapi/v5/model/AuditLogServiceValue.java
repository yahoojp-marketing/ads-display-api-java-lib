package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AuditLogServiceJob;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceValueオブジェクトは、get/addメソッドの実行結果（1エンティティ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceValue object is container storing the result of get/add method (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceValueオブジェクトは、get/addメソッドの実行結果（1エンティティ）を保持するオブジェクトです。</div> <div lang=\"en\">AuditLogServiceValue object is container storing the result of get/add method (1 entity).</div> ")

public class AuditLogServiceValue   {
  @JsonProperty("auditLogJob")
  private JsonNullable<AuditLogServiceJob> auditLogJob = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public AuditLogServiceValue auditLogJob(AuditLogServiceJob auditLogJob) {
    this.auditLogJob = JsonNullable.of(auditLogJob);
    return this;
  }

  /**
   * Get auditLogJob
   * @return auditLogJob
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceJob> getAuditLogJob() {
    return auditLogJob;
  }

  public void setAuditLogJob(JsonNullable<AuditLogServiceJob> auditLogJob) {
    this.auditLogJob = auditLogJob;
  }

  public AuditLogServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public AuditLogServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public AuditLogServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceValue auditLogServiceValue = (AuditLogServiceValue) o;
    return Objects.equals(this.auditLogJob, auditLogServiceValue.auditLogJob) &&
        Objects.equals(this.errors, auditLogServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, auditLogServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditLogJob, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceValue {\n");
    
    sb.append("    auditLogJob: ").append(toIndentedString(auditLogJob)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

