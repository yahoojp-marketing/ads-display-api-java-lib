package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceSingleTermBuyingTermは、単一期間指定の商品購入期間情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceSingleTermBuyingTerm holds information about the package purchase term specified in a single term.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceSingleTermBuyingTermは、単一期間指定の商品購入期間情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceSingleTermBuyingTerm holds information about the package purchase term specified in a single term.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceSingleTermBuyingTerm   {
  @JsonProperty("buyingSingleTermStartDate")
  private String buyingSingleTermStartDate = null;

  @JsonProperty("buyingSingleTermEndDate")
  private String buyingSingleTermEndDate = null;

  public GuaranteedSimulationServiceSingleTermBuyingTerm buyingSingleTermStartDate(String buyingSingleTermStartDate) {
    this.buyingSingleTermStartDate = buyingSingleTermStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   商品購入期間（単一期間開始日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> 
   * @return buyingSingleTermStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品購入期間（単一期間開始日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> ")


  public String getBuyingSingleTermStartDate() {
    return buyingSingleTermStartDate;
  }

  public void setBuyingSingleTermStartDate(String buyingSingleTermStartDate) {
    this.buyingSingleTermStartDate = buyingSingleTermStartDate;
  }

  public GuaranteedSimulationServiceSingleTermBuyingTerm buyingSingleTermEndDate(String buyingSingleTermEndDate) {
    this.buyingSingleTermEndDate = buyingSingleTermEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\">   商品購入期間（単一期間終了日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> 
   * @return buyingSingleTermEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   商品購入期間（単一期間終了日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> ")


  public String getBuyingSingleTermEndDate() {
    return buyingSingleTermEndDate;
  }

  public void setBuyingSingleTermEndDate(String buyingSingleTermEndDate) {
    this.buyingSingleTermEndDate = buyingSingleTermEndDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceSingleTermBuyingTerm guaranteedSimulationServiceSingleTermBuyingTerm = (GuaranteedSimulationServiceSingleTermBuyingTerm) o;
    return Objects.equals(this.buyingSingleTermStartDate, guaranteedSimulationServiceSingleTermBuyingTerm.buyingSingleTermStartDate) &&
        Objects.equals(this.buyingSingleTermEndDate, guaranteedSimulationServiceSingleTermBuyingTerm.buyingSingleTermEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingSingleTermStartDate, buyingSingleTermEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceSingleTermBuyingTerm {\n");
    
    sb.append("    buyingSingleTermStartDate: ").append(toIndentedString(buyingSingleTermStartDate)).append("\n");
    sb.append("    buyingSingleTermEndDate: ").append(toIndentedString(buyingSingleTermEndDate)).append("\n");
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

