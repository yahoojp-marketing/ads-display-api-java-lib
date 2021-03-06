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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   GuaranteedSimulationServiceVimpsReachPricingPackageは、vimps購入型（リーチ固定）の購入タイプ設定情報を保持します。&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   GuaranteedSimulationServiceVimpsReachPricingPackage holds the purchase type setting information about the vimps purchase type (fixed reach).&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input.  &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   GuaranteedSimulationServiceVimpsReachPricingPackageは、vimps購入型（リーチ固定）の購入タイプ設定情報を保持します。<br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   GuaranteedSimulationServiceVimpsReachPricingPackage holds the purchase type setting information about the vimps purchase type (fixed reach).<br>   Although this field will be returned in the response, it will be ignored on input.  </div> ")
@JsonPropertyOrder({
  GuaranteedSimulationServiceVimpsReachPricingPackage.JSON_PROPERTY_FIXED_LIFETIME_BUDGET,
  GuaranteedSimulationServiceVimpsReachPricingPackage.JSON_PROPERTY_VIEWABLE_REACH
})
@JsonTypeName("GuaranteedSimulationServiceVimpsReachPricingPackage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedSimulationServiceVimpsReachPricingPackage {
  public static final String JSON_PROPERTY_FIXED_LIFETIME_BUDGET = "fixedLifetimeBudget";
  private Long fixedLifetimeBudget;

  public static final String JSON_PROPERTY_VIEWABLE_REACH = "viewableReach";
  private Long viewableReach;

  public GuaranteedSimulationServiceVimpsReachPricingPackage() { 
  }

  public GuaranteedSimulationServiceVimpsReachPricingPackage fixedLifetimeBudget(Long fixedLifetimeBudget) {
    
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


  public GuaranteedSimulationServiceVimpsReachPricingPackage viewableReach(Long viewableReach) {
    
    this.viewableReach = viewableReach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビューアブルリーチを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Viewable reach.&lt;/div&gt; 
   * @return viewableReach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルリーチを表します。</div> <div lang=\"en\">Viewable reach.</div> ")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getViewableReach() {
    return viewableReach;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableReach(Long viewableReach) {
    this.viewableReach = viewableReach;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

