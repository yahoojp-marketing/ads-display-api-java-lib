/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceBuyingTermは、範囲指定の商品購入期間情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term with range specified.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceBuyingTermは、範囲指定の商品購入期間情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term with range specified.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceCustomRangeBuyingTerm.JSON_PROPERTY_BUYING_TERM_DATE_MIN_RANGE,
  GuaranteedSimulationServiceCustomRangeBuyingTerm.JSON_PROPERTY_BUYING_TERM_DATE_MAX_RANGE
})
@JsonTypeName("GuaranteedSimulationServiceCustomRangeBuyingTerm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceCustomRangeBuyingTerm {
  public static final String JSON_PROPERTY_BUYING_TERM_DATE_MIN_RANGE = "buyingTermDateMinRange";
  private Long buyingTermDateMinRange;

  public static final String JSON_PROPERTY_BUYING_TERM_DATE_MAX_RANGE = "buyingTermDateMaxRange";
  private Long buyingTermDateMaxRange;

  public GuaranteedSimulationServiceCustomRangeBuyingTerm() { 
  }

  public GuaranteedSimulationServiceCustomRangeBuyingTerm buyingTermDateMinRange(Long buyingTermDateMinRange) {
    
    this.buyingTermDateMinRange = buyingTermDateMinRange;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品購入期間日数（範囲最小）を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of days in the package purchase term (minimum range).&lt;/div&gt; 
   * @return buyingTermDateMinRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">商品購入期間日数（範囲最小）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (minimum range).</div> ")
  @JsonProperty(JSON_PROPERTY_BUYING_TERM_DATE_MIN_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBuyingTermDateMinRange() {
    return buyingTermDateMinRange;
  }


  @JsonProperty(JSON_PROPERTY_BUYING_TERM_DATE_MIN_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuyingTermDateMinRange(Long buyingTermDateMinRange) {
    this.buyingTermDateMinRange = buyingTermDateMinRange;
  }


  public GuaranteedSimulationServiceCustomRangeBuyingTerm buyingTermDateMaxRange(Long buyingTermDateMaxRange) {
    
    this.buyingTermDateMaxRange = buyingTermDateMaxRange;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品購入期間日数（範囲最大）を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of days in the package purchase term (maximum range).&lt;/div&gt; 
   * @return buyingTermDateMaxRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">商品購入期間日数（範囲最大）を表します。</div> <div lang=\"en\">The number of days in the package purchase term (maximum range).</div> ")
  @JsonProperty(JSON_PROPERTY_BUYING_TERM_DATE_MAX_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBuyingTermDateMaxRange() {
    return buyingTermDateMaxRange;
  }


  @JsonProperty(JSON_PROPERTY_BUYING_TERM_DATE_MAX_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

