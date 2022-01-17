package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedSimulation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceOperationオブジェクトは、操作の対象となる配信シミュレーション情報と処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceOperation object describes the delivery simulation information to be operated and the content of the processing.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceOperationオブジェクトは、操作の対象となる配信シミュレーション情報と処理の内容を表します。</div> <div lang=\"en\">GuaranteedSimulationServiceOperation object describes the delivery simulation information to be operated and the content of the processing.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceOperation   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<GuaranteedSimulation> operand = new ArrayList<>();

  public GuaranteedSimulationServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">The account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedSimulationServiceOperation operand(List<GuaranteedSimulation> operand) {
    this.operand = operand;
    return this;
  }

  public GuaranteedSimulationServiceOperation addOperandItem(GuaranteedSimulation operandItem) {
    if (this.operand == null) {
      this.operand = new ArrayList<>();
    }
    this.operand.add(operandItem);
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=1) 
  public List<GuaranteedSimulation> getOperand() {
    return operand;
  }

  public void setOperand(List<GuaranteedSimulation> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceOperation guaranteedSimulationServiceOperation = (GuaranteedSimulationServiceOperation) o;
    return Objects.equals(this.accountId, guaranteedSimulationServiceOperation.accountId) &&
        Objects.equals(this.operand, guaranteedSimulationServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

