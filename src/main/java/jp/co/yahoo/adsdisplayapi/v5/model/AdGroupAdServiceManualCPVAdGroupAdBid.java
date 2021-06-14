package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceManualCPVAdGroupAdBidオブジェクトは、広告の手動入札方法（CPV）を表します。&lt;br&gt; ※広告掲載方式がVIDEO_AD（動画広告）のキャンペーンIDを指定した時のみ利用できます。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※ADD時、biddingStrategyTypeがMANUAL_CPVの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceManualCPVAdGroupAdBid object displays the manual bidding method for ad (CPV).&lt;br&gt; *It is available only when a campaign ID with ad distribution type &#39;VIDEO_AD&#39; is specified.&lt;br&gt; This field is optional.&lt;br&gt; *If biddingStrategyType is MANUAL_CPV, this field is required in ADD operation. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceManualCPVAdGroupAdBidオブジェクトは、広告の手動入札方法（CPV）を表します。<br> ※広告掲載方式がVIDEO_AD（動画広告）のキャンペーンIDを指定した時のみ利用できます。<br> このフィールドは、省略可能となります。<br> ※ADD時、biddingStrategyTypeがMANUAL_CPVの場合は必須です。 </div> <div lang=\"en\"> AdGroupAdServiceManualCPVAdGroupAdBid object displays the manual bidding method for ad (CPV).<br> *It is available only when a campaign ID with ad distribution type 'VIDEO_AD' is specified.<br> This field is optional.<br> *If biddingStrategyType is MANUAL_CPV, this field is required in ADD operation. </div> ")

public class AdGroupAdServiceManualCPVAdGroupAdBid   {
  @JsonProperty("maxCpv")
  private JsonNullable<Long> maxCpv = JsonNullable.undefined();

  public AdGroupAdServiceManualCPVAdGroupAdBid maxCpv(Long maxCpv) {
    this.maxCpv = JsonNullable.of(maxCpv);
    return this;
  }

  /**
   * <div lang=\"ja\"> 入札価格です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Bid amount.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return maxCpv
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Bid amount.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<Long> getMaxCpv() {
    return maxCpv;
  }

  public void setMaxCpv(JsonNullable<Long> maxCpv) {
    this.maxCpv = maxCpv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceManualCPVAdGroupAdBid adGroupAdServiceManualCPVAdGroupAdBid = (AdGroupAdServiceManualCPVAdGroupAdBid) o;
    return Objects.equals(this.maxCpv, adGroupAdServiceManualCPVAdGroupAdBid.maxCpv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCpv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceManualCPVAdGroupAdBid {\n");
    
    sb.append("    maxCpv: ").append(toIndentedString(maxCpv)).append("\n");
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

