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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsReachPricingPackageは、vimps購入型（リーチ固定）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsReachPricingPackage holds the purchase type setting information about the vimps purchase type (fixed reach).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsReachPricingPackageは、vimps購入型（リーチ固定）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsReachPricingPackage holds the purchase type setting information about the vimps purchase type (fixed reach).<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")

public class GuaranteedSimulationServiceVimpsReachPricingPackage   {
  @JsonProperty("fixedLifetimeBudget")
  private JsonNullable<Long> fixedLifetimeBudget = JsonNullable.undefined();

  @JsonProperty("viewableReach")
  private JsonNullable<Long> viewableReach = JsonNullable.undefined();

  public GuaranteedSimulationServiceVimpsReachPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
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

  public GuaranteedSimulationServiceVimpsReachPricingPackage viewableReach(Long viewableReach) {
    this.viewableReach = JsonNullable.of(viewableReach);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルリーチを表します。</div> <div lang=\"en\">Viewable reach.</div> 
   * @return viewableReach
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルリーチを表します。</div> <div lang=\"en\">Viewable reach.</div> ")


  public JsonNullable<Long> getViewableReach() {
    return viewableReach;
  }

  public void setViewableReach(JsonNullable<Long> viewableReach) {
    this.viewableReach = viewableReach;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceVimpsReachPricingPackage guaranteedSimulationServiceVimpsReachPricingPackage = (GuaranteedSimulationServiceVimpsReachPricingPackage) o;
    return Objects.equals(this.fixedLifetimeBudget, guaranteedSimulationServiceVimpsReachPricingPackage.fixedLifetimeBudget) &&
        Objects.equals(this.viewableReach, guaranteedSimulationServiceVimpsReachPricingPackage.viewableReach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLifetimeBudget, viewableReach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceVimpsReachPricingPackage {\n");
    
    sb.append("    fixedLifetimeBudget: ").append(toIndentedString(fixedLifetimeBudget)).append("\n");
    sb.append("    viewableReach: ").append(toIndentedString(viewableReach)).append("\n");
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

