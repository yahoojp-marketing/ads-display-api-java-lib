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
import jp.co.yahoo.adsdisplayapi.v12.model.ReportDefinitionServiceAccount;
import jp.co.yahoo.adsdisplayapi.v12.model.ReportDefinitionServiceCrossCampaignBuyingType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceCrossCampaignBuyingは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン購入タイプを示します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADD時、crossCampaignTypeが&lt;code&gt;CAMPAIGN_BUYING_TYPE&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceCrossCampaignBuying indicates account and campaign purchase type that is subject to Cross-campaign Reach Report combination.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; *If crossCampaignType is &lt;code&gt;CAMPAIGN_BUYING_TYPE&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceCrossCampaignBuying.JSON_PROPERTY_ACCOUNT,
  ReportDefinitionServiceCrossCampaignBuying.JSON_PROPERTY_CAMPAIGN_BUYING_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceCrossCampaignBuying {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private ReportDefinitionServiceAccount account;

  public static final String JSON_PROPERTY_CAMPAIGN_BUYING_TYPE = "campaignBuyingType";
  private ReportDefinitionServiceCrossCampaignBuyingType campaignBuyingType;

  public ReportDefinitionServiceCrossCampaignBuying() {
  }

  public ReportDefinitionServiceCrossCampaignBuying account(ReportDefinitionServiceAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(ReportDefinitionServiceAccount account) {
    this.account = account;
  }


  public ReportDefinitionServiceCrossCampaignBuying campaignBuyingType(ReportDefinitionServiceCrossCampaignBuyingType campaignBuyingType) {
    
    this.campaignBuyingType = campaignBuyingType;
    return this;
  }

   /**
   * Get campaignBuyingType
   * @return campaignBuyingType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUYING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceCrossCampaignBuyingType getCampaignBuyingType() {
    return campaignBuyingType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUYING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBuyingType(ReportDefinitionServiceCrossCampaignBuyingType campaignBuyingType) {
    this.campaignBuyingType = campaignBuyingType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceCrossCampaignBuying reportDefinitionServiceCrossCampaignBuying = (ReportDefinitionServiceCrossCampaignBuying) o;
    return Objects.equals(this.account, reportDefinitionServiceCrossCampaignBuying.account) &&
        Objects.equals(this.campaignBuyingType, reportDefinitionServiceCrossCampaignBuying.campaignBuyingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, campaignBuyingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceCrossCampaignBuying {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    campaignBuyingType: ").append(toIndentedString(campaignBuyingType)).append("\n");
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

