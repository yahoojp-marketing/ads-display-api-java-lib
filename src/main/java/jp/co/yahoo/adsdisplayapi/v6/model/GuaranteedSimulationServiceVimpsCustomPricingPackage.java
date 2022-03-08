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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsCustomPricingPackageは、vimps購入型（変動）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsCustomPricingPackage holds the purchase type setting information about the vimps purchase type (variable).<br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceVimpsCustomPricingPackage.JSON_PROPERTY_FIXED_LIFETIME_BUDGET,
  GuaranteedSimulationServiceVimpsCustomPricingPackage.JSON_PROPERTY_MINIMUM_PURCHASE_BUDGET,
  GuaranteedSimulationServiceVimpsCustomPricingPackage.JSON_PROPERTY_MINIMUM_PURCHASE_V_IMPS,
  GuaranteedSimulationServiceVimpsCustomPricingPackage.JSON_PROPERTY_MAXIMUM_PURCHASE_V_IMPS
})
@JsonTypeName("GuaranteedSimulationServiceVimpsCustomPricingPackage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceVimpsCustomPricingPackage {
  public static final String JSON_PROPERTY_FIXED_LIFETIME_BUDGET = "fixedLifetimeBudget";
  private Long fixedLifetimeBudget;

  public static final String JSON_PROPERTY_MINIMUM_PURCHASE_BUDGET = "minimumPurchaseBudget";
  private Long minimumPurchaseBudget;

  public static final String JSON_PROPERTY_MINIMUM_PURCHASE_V_IMPS = "minimumPurchaseVImps";
  private Long minimumPurchaseVImps;

  public static final String JSON_PROPERTY_MAXIMUM_PURCHASE_V_IMPS = "maximumPurchaseVImps";
  private Long maximumPurchaseVImps;

  public GuaranteedSimulationServiceVimpsCustomPricingPackage() { 
  }

  public GuaranteedSimulationServiceVimpsCustomPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
    
    this.fixedLifetimeBudget = fixedLifetimeBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品価格を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Package price.&lt;/div&gt; 
   * @return fixedLifetimeBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">商品価格を表します。</div> <div lang=\"en\">Package price.</div> ")
  @JsonProperty(JSON_PROPERTY_FIXED_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFixedLifetimeBudget() {
    return fixedLifetimeBudget;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedLifetimeBudget(Long fixedLifetimeBudget) {
    this.fixedLifetimeBudget = fixedLifetimeBudget;
  }


  public GuaranteedSimulationServiceVimpsCustomPricingPackage minimumPurchaseBudget(Long minimumPurchaseBudget) {
    
    this.minimumPurchaseBudget = minimumPurchaseBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最低購入価格を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum Purchase price.&lt;/div&gt; 
   * @return minimumPurchaseBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入価格を表します。</div> <div lang=\"en\">Minimum Purchase price.</div> ")
  @JsonProperty(JSON_PROPERTY_MINIMUM_PURCHASE_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinimumPurchaseBudget() {
    return minimumPurchaseBudget;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_PURCHASE_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumPurchaseBudget(Long minimumPurchaseBudget) {
    this.minimumPurchaseBudget = minimumPurchaseBudget;
  }


  public GuaranteedSimulationServiceVimpsCustomPricingPackage minimumPurchaseVImps(Long minimumPurchaseVImps) {
    
    this.minimumPurchaseVImps = minimumPurchaseVImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最低購入ビューアブルインプレッション数を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum purchase viewable impression.&lt;/div&gt; 
   * @return minimumPurchaseVImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> ")
  @JsonProperty(JSON_PROPERTY_MINIMUM_PURCHASE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinimumPurchaseVImps() {
    return minimumPurchaseVImps;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_PURCHASE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
  }


  public GuaranteedSimulationServiceVimpsCustomPricingPackage maximumPurchaseVImps(Long maximumPurchaseVImps) {
    
    this.maximumPurchaseVImps = maximumPurchaseVImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大購入ビューアブルインプレッション数を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum purchase viewable impression.&lt;/div&gt; 
   * @return maximumPurchaseVImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> ")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_PURCHASE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaximumPurchaseVImps() {
    return maximumPurchaseVImps;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_PURCHASE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

