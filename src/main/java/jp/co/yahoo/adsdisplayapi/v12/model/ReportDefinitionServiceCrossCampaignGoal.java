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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceCrossCampaignGoalは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン目的を示します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADD時、crossCampaignTypeが&lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceCrossCampaignGoal indicates account and campaign goal that is subject to Cross-campaign Reach Report combination.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; *If crossCampaignType is &lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceCrossCampaignGoal.JSON_PROPERTY_ACCOUNT,
  ReportDefinitionServiceCrossCampaignGoal.JSON_PROPERTY_CAMPAIGN_GOAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceCrossCampaignGoal {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private ReportDefinitionServiceAccount account;

  public static final String JSON_PROPERTY_CAMPAIGN_GOAL = "campaignGoal";
  private String campaignGoal;

  public ReportDefinitionServiceCrossCampaignGoal() {
  }

  public ReportDefinitionServiceCrossCampaignGoal account(ReportDefinitionServiceAccount account) {
    
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


  public ReportDefinitionServiceCrossCampaignGoal campaignGoal(String campaignGoal) {
    
    this.campaignGoal = campaignGoal;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   横断リーチレポートの組み合わせの対象となるキャンペーン目的です。&lt;br&gt;   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt;   ※ADD時、crossCampaignReachTypeが&lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;の場合は必須です。&lt;br&gt;   ※BRAND_AWARENESSを指定すると「運用型：ブランド認知」と「予約型：ブランド認知」の両方が対象になります。&lt;br&gt;   ※BRAND_AWARENESS_GUARANTEEDは指定できません。&lt;br&gt;   ※指定可能な値は、AccountAuthorityServiceのGET操作で得られるAccountAuthorityのauthoritiesフィールドをご確認ください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Campaign goal that is subject to combination of Cross-campaign Reach Report. &lt;br&gt;   This field is optional in ADD operation, and will be ignored in REMOVE operation. &lt;br&gt;   *If crossCampaignReachType is &lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;, this field is required in ADD operation.&lt;br&gt;   *If you specify BRAND_AWARENESS, \&quot;Auction: Brand awareness\&quot; and \&quot;Guaranteed: Brand awareness\&quot; will be targeted. &lt;br&gt;   *BRAND_AWARENESS_GUARANTEED cannot be specified.&lt;br&gt;   *Available values can be referred to authorities field of AccountAuthority object obtained by GET operation of AccountAuthorityService. &lt;/div&gt; 
   * @return campaignGoal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignGoal() {
    return campaignGoal;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignGoal(String campaignGoal) {
    this.campaignGoal = campaignGoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceCrossCampaignGoal reportDefinitionServiceCrossCampaignGoal = (ReportDefinitionServiceCrossCampaignGoal) o;
    return Objects.equals(this.account, reportDefinitionServiceCrossCampaignGoal.account) &&
        Objects.equals(this.campaignGoal, reportDefinitionServiceCrossCampaignGoal.campaignGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, campaignGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceCrossCampaignGoal {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    campaignGoal: ").append(toIndentedString(campaignGoal)).append("\n");
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

