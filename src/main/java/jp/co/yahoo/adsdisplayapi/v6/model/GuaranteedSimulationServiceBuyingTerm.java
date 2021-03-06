/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceBuyingTermType;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceCustomRangeBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceSingleDayBuyingTerm;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceSingleTermBuyingTerm;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServiceBuyingTermは、商品購入期間情報を保持します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServiceBuyingTermは、商品購入期間情報を保持します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedSimulationServiceBuyingTerm holds information about the package purchase term.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceBuyingTerm.JSON_PROPERTY_BUYING_TERM_TYPE,
  GuaranteedSimulationServiceBuyingTerm.JSON_PROPERTY_SINGLE_DAY_BUYING_TERM,
  GuaranteedSimulationServiceBuyingTerm.JSON_PROPERTY_SINGLE_TERM_BUYING_TERM,
  GuaranteedSimulationServiceBuyingTerm.JSON_PROPERTY_CUSTOM_RANGE_BUYING_TERM
})
@JsonTypeName("GuaranteedSimulationServiceBuyingTerm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceBuyingTerm {
  public static final String JSON_PROPERTY_BUYING_TERM_TYPE = "buyingTermType";
  private GuaranteedSimulationServiceBuyingTermType buyingTermType;

  public static final String JSON_PROPERTY_SINGLE_DAY_BUYING_TERM = "singleDayBuyingTerm";
  private GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm;

  public static final String JSON_PROPERTY_SINGLE_TERM_BUYING_TERM = "singleTermBuyingTerm";
  private GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm;

  public static final String JSON_PROPERTY_CUSTOM_RANGE_BUYING_TERM = "customRangeBuyingTerm";
  private GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm;

  public GuaranteedSimulationServiceBuyingTerm() { 
  }

  public GuaranteedSimulationServiceBuyingTerm buyingTermType(GuaranteedSimulationServiceBuyingTermType buyingTermType) {
    
    this.buyingTermType = buyingTermType;
    return this;
  }

   /**
   * Get buyingTermType
   * @return buyingTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUYING_TERM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceBuyingTermType getBuyingTermType() {
    return buyingTermType;
  }


  @JsonProperty(JSON_PROPERTY_BUYING_TERM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuyingTermType(GuaranteedSimulationServiceBuyingTermType buyingTermType) {
    this.buyingTermType = buyingTermType;
  }


  public GuaranteedSimulationServiceBuyingTerm singleDayBuyingTerm(GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm) {
    
    this.singleDayBuyingTerm = singleDayBuyingTerm;
    return this;
  }

   /**
   * Get singleDayBuyingTerm
   * @return singleDayBuyingTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINGLE_DAY_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceSingleDayBuyingTerm getSingleDayBuyingTerm() {
    return singleDayBuyingTerm;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_DAY_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleDayBuyingTerm(GuaranteedSimulationServiceSingleDayBuyingTerm singleDayBuyingTerm) {
    this.singleDayBuyingTerm = singleDayBuyingTerm;
  }


  public GuaranteedSimulationServiceBuyingTerm singleTermBuyingTerm(GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm) {
    
    this.singleTermBuyingTerm = singleTermBuyingTerm;
    return this;
  }

   /**
   * Get singleTermBuyingTerm
   * @return singleTermBuyingTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINGLE_TERM_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceSingleTermBuyingTerm getSingleTermBuyingTerm() {
    return singleTermBuyingTerm;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_TERM_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleTermBuyingTerm(GuaranteedSimulationServiceSingleTermBuyingTerm singleTermBuyingTerm) {
    this.singleTermBuyingTerm = singleTermBuyingTerm;
  }


  public GuaranteedSimulationServiceBuyingTerm customRangeBuyingTerm(GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm) {
    
    this.customRangeBuyingTerm = customRangeBuyingTerm;
    return this;
  }

   /**
   * Get customRangeBuyingTerm
   * @return customRangeBuyingTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_RANGE_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceCustomRangeBuyingTerm getCustomRangeBuyingTerm() {
    return customRangeBuyingTerm;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_RANGE_BUYING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomRangeBuyingTerm(GuaranteedSimulationServiceCustomRangeBuyingTerm customRangeBuyingTerm) {
    this.customRangeBuyingTerm = customRangeBuyingTerm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceBuyingTerm guaranteedSimulationServiceBuyingTerm = (GuaranteedSimulationServiceBuyingTerm) o;
    return Objects.equals(this.buyingTermType, guaranteedSimulationServiceBuyingTerm.buyingTermType) &&
        Objects.equals(this.singleDayBuyingTerm, guaranteedSimulationServiceBuyingTerm.singleDayBuyingTerm) &&
        Objects.equals(this.singleTermBuyingTerm, guaranteedSimulationServiceBuyingTerm.singleTermBuyingTerm) &&
        Objects.equals(this.customRangeBuyingTerm, guaranteedSimulationServiceBuyingTerm.customRangeBuyingTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingTermType, singleDayBuyingTerm, singleTermBuyingTerm, customRangeBuyingTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceBuyingTerm {\n");
    sb.append("    buyingTermType: ").append(toIndentedString(buyingTermType)).append("\n");
    sb.append("    singleDayBuyingTerm: ").append(toIndentedString(singleDayBuyingTerm)).append("\n");
    sb.append("    singleTermBuyingTerm: ").append(toIndentedString(singleTermBuyingTerm)).append("\n");
    sb.append("    customRangeBuyingTerm: ").append(toIndentedString(customRangeBuyingTerm)).append("\n");
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

