package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServicePriceType;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceSlotsPricingPackage;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceVimpsCustomPricingPackage;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceVimpsReachPricingPackage;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedSimulationServiceVimpsSOVPricingPackage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServicePricingPackageは、商品の購入タイプ設定の情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServicePricingPackage holds information about purchase type setting of package.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServicePricingPackageは、商品の購入タイプ設定の情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePricingPackage holds information about purchase type setting of package.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServicePricingPackage   {
  @JsonProperty("priceType")
  private GuaranteedSimulationServicePriceType priceType = null;

  @JsonProperty("vimpsCustomPricingPackage")
  private GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage = null;

  @JsonProperty("vimpsSOVPricingPackage")
  private GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage = null;

  @JsonProperty("vimpsReachPricingPackage")
  private GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage = null;

  @JsonProperty("slotsPricingPackage")
  private GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage = null;

  public GuaranteedSimulationServicePricingPackage priceType(GuaranteedSimulationServicePriceType priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(GuaranteedSimulationServicePriceType priceType) {
    this.priceType = priceType;
  }

  public GuaranteedSimulationServicePricingPackage vimpsCustomPricingPackage(GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage) {
    this.vimpsCustomPricingPackage = vimpsCustomPricingPackage;
    return this;
  }

  /**
   * Get vimpsCustomPricingPackage
   * @return vimpsCustomPricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceVimpsCustomPricingPackage getVimpsCustomPricingPackage() {
    return vimpsCustomPricingPackage;
  }

  public void setVimpsCustomPricingPackage(GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage) {
    this.vimpsCustomPricingPackage = vimpsCustomPricingPackage;
  }

  public GuaranteedSimulationServicePricingPackage vimpsSOVPricingPackage(GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage) {
    this.vimpsSOVPricingPackage = vimpsSOVPricingPackage;
    return this;
  }

  /**
   * Get vimpsSOVPricingPackage
   * @return vimpsSOVPricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceVimpsSOVPricingPackage getVimpsSOVPricingPackage() {
    return vimpsSOVPricingPackage;
  }

  public void setVimpsSOVPricingPackage(GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage) {
    this.vimpsSOVPricingPackage = vimpsSOVPricingPackage;
  }

  public GuaranteedSimulationServicePricingPackage vimpsReachPricingPackage(GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage) {
    this.vimpsReachPricingPackage = vimpsReachPricingPackage;
    return this;
  }

  /**
   * Get vimpsReachPricingPackage
   * @return vimpsReachPricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceVimpsReachPricingPackage getVimpsReachPricingPackage() {
    return vimpsReachPricingPackage;
  }

  public void setVimpsReachPricingPackage(GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage) {
    this.vimpsReachPricingPackage = vimpsReachPricingPackage;
  }

  public GuaranteedSimulationServicePricingPackage slotsPricingPackage(GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage) {
    this.slotsPricingPackage = slotsPricingPackage;
    return this;
  }

  /**
   * Get slotsPricingPackage
   * @return slotsPricingPackage
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceSlotsPricingPackage getSlotsPricingPackage() {
    return slotsPricingPackage;
  }

  public void setSlotsPricingPackage(GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage) {
    this.slotsPricingPackage = slotsPricingPackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePricingPackage guaranteedSimulationServicePricingPackage = (GuaranteedSimulationServicePricingPackage) o;
    return Objects.equals(this.priceType, guaranteedSimulationServicePricingPackage.priceType) &&
        Objects.equals(this.vimpsCustomPricingPackage, guaranteedSimulationServicePricingPackage.vimpsCustomPricingPackage) &&
        Objects.equals(this.vimpsSOVPricingPackage, guaranteedSimulationServicePricingPackage.vimpsSOVPricingPackage) &&
        Objects.equals(this.vimpsReachPricingPackage, guaranteedSimulationServicePricingPackage.vimpsReachPricingPackage) &&
        Objects.equals(this.slotsPricingPackage, guaranteedSimulationServicePricingPackage.slotsPricingPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceType, vimpsCustomPricingPackage, vimpsSOVPricingPackage, vimpsReachPricingPackage, slotsPricingPackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePricingPackage {\n");
    
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    vimpsCustomPricingPackage: ").append(toIndentedString(vimpsCustomPricingPackage)).append("\n");
    sb.append("    vimpsSOVPricingPackage: ").append(toIndentedString(vimpsSOVPricingPackage)).append("\n");
    sb.append("    vimpsReachPricingPackage: ").append(toIndentedString(vimpsReachPricingPackage)).append("\n");
    sb.append("    slotsPricingPackage: ").append(toIndentedString(slotsPricingPackage)).append("\n");
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

