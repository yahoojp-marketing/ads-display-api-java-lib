package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedItemServiceAvailability;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedItemServiceIsRemoveFlg;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemオブジェクトは、商品の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem object contain information about the product.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemオブジェクトは、商品の情報を格納するコンテナです。</div> <div lang=\"en\">FeedItem object contain information about the product.</div> ")

public class FeedItem   {
  @JsonProperty("availability")
  private JsonNullable<FeedItemServiceAvailability> availability = JsonNullable.undefined();

  @JsonProperty("capacity")
  private JsonNullable<Long> capacity = JsonNullable.undefined();

  @JsonProperty("displaySettings")
  private JsonNullable<Long> displaySettings = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("formattedPrice")
  private JsonNullable<String> formattedPrice = JsonNullable.undefined();

  @JsonProperty("formattedSalePrice")
  private JsonNullable<String> formattedSalePrice = JsonNullable.undefined();

  @JsonProperty("inStock")
  private JsonNullable<Long> inStock = JsonNullable.undefined();

  @JsonProperty("isRemoveCapacity")
  private JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveCapacity = JsonNullable.undefined();

  @JsonProperty("isRemoveFormattedPrice")
  private JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveFormattedPrice = JsonNullable.undefined();

  @JsonProperty("isRemoveFormattedSalePrice")
  private JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveFormattedSalePrice = JsonNullable.undefined();

  @JsonProperty("isRemovePrice")
  private JsonNullable<FeedItemServiceIsRemoveFlg> isRemovePrice = JsonNullable.undefined();

  @JsonProperty("isRemoveSalePrice")
  private JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveSalePrice = JsonNullable.undefined();

  @JsonProperty("itemId")
  private JsonNullable<String> itemId = JsonNullable.undefined();

  @JsonProperty("price")
  private JsonNullable<Long> price = JsonNullable.undefined();

  @JsonProperty("salePrice")
  private JsonNullable<Long> salePrice = JsonNullable.undefined();

