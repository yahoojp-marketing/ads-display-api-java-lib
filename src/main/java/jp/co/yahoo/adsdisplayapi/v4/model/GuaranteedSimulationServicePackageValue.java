package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.Error;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServicePackage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServicePackageValueオブジェクトは、商品情報を取得するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServicePackageValue object is a container that retrieves package information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServicePackageValueオブジェクトは、商品情報を取得するコンテナです。</div> <div lang=\"en\">GuaranteedSimulationServicePackageValue object is a container that retrieves package information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePackageValue   {
  @JsonProperty("package")
  private GuaranteedSimulationServicePackage _package = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public GuaranteedSimulationServicePackageValue _package(GuaranteedSimulationServicePackage _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePackage getPackage() {
    return _package;
  }

  public void setPackage(GuaranteedSimulationServicePackage _package) {
    this._package = _package;
  }

  public GuaranteedSimulationServicePackageValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GuaranteedSimulationServicePackageValue addErrorsItem(Error errorsItem) {
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

  public GuaranteedSimulationServicePackageValue operationSucceeded(Boolean operationSucceeded) {
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
    GuaranteedSimulationServicePackageValue guaranteedSimulationServicePackageValue = (GuaranteedSimulationServicePackageValue) o;
    return Objects.equals(this._package, guaranteedSimulationServicePackageValue._package) &&
        Objects.equals(this.errors, guaranteedSimulationServicePackageValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedSimulationServicePackageValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_package, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePackageValue {\n");
    
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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

