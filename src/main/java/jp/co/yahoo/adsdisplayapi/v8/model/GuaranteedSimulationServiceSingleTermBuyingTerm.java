/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceSingleTermBuyingTermは、単一期間指定の商品購入期間情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceSingleTermBuyingTerm holds information about the package purchase term specified in a single term.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceSingleTermBuyingTermは、単一期間指定の商品購入期間情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceSingleTermBuyingTerm holds information about the package purchase term specified in a single term.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceSingleTermBuyingTerm.JSON_PROPERTY_BUYING_SINGLE_TERM_START_DATE,
  GuaranteedSimulationServiceSingleTermBuyingTerm.JSON_PROPERTY_BUYING_SINGLE_TERM_END_DATE
})
@JsonTypeName("GuaranteedSimulationServiceSingleTermBuyingTerm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceSingleTermBuyingTerm {
  public static final String JSON_PROPERTY_BUYING_SINGLE_TERM_START_DATE = "buyingSingleTermStartDate";
  private String buyingSingleTermStartDate;

  public static final String JSON_PROPERTY_BUYING_SINGLE_TERM_END_DATE = "buyingSingleTermEndDate";
  private String buyingSingleTermEndDate;

  public GuaranteedSimulationServiceSingleTermBuyingTerm() { 
  }

  public GuaranteedSimulationServiceSingleTermBuyingTerm buyingSingleTermStartDate(String buyingSingleTermStartDate) {
    
    this.buyingSingleTermStartDate = buyingSingleTermStartDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   商品購入期間（単一期間開始日）を表します。&lt;br&gt;   ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Start date of the package purchase term (single term).&lt;br&gt;   Format: yyyyMMdd &lt;/div&gt; 
   * @return buyingSingleTermStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   商品購入期間（単一期間開始日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   Start date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> ")
  @JsonProperty(JSON_PROPERTY_BUYING_SINGLE_TERM_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuyingSingleTermStartDate() {
    return buyingSingleTermStartDate;
  }


  @JsonProperty(JSON_PROPERTY_BUYING_SINGLE_TERM_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuyingSingleTermStartDate(String buyingSingleTermStartDate) {
    this.buyingSingleTermStartDate = buyingSingleTermStartDate;
  }


  public GuaranteedSimulationServiceSingleTermBuyingTerm buyingSingleTermEndDate(String buyingSingleTermEndDate) {
    
    this.buyingSingleTermEndDate = buyingSingleTermEndDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   商品購入期間（単一期間終了日）を表します。&lt;br&gt;   ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   End date of the package purchase term (single term).&lt;br&gt;   Format: yyyyMMdd &lt;/div&gt; 
   * @return buyingSingleTermEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   商品購入期間（単一期間終了日）を表します。<br>   ※フォーマット：yyyyMMdd </div> <div lang=\"en\">   End date of the package purchase term (single term).<br>   Format: yyyyMMdd </div> ")
  @JsonProperty(JSON_PROPERTY_BUYING_SINGLE_TERM_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuyingSingleTermEndDate() {
    return buyingSingleTermEndDate;
  }


  @JsonProperty(JSON_PROPERTY_BUYING_SINGLE_TERM_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

