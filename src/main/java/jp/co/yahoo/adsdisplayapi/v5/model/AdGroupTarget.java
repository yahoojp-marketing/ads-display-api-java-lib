package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupTargetServiceTarget;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetオブジェクトは、広告グループに設定されているターゲティング情報を格納します。&lt;br&gt; このオブジェクトは、GuaranteedAdGroupServiceで広告グループを追加する場合は必須です。&lt;br&gt; *GuaranteedAdGroupServiceでGETする際、このフィールドは返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTarget object contains targeting information specified in ad group.&lt;br&gt; This object is required if you are adding ad group via GuaranteedAdGroupService.&lt;br&gt; *This field will not be returned in GET operation via GuaranteedAdGroupService. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetオブジェクトは、広告グループに設定されているターゲティング情報を格納します。<br> このオブジェクトは、GuaranteedAdGroupServiceで広告グループを追加する場合は必須です。<br> *GuaranteedAdGroupServiceでGETする際、このフィールドは返却されません。 </div> <div lang=\"en\"> AdGroupTarget object contains targeting information specified in ad group.<br> This object is required if you are adding ad group via GuaranteedAdGroupService.<br> *This field will not be returned in GET operation via GuaranteedAdGroupService. </div> ")

public class AdGroupTarget   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("bidMultiplier")
  private JsonNullable<Double> bidMultiplier = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("target")
  private JsonNullable<AdGroupTargetServiceTarget> target = JsonNullable.undefined();

  public AdGroupTarget accountId(Long accountId) {
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

  public AdGroupTarget adGroupId(Long adGroupId) {
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

  public AdGroupTarget bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = JsonNullable.of(bidMultiplier);
    return this;
  }

  /**
   * <div lang=\"ja\"> 入札価格調整率です。<br> このフィールドは、ADD、SETおよびREPLACE時は省略可能となり、REMOVE時は無視されます。<br> ※入札価格調整率が設定できないターゲティングの場合は返却されません。<br> ※広告グループのターゲティングにSITE_RETARGETING、SEARCH_TARGET、PLACEMENT_TARGETのいずれかを指定し、かつその広告グループがYDNキャンペーンに紐づいている場合にbidMultiplierを指定しなかった時は、nullが代入されます。<br> ※その他の場合でbidMultiplierを指定しなかった時は1.0が代入されます。 </div> <div lang=\"en\"> Bid adjustment.<br> This field is optional in ADD, SET and REPLACE operation, and will be ignored in REMOVE operation.<br> ∗If bid adjustment is unable to set targeting, not returned.<br> *If bidMultiplier is not specified when SITE_RETARGETING, SEARCH_TARGET, or PLACEMENT_TARGET is specified for the targeting of the ad group and the ad group is linked to the YDN campaign, null will be assigned for this field.<br> *If bidMultiplier is not specified in other cases, 1.0 will be assigned for this field. </div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格調整率です。<br> このフィールドは、ADD、SETおよびREPLACE時は省略可能となり、REMOVE時は無視されます。<br> ※入札価格調整率が設定できないターゲティングの場合は返却されません。<br> ※広告グループのターゲティングにSITE_RETARGETING、SEARCH_TARGET、PLACEMENT_TARGETのいずれかを指定し、かつその広告グループがYDNキャンペーンに紐づいている場合にbidMultiplierを指定しなかった時は、nullが代入されます。<br> ※その他の場合でbidMultiplierを指定しなかった時は1.0が代入されます。 </div> <div lang=\"en\"> Bid adjustment.<br> This field is optional in ADD, SET and REPLACE operation, and will be ignored in REMOVE operation.<br> ∗If bid adjustment is unable to set targeting, not returned.<br> *If bidMultiplier is not specified when SITE_RETARGETING, SEARCH_TARGET, or PLACEMENT_TARGET is specified for the targeting of the ad group and the ad group is linked to the YDN campaign, null will be assigned for this field.<br> *If bidMultiplier is not specified in other cases, 1.0 will be assigned for this field. </div> ")


  public JsonNullable<Double> getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(JsonNullable<Double> bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupTarget campaignId(Long campaignId) {
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

  public AdGroupTarget target(AdGroupTargetServiceTarget target) {
    this.target = JsonNullable.of(target);
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupTargetServiceTarget> getTarget() {
    return target;
  }

  public void setTarget(JsonNullable<AdGroupTargetServiceTarget> target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTarget adGroupTarget = (AdGroupTarget) o;
    return Objects.equals(this.accountId, adGroupTarget.accountId) &&
        Objects.equals(this.adGroupId, adGroupTarget.adGroupId) &&
        Objects.equals(this.bidMultiplier, adGroupTarget.bidMultiplier) &&
        Objects.equals(this.campaignId, adGroupTarget.campaignId) &&
        Objects.equals(this.target, adGroupTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, bidMultiplier, campaignId, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTarget {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

