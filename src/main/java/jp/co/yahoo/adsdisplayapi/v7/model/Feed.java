package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、Feed情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object contains Feed informaton.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feedオブジェクトは、Feed情報を保持します。</div> <div lang=\"en\">Feed object contains Feed informaton.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Feed   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("feedName")
  private String feedName = null;

  @JsonProperty("itemCount")
  private Integer itemCount = null;

  @JsonProperty("approvedItemCount")
  private Integer approvedItemCount = null;

  @JsonProperty("disApprovedItemCount")
  private Integer disApprovedItemCount = null;

  public Feed accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Feed feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in SET and REMOVE operation. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIDです。<br> SET時およびREMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> ID for identifying Feed.<br> This field is required in SET and REMOVE operation. </div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public Feed feedName(String feedName) {
    this.feedName = feedName;
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別する名称です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Name for identifying Feed.<br> This field is required in ADD operation, and will be optional in SET operation. </div> 
   * @return feedName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別する名称です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Name for identifying Feed.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")


  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }

  public Feed itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * <div lang=\"ja\"> アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return itemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public Feed approvedItemCount(Integer approvedItemCount) {
    this.approvedItemCount = approvedItemCount;
    return this;
  }

  /**
   * <div lang=\"ja\"> 審査済みアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of approved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return approvedItemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 審査済みアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of approved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Integer getApprovedItemCount() {
    return approvedItemCount;
  }

  public void setApprovedItemCount(Integer approvedItemCount) {
    this.approvedItemCount = approvedItemCount;
  }

  public Feed disApprovedItemCount(Integer disApprovedItemCount) {
    this.disApprovedItemCount = disApprovedItemCount;
    return this;
  }

  /**
   * <div lang=\"ja\"> 審査否認アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of disapproved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return disApprovedItemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 審査否認アイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of disapproved items.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Integer getDisApprovedItemCount() {
    return disApprovedItemCount;
  }

  public void setDisApprovedItemCount(Integer disApprovedItemCount) {
    this.disApprovedItemCount = disApprovedItemCount;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

