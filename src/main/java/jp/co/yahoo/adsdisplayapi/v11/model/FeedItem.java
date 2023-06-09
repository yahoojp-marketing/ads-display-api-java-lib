/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v11.model.FeedItemServiceAvailability;
import jp.co.yahoo.adsdisplayapi.v11.model.FeedItemServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemオブジェクトは、商品の情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem object contain information about the product.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemオブジェクトは、商品の情報を格納するコンテナです。</div> <div lang=\"en\">FeedItem object contain information about the product.</div> ")
@JsonPropertyOrder({
  FeedItem.JSON_PROPERTY_AVAILABILITY,
  FeedItem.JSON_PROPERTY_CAPACITY,
  FeedItem.JSON_PROPERTY_DISPLAY_SETTINGS,
  FeedItem.JSON_PROPERTY_FEED_ID,
  FeedItem.JSON_PROPERTY_FORMATTED_PRICE,
  FeedItem.JSON_PROPERTY_FORMATTED_SALE_PRICE,
  FeedItem.JSON_PROPERTY_IN_STOCK,
  FeedItem.JSON_PROPERTY_IS_REMOVE_CAPACITY,
  FeedItem.JSON_PROPERTY_IS_REMOVE_FORMATTED_PRICE,
  FeedItem.JSON_PROPERTY_IS_REMOVE_FORMATTED_SALE_PRICE,
  FeedItem.JSON_PROPERTY_IS_REMOVE_PRICE,
  FeedItem.JSON_PROPERTY_IS_REMOVE_SALE_PRICE,
  FeedItem.JSON_PROPERTY_ITEM_ID,
  FeedItem.JSON_PROPERTY_PRICE,
  FeedItem.JSON_PROPERTY_SALE_PRICE
})
@JsonTypeName("FeedItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItem {
  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private FeedItemServiceAvailability availability;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private Long capacity;

  public static final String JSON_PROPERTY_DISPLAY_SETTINGS = "displaySettings";
  private Long displaySettings;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FORMATTED_PRICE = "formattedPrice";
  private String formattedPrice;

  public static final String JSON_PROPERTY_FORMATTED_SALE_PRICE = "formattedSalePrice";
  private String formattedSalePrice;

  public static final String JSON_PROPERTY_IN_STOCK = "inStock";
  private Long inStock;

  public static final String JSON_PROPERTY_IS_REMOVE_CAPACITY = "isRemoveCapacity";
  private FeedItemServiceIsRemoveFlg isRemoveCapacity;

  public static final String JSON_PROPERTY_IS_REMOVE_FORMATTED_PRICE = "isRemoveFormattedPrice";
  private FeedItemServiceIsRemoveFlg isRemoveFormattedPrice;

  public static final String JSON_PROPERTY_IS_REMOVE_FORMATTED_SALE_PRICE = "isRemoveFormattedSalePrice";
  private FeedItemServiceIsRemoveFlg isRemoveFormattedSalePrice;

  public static final String JSON_PROPERTY_IS_REMOVE_PRICE = "isRemovePrice";
  private FeedItemServiceIsRemoveFlg isRemovePrice;

  public static final String JSON_PROPERTY_IS_REMOVE_SALE_PRICE = "isRemoveSalePrice";
  private FeedItemServiceIsRemoveFlg isRemoveSalePrice;

  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private String itemId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Long price;

  public static final String JSON_PROPERTY_SALE_PRICE = "salePrice";
  private Long salePrice;

  public FeedItem() { 
  }

  public FeedItem availability(FeedItemServiceAvailability availability) {
    
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceAvailability getAvailability() {
    return availability;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailability(FeedItemServiceAvailability availability) {
    this.availability = availability;
  }


  public FeedItem capacity(Long capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 在庫数です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Stock quantity.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return capacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫数です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Stock quantity.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCapacity() {
    return capacity;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }


  public FeedItem displaySettings(Long displaySettings) {
    
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 配信設定です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。&lt;br&gt; ※「0:配信しない/1:配信する」を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Display settings.&lt;br&gt; This field is optional in requests.&lt;br&gt; * 0: Off, 1: On. &lt;/div&gt; 
   * @return displaySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 配信設定です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:配信しない/1:配信する」を表します。 </div> <div lang=\"en\"> Display settings.<br> This field is optional in requests.<br> * 0: Off, 1: On. </div> ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDisplaySettings() {
    return displaySettings;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplaySettings(Long displaySettings) {
    this.displaySettings = displaySettings;
  }


  public FeedItem feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; Feedを識別するIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; ID for identifying Feed.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public FeedItem formattedPrice(String formattedPrice) {
    
    this.formattedPrice = formattedPrice;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 文字列の価格です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Text strings price.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return formattedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 文字列の価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Text strings price.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_FORMATTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormattedPrice() {
    return formattedPrice;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormattedPrice(String formattedPrice) {
    this.formattedPrice = formattedPrice;
  }


  public FeedItem formattedSalePrice(String formattedSalePrice) {
    
    this.formattedSalePrice = formattedSalePrice;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 文字列のセール価格です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Sale price of text strings.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return formattedSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 文字列のセール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price of text strings.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_FORMATTED_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormattedSalePrice() {
    return formattedSalePrice;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormattedSalePrice(String formattedSalePrice) {
    this.formattedSalePrice = formattedSalePrice;
  }


  public FeedItem inStock(Long inStock) {
    
    this.inStock = inStock;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 在庫情報です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。&lt;br&gt; ※「0:在庫なし/1:在庫あり」を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Inventory information.&lt;br&gt; This field is optional in requests.&lt;br&gt; 0: Out of stock, 1: In stock. &lt;/div&gt; 
   * @return inStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 在庫情報です。<br> このフィールドは、リクエストの場合は省略可能です。<br> ※「0:在庫なし/1:在庫あり」を表します。 </div> <div lang=\"en\"> Inventory information.<br> This field is optional in requests.<br> 0: Out of stock, 1: In stock. </div> ")
  @JsonProperty(JSON_PROPERTY_IN_STOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInStock() {
    return inStock;
  }


  @JsonProperty(JSON_PROPERTY_IN_STOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInStock(Long inStock) {
    this.inStock = inStock;
  }


  public FeedItem isRemoveCapacity(FeedItemServiceIsRemoveFlg isRemoveCapacity) {
    
    this.isRemoveCapacity = isRemoveCapacity;
    return this;
  }

   /**
   * Get isRemoveCapacity
   * @return isRemoveCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemoveFlg getIsRemoveCapacity() {
    return isRemoveCapacity;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveCapacity(FeedItemServiceIsRemoveFlg isRemoveCapacity) {
    this.isRemoveCapacity = isRemoveCapacity;
  }


  public FeedItem isRemoveFormattedPrice(FeedItemServiceIsRemoveFlg isRemoveFormattedPrice) {
    
    this.isRemoveFormattedPrice = isRemoveFormattedPrice;
    return this;
  }

   /**
   * Get isRemoveFormattedPrice
   * @return isRemoveFormattedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_FORMATTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemoveFlg getIsRemoveFormattedPrice() {
    return isRemoveFormattedPrice;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_FORMATTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveFormattedPrice(FeedItemServiceIsRemoveFlg isRemoveFormattedPrice) {
    this.isRemoveFormattedPrice = isRemoveFormattedPrice;
  }


  public FeedItem isRemoveFormattedSalePrice(FeedItemServiceIsRemoveFlg isRemoveFormattedSalePrice) {
    
    this.isRemoveFormattedSalePrice = isRemoveFormattedSalePrice;
    return this;
  }

   /**
   * Get isRemoveFormattedSalePrice
   * @return isRemoveFormattedSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_FORMATTED_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemoveFlg getIsRemoveFormattedSalePrice() {
    return isRemoveFormattedSalePrice;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_FORMATTED_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveFormattedSalePrice(FeedItemServiceIsRemoveFlg isRemoveFormattedSalePrice) {
    this.isRemoveFormattedSalePrice = isRemoveFormattedSalePrice;
  }


  public FeedItem isRemovePrice(FeedItemServiceIsRemoveFlg isRemovePrice) {
    
    this.isRemovePrice = isRemovePrice;
    return this;
  }

   /**
   * Get isRemovePrice
   * @return isRemovePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemoveFlg getIsRemovePrice() {
    return isRemovePrice;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemovePrice(FeedItemServiceIsRemoveFlg isRemovePrice) {
    this.isRemovePrice = isRemovePrice;
  }


  public FeedItem isRemoveSalePrice(FeedItemServiceIsRemoveFlg isRemoveSalePrice) {
    
    this.isRemoveSalePrice = isRemoveSalePrice;
    return this;
  }

   /**
   * Get isRemoveSalePrice
   * @return isRemoveSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemoveFlg getIsRemoveSalePrice() {
    return isRemoveSalePrice;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSalePrice(FeedItemServiceIsRemoveFlg isRemoveSalePrice) {
    this.isRemoveSalePrice = isRemoveSalePrice;
  }


  public FeedItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品IDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Item ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品IDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Item ID.<br> This field is required in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public FeedItem price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 価格です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Price.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Price.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Long price) {
    this.price = price;
  }


  public FeedItem salePrice(Long salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; セール価格です。&lt;br&gt; このフィールドは、リクエストの場合は省略可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Sale price.&lt;br&gt; This field is optional in requests. &lt;/div&gt; 
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> セール価格です。<br> このフィールドは、リクエストの場合は省略可能です。 </div> <div lang=\"en\"> Sale price.<br> This field is optional in requests. </div> ")
  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSalePrice() {
    return salePrice;
  }


  @JsonProperty(JSON_PROPERTY_SALE_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalePrice(Long salePrice) {
    this.salePrice = salePrice;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

