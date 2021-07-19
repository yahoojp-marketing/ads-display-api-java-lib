package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Statsオブジェクトは、統計情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Stats object contains the stats information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Statsオブジェクトは、統計情報を保持します。</div> <div lang=\"en\">Stats object contains the stats information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Stats   {
  @JsonProperty("imps")
  private Long imps = null;

  @JsonProperty("impsPrev")
  private Double impsPrev = null;

  @JsonProperty("clickCnt")
  private Long clickCnt = null;

  @JsonProperty("clickRate")
  private Double clickRate = null;

  @JsonProperty("clickRatePrev")
  private Double clickRatePrev = null;

  @JsonProperty("cost")
  private Double cost = null;

  @JsonProperty("avgCpc")
  private Double avgCpc = null;

  @JsonProperty("conversions")
  private Long conversions = null;

  @JsonProperty("conversionRate")
  private Double conversionRate = null;

  @JsonProperty("conversionsViaAdClick")
  private Long conversionsViaAdClick = null;

  @JsonProperty("conversionRateViaAdClick")
  private Double conversionRateViaAdClick = null;

  @JsonProperty("allConversions")
  private Long allConversions = null;

  @JsonProperty("allConversionRate")
  private Double allConversionRate = null;

  @JsonProperty("cpa")
  private String cpa = null;

  @JsonProperty("conversionValue")
  private String conversionValue = null;

  @JsonProperty("valuePerConversions")
  private String valuePerConversions = null;

  @JsonProperty("convValuePerCost")
  private Double convValuePerCost = null;

  @JsonProperty("allConvValuePerCost")
  private Double allConvValuePerCost = null;

  @JsonProperty("convValueViaAdClickPerCost")
  private Double convValueViaAdClickPerCost = null;

  @JsonProperty("allConversionValue")
  private String allConversionValue = null;

  @JsonProperty("valuePerAllConversions")
  private String valuePerAllConversions = null;

  @JsonProperty("conversionValueViaAdClick")
  private String conversionValueViaAdClick = null;

  @JsonProperty("valuePerConversionsViaAdClick")
  private String valuePerConversionsViaAdClick = null;

  @JsonProperty("cpaViaAdClick")
  private String cpaViaAdClick = null;

  @JsonProperty("allCpa")
  private String allCpa = null;

  @JsonProperty("crossDeviceConversions")
  private Long crossDeviceConversions = null;

  @JsonProperty("avgDeliverRank")
  private Double avgDeliverRank = null;

  @JsonProperty("measuredImps")
  private Double measuredImps = null;

  @JsonProperty("totalVimps")
  private Long totalVimps = null;

  @JsonProperty("measuredImpsRate")
  private Double measuredImpsRate = null;

  @JsonProperty("vimps")
  private Long vimps = null;

  @JsonProperty("viewableImpsRate")
  private Double viewableImpsRate = null;

  @JsonProperty("inViewRate")
  private Double inViewRate = null;

  @JsonProperty("viewableClicks")
  private Double viewableClicks = null;

  @JsonProperty("inViewClickCnt")
  private Long inViewClickCnt = null;

  @JsonProperty("viewableClickRate")
  private Double viewableClickRate = null;

  @JsonProperty("inViewClickRate")
  private Double inViewClickRate = null;

  @JsonProperty("paidVideoViews")
  private Long paidVideoViews = null;

  @JsonProperty("paidVideoViewRate")
  private Double paidVideoViewRate = null;

  @JsonProperty("averageCpv")
  private Double averageCpv = null;

  @JsonProperty("videoViews")
  private Long videoViews = null;

  @JsonProperty("videoViewsTo25")
  private Long videoViewsTo25 = null;

  @JsonProperty("videoViewsTo50")
  private Long videoViewsTo50 = null;

  @JsonProperty("videoViewsTo75")
  private Long videoViewsTo75 = null;

  @JsonProperty("videoViewsTo95")
  private Long videoViewsTo95 = null;

  @JsonProperty("videoViewsTo100")
  private Long videoViewsTo100 = null;

  @JsonProperty("videoViewsTo3Sec")
  private Long videoViewsTo3Sec = null;

  @JsonProperty("videoViewsTo10Sec")
  private Long videoViewsTo10Sec = null;

  @JsonProperty("averageRateVideoViewed")
  private Double averageRateVideoViewed = null;

  @JsonProperty("averageDurationVideoViewed")
  private Double averageDurationVideoViewed = null;

  @JsonProperty("videoViewThroughRate")
  private Double videoViewThroughRate = null;

  @JsonProperty("impressionShare")
  private Double impressionShare = null;

  @JsonProperty("budgetImpressionShareLostRate")
  private Double budgetImpressionShareLostRate = null;

  @JsonProperty("rankImpressionShareLostRate")
  private Double rankImpressionShareLostRate = null;

  @JsonProperty("viewThroughConversions")
  private Long viewThroughConversions = null;

  public Stats imps(Long imps) {
    this.imps = imps;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッション数</div> <div lang=\"en\">Number of impressions</div> 
   * @return imps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数</div> <div lang=\"en\">Number of impressions</div> ")


  public Long getImps() {
    return imps;
  }

  public void setImps(Long imps) {
    this.imps = imps;
  }

  public Stats impsPrev(Double impsPrev) {
    this.impsPrev = impsPrev;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッション数（旧）</div> <div lang=\"en\">Impressions (previous)</div> 
   * @return impsPrev
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数（旧）</div> <div lang=\"en\">Impressions (previous)</div> ")


  public Double getImpsPrev() {
    return impsPrev;
  }

  public void setImpsPrev(Double impsPrev) {
    this.impsPrev = impsPrev;
  }

  public Stats clickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
    return this;
  }

  /**
   * <div lang=\"ja\">クリック数</div> <div lang=\"en\">Number of clicks</div> 
   * @return clickCnt
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック数</div> <div lang=\"en\">Number of clicks</div> ")


  public Long getClickCnt() {
    return clickCnt;
  }

  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }

  public Stats clickRate(Double clickRate) {
    this.clickRate = clickRate;
    return this;
  }

  /**
   * <div lang=\"ja\">クリック率</div> <div lang=\"en\">Click through rate</div> 
   * @return clickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率</div> <div lang=\"en\">Click through rate</div> ")


  public Double getClickRate() {
    return clickRate;
  }

  public void setClickRate(Double clickRate) {
    this.clickRate = clickRate;
  }

  public Stats clickRatePrev(Double clickRatePrev) {
    this.clickRatePrev = clickRatePrev;
    return this;
  }

  /**
   * <div lang=\"ja\">クリック率（旧）</div> <div lang=\"en\">CTR (previous)</div> 
   * @return clickRatePrev
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率（旧）</div> <div lang=\"en\">CTR (previous)</div> ")


  public Double getClickRatePrev() {
    return clickRatePrev;
  }

  public void setClickRatePrev(Double clickRatePrev) {
    this.clickRatePrev = clickRatePrev;
  }

  public Stats cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * <div lang=\"ja\">コスト</div> <div lang=\"en\">Cost</div> 
   * @return cost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト</div> <div lang=\"en\">Cost</div> ")


  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public Stats avgCpc(Double avgCpc) {
    this.avgCpc = avgCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">平均CPC</div> <div lang=\"en\">Avg. CPC</div> 
   * @return avgCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPC</div> <div lang=\"en\">Avg. CPC</div> ")


  public Double getAvgCpc() {
    return avgCpc;
  }

  public void setAvgCpc(Double avgCpc) {
    this.avgCpc = avgCpc;
  }

  public Stats conversions(Long conversions) {
    this.conversions = conversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数</div> <div lang=\"en\">Conversions</div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数</div> <div lang=\"en\">Conversions</div> ")


  public Long getConversions() {
    return conversions;
  }

  public void setConversions(Long conversions) {
    this.conversions = conversions;
  }

  public Stats conversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率</div> <div lang=\"en\">Conv. rate</div> 
   * @return conversionRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率</div> <div lang=\"en\">Conv. rate</div> ")


  public Double getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
  }

  public Stats conversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（クリック経由）</div> <div lang=\"en\">Conversions (via click)</div> 
   * @return conversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（クリック経由）</div> <div lang=\"en\">Conversions (via click)</div> ")


  public Long getConversionsViaAdClick() {
    return conversionsViaAdClick;
  }

  public void setConversionsViaAdClick(Long conversionsViaAdClick) {
    this.conversionsViaAdClick = conversionsViaAdClick;
  }

  public Stats conversionRateViaAdClick(Double conversionRateViaAdClick) {
    this.conversionRateViaAdClick = conversionRateViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率（クリック経由）</div> <div lang=\"en\">Conv. rate (via click)</div> 
   * @return conversionRateViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率（クリック経由）</div> <div lang=\"en\">Conv. rate (via click)</div> ")


  public Double getConversionRateViaAdClick() {
    return conversionRateViaAdClick;
  }

  public void setConversionRateViaAdClick(Double conversionRateViaAdClick) {
    this.conversionRateViaAdClick = conversionRateViaAdClick;
  }

  public Stats allConversions(Long allConversions) {
    this.allConversions = allConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン数（全て）</div> <div lang=\"en\">Conversions (all)</div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン数（全て）</div> <div lang=\"en\">Conversions (all)</div> ")


  public Long getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(Long allConversions) {
    this.allConversions = allConversions;
  }

  public Stats allConversionRate(Double allConversionRate) {
    this.allConversionRate = allConversionRate;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン率（全て）</div> <div lang=\"en\">Conv. rate (all)</div> 
   * @return allConversionRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン率（全て）</div> <div lang=\"en\">Conv. rate (all)</div> ")


  public Double getAllConversionRate() {
    return allConversionRate;
  }

  public void setAllConversionRate(Double allConversionRate) {
    this.allConversionRate = allConversionRate;
  }

  public Stats cpa(String cpa) {
    this.cpa = cpa;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価</div> <div lang=\"en\">Conversion cost per acquisition</div> 
   * @return cpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価</div> <div lang=\"en\">Conversion cost per acquisition</div> ")


  public String getCpa() {
    return cpa;
  }

  public void setCpa(String cpa) {
    this.cpa = cpa;
  }

  public Stats conversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値</div> <div lang=\"en\">Conv. value</div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値</div> <div lang=\"en\">Conv. value</div> ")


  public String getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }

  public Stats valuePerConversions(String valuePerConversions) {
    this.valuePerConversions = valuePerConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値/コンバージョン数</div> <div lang=\"en\">Conv. value/conv.</div> 
   * @return valuePerConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値/コンバージョン数</div> <div lang=\"en\">Conv. value/conv.</div> ")


  public String getValuePerConversions() {
    return valuePerConversions;
  }

  public void setValuePerConversions(String valuePerConversions) {
    this.valuePerConversions = valuePerConversions;
  }

  public Stats convValuePerCost(Double convValuePerCost) {
    this.convValuePerCost = convValuePerCost;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value/cost</div> 
   * @return convValuePerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value/cost</div> ")


  public Double getConvValuePerCost() {
    return convValuePerCost;
  }

  public void setConvValuePerCost(Double convValuePerCost) {
    this.convValuePerCost = convValuePerCost;
  }

  public Stats allConvValuePerCost(Double allConvValuePerCost) {
    this.allConvValuePerCost = allConvValuePerCost;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）/コスト</div> <div lang=\"en\">Conv. value (all)/cost All Conv.</div> 
   * @return allConvValuePerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）/コスト</div> <div lang=\"en\">Conv. value (all)/cost All Conv.</div> ")


  public Double getAllConvValuePerCost() {
    return allConvValuePerCost;
  }

  public void setAllConvValuePerCost(Double allConvValuePerCost) {
    this.allConvValuePerCost = allConvValuePerCost;
  }

  public Stats convValueViaAdClickPerCost(Double convValueViaAdClickPerCost) {
    this.convValueViaAdClickPerCost = convValueViaAdClickPerCost;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value(via ad clicks)/cost</div> 
   * @return convValueViaAdClickPerCost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コスト</div> <div lang=\"en\">Conversions value(via ad clicks)/cost</div> ")


  public Double getConvValueViaAdClickPerCost() {
    return convValueViaAdClickPerCost;
  }

  public void setConvValueViaAdClickPerCost(Double convValueViaAdClickPerCost) {
    this.convValueViaAdClickPerCost = convValueViaAdClickPerCost;
  }

  public Stats allConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）</div> <div lang=\"en\">Conv. value (all)</div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）</div> <div lang=\"en\">Conv. value (all)</div> ")


  public String getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public Stats valuePerAllConversions(String valuePerAllConversions) {
    this.valuePerAllConversions = valuePerAllConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（全て）/コンバージョン数（全て）</div> <div lang=\"en\">Conv. value (all)/conv. (all)</div> 
   * @return valuePerAllConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（全て）/コンバージョン数（全て）</div> <div lang=\"en\">Conv. value (all)/conv. (all)</div> ")


  public String getValuePerAllConversions() {
    return valuePerAllConversions;
  }

  public void setValuePerAllConversions(String valuePerAllConversions) {
    this.valuePerAllConversions = valuePerAllConversions;
  }

  public Stats conversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）</div> <div lang=\"en\">Conv. value (via click)</div> 
   * @return conversionValueViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）</div> <div lang=\"en\">Conv. value (via click)</div> ")


  public String getConversionValueViaAdClick() {
    return conversionValueViaAdClick;
  }

  public void setConversionValueViaAdClick(String conversionValueViaAdClick) {
    this.conversionValueViaAdClick = conversionValueViaAdClick;
  }

  public Stats valuePerConversionsViaAdClick(String valuePerConversionsViaAdClick) {
    this.valuePerConversionsViaAdClick = valuePerConversionsViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンの価値（クリック経由）/コンバージョン数（クリック経由）</div> <div lang=\"en\">Conv. value (via click)/conv. (via click)</div> 
   * @return valuePerConversionsViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンの価値（クリック経由）/コンバージョン数（クリック経由）</div> <div lang=\"en\">Conv. value (via click)/conv. (via click)</div> ")


  public String getValuePerConversionsViaAdClick() {
    return valuePerConversionsViaAdClick;
  }

  public void setValuePerConversionsViaAdClick(String valuePerConversionsViaAdClick) {
    this.valuePerConversionsViaAdClick = valuePerConversionsViaAdClick;
  }

  public Stats cpaViaAdClick(String cpaViaAdClick) {
    this.cpaViaAdClick = cpaViaAdClick;
    return this;
  }

  /**
   * <div lang=\"ja\">コスト/コンバージョン数（クリック経由）</div> <div lang=\"en\">Cost/conv. (via click)</div> 
   * @return cpaViaAdClick
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト/コンバージョン数（クリック経由）</div> <div lang=\"en\">Cost/conv. (via click)</div> ")


  public String getCpaViaAdClick() {
    return cpaViaAdClick;
  }

  public void setCpaViaAdClick(String cpaViaAdClick) {
    this.cpaViaAdClick = cpaViaAdClick;
  }

  public Stats allCpa(String allCpa) {
    this.allCpa = allCpa;
    return this;
  }

  /**
   * <div lang=\"ja\">コスト/コンバージョン数（全て）</div> <div lang=\"en\">Cost/conv. (all)</div> 
   * @return allCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コスト/コンバージョン数（全て）</div> <div lang=\"en\">Cost/conv. (all)</div> ")


  public String getAllCpa() {
    return allCpa;
  }

  public void setAllCpa(String allCpa) {
    this.allCpa = allCpa;
  }

  public Stats crossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">クロスデバイスコンバージョン数</div> <div lang=\"en\">Cross-device conv.</div> 
   * @return crossDeviceConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クロスデバイスコンバージョン数</div> <div lang=\"en\">Cross-device conv.</div> ")


  public Long getCrossDeviceConversions() {
    return crossDeviceConversions;
  }

  public void setCrossDeviceConversions(Long crossDeviceConversions) {
    this.crossDeviceConversions = crossDeviceConversions;
  }

  public Stats avgDeliverRank(Double avgDeliverRank) {
    this.avgDeliverRank = avgDeliverRank;
    return this;
  }

  /**
   * <div lang=\"ja\">平均掲載順位（配信された時のeCPM順位の平均）</div> <div lang=\"en\">Avg. position (the average of eCPM rank on ads delivery)</div> 
   * @return avgDeliverRank
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均掲載順位（配信された時のeCPM順位の平均）</div> <div lang=\"en\">Avg. position (the average of eCPM rank on ads delivery)</div> ")


  public Double getAvgDeliverRank() {
    return avgDeliverRank;
  }

  public void setAvgDeliverRank(Double avgDeliverRank) {
    this.avgDeliverRank = avgDeliverRank;
  }

  public Stats measuredImps(Double measuredImps) {
    this.measuredImps = measuredImps;
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション数</div> <div lang=\"en\">Measured impressions</div> 
   * @return measuredImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション数</div> <div lang=\"en\">Measured impressions</div> ")


  public Double getMeasuredImps() {
    return measuredImps;
  }

  public void setMeasuredImps(Double measuredImps) {
    this.measuredImps = measuredImps;
  }

  public Stats totalVimps(Long totalVimps) {
    this.totalVimps = totalVimps;
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション数（旧）</div> <div lang=\"en\">Measured impressions (previous)</div> 
   * @return totalVimps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション数（旧）</div> <div lang=\"en\">Measured impressions (previous)</div> ")


  public Long getTotalVimps() {
    return totalVimps;
  }

  public void setTotalVimps(Long totalVimps) {
    this.totalVimps = totalVimps;
  }

  public Stats measuredImpsRate(Double measuredImpsRate) {
    this.measuredImpsRate = measuredImpsRate;
    return this;
  }

  /**
   * <div lang=\"ja\">メジャードインプレッション測定率</div> <div lang=\"en\">Measured impression rate</div> 
   * @return measuredImpsRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">メジャードインプレッション測定率</div> <div lang=\"en\">Measured impression rate</div> ")


  public Double getMeasuredImpsRate() {
    return measuredImpsRate;
  }

  public void setMeasuredImpsRate(Double measuredImpsRate) {
    this.measuredImpsRate = measuredImpsRate;
  }

  public Stats vimps(Long vimps) {
    this.vimps = vimps;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション数</div> <div lang=\"en\">Viewable impressions</div> 
   * @return vimps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション数</div> <div lang=\"en\">Viewable impressions</div> ")


  public Long getVimps() {
    return vimps;
  }

  public void setVimps(Long vimps) {
    this.vimps = vimps;
  }

  public Stats viewableImpsRate(Double viewableImpsRate) {
    this.viewableImpsRate = viewableImpsRate;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション率</div> <div lang=\"en\">Viewable impression rate</div> 
   * @return viewableImpsRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション率</div> <div lang=\"en\">Viewable impression rate</div> ")


  public Double getViewableImpsRate() {
    return viewableImpsRate;
  }

  public void setViewableImpsRate(Double viewableImpsRate) {
    this.viewableImpsRate = viewableImpsRate;
  }

  public Stats inViewRate(Double inViewRate) {
    this.inViewRate = inViewRate;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルインプレッション率（旧）</div> <div lang=\"en\">Viewable impression rate (previous)</div> 
   * @return inViewRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルインプレッション率（旧）</div> <div lang=\"en\">Viewable impression rate (previous)</div> ")


  public Double getInViewRate() {
    return inViewRate;
  }

  public void setInViewRate(Double inViewRate) {
    this.inViewRate = inViewRate;
  }

  public Stats viewableClicks(Double viewableClicks) {
    this.viewableClicks = viewableClicks;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック数</div> <div lang=\"en\">Viewable clicks</div> 
   * @return viewableClicks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック数</div> <div lang=\"en\">Viewable clicks</div> ")


  public Double getViewableClicks() {
    return viewableClicks;
  }

  public void setViewableClicks(Double viewableClicks) {
    this.viewableClicks = viewableClicks;
  }

  public Stats inViewClickCnt(Long inViewClickCnt) {
    this.inViewClickCnt = inViewClickCnt;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック数（旧）</div> <div lang=\"en\">Viewable clicks (previous)</div> 
   * @return inViewClickCnt
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック数（旧）</div> <div lang=\"en\">Viewable clicks (previous)</div> ")


  public Long getInViewClickCnt() {
    return inViewClickCnt;
  }

  public void setInViewClickCnt(Long inViewClickCnt) {
    this.inViewClickCnt = inViewClickCnt;
  }

  public Stats viewableClickRate(Double viewableClickRate) {
    this.viewableClickRate = viewableClickRate;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック率</div> <div lang=\"en\">Viewable CTR</div> 
   * @return viewableClickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック率</div> <div lang=\"en\">Viewable CTR</div> ")


  public Double getViewableClickRate() {
    return viewableClickRate;
  }

  public void setViewableClickRate(Double viewableClickRate) {
    this.viewableClickRate = viewableClickRate;
  }

  public Stats inViewClickRate(Double inViewClickRate) {
    this.inViewClickRate = inViewClickRate;
    return this;
  }

  /**
   * <div lang=\"ja\">ビューアブルクリック率（旧）</div> <div lang=\"en\">Viewable CTR (previous)</div> 
   * @return inViewClickRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビューアブルクリック率（旧）</div> <div lang=\"en\">Viewable CTR (previous)</div> ")


  public Double getInViewClickRate() {
    return inViewClickRate;
  }

  public void setInViewClickRate(Double inViewClickRate) {
    this.inViewClickRate = inViewClickRate;
  }

  public Stats paidVideoViews(Long paidVideoViews) {
    this.paidVideoViews = paidVideoViews;
    return this;
  }

  /**
   * <div lang=\"ja\">課金が発生した動画再生数 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video views (CPV)</div> 
   * @return paidVideoViews
  */
  @ApiModelProperty(value = "<div lang=\"ja\">課金が発生した動画再生数 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video views (CPV)</div> ")


  public Long getPaidVideoViews() {
    return paidVideoViews;
  }

  public void setPaidVideoViews(Long paidVideoViews) {
    this.paidVideoViews = paidVideoViews;
  }

  public Stats paidVideoViewRate(Double paidVideoViewRate) {
    this.paidVideoViewRate = paidVideoViewRate;
    return this;
  }

  /**
   * <div lang=\"ja\">課金が発生した動画再生率 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video view rate (CPV)</div> 
   * @return paidVideoViewRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">課金が発生した動画再生率 (CPV課金キャンペーンのみ)</div> <div lang=\"en\">Paid video view rate (CPV)</div> ")


  public Double getPaidVideoViewRate() {
    return paidVideoViewRate;
  }

  public void setPaidVideoViewRate(Double paidVideoViewRate) {
    this.paidVideoViewRate = paidVideoViewRate;
  }

  public Stats averageCpv(Double averageCpv) {
    this.averageCpv = averageCpv;
    return this;
  }

  /**
   * <div lang=\"ja\">平均CPV</div> <div lang=\"en\">Avg. CPV</div> 
   * @return averageCpv
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPV</div> <div lang=\"en\">Avg. CPV</div> ")


  public Double getAverageCpv() {
    return averageCpv;
  }

  public void setAverageCpv(Double averageCpv) {
    this.averageCpv = averageCpv;
  }

  public Stats videoViews(Long videoViews) {
    this.videoViews = videoViews;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の再生開始数</div> <div lang=\"en\">Video views</div> 
   * @return videoViews
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の再生開始数</div> <div lang=\"en\">Video views</div> ")


  public Long getVideoViews() {
    return videoViews;
  }

  public void setVideoViews(Long videoViews) {
    this.videoViews = videoViews;
  }

  public Stats videoViewsTo25(Long videoViewsTo25) {
    this.videoViewsTo25 = videoViewsTo25;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の25％再生数</div> <div lang=\"en\">25% video views</div> 
   * @return videoViewsTo25
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の25％再生数</div> <div lang=\"en\">25% video views</div> ")


  public Long getVideoViewsTo25() {
    return videoViewsTo25;
  }

  public void setVideoViewsTo25(Long videoViewsTo25) {
    this.videoViewsTo25 = videoViewsTo25;
  }

  public Stats videoViewsTo50(Long videoViewsTo50) {
    this.videoViewsTo50 = videoViewsTo50;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の50％再生数</div> <div lang=\"en\">50% video views</div> 
   * @return videoViewsTo50
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の50％再生数</div> <div lang=\"en\">50% video views</div> ")


  public Long getVideoViewsTo50() {
    return videoViewsTo50;
  }

  public void setVideoViewsTo50(Long videoViewsTo50) {
    this.videoViewsTo50 = videoViewsTo50;
  }

  public Stats videoViewsTo75(Long videoViewsTo75) {
    this.videoViewsTo75 = videoViewsTo75;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の75％再生数</div> <div lang=\"en\">75% video views</div> 
   * @return videoViewsTo75
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の75％再生数</div> <div lang=\"en\">75% video views</div> ")


  public Long getVideoViewsTo75() {
    return videoViewsTo75;
  }

  public void setVideoViewsTo75(Long videoViewsTo75) {
    this.videoViewsTo75 = videoViewsTo75;
  }

  public Stats videoViewsTo95(Long videoViewsTo95) {
    this.videoViewsTo95 = videoViewsTo95;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の95％再生数</div> <div lang=\"en\">95% video views</div> 
   * @return videoViewsTo95
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の95％再生数</div> <div lang=\"en\">95% video views</div> ")


  public Long getVideoViewsTo95() {
    return videoViewsTo95;
  }

  public void setVideoViewsTo95(Long videoViewsTo95) {
    this.videoViewsTo95 = videoViewsTo95;
  }

  public Stats videoViewsTo100(Long videoViewsTo100) {
    this.videoViewsTo100 = videoViewsTo100;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の100％再生数</div> <div lang=\"en\">100% video views</div> 
   * @return videoViewsTo100
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の100％再生数</div> <div lang=\"en\">100% video views</div> ")


  public Long getVideoViewsTo100() {
    return videoViewsTo100;
  }

  public void setVideoViewsTo100(Long videoViewsTo100) {
    this.videoViewsTo100 = videoViewsTo100;
  }

  public Stats videoViewsTo3Sec(Long videoViewsTo3Sec) {
    this.videoViewsTo3Sec = videoViewsTo3Sec;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の3秒再生数</div> <div lang=\"en\">3 sec video views</div> 
   * @return videoViewsTo3Sec
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の3秒再生数</div> <div lang=\"en\">3 sec video views</div> ")


  public Long getVideoViewsTo3Sec() {
    return videoViewsTo3Sec;
  }

  public void setVideoViewsTo3Sec(Long videoViewsTo3Sec) {
    this.videoViewsTo3Sec = videoViewsTo3Sec;
  }

  public Stats videoViewsTo10Sec(Long videoViewsTo10Sec) {
    this.videoViewsTo10Sec = videoViewsTo10Sec;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の10秒再生数</div> <div lang=\"en\">10 sec video views</div> 
   * @return videoViewsTo10Sec
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の10秒再生数</div> <div lang=\"en\">10 sec video views</div> ")


  public Long getVideoViewsTo10Sec() {
    return videoViewsTo10Sec;
  }

  public void setVideoViewsTo10Sec(Long videoViewsTo10Sec) {
    this.videoViewsTo10Sec = videoViewsTo10Sec;
  }

  public Stats averageRateVideoViewed(Double averageRateVideoViewed) {
    this.averageRateVideoViewed = averageRateVideoViewed;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の平均再生率</div> <div lang=\"en\">Avg. video view rate</div> 
   * @return averageRateVideoViewed
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の平均再生率</div> <div lang=\"en\">Avg. video view rate</div> ")


  public Double getAverageRateVideoViewed() {
    return averageRateVideoViewed;
  }

  public void setAverageRateVideoViewed(Double averageRateVideoViewed) {
    this.averageRateVideoViewed = averageRateVideoViewed;
  }

  public Stats averageDurationVideoViewed(Double averageDurationVideoViewed) {
    this.averageDurationVideoViewed = averageDurationVideoViewed;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の平均再生時間</div> <div lang=\"en\">Avg. duration of video viewed</div> 
   * @return averageDurationVideoViewed
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の平均再生時間</div> <div lang=\"en\">Avg. duration of video viewed</div> ")


  public Double getAverageDurationVideoViewed() {
    return averageDurationVideoViewed;
  }

  public void setAverageDurationVideoViewed(Double averageDurationVideoViewed) {
    this.averageDurationVideoViewed = averageDurationVideoViewed;
  }

  public Stats videoViewThroughRate(Double videoViewThroughRate) {
    this.videoViewThroughRate = videoViewThroughRate;
    return this;
  }

  /**
   * <div lang=\"ja\">動画の再生完了率</div> <div lang=\"en\">Video view through rate</div> 
   * @return videoViewThroughRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">動画の再生完了率</div> <div lang=\"en\">Video view through rate</div> ")


  public Double getVideoViewThroughRate() {
    return videoViewThroughRate;
  }

  public void setVideoViewThroughRate(Double videoViewThroughRate) {
    this.videoViewThroughRate = videoViewThroughRate;
  }

  public Stats impressionShare(Double impressionShare) {
    this.impressionShare = impressionShare;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア</div> <div lang=\"en\">Impression share</div> 
   * @return impressionShare
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア</div> <div lang=\"en\">Impression share</div> ")


  public Double getImpressionShare() {
    return impressionShare;
  }

  public void setImpressionShare(Double impressionShare) {
    this.impressionShare = impressionShare;
  }

  public Stats budgetImpressionShareLostRate(Double budgetImpressionShareLostRate) {
    this.budgetImpressionShareLostRate = budgetImpressionShareLostRate;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア損失率（予算）</div> <div lang=\"en\">Impression share lost rate(budget)</div> 
   * @return budgetImpressionShareLostRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア損失率（予算）</div> <div lang=\"en\">Impression share lost rate(budget)</div> ")


  public Double getBudgetImpressionShareLostRate() {
    return budgetImpressionShareLostRate;
  }

  public void setBudgetImpressionShareLostRate(Double budgetImpressionShareLostRate) {
    this.budgetImpressionShareLostRate = budgetImpressionShareLostRate;
  }

  public Stats rankImpressionShareLostRate(Double rankImpressionShareLostRate) {
    this.rankImpressionShareLostRate = rankImpressionShareLostRate;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッションシェア損失率（ランク）</div> <div lang=\"en\">Impression share lost rate(rank)</div> 
   * @return rankImpressionShareLostRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッションシェア損失率（ランク）</div> <div lang=\"en\">Impression share lost rate(rank)</div> ")


  public Double getRankImpressionShareLostRate() {
    return rankImpressionShareLostRate;
  }

  public void setRankImpressionShareLostRate(Double rankImpressionShareLostRate) {
    this.rankImpressionShareLostRate = rankImpressionShareLostRate;
  }

  public Stats viewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> 
   * @return viewThroughConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ビュースルーコンバージョン数</div> <div lang=\"en\">View through conversions</div> ")


  public Long getViewThroughConversions() {
    return viewThroughConversions;
  }

  public void setViewThroughConversions(Long viewThroughConversions) {
    this.viewThroughConversions = viewThroughConversions;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

