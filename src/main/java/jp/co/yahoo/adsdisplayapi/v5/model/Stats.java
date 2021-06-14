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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Statsオブジェクトは、統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Stats object contains the stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Statsオブジェクトは、統計情報を保持します。</div> <div lang=\"en\">Stats object contains the stats information.</div> ")

public class Stats   {
  @JsonProperty("imps")
  private JsonNullable<Long> imps = JsonNullable.undefined();

  @JsonProperty("impsPrev")
  private JsonNullable<Double> impsPrev = JsonNullable.undefined();

  @JsonProperty("clickCnt")
  private JsonNullable<Long> clickCnt = JsonNullable.undefined();

  @JsonProperty("clickRate")
  private JsonNullable<Double> clickRate = JsonNullable.undefined();

  @JsonProperty("clickRatePrev")
  private JsonNullable<Double> clickRatePrev = JsonNullable.undefined();

  @JsonProperty("cost")
  private JsonNullable<Double> cost = JsonNullable.undefined();

  @JsonProperty("avgCpc")
  private JsonNullable<Double> avgCpc = JsonNullable.undefined();

  @JsonProperty("conversions")
  private JsonNullable<Long> conversions = JsonNullable.undefined();

  @JsonProperty("conversionRate")
  private JsonNullable<Double> conversionRate = JsonNullable.undefined();

  @JsonProperty("conversionsViaAdClick")
  private JsonNullable<Long> conversionsViaAdClick = JsonNullable.undefined();

  @JsonProperty("conversionRateViaAdClick")
  private JsonNullable<Double> conversionRateViaAdClick = JsonNullable.undefined();

  @JsonProperty("allConversions")
  private JsonNullable<Long> allConversions = JsonNullable.undefined();

  @JsonProperty("allConversionRate")
  private JsonNullable<Double> allConversionRate = JsonNullable.undefined();

  @JsonProperty("cpa")
  private JsonNullable<String> cpa = JsonNullable.undefined();

  @JsonProperty("conversionValue")
  private JsonNullable<String> conversionValue = JsonNullable.undefined();

  @JsonProperty("valuePerConversions")
  private JsonNullable<String> valuePerConversions = JsonNullable.undefined();

  @JsonProperty("convValuePerCost")
  private JsonNullable<Double> convValuePerCost = JsonNullable.undefined();

  @JsonProperty("allConvValuePerCost")
  private JsonNullable<Double> allConvValuePerCost = JsonNullable.undefined();

  @JsonProperty("convValueViaAdClickPerCost")
  private JsonNullable<Double> convValueViaAdClickPerCost = JsonNullable.undefined();

  @JsonProperty("allConversionValue")
  private JsonNullable<String> allConversionValue = JsonNullable.undefined();

  @JsonProperty("valuePerAllConversions")
  private JsonNullable<String> valuePerAllConversions = JsonNullable.undefined();

  @JsonProperty("conversionValueViaAdClick")
  private JsonNullable<String> conversionValueViaAdClick = JsonNullable.undefined();

  @JsonProperty("valuePerConversionsViaAdClick")
  private JsonNullable<String> valuePerConversionsViaAdClick = JsonNullable.undefined();

  @JsonProperty("cpaViaAdClick")
  private JsonNullable<String> cpaViaAdClick = JsonNullable.undefined();

  @JsonProperty("allCpa")
  private JsonNullable<String> allCpa = JsonNullable.undefined();

  @JsonProperty("crossDeviceConversions")
  private JsonNullable<Long> crossDeviceConversions = JsonNullable.undefined();

  @JsonProperty("avgDeliverRank")
  private JsonNullable<Double> avgDeliverRank = JsonNullable.undefined();

  @JsonProperty("measuredImps")
  private JsonNullable<Double> measuredImps = JsonNullable.undefined();

  @JsonProperty("totalVimps")
  private JsonNullable<Long> totalVimps = JsonNullable.undefined();

  @JsonProperty("measuredImpsRate")
  private JsonNullable<Double> measuredImpsRate = JsonNullable.undefined();

  @JsonProperty("vimps")
  private JsonNullable<Long> vimps = JsonNullable.undefined();

  @JsonProperty("viewableImpsRate")
  private JsonNullable<Double> viewableImpsRate = JsonNullable.undefined();

  @JsonProperty("inViewRate")
  private JsonNullable<Double> inViewRate = JsonNullable.undefined();

  @JsonProperty("viewableClicks")
  private JsonNullable<Double> viewableClicks = JsonNullable.undefined();

  @JsonProperty("inViewClickCnt")
  private JsonNullable<Long> inViewClickCnt = JsonNullable.undefined();

  @JsonProperty("viewableClickRate")
  private JsonNullable<Double> viewableClickRate = JsonNullable.undefined();

  @JsonProperty("inViewClickRate")
  private JsonNullable<Double> inViewClickRate = JsonNullable.undefined();

  @JsonProperty("paidVideoViews")
  private JsonNullable<Long> paidVideoViews = JsonNullable.undefined();

  @JsonProperty("paidVideoViewRate")
  private JsonNullable<Double> paidVideoViewRate = JsonNullable.undefined();

  @JsonProperty("averageCpv")
  private JsonNullable<Double> averageCpv = JsonNullable.undefined();

  @JsonProperty("videoViews")
  private JsonNullable<Long> videoViews = JsonNullable.undefined();

  @JsonProperty("videoViewsTo25")
  private JsonNullable<Long> videoViewsTo25 = JsonNullable.undefined();

  @JsonProperty("videoViewsTo50")
  private JsonNullable<Long> videoViewsTo50 = JsonNullable.undefined();

  @JsonProperty("videoViewsTo75")
  private JsonNullable<Long> videoViewsTo75 = JsonNullable.undefined();

  @JsonProperty("videoViewsTo95")
  private JsonNullable<Long> videoViewsTo95 = JsonNullable.undefined();

  @JsonProperty("videoViewsTo100")
  private JsonNullable<Long> videoViewsTo100 = JsonNullable.undefined();

