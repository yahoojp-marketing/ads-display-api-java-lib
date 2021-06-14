package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceCampaignBiddingStrategyType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。&lt;br&gt; ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。&lt;br&gt; REMOVE時、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.&lt;br&gt; In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.&lt;br&gt; This field will be ignored in REMOVE operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。<br> ADDおよびSET時、このフィールドは目的なしの場合は設定不可となり、目的ありの場合は必須となります。<br> REMOVE時、このフィールドは無視されます。 </div> <div lang=\"en\"> CampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.<br> In ADD and SET operation, this field cannot be set for campaigns with no campaign goal, and this field will be required for campaigns with campaign goal.<br> This field will be ignored in REMOVE operation. </div> ")

public class CampaignServiceCampaignBiddingStrategy   {
  @JsonProperty("campaignBiddingStrategyType")
  private JsonNullable<CampaignServiceCampaignBiddingStrategyType> campaignBiddingStrategyType = JsonNullable.undefined();

  @JsonProperty("maxCpcBidValue")
  private JsonNullable<Long> maxCpcBidValue = JsonNullable.undefined();

  @JsonProperty("maxCpvBidValue")
  private JsonNullable<Long> maxCpvBidValue = JsonNullable.undefined();

  @JsonProperty("maxVcpmBidValue")
  private JsonNullable<Long> maxVcpmBidValue = JsonNullable.undefined();

  @JsonProperty("targetCpaBidValue")
  private JsonNullable<Long> targetCpaBidValue = JsonNullable.undefined();

  public CampaignServiceCampaignBiddingStrategy campaignBiddingStrategyType(CampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = JsonNullable.of(campaignBiddingStrategyType);
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceCampaignBiddingStrategyType> getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(JsonNullable<CampaignServiceCampaignBiddingStrategyType> campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public CampaignServiceCampaignBiddingStrategy maxCpcBidValue(Long maxCpcBidValue) {
    this.maxCpcBidValue = JsonNullable.of(maxCpcBidValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return maxCpcBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPC)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPC). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<Long> getMaxCpcBidValue() {
    return maxCpcBidValue;
  }

  public void setMaxCpcBidValue(JsonNullable<Long> maxCpcBidValue) {
    this.maxCpcBidValue = maxCpcBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy maxCpvBidValue(Long maxCpvBidValue) {
    this.maxCpvBidValue = JsonNullable.of(maxCpvBidValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(CPV)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPV). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return maxCpvBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(CPV)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (CPV). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<Long> getMaxCpvBidValue() {
    return maxCpvBidValue;
  }

  public void setMaxCpvBidValue(JsonNullable<Long> maxCpvBidValue) {
    this.maxCpvBidValue = maxCpvBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy maxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = JsonNullable.of(maxVcpmBidValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return maxVcpmBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<Long> getMaxVcpmBidValue() {
    return maxVcpmBidValue;
  }

  public void setMaxVcpmBidValue(JsonNullable<Long> maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
  }

  public CampaignServiceCampaignBiddingStrategy targetCpaBidValue(Long targetCpaBidValue) {
    this.targetCpaBidValue = JsonNullable.of(targetCpaBidValue);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン目標単価(tCPA)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Target bid of campaign (tCPA). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> 
   * @return targetCpaBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン目標単価(tCPA)です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。 </div> <div lang=\"en\"> Target bid of campaign (tCPA). <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. </div> ")


  public JsonNullable<Long> getTargetCpaBidValue() {
    return targetCpaBidValue;
  }

  public void setTargetCpaBidValue(JsonNullable<Long> targetCpaBidValue) {
    this.targetCpaBidValue = targetCpaBidValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCampaignBiddingStrategy campaignServiceCampaignBiddingStrategy = (CampaignServiceCampaignBiddingStrategy) o;
    return Objects.equals(this.campaignBiddingStrategyType, campaignServiceCampaignBiddingStrategy.campaignBiddingStrategyType) &&
        Objects.equals(this.maxCpcBidValue, campaignServiceCampaignBiddingStrategy.maxCpcBidValue) &&
        Objects.equals(this.maxCpvBidValue, campaignServiceCampaignBiddingStrategy.maxCpvBidValue) &&
        Objects.equals(this.maxVcpmBidValue, campaignServiceCampaignBiddingStrategy.maxVcpmBidValue) &&
        Objects.equals(this.targetCpaBidValue, campaignServiceCampaignBiddingStrategy.targetCpaBidValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, maxCpcBidValue, maxCpvBidValue, maxVcpmBidValue, targetCpaBidValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCampaignBiddingStrategy {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

