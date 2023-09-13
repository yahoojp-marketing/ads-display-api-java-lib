/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adsdisplayapi.v12.model.GuaranteedCampaignServiceCampaignBiddingStrategyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  GuaranteedCampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  GuaranteedCampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_VCPM_BID_VALUE,
  GuaranteedCampaignServiceCampaignBiddingStrategy.JSON_PROPERTY_SOV_RATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedCampaignServiceCampaignBiddingStrategy {
  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE = "campaignBiddingStrategyType";
  private GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType;

  public static final String JSON_PROPERTY_VCPM_BID_VALUE = "vcpmBidValue";
  private Long vcpmBidValue;

  public static final String JSON_PROPERTY_SOV_RATE = "sovRate";
  private Long sovRate;

  public GuaranteedCampaignServiceCampaignBiddingStrategy() {
  }

  public GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategyType(GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

   /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedCampaignServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategyType(GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }


  public GuaranteedCampaignServiceCampaignBiddingStrategy vcpmBidValue(Long vcpmBidValue) {
    
    this.vcpmBidValue = vcpmBidValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(vCPM)です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (vCPM).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return vcpmBidValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VCPM_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVcpmBidValue() {
    return vcpmBidValue;
  }


  @JsonProperty(JSON_PROPERTY_VCPM_BID_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpmBidValue(Long vcpmBidValue) {
    this.vcpmBidValue = vcpmBidValue;
  }


  public GuaranteedCampaignServiceCampaignBiddingStrategy sovRate(Long sovRate) {
    
    this.sovRate = sovRate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; SOV割合です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; SOV rate.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return sovRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOV_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSovRate() {
    return sovRate;
  }


  @JsonProperty(JSON_PROPERTY_SOV_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSovRate(Long sovRate) {
    this.sovRate = sovRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceCampaignBiddingStrategy guaranteedCampaignServiceCampaignBiddingStrategy = (GuaranteedCampaignServiceCampaignBiddingStrategy) o;
    return Objects.equals(this.campaignBiddingStrategyType, guaranteedCampaignServiceCampaignBiddingStrategy.campaignBiddingStrategyType) &&
        Objects.equals(this.vcpmBidValue, guaranteedCampaignServiceCampaignBiddingStrategy.vcpmBidValue) &&
        Objects.equals(this.sovRate, guaranteedCampaignServiceCampaignBiddingStrategy.sovRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, vcpmBidValue, sovRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceCampaignBiddingStrategy {\n");
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    vcpmBidValue: ").append(toIndentedString(vcpmBidValue)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
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