  @JsonProperty("videoViewsTo3Sec")
  private JsonNullable<Long> videoViewsTo3Sec = JsonNullable.undefined();

  @JsonProperty("videoViewsTo10Sec")
  private JsonNullable<Long> videoViewsTo10Sec = JsonNullable.undefined();

  @JsonProperty("averageRateVideoViewed")
  private JsonNullable<Double> averageRateVideoViewed = JsonNullable.undefined();

  @JsonProperty("averageDurationVideoViewed")
  private JsonNullable<Double> averageDurationVideoViewed = JsonNullable.undefined();

  @JsonProperty("videoViewThroughRate")
  private JsonNullable<Double> videoViewThroughRate = JsonNullable.undefined();

  @JsonProperty("impressionShare")
  private JsonNullable<Double> impressionShare = JsonNullable.undefined();

  @JsonProperty("budgetImpressionShareLostRate")
  private JsonNullable<Double> budgetImpressionShareLostRate = JsonNullable.undefined();

  @JsonProperty("rankImpressionShareLostRate")
  private JsonNullable<Double> rankImpressionShareLostRate = JsonNullable.undefined();

  @JsonProperty("viewThroughConversions")
  private JsonNullable<Long> viewThroughConversions = JsonNullable.undefined();

  public Stats imps(Long imps) {
    this.imps = JsonNullable.of(imps);
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッション数</div> <div lang=\"en\">Number of impressions</div> 
   * @return imps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数</div> <div lang=\"en\">Number of impressions</div> ")


  public JsonNullable<Long> getImps() {
    return imps;
  }

  public void setImps(JsonNullable<Long> imps) {
    this.imps = imps;
  }

  public Stats impsPrev(Double impsPrev) {
    this.impsPrev = JsonNullable.of(impsPrev);
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッション数（旧）</div> <div lang=\"en\">Impressions (previous)</div> 
   * @return impsPrev
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数（旧）</div> <div lang=\"en\">Impressions (previous)</div> ")


  public JsonNullable<Double> getImpsPrev() {
    return impsPrev;
  }

  public void setImpsPrev(JsonNullable<Double> impsPrev) {
    this.impsPrev = impsPrev;
  }

  public Stats clickCnt(Long clickCnt) {
    this.clickCnt = JsonNullable.of(clickCnt);
    return this;
  }

