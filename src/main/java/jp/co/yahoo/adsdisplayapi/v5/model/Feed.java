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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、Feed情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object contains Feed informaton.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feedオブジェクトは、Feed情報を保持します。</div> <div lang=\"en\">Feed object contains Feed informaton.</div> ")

public class Feed   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("feedName")
  private JsonNullable<String> feedName = JsonNullable.undefined();

  @JsonProperty("itemCount")
  private JsonNullable<Integer> itemCount = JsonNullable.undefined();

  @JsonProperty("approvedItemCount")
  private JsonNullable<Integer> approvedItemCount = JsonNullable.undefined();

  @JsonProperty("disApprovedItemCount")
  private JsonNullable<Integer> disApprovedItemCount = JsonNullable.undefined();

  public Feed accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Feed feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in SET and REMOVE operation. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in SET and REMOVE operation. </div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public Feed feedName(String feedName) {
    this.feedName = JsonNullable.of(feedName);
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別する名称です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Name for identifying Feed.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return feedName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別する名称です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Name for identifying Feed.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public JsonNullable<String> getFeedName() {
    return feedName;
  }

  public void setFeedName(JsonNullable<String> feedName) {
    this.feedName = feedName;
  }

  public Feed itemCount(Integer itemCount) {
    this.itemCount = JsonNullable.of(itemCount);
    return this;
  }

  /**
   * <div lang=\"ja\"> アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return itemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Integer> getItemCount() {
    return itemCount;
  }

  public void setItemCount(JsonNullable<Integer> itemCount) {
    this.itemCount = itemCount;
  }

  public Feed approvedItemCount(Integer approvedItemCount) {
    this.approvedItemCount = JsonNullable.of(approvedItemCount);
    return this;
  }

  /**
   * <div lang=\"ja\"> 審査済みアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of approved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return approvedItemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 審査済みアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of approved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Integer> getApprovedItemCount() {
    return approvedItemCount;
  }

  public void setApprovedItemCount(JsonNullable<Integer> approvedItemCount) {
    this.approvedItemCount = approvedItemCount;
  }

  public Feed disApprovedItemCount(Integer disApprovedItemCount) {
    this.disApprovedItemCount = JsonNullable.of(disApprovedItemCount);
    return this;
  }

  /**
   * <div lang=\"ja\"> 審査否認アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of disapproved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disApprovedItemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 審査否認アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of disapproved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<Integer> getDisApprovedItemCount() {
    return disApprovedItemCount;
  }

  public void setDisApprovedItemCount(JsonNullable<Integer> disApprovedItemCount) {
    this.disApprovedItemCount = disApprovedItemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feed feed = (Feed) o;
    return Objects.equals(this.accountId, feed.accountId) &&
        Objects.equals(this.feedId, feed.feedId) &&
        Objects.equals(this.feedName, feed.feedName) &&
        Objects.equals(this.itemCount, feed.itemCount) &&
        Objects.equals(this.approvedItemCount, feed.approvedItemCount) &&
        Objects.equals(this.disApprovedItemCount, feed.disApprovedItemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedId, feedName, itemCount, approvedItemCount, disApprovedItemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feed {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    approvedItemCount: ").append(toIndentedString(approvedItemCount)).append("\n");
    sb.append("    disApprovedItemCount: ").append(toIndentedString(disApprovedItemCount)).append("\n");
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

