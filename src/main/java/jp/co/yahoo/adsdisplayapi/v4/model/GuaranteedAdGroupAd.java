package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdLandingPageStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceAd;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceAdStyle;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceLabel;
import jp.co.yahoo.adsdisplayapi.v4.model.GuaranteedAdGroupAdServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedAdGroupAdオブジェクトは、予約型の広告の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The GuaranteedAdGroupAd object is a container for storing ad information of guaranteed campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedAdGroupAdオブジェクトは、予約型の広告の情報を格納するコンテナです。</div> <div lang=\"en\">The GuaranteedAdGroupAd object is a container for storing ad information of guaranteed campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedAdGroupAd   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("ad")
  private GuaranteedAdGroupAdServiceAd ad = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("adId")
  private Long adId = null;

  @JsonProperty("adName")
  private String adName = null;

  @JsonProperty("adStyle")
  private GuaranteedAdGroupAdServiceAdStyle adStyle = null;

  @JsonProperty("approvalStatus")
  private GuaranteedAdGroupAdServiceApprovalStatus approvalStatus = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("disapprovalReasonDescription")
  private String disapprovalReasonDescription = null;

  @JsonProperty("impressionBeaconUrls")
  @Valid
  private List<String> impressionBeaconUrls = null;

  @JsonProperty("isRemoveImpressionBeaconUrls")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls = null;

  @JsonProperty("labels")
  @Valid
  private List<GuaranteedAdGroupAdServiceLabel> labels = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("thirdPartyTrackingScriptUrl")
  private String thirdPartyTrackingScriptUrl = null;

  @JsonProperty("isRemoveBeaconUrls")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls = null;

  @JsonProperty("isRemoveThirdPartyTrackingScriptUrl")
  private GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl = null;

  @JsonProperty("thirdPartyTrackingVendor")
  private String thirdPartyTrackingVendor = null;

  @JsonProperty("userStatus")
  private GuaranteedAdGroupAdServiceUserStatus userStatus = null;

  @JsonProperty("landingPageStatus")
  private GuaranteedAdGroupAdLandingPageStatus landingPageStatus = null;

  @JsonProperty("preApprovalId")
  private String preApprovalId = null;

  @JsonProperty("landingPageUpdateScheduledTime")
  private String landingPageUpdateScheduledTime = null;

  public GuaranteedAdGroupAd accountId(Long accountId) {
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

  public GuaranteedAdGroupAd ad(GuaranteedAdGroupAdServiceAd ad) {
    this.ad = ad;
    return this;
  }

  /**
   * Get ad
   * @return ad
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceAd getAd() {
    return ad;
  }

  public void setAd(GuaranteedAdGroupAdServiceAd ad) {
    this.ad = ad;
  }

  public GuaranteedAdGroupAd adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests. </div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public GuaranteedAdGroupAd adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public GuaranteedAdGroupAd adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告IDです。<br> このフィールドは、SET時は必須となり、ADD時は省略可能となります。 </div> <div lang=\"en\"> Ad ID.<br> This field is required in SET operation, and will be optional in ADD operation. </div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告IDです。<br> このフィールドは、SET時は必須となり、ADD時は省略可能となります。 </div> <div lang=\"en\"> Ad ID.<br> This field is required in SET operation, and will be optional in ADD operation. </div> ")


  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  public GuaranteedAdGroupAd adName(String adName) {
    this.adName = adName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public GuaranteedAdGroupAd adStyle(GuaranteedAdGroupAdServiceAdStyle adStyle) {
    this.adStyle = adStyle;
    return this;
  }

  /**
   * Get adStyle
   * @return adStyle
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceAdStyle getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(GuaranteedAdGroupAdServiceAdStyle adStyle) {
    this.adStyle = adStyle;
  }

  public GuaranteedAdGroupAd approvalStatus(GuaranteedAdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(GuaranteedAdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public GuaranteedAdGroupAd campaignId(Long campaignId) {
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

  public GuaranteedAdGroupAd campaignName(String campaignName) {
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

  public GuaranteedAdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public GuaranteedAdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public GuaranteedAdGroupAd disapprovalReasonDescription(String disapprovalReasonDescription) {
    this.disapprovalReasonDescription = disapprovalReasonDescription;
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason details on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason details on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getDisapprovalReasonDescription() {
    return disapprovalReasonDescription;
  }

  public void setDisapprovalReasonDescription(String disapprovalReasonDescription) {
    this.disapprovalReasonDescription = disapprovalReasonDescription;
  }

  public GuaranteedAdGroupAd impressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
    return this;
  }

  public GuaranteedAdGroupAd addImpressionBeaconUrlsItem(String impressionBeaconUrlsItem) {
    if (this.impressionBeaconUrls == null) {
      this.impressionBeaconUrls = new ArrayList<>();
    }
    this.impressionBeaconUrls.add(impressionBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> インプレッションビーコンURLです。<br> </div> <div lang=\"en\"> Impression beacon URL.<br> </div> 
   * @return impressionBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> インプレッションビーコンURLです。<br> </div> <div lang=\"en\"> Impression beacon URL.<br> </div> ")


  public List<String> getImpressionBeaconUrls() {
    return impressionBeaconUrls;
  }

  public void setImpressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
  }

  public GuaranteedAdGroupAd isRemoveImpressionBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls) {
    this.isRemoveImpressionBeaconUrls = isRemoveImpressionBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveImpressionBeaconUrls
   * @return isRemoveImpressionBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveImpressionBeaconUrls() {
    return isRemoveImpressionBeaconUrls;
  }

  public void setIsRemoveImpressionBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls) {
    this.isRemoveImpressionBeaconUrls = isRemoveImpressionBeaconUrls;
  }

  public GuaranteedAdGroupAd labels(List<GuaranteedAdGroupAdServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public GuaranteedAdGroupAd addLabelsItem(GuaranteedAdGroupAdServiceLabel labelsItem) {
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

  public List<GuaranteedAdGroupAdServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<GuaranteedAdGroupAdServiceLabel> labels) {
    this.labels = labels;
  }

  public GuaranteedAdGroupAd mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> </div> <div lang=\"en\"> Media ID.<br> </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> </div> <div lang=\"en\"> Media ID.<br> </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public GuaranteedAdGroupAd thirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 第三者計測スクリプトURLです。<br> </div> <div lang=\"en\"> Third party tracking script URL.<br> </div> 
   * @return thirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測スクリプトURLです。<br> </div> <div lang=\"en\"> Third party tracking script URL.<br> </div> ")


  public String getThirdPartyTrackingScriptUrl() {
    return thirdPartyTrackingScriptUrl;
  }

  public void setThirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
  }

  public GuaranteedAdGroupAd isRemoveBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls) {
    this.isRemoveBeaconUrls = isRemoveBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveBeaconUrls
   * @return isRemoveBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveBeaconUrls() {
    return isRemoveBeaconUrls;
  }

  public void setIsRemoveBeaconUrls(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls) {
    this.isRemoveBeaconUrls = isRemoveBeaconUrls;
  }

  public GuaranteedAdGroupAd isRemoveThirdPartyTrackingScriptUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
    return this;
  }

  /**
   * Get isRemoveThirdPartyTrackingScriptUrl
   * @return isRemoveThirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceIsRemoveFlg getIsRemoveThirdPartyTrackingScriptUrl() {
    return isRemoveThirdPartyTrackingScriptUrl;
  }

  public void setIsRemoveThirdPartyTrackingScriptUrl(GuaranteedAdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
  }

  public GuaranteedAdGroupAd thirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
    return this;
  }

  /**
   * <div lang=\"ja\"> 第三者計測ベンダー（ReadOnly）です。<br> thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Third party tracking vendor (Read only).<br> Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return thirdPartyTrackingVendor
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測ベンダー（ReadOnly）です。<br> thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Third party tracking vendor (Read only).<br> Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getThirdPartyTrackingVendor() {
    return thirdPartyTrackingVendor;
  }

  public void setThirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
  }

  public GuaranteedAdGroupAd userStatus(GuaranteedAdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(GuaranteedAdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public GuaranteedAdGroupAd landingPageStatus(GuaranteedAdGroupAdLandingPageStatus landingPageStatus) {
    this.landingPageStatus = landingPageStatus;
    return this;
  }

  /**
   * Get landingPageStatus
   * @return landingPageStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedAdGroupAdLandingPageStatus getLandingPageStatus() {
    return landingPageStatus;
  }

  public void setLandingPageStatus(GuaranteedAdGroupAdLandingPageStatus landingPageStatus) {
    this.landingPageStatus = landingPageStatus;
  }

  public GuaranteedAdGroupAd preApprovalId(String preApprovalId) {
    this.preApprovalId = preApprovalId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 事前承認ID（数字のみ）です。<br> </div> <div lang=\"en\"> Pre-approval ID (Only number).<br> </div> 
   * @return preApprovalId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 事前承認ID（数字のみ）です。<br> </div> <div lang=\"en\"> Pre-approval ID (Only number).<br> </div> ")


  public String getPreApprovalId() {
    return preApprovalId;
  }

  public void setPreApprovalId(String preApprovalId) {
    this.preApprovalId = preApprovalId;
  }

  public GuaranteedAdGroupAd landingPageUpdateScheduledTime(String landingPageUpdateScheduledTime) {
    this.landingPageUpdateScheduledTime = landingPageUpdateScheduledTime;
    return this;
  }

  /**
   * <div lang=\"ja\"> リンク先更新予定日時です。<br> ※フォーマット：yyyyMMddHHmm<br> ※landingPageStatusがSPECIFIED_UPDATE_SCHEDULED_TIMEの場合は必須です。 </div> <div lang=\"en\"> The scheduled update date and time for the landing page.<br> *format: yyyyMMddHHmm<br> ∗If landingPageStatus is SPECIFIED_UPDATE_SCHEDULED_TIME, this field is required. </div> 
   * @return landingPageUpdateScheduledTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> リンク先更新予定日時です。<br> ※フォーマット：yyyyMMddHHmm<br> ※landingPageStatusがSPECIFIED_UPDATE_SCHEDULED_TIMEの場合は必須です。 </div> <div lang=\"en\"> The scheduled update date and time for the landing page.<br> *format: yyyyMMddHHmm<br> ∗If landingPageStatus is SPECIFIED_UPDATE_SCHEDULED_TIME, this field is required. </div> ")


  public String getLandingPageUpdateScheduledTime() {
    return landingPageUpdateScheduledTime;
  }

  public void setLandingPageUpdateScheduledTime(String landingPageUpdateScheduledTime) {
    this.landingPageUpdateScheduledTime = landingPageUpdateScheduledTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedAdGroupAd guaranteedAdGroupAd = (GuaranteedAdGroupAd) o;
    return Objects.equals(this.accountId, guaranteedAdGroupAd.accountId) &&
        Objects.equals(this.ad, guaranteedAdGroupAd.ad) &&
        Objects.equals(this.adGroupId, guaranteedAdGroupAd.adGroupId) &&
        Objects.equals(this.adGroupName, guaranteedAdGroupAd.adGroupName) &&
        Objects.equals(this.adId, guaranteedAdGroupAd.adId) &&
        Objects.equals(this.adName, guaranteedAdGroupAd.adName) &&
        Objects.equals(this.adStyle, guaranteedAdGroupAd.adStyle) &&
        Objects.equals(this.approvalStatus, guaranteedAdGroupAd.approvalStatus) &&
        Objects.equals(this.campaignId, guaranteedAdGroupAd.campaignId) &&
        Objects.equals(this.campaignName, guaranteedAdGroupAd.campaignName) &&
        Objects.equals(this.disapprovalReasonCodes, guaranteedAdGroupAd.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonDescription, guaranteedAdGroupAd.disapprovalReasonDescription) &&
        Objects.equals(this.impressionBeaconUrls, guaranteedAdGroupAd.impressionBeaconUrls) &&
        Objects.equals(this.isRemoveImpressionBeaconUrls, guaranteedAdGroupAd.isRemoveImpressionBeaconUrls) &&
        Objects.equals(this.labels, guaranteedAdGroupAd.labels) &&
        Objects.equals(this.mediaId, guaranteedAdGroupAd.mediaId) &&
        Objects.equals(this.thirdPartyTrackingScriptUrl, guaranteedAdGroupAd.thirdPartyTrackingScriptUrl) &&
        Objects.equals(this.isRemoveBeaconUrls, guaranteedAdGroupAd.isRemoveBeaconUrls) &&
        Objects.equals(this.isRemoveThirdPartyTrackingScriptUrl, guaranteedAdGroupAd.isRemoveThirdPartyTrackingScriptUrl) &&
        Objects.equals(this.thirdPartyTrackingVendor, guaranteedAdGroupAd.thirdPartyTrackingVendor) &&
        Objects.equals(this.userStatus, guaranteedAdGroupAd.userStatus) &&
        Objects.equals(this.landingPageStatus, guaranteedAdGroupAd.landingPageStatus) &&
        Objects.equals(this.preApprovalId, guaranteedAdGroupAd.preApprovalId) &&
        Objects.equals(this.landingPageUpdateScheduledTime, guaranteedAdGroupAd.landingPageUpdateScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adId, adName, adStyle, approvalStatus, campaignId, campaignName, disapprovalReasonCodes, disapprovalReasonDescription, impressionBeaconUrls, isRemoveImpressionBeaconUrls, labels, mediaId, thirdPartyTrackingScriptUrl, isRemoveBeaconUrls, isRemoveThirdPartyTrackingScriptUrl, thirdPartyTrackingVendor, userStatus, landingPageStatus, preApprovalId, landingPageUpdateScheduledTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedAdGroupAd {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adStyle: ").append(toIndentedString(adStyle)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonDescription: ").append(toIndentedString(disapprovalReasonDescription)).append("\n");
    sb.append("    impressionBeaconUrls: ").append(toIndentedString(impressionBeaconUrls)).append("\n");
    sb.append("    isRemoveImpressionBeaconUrls: ").append(toIndentedString(isRemoveImpressionBeaconUrls)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thirdPartyTrackingScriptUrl: ").append(toIndentedString(thirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    isRemoveBeaconUrls: ").append(toIndentedString(isRemoveBeaconUrls)).append("\n");
    sb.append("    isRemoveThirdPartyTrackingScriptUrl: ").append(toIndentedString(isRemoveThirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    thirdPartyTrackingVendor: ").append(toIndentedString(thirdPartyTrackingVendor)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    landingPageStatus: ").append(toIndentedString(landingPageStatus)).append("\n");
    sb.append("    preApprovalId: ").append(toIndentedString(preApprovalId)).append("\n");
    sb.append("    landingPageUpdateScheduledTime: ").append(toIndentedString(landingPageUpdateScheduledTime)).append("\n");
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

