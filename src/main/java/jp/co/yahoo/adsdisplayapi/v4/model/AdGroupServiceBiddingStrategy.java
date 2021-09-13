package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupServiceCampaignBiddingStrategyType;
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

  @JsonProperty("maxCpcBidValue")
  private Long maxCpcBidValue = null;

  @JsonProperty("maxCpvBidValue")
  private Long maxCpvBidValue = null;

  @JsonProperty("maxVcpmBidValue")
  private Long maxVcpmBidValue = null;

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

  public AdGroupServiceBiddingStrategy maxCpcBidValue(Long maxCpcBidValue) {
    this.maxCpcBidValue = maxCpcBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（CPC）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_CPCの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group MAX_CPC bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_CPC. </div> 
   * @return maxCpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（CPC）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_CPCの場合のみ指定可能です。 </div> <div lang=\"en\"> Ad group MAX_CPC bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_CPC. </div> ")


  public Long getMaxCpcBidValue() {
    return maxCpcBidValue;
  }

  public void setMaxCpcBidValue(Long maxCpcBidValue) {
    this.maxCpcBidValue = maxCpcBidValue;
  }

  public AdGroupServiceBiddingStrategy maxCpvBidValue(Long maxCpvBidValue) {
    this.maxCpvBidValue = maxCpvBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（CPV）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_CPVの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group MAX_CPV bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_CPV. </div> 
   * @return maxCpvBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（CPV）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_CPVの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group MAX_CPV bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_CPV. </div> ")


  public Long getMaxCpvBidValue() {
    return maxCpvBidValue;
  }

  public void setMaxCpvBidValue(Long maxCpvBidValue) {
    this.maxCpvBidValue = maxCpvBidValue;
  }

  public AdGroupServiceBiddingStrategy maxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> 広告グループ最大入札価格（vCPM）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_VCPMの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group MAX_VCPM bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_VCPM. </div> 
   * @return maxVcpmBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（vCPM）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※campaignBiddingStrategyTypeがMAX_VCPMの場合のみ指定可能です。 </div> <div lang=\"en\">Ad group MAX_VCPM bid value.<br> This field is optional in ADD and SET operation.<br> *This can only be specified when campaignBiddingStrategyType is MAX_VCPM. </div> ")


  public Long getMaxVcpmBidValue() {
    return maxVcpmBidValue;
  }

  public void setMaxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
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
        Objects.equals(this.maxCpcBidValue, adGroupServiceBiddingStrategy.maxCpcBidValue) &&
        Objects.equals(this.maxCpvBidValue, adGroupServiceBiddingStrategy.maxCpvBidValue) &&
        Objects.equals(this.maxVcpmBidValue, adGroupServiceBiddingStrategy.maxVcpmBidValue) &&
        Objects.equals(this.targetCpaBidValue, adGroupServiceBiddingStrategy.targetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, maxCpcBidValue, maxCpvBidValue, maxVcpmBidValue, targetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingStrategy {\n");
    
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    maxCpcBidValue: ").append(toIndentedString(maxCpcBidValue)).append("\n");
    sb.append("    maxCpvBidValue: ").append(toIndentedString(maxCpvBidValue)).append("\n");
    sb.append("    maxVcpmBidValue: ").append(toIndentedString(maxVcpmBidValue)).append("\n");
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

