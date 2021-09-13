package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceBudget;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceCampaignBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceFrequencyCap;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceLabel;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceServingStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceType;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceUserStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.CampaignServiceViewableFrequencyCap;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Campaignオブジェクトは、キャンペーン情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign object describes campaign information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Campaignオブジェクトは、キャンペーン情報を表します。</div> <div lang=\"en\">Campaign object describes campaign information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Campaign   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adProductType")
  private String adProductType = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("biddingStrategy")
  private CampaignServiceBiddingStrategy biddingStrategy = null;

  @JsonProperty("budget")
  private CampaignServiceBudget budget = null;

  @JsonProperty("campaignBiddingStrategy")
  private CampaignServiceCampaignBiddingStrategy campaignBiddingStrategy = null;

  @JsonProperty("campaignGoal")
  private String campaignGoal = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("conversionOptimizer")
  private CampaignServiceConversionOptimizer conversionOptimizer = null;

  @JsonProperty("deviceOsType")
  private CampaignServiceDeviceOsType deviceOsType = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("frequencyCap")
  private CampaignServiceFrequencyCap frequencyCap = null;

  @JsonProperty("labels")
  @Valid
  private List<CampaignServiceLabel> labels = null;

  @JsonProperty("servingStatus")
  private CampaignServiceServingStatus servingStatus = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("type")
  private CampaignServiceType type = null;

  @JsonProperty("userStatus")
  private CampaignServiceUserStatus userStatus = null;

  @JsonProperty("viewableFrequencyCap")
  private CampaignServiceViewableFrequencyCap viewableFrequencyCap = null;

  @JsonProperty("campaignDeliveryType")
  private String campaignDeliveryType = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public Campaign accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID. <br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID. <br> This field is required in requests. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Campaign adProductType(String adProductType) {
    this.adProductType = adProductType;
    return this;
  }

  /**
   * <div lang=\"ja\"> 配信方法です。<br> ADD時、このフィールドは指定できません。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> Ad product information.<br> In ADD operation, this field can not be set. <br> In REMOVE operation, this field will be ignored. </div> 
   * @return adProductType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 配信方法です。<br> ADD時、このフィールドは指定できません。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> Ad product information.<br> In ADD operation, this field can not be set. <br> In REMOVE operation, this field will be ignored. </div> ")


  public String getAdProductType() {
    return adProductType;
  }

  public void setAdProductType(String adProductType) {
    this.adProductType = adProductType;
  }

  public Campaign appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\"> iOS:アプリIDです。<br> Android:パッケージ名です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> iOS: APP ID.<br> Android: Package name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> iOS:アプリIDです。<br> Android:パッケージ名です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> iOS: APP ID.<br> Android: Package name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> ")


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Campaign appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * <div lang=\"ja\"> アプリの名称です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> App Name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> 
   * @return appName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アプリの名称です。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。<br> ※campaignGoalが「APP_PROMOTION」の場合、ADD時に必須となります。 </div> <div lang=\"en\"> App Name. <br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.<br> *If campaignGoal is APP_PROMOTION, this field is required in ADD operation. </div> ")


  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public Campaign biddingStrategy(CampaignServiceBiddingStrategy biddingStrategy) {
    this.biddingStrategy = biddingStrategy;
    return this;
  }

  /**
   * Get biddingStrategy
   * @return biddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceBiddingStrategy getBiddingStrategy() {
    return biddingStrategy;
  }

  public void setBiddingStrategy(CampaignServiceBiddingStrategy biddingStrategy) {
    this.biddingStrategy = biddingStrategy;
  }

  public Campaign budget(CampaignServiceBudget budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   * @return budget
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceBudget getBudget() {
    return budget;
  }

  public void setBudget(CampaignServiceBudget budget) {
    this.budget = budget;
  }

  public Campaign campaignBiddingStrategy(CampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    this.campaignBiddingStrategy = campaignBiddingStrategy;
    return this;
  }

  /**
   * Get campaignBiddingStrategy
   * @return campaignBiddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceCampaignBiddingStrategy getCampaignBiddingStrategy() {
    return campaignBiddingStrategy;
  }

  public void setCampaignBiddingStrategy(CampaignServiceCampaignBiddingStrategy campaignBiddingStrategy) {
    this.campaignBiddingStrategy = campaignBiddingStrategy;
  }

  public Campaign campaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> SETおよびREMOVE時、このフィールドは無視されます。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field is required.<br> In SET and REMOVE operation, this field will be ignored.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目的です。<br> ADD時、このフィールドは必須となります。<br> SETおよびREMOVE時、このフィールドは無視されます。<br> ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。<br> </div> <div lang=\"en\"> Campaign goal.<br> In ADD operation, this field is required.<br> In SET and REMOVE operation, this field will be ignored.<br> * Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService.<br> </div> ")


  public String getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  public Campaign campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSETおよびREMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドはSETおよびREMOVE時に必須となり、ADD時に無視されます。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation. </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public Campaign campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Campaign Name.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、ADD時は必須、SET時は省略可能となり、REMOVE時は無視されます。 </div> <div lang=\"en\"> Campaign Name.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public Campaign conversionOptimizer(CampaignServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
    return this;
  }

  /**
   * Get conversionOptimizer
   * @return conversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceConversionOptimizer getConversionOptimizer() {
    return conversionOptimizer;
  }

  public void setConversionOptimizer(CampaignServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
  }

  public Campaign deviceOsType(CampaignServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
    return this;
  }

  /**
   * Get deviceOsType
   * @return deviceOsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceDeviceOsType getDeviceOsType() {
    return deviceOsType;
  }

  public void setDeviceOsType(CampaignServiceDeviceOsType deviceOsType) {
    this.deviceOsType = deviceOsType;
  }

  public Campaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> End date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> End date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Campaign feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\"> フィードIDです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。<br> ※動的ディスプレイ広告の場合、ADD時に必須となります。 </div> <div lang=\"en\"> Feed ID.<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. <br> *If adType is Dynamic Ads for Display, this field is required in ADD operation. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> フィードIDです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。<br> ※動的ディスプレイ広告の場合、ADD時に必須となります。 </div> <div lang=\"en\"> Feed ID.<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation. <br> *If adType is Dynamic Ads for Display, this field is required in ADD operation. </div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public Campaign frequencyCap(CampaignServiceFrequencyCap frequencyCap) {
    this.frequencyCap = frequencyCap;
    return this;
  }

  /**
   * Get frequencyCap
   * @return frequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceFrequencyCap getFrequencyCap() {
    return frequencyCap;
  }

  public void setFrequencyCap(CampaignServiceFrequencyCap frequencyCap) {
    this.frequencyCap = frequencyCap;
  }

  public Campaign labels(List<CampaignServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public Campaign addLabelsItem(CampaignServiceLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<CampaignServiceLabel> labels) {
    this.labels = labels;
  }

  public Campaign servingStatus(CampaignServiceServingStatus servingStatus) {
    this.servingStatus = servingStatus;
    return this;
  }

  /**
   * Get servingStatus
   * @return servingStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceServingStatus getServingStatus() {
    return servingStatus;
  }

  public void setServingStatus(CampaignServiceServingStatus servingStatus) {
    this.servingStatus = servingStatus;
  }

  public Campaign startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Start date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Start date.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Campaign type(CampaignServiceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceType getType() {
    return type;
  }

  public void setType(CampaignServiceType type) {
    this.type = type;
  }

  public Campaign userStatus(CampaignServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(CampaignServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public Campaign viewableFrequencyCap(CampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
    return this;
  }

  /**
   * Get viewableFrequencyCap
   * @return viewableFrequencyCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceViewableFrequencyCap getViewableFrequencyCap() {
    return viewableFrequencyCap;
  }

  public void setViewableFrequencyCap(CampaignServiceViewableFrequencyCap viewableFrequencyCap) {
    this.viewableFrequencyCap = viewableFrequencyCap;
  }

  public Campaign campaignDeliveryType(String campaignDeliveryType) {
    this.campaignDeliveryType = campaignDeliveryType;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン掲載タイプです。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> CampaignDeliveryTypeを指定してのキャンペーン作成は、一部の利用者向けの機能となります。 </div> <div lang=\"en\"> Campaign delivery type.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> Creating a campaign with the CampaignDeliveryType specified is a function for some users. </div> 
   * @return campaignDeliveryType
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン掲載タイプです。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> CampaignDeliveryTypeを指定してのキャンペーン作成は、一部の利用者向けの機能となります。 </div> <div lang=\"en\"> Campaign delivery type.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> Creating a campaign with the CampaignDeliveryType specified is a function for some users. </div> ")


  public String getCampaignDeliveryType() {
    return campaignDeliveryType;
  }

  public void setCampaignDeliveryType(String campaignDeliveryType) {
    this.campaignDeliveryType = campaignDeliveryType;
  }

  public Campaign createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> ")


  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.createdDate, campaign.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adProductType, appId, appName, biddingStrategy, budget, campaignBiddingStrategy, campaignGoal, campaignId, campaignName, conversionOptimizer, deviceOsType, endDate, feedId, frequencyCap, labels, servingStatus, startDate, type, userStatus, viewableFrequencyCap, campaignDeliveryType, createdDate);
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

