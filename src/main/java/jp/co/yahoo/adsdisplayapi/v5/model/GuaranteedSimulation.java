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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulation object holds information about the delivery simulation of the guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationオブジェクトは、予約型キャンペーンの配信シミュレーション情報を保持します。</div> <div lang=\"en\">GuaranteedSimulation object holds information about the delivery simulation of the guaranteed campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulation   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("guaranteedSimulationId")
  private Long guaranteedSimulationId = null;

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

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("viewableFrequencyCap")
  private GuaranteedSimulationServiceViewableFrequencyCap viewableFrequencyCap = null;

  @JsonProperty("maxVImps")
  private Long maxVImps = null;

  @JsonProperty("maxReach")
  private Long maxReach = null;

  @JsonProperty("lowerBudgetLimit")
  private Long lowerBudgetLimit = null;

  @JsonProperty("upperBudgetLimit")
  private Long upperBudgetLimit = null;

  @JsonProperty("reservationStatus")
  private GuaranteedSimulationServiceReservationStatus reservationStatus = null;

  @JsonProperty("unreservableReason")
  private GuaranteedSimulationServiceUnreservableReason unreservableReason = null;

  @JsonProperty("adRequirements")
  @Valid
  private List<GuaranteedSimulationServiceAdRequirement> adRequirements = null;

  @JsonProperty("targets")
  @Valid
  private List<GuaranteedSimulationServiceAdGroupTarget> targets = null;

  @JsonProperty("adPlaceType")
  private GuaranteedSimulationServiceAdPlaceType adPlaceType = null;

  @JsonProperty("prediction")
  private GuaranteedSimulationServicePrediction prediction = null;

  @JsonProperty("adCategoryIds")
  @Valid
  private List<Long> adCategoryIds = null;

  @JsonProperty("packageId")
  private Long packageId = null;

  @JsonProperty("packageHistoryId")
  private Long packageHistoryId = null;

  @JsonProperty("actionAfterVideoAdTap")
  private GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap = null;

  public GuaranteedSimulation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedSimulation guaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
    return this;
  }

  /**
   * <div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Simulation ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return guaranteedSimulationId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> シミュレーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Simulation ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getGuaranteedSimulationId() {
    return guaranteedSimulationId;
  }

  public void setGuaranteedSimulationId(Long guaranteedSimulationId) {
    this.guaranteedSimulationId = guaranteedSimulationId;
  }

  public GuaranteedSimulation lifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの通期予算額です。<br> ※この「通期予算」は、キャンペーンの全期間を通じて消費される予算を意味します。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> An amount of campaign's lifetime budget.<br> * \"lifetime budget\" means the total budget that is spent throughout the entire duration of the campaign.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public Long getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(Long lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedSimulation reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\"> リーチ数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of reaches.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リーチ数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of reaches.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public GuaranteedSimulation vImps(Long vImps) {
    this.vImps = vImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルインプレッションです。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Viewable impressions.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return vImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションです。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Viewable impressions.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public Long getvImps() {
    return vImps;
  }

  public void setvImps(Long vImps) {
    this.vImps = vImps;
  }

  public GuaranteedSimulation sovRate(Long sovRate) {
    this.sovRate = sovRate;
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV（1%〜100%）です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> SOV (1% to 100%).<br> This field is optional in ADD operation. </div> ")


  public Long getSovRate() {
    return sovRate;
  }

  public void setSovRate(Long sovRate) {
    this.sovRate = sovRate;
  }

  public GuaranteedSimulation slots(Long slots) {
    this.slots = slots;
    return this;
  }

  /**
   * <div lang=\"ja\"> 購入枠数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of buying slots.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> 
   * @return slots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 購入枠数です。<br> ADD時、このフィールドは省略可能となります。<br> ※lifetimeBudget, reach, vImps, slotsは同時に設定することができません。 </div> <div lang=\"en\"> Number of buying slots.<br> This field is optional in ADD operation.<br> *lifetimeBudget, reach, vImps and slots cannot be set at the same time. </div> ")


  public Long getSlots() {
    return slots;
  }

  public void setSlots(Long slots) {
    this.slots = slots;
  }

  public GuaranteedSimulation campaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field will be required.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field will be required.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> ")


  public String getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public GuaranteedSimulation startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date.<br> In ADD operation, this field will be required. </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\"> Start date.<br> In ADD operation, this field will be required. </div> Format: yyyyMMdd ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public GuaranteedSimulation endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date.<br> In ADD operation, this field will be required.<br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> ADD時、このフィールドは必須となります。<br> </div> <div lang=\"en\"> End date.<br> In ADD operation, this field will be required.<br> </div> Format: yyyyMMdd ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public GuaranteedSimulation viewableFrequencyCap(GuaranteedSimulationServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceViewableFrequencyCap getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(GuaranteedSimulationServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public GuaranteedSimulation maxVImps(Long maxVImps) {
    this.maxVImps = maxVImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大ビューアブルインプレッション数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of ad viewable impressions to same user.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxVImps() {
    return maxVImps;
  }

  public void setMaxVImps(Long maxVImps) {
    this.maxVImps = maxVImps;
  }

  public GuaranteedSimulation maxReach(Long maxReach) {
    this.maxReach = maxReach;
    return this;
  }

  /**
   * <div lang=\"ja\"> 最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxReach
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 最大リーチ数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Maximum number of reaches.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxReach() {
    return maxReach;
  }

  public void setMaxReach(Long maxReach) {
    this.maxReach = maxReach;
  }

  public GuaranteedSimulation lowerBudgetLimit(Long lowerBudgetLimit) {
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

  public GuaranteedSimulation upperBudgetLimit(Long upperBudgetLimit) {
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

  public GuaranteedSimulation reservationStatus(GuaranteedSimulationServiceReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
    return this;
  }

  /**
   * Get reservationStatus
   * @return reservationStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(GuaranteedSimulationServiceReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public GuaranteedSimulation unreservableReason(GuaranteedSimulationServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
    return this;
  }

  /**
   * Get unreservableReason
   * @return unreservableReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceUnreservableReason getUnreservableReason() {
    return unreservableReason;
  }

  public void setUnreservableReason(GuaranteedSimulationServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
  }

  public GuaranteedSimulation adRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
    return this;
  }

  public GuaranteedSimulation addAdRequirementsItem(GuaranteedSimulationServiceAdRequirement adRequirementsItem) {
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

  public List<GuaranteedSimulationServiceAdRequirement> getAdRequirements() {
    return adRequirements;
  }

  public void setAdRequirements(List<GuaranteedSimulationServiceAdRequirement> adRequirements) {
    this.adRequirements = adRequirements;
  }

  public GuaranteedSimulation targets(List<GuaranteedSimulationServiceAdGroupTarget> targets) {
    this.targets = targets;
    return this;
  }

  public GuaranteedSimulation addTargetsItem(GuaranteedSimulationServiceAdGroupTarget targetsItem) {
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

  public List<GuaranteedSimulationServiceAdGroupTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<GuaranteedSimulationServiceAdGroupTarget> targets) {
    this.targets = targets;
  }

  public GuaranteedSimulation adPlaceType(GuaranteedSimulationServiceAdPlaceType adPlaceType) {
    this.adPlaceType = adPlaceType;
    return this;
  }

  /**
   * Get adPlaceType
   * @return adPlaceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceAdPlaceType getAdPlaceType() {
    return adPlaceType;
  }

  public void setAdPlaceType(GuaranteedSimulationServiceAdPlaceType adPlaceType) {
    this.adPlaceType = adPlaceType;
  }

  public GuaranteedSimulation prediction(GuaranteedSimulationServicePrediction prediction) {
    this.prediction = prediction;
    return this;
  }

  /**
   * Get prediction
   * @return prediction
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServicePrediction getPrediction() {
    return prediction;
  }

  public void setPrediction(GuaranteedSimulationServicePrediction prediction) {
    this.prediction = prediction;
  }

  public GuaranteedSimulation adCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
    return this;
  }

  public GuaranteedSimulation addAdCategoryIdsItem(Long adCategoryIdsItem) {
    if (this.adCategoryIds == null) {
      this.adCategoryIds = new ArrayList<>();
    }
    this.adCategoryIds.add(adCategoryIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ※指定した広告カテゴリーと広告タイプの組み合わせによっては、予約のキャンセルが必要な場合があります。その場合はキャンセル料が発生します。<br> 指定可能な値は、GuaranteedSimulationService/getAdCategoryで取得されるGuaranteedSimulationServiceAdCategoryオブジェクトのadCategoryIdフィールドをご参照ください。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> You may need to cancel your ad depending on the combination of content and ad type you specified. Pay a cancellation fee in that case.<br> Available values can be referred to adCategoryId field of GuaranteedSimulationServiceAdCategory object obtained by getAdCategory operation of GuaranteedSimulationService.<br> This field is optional in ADD operation. </div> 
   * @return adCategoryIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告カテゴリーIDです。<br> 広告カテゴリーは、配信する広告内容に該当するものを正確に指定して下さい。内容に応じて広告掲載量が変わるため、正確なシミュレーション結果の算出に必要です。<br> 詳細は<a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=ja&aid=50308\" target=\"_blank\">ヘルプ</a>を参照してください。<br> なお、ここで指定した広告カテゴリーと異なる広告が入稿された場合は、入稿した広告内容の修正が必要な旨をメールでご連絡します。<br> ※指定した広告カテゴリーと広告タイプの組み合わせによっては、予約のキャンセルが必要な場合があります。その場合はキャンセル料が発生します。<br> 指定可能な値は、GuaranteedSimulationService/getAdCategoryで取得されるGuaranteedSimulationServiceAdCategoryオブジェクトのadCategoryIdフィールドをご参照ください。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Ad category ID.<br> To get an accurate simulated result, specify the restricted contents correctly. The ad volume depends on the contents.<br> <a href=\"https://ads-help.yahoo.co.jp/yahooads/guideline/articledetail?lan=en&aid=28259\" target=\"_blank\">Learn more</a><br> If you add ads that have a content different from the one you specified, you will receive an email to fix them.<br> You may need to cancel your ad depending on the combination of content and ad type you specified. Pay a cancellation fee in that case.<br> Available values can be referred to adCategoryId field of GuaranteedSimulationServiceAdCategory object obtained by getAdCategory operation of GuaranteedSimulationService.<br> This field is optional in ADD operation. </div> ")


  public List<Long> getAdCategoryIds() {
    return adCategoryIds;
  }

  public void setAdCategoryIds(List<Long> adCategoryIds) {
    this.adCategoryIds = adCategoryIds;
  }

  public GuaranteedSimulation packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package ID.<br> This field is optional in ADD operation. </div> 
   * @return packageId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package ID.<br> This field is optional in ADD operation. </div> ")


  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public GuaranteedSimulation packageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package history ID.<br> This field is optional in ADD operation. </div> 
   * @return packageHistoryId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品履歴IDです。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Package history ID.<br> This field is optional in ADD operation. </div> ")


  public Long getPackageHistoryId() {
    return packageHistoryId;
  }

  public void setPackageHistoryId(Long packageHistoryId) {
    this.packageHistoryId = packageHistoryId;
  }

  public GuaranteedSimulation actionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
    return this;
  }

  /**
   * Get actionAfterVideoAdTap
   * @return actionAfterVideoAdTap
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceActionAfterVideoAdTap getActionAfterVideoAdTap() {
    return actionAfterVideoAdTap;
  }

  public void setActionAfterVideoAdTap(GuaranteedSimulationServiceActionAfterVideoAdTap actionAfterVideoAdTap) {
    this.actionAfterVideoAdTap = actionAfterVideoAdTap;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

