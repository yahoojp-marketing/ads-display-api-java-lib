package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupServiceDeviceAppType;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupServiceLabel;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupオブジェクトは、予約型の広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Guaranteed Ad Group object is a container for storing ad group information of guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupオブジェクトは、予約型の広告グループ情報を保持します。</div> <div lang=\"en\">The Guaranteed Ad Group object is a container for storing ad group information of guaranteed campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroup   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("device")
  @Valid
  private List<GuaranteedAdGroupServiceDeviceType> device = null;

  @JsonProperty("deviceApp")
  @Valid
  private List<GuaranteedAdGroupServiceDeviceAppType> deviceApp = null;

  @JsonProperty("deviceOs")
  @Valid
  private List<GuaranteedAdGroupServiceDeviceOsType> deviceOs = null;

  @JsonProperty("labels")
  @Valid
  private List<GuaranteedAdGroupServiceLabel> labels = null;

  @JsonProperty("userStatus")
  private GuaranteedAdGroupServiceUserStatus userStatus = null;

  @JsonProperty("adGroupTargets")
  @Valid
  private List<AdGroupTarget> adGroupTargets = null;

  @JsonProperty("isCreativeProfile")
  private Boolean isCreativeProfile = null;

  public GuaranteedAdGroup accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public GuaranteedAdGroup adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public GuaranteedAdGroup adGroupName(String adGroupName) {
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

  public GuaranteedAdGroup campaignId(Long campaignId) {
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

  public GuaranteedAdGroup campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *ADD時、このフィールドは返却されません。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.<br> *This field will not be returned in ADD operation. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> *ADD時、このフィールドは返却されません。 </div> <div lang=\"en\"> Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.<br> *This field will not be returned in ADD operation. </div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public GuaranteedAdGroup device(List<GuaranteedAdGroupServiceDeviceType> device) {
    this.device = device;
    return this;
  }

  public GuaranteedAdGroup addDeviceItem(GuaranteedAdGroupServiceDeviceType deviceItem) {
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

  public List<GuaranteedAdGroupServiceDeviceType> getDevice() {
    return device;
  }

  public void setDevice(List<GuaranteedAdGroupServiceDeviceType> device) {
    this.device = device;
  }

  public GuaranteedAdGroup deviceApp(List<GuaranteedAdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = deviceApp;
    return this;
  }

  public GuaranteedAdGroup addDeviceAppItem(GuaranteedAdGroupServiceDeviceAppType deviceAppItem) {
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

  public List<GuaranteedAdGroupServiceDeviceAppType> getDeviceApp() {
    return deviceApp;
  }

  public void setDeviceApp(List<GuaranteedAdGroupServiceDeviceAppType> deviceApp) {
    this.deviceApp = deviceApp;
  }

  public GuaranteedAdGroup deviceOs(List<GuaranteedAdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = deviceOs;
    return this;
  }

  public GuaranteedAdGroup addDeviceOsItem(GuaranteedAdGroupServiceDeviceOsType deviceOsItem) {
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

  public List<GuaranteedAdGroupServiceDeviceOsType> getDeviceOs() {
    return deviceOs;
  }

  public void setDeviceOs(List<GuaranteedAdGroupServiceDeviceOsType> deviceOs) {
    this.deviceOs = deviceOs;
  }

  public GuaranteedAdGroup labels(List<GuaranteedAdGroupServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public GuaranteedAdGroup addLabelsItem(GuaranteedAdGroupServiceLabel labelsItem) {
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

  public List<GuaranteedAdGroupServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<GuaranteedAdGroupServiceLabel> labels) {
    this.labels = labels;
  }

  public GuaranteedAdGroup userStatus(GuaranteedAdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(GuaranteedAdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public GuaranteedAdGroup adGroupTargets(List<AdGroupTarget> adGroupTargets) {
    this.adGroupTargets = adGroupTargets;
    return this;
  }

  public GuaranteedAdGroup addAdGroupTargetsItem(AdGroupTarget adGroupTargetsItem) {
    if (this.adGroupTargets == null) {
      this.adGroupTargets = new ArrayList<>();
    }
    this.adGroupTargets.add(adGroupTargetsItem);
    return this;
  }

  /**
   * Get adGroupTargets
   * @return adGroupTargets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupTarget> getAdGroupTargets() {
    return adGroupTargets;
  }

  public void setAdGroupTargets(List<AdGroupTarget> adGroupTargets) {
    this.adGroupTargets = adGroupTargets;
  }

  public GuaranteedAdGroup isCreativeProfile(Boolean isCreativeProfile) {
    this.isCreativeProfile = isCreativeProfile;
    return this;
  }

  /**
   * <div lang=\"ja\"> trueの場合、クリエイティブプロファイルで追加された広告グループであることを示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> If the value of this field is true, it indicates that the ad group was added using a creative profile.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return isCreativeProfile
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> trueの場合、クリエイティブプロファイルで追加された広告グループであることを示します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> If the value of this field is true, it indicates that the ad group was added using a creative profile.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Boolean getIsCreativeProfile() {
    return isCreativeProfile;
  }

  public void setIsCreativeProfile(Boolean isCreativeProfile) {
    this.isCreativeProfile = isCreativeProfile;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