  /**
   * <div lang=\"ja\">クリック数</div> <div lang=\"en\">Number of clicks</div> 
   * @return clickCnt
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック数</div> <div lang=\"en\">Number of clicks</div> ")


  public JsonNullable<Long> getClickCnt() {
    return clickCnt;
  }

  public void setClickCnt(JsonNullable<Long> clickCnt) {
    this.clickCnt = clickCnt;
  }

  public Stats clickRate(Double clickRate) {
    this.clickRate = JsonNullable.of(clickRate);
    return this;
  }

  /**
   * <div lang=\"ja\">クリック率</div> <div lang=\"en\">Click through rate</div> 
   * @return clickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率</div> <div lang=\"en\">Click through rate</div> ")


  public JsonNullable<Double> getClickRate() {
    return clickRate;
  }

  public void setClickRate(JsonNullable<Double> clickRate) {
    this.clickRate = clickRate;
  }

  public Stats clickRatePrev(Double clickRatePrev) {
    this.clickRatePrev = JsonNullable.of(clickRatePrev);
    return this;
  }

  /**
   * <div lang=\"ja\">クリック率（旧）</div> <div lang=\"en\">CTR (previous)</div> 
   * @return clickRatePrev
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率（旧）</div> <div lang=\"en\">CTR (previous)</div> ")


  public JsonNullable<Double> getClickRatePrev() {
    return clickRatePrev;
  }

  public void setClickRatePrev(JsonNullable<Double> clickRatePrev) {
    this.clickRatePrev = clickRatePrev;
  }

  public Stats cost(Double cost) {
    this.cost = JsonNullable.of(cost);
    return this;
  }

  /**
   * <div lang=\"ja\">コスト</div> <div lang=\"en\">Cost</div> 
   * @return cost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト</div> <div lang=\"en\">Cost</div> ")


  public JsonNullable<Double> getCost() {
    return cost;
  }

  public void setCost(JsonNullable<Double> cost) {
    this.cost = cost;
  }

  public Stats avgCpc(Double avgCpc) {
    this.avgCpc = JsonNullable.of(avgCpc);
    return this;
  }

  /**
   * <div lang=\"ja\">平均CPC</div> <div lang=\"en\">Avg. CPC</div> 
   * @return avgCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPC</div> <div lang=\"en\">Avg. CPC</div> ")


  public JsonNullable<Double> getAvgCpc() {
    return avgCpc;
  }

  public void setAvgCpc(JsonNullable<Double> avgCpc) {
    this.avgCpc = avgCpc;
  }

  public Stats conversions(Long conversions) {
    this.conversions = JsonNullable.of(conversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数</div> <div lang=\"en\">Conversions</div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数</div> <div lang=\"en\">Conversions</div> ")


  public JsonNullable<Long> getConversions() {
    return conversions;
  }

  public void setConversions(JsonNullable<Long> conversions) {
    this.conversions = conversions;
  }

  public Stats conversionRate(Double conversionRate) {
    this.conversionRate = JsonNullable.of(conversionRate);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率</div> <div lang=\"en\">Conv. rate</div> 
   * @return conversionRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率</div> <div lang=\"en\">Conv. rate</div> ")


  public JsonNullable<Double> getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(JsonNullable<Double> conversionRate) {
    this.conversionRate = conversionRate;
  }

  public Stats conversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = JsonNullable.of(conversionsViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（クリック経由）</div> <div lang=\"en\">Conversions (via click)</div> 
   * @return conversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（クリック経由）</div> <div lang=\"en\">Conversions (via click)</div> ")


  public JsonNullable<Long> getConversionsViaAdClick() {
    return conversionsViaAdClick;
  }

  public void setConversionsViaAdClick(JsonNullable<Long> conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
  }

  public Stats conversionRateViaAdClick(Double conversionRateViaAdClick) {
    this.conversionRateViaAdClick = JsonNullable.of(conversionRateViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率（クリック経由）</div> <div lang=\"en\">Conv. rate (via click)</div> 
   * @return conversionRateViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率（クリック経由）</div> <div lang=\"en\">Conv. rate (via click)</div> ")


  public JsonNullable<Double> getConversionRateViaAdClick() {
    return conversionRateViaAdClick;
  }

  public void setConversionRateViaAdClick(JsonNullable<Double> conversionRateViaAdClick) {
    this.conversionRateViaAdClick = conversionRateViaAdClick;
  }

  public Stats allConversions(Long allConversions) {
    this.allConversions = JsonNullable.of(allConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（全て）</div> <div lang=\"en\">Conversions (all)</div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（全て）</div> <div lang=\"en\">Conversions (all)</div> ")


  public JsonNullable<Long> getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(JsonNullable<Long> allConversions) {
    this.allConversions = allConversions;
  }

  public Stats allConversionRate(Double allConversionRate) {
    this.allConversionRate = JsonNullable.of(allConversionRate);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率（全て）</div> <div lang=\"en\">Conv. rate (all)</div> 
   * @return allConversionRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率（全て）</div> <div lang=\"en\">Conv. rate (all)</div> ")


  public JsonNullable<Double> getAllConversionRate() {
    return allConversionRate;
  }

  public void setAllConversionRate(JsonNullable<Double> allConversionRate) {
    this.allConversionRate = allConversionRate;
  }

  public Stats cpa(String cpa) {
    this.cpa = JsonNullable.of(cpa);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価</div> <div lang=\"en\">Conversion cost per acquisition</div> 
   * @return cpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価</div> <div lang=\"en\">Conversion cost per acquisition</div> ")


  public JsonNullable<String> getCpa() {
    return cpa;
  }

  public void setCpa(JsonNullable<String> cpa) {
    this.cpa = cpa;
  }

  public Stats conversionValue(String conversionValue) {
    this.conversionValue = JsonNullable.of(conversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値</div> <div lang=\"en\">Conv. value</div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値</div> <div lang=\"en\">Conv. value</div> ")


  public JsonNullable<String> getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(JsonNullable<String> conversionValue) {
    this.conversionValue = conversionValue;
  }

  public Stats valuePerConversions(String valuePerConversions) {
    this.valuePerConversions = JsonNullable.of(valuePerConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値/コンバージョン数</div> <div lang=\"en\">Conv. value/conv.</div> 
   * @return valuePerConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値/コンバージョン数</div> <div lang=\"en\">Conv. value/conv.</div> ")


  public JsonNullable<String> getValuePerConversions() {
    return valuePerConversions;
  }

  public void setValuePerConversions(JsonNullable<String> valuePerConversions) {
    this.valuePerConversions = valuePerConversions;
  }

  public Stats convValuePerCost(Double convValuePerCost) {
    this.convValuePerCost = JsonNullable.of(convValuePerCost);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value/cost</div> 
   * @return convValuePerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value/cost</div> ")


  public JsonNullable<Double> getConvValuePerCost() {
    return convValuePerCost;
  }

  public void setConvValuePerCost(JsonNullable<Double> convValuePerCost) {
    this.convValuePerCost = convValuePerCost;
  }

  public Stats allConvValuePerCost(Double allConvValuePerCost) {
    this.allConvValuePerCost = JsonNullable.of(allConvValuePerCost);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）/コスト</div> <div lang=\"en\">Conv. value (all)/cost All Conv.</div> 
   * @return allConvValuePerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）/コスト</div> <div lang=\"en\">Conv. value (all)/cost All Conv.</div> ")


  public JsonNullable<Double> getAllConvValuePerCost() {
    return allConvValuePerCost;
  }

  public void setAllConvValuePerCost(JsonNullable<Double> allConvValuePerCost) {
    this.allConvValuePerCost = allConvValuePerCost;
  }

  public Stats convValueViaAdClickPerCost(Double convValueViaAdClickPerCost) {
    this.convValueViaAdClickPerCost = JsonNullable.of(convValueViaAdClickPerCost);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value(via ad clicks)/cost</div> 
   * @return convValueViaAdClickPerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value(via ad clicks)/cost</div> ")


  public JsonNullable<Double> getConvValueViaAdClickPerCost() {
    return convValueViaAdClickPerCost;
  }

  public void setConvValueViaAdClickPerCost(JsonNullable<Double> convValueViaAdClickPerCost) {
    this.convValueViaAdClickPerCost = convValueViaAdClickPerCost;
  }

  public Stats allConversionValue(String allConversionValue) {
    this.allConversionValue = JsonNullable.of(allConversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）</div> <div lang=\"en\">Conv. value (all)</div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）</div> <div lang=\"en\">Conv. value (all)</div> ")


  public JsonNullable<String> getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(JsonNullable<String> allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public Stats valuePerAllConversions(String valuePerAllConversions) {
    this.valuePerAllConversions = JsonNullable.of(valuePerAllConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）/コンバージョン数（全て）</div> <div lang=\"en\">Conv. value (all)/conv. (all)</div> 
   * @return valuePerAllConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）/コンバージョン数（全て）</div> <div lang=\"en\">Conv. value (all)/conv. (all)</div> ")


  public JsonNullable<String> getValuePerAllConversions() {
    return valuePerAllConversions;
  }

  public void setValuePerAllConversions(JsonNullable<String> valuePerAllConversions) {
    this.valuePerAllConversions = valuePerAllConversions;
  }

  public Stats conversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = JsonNullable.of(conversionValueViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）</div> <div lang=\"en\">Conv. value (via click)</div> 
   * @return conversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）</div> <div lang=\"en\">Conv. value (via click)</div> ")


  public JsonNullable<String> getConversionValueViaAdClick() {
    return conversionValueViaAdClick;
  }

  public void setConversionValueViaAdClick(JsonNullable<String> conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
  }

  public Stats valuePerConversionsViaAdClick(String valuePerConversionsViaAdClick) {
    this.valuePerConversionsViaAdClick = JsonNullable.of(valuePerConversionsViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コンバージョン数（クリック経由）</div> <div lang=\"en\">Conv. value (via click)/conv. (via click)</div> 
   * @return valuePerConversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コンバージョン数（クリック経由）</div> <div lang=\"en\">Conv. value (via click)/conv. (via click)</div> ")


  public JsonNullable<String> getValuePerConversionsViaAdClick() {
    return valuePerConversionsViaAdClick;
  }

  public void setValuePerConversionsViaAdClick(JsonNullable<String> valuePerConversionsViaAdClick) {
    this.valuePerConversionsViaAdClick = valuePerConversionsViaAdClick;
  }

  public Stats cpaViaAdClick(String cpaViaAdClick) {
    this.cpaViaAdClick = JsonNullable.of(cpaViaAdClick);
    return this;
  }

  /**
   * <div lang=\"ja\">コスト/コンバージョン数（クリック経由）</div> <div lang=\"en\">Cost/conv. (via click)</div> 
   * @return cpaViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト/コンバージョン数（クリック経由）</div> <div lang=\"en\">Cost/conv. (via click)</div> ")


  public JsonNullable<String> getCpaViaAdClick() {
    return cpaViaAdClick;
  }

  public void setCpaViaAdClick(JsonNullable<String> cpaViaAdClick) {
    this.cpaViaAdClick = cpaViaAdClick;
  }

  public Stats allCpa(String allCpa) {
    this.allCpa = JsonNullable.of(allCpa);
    return this;
  }

  /**
   * <div lang=\"ja\">コスト/コンバージョン数（全て）</div> <div lang=\"en\">Cost/conv. (all)</div> 
   * @return allCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト/コンバージョン数（全て）</div> <div lang=\"en\">Cost/conv. (all)</div> ")


  public JsonNullable<String> getAllCpa() {
    return allCpa;
  }

  public void setAllCpa(JsonNullable<String> allCpa) {
    this.allCpa = allCpa;
  }

  public Stats crossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = JsonNullable.of(crossDeviceConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">クロスデバイスコンバージョン数</div> <div lang=\"en\">Cross-device conv.</div> 
   * @return crossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クロスデバイスコンバージョン数</div> <div lang=\"en\">Cross-device conv.</div> ")


  public JsonNullable<Long> getCrossDeviceConversions() {
    return crossDeviceConversions;
  }

  public void setCrossDeviceConversions(JsonNullable<Long> crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
  }

  public Stats avgDeliverRank(Double avgDeliverRank) {
    this.avgDeliverRank = JsonNullable.of(avgDeliverRank);
    return this;
  }

  /**
   * <div lang=\"ja\">平均掲載順位（配信された時のeCPM順位の平均）</div> <div lang=\"en\">Avg. position (the average of eCPM rank on ads delivery)</div> 
   * @return avgDeliverRank
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均掲載順位（配信された時のeCPM順位の平均）</div> <div lang=\"en\">Avg. position (the average of eCPM rank on ads delivery)</div> ")


  public JsonNullable<Double> getAvgDeliverRank() {
    return avgDeliverRank;
  }

  public void setAvgDeliverRank(JsonNullable<Double> avgDeliverRank) {
    this.avgDeliverRank = avgDeliverRank;
  }

  public Stats measuredImps(Double measuredImps) {
    this.measuredImps = JsonNullable.of(measuredImps);
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション数</div> <div lang=\"en\">Measured impressions</div> 
   * @return measuredImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション数</div> <div lang=\"en\">Measured impressions</div> ")


  public JsonNullable<Double> getMeasuredImps() {
    return measuredImps;
  }

  public void setMeasuredImps(JsonNullable<Double> measuredImps) {
    this.measuredImps = measuredImps;
  }

  public Stats totalVimps(Long totalVimps) {
    this.totalVimps = JsonNullable.of(totalVimps);
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション数（旧）</div> <div lang=\"en\">Measured impressions (previous)</div> 
   * @return totalVimps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション数（旧）</div> <div lang=\"en\">Measured impressions (previous)</div> ")


  public JsonNullable<Long> getTotalVimps() {
    return totalVimps;
  }

  public void setTotalVimps(JsonNullable<Long> totalVimps) {
    this.totalVimps = totalVimps;
  }

  public Stats measuredImpsRate(Double measuredImpsRate) {
    this.measuredImpsRate = JsonNullable.of(measuredImpsRate);
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション測定率</div> <div lang=\"en\">Measured impression rate</div> 
   * @return measuredImpsRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション測定率</div> <div lang=\"en\">Measured impression rate</div> ")


  public JsonNullable<Double> getMeasuredImpsRate() {
    return measuredImpsRate;
  }

  public void setMeasuredImpsRate(JsonNullable<Double> measuredImpsRate) {
    this.measuredImpsRate = measuredImpsRate;
  }

  public Stats vimps(Long vimps) {
    this.vimps = JsonNullable.of(vimps);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション数</div> <div lang=\"en\">Viewable impressions</div> 
   * @return vimps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション数</div> <div lang=\"en\">Viewable impressions</div> ")


  public JsonNullable<Long> getVimps() {
    return vimps;
  }

  public void setVimps(JsonNullable<Long> vimps) {
    this.vimps = vimps;
  }

  public Stats viewableImpsRate(Double viewableImpsRate) {
    this.viewableImpsRate = JsonNullable.of(viewableImpsRate);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション率</div> <div lang=\"en\">Viewable impression rate</div> 
   * @return viewableImpsRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション率</div> <div lang=\"en\">Viewable impression rate</div> ")


  public JsonNullable<Double> getViewableImpsRate() {
    return viewableImpsRate;
  }

  public void setViewableImpsRate(JsonNullable<Double> viewableImpsRate) {
    this.viewableImpsRate = viewableImpsRate;
  }

  public Stats inViewRate(Double inViewRate) {
    this.inViewRate = JsonNullable.of(inViewRate);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション率（旧）</div> <div lang=\"en\">Viewable impression rate (previous)</div> 
   * @return inViewRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション率（旧）</div> <div lang=\"en\">Viewable impression rate (previous)</div> ")


  public JsonNullable<Double> getInViewRate() {
    return inViewRate;
  }

  public void setInViewRate(JsonNullable<Double> inViewRate) {
    this.inViewRate = inViewRate;
  }

  public Stats viewableClicks(Double viewableClicks) {
    this.viewableClicks = JsonNullable.of(viewableClicks);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック数</div> <div lang=\"en\">Viewable clicks</div> 
   * @return viewableClicks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック数</div> <div lang=\"en\">Viewable clicks</div> ")


  public JsonNullable<Double> getViewableClicks() {
    return viewableClicks;
  }

  public void setViewableClicks(JsonNullable<Double> viewableClicks) {
    this.viewableClicks = viewableClicks;
  }

  public Stats inViewClickCnt(Long inViewClickCnt) {
    this.inViewClickCnt = JsonNullable.of(inViewClickCnt);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック数（旧）</div> <div lang=\"en\">Viewable clicks (previous)</div> 
   * @return inViewClickCnt
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック数（旧）</div> <div lang=\"en\">Viewable clicks (previous)</div> ")


  public JsonNullable<Long> getInViewClickCnt() {
    return inViewClickCnt;
  }

  public void setInViewClickCnt(JsonNullable<Long> inViewClickCnt) {
    this.inViewClickCnt = inViewClickCnt;
  }

  public Stats viewableClickRate(Double viewableClickRate) {
    this.viewableClickRate = JsonNullable.of(viewableClickRate);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック率</div> <div lang=\"en\">Viewable CTR</div> 
   * @return viewableClickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック率</div> <div lang=\"en\">Viewable CTR</div> ")


  public JsonNullable<Double> getViewableClickRate() {
    return viewableClickRate;
  }

  public void setViewableClickRate(JsonNullable<Double> viewableClickRate) {
    this.viewableClickRate = viewableClickRate;
  }

  public Stats inViewClickRate(Double inViewClickRate) {
    this.inViewClickRate = JsonNullable.of(inViewClickRate);
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック率（旧）</div> <div lang=\"en\">Viewable CTR (previous)</div> 
   * @return inViewClickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック率（旧）</div> <div lang=\"en\">Viewable CTR (previous)</div> ")


  public JsonNullable<Double> getInViewClickRate() {
    return inViewClickRate;
  }

  public void setInViewClickRate(JsonNullable<Double> inViewClickRate) {
    this.inViewClickRate = inViewClickRate;
  }

  public Stats paidVideoViews(Long paidVideoViews) {
    this.paidVideoViews = JsonNullable.of(paidVideoViews);
    return this;
  }

  /**
   * <div lang=\"ja\">課金が発生した動画再生数 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video views (CPV)</div> 
   * @return paidVideoViews
  */
  @ApiModelProperty(value = "<div lang=\"ja\">課金が発生した動画再生数 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video views (CPV)</div> ")


