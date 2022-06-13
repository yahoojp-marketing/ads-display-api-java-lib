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
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServicePriceType;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceSlotsPricingPackage;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceVimpsCustomPricingPackage;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceVimpsReachPricingPackage;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedSimulationServiceVimpsSOVPricingPackage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServicePricingPackageは、商品の購入タイプ設定の情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServicePricingPackage holds information about purchase type setting of package.&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServicePricingPackageは、商品の購入タイプ設定の情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServicePricingPackage holds information about purchase type setting of package.<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServicePricingPackage.JSON_PROPERTY_PRICE_TYPE,
  GuaranteedSimulationServicePricingPackage.JSON_PROPERTY_VIMPS_CUSTOM_PRICING_PACKAGE,
  GuaranteedSimulationServicePricingPackage.JSON_PROPERTY_VIMPS_S_O_V_PRICING_PACKAGE,
  GuaranteedSimulationServicePricingPackage.JSON_PROPERTY_VIMPS_REACH_PRICING_PACKAGE,
  GuaranteedSimulationServicePricingPackage.JSON_PROPERTY_SLOTS_PRICING_PACKAGE
})
@JsonTypeName("GuaranteedSimulationServicePricingPackage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServicePricingPackage {
  public static final String JSON_PROPERTY_PRICE_TYPE = "priceType";
  private GuaranteedSimulationServicePriceType priceType;

  public static final String JSON_PROPERTY_VIMPS_CUSTOM_PRICING_PACKAGE = "vimpsCustomPricingPackage";
  private GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage;

  public static final String JSON_PROPERTY_VIMPS_S_O_V_PRICING_PACKAGE = "vimpsSOVPricingPackage";
  private GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage;

  public static final String JSON_PROPERTY_VIMPS_REACH_PRICING_PACKAGE = "vimpsReachPricingPackage";
  private GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage;

  public static final String JSON_PROPERTY_SLOTS_PRICING_PACKAGE = "slotsPricingPackage";
  private GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage;

  public GuaranteedSimulationServicePricingPackage() { 
  }

  public GuaranteedSimulationServicePricingPackage priceType(GuaranteedSimulationServicePriceType priceType) {
    
    this.priceType = priceType;
    return this;
  }

   /**
   * Get priceType
   * @return priceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServicePriceType getPriceType() {
    return priceType;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceType(GuaranteedSimulationServicePriceType priceType) {
    this.priceType = priceType;
  }


  public GuaranteedSimulationServicePricingPackage vimpsCustomPricingPackage(GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage) {
    
    this.vimpsCustomPricingPackage = vimpsCustomPricingPackage;
    return this;
  }

   /**
   * Get vimpsCustomPricingPackage
   * @return vimpsCustomPricingPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIMPS_CUSTOM_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceVimpsCustomPricingPackage getVimpsCustomPricingPackage() {
    return vimpsCustomPricingPackage;
  }


  @JsonProperty(JSON_PROPERTY_VIMPS_CUSTOM_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVimpsCustomPricingPackage(GuaranteedSimulationServiceVimpsCustomPricingPackage vimpsCustomPricingPackage) {
    this.vimpsCustomPricingPackage = vimpsCustomPricingPackage;
  }


  public GuaranteedSimulationServicePricingPackage vimpsSOVPricingPackage(GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage) {
    
    this.vimpsSOVPricingPackage = vimpsSOVPricingPackage;
    return this;
  }

   /**
   * Get vimpsSOVPricingPackage
   * @return vimpsSOVPricingPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIMPS_S_O_V_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceVimpsSOVPricingPackage getVimpsSOVPricingPackage() {
    return vimpsSOVPricingPackage;
  }


  @JsonProperty(JSON_PROPERTY_VIMPS_S_O_V_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVimpsSOVPricingPackage(GuaranteedSimulationServiceVimpsSOVPricingPackage vimpsSOVPricingPackage) {
    this.vimpsSOVPricingPackage = vimpsSOVPricingPackage;
  }


  public GuaranteedSimulationServicePricingPackage vimpsReachPricingPackage(GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage) {
    
    this.vimpsReachPricingPackage = vimpsReachPricingPackage;
    return this;
  }

   /**
   * Get vimpsReachPricingPackage
   * @return vimpsReachPricingPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIMPS_REACH_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceVimpsReachPricingPackage getVimpsReachPricingPackage() {
    return vimpsReachPricingPackage;
  }


  @JsonProperty(JSON_PROPERTY_VIMPS_REACH_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVimpsReachPricingPackage(GuaranteedSimulationServiceVimpsReachPricingPackage vimpsReachPricingPackage) {
    this.vimpsReachPricingPackage = vimpsReachPricingPackage;
  }


  public GuaranteedSimulationServicePricingPackage slotsPricingPackage(GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage) {
    
    this.slotsPricingPackage = slotsPricingPackage;
    return this;
  }

   /**
   * Get slotsPricingPackage
   * @return slotsPricingPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLOTS_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedSimulationServiceSlotsPricingPackage getSlotsPricingPackage() {
    return slotsPricingPackage;
  }


  @JsonProperty(JSON_PROPERTY_SLOTS_PRICING_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlotsPricingPackage(GuaranteedSimulationServiceSlotsPricingPackage slotsPricingPackage) {
    this.slotsPricingPackage = slotsPricingPackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePricingPackage guaranteedSimulationServicePricingPackage = (GuaranteedSimulationServicePricingPackage) o;
    return Objects.equals(this.priceType, guaranteedSimulationServicePricingPackage.priceType) &&
        Objects.equals(this.vimpsCustomPricingPackage, guaranteedSimulationServicePricingPackage.vimpsCustomPricingPackage) &&
        Objects.equals(this.vimpsSOVPricingPackage, guaranteedSimulationServicePricingPackage.vimpsSOVPricingPackage) &&
        Objects.equals(this.vimpsReachPricingPackage, guaranteedSimulationServicePricingPackage.vimpsReachPricingPackage) &&
        Objects.equals(this.slotsPricingPackage, guaranteedSimulationServicePricingPackage.slotsPricingPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceType, vimpsCustomPricingPackage, vimpsSOVPricingPackage, vimpsReachPricingPackage, slotsPricingPackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePricingPackage {\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    vimpsCustomPricingPackage: ").append(toIndentedString(vimpsCustomPricingPackage)).append("\n");
    sb.append("    vimpsSOVPricingPackage: ").append(toIndentedString(vimpsSOVPricingPackage)).append("\n");
    sb.append("    vimpsReachPricingPackage: ").append(toIndentedString(vimpsReachPricingPackage)).append("\n");
    sb.append("    slotsPricingPackage: ").append(toIndentedString(slotsPricingPackage)).append("\n");
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
