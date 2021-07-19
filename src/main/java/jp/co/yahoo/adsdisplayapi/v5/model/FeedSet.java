package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.FeedSetServiceConditionSet;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedSetオブジェクトは、商品セット情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedSet object contains Item Set information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedSetオブジェクトは、商品セット情報を保持します。</div> <div lang=\"en\">FeedSet object contains Item Set information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedSet   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("conditionSets")
  @Valid
  private List<FeedSetServiceConditionSet> conditionSets = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("feedSetId")
  private Long feedSetId = null;

  @JsonProperty("feedSetName")
  private String feedSetName = null;

  @JsonProperty("isDefaultSet")
  private Boolean isDefaultSet = null;

  @JsonProperty("itemCount")
  private Long itemCount = null;

  public FeedSet accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedSet conditionSets(List<FeedSetServiceConditionSet> conditionSets) {
    this.conditionSets = conditionSets;
    return this;
  }

  public FeedSet addConditionSetsItem(FeedSetServiceConditionSet conditionSetsItem) {
    if (this.conditionSets == null) {
      this.conditionSets = new ArrayList<>();
    }
    this.conditionSets.add(conditionSetsItem);
    return this;
  }

  /**
   * Get conditionSets
   * @return conditionSets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedSetServiceConditionSet> getConditionSets() {
    return conditionSets;
  }

  public void setConditionSets(List<FeedSetServiceConditionSet> conditionSets) {
    this.conditionSets = conditionSets;
  }

  public FeedSet feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\"> Feedを識別するIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> Feedを識別するIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Feed ID.<br> This field is required in requests. </div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public FeedSet feedSetId(Long feedSetId) {
    this.feedSetId = feedSetId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セットIDです。<br> REMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Item Set ID.<br> This field is required in REMOVE operation. </div> 
   * @return feedSetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットIDです。<br> REMOVE時、このフィールドは必須です。 </div> <div lang=\"en\"> Item Set ID.<br> This field is required in REMOVE operation. </div> ")


  public Long getFeedSetId() {
    return feedSetId;
  }

  public void setFeedSetId(Long feedSetId) {
    this.feedSetId = feedSetId;
  }

  public FeedSet feedSetName(String feedSetName) {
    this.feedSetName = feedSetName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セット名です。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> Item Set name.<br> This field is required in ADD operation. </div> 
   * @return feedSetName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セット名です。<br> ADD時、このフィールドは必須です。 </div> <div lang=\"en\"> Item Set name.<br> This field is required in ADD operation. </div> ")


  public String getFeedSetName() {
    return feedSetName;
  }

  public void setFeedSetName(String feedSetName) {
    this.feedSetName = feedSetName;
  }

  public FeedSet isDefaultSet(Boolean isDefaultSet) {
    this.isDefaultSet = isDefaultSet;
    return this;
  }

  /**
   * <div lang=\"ja\"> デフォルトセット判定です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Default setting of Item Set or not.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return isDefaultSet
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> デフォルトセット判定です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Default setting of Item Set or not.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Boolean getIsDefaultSet() {
    return isDefaultSet;
  }

  public void setIsDefaultSet(Boolean isDefaultSet) {
    this.isDefaultSet = isDefaultSet;
  }

  public FeedSet itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セットの条件に含まれるアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items included in Item Set conditions.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return itemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットの条件に含まれるアイテム数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Number of items included in Item Set conditions.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSet feedSet = (FeedSet) o;
    return Objects.equals(this.accountId, feedSet.accountId) &&
        Objects.equals(this.conditionSets, feedSet.conditionSets) &&
        Objects.equals(this.feedId, feedSet.feedId) &&
        Objects.equals(this.feedSetId, feedSet.feedSetId) &&
        Objects.equals(this.feedSetName, feedSet.feedSetName) &&
        Objects.equals(this.isDefaultSet, feedSet.isDefaultSet) &&
        Objects.equals(this.itemCount, feedSet.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, conditionSets, feedId, feedSetId, feedSetName, isDefaultSet, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSet {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    conditionSets: ").append(toIndentedString(conditionSets)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedSetId: ").append(toIndentedString(feedSetId)).append("\n");
    sb.append("    feedSetName: ").append(toIndentedString(feedSetName)).append("\n");
    sb.append("    isDefaultSet: ").append(toIndentedString(isDefaultSet)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

