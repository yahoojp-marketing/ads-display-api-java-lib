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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupオブジェクトは、広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Ad Group object is a container for storing ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupオブジェクトは、広告グループ情報を保持します。</div> <div lang=\"en\">The Ad Group object is a container for storing ad group information.</div> ")

public class AdGroup   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupBiddingStrategy")
  private JsonNullable<AdGroupServiceBiddingStrategy> adGroupBiddingStrategy = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("bid")
  private JsonNullable<AdGroupServiceBid> bid = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("conversionOptimizer")
  private JsonNullable<AdGroupServiceConversionOptimizer> conversionOptimizer = JsonNullable.undefined();

  @JsonProperty("device")
  @Valid
  private JsonNullable<List<AdGroupServiceDeviceType>> device = JsonNullable.undefined();

  @JsonProperty("deviceApp")
  @Valid
  private JsonNullable<List<AdGroupServiceDeviceAppType>> deviceApp = JsonNullable.undefined();

  @JsonProperty("deviceOs")
  @Valid
  private JsonNullable<List<AdGroupServiceDeviceOsType>> deviceOs = JsonNullable.undefined();

  @JsonProperty("deviceOsVersion")
  private JsonNullable<String> deviceOsVersion = JsonNullable.undefined();

  @JsonProperty("dynamicImageExtensions")
  private JsonNullable<AdGroupServiceDynamicImageExtensions> dynamicImageExtensions = JsonNullable.undefined();

  @JsonProperty("feedSetId")
  private JsonNullable<Long> feedSetId = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<AdGroupServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("smartDeviceCarriers")
  @Valid
  private JsonNullable<List<AdGroupServiceSmartDeviceCarrier>> smartDeviceCarriers = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<AdGroupServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  public AdGroup accountId(Long accountId) {
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

  public AdGroup adGroupBiddingStrategy(AdGroupServiceBiddingStrategy adGroupBiddingStrategy) {
    this.adGroupBiddingStrategy = JsonNullable.of(adGroupBiddingStrategy);
    return this;
  }

  /**
   * Get adGroupBiddingStrategy
   * @return adGroupBiddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceBiddingStrategy> getAdGroupBiddingStrategy() {
    return adGroupBiddingStrategy;
  }

  public void setAdGroupBiddingStrategy(JsonNullable<AdGroupServiceBiddingStrategy> adGroupBiddingStrategy) {
    this.adGroupBiddingStrategy = adGroupBiddingStrategy;
  }

  public AdGroup adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroup adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroup bid(AdGroupServiceBid bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceBid> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<AdGroupServiceBid> bid) {
    this.bid = bid;
  }

  public AdGroup campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroup campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public AdGroup conversionOptimizer(AdGroupServiceConversionOptimizer conversionOptimizer) {
    this.conversionOptimizer = JsonNullable.of(conversionOptimizer);
    return this;
  }

  /**
   * Get conversionOptimizer
   * @return conversionOptimizer
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceConversionOptimizer> getConversionOptimizer() {
    return conversionOptimizer;
  }

  public void setConversionOptimizer(JsonNullable<AdGroupServiceConversionOptimizer> conversionOptimizer) {
    this.conversionOptimizer = conversionOptimizer;
  }

  public AdGroup device(List<AdGroupServiceDeviceType> device) {
    this.device = JsonNullable.of(device);
    return this;
  }

  public AdGroup addDeviceItem(AdGroupServiceDeviceType deviceItem) {
    if (this.device == null || !this.device.isPresent()) {
      this.device = JsonNullable.of(new ArrayList<>());
    }
    this.device.get().add(deviceItem);
    return this;
  }

  /**
   * Get device
   * @return device
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupServiceDeviceType>> getDevice() {
    return device;
  }

  public void setDevice(JsonNullable<List<AdGroupServiceDeviceType>> device) {
    this.device = device;
  }

  public AdGroup deviceApp(List<AdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = JsonNullable.of(deviceApp);
    return this;
  }

  public AdGroup addDeviceAppItem(AdGroupServiceDeviceAppType deviceAppItem) {
    if (this.deviceApp == null || !this.deviceApp.isPresent()) {
      this.deviceApp = JsonNullable.of(new ArrayList<>());
    }
    this.deviceApp.get().add(deviceAppItem);
    return this;
  }

  /**
   * Get deviceApp
   * @return deviceApp
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupServiceDeviceAppType>> getDeviceApp() {
    return deviceApp;
  }

  public void setDeviceApp(JsonNullable<List<AdGroupServiceDeviceAppType>> deviceApp) {
    this.deviceApp = deviceApp;
  }

  public AdGroup deviceOs(List<AdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = JsonNullable.of(deviceOs);
    return this;
  }

  public AdGroup addDeviceOsItem(AdGroupServiceDeviceOsType deviceOsItem) {
    if (this.deviceOs == null || !this.deviceOs.isPresent()) {
      this.deviceOs = JsonNullable.of(new ArrayList<>());
    }
    this.deviceOs.get().add(deviceOsItem);
    return this;
  }

  /**
   * Get deviceOs
   * @return deviceOs
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupServiceDeviceOsType>> getDeviceOs() {
    return deviceOs;
  }

  public void setDeviceOs(JsonNullable<List<AdGroupServiceDeviceOsType>> deviceOs) {
    this.deviceOs = deviceOs;
  }

  public AdGroup deviceOsVersion(String deviceOsVersion) {
    this.deviceOsVersion = JsonNullable.of(deviceOsVersion);
    return this;
  }

  /**
   * <div lang=\"ja\"> OSバージョンです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※設定を解除する場合は、NONEを設定してください。 </div> <div lang=\"en\"> OS version.<br> ∗To cancel the setting, specify &#34;NONE&#34;.<br> This field is optional in ADD and SET operation. </div> 
   * @return deviceOsVersion
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> OSバージョンです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※設定を解除する場合は、NONEを設定してください。 </div> <div lang=\"en\"> OS version.<br> ∗To cancel the setting, specify &#34;NONE&#34;.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getDeviceOsVersion() {
    return deviceOsVersion;
  }

  public void setDeviceOsVersion(JsonNullable<String> deviceOsVersion) {
    this.deviceOsVersion = deviceOsVersion;
  }

  public AdGroup dynamicImageExtensions(AdGroupServiceDynamicImageExtensions dynamicImageExtensions) {
    this.dynamicImageExtensions = JsonNullable.of(dynamicImageExtensions);
    return this;
  }

  /**
   * Get dynamicImageExtensions
   * @return dynamicImageExtensions
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceDynamicImageExtensions> getDynamicImageExtensions() {
    return dynamicImageExtensions;
  }

  public void setDynamicImageExtensions(JsonNullable<AdGroupServiceDynamicImageExtensions> dynamicImageExtensions) {
    this.dynamicImageExtensions = dynamicImageExtensions;
  }

  public AdGroup feedSetId(Long feedSetId) {
    this.feedSetId = JsonNullable.of(feedSetId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セットIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 </div> <div lang=\"en\"> Feed set ID.<br> This field is optional in ADD and SET operation.<br> * If feedSetId is not specified in ADD operation, the default set is associated automatically. </div> 
   * @return feedSetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> *ADD時に未指定の場合、デフォルトセットを自動で関連付けます。 </div> <div lang=\"en\"> Feed set ID.<br> This field is optional in ADD and SET operation.<br> * If feedSetId is not specified in ADD operation, the default set is associated automatically. </div> ")


  public JsonNullable<Long> getFeedSetId() {
    return feedSetId;
  }

  public void setFeedSetId(JsonNullable<Long> feedSetId) {
    this.feedSetId = feedSetId;
  }

  public AdGroup labels(List<AdGroupServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public AdGroup addLabelsItem(AdGroupServiceLabel labelsItem) {
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

  public JsonNullable<List<AdGroupServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<AdGroupServiceLabel>> labels) {
    this.labels = labels;
  }

  public AdGroup smartDeviceCarriers(List<AdGroupServiceSmartDeviceCarrier> smartDeviceCarriers) {
    this.smartDeviceCarriers = JsonNullable.of(smartDeviceCarriers);
    return this;
  }

  public AdGroup addSmartDeviceCarriersItem(AdGroupServiceSmartDeviceCarrier smartDeviceCarriersItem) {
    if (this.smartDeviceCarriers == null || !this.smartDeviceCarriers.isPresent()) {
      this.smartDeviceCarriers = JsonNullable.of(new ArrayList<>());
    }
    this.smartDeviceCarriers.get().add(smartDeviceCarriersItem);
    return this;
  }

  /**
   * Get smartDeviceCarriers
   * @return smartDeviceCarriers
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupServiceSmartDeviceCarrier>> getSmartDeviceCarriers() {
    return smartDeviceCarriers;
  }

  public void setSmartDeviceCarriers(JsonNullable<List<AdGroupServiceSmartDeviceCarrier>> smartDeviceCarriers) {
    this.smartDeviceCarriers = smartDeviceCarriers;
  }

  public AdGroup userStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<AdGroupServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroup createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<String> createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

