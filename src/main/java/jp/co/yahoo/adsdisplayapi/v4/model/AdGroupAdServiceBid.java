package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceBiddingStrategyType;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceManualCPCAdGroupAdBid;
import jp.co.yahoo.adsdisplayapi.v4.model.AdGroupAdServiceManualCPVAdGroupAdBid;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceBid object is a container for storing bid optimization method.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupAdServiceBid object is a container for storing bid optimization method.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceBid   {
  @JsonProperty("biddingStrategyType")
  private AdGroupAdServiceBiddingStrategyType biddingStrategyType = null;

  @JsonProperty("manualCPCAdGroupAdBid")
  private AdGroupAdServiceManualCPCAdGroupAdBid manualCPCAdGroupAdBid = null;

  @JsonProperty("manualCPVAdGroupAdBid")
  private AdGroupAdServiceManualCPVAdGroupAdBid manualCPVAdGroupAdBid = null;

  public AdGroupAdServiceBid biddingStrategyType(AdGroupAdServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
    return this;
  }

  /**
   * Get biddingStrategyType
   * @return biddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceBiddingStrategyType getBiddingStrategyType() {
    return biddingStrategyType;
  }

  public void setBiddingStrategyType(AdGroupAdServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
  }

  public AdGroupAdServiceBid manualCPCAdGroupAdBid(AdGroupAdServiceManualCPCAdGroupAdBid manualCPCAdGroupAdBid) {
    this.manualCPCAdGroupAdBid = manualCPCAdGroupAdBid;
    return this;
  }

  /**
   * Get manualCPCAdGroupAdBid
   * @return manualCPCAdGroupAdBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceManualCPCAdGroupAdBid getManualCPCAdGroupAdBid() {
    return manualCPCAdGroupAdBid;
  }

  public void setManualCPCAdGroupAdBid(AdGroupAdServiceManualCPCAdGroupAdBid manualCPCAdGroupAdBid) {
    this.manualCPCAdGroupAdBid = manualCPCAdGroupAdBid;
  }

  public AdGroupAdServiceBid manualCPVAdGroupAdBid(AdGroupAdServiceManualCPVAdGroupAdBid manualCPVAdGroupAdBid) {
    this.manualCPVAdGroupAdBid = manualCPVAdGroupAdBid;
    return this;
  }

  /**
   * Get manualCPVAdGroupAdBid
   * @return manualCPVAdGroupAdBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceManualCPVAdGroupAdBid getManualCPVAdGroupAdBid() {
    return manualCPVAdGroupAdBid;
  }

  public void setManualCPVAdGroupAdBid(AdGroupAdServiceManualCPVAdGroupAdBid manualCPVAdGroupAdBid) {
    this.manualCPVAdGroupAdBid = manualCPVAdGroupAdBid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceBid adGroupAdServiceBid = (AdGroupAdServiceBid) o;
    return Objects.equals(this.biddingStrategyType, adGroupAdServiceBid.biddingStrategyType) &&
        Objects.equals(this.manualCPCAdGroupAdBid, adGroupAdServiceBid.manualCPCAdGroupAdBid) &&
        Objects.equals(this.manualCPVAdGroupAdBid, adGroupAdServiceBid.manualCPVAdGroupAdBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingStrategyType, manualCPCAdGroupAdBid, manualCPVAdGroupAdBid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceBid {\n");
    
    sb.append("    biddingStrategyType: ").append(toIndentedString(biddingStrategyType)).append("\n");
    sb.append("    manualCPCAdGroupAdBid: ").append(toIndentedString(manualCPCAdGroupAdBid)).append("\n");
    sb.append("    manualCPVAdGroupAdBid: ").append(toIndentedString(manualCPVAdGroupAdBid)).append("\n");
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

