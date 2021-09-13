package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.ReportDefinitionServiceAccount;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceCrossCampaignIdは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーンIDを示します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADD時、crossCampaignTypeが&lt;code&gt;CAMPAIGN_ID&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceCrossCampaignId indicates account and campaign ID that is subject to Cross-campaign Reach Report combination.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; *If crossCampaignType is &lt;code&gt;CAMPAIGN_ID&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceCrossCampaignIdは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーンIDを示します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時、crossCampaignTypeが<code>CAMPAIGN_ID</code>の場合は必須です。 </div> <div lang=\"en\"> ReportDefinitionServiceCrossCampaignId indicates account and campaign ID that is subject to Cross-campaign Reach Report combination.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation.<br> *If crossCampaignType is <code>CAMPAIGN_ID</code>, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceCrossCampaignId   {
  @JsonProperty("account")
  private ReportDefinitionServiceAccount account = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  public ReportDefinitionServiceCrossCampaignId account(ReportDefinitionServiceAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceAccount getAccount() {
    return account;
  }

  public void setAccount(ReportDefinitionServiceAccount account) {
    this.account = account;
  }

  public ReportDefinitionServiceCrossCampaignId campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">   横断リーチレポートの組み合わせの対象となるキャンペーンIDです。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、crossCampaignReachTypeが<code>CAMPAIGN_ID</code>の場合は必須です。 </div> <div lang=\"en\">   Campaign ID that is subject to combination of Cross-campaign Reach Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If crossCampaignReachType is <code>CAMPAIGN_ID</code>, this field is required in ADD operation. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   横断リーチレポートの組み合わせの対象となるキャンペーンIDです。<br>   このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br>   ※ADD時、crossCampaignReachTypeが<code>CAMPAIGN_ID</code>の場合は必須です。 </div> <div lang=\"en\">   Campaign ID that is subject to combination of Cross-campaign Reach Report. <br>   This field is optional in ADD operation, and will be ignored in REMOVE operation. <br>   *If crossCampaignReachType is <code>CAMPAIGN_ID</code>, this field is required in ADD operation. </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceCrossCampaignId reportDefinitionServiceCrossCampaignId = (ReportDefinitionServiceCrossCampaignId) o;
    return Objects.equals(this.account, reportDefinitionServiceCrossCampaignId.account) &&
        Objects.equals(this.campaignId, reportDefinitionServiceCrossCampaignId.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, campaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceCrossCampaignId {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

