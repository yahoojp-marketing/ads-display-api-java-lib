package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceManualCPCBidオブジェクトは、広告グループの入札価格を保持します。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。&lt;br&gt; 詳細は、「&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;ja&amp;aid&#x3D;1281\&quot;&gt;広告グループの作成 - 広告グループの入札価格を入力&lt;/a&gt;」を参照してください。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceManualCPCBid object stores the bid amount of ad group.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set.&lt;br&gt; More details are described on &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan&#x3D;en&amp;aid&#x3D;487\&quot;&gt;Create Ad Group - Enter the Bid amount of the Ad Group&lt;/a&gt;. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceManualCPCBidオブジェクトは、広告グループの入札価格を保持します。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。<br> 詳細は、「<a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=ja&aid=1281\">広告グループの作成 - 広告グループの入札価格を入力</a>」を参照してください。 </div> <div lang=\"en\"> AdGroupServiceManualCPCBid object stores the bid amount of ad group.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set.<br> More details are described on <a href=\"https://ads-help.yahoo.co.jp/yahooads/ydn/articledetail?lan=en&aid=487\">Create Ad Group - Enter the Bid amount of the Ad Group</a>. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceManualCPCBid   {
  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  public AdGroupServiceManualCPCBid maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\"> 入札価格です。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> Bid amount.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 入札価格です。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> Bid amount.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")


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
    AdGroupServiceManualCPCBid adGroupServiceManualCPCBid = (AdGroupServiceManualCPCBid) o;
    return Objects.equals(this.maxCpc, adGroupServiceManualCPCBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceManualCPCBid {\n");
    
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

