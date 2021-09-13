package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceUnavailableReason;
import jp.co.yahoo.adsdisplayapi.v6.model.GuaranteedSimulationServiceUnreservableReason;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedSimulationServiceInventoryResultオブジェクトは、在庫の確認結果を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedSimulationServiceInventoryResult describes the result of inventory check. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedSimulationServiceInventoryResultオブジェクトは、在庫の確認結果を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">GuaranteedSimulationServiceInventoryResult describes the result of inventory check. <br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GuaranteedSimulationServiceInventoryResult   {
  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("maxSellableVImps")
  private Long maxSellableVImps = null;

  @JsonProperty("maxReservableVImps")
  private Long maxReservableVImps = null;

  @JsonProperty("sellingSlots")
  private Long sellingSlots = null;

  @JsonProperty("maxReservableSlots")
  private Long maxReservableSlots = null;

  @JsonProperty("unavailableReasons")
  @Valid
  private List<GuaranteedSimulationServiceUnavailableReason> unavailableReasons = null;

  @JsonProperty("unreservableReason")
  private GuaranteedSimulationServiceUnreservableReason unreservableReason = null;

  public GuaranteedSimulationServiceInventoryResult startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの開始日です。<br> </div> <div lang=\"en\"> Start date of campaign. <br> </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始日です。<br> </div> <div lang=\"en\"> Start date of campaign. <br> </div> Format: yyyyMMdd ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public GuaranteedSimulationServiceInventoryResult endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの終了日です。<br> </div> <div lang=\"en\"> End date of campaign. <br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了日です。<br> </div> <div lang=\"en\"> End date of campaign. <br> </div> Format: yyyyMMdd ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public GuaranteedSimulationServiceInventoryResult maxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で販売可能なビューアブルインプレッション数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable viewable impression under the specified period.<br> </div> 
   * @return maxSellableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能なビューアブルインプレッション数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable viewable impression under the specified period.<br> </div> ")


  public Long getMaxSellableVImps() {
    return maxSellableVImps;
  }

  public void setMaxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
  }

  public GuaranteedSimulationServiceInventoryResult maxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間のビューアブルインプレッション数の残在庫です。<br> </div> <div lang=\"en\"> Residual inventory of viewable impression under the specified period.<br> </div> 
   * @return maxReservableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間のビューアブルインプレッション数の残在庫です。<br> </div> <div lang=\"en\"> Residual inventory of viewable impression under the specified period.<br> </div> ")


  public Long getMaxReservableVImps() {
    return maxReservableVImps;
  }

  public void setMaxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
  }

  public GuaranteedSimulationServiceInventoryResult sellingSlots(Long sellingSlots) {
    this.sellingSlots = sellingSlots;
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で販売可能な枠数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable slots under the specified period.<br> </div> 
   * @return sellingSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能な枠数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable slots under the specified period.<br> </div> ")


  public Long getSellingSlots() {
    return sellingSlots;
  }

  public void setSellingSlots(Long sellingSlots) {
    this.sellingSlots = sellingSlots;
  }

  public GuaranteedSimulationServiceInventoryResult maxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で予約可能な最大枠数です。<br> </div> <div lang=\"en\"> Maximum number of reservable slots under the specified period.<br> </div> 
   * @return maxReservableSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で予約可能な最大枠数です。<br> </div> <div lang=\"en\"> Maximum number of reservable slots under the specified period.<br> </div> ")


  public Long getMaxReservableSlots() {
    return maxReservableSlots;
  }

  public void setMaxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
  }

  public GuaranteedSimulationServiceInventoryResult unavailableReasons(List<GuaranteedSimulationServiceUnavailableReason> unavailableReasons) {
    this.unavailableReasons = unavailableReasons;
    return this;
  }

  public GuaranteedSimulationServiceInventoryResult addUnavailableReasonsItem(GuaranteedSimulationServiceUnavailableReason unavailableReasonsItem) {
    if (this.unavailableReasons == null) {
      this.unavailableReasons = new ArrayList<>();
    }
    this.unavailableReasons.add(unavailableReasonsItem);
    return this;
  }

  /**
   * Get unavailableReasons
   * @return unavailableReasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GuaranteedSimulationServiceUnavailableReason> getUnavailableReasons() {
    return unavailableReasons;
  }

  public void setUnavailableReasons(List<GuaranteedSimulationServiceUnavailableReason> unavailableReasons) {
    this.unavailableReasons = unavailableReasons;
  }

  public GuaranteedSimulationServiceInventoryResult unreservableReason(GuaranteedSimulationServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
    return this;
  }

  /**
   * Get unreservableReason
   * @return unreservableReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteedSimulationServiceUnreservableReason getUnreservableReason() {
    return unreservableReason;
  }

  public void setUnreservableReason(GuaranteedSimulationServiceUnreservableReason unreservableReason) {
    this.unreservableReason = unreservableReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedSimulationServiceInventoryResult guaranteedSimulationServiceInventoryResult = (GuaranteedSimulationServiceInventoryResult) o;
    return Objects.equals(this.startDate, guaranteedSimulationServiceInventoryResult.startDate) &&
        Objects.equals(this.endDate, guaranteedSimulationServiceInventoryResult.endDate) &&
        Objects.equals(this.maxSellableVImps, guaranteedSimulationServiceInventoryResult.maxSellableVImps) &&
        Objects.equals(this.maxReservableVImps, guaranteedSimulationServiceInventoryResult.maxReservableVImps) &&
        Objects.equals(this.sellingSlots, guaranteedSimulationServiceInventoryResult.sellingSlots) &&
        Objects.equals(this.maxReservableSlots, guaranteedSimulationServiceInventoryResult.maxReservableSlots) &&
        Objects.equals(this.unavailableReasons, guaranteedSimulationServiceInventoryResult.unavailableReasons) &&
        Objects.equals(this.unreservableReason, guaranteedSimulationServiceInventoryResult.unreservableReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, maxSellableVImps, maxReservableVImps, sellingSlots, maxReservableSlots, unavailableReasons, unreservableReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedSimulationServiceInventoryResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    maxSellableVImps: ").append(toIndentedString(maxSellableVImps)).append("\n");
    sb.append("    maxReservableVImps: ").append(toIndentedString(maxReservableVImps)).append("\n");
    sb.append("    sellingSlots: ").append(toIndentedString(sellingSlots)).append("\n");
    sb.append("    maxReservableSlots: ").append(toIndentedString(maxReservableSlots)).append("\n");
    sb.append("    unavailableReasons: ").append(toIndentedString(unavailableReasons)).append("\n");
    sb.append("    unreservableReason: ").append(toIndentedString(unreservableReason)).append("\n");
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

