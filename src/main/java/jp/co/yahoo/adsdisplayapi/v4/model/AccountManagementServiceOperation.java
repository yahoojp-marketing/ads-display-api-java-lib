package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AccountManagement;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceOperationオブジェクトは、操作対象となるアカウント情報と処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceOperation object describes account information for operation and list of operations.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceOperationオブジェクトは、操作対象となるアカウント情報と処理の内容を表します。</div> <div lang=\"en\">AccountManagementServiceOperation object describes account information for operation and list of operations.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("operand")
  @Valid
  private List<AccountManagement> operand = new ArrayList<>();

  public AccountManagementServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SET時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation and ignored in ADD operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、SET時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation and ignored in ADD operation. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountManagementServiceOperation operand(List<AccountManagement> operand) {
    this.operand = operand;
    return this;
  }

  public AccountManagementServiceOperation addOperandItem(AccountManagement operandItem) {
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
  public List<AccountManagement> getOperand() {
    return operand;
  }

  public void setOperand(List<AccountManagement> operand) {
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
    AccountManagementServiceOperation accountManagementServiceOperation = (AccountManagementServiceOperation) o;
    return Objects.equals(this.accountId, accountManagementServiceOperation.accountId) &&
        Objects.equals(this.operand, accountManagementServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceOperation {\n");
    
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

