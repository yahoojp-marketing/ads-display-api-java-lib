package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;get操作の検索条件を保持するオブジェクト&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedSetServiceSelector object contains search condition of get operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">get操作の検索条件を保持するオブジェクト</div> <div lang=\"en\">FeedSetServiceSelector object contains search condition of get operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedSetServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("feedId")
  private Long feedId;

  @JsonProperty("feedSetIds")
  @Valid
  private List<Long> feedSetIds = null;

  @JsonProperty("includeItemCount")
  private Boolean includeItemCount = null;

  public FeedSetServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedSetServiceSelector feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID.</div> 
   * @return feedId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID.</div> ")
  @NotNull


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public FeedSetServiceSelector feedSetIds(List<Long> feedSetIds) {
    this.feedSetIds = feedSetIds;
    return this;
  }

  public FeedSetServiceSelector addFeedSetIdsItem(Long feedSetIdsItem) {
    if (this.feedSetIds == null) {
      this.feedSetIds = new ArrayList<>();
    }
    this.feedSetIds.add(feedSetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">商品セットID</div> <div lang=\"en\">Item Set ID.</div> 
   * @return feedSetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">商品セットID</div> <div lang=\"en\">Item Set ID.</div> ")

@Size(max=30) 
  public List<Long> getFeedSetIds() {
    return feedSetIds;
  }

  public void setFeedSetIds(List<Long> feedSetIds) {
    this.feedSetIds = feedSetIds;
  }

  public FeedSetServiceSelector includeItemCount(Boolean includeItemCount) {
    this.includeItemCount = includeItemCount;
    return this;
  }

  /**
   * <div lang=\"ja\"> 商品セットのアイテム件数を表示<br> trueの場合は、アイテム件数を表示<br> ※デフォルト値はfalse:表示しない。 </div> <div lang=\"en\"> Describes number of items of Item Set.<br> If true, the number of items is described.<br> ∗ Default is false: Not described. </div> 
   * @return includeItemCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 商品セットのアイテム件数を表示<br> trueの場合は、アイテム件数を表示<br> ※デフォルト値はfalse:表示しない。 </div> <div lang=\"en\"> Describes number of items of Item Set.<br> If true, the number of items is described.<br> ∗ Default is false: Not described. </div> ")


  public Boolean getIncludeItemCount() {
    return includeItemCount;
  }

  public void setIncludeItemCount(Boolean includeItemCount) {
    this.includeItemCount = includeItemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedSetServiceSelector feedSetServiceSelector = (FeedSetServiceSelector) o;
    return Objects.equals(this.accountId, feedSetServiceSelector.accountId) &&
        Objects.equals(this.feedId, feedSetServiceSelector.feedId) &&
        Objects.equals(this.feedSetIds, feedSetServiceSelector.feedSetIds) &&
        Objects.equals(this.includeItemCount, feedSetServiceSelector.includeItemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedId, feedSetIds, includeItemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedSetServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedSetIds: ").append(toIndentedString(feedSetIds)).append("\n");
    sb.append("    includeItemCount: ").append(toIndentedString(includeItemCount)).append("\n");
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

