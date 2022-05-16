/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedInventoryServiceUnavailableReason;
import jp.co.yahoo.adsdisplayapi.v8.model.GuaranteedInventoryServiceUnreservableReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;GuaranteedInventoryServiceInventoryResultオブジェクトは、在庫の確認結果を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;GuaranteedInventoryServiceInventoryResult describes the result of inventory check. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">GuaranteedInventoryServiceInventoryResultオブジェクトは、在庫の確認結果を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">GuaranteedInventoryServiceInventoryResult describes the result of inventory check. <br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@JsonPropertyOrder({
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_START_DATE,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_END_DATE,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_MAX_SELLABLE_V_IMPS,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_MAX_RESERVABLE_V_IMPS,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_SELLING_SLOTS,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_MAX_RESERVABLE_SLOTS,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_UNAVAILABLE_REASONS,
  GuaranteedInventoryServiceInventoryResult.JSON_PROPERTY_UNRESERVABLE_REASON
})
@JsonTypeName("GuaranteedInventoryServiceInventoryResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuaranteedInventoryServiceInventoryResult {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_MAX_SELLABLE_V_IMPS = "maxSellableVImps";
  private Long maxSellableVImps;

  public static final String JSON_PROPERTY_MAX_RESERVABLE_V_IMPS = "maxReservableVImps";
  private Long maxReservableVImps;

  public static final String JSON_PROPERTY_SELLING_SLOTS = "sellingSlots";
  private Long sellingSlots;

  public static final String JSON_PROPERTY_MAX_RESERVABLE_SLOTS = "maxReservableSlots";
  private Long maxReservableSlots;

  public static final String JSON_PROPERTY_UNAVAILABLE_REASONS = "unavailableReasons";
  private List<GuaranteedInventoryServiceUnavailableReason> unavailableReasons = null;

  public static final String JSON_PROPERTY_UNRESERVABLE_REASON = "unreservableReason";
  private GuaranteedInventoryServiceUnreservableReason unreservableReason;

  public GuaranteedInventoryServiceInventoryResult() { 
  }

  public GuaranteedInventoryServiceInventoryResult startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンの開始日です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date of campaign. &lt;br&gt; &lt;/div&gt; Format: yyyyMMdd 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの開始日です。<br> </div> <div lang=\"en\"> Start date of campaign. <br> </div> Format: yyyyMMdd ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public GuaranteedInventoryServiceInventoryResult endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンの終了日です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date of campaign. &lt;br&gt; &lt;/div&gt; Format: yyyyMMdd 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンの終了日です。<br> </div> <div lang=\"en\"> End date of campaign. <br> </div> Format: yyyyMMdd ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public GuaranteedInventoryServiceInventoryResult maxSellableVImps(Long maxSellableVImps) {
    
    this.maxSellableVImps = maxSellableVImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 指定期間で販売可能なビューアブルインプレッション数の在庫です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Inventory of sellable viewable impression under the specified period.&lt;br&gt; &lt;/div&gt; 
   * @return maxSellableVImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能なビューアブルインプレッション数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable viewable impression under the specified period.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_SELLABLE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxSellableVImps() {
    return maxSellableVImps;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SELLABLE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSellableVImps(Long maxSellableVImps) {
    this.maxSellableVImps = maxSellableVImps;
  }


  public GuaranteedInventoryServiceInventoryResult maxReservableVImps(Long maxReservableVImps) {
    
    this.maxReservableVImps = maxReservableVImps;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 指定期間のビューアブルインプレッション数の残在庫です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Residual inventory of viewable impression under the specified period.&lt;br&gt; &lt;/div&gt; 
   * @return maxReservableVImps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間のビューアブルインプレッション数の残在庫です。<br> </div> <div lang=\"en\"> Residual inventory of viewable impression under the specified period.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_RESERVABLE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxReservableVImps() {
    return maxReservableVImps;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESERVABLE_V_IMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxReservableVImps(Long maxReservableVImps) {
    this.maxReservableVImps = maxReservableVImps;
  }


  public GuaranteedInventoryServiceInventoryResult sellingSlots(Long sellingSlots) {
    
    this.sellingSlots = sellingSlots;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 指定期間で販売可能な枠数の在庫です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Inventory of sellable slots under the specified period.&lt;br&gt; &lt;/div&gt; 
   * @return sellingSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で販売可能な枠数の在庫です。<br> </div> <div lang=\"en\"> Inventory of sellable slots under the specified period.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_SELLING_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSellingSlots() {
    return sellingSlots;
  }


  @JsonProperty(JSON_PROPERTY_SELLING_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSellingSlots(Long sellingSlots) {
    this.sellingSlots = sellingSlots;
  }


  public GuaranteedInventoryServiceInventoryResult maxReservableSlots(Long maxReservableSlots) {
    
    this.maxReservableSlots = maxReservableSlots;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 指定期間で予約可能な最大枠数です。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Maximum number of reservable slots under the specified period.&lt;br&gt; &lt;/div&gt; 
   * @return maxReservableSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 指定期間で予約可能な最大枠数です。<br> </div> <div lang=\"en\"> Maximum number of reservable slots under the specified period.<br> </div> ")
  @JsonProperty(JSON_PROPERTY_MAX_RESERVABLE_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxReservableSlots() {
    return maxReservableSlots;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESERVABLE_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxReservableSlots(Long maxReservableSlots) {
    this.maxReservableSlots = maxReservableSlots;
  }


  public GuaranteedInventoryServiceInventoryResult unavailableReasons(List<GuaranteedInventoryServiceUnavailableReason> unavailableReasons) {
    
    this.unavailableReasons = unavailableReasons;
    return this;
  }

  public GuaranteedInventoryServiceInventoryResult addUnavailableReasonsItem(GuaranteedInventoryServiceUnavailableReason unavailableReasonsItem) {
    if (this.unavailableReasons == null) {
      this.unavailableReasons = new ArrayList<>();
    }
    this.unavailableReasons.add(unavailableReasonsItem);
    return this;
  }

   /**
   * Get unavailableReasons
   * @return unavailableReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNAVAILABLE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GuaranteedInventoryServiceUnavailableReason> getUnavailableReasons() {
    return unavailableReasons;
  }


  @JsonProperty(JSON_PROPERTY_UNAVAILABLE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnavailableReasons(List<GuaranteedInventoryServiceUnavailableReason> unavailableReasons) {
    this.unavailableReasons = unavailableReasons;
  }


  public GuaranteedInventoryServiceInventoryResult unreservableReason(GuaranteedInventoryServiceUnreservableReason unreservableReason) {
    
    this.unreservableReason = unreservableReason;
    return this;
  }

   /**
   * Get unreservableReason
   * @return unreservableReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNRESERVABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuaranteedInventoryServiceUnreservableReason getUnreservableReason() {
    return unreservableReason;
  }


  @JsonProperty(JSON_PROPERTY_UNRESERVABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnreservableReason(GuaranteedInventoryServiceUnreservableReason unreservableReason) {
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
    GuaranteedInventoryServiceInventoryResult guaranteedInventoryServiceInventoryResult = (GuaranteedInventoryServiceInventoryResult) o;
    return Objects.equals(this.startDate, guaranteedInventoryServiceInventoryResult.startDate) &&
        Objects.equals(this.endDate, guaranteedInventoryServiceInventoryResult.endDate) &&
        Objects.equals(this.maxSellableVImps, guaranteedInventoryServiceInventoryResult.maxSellableVImps) &&
        Objects.equals(this.maxReservableVImps, guaranteedInventoryServiceInventoryResult.maxReservableVImps) &&
        Objects.equals(this.sellingSlots, guaranteedInventoryServiceInventoryResult.sellingSlots) &&
        Objects.equals(this.maxReservableSlots, guaranteedInventoryServiceInventoryResult.maxReservableSlots) &&
        Objects.equals(this.unavailableReasons, guaranteedInventoryServiceInventoryResult.unavailableReasons) &&
        Objects.equals(this.unreservableReason, guaranteedInventoryServiceInventoryResult.unreservableReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, maxSellableVImps, maxReservableVImps, sellingSlots, maxReservableSlots, unavailableReasons, unreservableReason);
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

