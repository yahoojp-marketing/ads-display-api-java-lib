package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import jp.co.yahoo.adsdisplayapi.v7.model.ReportDefinition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceValueオブジェクトは、操作結果を含むレポート定義を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The ReportDefinitionServiceValue object is a container that holds report definitions, including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceValueオブジェクトは、操作結果を含むレポート定義を表します。</div> <div lang=\"en\">The ReportDefinitionServiceValue object is a container that holds report definitions, including operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("reportDefinition")
  private ReportDefinition reportDefinition = null;

  public ReportDefinitionServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ReportDefinitionServiceValue addErrorsItem(Error errorsItem) {
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

  public ReportDefinitionServiceValue operationSucceeded(Boolean operationSucceeded) {
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

  public ReportDefinitionServiceValue reportDefinition(ReportDefinition reportDefinition) {
    this.reportDefinition = reportDefinition;
    return this;
  }

  /**
   * Get reportDefinition
   * @return reportDefinition
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinition getReportDefinition() {
    return reportDefinition;
  }

  public void setReportDefinition(ReportDefinition reportDefinition) {
    this.reportDefinition = reportDefinition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceValue reportDefinitionServiceValue = (ReportDefinitionServiceValue) o;
    return Objects.equals(this.errors, reportDefinitionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, reportDefinitionServiceValue.operationSucceeded) &&
        Objects.equals(this.reportDefinition, reportDefinitionServiceValue.reportDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, reportDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    reportDefinition: ").append(toIndentedString(reportDefinition)).append("\n");
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

