package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.CampaignServiceCampaignBiddingStrategyType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。&lt;br&gt; ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。&lt;br&gt; REMOVE時、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.&lt;br&gt; In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.&lt;br&gt; This field will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。<br> ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.<br> In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.<br> This field will be ignored in REMOVE operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceCampaignBiddingStrategy   {
  @JsonProperty("campaignBiddingStrategyType")
  private CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType = null;

  @JsonProperty("cpcBidValue")
  private Long cpcBidValue = null;

  @JsonProperty("cpvBidValue")
  private Long cpvBidValue = null;

  @JsonProperty("vcpmBidValue")
  private Long vcpmBidValue = null;

  @JsonProperty("targetCpaBidValue")
  private Long targetCpaBidValue = null;

  public CampaignServiceCampaignBiddingStrategy campaignBiddingStrategyType(CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public CampaignServiceCampaignBiddingStrategy cpcBidValue(Long cpcBidValue) {
    this.cpcBidValue = cpcBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return cpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public Long getCpcBidValue() {
    return cpcBidValue;
  }

  public void setCpcBidValue(Long cpcBidValue) {
    this.cpcBidValue = cpcBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy cpvBidValue(Long cpvBidValue) {
    this.cpvBidValue = cpvBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(CPV)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPV). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return cpvBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPV)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPV). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public Long getCpvBidValue() {
    return cpvBidValue;
  }

  public void setCpvBidValue(Long cpvBidValue) {
    this.cpvBidValue = cpvBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy vcpmBidValue(Long vcpmBidValue) {
    this.vcpmBidValue = vcpmBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return vcpmBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public Long getVcpmBidValue() {
    return vcpmBidValue;
  }

  public void setVcpmBidValue(Long vcpmBidValue) {
    this.vcpmBidValue = vcpmBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy targetCpaBidValue(Long targetCpaBidValue) {
    this.targetCpaBidValue = targetCpaBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目標単価(tCPA)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Target bid of campaign (tCPA). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return targetCpaBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目標単価(tCPA)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Target bid of campaign (tCPA). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public Long getTargetCpaBidValue() {
    return targetCpaBidValue;
  }

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
        Objects.equals(this.cpcBidValue, campaignServiceCampaignBiddingStrategy.cpcBidValue) &&
        Objects.equals(this.cpvBidValue, campaignServiceCampaignBiddingStrategy.cpvBidValue) &&
        Objects.equals(this.vcpmBidValue, campaignServiceCampaignBiddingStrategy.vcpmBidValue) &&
        Objects.equals(this.targetCpaBidValue, campaignServiceCampaignBiddingStrategy.targetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, cpcBidValue, cpvBidValue, vcpmBidValue, targetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCampaignBiddingStrategy {\n");
    
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    cpcBidValue: ").append(toIndentedString(cpcBidValue)).append("\n");
    sb.append("    cpvBidValue: ").append(toIndentedString(cpvBidValue)).append("\n");
    sb.append("    vcpmBidValue: ").append(toIndentedString(vcpmBidValue)).append("\n");
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

