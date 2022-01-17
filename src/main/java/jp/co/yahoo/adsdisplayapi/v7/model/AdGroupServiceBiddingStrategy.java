package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AdGroupServiceCampaignBiddingStrategyType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceBiddingStrategyは、広告グループ入札戦略を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※目的ありのキャンペーンの場合のみ設定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceBiddingStrategy object describes bidding strategy of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *This can only be specified for campaigns with campaignGoal. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceBiddingStrategyは、広告グループ入札戦略を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※目的ありのキャンペーンの場合のみ設定可能です。 </div> <div lang=\"en\"> AdGroupServiceBiddingStrategy object describes bidding strategy of ad group.<br> This field is optional in ADD and SET operation.<br> *This can only be specified for campaigns with campaignGoal. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceBiddingStrategy   {
  @JsonProperty("campaignBiddingStrategyType")
  private AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType = null;

  @JsonProperty("cpcBidValue")
  private Long cpcBidValue = null;

  @JsonProperty("cpvBidValue")
  private Long cpvBidValue = null;

  @JsonProperty("vcpmBidValue")
  private Long vcpmBidValue = null;

  @JsonProperty("targetCpaBidValue")
  private Long targetCpaBidValue = null;

  public AdGroupServiceBiddingStrategy campaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public AdGroupServiceBiddingStrategy cpcBidValue(Long cpcBidValue) {
    this.cpcBidValue = cpcBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（CPC）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがCPCの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group CPC bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is CPC. </div> 
   * @return cpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（CPC）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがCPCの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group CPC bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is CPC. </div> ")


  public Long getCpcBidValue() {
    return cpcBidValue;
  }

  public void setCpcBidValue(Long cpcBidValue) {
    this.cpcBidValue = cpcBidValue;
  }

  public AdGroupServiceBiddingStrategy cpvBidValue(Long cpvBidValue) {
    this.cpvBidValue = cpvBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（CPV）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがCPVの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group CPV bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is CPV. </div> 
   * @return cpvBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（CPV）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがCPVの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group CPV bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is CPV. </div> ")


  public Long getCpvBidValue() {
    return cpvBidValue;
  }

  public void setCpvBidValue(Long cpvBidValue) {
    this.cpvBidValue = cpvBidValue;
  }

  public AdGroupServiceBiddingStrategy vcpmBidValue(Long vcpmBidValue) {
    this.vcpmBidValue = vcpmBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（vCPM）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがVCPMの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group VCPM bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is VCPM. </div> 
   * @return vcpmBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（vCPM）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがVCPMの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group VCPM bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is VCPM. </div> ")


  public Long getVcpmBidValue() {
    return vcpmBidValue;
  }

  public void setVcpmBidValue(Long vcpmBidValue) {
    this.vcpmBidValue = vcpmBidValue;
  }

  public AdGroupServiceBiddingStrategy targetCpaBidValue(Long targetCpaBidValue) {
    this.targetCpaBidValue = targetCpaBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ目標単価（tCPA）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがTARGET_CPAの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group TARGET_CPA bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is TARGET_CPA. </div> 
   * @return targetCpaBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ目標単価（tCPA）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがTARGET_CPAの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group TARGET_CPA bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is TARGET_CPA. </div> ")


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
    AdGroupServiceBiddingStrategy adGroupServiceBiddingStrategy = (AdGroupServiceBiddingStrategy) o;
    return Objects.equals(this.campaignBiddingStrategyType, adGroupServiceBiddingStrategy.campaignBiddingStrategyType) &&
        Objects.equals(this.cpcBidValue, adGroupServiceBiddingStrategy.cpcBidValue) &&
        Objects.equals(this.cpvBidValue, adGroupServiceBiddingStrategy.cpvBidValue) &&
        Objects.equals(this.vcpmBidValue, adGroupServiceBiddingStrategy.vcpmBidValue) &&
        Objects.equals(this.targetCpaBidValue, adGroupServiceBiddingStrategy.targetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, cpcBidValue, cpvBidValue, vcpmBidValue, targetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingStrategy {\n");
    
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

