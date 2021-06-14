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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsSOVPricingPackageは、vimps購入型（SOV）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsSOVPricingPackage holds the purchase type setting information about the vimps purchase type (share of voice).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsSOVPricingPackageは、vimps購入型（SOV）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsSOVPricingPackage holds the purchase type setting information about the vimps purchase type (share of voice).<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")

public class GuaranteedSimulationServiceVimpsSOVPricingPackage   {
  @JsonProperty("fixedLifetimeBudget")
  private JsonNullable<Long> fixedLifetimeBudget = JsonNullable.undefined();

  @JsonProperty("sovRate")
  private JsonNullable<Long> sovRate = JsonNullable.undefined();

  public GuaranteedSimulationServiceVimpsSOVPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
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

  public GuaranteedSimulationServiceVimpsSOVPricingPackage sovRate(Long sovRate) {
    this.sovRate = JsonNullable.of(sovRate);
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<Long> getSovRate() {
    return sovRate;
  }

  public void setSovRate(JsonNullable<Long> sovRate) {
    this.sovRate = sovRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceVimpsSOVPricingPackage guaranteedSimulationServiceVimpsSOVPricingPackage = (GuaranteedSimulationServiceVimpsSOVPricingPackage) o;
    return Objects.equals(this.fixedLifetimeBudget, guaranteedSimulationServiceVimpsSOVPricingPackage.fixedLifetimeBudget) &&
        Objects.equals(this.sovRate, guaranteedSimulationServiceVimpsSOVPricingPackage.sovRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLifetimeBudget, sovRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceVimpsSOVPricingPackage {\n");
    
    sb.append("    fixedLifetimeBudget: ").append(toIndentedString(fixedLifetimeBudget)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
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

