/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceBudgetAmountRange;
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v12.model.CampaignServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The CampaignServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignServiceSelector.JSON_PROPERTY_CONTAINS_LABEL,
  CampaignServiceSelector.JSON_PROPERTY_FEED_IDS,
  CampaignServiceSelector.JSON_PROPERTY_LABEL_IDS,
  CampaignServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignServiceSelector.JSON_PROPERTY_START_INDEX,
  CampaignServiceSelector.JSON_PROPERTY_USER_STATUSES,
  CampaignServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE,
  CampaignServiceSelector.JSON_PROPERTY_CONVERSION_GROUP_IDS,
  CampaignServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_IDS,
  CampaignServiceSelector.JSON_PROPERTY_BUDGET_AMOUNT_RANGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_CONTAINS_LABEL = "containsLabel";
  private Boolean containsLabel;

  public static final String JSON_PROPERTY_FEED_IDS = "feedIds";
  private List<Long> feedIds;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<CampaignServiceUserStatus> userStatuses;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private CampaignServiceCreatedDateRange createdDateRange;

  public static final String JSON_PROPERTY_CONVERSION_GROUP_IDS = "conversionGroupIds";
  private List<Long> conversionGroupIds;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_IDS = "conversionTrackerIds";
  private List<Long> conversionTrackerIds;

  public static final String JSON_PROPERTY_BUDGET_AMOUNT_RANGE = "budgetAmountRange";
  private CampaignServiceBudgetAmountRange budgetAmountRange;

  public CampaignServiceSelector() {
  }

  public CampaignServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID&lt;/div&gt; 
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


  public CampaignServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID&lt;/div&gt; 
   * @return campaignIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public CampaignServiceSelector containsLabel(Boolean containsLabel) {
    
    this.containsLabel = containsLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID取得フラグです。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label ID.&lt;br&gt; This field is optional. The default value will be false. &lt;/div&gt; 
   * @return containsLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsLabel() {
    return containsLabel;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsLabel(Boolean containsLabel) {
    this.containsLabel = containsLabel;
  }


  public CampaignServiceSelector feedIds(List<Long> feedIds) {
    
    this.feedIds = feedIds;
    return this;
  }

  public CampaignServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : フィードID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Feed ID&lt;/div&gt; 
   * @return feedIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedIds() {
    return feedIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }


  public CampaignServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public CampaignServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : ラベルID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID&lt;/div&gt; 
   * @return labelIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  public CampaignServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public CampaignServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public CampaignServiceSelector userStatuses(List<CampaignServiceUserStatus> userStatuses) {
    
    this.userStatuses = userStatuses;
    return this;
  }

  public CampaignServiceSelector addUserStatusesItem(CampaignServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null) {
      this.userStatuses = new ArrayList<>();
    }
    this.userStatuses.add(userStatusesItem);
    return this;
  }

   /**
   * Get userStatuses
   * @return userStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatuses(List<CampaignServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }


  public CampaignServiceSelector createdDateRange(CampaignServiceCreatedDateRange createdDateRange) {
    
    this.createdDateRange = createdDateRange;
    return this;
  }

   /**
   * Get createdDateRange
   * @return createdDateRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateRange(CampaignServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  public CampaignServiceSelector conversionGroupIds(List<Long> conversionGroupIds) {
    
    this.conversionGroupIds = conversionGroupIds;
    return this;
  }

  public CampaignServiceSelector addConversionGroupIdsItem(Long conversionGroupIdsItem) {
    if (this.conversionGroupIds == null) {
      this.conversionGroupIds = new ArrayList<>();
    }
    this.conversionGroupIds.add(conversionGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : コンバージョングループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Conversion Group ID&lt;/div&gt; 
   * @return conversionGroupIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConversionGroupIds() {
    return conversionGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupIds(List<Long> conversionGroupIds) {
    this.conversionGroupIds = conversionGroupIds;
  }


  public CampaignServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public CampaignServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : コンバージョントラッカーID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Conversion Tracking ID&lt;/div&gt; 
   * @return conversionTrackerIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
  }


  public CampaignServiceSelector budgetAmountRange(CampaignServiceBudgetAmountRange budgetAmountRange) {
    
    this.budgetAmountRange = budgetAmountRange;
    return this;
  }

   /**
   * Get budgetAmountRange
   * @return budgetAmountRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBudgetAmountRange getBudgetAmountRange() {
    return budgetAmountRange;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudgetAmountRange(CampaignServiceBudgetAmountRange budgetAmountRange) {
    this.budgetAmountRange = budgetAmountRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceSelector campaignServiceSelector = (CampaignServiceSelector) o;
    return Objects.equals(this.accountId, campaignServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabel, campaignServiceSelector.containsLabel) &&
        Objects.equals(this.feedIds, campaignServiceSelector.feedIds) &&
        Objects.equals(this.labelIds, campaignServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, campaignServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, campaignServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, campaignServiceSelector.createdDateRange) &&
        Objects.equals(this.conversionGroupIds, campaignServiceSelector.conversionGroupIds) &&
        Objects.equals(this.conversionTrackerIds, campaignServiceSelector.conversionTrackerIds) &&
        Objects.equals(this.budgetAmountRange, campaignServiceSelector.budgetAmountRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, containsLabel, feedIds, labelIds, numberResults, startIndex, userStatuses, createdDateRange, conversionGroupIds, conversionTrackerIds, budgetAmountRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabel: ").append(toIndentedString(containsLabel)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
    sb.append("    conversionGroupIds: ").append(toIndentedString(conversionGroupIds)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
    sb.append("    budgetAmountRange: ").append(toIndentedString(budgetAmountRange)).append("\n");
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

