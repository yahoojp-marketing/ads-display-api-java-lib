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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServicePredictionResult object describes the prediction result of the guaranteed campaign. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 </div> <div lang=\"en\"> GuaranteedInventoryServicePredictionResult object describes the prediction result of the guaranteed campaign. </div> ")
@JsonPropertyOrder({
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_LIFETIME_BUDGET,
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_REACH,
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_V_IMPS,
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_VCPM,
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_VIEWABLE_FREQUENCY,
  GuaranteedInventoryServicePredictionResult.JSON_PROPERTY_SOV_RATE
})
@JsonTypeName("GuaranteedInventoryServicePredictionResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedInventoryServicePredictionResult {
  public static final String JSON_PROPERTY_LIFETIME_BUDGET = "lifetimeBudget";
  private Long lifetimeBudget;

  public static final String JSON_PROPERTY_REACH = "reach";
  private Long reach;

  public static final String JSON_PROPERTY_V_IMPS = "vImps";
  private Long vImps;

  public static final String JSON_PROPERTY_VCPM = "vcpm";
  private Long vcpm;

  public static final String JSON_PROPERTY_VIEWABLE_FREQUENCY = "viewableFrequency";
  private Double viewableFrequency;

  public static final String JSON_PROPERTY_SOV_RATE = "sovRate";
  private Double sovRate;

  public GuaranteedInventoryServicePredictionResult() { 
  }

  public GuaranteedInventoryServicePredictionResult lifetimeBudget(Long lifetimeBudget) {
    
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 通期予算です。&lt;br&gt; ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Lifetime budget.&lt;br&gt; * \&quot;lifetime budget\&quot; means the total budget that is spent throughout the entire duration of the campaign.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return lifetimeBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 通期予算です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLifetimeBudget() {
    return lifetimeBudget;
  }


  @JsonProperty(JSON_PROPERTY_LIFETIME_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }


  public GuaranteedInventoryServicePredictionResult reach(Long reach) {
    
    this.reach = reach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; リーチ数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Number of reaches.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return reach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReach() {
    return reach;
  }


  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReach(Long reach) {
    this.reach = reach;
  }


  public GuaranteedInventoryServicePredictionResult vImps(Long vImps) {
    
    this.vImps = vImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ビューアブルインプレッションです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewable impressions.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return vImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable impressions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getvImps() {
    return vImps;
  }


  @JsonProperty(JSON_PROPERTY_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setvImps(Long vImps) {
    this.vImps = vImps;
  }


  public GuaranteedInventoryServicePredictionResult vcpm(Long vcpm) {
    
    this.vcpm = vcpm;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; vCPMです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; VCPM.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return vcpm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> vCPMです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> VCPM.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVcpm() {
    return vcpm;
  }


  @JsonProperty(JSON_PROPERTY_VCPM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpm(Long vcpm) {
    this.vcpm = vcpm;
  }


  public GuaranteedInventoryServicePredictionResult viewableFrequency(Double viewableFrequency) {
    
    this.viewableFrequency = viewableFrequency;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ビューアブルフリークエンシーです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Viewable frequency.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return viewableFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルフリークエンシーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable frequency.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getViewableFrequency() {
    return viewableFrequency;
  }


  @JsonProperty(JSON_PROPERTY_VIEWABLE_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewableFrequency(Double viewableFrequency) {
    this.viewableFrequency = viewableFrequency;
  }


  public GuaranteedInventoryServicePredictionResult sovRate(Double sovRate) {
    
    this.sovRate = sovRate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SOV（0.0%〜100.0%）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SOV (0.0% to 100.0%).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return sovRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（0.0%〜100.0%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (0.0% to 100.0%).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_SOV_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSovRate() {
    return sovRate;
  }


  @JsonProperty(JSON_PROPERTY_SOV_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSovRate(Double sovRate) {
    this.sovRate = sovRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServicePredictionResult guaranteedInventoryServicePredictionResult = (GuaranteedInventoryServicePredictionResult) o;
    return Objects.equals(this.lifetimeBudget, guaranteedInventoryServicePredictionResult.lifetimeBudget) &&
        Objects.equals(this.reach, guaranteedInventoryServicePredictionResult.reach) &&
        Objects.equals(this.vImps, guaranteedInventoryServicePredictionResult.vImps) &&
        Objects.equals(this.vcpm, guaranteedInventoryServicePredictionResult.vcpm) &&
        Objects.equals(this.viewableFrequency, guaranteedInventoryServicePredictionResult.viewableFrequency) &&
        Objects.equals(this.sovRate, guaranteedInventoryServicePredictionResult.sovRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetimeBudget, reach, vImps, vcpm, viewableFrequency, sovRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServicePredictionResult {\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    vImps: ").append(toIndentedString(vImps)).append("\n");
    sb.append("    vcpm: ").append(toIndentedString(vcpm)).append("\n");
    sb.append("    viewableFrequency: ").append(toIndentedString(viewableFrequency)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
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
