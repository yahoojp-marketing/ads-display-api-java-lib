package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceBuyingTermは、範囲指定の商品購入期間情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term with range specified.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceBuyingTermは、範囲指定の商品購入期間情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term with range specified.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceCustomRangeBuyingTerm   {
  @JsonProperty("buyingTermDateMinRange")
  private Long buyingTermDateMinRange = null;

  @JsonProperty("buyingTermDateMaxRange")
  private Long buyingTermDateMaxRange = null;

  public GuaranteedSimulationServiceCustomRangeBuyingTerm buyingTermDateMinRange(Long buyingTermDateMinRange) {
    this.buyingTermDateMinRange = buyingTermDateMinRange;
    return this;
  }

  /**
   * <div lang=\"ja\">商品購入期間日数（範囲最小）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (minimum range).</div> 
   * @return buyingTermDateMinRange
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品購入期間日数（範囲最小）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (minimum range).</div> ")


  public Long getBuyingTermDateMinRange() {
    return buyingTermDateMinRange;
  }

  public void setBuyingTermDateMinRange(Long buyingTermDateMinRange) {
    this.buyingTermDateMinRange = buyingTermDateMinRange;
  }

  public GuaranteedSimulationServiceCustomRangeBuyingTerm buyingTermDateMaxRange(Long buyingTermDateMaxRange) {
    this.buyingTermDateMaxRange = buyingTermDateMaxRange;
    return this;
  }

  /**
   * <div lang=\"ja\">商品購入期間日数（範囲最大）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (maximum range).</div> 
   * @return buyingTermDateMaxRange
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品購入期間日数（範囲最大）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (maximum range).</div> ")


  public Long getBuyingTermDateMaxRange() {
    return buyingTermDateMaxRange;
  }

  public void setBuyingTermDateMaxRange(Long buyingTermDateMaxRange) {
    this.buyingTermDateMaxRange = buyingTermDateMaxRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceCustomRangeBuyingTerm guaranteedSimulationServiceCustomRangeBuyingTerm = (GuaranteedSimulationServiceCustomRangeBuyingTerm) o;
    return Objects.equals(this.buyingTermDateMinRange, guaranteedSimulationServiceCustomRangeBuyingTerm.buyingTermDateMinRange) &&
        Objects.equals(this.buyingTermDateMaxRange, guaranteedSimulationServiceCustomRangeBuyingTerm.buyingTermDateMaxRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingTermDateMinRange, buyingTermDateMaxRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceCustomRangeBuyingTerm {\n");
    
    sb.append("    buyingTermDateMinRange: ").append(toIndentedString(buyingTermDateMinRange)).append("\n");
    sb.append("    buyingTermDateMaxRange: ").append(toIndentedString(buyingTermDateMaxRange)).append("\n");
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

