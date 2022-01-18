package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceActionAfterVideoAdTap;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceAdRequirement;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceCampaignBiddingStrategyType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceInventoryDetailStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceInventoryResult;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceInventoryUnit;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePlacementMonopolyFlg;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePredictionResult;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServicePriceType;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceReservationStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceUnreservableReason;
import jp.co.yahoo.adsdisplayapi.v7.model.GuaranteedInventoryServiceViewableFrequencyCap;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventory object holds information about the delivery simulation of the guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。</div> <div lang=\"en\">GuaranteedInventory object holds information about the delivery simulation of the guaranteed campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedInventoryServiceInventory   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("lifetimeBudget")
  private Long lifetimeBudget = null;

  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("vImps")
  private Long vImps = null;

  @JsonProperty("sovRate")
  private Long sovRate = null;

  @JsonProperty("slots")
  private Long slots = null;

  @JsonProperty("campaignGoal")
  private String campaignGoal = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("maxSellableVImps")
  private Long maxSellableVImps = null;

  @JsonProperty("maxSellableReach")
  private Long maxSellableReach = null;

  @JsonProperty("maxReservableVImps")
  private Long maxReservableVImps = null;

  @JsonProperty("maxReservableSlots")
  private Long maxReservableSlots = null;

  @JsonProperty("lowerBudgetLimit")
  private Long lowerBudgetLimit = null;

  @JsonProperty("upperBudgetLimit")
  private Long upperBudgetLimit = null;

  @JsonProperty("packageId")
  private Long packageId = null;

  @JsonProperty("packageName")
  private String packageName = null;

  @JsonProperty("packageHistoryId")
  private Long packageHistoryId = null;

  @JsonProperty("adCategoryIds")
  @Valid
  private List<Long> adCategoryIds = null;

  @JsonProperty("promotionUrl")
  private String promotionUrl = null;

  @JsonProperty("minimumPurchaseVImps")
  private Long minimumPurchaseVImps = null;

  @JsonProperty("maximumPurchaseVImps")
  private Long maximumPurchaseVImps = null;

  @JsonProperty("inventoryUnit")
  private GuaranteedInventoryServiceInventoryUnit inventoryUnit = null;

  @JsonProperty("campaignBiddingStrategyType")
  private GuaranteedInventoryServiceCampaignBiddingStrategyType campaignBiddingStrategyType = null;

  @JsonProperty("viewableFrequencyCap")
  private GuaranteedInventoryServiceViewableFrequencyCap viewableFrequencyCap = null;

  @JsonProperty("reservationStatus")
  private GuaranteedInventoryServiceReservationStatus reservationStatus = null;

  @JsonProperty("unreservableReason")
  private GuaranteedInventoryServiceUnreservableReason unreservableReason = null;

  @JsonProperty("adRequirements")
  @Valid
  private List<GuaranteedInventoryServiceAdRequirement> adRequirements = null;

  @JsonProperty("inventoryDetailStatus")
  private GuaranteedInventoryServiceInventoryDetailStatus inventoryDetailStatus = null;

  @JsonProperty("actionAfterVideoAdTap")
  private GuaranteedInventoryServiceActionAfterVideoAdTap actionAfterVideoAdTap = null;

  @JsonProperty("priceType")
  private GuaranteedInventoryServicePriceType priceType = null;

  @JsonProperty("placementMonopolyFlg")
  private GuaranteedInventoryServicePlacementMonopolyFlg placementMonopolyFlg = null;

  @JsonProperty("predictionResults")
  @Valid
  private List<GuaranteedInventoryServicePredictionResult> predictionResults = null;

  @JsonProperty("requestedConditionPredictionResult")
  private GuaranteedInventoryServicePredictionResult requestedConditionPredictionResult = null;

  @JsonProperty("inventoryResult")
  @Valid
  private List<GuaranteedInventoryServiceInventoryResult> inventoryResult = null;

  @JsonProperty("targets")
  @Valid
  private List<GuaranteedInventoryServiceAdGroupTarget> targets = null;

  public GuaranteedInventoryServiceInventory accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account ID.<br> This field is optional in ADD operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account ID.<br> This field is optional in ADD operation. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedInventoryServiceInventory lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedInventoryServiceInventory reach(Long reach) {
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

  public GuaranteedInventoryServiceInventory vImps(Long vImps) {
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

  public GuaranteedInventoryServiceInventory sovRate(Long sovRate) {
    this.sovRate = sovRate;
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（1%〜100%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（1%〜100%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getSovRate() {
    return sovRate;
  }

  public void setSovRate(Long sovRate) {
    this.sovRate = sovRate;
  }

  public GuaranteedInventoryServiceInventory slots(Long slots) {
    this.slots = slots;
    return this;
  }

  /**
   * <div lang=\"ja\"> 購入枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of buying slots.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return slots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 購入枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of buying slots.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getSlots() {
    return slots;
  }

  public void setSlots(Long slots) {
    this.slots = slots;
  }

  public GuaranteedInventoryServiceInventory campaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign goal.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign goal.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public GuaranteedInventoryServiceInventory startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date of campaign. <br> This field is required in ADD operation. </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date of campaign. <br> This field is required in ADD operation. </div> Format: yyyyMMdd ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public GuaranteedInventoryServiceInventory startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの開始時刻です。<br> ※フォーマット：HHmm </div> <div lang=\"en\"> Start time of campaign.<br> * Format: HHmm </div> 
   * @return startTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始時刻です。<br> ※フォーマット：HHmm </div> <div lang=\"en\"> Start time of campaign.<br> * Format: HHmm </div> ")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public GuaranteedInventoryServiceInventory endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date of campaign. <br> This field is required in ADD operation.<br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date of campaign. <br> This field is required in ADD operation.<br> </div> Format: yyyyMMdd ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public GuaranteedInventoryServiceInventory endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの終了時刻です。<br> ※フォーマット：HHmm </div> <div lang=\"en\"> End time of campaign.<br> * Format: HHmm </div> 
   * @return endTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了時刻です。<br> ※フォーマット：HHmm </div> <div lang=\"en\"> End time of campaign.<br> * Format: HHmm </div> ")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public GuaranteedInventoryServiceInventory maxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 販売可能な最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of viewable impression available for sale. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxSellableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 販売可能な最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of viewable impression available for sale. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxSellableVImps() {
    return maxSellableVImps;
  }

  public void setMaxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
  }

  public GuaranteedInventoryServiceInventory maxSellableReach(Long maxSellableReach) {
    this.maxSellableReach = maxSellableReach;
    return this;
  }

  /**
   * <div lang=\"ja\"> 販売可能な最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reach available for sale.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxSellableReach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 販売可能な最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reach available for sale.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxSellableReach() {
    return maxSellableReach;
  }

  public void setMaxSellableReach(Long maxSellableReach) {
    this.maxSellableReach = maxSellableReach;
  }

  public GuaranteedInventoryServiceInventory maxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定された条件で予約可能な最大配信量です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum ad delivery amount that can be reserved under the specified conditions. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReservableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定された条件で予約可能な最大配信量です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum ad delivery amount that can be reserved under the specified conditions. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxReservableVImps() {
    return maxReservableVImps;
  }

  public void setMaxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
  }

  public GuaranteedInventoryServiceInventory maxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大予約可能枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reservable slots. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReservableSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大予約可能枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reservable slots. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxReservableSlots() {
    return maxReservableSlots;
  }

  public void setMaxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
  }

  public GuaranteedInventoryServiceInventory lowerBudgetLimit(Long lowerBudgetLimit) {
    this.lowerBudgetLimit = lowerBudgetLimit;
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約可能な下限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Minimum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lowerBudgetLimit
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約可能な下限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Minimum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getLowerBudgetLimit() {
    return lowerBudgetLimit;
  }

  public void setLowerBudgetLimit(Long lowerBudgetLimit) {
    this.lowerBudgetLimit = lowerBudgetLimit;
  }

  public GuaranteedInventoryServiceInventory upperBudgetLimit(Long upperBudgetLimit) {
    this.upperBudgetLimit = upperBudgetLimit;
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約可能な上限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return upperBudgetLimit
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約可能な上限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getUpperBudgetLimit() {
    return upperBudgetLimit;
  }

  public void setUpperBudgetLimit(Long upperBudgetLimit) {
    this.upperBudgetLimit = upperBudgetLimit;
  }

  public GuaranteedInventoryServiceInventory packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package ID.<br> In ADD operation, this field will be required. </div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package ID.<br> In ADD operation, this field will be required. </div> ")


  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public GuaranteedInventoryServiceInventory packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return packageName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public GuaranteedInventoryServiceInventory packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package history ID.<br> In ADD operation, this field will be required. </div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package history ID.<br> In ADD operation, this field will be required. </div> ")


  public Long getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedInventoryServiceInventory adCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
    return this;
  }

  public GuaranteedInventoryServiceInventory addAdCategoryIdsItem(Long adCategoryIdsItem) {
    if (this.adCategoryIds == null) {
      this.adCategoryIds = new ArrayList<>();
    }
    this.adCategoryIds.add(adCategoryIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> This field is optional in ADD operation. </div> 
   * @return adCategoryIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> This field is optional in ADD operation. </div> ")


  public List<Long> getAdCategoryIds() {
    return adCategoryIds;
  }

  public void setAdCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
  }

  public GuaranteedInventoryServiceInventory promotionUrl(String promotionUrl) {
    this.promotionUrl = promotionUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">表示URLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Promotion url.<br> This field is optional in ADD operation.</div> 
   * @return promotionUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">表示URLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Promotion url.<br> This field is optional in ADD operation.</div> ")


  public String getPromotionUrl() {
    return promotionUrl;
  }

  public void setPromotionUrl(String promotionUrl) {
    this.promotionUrl = promotionUrl;
  }

  public GuaranteedInventoryServiceInventory minimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> 
   * @return minimumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> ")


  public Long getMinimumPurchaseVImps() {
    return minimumPurchaseVImps;
  }

  public void setMinimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
  }

  public GuaranteedInventoryServiceInventory maximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
    return this;
  }

  /**
   * <div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> 
   * @return maximumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> ")


  public Long getMaximumPurchaseVImps() {
    return maximumPurchaseVImps;
  }

  public void setMaximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
  }

  public GuaranteedInventoryServiceInventory inventoryUnit(GuaranteedInventoryServiceInventoryUnit inventoryUnit) {
    this.inventoryUnit = inventoryUnit;
    return this;
  }

  /**
   * Get inventoryUnit
   * @return inventoryUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceInventoryUnit getInventoryUnit() {
    return inventoryUnit;
  }

  public void setInventoryUnit(GuaranteedInventoryServiceInventoryUnit inventoryUnit) {
    this.inventoryUnit = inventoryUnit;
  }

  public GuaranteedInventoryServiceInventory campaignBiddingStrategyType(GuaranteedInventoryServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(GuaranteedInventoryServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public GuaranteedInventoryServiceInventory viewableFrequencyCap(GuaranteedInventoryServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceViewableFrequencyCap getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(GuaranteedInventoryServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public GuaranteedInventoryServiceInventory reservationStatus(GuaranteedInventoryServiceReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
    return this;
  }

  /**
   * Get reservationStatus
   * @return reservationStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(GuaranteedInventoryServiceReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public GuaranteedInventoryServiceInventory unreservableReason(GuaranteedInventoryServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
    return this;
  }

  /**
   * Get unreservableReason
   * @return unreservableReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceUnreservableReason getUnreservableReason() {
    return unreservableReason;
  }

  public void setUnreservableReason(GuaranteedInventoryServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
  }

  public GuaranteedInventoryServiceInventory adRequirements(List<GuaranteedInventoryServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
    return this;
  }

  public GuaranteedInventoryServiceInventory addAdRequirementsItem(GuaranteedInventoryServiceAdRequirement adRequirementsItem) {
    if (this.adRequirements == null) {
      this.adRequirements = new ArrayList<>();
    }
    this.adRequirements.add(adRequirementsItem);
    return this;
  }

  /**
   * Get adRequirements
   * @return adRequirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedInventoryServiceAdRequirement> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(List<GuaranteedInventoryServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedInventoryServiceInventory inventoryDetailStatus(GuaranteedInventoryServiceInventoryDetailStatus inventoryDetailStatus) {
    this.inventoryDetailStatus = inventoryDetailStatus;
    return this;
  }

  /**
   * Get inventoryDetailStatus
   * @return inventoryDetailStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceInventoryDetailStatus getInventoryDetailStatus() {
    return inventoryDetailStatus;
  }

  public void setInventoryDetailStatus(GuaranteedInventoryServiceInventoryDetailStatus inventoryDetailStatus) {
    this.inventoryDetailStatus = inventoryDetailStatus;
  }

  public GuaranteedInventoryServiceInventory actionAfterVideoAdTap(GuaranteedInventoryServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServiceActionAfterVideoAdTap getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(GuaranteedInventoryServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }

  public GuaranteedInventoryServiceInventory priceType(GuaranteedInventoryServicePriceType priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(GuaranteedInventoryServicePriceType priceType) {
    this.priceType = priceType;
  }

  public GuaranteedInventoryServiceInventory placementMonopolyFlg(GuaranteedInventoryServicePlacementMonopolyFlg placementMonopolyFlg) {
    this.placementMonopolyFlg = placementMonopolyFlg;
    return this;
  }

  /**
   * Get placementMonopolyFlg
   * @return placementMonopolyFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePlacementMonopolyFlg getPlacementMonopolyFlg() {
    return placementMonopolyFlg;
  }

  public void setPlacementMonopolyFlg(GuaranteedInventoryServicePlacementMonopolyFlg placementMonopolyFlg) {
    this.placementMonopolyFlg = placementMonopolyFlg;
  }

  public GuaranteedInventoryServiceInventory predictionResults(List<GuaranteedInventoryServicePredictionResult> predictionResults) {
    this.predictionResults = predictionResults;
    return this;
  }

  public GuaranteedInventoryServiceInventory addPredictionResultsItem(GuaranteedInventoryServicePredictionResult predictionResultsItem) {
    if (this.predictionResults == null) {
      this.predictionResults = new ArrayList<>();
    }
    this.predictionResults.add(predictionResultsItem);
    return this;
  }

  /**
   * Get predictionResults
   * @return predictionResults
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedInventoryServicePredictionResult> getPredictionResults() {
    return predictionResults;
  }

  public void setPredictionResults(List<GuaranteedInventoryServicePredictionResult> predictionResults) {
    this.predictionResults = predictionResults;
  }

  public GuaranteedInventoryServiceInventory requestedConditionPredictionResult(GuaranteedInventoryServicePredictionResult requestedConditionPredictionResult) {
    this.requestedConditionPredictionResult = requestedConditionPredictionResult;
    return this;
  }

  /**
   * Get requestedConditionPredictionResult
   * @return requestedConditionPredictionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedInventoryServicePredictionResult getRequestedConditionPredictionResult() {
    return requestedConditionPredictionResult;
  }

  public void setRequestedConditionPredictionResult(GuaranteedInventoryServicePredictionResult requestedConditionPredictionResult) {
    this.requestedConditionPredictionResult = requestedConditionPredictionResult;
  }

  public GuaranteedInventoryServiceInventory inventoryResult(List<GuaranteedInventoryServiceInventoryResult> inventoryResult) {
    this.inventoryResult = inventoryResult;
    return this;
  }

  public GuaranteedInventoryServiceInventory addInventoryResultItem(GuaranteedInventoryServiceInventoryResult inventoryResultItem) {
    if (this.inventoryResult == null) {
      this.inventoryResult = new ArrayList<>();
    }
    this.inventoryResult.add(inventoryResultItem);
    return this;
  }

  /**
   * Get inventoryResult
   * @return inventoryResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedInventoryServiceInventoryResult> getInventoryResult() {
    return inventoryResult;
  }

  public void setInventoryResult(List<GuaranteedInventoryServiceInventoryResult> inventoryResult) {
    this.inventoryResult = inventoryResult;
  }

  public GuaranteedInventoryServiceInventory targets(List<GuaranteedInventoryServiceAdGroupTarget> targets) {
    this.targets = targets;
    return this;
  }

  public GuaranteedInventoryServiceInventory addTargetsItem(GuaranteedInventoryServiceAdGroupTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedInventoryServiceAdGroupTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<GuaranteedInventoryServiceAdGroupTarget> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceInventory guaranteedInventoryServiceInventory = (GuaranteedInventoryServiceInventory) o;
    return Objects.equals(this.accountId, guaranteedInventoryServiceInventory.accountId) &&
        Objects.equals(this.lifetimeBudget, guaranteedInventoryServiceInventory.lifetimeBudget) &&
        Objects.equals(this.reach, guaranteedInventoryServiceInventory.reach) &&
        Objects.equals(this.vImps, guaranteedInventoryServiceInventory.vImps) &&
        Objects.equals(this.sovRate, guaranteedInventoryServiceInventory.sovRate) &&
        Objects.equals(this.slots, guaranteedInventoryServiceInventory.slots) &&
        Objects.equals(this.campaignGoal, guaranteedInventoryServiceInventory.campaignGoal) &&
        Objects.equals(this.startDate, guaranteedInventoryServiceInventory.startDate) &&
        Objects.equals(this.startTime, guaranteedInventoryServiceInventory.startTime) &&
        Objects.equals(this.endDate, guaranteedInventoryServiceInventory.endDate) &&
        Objects.equals(this.endTime, guaranteedInventoryServiceInventory.endTime) &&
        Objects.equals(this.maxSellableVImps, guaranteedInventoryServiceInventory.maxSellableVImps) &&
        Objects.equals(this.maxSellableReach, guaranteedInventoryServiceInventory.maxSellableReach) &&
        Objects.equals(this.maxReservableVImps, guaranteedInventoryServiceInventory.maxReservableVImps) &&
        Objects.equals(this.maxReservableSlots, guaranteedInventoryServiceInventory.maxReservableSlots) &&
        Objects.equals(this.lowerBudgetLimit, guaranteedInventoryServiceInventory.lowerBudgetLimit) &&
        Objects.equals(this.upperBudgetLimit, guaranteedInventoryServiceInventory.upperBudgetLimit) &&
        Objects.equals(this.packageId, guaranteedInventoryServiceInventory.packageId) &&
        Objects.equals(this.packageName, guaranteedInventoryServiceInventory.packageName) &&
        Objects.equals(this.packageHistoryId, guaranteedInventoryServiceInventory.packageHistoryId) &&
        Objects.equals(this.adCategoryIds, guaranteedInventoryServiceInventory.adCategoryIds) &&
        Objects.equals(this.promotionUrl, guaranteedInventoryServiceInventory.promotionUrl) &&
        Objects.equals(this.minimumPurchaseVImps, guaranteedInventoryServiceInventory.minimumPurchaseVImps) &&
        Objects.equals(this.maximumPurchaseVImps, guaranteedInventoryServiceInventory.maximumPurchaseVImps) &&
        Objects.equals(this.inventoryUnit, guaranteedInventoryServiceInventory.inventoryUnit) &&
        Objects.equals(this.campaignBiddingStrategyType, guaranteedInventoryServiceInventory.campaignBiddingStrategyType) &&
        Objects.equals(this.viewableFrequencyCap, guaranteedInventoryServiceInventory.viewableFrequencyCap) &&
        Objects.equals(this.reservationStatus, guaranteedInventoryServiceInventory.reservationStatus) &&
        Objects.equals(this.unreservableReason, guaranteedInventoryServiceInventory.unreservableReason) &&
        Objects.equals(this.adRequirements, guaranteedInventoryServiceInventory.adRequirements) &&
        Objects.equals(this.inventoryDetailStatus, guaranteedInventoryServiceInventory.inventoryDetailStatus) &&
        Objects.equals(this.actionAfterVideoAdTap, guaranteedInventoryServiceInventory.actionAfterVideoAdTap) &&
        Objects.equals(this.priceType, guaranteedInventoryServiceInventory.priceType) &&
        Objects.equals(this.placementMonopolyFlg, guaranteedInventoryServiceInventory.placementMonopolyFlg) &&
        Objects.equals(this.predictionResults, guaranteedInventoryServiceInventory.predictionResults) &&
        Objects.equals(this.requestedConditionPredictionResult, guaranteedInventoryServiceInventory.requestedConditionPredictionResult) &&
        Objects.equals(this.inventoryResult, guaranteedInventoryServiceInventory.inventoryResult) &&
        Objects.equals(this.targets, guaranteedInventoryServiceInventory.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lifetimeBudget, reach, vImps, sovRate, slots, campaignGoal, startDate, startTime, endDate, endTime, maxSellableVImps, maxSellableReach, maxReservableVImps, maxReservableSlots, lowerBudgetLimit, upperBudgetLimit, packageId, packageName, packageHistoryId, adCategoryIds, promotionUrl, minimumPurchaseVImps, maximumPurchaseVImps, inventoryUnit, campaignBiddingStrategyType, viewableFrequencyCap, reservationStatus, unreservableReason, adRequirements, inventoryDetailStatus, actionAfterVideoAdTap, priceType, placementMonopolyFlg, predictionResults, requestedConditionPredictionResult, inventoryResult, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceInventory {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    vImps: ").append(toIndentedString(vImps)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    maxSellableVImps: ").append(toIndentedString(maxSellableVImps)).append("\n");
    sb.append("    maxSellableReach: ").append(toIndentedString(maxSellableReach)).append("\n");
    sb.append("    maxReservableVImps: ").append(toIndentedString(maxReservableVImps)).append("\n");
    sb.append("    maxReservableSlots: ").append(toIndentedString(maxReservableSlots)).append("\n");
    sb.append("    lowerBudgetLimit: ").append(toIndentedString(lowerBudgetLimit)).append("\n");
    sb.append("    upperBudgetLimit: ").append(toIndentedString(upperBudgetLimit)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageHistoryId: ").append(toIndentedString(packageHistoryId)).append("\n");
    sb.append("    adCategoryIds: ").append(toIndentedString(adCategoryIds)).append("\n");
    sb.append("    promotionUrl: ").append(toIndentedString(promotionUrl)).append("\n");
    sb.append("    minimumPurchaseVImps: ").append(toIndentedString(minimumPurchaseVImps)).append("\n");
    sb.append("    maximumPurchaseVImps: ").append(toIndentedString(maximumPurchaseVImps)).append("\n");
    sb.append("    inventoryUnit: ").append(toIndentedString(inventoryUnit)).append("\n");
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    reservationStatus: ").append(toIndentedString(reservationStatus)).append("\n");
    sb.append("    unreservableReason: ").append(toIndentedString(unreservableReason)).append("\n");
    sb.append("    adRequirements: ").append(toIndentedString(adRequirements)).append("\n");
    sb.append("    inventoryDetailStatus: ").append(toIndentedString(inventoryDetailStatus)).append("\n");
    sb.append("    actionAfterVideoAdTap: ").append(toIndentedString(actionAfterVideoAdTap)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    placementMonopolyFlg: ").append(toIndentedString(placementMonopolyFlg)).append("\n");
    sb.append("    predictionResults: ").append(toIndentedString(predictionResults)).append("\n");
    sb.append("    requestedConditionPredictionResult: ").append(toIndentedString(requestedConditionPredictionResult)).append("\n");
    sb.append("    inventoryResult: ").append(toIndentedString(inventoryResult)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

