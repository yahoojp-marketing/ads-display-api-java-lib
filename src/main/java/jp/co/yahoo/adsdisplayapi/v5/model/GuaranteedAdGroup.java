package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupServiceDeviceAppType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupServiceLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedAdGroupServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupオブジェクトは、予約型の広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Guaranteed Ad Group object is a container for storing ad group information of guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupオブジェクトは、予約型の広告グループ情報を保持します。</div> <div lang=\"en\">The Guaranteed Ad Group object is a container for storing ad group information of guaranteed campaign.</div> ")

public class GuaranteedAdGroup   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("device")
  @Valid
  private JsonNullable<List<GuaranteedAdGroupServiceDeviceType>> device = JsonNullable.undefined();

  @JsonProperty("deviceApp")
  @Valid
  private JsonNullable<List<GuaranteedAdGroupServiceDeviceAppType>> deviceApp = JsonNullable.undefined();

  @JsonProperty("deviceOs")
  @Valid
  private JsonNullable<List<GuaranteedAdGroupServiceDeviceOsType>> deviceOs = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<GuaranteedAdGroupServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<GuaranteedAdGroupServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("adGroupTargets")
  @Valid
  private JsonNullable<List<AdGroupTarget>> adGroupTargets = JsonNullable.undefined();

  @JsonProperty("isCreativeProfile")
  private JsonNullable<Boolean> isCreativeProfile = JsonNullable.undefined();

  public GuaranteedAdGroup accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public GuaranteedAdGroup adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public GuaranteedAdGroup adGroupName(String adGroupName) {
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

  public GuaranteedAdGroup campaignId(Long campaignId) {
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

  public GuaranteedAdGroup campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *ADD時、このフィールドは返却されません。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.<br> *This field will not be returned in ADD operation. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *ADD時、このフィールドは返却されません。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.<br> *This field will not be returned in ADD operation. </div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public GuaranteedAdGroup device(List<GuaranteedAdGroupServiceDeviceType> device) {
    this.device = JsonNullable.of(device);
    return this;
  }

  public GuaranteedAdGroup addDeviceItem(GuaranteedAdGroupServiceDeviceType deviceItem) {
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

  public JsonNullable<List<GuaranteedAdGroupServiceDeviceType>> getDevice() {
    return device;
  }

  public void setDevice(JsonNullable<List<GuaranteedAdGroupServiceDeviceType>> device) {
    this.device = device;
  }

  public GuaranteedAdGroup deviceApp(List<GuaranteedAdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = JsonNullable.of(deviceApp);
    return this;
  }

  public GuaranteedAdGroup addDeviceAppItem(GuaranteedAdGroupServiceDeviceAppType deviceAppItem) {
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

  public JsonNullable<List<GuaranteedAdGroupServiceDeviceAppType>> getDeviceApp() {
    return deviceApp;
  }

  public void setDeviceApp(JsonNullable<List<GuaranteedAdGroupServiceDeviceAppType>> deviceApp) {
    this.deviceApp = deviceApp;
  }

  public GuaranteedAdGroup deviceOs(List<GuaranteedAdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = JsonNullable.of(deviceOs);
    return this;
  }

  public GuaranteedAdGroup addDeviceOsItem(GuaranteedAdGroupServiceDeviceOsType deviceOsItem) {
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

  public JsonNullable<List<GuaranteedAdGroupServiceDeviceOsType>> getDeviceOs() {
    return deviceOs;
  }

  public void setDeviceOs(JsonNullable<List<GuaranteedAdGroupServiceDeviceOsType>> deviceOs) {
    this.deviceOs = deviceOs;
  }

  public GuaranteedAdGroup labels(List<GuaranteedAdGroupServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public GuaranteedAdGroup addLabelsItem(GuaranteedAdGroupServiceLabel labelsItem) {
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

  public JsonNullable<List<GuaranteedAdGroupServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<GuaranteedAdGroupServiceLabel>> labels) {
    this.labels = labels;
  }

  public GuaranteedAdGroup userStatus(GuaranteedAdGroupServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<GuaranteedAdGroupServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<GuaranteedAdGroupServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public GuaranteedAdGroup adGroupTargets(List<AdGroupTarget> adGroupTargets) {
    this.adGroupTargets = JsonNullable.of(adGroupTargets);
    return this;
  }

  public GuaranteedAdGroup addAdGroupTargetsItem(AdGroupTarget adGroupTargetsItem) {
    if (this.adGroupTargets == null || !this.adGroupTargets.isPresent()) {
      this.adGroupTargets = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupTargets.get().add(adGroupTargetsItem);
    return this;
  }

  /**
   * Get adGroupTargets
   * @return adGroupTargets
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupTarget>> getAdGroupTargets() {
    return adGroupTargets;
  }

  public void setAdGroupTargets(JsonNullable<List<AdGroupTarget>> adGroupTargets) {
    this.adGroupTargets = adGroupTargets;
  }

  public GuaranteedAdGroup isCreativeProfile(Boolean isCreativeProfile) {
    this.isCreativeProfile = JsonNullable.of(isCreativeProfile);
    return this;
  }

  /**
   * <div lang=\"ja\"> trueの場合、クリエイティブプロファイルで追加された広告グループであることを示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> If the value of this field is true, it indicates that the ad group was added using a creative profile.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return isCreativeProfile
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> trueの場合、クリエイティブプロファイルで追加された広告グループであることを示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> If the value of this field is true, it indicates that the ad group was added using a creative profile.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Boolean> getIsCreativeProfile() {
    return isCreativeProfile;
  }

  public void setIsCreativeProfile(JsonNullable<Boolean> isCreativeProfile) {
    this.isCreativeProfile = isCreativeProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroup guaranteedAdGroup = (GuaranteedAdGroup) o;
    return Objects.equals(this.accountId, guaranteedAdGroup.accountId) &&
        Objects.equals(this.adGroupId, guaranteedAdGroup.adGroupId) &&
        Objects.equals(this.adGroupName, guaranteedAdGroup.adGroupName) &&
        Objects.equals(this.campaignId, guaranteedAdGroup.campaignId) &&
        Objects.equals(this.campaignName, guaranteedAdGroup.campaignName) &&
        Objects.equals(this.device, guaranteedAdGroup.device) &&
        Objects.equals(this.deviceApp, guaranteedAdGroup.deviceApp) &&
        Objects.equals(this.deviceOs, guaranteedAdGroup.deviceOs) &&
        Objects.equals(this.labels, guaranteedAdGroup.labels) &&
        Objects.equals(this.userStatus, guaranteedAdGroup.userStatus) &&
        Objects.equals(this.adGroupTargets, guaranteedAdGroup.adGroupTargets) &&
        Objects.equals(this.isCreativeProfile, guaranteedAdGroup.isCreativeProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupName, campaignId, campaignName, device, deviceApp, deviceOs, labels, userStatus, adGroupTargets, isCreativeProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroup {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceApp: ").append(toIndentedString(deviceApp)).append("\n");
    sb.append("    deviceOs: ").append(toIndentedString(deviceOs)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    adGroupTargets: ").append(toIndentedString(adGroupTargets)).append("\n");
    sb.append("    isCreativeProfile: ").append(toIndentedString(isCreativeProfile)).append("\n");
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

