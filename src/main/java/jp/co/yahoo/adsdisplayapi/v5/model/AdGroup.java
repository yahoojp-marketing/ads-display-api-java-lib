package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceBid;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceBiddingStrategy;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceConversionOptimizer;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceDeviceAppType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceDynamicImageExtensions;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceSmartDeviceCarrier;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupオブジェクトは、広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Ad Group object is a container for storing ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupオブジェクトは、広告グループ情報を保持します。</div> <div lang=\"en\">The Ad Group object is a container for storing ad group information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroup   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupBiddingStrategy")
  private AdGroupServiceBiddingStrategy adGroupBiddingStrategy = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("bid")
  private AdGroupServiceBid bid = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("conversionOptimizer")
  private AdGroupServiceConversionOptimizer conversionOptimizer = null;

  @JsonProperty("device")
  @Valid
  private List<AdGroupServiceDeviceType> device = null;

  @JsonProperty("deviceApp")
  @Valid
  private List<AdGroupServiceDeviceAppType> deviceApp = null;

  @JsonProperty("deviceOs")
  @Valid
  private List<AdGroupServiceDeviceOsType> deviceOs = null;

  @JsonProperty("deviceOsVersion")
  private String deviceOsVersion = null;

  @JsonProperty("dynamicImageExtensions")
  private AdGroupServiceDynamicImageExtensions dynamicImageExtensions = null;

  @JsonProperty("feedSetId")
  private Long feedSetId = null;

  @JsonProperty("labels")
  @Valid
  private List<AdGroupServiceLabel> labels = null;

  @JsonProperty("smartDeviceCarriers")
  @Valid
  private List<AdGroupServiceSmartDeviceCarrier> smartDeviceCarriers = null;

  @JsonProperty("userStatus")
  private AdGroupServiceUserStatus userStatus = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public AdGroup accountId(Long accountId) {
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

  public AdGroup adGroupBiddingStrategy(AdGroupServiceBiddingStrategy adGroupBiddingStrategy) {
    this.adGroupBiddingStrategy = adGroupBiddingStrategy;
    return this;
  }

  /**
   * Get adGroupBiddingStrategy
   * @return adGroupBiddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceBiddingStrategy getAdGroupBiddingStrategy() {
    return adGroupBiddingStrategy;
  }

  public void setAdGroupBiddingStrategy(AdGroupServiceBiddingStrategy adGroupBiddingStrategy) {
    this.adGroupBiddingStrategy = adGroupBiddingStrategy;
  }

  public AdGroup adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroup adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroup bid(AdGroupServiceBid bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceBid getBid() {
    return bid;
  }

  public void setBid(AdGroupServiceBid bid) {
    this.bid = bid;
  }

  public AdGroup campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroup campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public AdGroup conversionOptimizer(AdGroupServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
    return this;
  }

  /**
   * Get conversionOptimizer
   * @return conversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceConversionOptimizer getConversionOptimizer() {
    return conversionOptimizer;
  }

  public void setConversionOptimizer(AdGroupServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
  }

  public AdGroup device(List<AdGroupServiceDeviceType> device) {
    this.device = device;
    return this;
  }

  public AdGroup addDeviceItem(AdGroupServiceDeviceType deviceItem) {
    if (this.device == null) {
      this.device = new ArrayList<>();
    }
    this.device.add(deviceItem);
    return this;
  }

  /**
   * Get device
   * @return device
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupServiceDeviceType> getDevice() {
    return device;
  }

  public void setDevice(List<AdGroupServiceDeviceType> device) {
    this.device = device;
  }

  public AdGroup deviceApp(List<AdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = deviceApp;
    return this;
  }

  public AdGroup addDeviceAppItem(AdGroupServiceDeviceAppType deviceAppItem) {
    if (this.deviceApp == null) {
      this.deviceApp = new ArrayList<>();
    }
    this.deviceApp.add(deviceAppItem);
    return this;
  }

  /**
   * Get deviceApp
   * @return deviceApp
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupServiceDeviceAppType> getDeviceApp() {
    return deviceApp;
  }

  public void setDeviceApp(List<AdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = deviceApp;
  }

  public AdGroup deviceOs(List<AdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = deviceOs;
    return this;
  }

  public AdGroup addDeviceOsItem(AdGroupServiceDeviceOsType deviceOsItem) {
    if (this.deviceOs == null) {
      this.deviceOs = new ArrayList<>();
    }
    this.deviceOs.add(deviceOsItem);
    return this;
  }

  /**
   * Get deviceOs
   * @return deviceOs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupServiceDeviceOsType> getDeviceOs() {
    return deviceOs;
  }

  public void setDeviceOs(List<AdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = deviceOs;
  }

  public AdGroup deviceOsVersion(String deviceOsVersion) {
    this.deviceOsVersion = deviceOsVersion;
    return this;
  }

  /**
   * <div lang=\"ja\"> OSバージョンです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※設定を解除する場合は、NONEを設定してください。 </div> <div lang=\"en\"> OS version.<br> ∗To cancel the setting, specify &#34;NONE&#34;.<br> This field is optional in ADD and SET operation. </div> 
   * @return deviceOsVersion
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> OSバージョンです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※設定を解除する場合は、NONEを設定してください。 </div> <div lang=\"en\"> OS version.<br> ∗To cancel the setting, specify &#34;NONE&#34;.<br> This field is optional in ADD and SET operation. </div> ")


  public String getDeviceOsVersion() {
    return deviceOsVersion;
  }

  public void setDeviceOsVersion(String deviceOsVersion) {
    this.deviceOsVersion = deviceOsVersion;
  }

  public AdGroup dynamicImageExtensions(AdGroupServiceDynamicImageExtensions dynamicImageExtensions) {
    this.dynamicImageExtensions = dynamicImageExtensions;
    return this;
  }

  /**
   * Get dynamicImageExtensions
   * @return dynamicImageExtensions
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceDynamicImageExtensions getDynamicImageExtensions() {
    return dynamicImageExtensions;
  }

  public void setDynamicImageExtensions(AdGroupServiceDynamicImageExtensions dynamicImageExtensions) {
    this.dynamicImageExtensions = dynamicImageExtensions;
  }

  public AdGroup feedSetId(Long feedSetId) {
    this.feedSetId = feedSetId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セットIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 </div> <div lang=\"en\"> Feed set ID.<br> This field is optional in ADD and SET operation.<br> * If feedSetId is not specified in ADD operation, the default set is associated automatically. </div> 
   * @return feedSetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 </div> <div lang=\"en\"> Feed set ID.<br> This field is optional in ADD and SET operation.<br> * If feedSetId is not specified in ADD operation, the default set is associated automatically. </div> ")


  public Long getFeedSetId() {
    return feedSetId;
  }

  public void setFeedSetId(Long feedSetId) {
    this.feedSetId = feedSetId;
  }

  public AdGroup labels(List<AdGroupServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public AdGroup addLabelsItem(AdGroupServiceLabel labelsItem) {
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

  public List<AdGroupServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<AdGroupServiceLabel> labels) {
    this.labels = labels;
  }

  public AdGroup smartDeviceCarriers(List<AdGroupServiceSmartDeviceCarrier> smartDeviceCarriers) {
    this.smartDeviceCarriers = smartDeviceCarriers;
    return this;
  }

  public AdGroup addSmartDeviceCarriersItem(AdGroupServiceSmartDeviceCarrier smartDeviceCarriersItem) {
    if (this.smartDeviceCarriers == null) {
      this.smartDeviceCarriers = new ArrayList<>();
    }
    this.smartDeviceCarriers.add(smartDeviceCarriersItem);
    return this;
  }

  /**
   * Get smartDeviceCarriers
   * @return smartDeviceCarriers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupServiceSmartDeviceCarrier> getSmartDeviceCarriers() {
    return smartDeviceCarriers;
  }

  public void setSmartDeviceCarriers(List<AdGroupServiceSmartDeviceCarrier> smartDeviceCarriers) {
    this.smartDeviceCarriers = smartDeviceCarriers;
  }

  public AdGroup userStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroup createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> ")


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
    AdGroup adGroup = (AdGroup) o;
    return Objects.equals(this.accountId, adGroup.accountId) &&
        Objects.equals(this.adGroupBiddingStrategy, adGroup.adGroupBiddingStrategy) &&
        Objects.equals(this.adGroupId, adGroup.adGroupId) &&
        Objects.equals(this.adGroupName, adGroup.adGroupName) &&
        Objects.equals(this.bid, adGroup.bid) &&
        Objects.equals(this.campaignId, adGroup.campaignId) &&
        Objects.equals(this.campaignName, adGroup.campaignName) &&
        Objects.equals(this.conversionOptimizer, adGroup.conversionOptimizer) &&
        Objects.equals(this.device, adGroup.device) &&
        Objects.equals(this.deviceApp, adGroup.deviceApp) &&
        Objects.equals(this.deviceOs, adGroup.deviceOs) &&
        Objects.equals(this.deviceOsVersion, adGroup.deviceOsVersion) &&
        Objects.equals(this.dynamicImageExtensions, adGroup.dynamicImageExtensions) &&
        Objects.equals(this.feedSetId, adGroup.feedSetId) &&
        Objects.equals(this.labels, adGroup.labels) &&
        Objects.equals(this.smartDeviceCarriers, adGroup.smartDeviceCarriers) &&
        Objects.equals(this.userStatus, adGroup.userStatus) &&
        Objects.equals(this.createdDate, adGroup.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupBiddingStrategy, adGroupId, adGroupName, bid, campaignId, campaignName, conversionOptimizer, device, deviceApp, deviceOs, deviceOsVersion, dynamicImageExtensions, feedSetId, labels, smartDeviceCarriers, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroup {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupBiddingStrategy: ").append(toIndentedString(adGroupBiddingStrategy)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    conversionOptimizer: ").append(toIndentedString(conversionOptimizer)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceApp: ").append(toIndentedString(deviceApp)).append("\n");
    sb.append("    deviceOs: ").append(toIndentedString(deviceOs)).append("\n");
    sb.append("    deviceOsVersion: ").append(toIndentedString(deviceOsVersion)).append("\n");
    sb.append("    dynamicImageExtensions: ").append(toIndentedString(dynamicImageExtensions)).append("\n");
    sb.append("    feedSetId: ").append(toIndentedString(feedSetId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    smartDeviceCarriers: ").append(toIndentedString(smartDeviceCarriers)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

