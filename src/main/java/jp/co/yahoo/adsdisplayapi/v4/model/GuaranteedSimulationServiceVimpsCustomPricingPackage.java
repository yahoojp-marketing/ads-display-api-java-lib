package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceVimpsCustomPricingPackage   {
  @JsonProperty("fixedLifetimeBudget")
  private Long fixedLifetimeBudget = null;

  @JsonProperty("minimumPurchaseVImps")
  private Long minimumPurchaseVImps = null;

  @JsonProperty("maximumPurchaseVImps")
  private Long maximumPurchaseVImps = null;

  public GuaranteedSimulationServiceVimpsCustomPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
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

  public GuaranteedSimulationServiceVimpsCustomPricingPackage minimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> 
   * @return minimumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> ")


  public Long getMinimumPurchaseVImps() {
    return minimumPurchaseVImps;
  }

  public void setMinimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
  }

  public GuaranteedSimulationServiceVimpsCustomPricingPackage maximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
    return this;
  }

  /**
   * <div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> 
   * @return maximumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> ")


  public Long getMaximumPurchaseVImps() {
    return maximumPurchaseVImps;
  }

  public void setMaximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceVimpsCustomPricingPackage guaranteedSimulationServiceVimpsCustomPricingPackage = (GuaranteedSimulationServiceVimpsCustomPricingPackage) o;
    return Objects.equals(this.fixedLifetimeBudget, guaranteedSimulationServiceVimpsCustomPricingPackage.fixedLifetimeBudget) &&
        Objects.equals(this.minimumPurchaseVImps, guaranteedSimulationServiceVimpsCustomPricingPackage.minimumPurchaseVImps) &&
        Objects.equals(this.maximumPurchaseVImps, guaranteedSimulationServiceVimpsCustomPricingPackage.maximumPurchaseVImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLifetimeBudget, minimumPurchaseVImps, maximumPurchaseVImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceVimpsCustomPricingPackage {\n");
    
    sb.append("    fixedLifetimeBudget: ").append(toIndentedString(fixedLifetimeBudget)).append("\n");
    sb.append("    minimumPurchaseVImps: ").append(toIndentedString(minimumPurchaseVImps)).append("\n");
    sb.append("    maximumPurchaseVImps: ").append(toIndentedString(maximumPurchaseVImps)).append("\n");
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

