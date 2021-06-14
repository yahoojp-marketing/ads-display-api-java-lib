package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceAd;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceAdStyle;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceBid;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceLabel;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupAd object is a container for storing ad information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdオブジェクトは、広告の情報を格納するコンテナです。</div> <div lang=\"en\">The AdGroupAd object is a container for storing ad information.</div> ")

public class AdGroupAd   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("ad")
  private JsonNullable<AdGroupAdServiceAd> ad = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("adId")
  private JsonNullable<Long> adId = JsonNullable.undefined();

  @JsonProperty("adName")
  private JsonNullable<String> adName = JsonNullable.undefined();

  @JsonProperty("adStyle")
  private JsonNullable<AdGroupAdServiceAdStyle> adStyle = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<AdGroupAdServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("bid")
  private JsonNullable<AdGroupAdServiceBid> bid = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonDescription")
  private JsonNullable<String> disapprovalReasonDescription = JsonNullable.undefined();

  @JsonProperty("impressionBeaconUrls")
  @Valid
  private JsonNullable<List<String>> impressionBeaconUrls = JsonNullable.undefined();

  @JsonProperty("viewableImpressionBeaconUrls")
  @Valid
  private JsonNullable<List<String>> viewableImpressionBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveImpressionBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveImpressionBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveViewableImpressionBeaconUrls")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveViewableImpressionBeaconUrls = JsonNullable.undefined();

  @JsonProperty("isRemoveThirdPartyTrackingScriptUrl")
  private JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveThirdPartyTrackingScriptUrl = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<AdGroupAdServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("mediaId")
  private JsonNullable<Long> mediaId = JsonNullable.undefined();

  @JsonProperty("thirdPartyTrackingScriptUrl")
  private JsonNullable<String> thirdPartyTrackingScriptUrl = JsonNullable.undefined();

  @JsonProperty("thirdPartyTrackingVendor")
  private JsonNullable<String> thirdPartyTrackingVendor = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<AdGroupAdServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  public AdGroupAd accountId(Long accountId) {
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

  public AdGroupAd ad(AdGroupAdServiceAd ad) {
    this.ad = JsonNullable.of(ad);
    return this;
  }

  /**
   * Get ad
   * @return ad
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceAd> getAd() {
    return ad;
  }

  public void setAd(JsonNullable<AdGroupAdServiceAd> ad) {
    this.ad = ad;
  }

  public AdGroupAd adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests. </div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupAd adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group name.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Ad group name.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroupAd adId(Long adId) {
    this.adId = JsonNullable.of(adId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告IDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Ad ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告IDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時に必須となります。 </div> <div lang=\"en\"> Ad ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getAdId() {
    return adId;
  }

  public void setAdId(JsonNullable<Long> adId) {
    this.adId = adId;
  }

  public AdGroupAd adName(String adName) {
    this.adName = JsonNullable.of(adName);
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return adName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Ad name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getAdName() {
    return adName;
  }

  public void setAdName(JsonNullable<String> adName) {
    this.adName = adName;
  }

  public AdGroupAd adStyle(AdGroupAdServiceAdStyle adStyle) {
    this.adStyle = JsonNullable.of(adStyle);
    return this;
  }

  /**
   * Get adStyle
   * @return adStyle
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceAdStyle> getAdStyle() {
    return adStyle;
  }

  public void setAdStyle(JsonNullable<AdGroupAdServiceAdStyle> adStyle) {
    this.adStyle = adStyle;
  }

  public AdGroupAd approvalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<AdGroupAdServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupAd bid(AdGroupAdServiceBid bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceBid> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<AdGroupAdServiceBid> bid) {
    this.bid = bid;
  }

  public AdGroupAd campaignId(Long campaignId) {
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

  public AdGroupAd campaignName(String campaignName) {
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

  public AdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupAd disapprovalReasonDescription(String disapprovalReasonDescription) {
    this.disapprovalReasonDescription = JsonNullable.of(disapprovalReasonDescription);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載拒否の理由詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason details on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disapprovalReasonDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載拒否の理由詳細です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Reject reason details on editorial review.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getDisapprovalReasonDescription() {
    return disapprovalReasonDescription;
  }

  public void setDisapprovalReasonDescription(JsonNullable<String> disapprovalReasonDescription) {
    this.disapprovalReasonDescription = disapprovalReasonDescription;
  }

  public AdGroupAd impressionBeaconUrls(List<String> impressionBeaconUrls) {
    this.impressionBeaconUrls = JsonNullable.of(impressionBeaconUrls);
    return this;
  }

  public AdGroupAd addImpressionBeaconUrlsItem(String impressionBeaconUrlsItem) {
    if (this.impressionBeaconUrls == null || !this.impressionBeaconUrls.isPresent()) {
      this.impressionBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.impressionBeaconUrls.get().add(impressionBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> インプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Impression beacon URL.<br> This field is optional in ADD and SET operation. </div> 
   * @return impressionBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> インプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Impression beacon URL.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<List<String>> getImpressionBeaconUrls() {
    return impressionBeaconUrls;
  }

  public void setImpressionBeaconUrls(JsonNullable<List<String>> impressionBeaconUrls) {
    this.impressionBeaconUrls = impressionBeaconUrls;
  }

  public AdGroupAd viewableImpressionBeaconUrls(List<String> viewableImpressionBeaconUrls) {
    this.viewableImpressionBeaconUrls = JsonNullable.of(viewableImpressionBeaconUrls);
    return this;
  }

  public AdGroupAd addViewableImpressionBeaconUrlsItem(String viewableImpressionBeaconUrlsItem) {
    if (this.viewableImpressionBeaconUrls == null || !this.viewableImpressionBeaconUrls.isPresent()) {
      this.viewableImpressionBeaconUrls = JsonNullable.of(new ArrayList<>());
    }
    this.viewableImpressionBeaconUrls.get().add(viewableImpressionBeaconUrlsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> ビューアブルインプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Viewable impression beacon URL.<br> This field is optional in ADD and SET operation. </div> 
   * @return viewableImpressionBeaconUrls
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ビューアブルインプレッションビーコンURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Viewable impression beacon URL.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<List<String>> getViewableImpressionBeaconUrls() {
    return viewableImpressionBeaconUrls;
  }

  public void setViewableImpressionBeaconUrls(JsonNullable<List<String>> viewableImpressionBeaconUrls) {
    this.viewableImpressionBeaconUrls = viewableImpressionBeaconUrls;
  }

  public AdGroupAd isRemoveImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveImpressionBeaconUrls) {
    this.isRemoveImpressionBeaconUrls = JsonNullable.of(isRemoveImpressionBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveImpressionBeaconUrls
   * @return isRemoveImpressionBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveImpressionBeaconUrls() {
    return isRemoveImpressionBeaconUrls;
  }

  public void setIsRemoveImpressionBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveImpressionBeaconUrls) {
    this.isRemoveImpressionBeaconUrls = isRemoveImpressionBeaconUrls;
  }

  public AdGroupAd isRemoveViewableImpressionBeaconUrls(AdGroupAdServiceIsRemoveFlg isRemoveViewableImpressionBeaconUrls) {
    this.isRemoveViewableImpressionBeaconUrls = JsonNullable.of(isRemoveViewableImpressionBeaconUrls);
    return this;
  }

  /**
   * Get isRemoveViewableImpressionBeaconUrls
   * @return isRemoveViewableImpressionBeaconUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveViewableImpressionBeaconUrls() {
    return isRemoveViewableImpressionBeaconUrls;
  }

  public void setIsRemoveViewableImpressionBeaconUrls(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveViewableImpressionBeaconUrls) {
    this.isRemoveViewableImpressionBeaconUrls = isRemoveViewableImpressionBeaconUrls;
  }

  public AdGroupAd isRemoveThirdPartyTrackingScriptUrl(AdGroupAdServiceIsRemoveFlg isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = JsonNullable.of(isRemoveThirdPartyTrackingScriptUrl);
    return this;
  }

  /**
   * Get isRemoveThirdPartyTrackingScriptUrl
   * @return isRemoveThirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemoveFlg> getIsRemoveThirdPartyTrackingScriptUrl() {
    return isRemoveThirdPartyTrackingScriptUrl;
  }

  public void setIsRemoveThirdPartyTrackingScriptUrl(JsonNullable<AdGroupAdServiceIsRemoveFlg> isRemoveThirdPartyTrackingScriptUrl) {
    this.isRemoveThirdPartyTrackingScriptUrl = isRemoveThirdPartyTrackingScriptUrl;
  }

  public AdGroupAd labels(List<AdGroupAdServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public AdGroupAd addLabelsItem(AdGroupAdServiceLabel labelsItem) {
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

  public JsonNullable<List<AdGroupAdServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<AdGroupAdServiceLabel>> labels) {
    this.labels = labels;
  }

  public AdGroupAd mediaId(Long mediaId) {
    this.mediaId = JsonNullable.of(mediaId);
    return this;
  }

  /**
   * <div lang=\"ja\"> メディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in ADD and SET operation. </div> 
   * @return mediaId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> メディアIDです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Media ID.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<Long> getMediaId() {
    return mediaId;
  }

  public void setMediaId(JsonNullable<Long> mediaId) {
    this.mediaId = mediaId;
  }

  public AdGroupAd thirdPartyTrackingScriptUrl(String thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = JsonNullable.of(thirdPartyTrackingScriptUrl);
    return this;
  }

  /**
   * <div lang=\"ja\"> 第三者計測スクリプトURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Third party tracking script URL.<br> This field is optional in ADD and SET operation. </div> 
   * @return thirdPartyTrackingScriptUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測スクリプトURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Third party tracking script URL.<br> This field is optional in ADD and SET operation. </div> ")


  public JsonNullable<String> getThirdPartyTrackingScriptUrl() {
    return thirdPartyTrackingScriptUrl;
  }

  public void setThirdPartyTrackingScriptUrl(JsonNullable<String> thirdPartyTrackingScriptUrl) {
    this.thirdPartyTrackingScriptUrl = thirdPartyTrackingScriptUrl;
  }

  public AdGroupAd thirdPartyTrackingVendor(String thirdPartyTrackingVendor) {
    this.thirdPartyTrackingVendor = JsonNullable.of(thirdPartyTrackingVendor);
    return this;
  }

  /**
   * <div lang=\"ja\"> 第三者計測ベンダー（ReadOnly）です。<br> thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Third party tracking vendor (Read only).<br> Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return thirdPartyTrackingVendor
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 第三者計測ベンダー（ReadOnly）です。<br> thirdPartyTrackingScriptUrlのドメインに基づく第三者計測ベンダーが設定されます。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Third party tracking vendor (Read only).<br> Third party tracking vendor based on domain of thirdPartyTrackingScriptUrl is set.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getThirdPartyTrackingVendor() {
    return thirdPartyTrackingVendor;
  }

  public void setThirdPartyTrackingVendor(JsonNullable<String> thirdPartyTrackingVendor) {
    this.thirdPartyTrackingVendor = thirdPartyTrackingVendor;
  }

  public AdGroupAd userStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<AdGroupAdServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroupAd createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">広告が作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告が作成された日時です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> ")


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
        Objects.equals(this.disapprovalReasonDescription, adGroupAd.disapprovalReasonDescription) &&
        Objects.equals(this.impressionBeaconUrls, adGroupAd.impressionBeaconUrls) &&
        Objects.equals(this.viewableImpressionBeaconUrls, adGroupAd.viewableImpressionBeaconUrls) &&
        Objects.equals(this.isRemoveImpressionBeaconUrls, adGroupAd.isRemoveImpressionBeaconUrls) &&
        Objects.equals(this.isRemoveViewableImpressionBeaconUrls, adGroupAd.isRemoveViewableImpressionBeaconUrls) &&
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
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adId, adName, adStyle, approvalStatus, bid, campaignId, campaignName, disapprovalReasonCodes, disapprovalReasonDescription, impressionBeaconUrls, viewableImpressionBeaconUrls, isRemoveImpressionBeaconUrls, isRemoveViewableImpressionBeaconUrls, isRemoveThirdPartyTrackingScriptUrl, labels, mediaId, thirdPartyTrackingScriptUrl, thirdPartyTrackingVendor, userStatus, createdDate);
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
    sb.append("    disapprovalReasonDescription: ").append(toIndentedString(disapprovalReasonDescription)).append("\n");
    sb.append("    impressionBeaconUrls: ").append(toIndentedString(impressionBeaconUrls)).append("\n");
    sb.append("    viewableImpressionBeaconUrls: ").append(toIndentedString(viewableImpressionBeaconUrls)).append("\n");
    sb.append("    isRemoveImpressionBeaconUrls: ").append(toIndentedString(isRemoveImpressionBeaconUrls)).append("\n");
    sb.append("    isRemoveViewableImpressionBeaconUrls: ").append(toIndentedString(isRemoveViewableImpressionBeaconUrls)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

