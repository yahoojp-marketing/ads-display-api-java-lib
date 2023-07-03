/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupTarget;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupServiceDeviceAppType;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupServiceDeviceOsType;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupServiceDeviceType;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupServiceLabel;
import jp.co.yahoo.adsdisplayapi.v9.model.GuaranteedAdGroupServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupオブジェクトは、予約型の広告グループ情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The Guaranteed Ad Group object is a container for storing ad group information of guaranteed campaign.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedAdGroup.JSON_PROPERTY_ACCOUNT_ID,
  GuaranteedAdGroup.JSON_PROPERTY_AD_GROUP_ID,
  GuaranteedAdGroup.JSON_PROPERTY_AD_GROUP_NAME,
  GuaranteedAdGroup.JSON_PROPERTY_CAMPAIGN_ID,
  GuaranteedAdGroup.JSON_PROPERTY_CAMPAIGN_NAME,
  GuaranteedAdGroup.JSON_PROPERTY_DEVICE,
  GuaranteedAdGroup.JSON_PROPERTY_DEVICE_APP,
  GuaranteedAdGroup.JSON_PROPERTY_DEVICE_OS,
  GuaranteedAdGroup.JSON_PROPERTY_LABELS,
  GuaranteedAdGroup.JSON_PROPERTY_USER_STATUS,
  GuaranteedAdGroup.JSON_PROPERTY_AD_GROUP_TARGETS,
  GuaranteedAdGroup.JSON_PROPERTY_IS_CREATIVE_PROFILE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedAdGroup {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private List<GuaranteedAdGroupServiceDeviceType> device;

  public static final String JSON_PROPERTY_DEVICE_APP = "deviceApp";
  private List<GuaranteedAdGroupServiceDeviceAppType> deviceApp;

  public static final String JSON_PROPERTY_DEVICE_OS = "deviceOs";
  private List<GuaranteedAdGroupServiceDeviceOsType> deviceOs;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<GuaranteedAdGroupServiceLabel> labels;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private GuaranteedAdGroupServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_AD_GROUP_TARGETS = "adGroupTargets";
  private List<AdGroupTarget> adGroupTargets;

  public static final String JSON_PROPERTY_IS_CREATIVE_PROFILE = "isCreativeProfile";
  private Boolean isCreativeProfile;

  public GuaranteedAdGroup() {
  }

  public GuaranteedAdGroup accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public GuaranteedAdGroup adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return adGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public GuaranteedAdGroup adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return adGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public GuaranteedAdGroup campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public GuaranteedAdGroup campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; *ADD時、このフィールドは返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; *This field will not be returned in ADD operation. &lt;/div&gt; 
   * @return campaignName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupServiceDeviceType> getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupServiceDeviceAppType> getDeviceApp() {
    return deviceApp;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupServiceDeviceOsType> getDeviceOs() {
    return deviceOs;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedAdGroupServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedAdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupTarget> getAdGroupTargets() {
    return adGroupTargets;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupTargets(List<AdGroupTarget> adGroupTargets) {
    this.adGroupTargets = adGroupTargets;
  }


  public GuaranteedAdGroup isCreativeProfile(Boolean isCreativeProfile) {
    
    this.isCreativeProfile = isCreativeProfile;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; trueの場合、クリエイティブプロファイルで追加された広告グループであることを示します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; If the value of this field is true, it indicates that the ad group was added using a creative profile.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return isCreativeProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CREATIVE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCreativeProfile() {
    return isCreativeProfile;
  }


  @JsonProperty(JSON_PROPERTY_IS_CREATIVE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

