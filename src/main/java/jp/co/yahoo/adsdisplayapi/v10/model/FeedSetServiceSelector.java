/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;get操作の検索条件を保持するオブジェクト&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedSetServiceSelector object contains search condition of get operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedSetServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  FeedSetServiceSelector.JSON_PROPERTY_FEED_ID,
  FeedSetServiceSelector.JSON_PROPERTY_FEED_SET_IDS,
  FeedSetServiceSelector.JSON_PROPERTY_INCLUDE_ITEM_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedSetServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FEED_SET_IDS = "feedSetIds";
  private List<Long> feedSetIds;

  public static final String JSON_PROPERTY_INCLUDE_ITEM_COUNT = "includeItemCount";
  private Boolean includeItemCount;

  public FeedSetServiceSelector() {
  }

  public FeedSetServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public FeedSetServiceSelector feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;商品セットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Item Set ID.&lt;/div&gt; 
   * @return feedSetIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedSetIds() {
    return feedSetIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedSetIds(List<Long> feedSetIds) {
    this.feedSetIds = feedSetIds;
  }


  public FeedSetServiceSelector includeItemCount(Boolean includeItemCount) {
    
    this.includeItemCount = includeItemCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 商品セットのアイテム件数を表示&lt;br&gt; trueの場合は、アイテム件数を表示&lt;br&gt; ※デフォルト値はfalse:表示しない。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Describes number of items of Item Set.&lt;br&gt; If true, the number of items is described.&lt;br&gt; ∗ Default is false: Not described. &lt;/div&gt; 
   * @return includeItemCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeItemCount() {
    return includeItemCount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

