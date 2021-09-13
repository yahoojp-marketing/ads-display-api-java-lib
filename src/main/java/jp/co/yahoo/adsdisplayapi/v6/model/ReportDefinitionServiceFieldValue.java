package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.Error;
import jp.co.yahoo.adsdisplayapi.v6.model.ReportDefinitionServiceFieldAttribute;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceFieldValueは、取得される使用可能なレポートのエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceFieldValue displays the usable report entry to be retrieved.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceFieldValueは、取得される使用可能なレポートのエントリーを表します。</div> <div lang=\"en\">ReportDefinitionServiceFieldValue displays the usable report entry to be retrieved.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceFieldValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("fields")
  @Valid
  private List<ReportDefinitionServiceFieldAttribute> fields = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public ReportDefinitionServiceFieldValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ReportDefinitionServiceFieldValue addErrorsItem(Error errorsItem) {
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

  public ReportDefinitionServiceFieldValue fields(List<ReportDefinitionServiceFieldAttribute> fields) {
    this.fields = fields;
    return this;
  }

  public ReportDefinitionServiceFieldValue addFieldsItem(ReportDefinitionServiceFieldAttribute fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReportDefinitionServiceFieldAttribute> getFields() {
    return fields;
  }

  public void setFields(List<ReportDefinitionServiceFieldAttribute> fields) {
    this.fields = fields;
  }

  public ReportDefinitionServiceFieldValue operationSucceeded(Boolean operationSucceeded) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

