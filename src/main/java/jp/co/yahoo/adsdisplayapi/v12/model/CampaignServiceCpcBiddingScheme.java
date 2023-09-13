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
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceEnhancedCpcEnabled;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCpcBiddingSchemeオブジェクトは、キャンペーン最大入札価格(CPC)の設定情報を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※BiddingStrategyTypeがCPCの場合、指定必須となります。     &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCpcBiddingScheme object holds configuration information of Max bid of campaign (CPC).&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; *If BiddingStrategyType is CPC, this field is required. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceCpcBiddingScheme.JSON_PROPERTY_CPC,
  CampaignServiceCpcBiddingScheme.JSON_PROPERTY_ENHANCED_CPC_ENABLED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceCpcBiddingScheme {
  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public static final String JSON_PROPERTY_ENHANCED_CPC_ENABLED = "enhancedCpcEnabled";
  private CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled;

  public CampaignServiceCpcBiddingScheme() {
  }

  public CampaignServiceCpcBiddingScheme cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーン最大入札価格(CPC)です。&lt;br&gt; このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of campaign (CPC). &lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation. &lt;/div&gt; 
   * @return cpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  public CampaignServiceCpcBiddingScheme enhancedCpcEnabled(CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled) {
    
    this.enhancedCpcEnabled = enhancedCpcEnabled;
    return this;
  }

   /**
   * Get enhancedCpcEnabled
   * @return enhancedCpcEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceEnhancedCpcEnabled getEnhancedCpcEnabled() {
    return enhancedCpcEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedCpcEnabled(CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled) {
    this.enhancedCpcEnabled = enhancedCpcEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCpcBiddingScheme campaignServiceCpcBiddingScheme = (CampaignServiceCpcBiddingScheme) o;
    return Objects.equals(this.cpc, campaignServiceCpcBiddingScheme.cpc) &&
        Objects.equals(this.enhancedCpcEnabled, campaignServiceCpcBiddingScheme.enhancedCpcEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpc, enhancedCpcEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCpcBiddingScheme {\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    enhancedCpcEnabled: ").append(toIndentedString(enhancedCpcEnabled)).append("\n");
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

