package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.ReportDefinitionServiceAccount;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceCrossCampaignGoalは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン目的を示します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADD時、crossCampaignTypeが&lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceCrossCampaignGoal indicates account and campaign goal that is subject to Cross-campaign Reach Report combination.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; *If crossCampaignType is &lt;code&gt;CAMPAIGN_GOAL&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceCrossCampaignGoalは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン目的を示します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時、crossCampaignTypeが<code>CAMPAIGN_GOAL</code>の場合は必須です。 </div> <div lang=\"en\"> ReportDefinitionServiceCrossCampaignGoal indicates account and campaign goal that is subject to Cross-campaign Reach Report combination.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation.<br> *If crossCampaignType is <code>CAMPAIGN_GOAL</code>, this field is required in ADD operation. </div> ")

public class ReportDefinitionServiceCrossCampaignGoal   {
  @JsonProperty("account")
  private JsonNullable<ReportDefinitionServiceAccount> account = JsonNullable.undefined();

  @JsonProperty("campaignGoal")
  private JsonNullable<String> campaignGoal = JsonNullable.undefined();

  public ReportDefinitionServiceCrossCampaignGoal account(ReportDefinitionServiceAccount account) {
    this.account = JsonNullable.of(account);
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceAccount> getAccount() {
    return account;
  }

  public void setAccount(JsonNullable<ReportDefinitionServiceAccount> account) {
    this.account = account;
  }

  public ReportDefinitionServiceCrossCampaignGoal campaignGoal(String campaignGoal) {
    this.campaignGoal = JsonNullable.of(campaignGoal);
    return this;
  }

  /**
   * <div lang=\"ja\">   横断リーチレポートの組み合わせの対象となるキャンペーン目的です。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、crossCampaignReachTypeが<code>CAMPAIGN_GOAL</code>の場合は必須です。<br>   ※BRAND_AWARENESSを指定すると「運用型：ブランド認知」と「予約型：ブランド認知」の両方が対象になります。<br>   ※BRAND_AWARENESS_GUARANTEEDは指定できません。 </div> <div lang=\"en\">   Campaign goal that is subject to combination of Cross-campaign Reach Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If crossCampaignReachType is <code>CAMPAIGN_GOAL</code>, this field is required in ADD operation.<br>   *If you specify BRAND_AWARENESS, \"Auction: Brand awareness\" and \"Guaranteed: Brand awareness\" will be targeted. <br>   *BRAND_AWARENESS_GUARANTEED cannot be specified. </div> 
   * @return campaignGoal
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   横断リーチレポートの組み合わせの対象となるキャンペーン目的です。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、crossCampaignReachTypeが<code>CAMPAIGN_GOAL</code>の場合は必須です。<br>   ※BRAND_AWARENESSを指定すると「運用型：ブランド認知」と「予約型：ブランド認知」の両方が対象になります。<br>   ※BRAND_AWARENESS_GUARANTEEDは指定できません。 </div> <div lang=\"en\">   Campaign goal that is subject to combination of Cross-campaign Reach Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If crossCampaignReachType is <code>CAMPAIGN_GOAL</code>, this field is required in ADD operation.<br>   *If you specify BRAND_AWARENESS, \"Auction: Brand awareness\" and \"Guaranteed: Brand awareness\" will be targeted. <br>   *BRAND_AWARENESS_GUARANTEED cannot be specified. </div> ")


  public JsonNullable<String> getCampaignGoal() {
    return campaignGoal;
  }

  public void setCampaignGoal(JsonNullable<String> campaignGoal) {
    this.campaignGoal = campaignGoal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

