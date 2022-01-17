package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedInventoryServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedInventoryServicePredictionResult object describes the prediction result of the guaranteed campaign. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedInventoryServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 </div> <div lang=\"en\"> GuaranteedInventoryServicePredictionResult object describes the prediction result of the guaranteed campaign. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServicePredictionResult   {
  @JsonProperty("lifetimeBudget")
  private Long lifetimeBudget = null;

  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("vImps")
  private Long vImps = null;

  @JsonProperty("vcpm")
  private Long vcpm = null;

  @JsonProperty("viewableFrequency")
  private Double viewableFrequency = null;

  @JsonProperty("sovRate")
  private Double sovRate = null;

  public GuaranteedInventoryServicePredictionResult lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

  /**
   * <div lang=\"ja\"> 通期予算です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 通期予算です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedInventoryServicePredictionResult reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public GuaranteedInventoryServicePredictionResult vImps(Long vImps) {
    this.vImps = vImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルインプレッションです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable impressions.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable impressions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getvImps() {
    return vImps;
  }

  public void setvImps(Long vImps) {
    this.vImps = vImps;
  }

  public GuaranteedInventoryServicePredictionResult vcpm(Long vcpm) {
    this.vcpm = vcpm;
    return this;
  }

  /**
   * <div lang=\"ja\"> vCPMです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> VCPM.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return vcpm
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> vCPMです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> VCPM.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getVcpm() {
    return vcpm;
  }

  public void setVcpm(Long vcpm) {
    this.vcpm = vcpm;
  }

  public GuaranteedInventoryServicePredictionResult viewableFrequency(Double viewableFrequency) {
    this.viewableFrequency = viewableFrequency;
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルフリークエンシーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable frequency.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return viewableFrequency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルフリークエンシーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable frequency.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Double getViewableFrequency() {
    return viewableFrequency;
  }

  public void setViewableFrequency(Double viewableFrequency) {
    this.viewableFrequency = viewableFrequency;
  }

  public GuaranteedInventoryServicePredictionResult sovRate(Double sovRate) {
    this.sovRate = sovRate;
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（0.0%〜100.0%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (0.0% to 100.0%).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（0.0%〜100.0%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (0.0% to 100.0%).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Double getSovRate() {
    return sovRate;
  }

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

