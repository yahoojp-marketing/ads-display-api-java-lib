package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceInvoice;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServicePaymentType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AccountManagementServicePaymentオブジェクトは、支払情報を保持します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AccountManagementServicePayment object contains the payment information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AccountManagementServicePaymentオブジェクトは、支払情報を保持します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> AccountManagementServicePayment object contains the payment information.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServicePayment   {
  @JsonProperty("invoice")
  private AccountManagementServiceInvoice invoice = null;

  @JsonProperty("paymentType")
  private AccountManagementServicePaymentType paymentType = null;

  public AccountManagementServicePayment invoice(AccountManagementServiceInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(AccountManagementServiceInvoice invoice) {
    this.invoice = invoice;
  }

  public AccountManagementServicePayment paymentType(AccountManagementServicePaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServicePaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(AccountManagementServicePaymentType paymentType) {
    this.paymentType = paymentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementServicePayment accountManagementServicePayment = (AccountManagementServicePayment) o;
    return Objects.equals(this.invoice, accountManagementServicePayment.invoice) &&
        Objects.equals(this.paymentType, accountManagementServicePayment.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, paymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServicePayment {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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

