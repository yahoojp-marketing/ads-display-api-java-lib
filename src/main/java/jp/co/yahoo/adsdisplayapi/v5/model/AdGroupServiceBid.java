package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceBidType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceManualCPCBid;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceManualCPVBid;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ADD時、このフィールドは指定できません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceBid object is a container for storing bid optimization method.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; In ADD operation, this field can not be set. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceBidオブジェクトは、入札最適化方法を格納するコンテナです。<br> SET時、このフィールドは省略可能となります。<br> ADD時、このフィールドは指定できません。 </div> <div lang=\"en\"> AdGroupServiceBid object is a container for storing bid optimization method.<br> This field is optional in SET operation.<br> In ADD operation, this field can not be set. </div> ")

public class AdGroupServiceBid   {
  @JsonProperty("manualCPCBid")
  private JsonNullable<AdGroupServiceManualCPCBid> manualCPCBid = JsonNullable.undefined();

  @JsonProperty("manualCPVBid")
  private JsonNullable<AdGroupServiceManualCPVBid> manualCPVBid = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<AdGroupServiceBidType> type = JsonNullable.undefined();

  public AdGroupServiceBid manualCPCBid(AdGroupServiceManualCPCBid manualCPCBid) {
    this.manualCPCBid = JsonNullable.of(manualCPCBid);
    return this;
  }

  /**
   * Get manualCPCBid
   * @return manualCPCBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceManualCPCBid> getManualCPCBid() {
    return manualCPCBid;
  }

  public void setManualCPCBid(JsonNullable<AdGroupServiceManualCPCBid> manualCPCBid) {
    this.manualCPCBid = manualCPCBid;
  }

  public AdGroupServiceBid manualCPVBid(AdGroupServiceManualCPVBid manualCPVBid) {
    this.manualCPVBid = JsonNullable.of(manualCPVBid);
    return this;
  }

  /**
   * Get manualCPVBid
   * @return manualCPVBid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceManualCPVBid> getManualCPVBid() {
    return manualCPVBid;
  }

  public void setManualCPVBid(JsonNullable<AdGroupServiceManualCPVBid> manualCPVBid) {
    this.manualCPVBid = manualCPVBid;
  }

  public AdGroupServiceBid type(AdGroupServiceBidType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceBidType> getType() {
    return type;
  }

  public void setType(JsonNullable<AdGroupServiceBidType> type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBid adGroupServiceBid = (AdGroupServiceBid) o;
    return Objects.equals(this.manualCPCBid, adGroupServiceBid.manualCPCBid) &&
        Objects.equals(this.manualCPVBid, adGroupServiceBid.manualCPVBid) &&
        Objects.equals(this.type, adGroupServiceBid.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualCPCBid, manualCPVBid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBid {\n");
    
    sb.append("    manualCPCBid: ").append(toIndentedString(manualCPCBid)).append("\n");
    sb.append("    manualCPVBid: ").append(toIndentedString(manualCPVBid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

