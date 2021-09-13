package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceAd;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceAdStyle;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceBid;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceLabel;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupAd object is a container for storing ad information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。</div> <div lang=\"en\">The AdGroupAd object is a container for storing ad information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAd   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("ad")
  private AdGroupAdServiceAd ad = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("adId")
  private Long adId = null;

  @JsonProperty("adName")
  private String adName = null;

  @JsonProperty("adStyle")
  private AdGroupAdServiceAdStyle adStyle = null;

  @JsonProperty("approvalStatus")
  private AdGroupAdServiceApprovalStatus approvalStatus = null;

  @JsonProperty("bid")
  private AdGroupAdServiceBid bid = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("impressionBeaconUrls")
  @Valid
  private List<String> impressionBeaconUrls = null;

  @JsonProperty("isRemoveBeaconUrls")
  private AdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls = null;

  @JsonProperty("isRemoveThirdPartyTrackingScriptUrl")
  private AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl = null;

  @JsonProperty("labels")
  @Valid
  private List<AdGroupAdServiceLabel> labels = null;

  @JsonProperty("mediaId")
  private Long mediaId = null;

  @JsonProperty("thirdPartyTrackingScriptUrl")
  private String thirdPartyTrackingScriptUrl = null;

  @JsonProperty("thirdPartyTrackingVendor")
  private String thirdPartyTrackingVendor = null;

  @JsonProperty("userStatus")
  private AdGroupAdServiceUserStatus userStatus = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public AdGroupAd accountId(Long accountId) {
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

  public AdGroupAd ad(AdGroupAdServiceAd ad) {
    this.ad = ad;
    return this;
  }

  /**
   * Get ad
   * @return ad
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAd getAd() {
    return ad;
  }

  public void setAd(AdGroupAdServiceAd ad) {
    this.ad = ad;
  }

  public AdGroupAd adGroupId(Long adGroupId) {
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

  public AdGroupAd adGroupName(String adGroupName) {
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

  public AdGroupAd adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告IDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Ad ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告IDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Ad ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")


  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  public AdGroupAd adName(String adName) {
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

  public AdGroupAd adStyle(AdGroupAdServiceAdStyle adStyle) {
    this.adStyle = adStyle;
    return this;
  }

  /**
   * Get adStyle
   * @return adStyle
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAdStyle getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(AdGroupAdServiceAdStyle adStyle) {
    this.adStyle = adStyle;
  }

  public AdGroupAd approvalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupAd bid(AdGroupAdServiceBid bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceBid getBid() {
    return bid;
  }

  public void setBid(AdGroupAdServiceBid bid) {
    this.bid = bid;
  }

  public AdGroupAd campaignId(Long campaignId) {
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

  public AdGroupAd campaignName(String campaignName) {
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

  public AdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
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

  public AdGroupAd impressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
    return this;
  }

  public AdGroupAd addImpressionBeaconUrlsItem(String impressionBeaconUrlsItem) {
    if (this.impressionBeaconUrls == null) {
      this.impressionBeaconUrls = new ArrayList<>();
    }
    this.impressionBeaconUrls.add(impressionBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> インプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Impression beacon URL.<br> This field is optional in ADD and SET operation. </div> 
   * @return impressionBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> インプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Impression beacon URL.<br> This field is optional in ADD and SET operation. </div> ")


  public List<String> getImpressionBeaconUrls() {
    return impressionBeaconUrls;
  }

  public void setImpressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
  }

  public AdGroupAd isRemoveBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls) {
    this.isRemoveBeaconUrls = isRemoveBeaconUrls;
    return this;
  }

  /**
   * Get isRemoveBeaconUrls
   * @return isRemoveBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveBeaconUrls() {
    return isRemoveBeaconUrls;
  }

  public void setIsRemoveBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveBeaconUrls) {
    this.isRemoveBeaconUrls = isRemoveBeaconUrls;
  }

  public AdGroupAd isRemoveThirdPartyTrackingScriptUrl(AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
    return this;
  }

  /**
   * Get isRemoveThirdPartyTrackingScriptUrl
   * @return isRemoveThirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceIsRemoveFlg getIsRemoveThirdPartyTrackingScriptUrl() {
    return isRemoveThirdPartyTrackingScriptUrl;
  }

  public void setIsRemoveThirdPartyTrackingScriptUrl(AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
  }

  public AdGroupAd labels(List<AdGroupAdServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public AdGroupAd addLabelsItem(AdGroupAdServiceLabel labelsItem) {
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

  public List<AdGroupAdServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<AdGroupAdServiceLabel> labels) {
    this.labels = labels;
  }

  public AdGroupAd mediaId(Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in ADD and SET operation. </div> ")


  public Long getMediaId() {
    return mediaId;
  }

  public void setMediaId(Long mediaId) {
    this.mediaId = mediaId;
  }

  public AdGroupAd thirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
    return this;
  }

  /**
   * <div lang=\"ja\"> 第三者計測スクリプトURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Third party tracking script URL.<br> This field is optional in ADD and SET operation. </div> 
   * @return thirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測スクリプトURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Third party tracking script URL.<br> This field is optional in ADD and SET operation. </div> ")


  public String getThirdPartyTrackingScriptUrl() {
    return thirdPartyTrackingScriptUrl;
  }

  public void setThirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
  }

  public AdGroupAd thirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
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

  public AdGroupAd userStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroupAd createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * <div lang=\"ja\">広告が作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告が作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> ")


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
    AdGroupAd adGroupAd = (AdGroupAd) o;
    return Objects.equals(this.accountId, adGroupAd.accountId) &&
        Objects.equals(this.ad, adGroupAd.ad) &&
        Objects.equals(this.adGroupId, adGroupAd.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupAd.adGroupName) &&
        Objects.equals(this.adId, adGroupAd.adId) &&
        Objects.equals(this.adName, adGroupAd.adName) &&
        Objects.equals(this.adStyle, adGroupAd.adStyle) &&
        Objects.equals(this.approvalStatus, adGroupAd.approvalStatus) &&
        Objects.equals(this.bid, adGroupAd.bid) &&
        Objects.equals(this.campaignId, adGroupAd.campaignId) &&
        Objects.equals(this.campaignName, adGroupAd.campaignName) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAd.disapprovalReasonCodes) &&
        Objects.equals(this.impressionBeaconUrls, adGroupAd.impressionBeaconUrls) &&
        Objects.equals(this.isRemoveBeaconUrls, adGroupAd.isRemoveBeaconUrls) &&
        Objects.equals(this.isRemoveThirdPartyTrackingScriptUrl, adGroupAd.isRemoveThirdPartyTrackingScriptUrl) &&
        Objects.equals(this.labels, adGroupAd.labels) &&
        Objects.equals(this.mediaId, adGroupAd.mediaId) &&
        Objects.equals(this.thirdPartyTrackingScriptUrl, adGroupAd.thirdPartyTrackingScriptUrl) &&
        Objects.equals(this.thirdPartyTrackingVendor, adGroupAd.thirdPartyTrackingVendor) &&
        Objects.equals(this.userStatus, adGroupAd.userStatus) &&
        Objects.equals(this.createdDate, adGroupAd.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adId, adName, adStyle, approvalStatus, bid, campaignId, campaignName, disapprovalReasonCodes, impressionBeaconUrls, isRemoveBeaconUrls, isRemoveThirdPartyTrackingScriptUrl, labels, mediaId, thirdPartyTrackingScriptUrl, thirdPartyTrackingVendor, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAd {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adStyle: ").append(toIndentedString(adStyle)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    impressionBeaconUrls: ").append(toIndentedString(impressionBeaconUrls)).append("\n");
    sb.append("    isRemoveBeaconUrls: ").append(toIndentedString(isRemoveBeaconUrls)).append("\n");
    sb.append("    isRemoveThirdPartyTrackingScriptUrl: ").append(toIndentedString(isRemoveThirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    thirdPartyTrackingScriptUrl: ").append(toIndentedString(thirdPartyTrackingScriptUrl)).append("\n");
    sb.append("    thirdPartyTrackingVendor: ").append(toIndentedString(thirdPartyTrackingVendor)).append("\n");
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

