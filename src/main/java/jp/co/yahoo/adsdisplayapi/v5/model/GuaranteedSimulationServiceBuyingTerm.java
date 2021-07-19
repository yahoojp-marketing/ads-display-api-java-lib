package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceBuyingTermType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceCustomRangeBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceSingleDayBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceSingleTermBuyingTerm;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceBuyingTermは、商品購入期間情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceBuyingTermは、商品購入期間情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceBuyingTerm   {
  @JsonProperty("buyingTermType")
  private GuaranteedSimulationServiceBuyingTermType buyingTermType = null;

  @JsonProperty("singleDayBuyingTerm")
  private GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm = null;

  @JsonProperty("singleTermBuyingTerm")
  private GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm = null;

  @JsonProperty("customRangeBuyingTerm")
  private GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm = null;

  public GuaranteedSimulationServiceBuyingTerm buyingTermType(GuaranteedSimulationServiceBuyingTermType buyingTermType) {
    this.buyingTermType = buyingTermType;
    return this;
  }

  /**
   * Get buyingTermType
   * @return buyingTermType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceBuyingTermType getBuyingTermType() {
    return buyingTermType;
  }

  public void setBuyingTermType(GuaranteedSimulationServiceBuyingTermType buyingTermType) {
    this.buyingTermType = buyingTermType;
  }

  public GuaranteedSimulationServiceBuyingTerm singleDayBuyingTerm(GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm) {
    this.singleDayBuyingTerm = singleDayBuyingTerm;
    return this;
  }

  /**
   * Get singleDayBuyingTerm
   * @return singleDayBuyingTerm
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceSingleDayBuyingTerm getSingleDayBuyingTerm() {
    return singleDayBuyingTerm;
  }

  public void setSingleDayBuyingTerm(GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm) {
    this.singleDayBuyingTerm = singleDayBuyingTerm;
  }

  public GuaranteedSimulationServiceBuyingTerm singleTermBuyingTerm(GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm) {
    this.singleTermBuyingTerm = singleTermBuyingTerm;
    return this;
  }

  /**
   * Get singleTermBuyingTerm
   * @return singleTermBuyingTerm
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceSingleTermBuyingTerm getSingleTermBuyingTerm() {
    return singleTermBuyingTerm;
  }

  public void setSingleTermBuyingTerm(GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm) {
    this.singleTermBuyingTerm = singleTermBuyingTerm;
  }

  public GuaranteedSimulationServiceBuyingTerm customRangeBuyingTerm(GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm) {
    this.customRangeBuyingTerm = customRangeBuyingTerm;
    return this;
  }

  /**
   * Get customRangeBuyingTerm
   * @return customRangeBuyingTerm
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceCustomRangeBuyingTerm getCustomRangeBuyingTerm() {
    return customRangeBuyingTerm;
  }

  public void setCustomRangeBuyingTerm(GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm) {
    this.customRangeBuyingTerm = customRangeBuyingTerm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceBuyingTerm guaranteedSimulationServiceBuyingTerm = (GuaranteedSimulationServiceBuyingTerm) o;
    return Objects.equals(this.buyingTermType, guaranteedSimulationServiceBuyingTerm.buyingTermType) &&
        Objects.equals(this.singleDayBuyingTerm, guaranteedSimulationServiceBuyingTerm.singleDayBuyingTerm) &&
        Objects.equals(this.singleTermBuyingTerm, guaranteedSimulationServiceBuyingTerm.singleTermBuyingTerm) &&
        Objects.equals(this.customRangeBuyingTerm, guaranteedSimulationServiceBuyingTerm.customRangeBuyingTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingTermType, singleDayBuyingTerm, singleTermBuyingTerm, customRangeBuyingTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceBuyingTerm {\n");
    
    sb.append("    buyingTermType: ").append(toIndentedString(buyingTermType)).append("\n");
    sb.append("    singleDayBuyingTerm: ").append(toIndentedString(singleDayBuyingTerm)).append("\n");
    sb.append("    singleTermBuyingTerm: ").append(toIndentedString(singleTermBuyingTerm)).append("\n");
    sb.append("    customRangeBuyingTerm: ").append(toIndentedString(customRangeBuyingTerm)).append("\n");
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

