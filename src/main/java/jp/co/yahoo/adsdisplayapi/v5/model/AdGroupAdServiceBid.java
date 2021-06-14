package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceBiddingStrategyType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceManualCPCAdGroupAdBid;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupAdServiceManualCPVAdGroupAdBid;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceBid object is a container for storing bid optimization method.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupAdServiceBid object is a container for storing bid optimization method.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")

public class AdGroupAdServiceBid   {
  @JsonProperty("biddingStrategyType")
  private JsonNullable<AdGroupAdServiceBiddingStrategyType> biddingStrategyType = JsonNullable.undefined();

  @JsonProperty("manualCPCAdGroupAdBid")
  private JsonNullable<AdGroupAdServiceManualCPCAdGroupAdBid> manualCPCAdGroupAdBid = JsonNullable.undefined();

  @JsonProperty("manualCPVAdGroupAdBid")
  private JsonNullable<AdGroupAdServiceManualCPVAdGroupAdBid> manualCPVAdGroupAdBid = JsonNullable.undefined();

  public AdGroupAdServiceBid biddingStrategyType(AdGroupAdServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = JsonNullable.of(biddingStrategyType);
    return this;
  }

  /**
   * Get biddingStrategyType
   * @return biddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceBiddingStrategyType> getBiddingStrategyType() {
    return biddingStrategyType;
  }

  public void setBiddingStrategyType(JsonNullable<AdGroupAdServiceBiddingStrategyType> biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
  }

  public AdGroupAdServiceBid manualCPCAdGroupAdBid(AdGroupAdServiceManualCPCAdGroupAdBid manualCPCAdGroupAdBid) {
    this.manualCPCAdGroupAdBid = JsonNullable.of(manualCPCAdGroupAdBid);
    return this;
  }

  /**
   * Get manualCPCAdGroupAdBid
   * @return manualCPCAdGroupAdBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceManualCPCAdGroupAdBid> getManualCPCAdGroupAdBid() {
    return manualCPCAdGroupAdBid;
  }

  public void setManualCPCAdGroupAdBid(JsonNullable<AdGroupAdServiceManualCPCAdGroupAdBid> manualCPCAdGroupAdBid) {
    this.manualCPCAdGroupAdBid = manualCPCAdGroupAdBid;
  }

  public AdGroupAdServiceBid manualCPVAdGroupAdBid(AdGroupAdServiceManualCPVAdGroupAdBid manualCPVAdGroupAdBid) {
    this.manualCPVAdGroupAdBid = JsonNullable.of(manualCPVAdGroupAdBid);
    return this;
  }

  /**
   * Get manualCPVAdGroupAdBid
   * @return manualCPVAdGroupAdBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceManualCPVAdGroupAdBid> getManualCPVAdGroupAdBid() {
    return manualCPVAdGroupAdBid;
  }

  public void setManualCPVAdGroupAdBid(JsonNullable<AdGroupAdServiceManualCPVAdGroupAdBid> manualCPVAdGroupAdBid) {
    this.manualCPVAdGroupAdBid = manualCPVAdGroupAdBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