  public FeedItem availability(FeedItemServiceAvailability availability) {
    this.availability = JsonNullable.of(availability);
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceAvailability> getAvailability() {
    return availability;
  }

  public void setAvailability(JsonNullable<FeedItemServiceAvailability> availability) {
    this.availability = availability;
  }

  public FeedItem capacity(Long capacity) {
    this.capacity = JsonNullable.of(capacity);
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫数です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Stock quantity.<br> This field is optional in requests. </div> 
   * @return capacity
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫数です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Stock quantity.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getCapacity() {
    return capacity;
  }

  public void setCapacity(JsonNullable<Long> capacity) {
    this.capacity = capacity;
  }

  public FeedItem displaySettings(Long displaySettings) {
    this.displaySettings = JsonNullable.of(displaySettings);
    return this;
  }

  /**
   * <div lang=\"ja\"> 配信設定です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:配信しない/1:配信する」を表します。 </div> <div lang=\"en\"> Display settings.<br> This field is optional in requests.<br> * 0: Off, 1: On. </div> 
   * @return displaySettings
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 配信設定です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:配信しない/1:配信する」を表します。 </div> <div lang=\"en\"> Display settings.<br> This field is optional in requests.<br> * 0: Off, 1: On. </div> ")


  public JsonNullable<Long> getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(JsonNullable<Long> displaySettings) {
    this.displaySettings = displaySettings;
  }

  public FeedItem feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in requests. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public FeedItem formattedPrice(String formattedPrice) {
    this.formattedPrice = JsonNullable.of(formattedPrice);
    return this;
  }

  /**
   * <div lang=\"ja\"> 文字列の価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Text strings price.<br> This field is optional in requests. </div> 
   * @return formattedPrice
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 文字列の価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Text strings price.<br> This field is optional in requests. </div> ")


  public JsonNullable<String> getFormattedPrice() {
    return formattedPrice;
  }

  public void setFormattedPrice(JsonNullable<String> formattedPrice) {
    this.formattedPrice = formattedPrice;
  }

  public FeedItem formattedSalePrice(String formattedSalePrice) {
    this.formattedSalePrice = JsonNullable.of(formattedSalePrice);
    return this;
  }

  /**
   * <div lang=\"ja\"> 文字列のセール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price of text strings.<br> This field is optional in requests. </div> 
   * @return formattedSalePrice
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 文字列のセール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price of text strings.<br> This field is optional in requests. </div> ")


  public JsonNullable<String> getFormattedSalePrice() {
    return formattedSalePrice;
  }

  public void setFormattedSalePrice(JsonNullable<String> formattedSalePrice) {
    this.formattedSalePrice = formattedSalePrice;
  }

  public FeedItem inStock(Long inStock) {
    this.inStock = JsonNullable.of(inStock);
    return this;
  }

  /**
   * <div lang=\"ja\"> 在庫情報です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:在庫なし/1:在庫あり」を表します。 </div> <div lang=\"en\"> Inventory information.<br> This field is optional in requests.<br> 0: Out of stock, 1: In stock. </div> 
   * @return inStock
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫情報です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:在庫なし/1:在庫あり」を表します。 </div> <div lang=\"en\"> Inventory information.<br> This field is optional in requests.<br> 0: Out of stock, 1: In stock. </div> ")


  public JsonNullable<Long> getInStock() {
    return inStock;
  }

  public void setInStock(JsonNullable<Long> inStock) {
    this.inStock = inStock;
  }

  public FeedItem isRemoveCapacity(FeedItemServiceIsRemoveFlg isRemoveCapacity) {
    this.isRemoveCapacity = JsonNullable.of(isRemoveCapacity);
    return this;
  }

  /**
   * Get isRemoveCapacity
   * @return isRemoveCapacity
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemoveFlg> getIsRemoveCapacity() {
    return isRemoveCapacity;
  }

  public void setIsRemoveCapacity(JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveCapacity) {
    this.isRemoveCapacity = isRemoveCapacity;
  }

  public FeedItem isRemoveFormattedPrice(FeedItemServiceIsRemoveFlg isRemoveFormattedPrice) {
    this.isRemoveFormattedPrice = JsonNullable.of(isRemoveFormattedPrice);
    return this;
  }

  /**
   * Get isRemoveFormattedPrice
   * @return isRemoveFormattedPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemoveFlg> getIsRemoveFormattedPrice() {
    return isRemoveFormattedPrice;
  }

  public void setIsRemoveFormattedPrice(JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveFormattedPrice) {
    this.isRemoveFormattedPrice = isRemoveFormattedPrice;
  }

  public FeedItem isRemoveFormattedSalePrice(FeedItemServiceIsRemoveFlg isRemoveFormattedSalePrice) {
    this.isRemoveFormattedSalePrice = JsonNullable.of(isRemoveFormattedSalePrice);
    return this;
  }

  /**
   * Get isRemoveFormattedSalePrice
   * @return isRemoveFormattedSalePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemoveFlg> getIsRemoveFormattedSalePrice() {
    return isRemoveFormattedSalePrice;
  }

  public void setIsRemoveFormattedSalePrice(JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveFormattedSalePrice) {
    this.isRemoveFormattedSalePrice = isRemoveFormattedSalePrice;
  }

  public FeedItem isRemovePrice(FeedItemServiceIsRemoveFlg isRemovePrice) {
    this.isRemovePrice = JsonNullable.of(isRemovePrice);
    return this;
  }

  /**
   * Get isRemovePrice
   * @return isRemovePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemoveFlg> getIsRemovePrice() {
    return isRemovePrice;
  }

  public void setIsRemovePrice(JsonNullable<FeedItemServiceIsRemoveFlg> isRemovePrice) {
    this.isRemovePrice = isRemovePrice;
  }

  public FeedItem isRemoveSalePrice(FeedItemServiceIsRemoveFlg isRemoveSalePrice) {
    this.isRemoveSalePrice = JsonNullable.of(isRemoveSalePrice);
    return this;
  }

  /**
   * Get isRemoveSalePrice
   * @return isRemoveSalePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemoveFlg> getIsRemoveSalePrice() {
    return isRemoveSalePrice;
  }

  public void setIsRemoveSalePrice(JsonNullable<FeedItemServiceIsRemoveFlg> isRemoveSalePrice) {
    this.isRemoveSalePrice = isRemoveSalePrice;
  }

  public FeedItem itemId(String itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品IDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Item ID.<br> This field is required in requests. </div> 
   * @return itemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Item ID.<br> This field is required in requests. </div> ")


  public JsonNullable<String> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<String> itemId) {
    this.itemId = itemId;
  }

  public FeedItem price(Long price) {
    this.price = JsonNullable.of(price);
    return this;
  }

  /**
   * <div lang=\"ja\"> 価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Price.<br> This field is optional in requests. </div> 
   * @return price
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Price.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getPrice() {
    return price;
  }

  public void setPrice(JsonNullable<Long> price) {
    this.price = price;
  }

  public FeedItem salePrice(Long salePrice) {
    this.salePrice = JsonNullable.of(salePrice);
    return this;
  }

  /**
   * <div lang=\"ja\"> セール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price.<br> This field is optional in requests. </div> 
   * @return salePrice
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> セール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price.<br> This field is optional in requests. </div> ")


  public JsonNullable<Long> getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(JsonNullable<Long> salePrice) {
    this.salePrice = salePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItem feedItem = (FeedItem) o;
    return Objects.equals(this.availability, feedItem.availability) &&
        Objects.equals(this.capacity, feedItem.capacity) &&
        Objects.equals(this.displaySettings, feedItem.displaySettings) &&
        Objects.equals(this.feedId, feedItem.feedId) &&
        Objects.equals(this.formattedPrice, feedItem.formattedPrice) &&
        Objects.equals(this.formattedSalePrice, feedItem.formattedSalePrice) &&
        Objects.equals(this.inStock, feedItem.inStock) &&
        Objects.equals(this.isRemoveCapacity, feedItem.isRemoveCapacity) &&
        Objects.equals(this.isRemoveFormattedPrice, feedItem.isRemoveFormattedPrice) &&
        Objects.equals(this.isRemoveFormattedSalePrice, feedItem.isRemoveFormattedSalePrice) &&
        Objects.equals(this.isRemovePrice, feedItem.isRemovePrice) &&
        Objects.equals(this.isRemoveSalePrice, feedItem.isRemoveSalePrice) &&
        Objects.equals(this.itemId, feedItem.itemId) &&
        Objects.equals(this.price, feedItem.price) &&
        Objects.equals(this.salePrice, feedItem.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, capacity, displaySettings, feedId, formattedPrice, formattedSalePrice, inStock, isRemoveCapacity, isRemoveFormattedPrice, isRemoveFormattedSalePrice, isRemovePrice, isRemoveSalePrice, itemId, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItem {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    formattedPrice: ").append(toIndentedString(formattedPrice)).append("\n");
    sb.append("    formattedSalePrice: ").append(toIndentedString(formattedSalePrice)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    isRemoveCapacity: ").append(toIndentedString(isRemoveCapacity)).append("\n");
    sb.append("    isRemoveFormattedPrice: ").append(toIndentedString(isRemoveFormattedPrice)).append("\n");
    sb.append("    isRemoveFormattedSalePrice: ").append(toIndentedString(isRemoveFormattedSalePrice)).append("\n");
    sb.append("    isRemovePrice: ").append(toIndentedString(isRemovePrice)).append("\n");
    sb.append("    isRemoveSalePrice: ").append(toIndentedString(isRemoveSalePrice)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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

