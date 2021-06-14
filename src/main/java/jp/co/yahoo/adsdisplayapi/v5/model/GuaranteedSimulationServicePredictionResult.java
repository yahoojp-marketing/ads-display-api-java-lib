package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedSimulationServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedSimulationServicePredictionResult object describes the prediction result of the guaranteed campaign. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedSimulationServicePredictionResultオブジェクトは、予約型キャンペーンの予測結果を表します。 </div> <div lang=\"en\"> GuaranteedSimulationServicePredictionResult object describes the prediction result of the guaranteed campaign. </div> ")

public class GuaranteedSimulationServicePredictionResult   {
  @JsonProperty("lifetimeBudget")
  private JsonNullable<Long> lifetimeBudget = JsonNullable.undefined();

  @JsonProperty("reach")
  private JsonNullable<Long> reach = JsonNullable.undefined();

  @JsonProperty("vImps")
  private JsonNullable<Long> vImps = JsonNullable.undefined();

  @JsonProperty("vcpm")
  private JsonNullable<Long> vcpm = JsonNullable.undefined();

  @JsonProperty("viewableFrequency")
  private JsonNullable<Double> viewableFrequency = JsonNullable.undefined();

  @JsonProperty("sovRate")
  private JsonNullable<Double> sovRate = JsonNullable.undefined();

  public GuaranteedSimulationServicePredictionResult lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = JsonNullable.of(lifetimeBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> 通期予算です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 通期予算です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(JsonNullable<Long> lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedSimulationServicePredictionResult reach(Long reach) {
    this.reach = JsonNullable.of(reach);
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getReach() {
    return reach;
  }

  public void setReach(JsonNullable<Long> reach) {
    this.reach = reach;
  }

  public GuaranteedSimulationServicePredictionResult vImps(Long vImps) {
    this.vImps = JsonNullable.of(vImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルインプレッションです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable impressions.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable impressions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getvImps() {
    return vImps;
  }

  public void setvImps(JsonNullable<Long> vImps) {
    this.vImps = vImps;
  }

  public GuaranteedSimulationServicePredictionResult vcpm(Long vcpm) {
    this.vcpm = JsonNullable.of(vcpm);
    return this;
  }

  /**
   * <div lang=\"ja\"> vCPMです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> VCPM.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return vcpm
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> vCPMです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> VCPM.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getVcpm() {
    return vcpm;
  }

  public void setVcpm(JsonNullable<Long> vcpm) {
    this.vcpm = vcpm;
  }

  public GuaranteedSimulationServicePredictionResult viewableFrequency(Double viewableFrequency) {
    this.viewableFrequency = JsonNullable.of(viewableFrequency);
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルフリークエンシーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable frequency.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return viewableFrequency
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルフリークエンシーです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Viewable frequency.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Double> getViewableFrequency() {
    return viewableFrequency;
  }

  public void setViewableFrequency(JsonNullable<Double> viewableFrequency) {
    this.viewableFrequency = viewableFrequency;
  }

  public GuaranteedSimulationServicePredictionResult sovRate(Double sovRate) {
    this.sovRate = JsonNullable.of(sovRate);
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（0.0%〜100.0%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (0.0% to 100.0%).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（0.0%〜100.0%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (0.0% to 100.0%).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Double> getSovRate() {
    return sovRate;
  }

  public void setSovRate(JsonNullable<Double> sovRate) {
    this.sovRate = sovRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServicePredictionResult guaranteedSimulationServicePredictionResult = (GuaranteedSimulationServicePredictionResult) o;
    return Objects.equals(this.lifetimeBudget, guaranteedSimulationServicePredictionResult.lifetimeBudget) &&
        Objects.equals(this.reach, guaranteedSimulationServicePredictionResult.reach) &&
        Objects.equals(this.vImps, guaranteedSimulationServicePredictionResult.vImps) &&
        Objects.equals(this.vcpm, guaranteedSimulationServicePredictionResult.vcpm) &&
        Objects.equals(this.viewableFrequency, guaranteedSimulationServicePredictionResult.viewableFrequency) &&
        Objects.equals(this.sovRate, guaranteedSimulationServicePredictionResult.sovRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifetimeBudget, reach, vImps, vcpm, viewableFrequency, sovRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServicePredictionResult {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

