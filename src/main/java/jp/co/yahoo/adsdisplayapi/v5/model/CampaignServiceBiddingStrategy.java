package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.CampaignServiceBiddingStrategyType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceBiddingStrategyオブジェクトは、キャンペーンの入札方法を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; The CampaignServiceBiddingStrategy object displays campaign bidding strategy.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceBiddingStrategyオブジェクトは、キャンペーンの入札方法を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The CampaignServiceBiddingStrategy object displays campaign bidding strategy.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceBiddingStrategy   {
  @JsonProperty("biddingStrategyType")
  private CampaignServiceBiddingStrategyType biddingStrategyType = null;

  public CampaignServiceBiddingStrategy biddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
    return this;
  }

  /**
   * Get biddingStrategyType
   * @return biddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceBiddingStrategyType getBiddingStrategyType() {
    return biddingStrategyType;
  }

  public void setBiddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBiddingStrategy campaignServiceBiddingStrategy = (CampaignServiceBiddingStrategy) o;
    return Objects.equals(this.biddingStrategyType, campaignServiceBiddingStrategy.biddingStrategyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingStrategyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBiddingStrategy {\n");
    
    sb.append("    biddingStrategyType: ").append(toIndentedString(biddingStrategyType)).append("\n");
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

