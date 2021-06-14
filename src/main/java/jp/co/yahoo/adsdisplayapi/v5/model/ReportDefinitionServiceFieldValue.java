package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.Error;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceFieldAttribute;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceFieldValueは、取得される使用可能なレポートのエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceFieldValue displays the usable report entry to be retrieved.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceFieldValueは、取得される使用可能なレポートのエントリーを表します。</div> <div lang=\"en\">ReportDefinitionServiceFieldValue displays the usable report entry to be retrieved.</div> ")

public class ReportDefinitionServiceFieldValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("fields")
  @Valid
  private JsonNullable<List<ReportDefinitionServiceFieldAttribute>> fields = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public ReportDefinitionServiceFieldValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public ReportDefinitionServiceFieldValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public ReportDefinitionServiceFieldValue fields(List<ReportDefinitionServiceFieldAttribute> fields) {
    this.fields = JsonNullable.of(fields);
    return this;
  }

  public ReportDefinitionServiceFieldValue addFieldsItem(ReportDefinitionServiceFieldAttribute fieldsItem) {
    if (this.fields == null || !this.fields.isPresent()) {
      this.fields = JsonNullable.of(new ArrayList<>());
    }
    this.fields.get().add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ReportDefinitionServiceFieldAttribute>> getFields() {
    return fields;
  }

  public void setFields(JsonNullable<List<ReportDefinitionServiceFieldAttribute>> fields) {
    this.fields = fields;
  }

  public ReportDefinitionServiceFieldValue operationSucceeded(Boolean operationSucceeded) {
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
    ReportDefinitionServiceFieldValue reportDefinitionServiceFieldValue = (ReportDefinitionServiceFieldValue) o;
    return Objects.equals(this.errors, reportDefinitionServiceFieldValue.errors) &&
        Objects.equals(this.fields, reportDefinitionServiceFieldValue.fields) &&
        Objects.equals(this.operationSucceeded, reportDefinitionServiceFieldValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, fields, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceFieldValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

