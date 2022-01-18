package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.Error;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーション情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceValue object describes information about the guaranteed campaign delivery simulation including the operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceValueオブジェクトは、操作結果を含む予約型キャンペーンの配信シミュレーション情報を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceValue object describes information about the guaranteed campaign delivery simulation including the operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceValue   {
  @JsonProperty("guaranteedSimulation")
  private GuaranteedSimulation guaranteedSimulation = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public GuaranteedSimulationServiceValue guaranteedSimulation(GuaranteedSimulation guaranteedSimulation) {
    this.guaranteedSimulation = guaranteedSimulation;
    return this;
  }

  /**
   * Get guaranteedSimulation
   * @return guaranteedSimulation
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulation getGuaranteedSimulation() {
    return guaranteedSimulation;
  }

  public void setGuaranteedSimulation(GuaranteedSimulation guaranteedSimulation) {
    this.guaranteedSimulation = guaranteedSimulation;
  }

  public GuaranteedSimulationServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GuaranteedSimulationServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> 
   * @return errors
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラー内容です。</div> <div lang=\"en\">Error content.</div> ")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public GuaranteedSimulationServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    GuaranteedSimulationServiceValue guaranteedSimulationServiceValue = (GuaranteedSimulationServiceValue) o;
    return Objects.equals(this.guaranteedSimulation, guaranteedSimulationServiceValue.guaranteedSimulation) &&
        Objects.equals(this.errors, guaranteedSimulationServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, guaranteedSimulationServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guaranteedSimulation, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceValue {\n");
    
    sb.append("    guaranteedSimulation: ").append(toIndentedString(guaranteedSimulation)).append("\n");
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

