/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.CampaignServiceCampaignBiddingStrategyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。&lt;br&gt; ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。&lt;br&gt; REMOVE時、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.&lt;br&gt; In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.&lt;br&gt; This field will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。<br> ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.<br> In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.<br> This field will be ignored in REMOVE operation. </div> ")
@JsonPropertyOrder({
  CampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  CampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_MAX_CPC_BID_VALUE,
  CampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_MAX_CPV_BID_VALUE,
  CampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_MAX_VCPM_BID_VALUE,
  CampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_TARGET_CPA_BID_VALUE
})
@JsonTypeName("CampaignServiceCampaignBiddingStrategy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceCampaignBiddingStrategy {
  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE = "campaignBiddingStrategyType";
  private CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType;

  public static final String JSON_PROPERTY_MAX_CPC_BID_VALUE = "maxCpcBidValue";
  private Long maxCpcBidValue;

  public static final String JSON_PROPERTY_MAX_CPV_BID_VALUE = "maxCpvBidValue";
  private Long maxCpvBidValue;

  public static final String JSON_PROPERTY_MAX_VCPM_BID_VALUE = "maxVcpmBidValue";
  private Long maxVcpmBidValue;

  public static final String JSON_PROPERTY_TARGET_CPA_BID_VALUE = "targetCpaBidValue";
  private Long targetCpaBidValue;

  public CampaignServiceCampaignBiddingStrategy() { 
  }

  public CampaignServiceCampaignBiddingStrategy campaignBiddingStrategyType(CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

   /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategyType(CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }


  public CampaignServiceCampaignBiddingStrategy maxCpcBidValue(Long maxCpcBidValue) {
    
    this.maxCpcBidValue = maxCpcBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(CPC)です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (CPC). &lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return maxCpcBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_CPC_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxCpcBidValue() {
    return maxCpcBidValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CPC_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCpcBidValue(Long maxCpcBidValue) {
    this.maxCpcBidValue = maxCpcBidValue;
  }


  public CampaignServiceCampaignBiddingStrategy maxCpvBidValue(Long maxCpvBidValue) {
    
    this.maxCpvBidValue = maxCpvBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(CPV)です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (CPV). &lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return maxCpvBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPV)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPV). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_CPV_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxCpvBidValue() {
    return maxCpvBidValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CPV_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCpvBidValue(Long maxCpvBidValue) {
    this.maxCpvBidValue = maxCpvBidValue;
  }


  public CampaignServiceCampaignBiddingStrategy maxVcpmBidValue(Long maxVcpmBidValue) {
    
    this.maxVcpmBidValue = maxVcpmBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(vCPM)です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (vCPM).&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return maxVcpmBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_VCPM_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxVcpmBidValue() {
    return maxVcpmBidValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_VCPM_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
  }


  public CampaignServiceCampaignBiddingStrategy targetCpaBidValue(Long targetCpaBidValue) {
    
    this.targetCpaBidValue = targetCpaBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン目標単価(tCPA)です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target bid of campaign (tCPA). &lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return targetCpaBidValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目標単価(tCPA)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Target bid of campaign (tCPA). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetCpaBidValue() {
    return targetCpaBidValue;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCpaBidValue(Long targetCpaBidValue) {
    this.targetCpaBidValue = targetCpaBidValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCampaignBiddingStrategy campaignServiceCampaignBiddingStrategy = (CampaignServiceCampaignBiddingStrategy) o;
    return Objects.equals(this.campaignBiddingStrategyType, campaignServiceCampaignBiddingStrategy.campaignBiddingStrategyType) &&
        Objects.equals(this.maxCpcBidValue, campaignServiceCampaignBiddingStrategy.maxCpcBidValue) &&
        Objects.equals(this.maxCpvBidValue, campaignServiceCampaignBiddingStrategy.maxCpvBidValue) &&
        Objects.equals(this.maxVcpmBidValue, campaignServiceCampaignBiddingStrategy.maxVcpmBidValue) &&
        Objects.equals(this.targetCpaBidValue, campaignServiceCampaignBiddingStrategy.targetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, maxCpcBidValue, maxCpvBidValue, maxVcpmBidValue, targetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCampaignBiddingStrategy {\n");
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    maxCpcBidValue: ").append(toIndentedString(maxCpcBidValue)).append("\n");
    sb.append("    maxCpvBidValue: ").append(toIndentedString(maxCpvBidValue)).append("\n");
    sb.append("    maxVcpmBidValue: ").append(toIndentedString(maxVcpmBidValue)).append("\n");
    sb.append("    targetCpaBidValue: ").append(toIndentedString(targetCpaBidValue)).append("\n");
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

