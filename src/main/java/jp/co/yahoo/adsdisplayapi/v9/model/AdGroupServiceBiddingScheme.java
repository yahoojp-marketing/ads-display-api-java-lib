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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupServiceCampaignBiddingStrategyType;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupServiceCpcBiddingScheme;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupServiceCpvBiddingScheme;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupServiceMaximizeConversionsBiddingScheme;
import jp.co.yahoo.adsdisplayapi.v9.model.AdGroupServiceVcpmBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceBiddingSchemeは、広告グループ入札戦略を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceBiddingScheme object displays the details of bidding strategy of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceBiddingSchemeは、広告グループ入札戦略を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> </div> <div lang=\"en\"> AdGroupServiceBiddingScheme object displays the details of bidding strategy of ad group.<br> This field is optional in ADD and SET operation.<br> </div> ")
@JsonPropertyOrder({
  AdGroupServiceBiddingScheme.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_CPC_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_CPV_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_VCPM_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME
})
@JsonTypeName("AdGroupServiceBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceBiddingScheme {
  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE = "campaignBiddingStrategyType";
  private AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType;

  public static final String JSON_PROPERTY_CPC_BIDDING_SCHEME = "cpcBiddingScheme";
  private AdGroupServiceCpcBiddingScheme cpcBiddingScheme;

  public static final String JSON_PROPERTY_CPV_BIDDING_SCHEME = "cpvBiddingScheme";
  private AdGroupServiceCpvBiddingScheme cpvBiddingScheme;

  public static final String JSON_PROPERTY_VCPM_BIDDING_SCHEME = "vcpmBiddingScheme";
  private AdGroupServiceVcpmBiddingScheme vcpmBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME = "maximizeConversionsBiddingScheme";
  private AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme;

  public AdGroupServiceBiddingScheme() { 
  }

  public AdGroupServiceBiddingScheme campaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    
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

  public AdGroupServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }


  public AdGroupServiceBiddingScheme cpcBiddingScheme(AdGroupServiceCpcBiddingScheme cpcBiddingScheme) {
    
    this.cpcBiddingScheme = cpcBiddingScheme;
    return this;
  }

   /**
   * Get cpcBiddingScheme
   * @return cpcBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPC_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCpcBiddingScheme getCpcBiddingScheme() {
    return cpcBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_CPC_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpcBiddingScheme(AdGroupServiceCpcBiddingScheme cpcBiddingScheme) {
    this.cpcBiddingScheme = cpcBiddingScheme;
  }


  public AdGroupServiceBiddingScheme cpvBiddingScheme(AdGroupServiceCpvBiddingScheme cpvBiddingScheme) {
    
    this.cpvBiddingScheme = cpvBiddingScheme;
    return this;
  }

   /**
   * Get cpvBiddingScheme
   * @return cpvBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPV_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCpvBiddingScheme getCpvBiddingScheme() {
    return cpvBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_CPV_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpvBiddingScheme(AdGroupServiceCpvBiddingScheme cpvBiddingScheme) {
    this.cpvBiddingScheme = cpvBiddingScheme;
  }


  public AdGroupServiceBiddingScheme vcpmBiddingScheme(AdGroupServiceVcpmBiddingScheme vcpmBiddingScheme) {
    
    this.vcpmBiddingScheme = vcpmBiddingScheme;
    return this;
  }

   /**
   * Get vcpmBiddingScheme
   * @return vcpmBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VCPM_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceVcpmBiddingScheme getVcpmBiddingScheme() {
    return vcpmBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_VCPM_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpmBiddingScheme(AdGroupServiceVcpmBiddingScheme vcpmBiddingScheme) {
    this.vcpmBiddingScheme = vcpmBiddingScheme;
  }


  public AdGroupServiceBiddingScheme maximizeConversionsBiddingScheme(AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    
    this.maximizeConversionsBiddingScheme = maximizeConversionsBiddingScheme;
    return this;
  }

   /**
   * Get maximizeConversionsBiddingScheme
   * @return maximizeConversionsBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceMaximizeConversionsBiddingScheme getMaximizeConversionsBiddingScheme() {
    return maximizeConversionsBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionsBiddingScheme(AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    this.maximizeConversionsBiddingScheme = maximizeConversionsBiddingScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBiddingScheme adGroupServiceBiddingScheme = (AdGroupServiceBiddingScheme) o;
    return Objects.equals(this.campaignBiddingStrategyType, adGroupServiceBiddingScheme.campaignBiddingStrategyType) &&
        Objects.equals(this.cpcBiddingScheme, adGroupServiceBiddingScheme.cpcBiddingScheme) &&
        Objects.equals(this.cpvBiddingScheme, adGroupServiceBiddingScheme.cpvBiddingScheme) &&
        Objects.equals(this.vcpmBiddingScheme, adGroupServiceBiddingScheme.vcpmBiddingScheme) &&
        Objects.equals(this.maximizeConversionsBiddingScheme, adGroupServiceBiddingScheme.maximizeConversionsBiddingScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, cpcBiddingScheme, cpvBiddingScheme, vcpmBiddingScheme, maximizeConversionsBiddingScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingScheme {\n");
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    cpcBiddingScheme: ").append(toIndentedString(cpcBiddingScheme)).append("\n");
    sb.append("    cpvBiddingScheme: ").append(toIndentedString(cpvBiddingScheme)).append("\n");
    sb.append("    vcpmBiddingScheme: ").append(toIndentedString(vcpmBiddingScheme)).append("\n");
    sb.append("    maximizeConversionsBiddingScheme: ").append(toIndentedString(maximizeConversionsBiddingScheme)).append("\n");
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

