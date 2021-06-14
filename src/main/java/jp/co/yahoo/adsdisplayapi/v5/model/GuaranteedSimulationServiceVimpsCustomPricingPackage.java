package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")

public class GuaranteedSimulationServiceVimpsCustomPricingPackage   {
  @JsonProperty("fixedLifetimeBudget")
  private JsonNullable<Long> fixedLifetimeBudget = JsonNullable.undefined();

  @JsonProperty("minimumPurchaseBudget")
  private JsonNullable<Long> minimumPurchaseBudget = JsonNullable.undefined();

  @JsonProperty("minimumPurchaseVImps")
  private JsonNullable<Long> minimumPurchaseVImps = JsonNullable.undefined();

  @JsonProperty("maximumPurchaseVImps")
  private JsonNullable<Long> maximumPurchaseVImps = JsonNullable.undefined();

  public GuaranteedSimulationServiceVimpsCustomPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
    this.fixedLifetimeBudget = JsonNullable.of(fixedLifetimeBudget);
    return this;
  }

  /**
   * <div lang=\"ja\">商品価格を表します。</div> <div lang=\"en\">Package price.</div> 
   * @return fixedLifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品価格を表します。</div> <div lang=\"en\">Package price.</div> ")


  public JsonNullable<Long> getFixedLifetimeBudget() {
    return fixedLifetimeBudget;
  }

  public void setFixedLifetimeBudget(JsonNullable<Long> fixedLifetimeBudget) {
    this.fixedLifetimeBudget = fixedLifetimeBudget;
  }

  public GuaranteedSimulationServiceVimpsCustomPricingPackage minimumPurchaseBudget(Long minimumPurchaseBudget) {
    this.minimumPurchaseBudget = JsonNullable.of(minimumPurchaseBudget);
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入価格を表します。</div> <div lang=\"en\">Minimum Purchase price.</div> 
   * @return minimumPurchaseBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入価格を表します。</div> <div lang=\"en\">Minimum Purchase price.</div> ")


  public JsonNullable<Long> getMinimumPurchaseBudget() {
    return minimumPurchaseBudget;
  }

  public void setMinimumPurchaseBudget(JsonNullable<Long> minimumPurchaseBudget) {
    this.minimumPurchaseBudget = minimumPurchaseBudget;
  }

  public GuaranteedSimulationServiceVimpsCustomPricingPackage minimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = JsonNullable.of(minimumPurchaseVImps);
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> 
   * @return minimumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> ")


  public JsonNullable<Long> getMinimumPurchaseVImps() {
    return minimumPurchaseVImps;
  }

  public void setMinimumPurchaseVImps(JsonNullable<Long> minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
  }

  public GuaranteedSimulationServiceVimpsCustomPricingPackage maximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = JsonNullable.of(maximumPurchaseVImps);
    return this;
  }

  /**
   * <div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> 
   * @return maximumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> ")


  public JsonNullable<Long> getMaximumPurchaseVImps() {
    return maximumPurchaseVImps;
  }

  public void setMaximumPurchaseVImps(JsonNullable<Long> maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceVimpsCustomPricingPackage guaranteedSimulationServiceVimpsCustomPricingPackage = (GuaranteedSimulationServiceVimpsCustomPricingPackage) o;
    return Objects.equals(this.fixedLifetimeBudget, guaranteedSimulationServiceVimpsCustomPricingPackage.fixedLifetimeBudget) &&
        Objects.equals(this.minimumPurchaseBudget, guaranteedSimulationServiceVimpsCustomPricingPackage.minimumPurchaseBudget) &&
        Objects.equals(this.minimumPurchaseVImps, guaranteedSimulationServiceVimpsCustomPricingPackage.minimumPurchaseVImps) &&
        Objects.equals(this.maximumPurchaseVImps, guaranteedSimulationServiceVimpsCustomPricingPackage.maximumPurchaseVImps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLifetimeBudget, minimumPurchaseBudget, minimumPurchaseVImps, maximumPurchaseVImps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceVimpsCustomPricingPackage {\n");
    
    sb.append("    fixedLifetimeBudget: ").append(toIndentedString(fixedLifetimeBudget)).append("\n");
    sb.append("    minimumPurchaseBudget: ").append(toIndentedString(minimumPurchaseBudget)).append("\n");
    sb.append("    minimumPurchaseVImps: ").append(toIndentedString(minimumPurchaseVImps)).append("\n");
    sb.append("    maximumPurchaseVImps: ").append(toIndentedString(maximumPurchaseVImps)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

