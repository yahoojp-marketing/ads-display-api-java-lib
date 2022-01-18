package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupAd;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceOperationオブジェクトは、操作を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupAdServiceOperation object is a container for operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceOperationオブジェクトは、操作を表します。</div> <div lang=\"en\">The AdGroupAdServiceOperation object is a container for operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceOperation   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<AdGroupAd> operand = new ArrayList<>();

  public AdGroupAdServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupAdServiceOperation operand(List<AdGroupAd> operand) {
    this.operand = operand;
    return this;
  }

  public AdGroupAdServiceOperation addOperandItem(AdGroupAd operandItem) {
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
@Size(min=1,max=2000) 
  public List<AdGroupAd> getOperand() {
    return operand;
  }

  public void setOperand(List<AdGroupAd> operand) {
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
    AdGroupAdServiceOperation adGroupAdServiceOperation = (AdGroupAdServiceOperation) o;
    return Objects.equals(this.accountId, adGroupAdServiceOperation.accountId) &&
        Objects.equals(this.operand, adGroupAdServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceOperation {\n");
    
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

