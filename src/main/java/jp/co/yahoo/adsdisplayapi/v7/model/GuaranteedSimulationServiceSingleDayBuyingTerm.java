package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceSingleDayBuyingTermは、単一日指定の商品購入期間情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceSingleDayBuyingTerm holds information about the package purchase term specified for a single day.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceSingleDayBuyingTermは、単一日指定の商品購入期間情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceSingleDayBuyingTerm holds information about the package purchase term specified for a single day.<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceSingleDayBuyingTerm   {
  @JsonProperty("buyingSingleDayTerm")
  private Long buyingSingleDayTerm = null;

  public GuaranteedSimulationServiceSingleDayBuyingTerm buyingSingleDayTerm(Long buyingSingleDayTerm) {
    this.buyingSingleDayTerm = buyingSingleDayTerm;
    return this;
  }

  /**
   * <div lang=\"ja\">商品購入期間（単一日）を表します。</div> <div lang=\"en\">Package purchase term (single day).</div> 
   * @return buyingSingleDayTerm
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品購入期間（単一日）を表します。</div> <div lang=\"en\">Package purchase term (single day).</div> ")


  public Long getBuyingSingleDayTerm() {
    return buyingSingleDayTerm;
  }

  public void setBuyingSingleDayTerm(Long buyingSingleDayTerm) {
    this.buyingSingleDayTerm = buyingSingleDayTerm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceSingleDayBuyingTerm guaranteedSimulationServiceSingleDayBuyingTerm = (GuaranteedSimulationServiceSingleDayBuyingTerm) o;
    return Objects.equals(this.buyingSingleDayTerm, guaranteedSimulationServiceSingleDayBuyingTerm.buyingSingleDayTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingSingleDayTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSingleDayBuyingTerm {\n");
    
    sb.append("    buyingSingleDayTerm: ").append(toIndentedString(buyingSingleDayTerm)).append("\n");
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

