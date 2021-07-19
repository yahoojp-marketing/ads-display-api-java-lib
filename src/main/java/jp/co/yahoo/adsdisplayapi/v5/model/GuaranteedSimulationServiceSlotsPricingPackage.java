package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceFixedBudgetApplyTermType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceSlotsPricingPackageは、枠購入型の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceSlotsPricingPackage holds purchase type setting information of slots purchase type.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceSlotsPricingPackageは、枠購入型の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceSlotsPricingPackage holds purchase type setting information of slots purchase type.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceSlotsPricingPackage   {
  @JsonProperty("fixedLifetimeBudget")
  private Long fixedLifetimeBudget = null;

  @JsonProperty("fixedBudgetApplyTermType")
  private GuaranteedSimulationServiceFixedBudgetApplyTermType fixedBudgetApplyTermType = null;

  @JsonProperty("sellingSlots")
  private Long sellingSlots = null;

  @JsonProperty("minimumBuyingSlots")
  private Long minimumBuyingSlots = null;

  public GuaranteedSimulationServiceSlotsPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
    this.fixedLifetimeBudget = fixedLifetimeBudget;
    return this;
  }

  /**
   * <div lang=\"ja\">商品価格を表します。</div> <div lang=\"en\">Package price.</div> 
   * @return fixedLifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品価格を表します。</div> <div lang=\"en\">Package price.</div> ")


  public Long getFixedLifetimeBudget() {
    return fixedLifetimeBudget;
  }

  public void setFixedLifetimeBudget(Long fixedLifetimeBudget) {
    this.fixedLifetimeBudget = fixedLifetimeBudget;
  }

  public GuaranteedSimulationServiceSlotsPricingPackage fixedBudgetApplyTermType(GuaranteedSimulationServiceFixedBudgetApplyTermType fixedBudgetApplyTermType) {
    this.fixedBudgetApplyTermType = fixedBudgetApplyTermType;
    return this;
  }

  /**
   * Get fixedBudgetApplyTermType
   * @return fixedBudgetApplyTermType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceFixedBudgetApplyTermType getFixedBudgetApplyTermType() {
    return fixedBudgetApplyTermType;
  }

  public void setFixedBudgetApplyTermType(GuaranteedSimulationServiceFixedBudgetApplyTermType fixedBudgetApplyTermType) {
    this.fixedBudgetApplyTermType = fixedBudgetApplyTermType;
  }

  public GuaranteedSimulationServiceSlotsPricingPackage sellingSlots(Long sellingSlots) {
    this.sellingSlots = sellingSlots;
    return this;
  }

  /**
   * <div lang=\"ja\">販売枠数を表します。</div> <div lang=\"en\">Number of selling slots.</div> 
   * @return sellingSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\">販売枠数を表します。</div> <div lang=\"en\">Number of selling slots.</div> ")


  public Long getSellingSlots() {
    return sellingSlots;
  }

  public void setSellingSlots(Long sellingSlots) {
    this.sellingSlots = sellingSlots;
  }

  public GuaranteedSimulationServiceSlotsPricingPackage minimumBuyingSlots(Long minimumBuyingSlots) {
    this.minimumBuyingSlots = minimumBuyingSlots;
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入枠数を表します。</div> <div lang=\"en\">Minimum number of purchase slots.</div> 
   * @return minimumBuyingSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入枠数を表します。</div> <div lang=\"en\">Minimum number of purchase slots.</div> ")


  public Long getMinimumBuyingSlots() {
    return minimumBuyingSlots;
  }

  public void setMinimumBuyingSlots(Long minimumBuyingSlots) {
    this.minimumBuyingSlots = minimumBuyingSlots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceSlotsPricingPackage guaranteedSimulationServiceSlotsPricingPackage = (GuaranteedSimulationServiceSlotsPricingPackage) o;
    return Objects.equals(this.fixedLifetimeBudget, guaranteedSimulationServiceSlotsPricingPackage.fixedLifetimeBudget) &&
        Objects.equals(this.fixedBudgetApplyTermType, guaranteedSimulationServiceSlotsPricingPackage.fixedBudgetApplyTermType) &&
        Objects.equals(this.sellingSlots, guaranteedSimulationServiceSlotsPricingPackage.sellingSlots) &&
        Objects.equals(this.minimumBuyingSlots, guaranteedSimulationServiceSlotsPricingPackage.minimumBuyingSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLifetimeBudget, fixedBudgetApplyTermType, sellingSlots, minimumBuyingSlots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSlotsPricingPackage {\n");
    
    sb.append("    fixedLifetimeBudget: ").append(toIndentedString(fixedLifetimeBudget)).append("\n");
    sb.append("    fixedBudgetApplyTermType: ").append(toIndentedString(fixedBudgetApplyTermType)).append("\n");
    sb.append("    sellingSlots: ").append(toIndentedString(sellingSlots)).append("\n");
    sb.append("    minimumBuyingSlots: ").append(toIndentedString(minimumBuyingSlots)).append("\n");
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

