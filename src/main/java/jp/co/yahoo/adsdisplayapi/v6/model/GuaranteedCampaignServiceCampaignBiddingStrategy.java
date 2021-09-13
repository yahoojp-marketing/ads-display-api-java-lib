package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedCampaignServiceCampaignBiddingStrategyType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; GuaranteedCampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; GuaranteedCampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> GuaranteedCampaignServiceCampaignBiddingStrategyオブジェクトは、キャンペーン入札戦略です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> GuaranteedCampaignServiceCampaignBiddingStrategy object describes campaign bidding strategy.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedCampaignServiceCampaignBiddingStrategy   {
  @JsonProperty("campaignBiddingStrategyType")
  private GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType = null;

  @JsonProperty("maxVcpmBidValue")
  private Long maxVcpmBidValue = null;

  @JsonProperty("sovRate")
  private Long sovRate = null;

  public GuaranteedCampaignServiceCampaignBiddingStrategy campaignBiddingStrategyType(GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

  /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedCampaignServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }

  public void setCampaignBiddingStrategyType(GuaranteedCampaignServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }

  public GuaranteedCampaignServiceCampaignBiddingStrategy maxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return maxVcpmBidValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーン最大入札価格(vCPM)です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Max bid of campaign (vCPM).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getMaxVcpmBidValue() {
    return maxVcpmBidValue;
  }

  public void setMaxVcpmBidValue(Long maxVcpmBidValue) {
    this.maxVcpmBidValue = maxVcpmBidValue;
  }

  public GuaranteedCampaignServiceCampaignBiddingStrategy sovRate(Long sovRate) {
    this.sovRate = sovRate;
    return this;
  }

  /**
   * <div lang=\"ja\"> SOV割合です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV rate.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return sovRate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> SOV割合です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> SOV rate.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getSovRate() {
    return sovRate;
  }

  public void setSovRate(Long sovRate) {
    this.sovRate = sovRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedCampaignServiceCampaignBiddingStrategy guaranteedCampaignServiceCampaignBiddingStrategy = (GuaranteedCampaignServiceCampaignBiddingStrategy) o;
    return Objects.equals(this.campaignBiddingStrategyType, guaranteedCampaignServiceCampaignBiddingStrategy.campaignBiddingStrategyType) &&
        Objects.equals(this.maxVcpmBidValue, guaranteedCampaignServiceCampaignBiddingStrategy.maxVcpmBidValue) &&
        Objects.equals(this.sovRate, guaranteedCampaignServiceCampaignBiddingStrategy.sovRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, maxVcpmBidValue, sovRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedCampaignServiceCampaignBiddingStrategy {\n");
    
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    maxVcpmBidValue: ").append(toIndentedString(maxVcpmBidValue)).append("\n");
    sb.append("    sovRate: ").append(toIndentedString(sovRate)).append("\n");
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

