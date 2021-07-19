package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceManualCPCAdGroupAdBidオブジェクトは、広告の手動入札方法（CPC）を表します。&lt;br&gt; ※広告掲載方式がVIDEO_AD（動画広告）のキャンペーンIDを指定した時は利用できません。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、biddingStrategyTypeがMANUAL_CPCの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceManualCPCAdGroupAdBid object serves the manual bid (CPC) of the ad level.&lt;br&gt; *It is not available when a campaign ID with ad distribution type &#39;VIDEO_AD&#39; is specified.&lt;br&gt; This field is optional.&lt;br&gt; *If biddingStrategyType is MANUAL_CPC, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceManualCPCAdGroupAdBidオブジェクトは、広告の手動入札方法（CPC）を表します。<br> ※広告掲載方式がVIDEO_AD（動画広告）のキャンペーンIDを指定した時は利用できません。<br> このフィールドは、省略可能となります。<br> ※ADD時、biddingStrategyTypeがMANUAL_CPCの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceManualCPCAdGroupAdBid object serves the manual bid (CPC) of the ad level.<br> *It is not available when a campaign ID with ad distribution type 'VIDEO_AD' is specified.<br> This field is optional.<br> *If biddingStrategyType is MANUAL_CPC, this field is required in ADD operation. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceManualCPCAdGroupAdBid   {
  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  public AdGroupAdServiceManualCPCAdGroupAdBid maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\"> 入札価格です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Bid amount.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Bid amount.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public Long getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceManualCPCAdGroupAdBid adGroupAdServiceManualCPCAdGroupAdBid = (AdGroupAdServiceManualCPCAdGroupAdBid) o;
    return Objects.equals(this.maxCpc, adGroupAdServiceManualCPCAdGroupAdBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceManualCPCAdGroupAdBid {\n");
    
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

