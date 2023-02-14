/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v10.model.AdGroupTargetServiceTarget;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupTargetオブジェクトは、広告グループに設定されているターゲティング情報を格納します。&lt;br&gt; このオブジェクトは、GuaranteedAdGroupServiceで広告グループを追加する場合は必須です。&lt;br&gt; *GuaranteedAdGroupServiceでGETする際、このフィールドは返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupTarget object contains targeting information specified in ad group.&lt;br&gt; This object is required if you are adding ad group via GuaranteedAdGroupService.&lt;br&gt; *This field will not be returned in GET operation via GuaranteedAdGroupService. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupTargetオブジェクトは、広告グループに設定されているターゲティング情報を格納します。<br> このオブジェクトは、GuaranteedAdGroupServiceで広告グループを追加する場合は必須です。<br> *GuaranteedAdGroupServiceでGETする際、このフィールドは返却されません。 </div> <div lang=\"en\"> AdGroupTarget object contains targeting information specified in ad group.<br> This object is required if you are adding ad group via GuaranteedAdGroupService.<br> *This field will not be returned in GET operation via GuaranteedAdGroupService. </div> ")
@JsonPropertyOrder({
  AdGroupTarget.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupTarget.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupTarget.JSON_PROPERTY_BID_MULTIPLIER,
  AdGroupTarget.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupTarget.JSON_PROPERTY_TARGET
})
@JsonTypeName("AdGroupTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupTarget {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_BID_MULTIPLIER = "bidMultiplier";
  private Double bidMultiplier;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_TARGET = "target";
  private AdGroupTargetServiceTarget target;

  public AdGroupTarget() { 
  }

  public AdGroupTarget accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AdGroupTarget adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。&lt;br&gt; ※GuaranteedAdGroupServiceでADDおよびSETする際、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Ad group ID.&lt;br&gt; This field is required in requests.&lt;br&gt; *This field will be ignored in ADD and SET operation via GuaranteedAdGroupService. &lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループIDです。<br> このフィールドは、リクエストの場合は必須です。<br> ※GuaranteedAdGroupServiceでADDおよびSETする際、このフィールドは無視されます。 </div> <div lang=\"en\"> Ad group ID.<br> This field is required in requests.<br> *This field will be ignored in ADD and SET operation via GuaranteedAdGroupService. </div> ")
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


  public AdGroupTarget bidMultiplier(Double bidMultiplier) {
    
    this.bidMultiplier = bidMultiplier;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 入札価格調整率です。&lt;br&gt; このフィールドは、ADD、SETおよびREPLACE時は省略可能となり、REMOVE時は無視されます。&lt;br&gt; ※入札価格調整率が設定できないターゲティングの場合は返却されません。&lt;br&gt; ※広告グループのターゲティングにAUDIENCE_LIST_TARGET、SEARCH_TARGET、PLACEMENT_TARGETのいずれかを指定し、かつその広告グループがYDNキャンペーンに紐づいている場合にbidMultiplierを指定しなかった時は、nullが代入されます。&lt;br&gt; ※その他の場合でbidMultiplierを指定しなかった時は1.0が代入されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Bid adjustment.&lt;br&gt; This field is optional in ADD, SET and REPLACE operation, and will be ignored in REMOVE operation.&lt;br&gt; ∗If bid adjustment is unable to set targeting, not returned.&lt;br&gt; *If bidMultiplier is not specified when AUDIENCE_LIST_TARGET, SEARCH_TARGET, or PLACEMENT_TARGET is specified for the targeting of the ad group and the ad group is linked to the YDN campaign, null will be assigned for this field.&lt;br&gt; *If bidMultiplier is not specified in other cases, 1.0 will be assigned for this field. &lt;/div&gt; 
   * @return bidMultiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格調整率です。<br> このフィールドは、ADD、SETおよびREPLACE時は省略可能となり、REMOVE時は無視されます。<br> ※入札価格調整率が設定できないターゲティングの場合は返却されません。<br> ※広告グループのターゲティングにAUDIENCE_LIST_TARGET、SEARCH_TARGET、PLACEMENT_TARGETのいずれかを指定し、かつその広告グループがYDNキャンペーンに紐づいている場合にbidMultiplierを指定しなかった時は、nullが代入されます。<br> ※その他の場合でbidMultiplierを指定しなかった時は1.0が代入されます。 </div> <div lang=\"en\"> Bid adjustment.<br> This field is optional in ADD, SET and REPLACE operation, and will be ignored in REMOVE operation.<br> ∗If bid adjustment is unable to set targeting, not returned.<br> *If bidMultiplier is not specified when AUDIENCE_LIST_TARGET, SEARCH_TARGET, or PLACEMENT_TARGET is specified for the targeting of the ad group and the ad group is linked to the YDN campaign, null will be assigned for this field.<br> *If bidMultiplier is not specified in other cases, 1.0 will be assigned for this field. </div> ")
  @JsonProperty(JSON_PROPERTY_BID_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBidMultiplier() {
    return bidMultiplier;
  }


  @JsonProperty(JSON_PROPERTY_BID_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }


  public AdGroupTarget campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。&lt;br&gt; ※GuaranteedAdGroupServiceでADDおよびSETする際、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID.&lt;br&gt; This field is required in requests.&lt;br&gt; *This field will be ignored in ADD and SET operation via GuaranteedAdGroupService. &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンIDです。<br> このフィールドは、リクエストの場合は必須です。<br> ※GuaranteedAdGroupServiceでADDおよびSETする際、このフィールドは無視されます。 </div> <div lang=\"en\"> Campaign ID.<br> This field is required in requests.<br> *This field will be ignored in ADD and SET operation via GuaranteedAdGroupService. </div> ")
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


  public AdGroupTarget target(AdGroupTargetServiceTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupTargetServiceTarget getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(AdGroupTargetServiceTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

