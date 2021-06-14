package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceActionAfterVideoAdTap;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdPlaceType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceAdRequirement;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServicePrediction;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceReservationStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceUnreservableReason;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedSimulationServiceViewableFrequencyCap;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulation object holds information about the delivery simulation of the guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。</div> <div lang=\"en\">GuaranteedSimulation object holds information about the delivery simulation of the guaranteed campaign.</div> ")

public class GuaranteedSimulation   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("guaranteedSimulationId")
  private JsonNullable<Long> guaranteedSimulationId = JsonNullable.undefined();

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

  @JsonProperty("viewableFrequencyCap")
  private JsonNullable<GuaranteedSimulationServiceViewableFrequencyCap> viewableFrequencyCap = JsonNullable.undefined();

  @JsonProperty("maxVImps")
  private JsonNullable<Long> maxVImps = JsonNullable.undefined();

  @JsonProperty("maxReach")
  private JsonNullable<Long> maxReach = JsonNullable.undefined();

  @JsonProperty("lowerBudgetLimit")
  private JsonNullable<Long> lowerBudgetLimit = JsonNullable.undefined();

  @JsonProperty("upperBudgetLimit")
  private JsonNullable<Long> upperBudgetLimit = JsonNullable.undefined();

  @JsonProperty("reservationStatus")
  private JsonNullable<GuaranteedSimulationServiceReservationStatus> reservationStatus = JsonNullable.undefined();

  @JsonProperty("unreservableReason")
  private JsonNullable<GuaranteedSimulationServiceUnreservableReason> unreservableReason = JsonNullable.undefined();

  @JsonProperty("adRequirements")
  @Valid
  private JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> adRequirements = JsonNullable.undefined();

  @JsonProperty("targets")
  @Valid
  private JsonNullable<List<GuaranteedSimulationServiceAdGroupTarget>> targets = JsonNullable.undefined();

  @JsonProperty("adPlaceType")
  private JsonNullable<GuaranteedSimulationServiceAdPlaceType> adPlaceType = JsonNullable.undefined();

  @JsonProperty("prediction")
  private JsonNullable<GuaranteedSimulationServicePrediction> prediction = JsonNullable.undefined();

  @JsonProperty("adCategoryIds")
  @Valid
  private JsonNullable<List<Long>> adCategoryIds = JsonNullable.undefined();

  @JsonProperty("packageId")
  private JsonNullable<Long> packageId = JsonNullable.undefined();

  @JsonProperty("packageHistoryId")
  private JsonNullable<Long> packageHistoryId = JsonNullable.undefined();

  @JsonProperty("actionAfterVideoAdTap")
  private JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> actionAfterVideoAdTap = JsonNullable.undefined();

  public GuaranteedSimulation accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public GuaranteedSimulation guaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = JsonNullable.of(guaranteedSimulationId);
    return this;
  }

  /**
   * <div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Simulation ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return guaranteedSimulationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Simulation ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getGuaranteedSimulationId() {
    return guaranteedSimulationId;
  }

  public void setGuaranteedSimulationId(JsonNullable<Long> guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
  }

  public GuaranteedSimulation lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = JsonNullable.of(lifetimeBudget);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public JsonNullable<Long> getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(JsonNullable<Long> lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedSimulation reach(Long reach) {
    this.reach = JsonNullable.of(reach);
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチ数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of reaches.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of reaches.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public JsonNullable<Long> getReach() {
    return reach;
  }

  public void setReach(JsonNullable<Long> reach) {
    this.reach = reach;
  }

  public GuaranteedSimulation vImps(Long vImps) {
    this.vImps = JsonNullable.of(vImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルインプレッションです。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Viewable impressions.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションです。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Viewable impressions.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public JsonNullable<Long> getvImps() {
    return vImps;
  }

  public void setvImps(JsonNullable<Long> vImps) {
    this.vImps = vImps;
  }

  public GuaranteedSimulation sovRate(Long sovRate) {
    this.sovRate = JsonNullable.of(sovRate);
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<Long> getSovRate() {
    return sovRate;
  }

  public void setSovRate(JsonNullable<Long> sovRate) {
    this.sovRate = sovRate;
  }

  public GuaranteedSimulation slots(Long slots) {
    this.slots = JsonNullable.of(slots);
    return this;
  }

  /**
   * <div lang=\"ja\"> 購入枠数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of buying slots.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return slots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 購入枠数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of buying slots.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public JsonNullable<Long> getSlots() {
    return slots;
  }

  public void setSlots(JsonNullable<Long> slots) {
    this.slots = slots;
  }

  public GuaranteedSimulation campaignGoal(String campaignGoal) {
    this.campaignGoal = JsonNullable.of(campaignGoal);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field will be required.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field will be required.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> ")


  public JsonNullable<String> getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(JsonNullable<String> campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public GuaranteedSimulation startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date.<br> In ADD operation, this field will be required. </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date.<br> In ADD operation, this field will be required. </div> Format: yyyyMMdd ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public GuaranteedSimulation endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date.<br> In ADD operation, this field will be required.<br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date.<br> In ADD operation, this field will be required.<br> </div> Format: yyyyMMdd ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public GuaranteedSimulation viewableFrequencyCap(GuaranteedSimulationServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = JsonNullable.of(viewableFrequencyCap);
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceViewableFrequencyCap> getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(JsonNullable<GuaranteedSimulationServiceViewableFrequencyCap> viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public GuaranteedSimulation maxVImps(Long maxVImps) {
    this.maxVImps = JsonNullable.of(maxVImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxVImps() {
    return maxVImps;
  }

  public void setMaxVImps(JsonNullable<Long> maxVImps) {
    this.maxVImps = maxVImps;
  }

  public GuaranteedSimulation maxReach(Long maxReach) {
    this.maxReach = JsonNullable.of(maxReach);
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getMaxReach() {
    return maxReach;
  }

  public void setMaxReach(JsonNullable<Long> maxReach) {
    this.maxReach = maxReach;
  }

  public GuaranteedSimulation lowerBudgetLimit(Long lowerBudgetLimit) {
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

  public GuaranteedSimulation upperBudgetLimit(Long upperBudgetLimit) {
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

  public GuaranteedSimulation reservationStatus(GuaranteedSimulationServiceReservationStatus reservationStatus) {
    this.reservationStatus = JsonNullable.of(reservationStatus);
    return this;
  }

  /**
   * Get reservationStatus
   * @return reservationStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceReservationStatus> getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(JsonNullable<GuaranteedSimulationServiceReservationStatus> reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public GuaranteedSimulation unreservableReason(GuaranteedSimulationServiceUnreservableReason unreservableReason) {
    this.unreservableReason = JsonNullable.of(unreservableReason);
    return this;
  }

  /**
   * Get unreservableReason
   * @return unreservableReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceUnreservableReason> getUnreservableReason() {
    return unreservableReason;
  }

  public void setUnreservableReason(JsonNullable<GuaranteedSimulationServiceUnreservableReason> unreservableReason) {
    this.unreservableReason = unreservableReason;
  }

  public GuaranteedSimulation adRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = JsonNullable.of(adRequirements);
    return this;
  }

  public GuaranteedSimulation addAdRequirementsItem(GuaranteedSimulationServiceAdRequirement adRequirementsItem) {
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

  public JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(JsonNullable<List<GuaranteedSimulationServiceAdRequirement>> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedSimulation targets(List<GuaranteedSimulationServiceAdGroupTarget> targets) {
    this.targets = JsonNullable.of(targets);
    return this;
  }

  public GuaranteedSimulation addTargetsItem(GuaranteedSimulationServiceAdGroupTarget targetsItem) {
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

  public JsonNullable<List<GuaranteedSimulationServiceAdGroupTarget>> getTargets() {
    return targets;
  }

  public void setTargets(JsonNullable<List<GuaranteedSimulationServiceAdGroupTarget>> targets) {
    this.targets = targets;
  }

  public GuaranteedSimulation adPlaceType(GuaranteedSimulationServiceAdPlaceType adPlaceType) {
    this.adPlaceType = JsonNullable.of(adPlaceType);
    return this;
  }

  /**
   * Get adPlaceType
   * @return adPlaceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceAdPlaceType> getAdPlaceType() {
    return adPlaceType;
  }

  public void setAdPlaceType(JsonNullable<GuaranteedSimulationServiceAdPlaceType> adPlaceType) {
    this.adPlaceType = adPlaceType;
  }

  public GuaranteedSimulation prediction(GuaranteedSimulationServicePrediction prediction) {
    this.prediction = JsonNullable.of(prediction);
    return this;
  }

  /**
   * Get prediction
   * @return prediction
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServicePrediction> getPrediction() {
    return prediction;
  }

  public void setPrediction(JsonNullable<GuaranteedSimulationServicePrediction> prediction) {
    this.prediction = prediction;
  }

  public GuaranteedSimulation adCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = JsonNullable.of(adCategoryIds);
    return this;
  }

  public GuaranteedSimulation addAdCategoryIdsItem(Long adCategoryIdsItem) {
    if (this.adCategoryIds == null || !this.adCategoryIds.isPresent()) {
      this.adCategoryIds = JsonNullable.of(new ArrayList<>());
    }
    this.adCategoryIds.get().add(adCategoryIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ※指定した広告カテゴリーと広告タイプの組み合わせによっては、予約のキャンセルが必要な場合があります。その場合はキャンセル料が発生します。<br> 指定可能な値は、GuaranteedSimulationService/getAdCategoryで取得されるGuaranteedSimulationServiceAdCategoryオブジェクトのadCategoryIdフィールドをご参照ください。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> You may need to cancel your ad depending on the combination of content and ad type you specified. Pay a cancellation fee in that case.<br> Available values can be referred to adCategoryId field of GuaranteedSimulationServiceAdCategory object obtained by getAdCategory operation of GuaranteedSimulationService.<br> This field is optional in ADD operation. </div> 
   * @return adCategoryIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ※指定した広告カテゴリーと広告タイプの組み合わせによっては、予約のキャンセルが必要な場合があります。その場合はキャンセル料が発生します。<br> 指定可能な値は、GuaranteedSimulationService/getAdCategoryで取得されるGuaranteedSimulationServiceAdCategoryオブジェクトのadCategoryIdフィールドをご参照ください。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> You may need to cancel your ad depending on the combination of content and ad type you specified. Pay a cancellation fee in that case.<br> Available values can be referred to adCategoryId field of GuaranteedSimulationServiceAdCategory object obtained by getAdCategory operation of GuaranteedSimulationService.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<List<Long>> getAdCategoryIds() {
    return adCategoryIds;
  }

  public void setAdCategoryIds(JsonNullable<List<Long>> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
  }

  public GuaranteedSimulation packageId(Long packageId) {
    this.packageId = JsonNullable.of(packageId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package ID.<br> This field is optional in ADD operation. </div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package ID.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<Long> getPackageId() {
    return packageId;
  }

  public void setPackageId(JsonNullable<Long> packageId) {
    this.packageId = packageId;
  }

  public GuaranteedSimulation packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = JsonNullable.of(packageHistoryId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package history ID.<br> This field is optional in ADD operation. </div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package history ID.<br> This field is optional in ADD operation. </div> ")


  public JsonNullable<Long> getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(JsonNullable<Long> packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedSimulation actionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = JsonNullable.of(actionAfterVideoAdTap);
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(JsonNullable<GuaranteedSimulationServiceActionAfterVideoAdTap> actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulation guaranteedSimulation = (GuaranteedSimulation) o;
    return Objects.equals(this.accountId, guaranteedSimulation.accountId) &&
        Objects.equals(this.guaranteedSimulationId, guaranteedSimulation.guaranteedSimulationId) &&
        Objects.equals(this.lifetimeBudget, guaranteedSimulation.lifetimeBudget) &&
        Objects.equals(this.reach, guaranteedSimulation.reach) &&
        Objects.equals(this.vImps, guaranteedSimulation.vImps) &&
        Objects.equals(this.sovRate, guaranteedSimulation.sovRate) &&
        Objects.equals(this.slots, guaranteedSimulation.slots) &&
        Objects.equals(this.campaignGoal, guaranteedSimulation.campaignGoal) &&
        Objects.equals(this.startDate, guaranteedSimulation.startDate) &&
        Objects.equals(this.endDate, guaranteedSimulation.endDate) &&
        Objects.equals(this.viewableFrequencyCap, guaranteedSimulation.viewableFrequencyCap) &&
        Objects.equals(this.maxVImps, guaranteedSimulation.maxVImps) &&
        Objects.equals(this.maxReach, guaranteedSimulation.maxReach) &&
        Objects.equals(this.lowerBudgetLimit, guaranteedSimulation.lowerBudgetLimit) &&
        Objects.equals(this.upperBudgetLimit, guaranteedSimulation.upperBudgetLimit) &&
        Objects.equals(this.reservationStatus, guaranteedSimulation.reservationStatus) &&
        Objects.equals(this.unreservableReason, guaranteedSimulation.unreservableReason) &&
        Objects.equals(this.adRequirements, guaranteedSimulation.adRequirements) &&
        Objects.equals(this.targets, guaranteedSimulation.targets) &&
        Objects.equals(this.adPlaceType, guaranteedSimulation.adPlaceType) &&
        Objects.equals(this.prediction, guaranteedSimulation.prediction) &&
        Objects.equals(this.adCategoryIds, guaranteedSimulation.adCategoryIds) &&
        Objects.equals(this.packageId, guaranteedSimulation.packageId) &&
        Objects.equals(this.packageHistoryId, guaranteedSimulation.packageHistoryId) &&
        Objects.equals(this.actionAfterVideoAdTap, guaranteedSimulation.actionAfterVideoAdTap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, guaranteedSimulationId, lifetimeBudget, reach, vImps, sovRate, slots, campaignGoal, startDate, endDate, viewableFrequencyCap, maxVImps, maxReach, lowerBudgetLimit, upperBudgetLimit, reservationStatus, unreservableReason, adRequirements, targets, adPlaceType, prediction, adCategoryIds, packageId, packageHistoryId, actionAfterVideoAdTap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    guaranteedSimulationId: ").append(toIndentedString(guaranteedSimulationId)).append("\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    vImps: ").append(toIndentedString(vImps)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    maxVImps: ").append(toIndentedString(maxVImps)).append("\n");
    sb.append("    maxReach: ").append(toIndentedString(maxReach)).append("\n");
    sb.append("    lowerBudgetLimit: ").append(toIndentedString(lowerBudgetLimit)).append("\n");
    sb.append("    upperBudgetLimit: ").append(toIndentedString(upperBudgetLimit)).append("\n");
    sb.append("    reservationStatus: ").append(toIndentedString(reservationStatus)).append("\n");
    sb.append("    unreservableReason: ").append(toIndentedString(unreservableReason)).append("\n");
    sb.append("    adRequirements: ").append(toIndentedString(adRequirements)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    adPlaceType: ").append(toIndentedString(adPlaceType)).append("\n");
    sb.append("    prediction: ").append(toIndentedString(prediction)).append("\n");
    sb.append("    adCategoryIds: ").append(toIndentedString(adCategoryIds)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageHistoryId: ").append(toIndentedString(packageHistoryId)).append("\n");
    sb.append("    actionAfterVideoAdTap: ").append(toIndentedString(actionAfterVideoAdTap)).append("\n");
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

