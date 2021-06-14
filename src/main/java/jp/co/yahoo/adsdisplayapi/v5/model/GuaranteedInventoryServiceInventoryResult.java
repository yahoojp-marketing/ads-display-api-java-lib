package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.GuaranteedInventoryServiceUnavailableReason;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryServiceInventoryResultオブジェクトは、在庫の確認結果を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventoryServiceInventoryResult describes the result of inventory check. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryServiceInventoryResultオブジェクトは、在庫の確認結果を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">GuaranteedInventoryServiceInventoryResult describes the result of inventory check. <br> Although this field will be returned in the response, it will be ignored on input.</div> ")

public class GuaranteedInventoryServiceInventoryResult   {
  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("maxSellableVImps")
  private JsonNullable<Long> maxSellableVImps = JsonNullable.undefined();

  @JsonProperty("maxReservableVImps")
  private JsonNullable<Long> maxReservableVImps = JsonNullable.undefined();

  @JsonProperty("sellingSlots")
  private JsonNullable<Long> sellingSlots = JsonNullable.undefined();

  @JsonProperty("maxReservableSlots")
  private JsonNullable<Long> maxReservableSlots = JsonNullable.undefined();

  @JsonProperty("unavailableReasons")
  @Valid
  private JsonNullable<List<GuaranteedInventoryServiceUnavailableReason>> unavailableReasons = JsonNullable.undefined();

  public GuaranteedInventoryServiceInventoryResult startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの開始日です。<br> </div> <div lang=\"en\"> Start date of campaign. <br> </div> Format: yyyyMMdd 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始日です。<br> </div> <div lang=\"en\"> Start date of campaign. <br> </div> Format: yyyyMMdd ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public GuaranteedInventoryServiceInventoryResult endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> キャンペーンの終了日です。<br> </div> <div lang=\"en\"> End date of campaign. <br> </div> Format: yyyyMMdd 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了日です。<br> </div> <div lang=\"en\"> End date of campaign. <br> </div> Format: yyyyMMdd ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public GuaranteedInventoryServiceInventoryResult maxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = JsonNullable.of(maxSellableVImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で販売可能なビューアブルインプレッション数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable viewable impression under the specified period.<br> </div> 
   * @return maxSellableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能なビューアブルインプレッション数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable viewable impression under the specified period.<br> </div> ")


  public JsonNullable<Long> getMaxSellableVImps() {
    return maxSellableVImps;
  }

  public void setMaxSellableVImps(JsonNullable<Long> maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
  }

  public GuaranteedInventoryServiceInventoryResult maxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = JsonNullable.of(maxReservableVImps);
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間のビューアブルインプレッション数の残在庫です。<br> </div> <div lang=\"en\"> Residual inventory of viewable impression under the specified period.<br> </div> 
   * @return maxReservableVImps
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間のビューアブルインプレッション数の残在庫です。<br> </div> <div lang=\"en\"> Residual inventory of viewable impression under the specified period.<br> </div> ")


  public JsonNullable<Long> getMaxReservableVImps() {
    return maxReservableVImps;
  }

  public void setMaxReservableVImps(JsonNullable<Long> maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
  }

  public GuaranteedInventoryServiceInventoryResult sellingSlots(Long sellingSlots) {
    this.sellingSlots = JsonNullable.of(sellingSlots);
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で販売可能な枠数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable slots under the specified period.<br> </div> 
   * @return sellingSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能な枠数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable slots under the specified period.<br> </div> ")


  public JsonNullable<Long> getSellingSlots() {
    return sellingSlots;
  }

  public void setSellingSlots(JsonNullable<Long> sellingSlots) {
    this.sellingSlots = sellingSlots;
  }

  public GuaranteedInventoryServiceInventoryResult maxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = JsonNullable.of(maxReservableSlots);
    return this;
  }

  /**
   * <div lang=\"ja\"> 指定期間で予約可能な最大枠数です。<br> </div> <div lang=\"en\"> Maximum number of reservable slots under the specified period.<br> </div> 
   * @return maxReservableSlots
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で予約可能な最大枠数です。<br> </div> <div lang=\"en\"> Maximum number of reservable slots under the specified period.<br> </div> ")


  public JsonNullable<Long> getMaxReservableSlots() {
    return maxReservableSlots;
  }

  public void setMaxReservableSlots(JsonNullable<Long> maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
  }

  public GuaranteedInventoryServiceInventoryResult unavailableReasons(List<GuaranteedInventoryServiceUnavailableReason> unavailableReasons) {
    this.unavailableReasons = JsonNullable.of(unavailableReasons);
    return this;
  }

  public GuaranteedInventoryServiceInventoryResult addUnavailableReasonsItem(GuaranteedInventoryServiceUnavailableReason unavailableReasonsItem) {
    if (this.unavailableReasons == null || !this.unavailableReasons.isPresent()) {
      this.unavailableReasons = JsonNullable.of(new ArrayList<>());
    }
    this.unavailableReasons.get().add(unavailableReasonsItem);
    return this;
  }

  /**
   * Get unavailableReasons
   * @return unavailableReasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<GuaranteedInventoryServiceUnavailableReason>> getUnavailableReasons() {
    return unavailableReasons;
  }

  public void setUnavailableReasons(JsonNullable<List<GuaranteedInventoryServiceUnavailableReason>> unavailableReasons) {
    this.unavailableReasons = unavailableReasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteedInventoryServiceInventoryResult guaranteedInventoryServiceInventoryResult = (GuaranteedInventoryServiceInventoryResult) o;
    return Objects.equals(this.startDate, guaranteedInventoryServiceInventoryResult.startDate) &&
        Objects.equals(this.endDate, guaranteedInventoryServiceInventoryResult.endDate) &&
        Objects.equals(this.maxSellableVImps, guaranteedInventoryServiceInventoryResult.maxSellableVImps) &&
        Objects.equals(this.maxReservableVImps, guaranteedInventoryServiceInventoryResult.maxReservableVImps) &&
        Objects.equals(this.sellingSlots, guaranteedInventoryServiceInventoryResult.sellingSlots) &&
        Objects.equals(this.maxReservableSlots, guaranteedInventoryServiceInventoryResult.maxReservableSlots) &&
        Objects.equals(this.unavailableReasons, guaranteedInventoryServiceInventoryResult.unavailableReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, maxSellableVImps, maxReservableVImps, sellingSlots, maxReservableSlots, unavailableReasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteedInventoryServiceInventoryResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    maxSellableVImps: ").append(toIndentedString(maxSellableVImps)).append("\n");
    sb.append("    maxReservableVImps: ").append(toIndentedString(maxReservableVImps)).append("\n");
    sb.append("    sellingSlots: ").append(toIndentedString(sellingSlots)).append("\n");
    sb.append("    maxReservableSlots: ").append(toIndentedString(maxReservableSlots)).append("\n");
    sb.append("    unavailableReasons: ").append(toIndentedString(unavailableReasons)).append("\n");
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

