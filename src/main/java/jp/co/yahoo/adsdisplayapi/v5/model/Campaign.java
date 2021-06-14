package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceBudget;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceCampaignBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceFrequencyCap;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceServingStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceType;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceUserStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceViewableFrequencyCap;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Campaignオブジェクトは、キャンペーン情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign object describes campaign information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Campaignオブジェクトは、キャンペーン情報を表します。</div> <div lang=\"en\">Campaign object describes campaign information.</div> ")

public class Campaign   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adProductType")
  private JsonNullable<String> adProductType = JsonNullable.undefined();

  @JsonProperty("appId")
  private JsonNullable<String> appId = JsonNullable.undefined();

  @JsonProperty("appName")
  private JsonNullable<String> appName = JsonNullable.undefined();

  @JsonProperty("biddingStrategy")
  private JsonNullable<CampaignServiceBiddingStrategy> biddingStrategy = JsonNullable.undefined();

  @JsonProperty("budget")
  private JsonNullable<CampaignServiceBudget> budget = JsonNullable.undefined();

  @JsonProperty("campaignBiddingStrategy")
  private JsonNullable<CampaignServiceCampaignBiddingStrategy> campaignBiddingStrategy = JsonNullable.undefined();

  @JsonProperty("campaignGoal")
  private JsonNullable<String> campaignGoal = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("conversionOptimizer")
  private JsonNullable<CampaignServiceConversionOptimizer> conversionOptimizer = JsonNullable.undefined();

  @JsonProperty("deviceOsType")
  private JsonNullable<CampaignServiceDeviceOsType> deviceOsType = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("frequencyCap")
  private JsonNullable<CampaignServiceFrequencyCap> frequencyCap = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<CampaignServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("servingStatus")
  private JsonNullable<CampaignServiceServingStatus> servingStatus = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<CampaignServiceType> type = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<CampaignServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("viewableFrequencyCap")
  private JsonNullable<CampaignServiceViewableFrequencyCap> viewableFrequencyCap = JsonNullable.undefined();

  @JsonProperty("campaignDeliveryType")
  private JsonNullable<String> campaignDeliveryType = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  @JsonProperty("vendorName")
  private JsonNullable<String> vendorName = JsonNullable.undefined();

  public Campaign accountId(Long accountId) {
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

  public Campaign adProductType(String adProductType) {
    this.adProductType = JsonNullable.of(adProductType);
    return this;
  }

  /**
   * <div lang=\"ja\"> 配信方法です。<br> ADD時、このフィールドは指定できません。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> Ad product information.<br> In ADD operation, this field can not be set. <br> In REMOVE operation, this field will be ignored. </div> 
   * @return adProductType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 配信方法です。<br> ADD時、このフィールドは指定できません。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> Ad product information.<br> In ADD operation, this field can not be set. <br> In REMOVE operation, this field will be ignored. </div> ")


  public JsonNullable<String> getAdProductType() {
    return adProductType;
  }

  public void setAdProductType(JsonNullable<String> adProductType) {
    this.adProductType = adProductType;
  }

  public Campaign appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * <div lang=\"ja\"> iOS:アプリIDです。<br> Android:パッケージ名です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> iOS: APP ID.<br> Android: Package name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> iOS:アプリIDです。<br> Android:パッケージ名です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> iOS: APP ID.<br> Android: Package name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> ")


  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public Campaign appName(String appName) {
    this.appName = JsonNullable.of(appName);
    return this;
  }

  /**
   * <div lang=\"ja\"> アプリの名称です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> App Name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> 
   * @return appName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アプリの名称です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> App Name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> ")


  public JsonNullable<String> getAppName() {
    return appName;
  }

  public void setAppName(JsonNullable<String> appName) {
    this.appName = appName;
  }

  public Campaign biddingStrategy(CampaignServiceBiddingStrategy biddingStrategy) {
    this.biddingStrategy = JsonNullable.of(biddingStrategy);
    return this;
  }

  /**
   * Get biddingStrategy
   * @return biddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingStrategy> getBiddingStrategy() {
    return biddingStrategy;
  }

  public void setBiddingStrategy(JsonNullable<CampaignServiceBiddingStrategy> biddingStrategy) {
    this.biddingStrategy = biddingStrategy;
  }

  public Campaign budget(CampaignServiceBudget budget) {
    this.budget = JsonNullable.of(budget);
    return this;
  }

  /**
   * Get budget
   * @return budget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBudget> getBudget() {
    return budget;
  }

  public void setBudget(JsonNullable<CampaignServiceBudget> budget) {
    this.budget = budget;
  }

  public Campaign campaignBiddingStrategy(CampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    this.campaignBiddingStrategy = JsonNullable.of(campaignBiddingStrategy);
    return this;
  }

  /**
   * Get campaignBiddingStrategy
   * @return campaignBiddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceCampaignBiddingStrategy> getCampaignBiddingStrategy() {
    return campaignBiddingStrategy;
  }

  public void setCampaignBiddingStrategy(JsonNullable<CampaignServiceCampaignBiddingStrategy> campaignBiddingStrategy) {
    this.campaignBiddingStrategy = campaignBiddingStrategy;
  }

  public Campaign campaignGoal(String campaignGoal) {
    this.campaignGoal = JsonNullable.of(campaignGoal);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> SETおよびREMOVE時、このフィールドは無視されます。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field is required.<br> In SET and REMOVE operation, this field will be ignored.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> SETおよびREMOVE時、このフィールドは無視されます。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field is required.<br> In SET and REMOVE operation, this field will be ignored.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> ")


  public JsonNullable<String> getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(JsonNullable<String> campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public Campaign campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSETおよびREMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSETおよびREMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public Campaign campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Campaign Name.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Campaign Name.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public Campaign conversionOptimizer(CampaignServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = JsonNullable.of(conversionOptimizer);
    return this;
  }

  /**
   * Get conversionOptimizer
   * @return conversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceConversionOptimizer> getConversionOptimizer() {
    return conversionOptimizer;
  }

  public void setConversionOptimizer(JsonNullable<CampaignServiceConversionOptimizer> conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
  }

  public Campaign deviceOsType(CampaignServiceDeviceOsType deviceOsType) {
    this.deviceOsType = JsonNullable.of(deviceOsType);
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceDeviceOsType> getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(JsonNullable<CampaignServiceDeviceOsType> deviceOsType) {
    this.deviceOsType = deviceOsType;
  }

  public Campaign endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> End date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> End date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public Campaign feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\"> フィードIDです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。<br> ※動的ディスプレイ広告の場合、ADD時に必須となります。 </div> <div lang=\"en\"> Feed ID.<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. <br> *If adType is Dynamic Ads for Display, this field is required in ADD operation. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> フィードIDです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。<br> ※動的ディスプレイ広告の場合、ADD時に必須となります。 </div> <div lang=\"en\"> Feed ID.<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. <br> *If adType is Dynamic Ads for Display, this field is required in ADD operation. </div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public Campaign frequencyCap(CampaignServiceFrequencyCap frequencyCap) {
    this.frequencyCap = JsonNullable.of(frequencyCap);
    return this;
  }

  /**
   * Get frequencyCap
   * @return frequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceFrequencyCap> getFrequencyCap() {
    return frequencyCap;
  }

  public void setFrequencyCap(JsonNullable<CampaignServiceFrequencyCap> frequencyCap) {
    this.frequencyCap = frequencyCap;
  }

  public Campaign labels(List<CampaignServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public Campaign addLabelsItem(CampaignServiceLabel labelsItem) {
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

  public JsonNullable<List<CampaignServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<CampaignServiceLabel>> labels) {
    this.labels = labels;
  }

  public Campaign servingStatus(CampaignServiceServingStatus servingStatus) {
    this.servingStatus = JsonNullable.of(servingStatus);
    return this;
  }

  /**
   * Get servingStatus
   * @return servingStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceServingStatus> getServingStatus() {
    return servingStatus;
  }

  public void setServingStatus(JsonNullable<CampaignServiceServingStatus> servingStatus) {
    this.servingStatus = servingStatus;
  }

  public Campaign startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Start date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Start date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public Campaign type(CampaignServiceType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceType> getType() {
    return type;
  }

  public void setType(JsonNullable<CampaignServiceType> type) {
    this.type = type;
  }

  public Campaign userStatus(CampaignServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<CampaignServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public Campaign viewableFrequencyCap(CampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = JsonNullable.of(viewableFrequencyCap);
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceViewableFrequencyCap> getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(JsonNullable<CampaignServiceViewableFrequencyCap> viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public Campaign campaignDeliveryType(String campaignDeliveryType) {
    this.campaignDeliveryType = JsonNullable.of(campaignDeliveryType);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン掲載タイプです。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> CampaignDeliveryTypeを指定してのキャンペーン作成は、一部の利用者向けの機能となります。 </div> <div lang=\"en\"> Campaign delivery type.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> Creating a campaign with the CampaignDeliveryType specified is a function for some users. </div> 
   * @return campaignDeliveryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン掲載タイプです。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> CampaignDeliveryTypeを指定してのキャンペーン作成は、一部の利用者向けの機能となります。 </div> <div lang=\"en\"> Campaign delivery type.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> Creating a campaign with the CampaignDeliveryType specified is a function for some users. </div> ")


  public JsonNullable<String> getCampaignDeliveryType() {
    return campaignDeliveryType;
  }

  public void setCampaignDeliveryType(JsonNullable<String> campaignDeliveryType) {
    this.campaignDeliveryType = campaignDeliveryType;
  }

  public Campaign createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<String> createdDate) {
    this.createdDate = createdDate;
  }

  public Campaign vendorName(String vendorName) {
    this.vendorName = JsonNullable.of(vendorName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの広告効果測定ツールのベンダー名です。キャンペーン目的「アプリ訴求」の場合にのみ設定されます。<br> このフィールドはキャンペーン作成後、最初にリンク先URLを設定した広告が作成された時に設定されます。<br> キャンペーンに紐づく広告のリンク先URLには、このベンダー名に対応する広告効果測定ツールのURLのみが指定できます。<br> ADDおよびSET時、このフィールドは指定できません。<br> </div> <div lang=\"en\"> Vendor name of tracking tool for the campaign. It will be set only when the campaign goal is \"app promotion\". <br> This field will be set when the first ad with destination URL is created after creating the campaign.<br> Only the tracking tool URL corresponds to this tool vendor name can be specified for the destination URL of the ad linked to the campaign.<br> This field cannot be specified in ADD and SET operation.<br> </div> 
   * @return vendorName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの広告効果測定ツールのベンダー名です。キャンペーン目的「アプリ訴求」の場合にのみ設定されます。<br> このフィールドはキャンペーン作成後、最初にリンク先URLを設定した広告が作成された時に設定されます。<br> キャンペーンに紐づく広告のリンク先URLには、このベンダー名に対応する広告効果測定ツールのURLのみが指定できます。<br> ADDおよびSET時、このフィールドは指定できません。<br> </div> <div lang=\"en\"> Vendor name of tracking tool for the campaign. It will be set only when the campaign goal is \"app promotion\". <br> This field will be set when the first ad with destination URL is created after creating the campaign.<br> Only the tracking tool URL corresponds to this tool vendor name can be specified for the destination URL of the ad linked to the campaign.<br> This field cannot be specified in ADD and SET operation.<br> </div> ")


  public JsonNullable<String> getVendorName() {
    return vendorName;
  }

  public void setVendorName(JsonNullable<String> vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.accountId, campaign.accountId) &&
        Objects.equals(this.adProductType, campaign.adProductType) &&
        Objects.equals(this.appId, campaign.appId) &&
        Objects.equals(this.appName, campaign.appName) &&
        Objects.equals(this.biddingStrategy, campaign.biddingStrategy) &&
        Objects.equals(this.budget, campaign.budget) &&
        Objects.equals(this.campaignBiddingStrategy, campaign.campaignBiddingStrategy) &&
        Objects.equals(this.campaignGoal, campaign.campaignGoal) &&
        Objects.equals(this.campaignId, campaign.campaignId) &&
        Objects.equals(this.campaignName, campaign.campaignName) &&
        Objects.equals(this.conversionOptimizer, campaign.conversionOptimizer) &&
        Objects.equals(this.deviceOsType, campaign.deviceOsType) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.feedId, campaign.feedId) &&
        Objects.equals(this.frequencyCap, campaign.frequencyCap) &&
        Objects.equals(this.labels, campaign.labels) &&
        Objects.equals(this.servingStatus, campaign.servingStatus) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.type, campaign.type) &&
        Objects.equals(this.userStatus, campaign.userStatus) &&
        Objects.equals(this.viewableFrequencyCap, campaign.viewableFrequencyCap) &&
        Objects.equals(this.campaignDeliveryType, campaign.campaignDeliveryType) &&
        Objects.equals(this.createdDate, campaign.createdDate) &&
        Objects.equals(this.vendorName, campaign.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adProductType, appId, appName, biddingStrategy, budget, campaignBiddingStrategy, campaignGoal, campaignId, campaignName, conversionOptimizer, deviceOsType, endDate, feedId, frequencyCap, labels, servingStatus, startDate, type, userStatus, viewableFrequencyCap, campaignDeliveryType, createdDate, vendorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adProductType: ").append(toIndentedString(adProductType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    biddingStrategy: ").append(toIndentedString(biddingStrategy)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignBiddingStrategy: ").append(toIndentedString(campaignBiddingStrategy)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    conversionOptimizer: ").append(toIndentedString(conversionOptimizer)).append("\n");
    sb.append("    deviceOsType: ").append(toIndentedString(deviceOsType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    frequencyCap: ").append(toIndentedString(frequencyCap)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    servingStatus: ").append(toIndentedString(servingStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    viewableFrequencyCap: ").append(toIndentedString(viewableFrequencyCap)).append("\n");
    sb.append("    campaignDeliveryType: ").append(toIndentedString(campaignDeliveryType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

