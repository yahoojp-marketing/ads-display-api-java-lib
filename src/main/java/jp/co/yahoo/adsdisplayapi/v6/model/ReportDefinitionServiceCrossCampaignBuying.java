package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.ReportDefinitionServiceAccount;
import jp.co.yahoo.adsdisplayapi.v6.model.ReportDefinitionServiceCrossCampaignBuyingType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; ReportDefinitionServiceCrossCampaignBuyingは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン購入タイプを示します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※ADD時、crossCampaignTypeが&lt;code&gt;CAMPAIGN_BUYING_TYPE&lt;/code&gt;の場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ReportDefinitionServiceCrossCampaignBuying indicates account and campaign purchase type that is subject to Cross-campaign Reach Report combination.&lt;br&gt; This field is optional in ADD operation, and will be ignored in REMOVE operation.&lt;br&gt; *If crossCampaignType is &lt;code&gt;CAMPAIGN_BUYING_TYPE&lt;/code&gt;, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> ReportDefinitionServiceCrossCampaignBuyingは、横断リーチレポートの組み合わせの対象となるアカウントおよびキャンペーン購入タイプを示します。<br> このフィールドは、ADD時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時、crossCampaignTypeが<code>CAMPAIGN_BUYING_TYPE</code>の場合は必須です。 </div> <div lang=\"en\"> ReportDefinitionServiceCrossCampaignBuying indicates account and campaign purchase type that is subject to Cross-campaign Reach Report combination.<br> This field is optional in ADD operation, and will be ignored in REMOVE operation.<br> *If crossCampaignType is <code>CAMPAIGN_BUYING_TYPE</code>, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceCrossCampaignBuying   {
  @JsonProperty("account")
  private ReportDefinitionServiceAccount account = null;

  @JsonProperty("campaignBuyingType")
  private ReportDefinitionServiceCrossCampaignBuyingType campaignBuyingType = null;

  public ReportDefinitionServiceCrossCampaignBuying account(ReportDefinitionServiceAccount account) {
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

  public ReportDefinitionServiceCrossCampaignBuying campaignBuyingType(ReportDefinitionServiceCrossCampaignBuyingType campaignBuyingType) {
    this.campaignBuyingType = campaignBuyingType;
    return this;
  }

  /**
   * Get campaignBuyingType
   * @return campaignBuyingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceCrossCampaignBuyingType getCampaignBuyingType() {
    return campaignBuyingType;
  }

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

