package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceActionAfterVideoAdTap;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceAdRequirement;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceCampaignBiddingStrategyType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceInventoryDetailStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceInventoryResult;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceInventoryUnit;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePlacementMonopolyFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePredictionResult;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServicePriceType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceReservationStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceUnreservableReason;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceViewableFrequencyCap;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventory object holds information about the delivery simulation of the guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。</div> <div lang=\"en\">GuaranteedInventory object holds information about the delivery simulation of the guaranteed campaign.</div> ")

public class GuaranteedInventoryServiceInventory   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("lifetimeBudget")
  private JsonNullable<Long> lifetimeBudget = JsonNullable.undefined();

  @JsonProperty("reach")
  private JsonNullable<Long> reach = JsonNullable.undefined();

  @JsonProperty("vImps")
  private JsonNullable<Long> vImps = JsonNullable.undefined();

  @JsonProperty("sovRate")
  private JsonNullable<Long> sovRate = JsonNullable.undefined();

  @JsonProperty("slots")
  private JsonNullable<Long> slots = JsonNullable.undefined();

  @JsonProperty("campaignGoal")
  private JsonNullable<String> campaignGoal = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("maxSellableVImps")
  private JsonNullable<Long> maxSellableVImps = JsonNullable.undefined();

  @JsonProperty("maxSellableReach")
  private JsonNullable<Long> maxSellableReach = JsonNullable.undefined();

  @JsonProperty("maxReservableVImps")
  private JsonNullable<Long> maxReservableVImps = JsonNullable.undefined();

  @JsonProperty("maxReservableSlots")
  private JsonNullable<Long> maxReservableSlots = JsonNullable.undefined();

  @JsonProperty("lowerBudgetLimit")
  private JsonNullable<Long> lowerBudgetLimit = JsonNullable.undefined();

  @JsonProperty("upperBudgetLimit")
  private JsonNullable<Long> upperBudgetLimit = JsonNullable.undefined();

  @JsonProperty("packageId")
  private JsonNullable<Long> packageId = JsonNullable.undefined();

  @JsonProperty("packageName")
  private JsonNullable<String> packageName = JsonNullable.undefined();

  @JsonProperty("packageHistoryId")
  private JsonNullable<Long> packageHistoryId = JsonNullable.undefined();

  @JsonProperty("adCategoryIds")
  @Valid
  private JsonNullable<List<Long>> adCategoryIds = JsonNullable.undefined();

  @JsonProperty("promotionUrl")
  private JsonNullable<String> promotionUrl = JsonNullable.undefined();

  @JsonProperty("minimumPurchaseVImps")
  private JsonNullable<Long> minimumPurchaseVImps = JsonNullable.undefined();

  @JsonProperty("maximumPurchaseVImps")
  private JsonNullable<Long> maximumPurchaseVImps = JsonNullable.undefined();

  @JsonProperty("inventoryUnit")
  private JsonNullable<GuaranteedInventoryServiceInventoryUnit> inventoryUnit = JsonNullable.undefined();

  @JsonProperty("campaignBiddingStrategyType")
  private JsonNullable<GuaranteedInventoryServiceCampaignBiddingStrategyType> campaignBiddingStrategyType = JsonNullable.undefined();

  @JsonProperty("viewableFrequencyCap")
  private JsonNullable<GuaranteedInventoryServiceViewableFrequencyCap> viewableFrequencyCap = JsonNullable.undefined();

  @JsonProperty("reservationStatus")
  private JsonNullable<GuaranteedInventoryServiceReservationStatus> reservationStatus = JsonNullable.undefined();

  @JsonProperty("unreservableReason")
  private JsonNullable<GuaranteedInventoryServiceUnreservableReason> unreservableReason = JsonNullable.undefined();

  @JsonProperty("adRequirements")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServiceAdRequirement>> adRequirements = JsonNullable.undefined();

  @JsonProperty("inventoryDetailStatus")
  private JsonNullable<GuaranteedInventoryServiceInventoryDetailStatus> inventoryDetailStatus = JsonNullable.undefined();

  @JsonProperty("actionAfterVideoAdTap")
  private JsonNullable<GuaranteedInventoryServiceActionAfterVideoAdTap> actionAfterVideoAdTap = JsonNullable.undefined();

  @JsonProperty("priceType")
  private JsonNullable<GuaranteedInventoryServicePriceType> priceType = JsonNullable.undefined();

  @JsonProperty("placementMonopolyFlg")
  private JsonNullable<GuaranteedInventoryServicePlacementMonopolyFlg> placementMonopolyFlg = JsonNullable.undefined();

  @JsonProperty("predictionResults")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServicePredictionResult>> predictionResults = JsonNullable.undefined();

  @JsonProperty("requestedConditionPredictionResult")
  private JsonNullable<GuaranteedInventoryServicePredictionResult> requestedConditionPredictionResult = JsonNullable.undefined();

  @JsonProperty("inventoryResult")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServiceInventoryResult>> inventoryResult = JsonNullable.undefined();

  @JsonProperty("targets")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServiceAdGroupTarget>> targets = JsonNullable.undefined();

  public GuaranteedInventoryServiceInventory accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account ID.<br> This field is optional in ADD operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account ID.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public GuaranteedInventoryServiceInventory lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = JsonNullable.of(lifetimeBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(JsonNullable<Long> lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedInventoryServiceInventory reach(Long reach) {
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

  public GuaranteedInventoryServiceInventory vImps(Long vImps) {
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

  public GuaranteedInventoryServiceInventory sovRate(Long sovRate) {
    this.sovRate = JsonNullable.of(sovRate);
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（1%〜100%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（1%〜100%）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getSovRate() {
    return sovRate;
  }

  public void setSovRate(JsonNullable<Long> sovRate) {
    this.sovRate = sovRate;
  }

  public GuaranteedInventoryServiceInventory slots(Long slots) {
    this.slots = JsonNullable.of(slots);
    return this;
  }

  /**
   * <div lang=\"ja\"> 購入枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of buying slots.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return slots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 購入枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of buying slots.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getSlots() {
    return slots;
  }

  public void setSlots(JsonNullable<Long> slots) {
    this.slots = slots;
  }

  public GuaranteedInventoryServiceInventory campaignGoal(String campaignGoal) {
    this.campaignGoal = JsonNullable.of(campaignGoal);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign goal.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign goal.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(JsonNullable<String> campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public GuaranteedInventoryServiceInventory startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date of campaign. <br> This field is required in ADD operation. </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date of campaign. <br> This field is required in ADD operation. </div> Format: yyyyMMdd ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public GuaranteedInventoryServiceInventory endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date of campaign. <br> This field is required in ADD operation.<br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date of campaign. <br> This field is required in ADD operation.<br> </div> Format: yyyyMMdd ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public GuaranteedInventoryServiceInventory maxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = JsonNullable.of(maxSellableVImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> 販売可能な最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of viewable impression available for sale. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxSellableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 販売可能な最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of viewable impression available for sale. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxSellableVImps() {
    return maxSellableVImps;
  }

  public void setMaxSellableVImps(JsonNullable<Long> maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
  }

  public GuaranteedInventoryServiceInventory maxSellableReach(Long maxSellableReach) {
    this.maxSellableReach = JsonNullable.of(maxSellableReach);
    return this;
  }

  /**
   * <div lang=\"ja\"> 販売可能な最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reach available for sale.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxSellableReach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 販売可能な最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reach available for sale.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxSellableReach() {
    return maxSellableReach;
  }

  public void setMaxSellableReach(JsonNullable<Long> maxSellableReach) {
    this.maxSellableReach = maxSellableReach;
  }

  public GuaranteedInventoryServiceInventory maxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = JsonNullable.of(maxReservableVImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定された条件で予約可能な最大配信量です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum ad delivery amount that can be reserved under the specified conditions. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReservableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定された条件で予約可能な最大配信量です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum ad delivery amount that can be reserved under the specified conditions. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxReservableVImps() {
    return maxReservableVImps;
  }

  public void setMaxReservableVImps(JsonNullable<Long> maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
  }

  public GuaranteedInventoryServiceInventory maxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = JsonNullable.of(maxReservableSlots);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大予約可能枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reservable slots. <br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReservableSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大予約可能枠数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reservable slots. <br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxReservableSlots() {
    return maxReservableSlots;
  }

  public void setMaxReservableSlots(JsonNullable<Long> maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
  }

  public GuaranteedInventoryServiceInventory lowerBudgetLimit(Long lowerBudgetLimit) {
    this.lowerBudgetLimit = JsonNullable.of(lowerBudgetLimit);
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約可能な下限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Minimum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return lowerBudgetLimit
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約可能な下限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Minimum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getLowerBudgetLimit() {
    return lowerBudgetLimit;
  }

  public void setLowerBudgetLimit(JsonNullable<Long> lowerBudgetLimit) {
    this.lowerBudgetLimit = lowerBudgetLimit;
  }

  public GuaranteedInventoryServiceInventory upperBudgetLimit(Long upperBudgetLimit) {
    this.upperBudgetLimit = JsonNullable.of(upperBudgetLimit);
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約可能な上限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return upperBudgetLimit
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約可能な上限通期予算です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum reservable lifetime budget.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getUpperBudgetLimit() {
    return upperBudgetLimit;
  }

  public void setUpperBudgetLimit(JsonNullable<Long> upperBudgetLimit) {
    this.upperBudgetLimit = upperBudgetLimit;
  }

  public GuaranteedInventoryServiceInventory packageId(Long packageId) {
    this.packageId = JsonNullable.of(packageId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package ID.<br> In ADD operation, this field will be required. </div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package ID.<br> In ADD operation, this field will be required. </div> ")


  public JsonNullable<Long> getPackageId() {
    return packageId;
  }

  public void setPackageId(JsonNullable<Long> packageId) {
    this.packageId = packageId;
  }

  public GuaranteedInventoryServiceInventory packageName(String packageName) {
    this.packageName = JsonNullable.of(packageName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return packageName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Package name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getPackageName() {
    return packageName;
  }

  public void setPackageName(JsonNullable<String> packageName) {
    this.packageName = packageName;
  }

  public GuaranteedInventoryServiceInventory packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = JsonNullable.of(packageHistoryId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package history ID.<br> In ADD operation, this field will be required. </div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Package history ID.<br> In ADD operation, this field will be required. </div> ")


  public JsonNullable<Long> getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(JsonNullable<Long> packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedInventoryServiceInventory adCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = JsonNullable.of(adCategoryIds);
    return this;
  }

  public GuaranteedInventoryServiceInventory addAdCategoryIdsItem(Long adCategoryIdsItem) {
    if (this.adCategoryIds == null || !this.adCategoryIds.isPresent()) {
      this.adCategoryIds = JsonNullable.of(new ArrayList<>());
    }
    this.adCategoryIds.get().add(adCategoryIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> This field is optional in ADD operation. </div> 
   * @return adCategoryIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<List<Long>> getAdCategoryIds() {
    return adCategoryIds;
  }

  public void setAdCategoryIds(JsonNullable<List<Long>> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
  }

  public GuaranteedInventoryServiceInventory promotionUrl(String promotionUrl) {
    this.promotionUrl = JsonNullable.of(promotionUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">表示URLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Promotion url.<br> This field is optional in ADD operation.</div> 
   * @return promotionUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">表示URLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Promotion url.<br> This field is optional in ADD operation.</div> ")


  public JsonNullable<String> getPromotionUrl() {
    return promotionUrl;
  }

  public void setPromotionUrl(JsonNullable<String> promotionUrl) {
    this.promotionUrl = promotionUrl;
  }

  public GuaranteedInventoryServiceInventory minimumPurchaseVImps(Long minimumPurchaseVImps) {
    this.minimumPurchaseVImps = JsonNullable.of(minimumPurchaseVImps);
    return this;
  }

  /**
   * <div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> 
   * @return minimumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最低購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Minimum purchase viewable impression.</div> ")


  public JsonNullable<Long> getMinimumPurchaseVImps() {
    return minimumPurchaseVImps;
  }

  public void setMinimumPurchaseVImps(JsonNullable<Long> minimumPurchaseVImps) {
    this.minimumPurchaseVImps = minimumPurchaseVImps;
  }

  public GuaranteedInventoryServiceInventory maximumPurchaseVImps(Long maximumPurchaseVImps) {
    this.maximumPurchaseVImps = JsonNullable.of(maximumPurchaseVImps);
    return this;
  }

  /**
   * <div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> 
   * @return maximumPurchaseVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大購入ビューアブルインプレッション数を表します。</div> <div lang=\"en\">Maximum purchase viewable impression.</div> ")


  public JsonNullable<Long> getMaximumPurchaseVImps() {
    return maximumPurchaseVImps;
  }

  public void setMaximumPurchaseVImps(JsonNullable<Long> maximumPurchaseVImps) {
    this.maximumPurchaseVImps = maximumPurchaseVImps;
  }

  public GuaranteedInventoryServiceInventory inventoryUnit(GuaranteedInventoryServiceInventoryUnit inventoryUnit) {
    this.inventoryUnit = JsonNullable.of(inventoryUnit);
    return this;
  }

  /**
   * Get inventoryUnit
   * @return inventoryUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceInventoryUnit> getInventoryUnit() {
    return inventoryUnit;
  }

  public void setInventoryUnit(JsonNullable<GuaranteedInventoryServiceInventoryUnit> inventoryUnit) {
    this.inventoryUnit = inventoryUnit;
  }

  public GuaranteedInventoryServiceInventory campaignBiddingStrategyType(GuaranteedInventoryServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = JsonNullable.of(campaignBiddingStrategyType);
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceCampaignBiddingStrategyType> getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(JsonNullable<GuaranteedInventoryServiceCampaignBiddingStrategyType> campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public GuaranteedInventoryServiceInventory viewableFrequencyCap(GuaranteedInventoryServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = JsonNullable.of(viewableFrequencyCap);
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceViewableFrequencyCap> getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(JsonNullable<GuaranteedInventoryServiceViewableFrequencyCap> viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public GuaranteedInventoryServiceInventory reservationStatus(GuaranteedInventoryServiceReservationStatus reservationStatus) {
    this.reservationStatus = JsonNullable.of(reservationStatus);
    return this;
  }

  /**
   * Get reservationStatus
   * @return reservationStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceReservationStatus> getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(JsonNullable<GuaranteedInventoryServiceReservationStatus> reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public GuaranteedInventoryServiceInventory unreservableReason(GuaranteedInventoryServiceUnreservableReason unreservableReason) {
    this.unreservableReason = JsonNullable.of(unreservableReason);
    return this;
  }

  /**
   * Get unreservableReason
   * @return unreservableReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceUnreservableReason> getUnreservableReason() {
    return unreservableReason;
  }

  public void setUnreservableReason(JsonNullable<GuaranteedInventoryServiceUnreservableReason> unreservableReason) {
    this.unreservableReason = unreservableReason;
  }

  public GuaranteedInventoryServiceInventory adRequirements(List<GuaranteedInventoryServiceAdRequirement> adRequirements) {
    this.adRequirements = JsonNullable.of(adRequirements);
    return this;
  }

  public GuaranteedInventoryServiceInventory addAdRequirementsItem(GuaranteedInventoryServiceAdRequirement adRequirementsItem) {
    if (this.adRequirements == null || !this.adRequirements.isPresent()) {
      this.adRequirements = JsonNullable.of(new ArrayList<>());
    }
    this.adRequirements.get().add(adRequirementsItem);
    return this;
  }

  /**
   * Get adRequirements
   * @return adRequirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedInventoryServiceAdRequirement>> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(JsonNullable<List<GuaranteedInventoryServiceAdRequirement>> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedInventoryServiceInventory inventoryDetailStatus(GuaranteedInventoryServiceInventoryDetailStatus inventoryDetailStatus) {
    this.inventoryDetailStatus = JsonNullable.of(inventoryDetailStatus);
    return this;
  }

  /**
   * Get inventoryDetailStatus
   * @return inventoryDetailStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceInventoryDetailStatus> getInventoryDetailStatus() {
    return inventoryDetailStatus;
  }

  public void setInventoryDetailStatus(JsonNullable<GuaranteedInventoryServiceInventoryDetailStatus> inventoryDetailStatus) {
    this.inventoryDetailStatus = inventoryDetailStatus;
  }

  public GuaranteedInventoryServiceInventory actionAfterVideoAdTap(GuaranteedInventoryServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = JsonNullable.of(actionAfterVideoAdTap);
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServiceActionAfterVideoAdTap> getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(JsonNullable<GuaranteedInventoryServiceActionAfterVideoAdTap> actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }

  public GuaranteedInventoryServiceInventory priceType(GuaranteedInventoryServicePriceType priceType) {
    this.priceType = JsonNullable.of(priceType);
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePriceType> getPriceType() {
    return priceType;
  }

  public void setPriceType(JsonNullable<GuaranteedInventoryServicePriceType> priceType) {
    this.priceType = priceType;
  }

  public GuaranteedInventoryServiceInventory placementMonopolyFlg(GuaranteedInventoryServicePlacementMonopolyFlg placementMonopolyFlg) {
    this.placementMonopolyFlg = JsonNullable.of(placementMonopolyFlg);
    return this;
  }

  /**
   * Get placementMonopolyFlg
   * @return placementMonopolyFlg
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePlacementMonopolyFlg> getPlacementMonopolyFlg() {
    return placementMonopolyFlg;
  }

  public void setPlacementMonopolyFlg(JsonNullable<GuaranteedInventoryServicePlacementMonopolyFlg> placementMonopolyFlg) {
    this.placementMonopolyFlg = placementMonopolyFlg;
  }

  public GuaranteedInventoryServiceInventory predictionResults(List<GuaranteedInventoryServicePredictionResult> predictionResults) {
    this.predictionResults = JsonNullable.of(predictionResults);
    return this;
  }

  public GuaranteedInventoryServiceInventory addPredictionResultsItem(GuaranteedInventoryServicePredictionResult predictionResultsItem) {
    if (this.predictionResults == null || !this.predictionResults.isPresent()) {
      this.predictionResults = JsonNullable.of(new ArrayList<>());
    }
    this.predictionResults.get().add(predictionResultsItem);
    return this;
  }

  /**
   * Get predictionResults
   * @return predictionResults
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedInventoryServicePredictionResult>> getPredictionResults() {
    return predictionResults;
  }

  public void setPredictionResults(JsonNullable<List<GuaranteedInventoryServicePredictionResult>> predictionResults) {
    this.predictionResults = predictionResults;
  }

  public GuaranteedInventoryServiceInventory requestedConditionPredictionResult(GuaranteedInventoryServicePredictionResult requestedConditionPredictionResult) {
    this.requestedConditionPredictionResult = JsonNullable.of(requestedConditionPredictionResult);
    return this;
  }

  /**
   * Get requestedConditionPredictionResult
   * @return requestedConditionPredictionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedInventoryServicePredictionResult> getRequestedConditionPredictionResult() {
    return requestedConditionPredictionResult;
  }

  public void setRequestedConditionPredictionResult(JsonNullable<GuaranteedInventoryServicePredictionResult> requestedConditionPredictionResult) {
    this.requestedConditionPredictionResult = requestedConditionPredictionResult;
  }

  public GuaranteedInventoryServiceInventory inventoryResult(List<GuaranteedInventoryServiceInventoryResult> inventoryResult) {
    this.inventoryResult = JsonNullable.of(inventoryResult);
    return this;
  }

  public GuaranteedInventoryServiceInventory addInventoryResultItem(GuaranteedInventoryServiceInventoryResult inventoryResultItem) {
    if (this.inventoryResult == null || !this.inventoryResult.isPresent()) {
      this.inventoryResult = JsonNullable.of(new ArrayList<>());
    }
    this.inventoryResult.get().add(inventoryResultItem);
    return this;
  }

  /**
   * Get inventoryResult
   * @return inventoryResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedInventoryServiceInventoryResult>> getInventoryResult() {
    return inventoryResult;
  }

  public void setInventoryResult(JsonNullable<List<GuaranteedInventoryServiceInventoryResult>> inventoryResult) {
    this.inventoryResult = inventoryResult;
  }

  public GuaranteedInventoryServiceInventory targets(List<GuaranteedInventoryServiceAdGroupTarget> targets) {
    this.targets = JsonNullable.of(targets);
    return this;
  }

  public GuaranteedInventoryServiceInventory addTargetsItem(GuaranteedInventoryServiceAdGroupTarget targetsItem) {
    if (this.targets == null || !this.targets.isPresent()) {
      this.targets = JsonNullable.of(new ArrayList<>());
    }
    this.targets.get().add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedInventoryServiceAdGroupTarget>> getTargets() {
    return targets;
  }

  public void setTargets(JsonNullable<List<GuaranteedInventoryServiceAdGroupTarget>> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.endDate, guaranteedInventoryServiceInventory.endDate) &&
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
    return Objects.hash(accountId, lifetimeBudget, reach, vImps, sovRate, slots, campaignGoal, startDate, endDate, maxSellableVImps, maxSellableReach, maxReservableVImps, maxReservableSlots, lowerBudgetLimit, upperBudgetLimit, packageId, packageName, packageHistoryId, adCategoryIds, promotionUrl, minimumPurchaseVImps, maximumPurchaseVImps, inventoryUnit, campaignBiddingStrategyType, viewableFrequencyCap, reservationStatus, unreservableReason, adRequirements, inventoryDetailStatus, actionAfterVideoAdTap, priceType, placementMonopolyFlg, predictionResults, requestedConditionPredictionResult, inventoryResult, targets);
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
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