  public JsonNullable<Long> getPaidVideoViews() {
    return paidVideoViews;
  }

  public void setPaidVideoViews(JsonNullable<Long> paidVideoViews) {
    this.paidVideoViews = paidVideoViews;
  }

  public Stats paidVideoViewRate(Double paidVideoViewRate) {
    this.paidVideoViewRate = JsonNullable.of(paidVideoViewRate);
    return this;
  }

  /**
   * <div lang=\"ja\">課金が発生した動画再生率 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video view rate (CPV)</div> 
   * @return paidVideoViewRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">課金が発生した動画再生率 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video view rate (CPV)</div> ")


  public JsonNullable<Double> getPaidVideoViewRate() {
    return paidVideoViewRate;
  }

  public void setPaidVideoViewRate(JsonNullable<Double> paidVideoViewRate) {
    this.paidVideoViewRate = paidVideoViewRate;
  }

  public Stats averageCpv(Double averageCpv) {
    this.averageCpv = JsonNullable.of(averageCpv);
    return this;
  }

  /**
   * <div lang=\"ja\">平均CPV</div> <div lang=\"en\">Avg. CPV</div> 
   * @return averageCpv
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPV</div> <div lang=\"en\">Avg. CPV</div> ")


  public JsonNullable<Double> getAverageCpv() {
    return averageCpv;
  }

  public void setAverageCpv(JsonNullable<Double> averageCpv) {
    this.averageCpv = averageCpv;
  }

  public Stats videoViews(Long videoViews) {
    this.videoViews = JsonNullable.of(videoViews);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の再生開始数</div> <div lang=\"en\">Video views</div> 
   * @return videoViews
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の再生開始数</div> <div lang=\"en\">Video views</div> ")


  public JsonNullable<Long> getVideoViews() {
    return videoViews;
  }

  public void setVideoViews(JsonNullable<Long> videoViews) {
    this.videoViews = videoViews;
  }

  public Stats videoViewsTo25(Long videoViewsTo25) {
    this.videoViewsTo25 = JsonNullable.of(videoViewsTo25);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の25％再生数</div> <div lang=\"en\">25% video views</div> 
   * @return videoViewsTo25
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の25％再生数</div> <div lang=\"en\">25% video views</div> ")


  public JsonNullable<Long> getVideoViewsTo25() {
    return videoViewsTo25;
  }

  public void setVideoViewsTo25(JsonNullable<Long> videoViewsTo25) {
    this.videoViewsTo25 = videoViewsTo25;
  }

  public Stats videoViewsTo50(Long videoViewsTo50) {
    this.videoViewsTo50 = JsonNullable.of(videoViewsTo50);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の50％再生数</div> <div lang=\"en\">50% video views</div> 
   * @return videoViewsTo50
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の50％再生数</div> <div lang=\"en\">50% video views</div> ")


  public JsonNullable<Long> getVideoViewsTo50() {
    return videoViewsTo50;
  }

  public void setVideoViewsTo50(JsonNullable<Long> videoViewsTo50) {
    this.videoViewsTo50 = videoViewsTo50;
  }

  public Stats videoViewsTo75(Long videoViewsTo75) {
    this.videoViewsTo75 = JsonNullable.of(videoViewsTo75);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の75％再生数</div> <div lang=\"en\">75% video views</div> 
   * @return videoViewsTo75
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の75％再生数</div> <div lang=\"en\">75% video views</div> ")


  public JsonNullable<Long> getVideoViewsTo75() {
    return videoViewsTo75;
  }

  public void setVideoViewsTo75(JsonNullable<Long> videoViewsTo75) {
    this.videoViewsTo75 = videoViewsTo75;
  }

  public Stats videoViewsTo95(Long videoViewsTo95) {
    this.videoViewsTo95 = JsonNullable.of(videoViewsTo95);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の95％再生数</div> <div lang=\"en\">95% video views</div> 
   * @return videoViewsTo95
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の95％再生数</div> <div lang=\"en\">95% video views</div> ")


  public JsonNullable<Long> getVideoViewsTo95() {
    return videoViewsTo95;
  }

  public void setVideoViewsTo95(JsonNullable<Long> videoViewsTo95) {
    this.videoViewsTo95 = videoViewsTo95;
  }

  public Stats videoViewsTo100(Long videoViewsTo100) {
    this.videoViewsTo100 = JsonNullable.of(videoViewsTo100);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の100％再生数</div> <div lang=\"en\">100% video views</div> 
   * @return videoViewsTo100
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の100％再生数</div> <div lang=\"en\">100% video views</div> ")


  public JsonNullable<Long> getVideoViewsTo100() {
    return videoViewsTo100;
  }

  public void setVideoViewsTo100(JsonNullable<Long> videoViewsTo100) {
    this.videoViewsTo100 = videoViewsTo100;
  }

  public Stats videoViewsTo3Sec(Long videoViewsTo3Sec) {
    this.videoViewsTo3Sec = JsonNullable.of(videoViewsTo3Sec);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の3秒再生数</div> <div lang=\"en\">3 sec video views</div> 
   * @return videoViewsTo3Sec
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の3秒再生数</div> <div lang=\"en\">3 sec video views</div> ")


  public JsonNullable<Long> getVideoViewsTo3Sec() {
    return videoViewsTo3Sec;
  }

  public void setVideoViewsTo3Sec(JsonNullable<Long> videoViewsTo3Sec) {
    this.videoViewsTo3Sec = videoViewsTo3Sec;
  }

  public Stats videoViewsTo10Sec(Long videoViewsTo10Sec) {
    this.videoViewsTo10Sec = JsonNullable.of(videoViewsTo10Sec);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の10秒再生数</div> <div lang=\"en\">10 sec video views</div> 
   * @return videoViewsTo10Sec
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の10秒再生数</div> <div lang=\"en\">10 sec video views</div> ")


  public JsonNullable<Long> getVideoViewsTo10Sec() {
    return videoViewsTo10Sec;
  }

  public void setVideoViewsTo10Sec(JsonNullable<Long> videoViewsTo10Sec) {
    this.videoViewsTo10Sec = videoViewsTo10Sec;
  }

  public Stats averageRateVideoViewed(Double averageRateVideoViewed) {
    this.averageRateVideoViewed = JsonNullable.of(averageRateVideoViewed);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の平均再生率</div> <div lang=\"en\">Avg. video view rate</div> 
   * @return averageRateVideoViewed
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の平均再生率</div> <div lang=\"en\">Avg. video view rate</div> ")


  public JsonNullable<Double> getAverageRateVideoViewed() {
    return averageRateVideoViewed;
  }

  public void setAverageRateVideoViewed(JsonNullable<Double> averageRateVideoViewed) {
    this.averageRateVideoViewed = averageRateVideoViewed;
  }

  public Stats averageDurationVideoViewed(Double averageDurationVideoViewed) {
    this.averageDurationVideoViewed = JsonNullable.of(averageDurationVideoViewed);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の平均再生時間</div> <div lang=\"en\">Avg. duration of video viewed</div> 
   * @return averageDurationVideoViewed
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の平均再生時間</div> <div lang=\"en\">Avg. duration of video viewed</div> ")


  public JsonNullable<Double> getAverageDurationVideoViewed() {
    return averageDurationVideoViewed;
  }

  public void setAverageDurationVideoViewed(JsonNullable<Double> averageDurationVideoViewed) {
    this.averageDurationVideoViewed = averageDurationVideoViewed;
  }

  public Stats videoViewThroughRate(Double videoViewThroughRate) {
    this.videoViewThroughRate = JsonNullable.of(videoViewThroughRate);
    return this;
  }

  /**
   * <div lang=\"ja\">動画の再生完了率</div> <div lang=\"en\">Video view through rate</div> 
   * @return videoViewThroughRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の再生完了率</div> <div lang=\"en\">Video view through rate</div> ")


  public JsonNullable<Double> getVideoViewThroughRate() {
    return videoViewThroughRate;
  }

  public void setVideoViewThroughRate(JsonNullable<Double> videoViewThroughRate) {
    this.videoViewThroughRate = videoViewThroughRate;
  }

  public Stats impressionShare(Double impressionShare) {
    this.impressionShare = JsonNullable.of(impressionShare);
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア</div> <div lang=\"en\">Impression share</div> 
   * @return impressionShare
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア</div> <div lang=\"en\">Impression share</div> ")


  public JsonNullable<Double> getImpressionShare() {
    return impressionShare;
  }

  public void setImpressionShare(JsonNullable<Double> impressionShare) {
    this.impressionShare = impressionShare;
  }

  public Stats budgetImpressionShareLostRate(Double budgetImpressionShareLostRate) {
    this.budgetImpressionShareLostRate = JsonNullable.of(budgetImpressionShareLostRate);
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア損失率（予算）</div> <div lang=\"en\">Impression share lost rate(budget)</div> 
   * @return budgetImpressionShareLostRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア損失率（予算）</div> <div lang=\"en\">Impression share lost rate(budget)</div> ")


  public JsonNullable<Double> getBudgetImpressionShareLostRate() {
    return budgetImpressionShareLostRate;
  }

  public void setBudgetImpressionShareLostRate(JsonNullable<Double> budgetImpressionShareLostRate) {
    this.budgetImpressionShareLostRate = budgetImpressionShareLostRate;
  }

  public Stats rankImpressionShareLostRate(Double rankImpressionShareLostRate) {
    this.rankImpressionShareLostRate = JsonNullable.of(rankImpressionShareLostRate);
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア損失率（ランク）</div> <div lang=\"en\">Impression share lost rate(rank)</div> 
   * @return rankImpressionShareLostRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア損失率（ランク）</div> <div lang=\"en\">Impression share lost rate(rank)</div> ")


  public JsonNullable<Double> getRankImpressionShareLostRate() {
    return rankImpressionShareLostRate;
  }

  public void setRankImpressionShareLostRate(JsonNullable<Double> rankImpressionShareLostRate) {
    this.rankImpressionShareLostRate = rankImpressionShareLostRate;
  }

  public Stats viewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = JsonNullable.of(viewThroughConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> 
   * @return viewThroughConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> ")


  public JsonNullable<Long> getViewThroughConversions() {
    return viewThroughConversions;
  }

  public void setViewThroughConversions(JsonNullable<Long> viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return Objects.equals(this.imps, stats.imps) &&
        Objects.equals(this.impsPrev, stats.impsPrev) &&
        Objects.equals(this.clickCnt, stats.clickCnt) &&
        Objects.equals(this.clickRate, stats.clickRate) &&
        Objects.equals(this.clickRatePrev, stats.clickRatePrev) &&
        Objects.equals(this.cost, stats.cost) &&
        Objects.equals(this.avgCpc, stats.avgCpc) &&
        Objects.equals(this.conversions, stats.conversions) &&
        Objects.equals(this.conversionRate, stats.conversionRate) &&
        Objects.equals(this.conversionsViaAdClick, stats.conversionsViaAdClick) &&
        Objects.equals(this.conversionRateViaAdClick, stats.conversionRateViaAdClick) &&
        Objects.equals(this.allConversions, stats.allConversions) &&
        Objects.equals(this.allConversionRate, stats.allConversionRate) &&
        Objects.equals(this.cpa, stats.cpa) &&
        Objects.equals(this.conversionValue, stats.conversionValue) &&
        Objects.equals(this.valuePerConversions, stats.valuePerConversions) &&
        Objects.equals(this.convValuePerCost, stats.convValuePerCost) &&
        Objects.equals(this.allConvValuePerCost, stats.allConvValuePerCost) &&
        Objects.equals(this.convValueViaAdClickPerCost, stats.convValueViaAdClickPerCost) &&
        Objects.equals(this.allConversionValue, stats.allConversionValue) &&
        Objects.equals(this.valuePerAllConversions, stats.valuePerAllConversions) &&
        Objects.equals(this.conversionValueViaAdClick, stats.conversionValueViaAdClick) &&
        Objects.equals(this.valuePerConversionsViaAdClick, stats.valuePerConversionsViaAdClick) &&
        Objects.equals(this.cpaViaAdClick, stats.cpaViaAdClick) &&
        Objects.equals(this.allCpa, stats.allCpa) &&
        Objects.equals(this.crossDeviceConversions, stats.crossDeviceConversions) &&
        Objects.equals(this.avgDeliverRank, stats.avgDeliverRank) &&
        Objects.equals(this.measuredImps, stats.measuredImps) &&
        Objects.equals(this.totalVimps, stats.totalVimps) &&
        Objects.equals(this.measuredImpsRate, stats.measuredImpsRate) &&
        Objects.equals(this.vimps, stats.vimps) &&
        Objects.equals(this.viewableImpsRate, stats.viewableImpsRate) &&
        Objects.equals(this.inViewRate, stats.inViewRate) &&
        Objects.equals(this.viewableClicks, stats.viewableClicks) &&
        Objects.equals(this.inViewClickCnt, stats.inViewClickCnt) &&
        Objects.equals(this.viewableClickRate, stats.viewableClickRate) &&
        Objects.equals(this.inViewClickRate, stats.inViewClickRate) &&
        Objects.equals(this.paidVideoViews, stats.paidVideoViews) &&
        Objects.equals(this.paidVideoViewRate, stats.paidVideoViewRate) &&
        Objects.equals(this.averageCpv, stats.averageCpv) &&
        Objects.equals(this.videoViews, stats.videoViews) &&
        Objects.equals(this.videoViewsTo25, stats.videoViewsTo25) &&
        Objects.equals(this.videoViewsTo50, stats.videoViewsTo50) &&
        Objects.equals(this.videoViewsTo75, stats.videoViewsTo75) &&
        Objects.equals(this.videoViewsTo95, stats.videoViewsTo95) &&
        Objects.equals(this.videoViewsTo100, stats.videoViewsTo100) &&
        Objects.equals(this.videoViewsTo3Sec, stats.videoViewsTo3Sec) &&
        Objects.equals(this.videoViewsTo10Sec, stats.videoViewsTo10Sec) &&
        Objects.equals(this.averageRateVideoViewed, stats.averageRateVideoViewed) &&
        Objects.equals(this.averageDurationVideoViewed, stats.averageDurationVideoViewed) &&
        Objects.equals(this.videoViewThroughRate, stats.videoViewThroughRate) &&
        Objects.equals(this.impressionShare, stats.impressionShare) &&
        Objects.equals(this.budgetImpressionShareLostRate, stats.budgetImpressionShareLostRate) &&
        Objects.equals(this.rankImpressionShareLostRate, stats.rankImpressionShareLostRate) &&
        Objects.equals(this.viewThroughConversions, stats.viewThroughConversions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imps, impsPrev, clickCnt, clickRate, clickRatePrev, cost, avgCpc, conversions, conversionRate, conversionsViaAdClick, conversionRateViaAdClick, allConversions, allConversionRate, cpa, conversionValue, valuePerConversions, convValuePerCost, allConvValuePerCost, convValueViaAdClickPerCost, allConversionValue, valuePerAllConversions, conversionValueViaAdClick, valuePerConversionsViaAdClick, cpaViaAdClick, allCpa, crossDeviceConversions, avgDeliverRank, measuredImps, totalVimps, measuredImpsRate, vimps, viewableImpsRate, inViewRate, viewableClicks, inViewClickCnt, viewableClickRate, inViewClickRate, paidVideoViews, paidVideoViewRate, averageCpv, videoViews, videoViewsTo25, videoViewsTo50, videoViewsTo75, videoViewsTo95, videoViewsTo100, videoViewsTo3Sec, videoViewsTo10Sec, averageRateVideoViewed, averageDurationVideoViewed, videoViewThroughRate, impressionShare, budgetImpressionShareLostRate, rankImpressionShareLostRate, viewThroughConversions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    
    sb.append("    imps: ").append(toIndentedString(imps)).append("\n");
    sb.append("    impsPrev: ").append(toIndentedString(impsPrev)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    clickRatePrev: ").append(toIndentedString(clickRatePrev)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    avgCpc: ").append(toIndentedString(avgCpc)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    conversionsViaAdClick: ").append(toIndentedString(conversionsViaAdClick)).append("\n");
    sb.append("    conversionRateViaAdClick: ").append(toIndentedString(conversionRateViaAdClick)).append("\n");
    sb.append("    allConversions: ").append(toIndentedString(allConversions)).append("\n");
    sb.append("    allConversionRate: ").append(toIndentedString(allConversionRate)).append("\n");
    sb.append("    cpa: ").append(toIndentedString(cpa)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    valuePerConversions: ").append(toIndentedString(valuePerConversions)).append("\n");
    sb.append("    convValuePerCost: ").append(toIndentedString(convValuePerCost)).append("\n");
    sb.append("    allConvValuePerCost: ").append(toIndentedString(allConvValuePerCost)).append("\n");
    sb.append("    convValueViaAdClickPerCost: ").append(toIndentedString(convValueViaAdClickPerCost)).append("\n");
    sb.append("    allConversionValue: ").append(toIndentedString(allConversionValue)).append("\n");
    sb.append("    valuePerAllConversions: ").append(toIndentedString(valuePerAllConversions)).append("\n");
    sb.append("    conversionValueViaAdClick: ").append(toIndentedString(conversionValueViaAdClick)).append("\n");
    sb.append("    valuePerConversionsViaAdClick: ").append(toIndentedString(valuePerConversionsViaAdClick)).append("\n");
    sb.append("    cpaViaAdClick: ").append(toIndentedString(cpaViaAdClick)).append("\n");
    sb.append("    allCpa: ").append(toIndentedString(allCpa)).append("\n");
    sb.append("    crossDeviceConversions: ").append(toIndentedString(crossDeviceConversions)).append("\n");
    sb.append("    avgDeliverRank: ").append(toIndentedString(avgDeliverRank)).append("\n");
    sb.append("    measuredImps: ").append(toIndentedString(measuredImps)).append("\n");
    sb.append("    totalVimps: ").append(toIndentedString(totalVimps)).append("\n");
    sb.append("    measuredImpsRate: ").append(toIndentedString(measuredImpsRate)).append("\n");
    sb.append("    vimps: ").append(toIndentedString(vimps)).append("\n");
    sb.append("    viewableImpsRate: ").append(toIndentedString(viewableImpsRate)).append("\n");
    sb.append("    inViewRate: ").append(toIndentedString(inViewRate)).append("\n");
    sb.append("    viewableClicks: ").append(toIndentedString(viewableClicks)).append("\n");
    sb.append("    inViewClickCnt: ").append(toIndentedString(inViewClickCnt)).append("\n");
    sb.append("    viewableClickRate: ").append(toIndentedString(viewableClickRate)).append("\n");
    sb.append("    inViewClickRate: ").append(toIndentedString(inViewClickRate)).append("\n");
    sb.append("    paidVideoViews: ").append(toIndentedString(paidVideoViews)).append("\n");
    sb.append("    paidVideoViewRate: ").append(toIndentedString(paidVideoViewRate)).append("\n");
    sb.append("    averageCpv: ").append(toIndentedString(averageCpv)).append("\n");
    sb.append("    videoViews: ").append(toIndentedString(videoViews)).append("\n");
    sb.append("    videoViewsTo25: ").append(toIndentedString(videoViewsTo25)).append("\n");
    sb.append("    videoViewsTo50: ").append(toIndentedString(videoViewsTo50)).append("\n");
    sb.append("    videoViewsTo75: ").append(toIndentedString(videoViewsTo75)).append("\n");
    sb.append("    videoViewsTo95: ").append(toIndentedString(videoViewsTo95)).append("\n");
    sb.append("    videoViewsTo100: ").append(toIndentedString(videoViewsTo100)).append("\n");
    sb.append("    videoViewsTo3Sec: ").append(toIndentedString(videoViewsTo3Sec)).append("\n");
    sb.append("    videoViewsTo10Sec: ").append(toIndentedString(videoViewsTo10Sec)).append("\n");
    sb.append("    averageRateVideoViewed: ").append(toIndentedString(averageRateVideoViewed)).append("\n");
    sb.append("    averageDurationVideoViewed: ").append(toIndentedString(averageDurationVideoViewed)).append("\n");
    sb.append("    videoViewThroughRate: ").append(toIndentedString(videoViewThroughRate)).append("\n");
    sb.append("    impressionShare: ").append(toIndentedString(impressionShare)).append("\n");
    sb.append("    budgetImpressionShareLostRate: ").append(toIndentedString(budgetImpressionShareLostRate)).append("\n");
    sb.append("    rankImpressionShareLostRate: ").append(toIndentedString(rankImpressionShareLostRate)).append("\n");
    sb.append("    viewThroughConversions: ").append(toIndentedString(viewThroughConversions)).append("\n");
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

