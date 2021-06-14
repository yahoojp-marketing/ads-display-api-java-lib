package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceAdCategoryStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceBrandTracking;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceCampaignBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceLifetimeBudget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServicePackage;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceServingStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceUserStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedCampaignServiceViewableFrequencyCap;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedCampaignオブジェクトは、予約型のキャンペーン情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedCampaign object describes guaranteed campaign information. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedCampaignオブジェクトは、予約型のキャンペーン情報を表します。</div> <div lang=\"en\">GuaranteedCampaign object describes guaranteed campaign information. </div> ")

public class GuaranteedCampaign   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("lifetimeBudget")
  private JsonNullable<GuaranteedCampaignServiceLifetimeBudget> lifetimeBudget = JsonNullable.undefined();

  @JsonProperty("campaignBiddingStrategy")
  private JsonNullable<GuaranteedCampaignServiceCampaignBiddingStrategy> campaignBiddingStrategy = JsonNullable.undefined();

  @JsonProperty("campaignGoal")
  private JsonNullable<String> campaignGoal = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<GuaranteedCampaignServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("servingStatus")
  private JsonNullable<GuaranteedCampaignServiceServingStatus> servingStatus = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<GuaranteedCampaignServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("viewableFrequencyCap")
  private JsonNullable<GuaranteedCampaignServiceViewableFrequencyCap> viewableFrequencyCap = JsonNullable.undefined();

  @JsonProperty("guaranteedSimulationId")
  private JsonNullable<Long> guaranteedSimulationId = JsonNullable.undefined();

  @JsonProperty("notificationEmailAddress")
  @Valid
  private JsonNullable<List<String>> notificationEmailAddress = JsonNullable.undefined();

  @JsonProperty("adCategoryStatus")
  private JsonNullable<GuaranteedCampaignServiceAdCategoryStatus> adCategoryStatus = JsonNullable.undefined();

  @JsonProperty("campaignCanceledDate")
  private JsonNullable<String> campaignCanceledDate = JsonNullable.undefined();

  @JsonProperty("package")
  private JsonNullable<GuaranteedCampaignServicePackage> _package = JsonNullable.undefined();

  @JsonProperty("brandTracking")
  private JsonNullable<GuaranteedCampaignServiceBrandTracking> brandTracking = JsonNullable.undefined();

  public GuaranteedCampaign accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID. <br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID. <br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public GuaranteedCampaign lifetimeBudget(GuaranteedCampaignServiceLifetimeBudget lifetimeBudget) {
    this.lifetimeBudget = JsonNullable.of(lifetimeBudget);
    return this;
  }

  /**
   * Get lifetimeBudget
   * @return lifetimeBudget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceLifetimeBudget> getLifetimeBudget() {
    return lifetimeBudget;
  }

  public void setLifetimeBudget(JsonNullable<GuaranteedCampaignServiceLifetimeBudget> lifetimeBudget) {
    this.lifetimeBudget = lifetimeBudget;
  }

  public GuaranteedCampaign campaignBiddingStrategy(GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    this.campaignBiddingStrategy = JsonNullable.of(campaignBiddingStrategy);
    return this;
  }

  /**
   * Get campaignBiddingStrategy
   * @return campaignBiddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceCampaignBiddingStrategy> getCampaignBiddingStrategy() {
    return campaignBiddingStrategy;
  }

  public void setCampaignBiddingStrategy(JsonNullable<GuaranteedCampaignServiceCampaignBiddingStrategy> campaignBiddingStrategy) {
    this.campaignBiddingStrategy = campaignBiddingStrategy;
  }

  public GuaranteedCampaign campaignGoal(String campaignGoal) {
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

  public GuaranteedCampaign campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSET時に必須となります。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET operation. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSET時に必須となります。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET operation. </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public GuaranteedCampaign campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。 </div> <div lang=\"en\"> Campaign Name. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。 </div> <div lang=\"en\"> Campaign Name. </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public GuaranteedCampaign endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public GuaranteedCampaign labels(List<GuaranteedCampaignServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public GuaranteedCampaign addLabelsItem(GuaranteedCampaignServiceLabel labelsItem) {
    if (this.labels == null || !this.labels.isPresent()) {
      this.labels = JsonNullable.of(new ArrayList<>());
    }
    this.labels.get().add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedCampaignServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<GuaranteedCampaignServiceLabel>> labels) {
    this.labels = labels;
  }

  public GuaranteedCampaign servingStatus(GuaranteedCampaignServiceServingStatus servingStatus) {
    this.servingStatus = JsonNullable.of(servingStatus);
    return this;
  }

  /**
   * Get servingStatus
   * @return servingStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceServingStatus> getServingStatus() {
    return servingStatus;
  }

  public void setServingStatus(JsonNullable<GuaranteedCampaignServiceServingStatus> servingStatus) {
    this.servingStatus = servingStatus;
  }

  public GuaranteedCampaign startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> ※フォーマット：yyyyMMdd<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date.<br> ∗ Format: yyyyMMdd<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public GuaranteedCampaign userStatus(GuaranteedCampaignServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<GuaranteedCampaignServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public GuaranteedCampaign viewableFrequencyCap(GuaranteedCampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = JsonNullable.of(viewableFrequencyCap);
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceViewableFrequencyCap> getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(JsonNullable<GuaranteedCampaignServiceViewableFrequencyCap> viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public GuaranteedCampaign guaranteedSimulationId(Long guaranteedSimulationId) {
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

  public GuaranteedCampaign notificationEmailAddress(List<String> notificationEmailAddress) {
    this.notificationEmailAddress = JsonNullable.of(notificationEmailAddress);
    return this;
  }

  public GuaranteedCampaign addNotificationEmailAddressItem(String notificationEmailAddressItem) {
    if (this.notificationEmailAddress == null || !this.notificationEmailAddress.isPresent()) {
      this.notificationEmailAddress = JsonNullable.of(new ArrayList<>());
    }
    this.notificationEmailAddress.get().add(notificationEmailAddressItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 連絡先メールアドレスです。<br> </div> <div lang=\"en\"> Email address to send notifications.<br> </div> 
   * @return notificationEmailAddress
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 連絡先メールアドレスです。<br> </div> <div lang=\"en\"> Email address to send notifications.<br> </div> ")


  public JsonNullable<List<String>> getNotificationEmailAddress() {
    return notificationEmailAddress;
  }

  public void setNotificationEmailAddress(JsonNullable<List<String>> notificationEmailAddress) {
    this.notificationEmailAddress = notificationEmailAddress;
  }

  public GuaranteedCampaign adCategoryStatus(GuaranteedCampaignServiceAdCategoryStatus adCategoryStatus) {
    this.adCategoryStatus = JsonNullable.of(adCategoryStatus);
    return this;
  }

  /**
   * Get adCategoryStatus
   * @return adCategoryStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceAdCategoryStatus> getAdCategoryStatus() {
    return adCategoryStatus;
  }

  public void setAdCategoryStatus(JsonNullable<GuaranteedCampaignServiceAdCategoryStatus> adCategoryStatus) {
    this.adCategoryStatus = adCategoryStatus;
  }

  public GuaranteedCampaign campaignCanceledDate(String campaignCanceledDate) {
    this.campaignCanceledDate = JsonNullable.of(campaignCanceledDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 予約型のキャンペーンをキャンセルした日時です。<br> ※フォーマット：yyyyMMddHHmmss<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> A date and time which the guaranteed campaign is cancelled.<br> ∗ Format: yyyyMMddHHmmss<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return campaignCanceledDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 予約型のキャンペーンをキャンセルした日時です。<br> ※フォーマット：yyyyMMddHHmmss<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> A date and time which the guaranteed campaign is cancelled.<br> ∗ Format: yyyyMMddHHmmss<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getCampaignCanceledDate() {
    return campaignCanceledDate;
  }

  public void setCampaignCanceledDate(JsonNullable<String> campaignCanceledDate) {
    this.campaignCanceledDate = campaignCanceledDate;
  }

  public GuaranteedCampaign _package(GuaranteedCampaignServicePackage _package) {
    this._package = JsonNullable.of(_package);
    return this;
  }

  /**
   * Get _package
   * @return _package
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServicePackage> getPackage() {
    return _package;
  }

  public void setPackage(JsonNullable<GuaranteedCampaignServicePackage> _package) {
    this._package = _package;
  }

  public GuaranteedCampaign brandTracking(GuaranteedCampaignServiceBrandTracking brandTracking) {
    this.brandTracking = JsonNullable.of(brandTracking);
    return this;
  }

  /**
   * Get brandTracking
   * @return brandTracking
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedCampaignServiceBrandTracking> getBrandTracking() {
    return brandTracking;
  }

  public void setBrandTracking(JsonNullable<GuaranteedCampaignServiceBrandTracking> brandTracking) {
    this.brandTracking = brandTracking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaign guaranteedCampaign = (GuaranteedCampaign) o;
    return Objects.equals(this.accountId, guaranteedCampaign.accountId) &&
        Objects.equals(this.lifetimeBudget, guaranteedCampaign.lifetimeBudget) &&
        Objects.equals(this.campaignBiddingStrategy, guaranteedCampaign.campaignBiddingStrategy) &&
        Objects.equals(this.campaignGoal, guaranteedCampaign.campaignGoal) &&
        Objects.equals(this.campaignId, guaranteedCampaign.campaignId) &&
        Objects.equals(this.campaignName, guaranteedCampaign.campaignName) &&
        Objects.equals(this.endDate, guaranteedCampaign.endDate) &&
        Objects.equals(this.labels, guaranteedCampaign.labels) &&
        Objects.equals(this.servingStatus, guaranteedCampaign.servingStatus) &&
        Objects.equals(this.startDate, guaranteedCampaign.startDate) &&
        Objects.equals(this.userStatus, guaranteedCampaign.userStatus) &&
        Objects.equals(this.viewableFrequencyCap, guaranteedCampaign.viewableFrequencyCap) &&
        Objects.equals(this.guaranteedSimulationId, guaranteedCampaign.guaranteedSimulationId) &&
        Objects.equals(this.notificationEmailAddress, guaranteedCampaign.notificationEmailAddress) &&
        Objects.equals(this.adCategoryStatus, guaranteedCampaign.adCategoryStatus) &&
        Objects.equals(this.campaignCanceledDate, guaranteedCampaign.campaignCanceledDate) &&
        Objects.equals(this._package, guaranteedCampaign._package) &&
        Objects.equals(this.brandTracking, guaranteedCampaign.brandTracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lifetimeBudget, campaignBiddingStrategy, campaignGoal, campaignId, campaignName, endDate, labels, servingStatus, startDate, userStatus, viewableFrequencyCap, guaranteedSimulationId, notificationEmailAddress, adCategoryStatus, campaignCanceledDate, _package, brandTracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaign {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lifetimeBudget: ").append(toIndentedString(lifetimeBudget)).append("\n");
    sb.append("    campaignBiddingStrategy: ").append(toIndentedString(campaignBiddingStrategy)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    servingStatus: ").append(toIndentedString(servingStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    guaranteedSimulationId: ").append(toIndentedString(guaranteedSimulationId)).append("\n");
    sb.append("    notificationEmailAddress: ").append(toIndentedString(notificationEmailAddress)).append("\n");
    sb.append("    adCategoryStatus: ").append(toIndentedString(adCategoryStatus)).append("\n");
    sb.append("    campaignCanceledDate: ").append(toIndentedString(campaignCanceledDate)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    brandTracking: ").append(toIndentedString(brandTracking)).append("\n");
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

