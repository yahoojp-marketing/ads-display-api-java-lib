/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v5.model;

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
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceCampaignGoalFilterType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupServiceSelector object is a container for storing specified ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。</div> <div lang=\"en\">The AdGroupServiceSelector object is a container for storing specified ad group information.</div> ")
@JsonPropertyOrder({
  AdGroupServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_CAMPAIGN_GOAL_FILTER_TYPE,
  AdGroupServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_CONTAINS_LABEL_ID_FLG,
  AdGroupServiceSelector.JSON_PROPERTY_FEED_SET_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_LABEL_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AdGroupServiceSelector.JSON_PROPERTY_START_INDEX,
  AdGroupServiceSelector.JSON_PROPERTY_USER_STATUSES,
  AdGroupServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE
})
@JsonTypeName("AdGroupServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds = null;

  public static final String JSON_PROPERTY_CAMPAIGN_GOAL_FILTER_TYPE = "campaignGoalFilterType";
  private AdGroupServiceCampaignGoalFilterType campaignGoalFilterType;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_CONTAINS_LABEL_ID_FLG = "containsLabelIdFlg";
  private Boolean containsLabelIdFlg;

  public static final String JSON_PROPERTY_FEED_SET_IDS = "feedSetIds";
  private List<Long> feedSetIds = null;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<AdGroupServiceUserStatus> userStatuses = null;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private AdGroupServiceCreatedDateRange createdDateRange;

  public AdGroupServiceSelector() { 
  }

  public AdGroupServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search Condition: Account ID.</div> ")
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


  public AdGroupServiceSelector adGroupIds(List<Long> adGroupIds) {
    
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Ad group ID.&lt;/div&gt; 
   * @return adGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search Condition: Ad group ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }


  public AdGroupServiceSelector campaignGoalFilterType(AdGroupServiceCampaignGoalFilterType campaignGoalFilterType) {
    
    this.campaignGoalFilterType = campaignGoalFilterType;
    return this;
  }

   /**
   * Get campaignGoalFilterType
   * @return campaignGoalFilterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCampaignGoalFilterType getCampaignGoalFilterType() {
    return campaignGoalFilterType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_GOAL_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignGoalFilterType(AdGroupServiceCampaignGoalFilterType campaignGoalFilterType) {
    this.campaignGoalFilterType = campaignGoalFilterType;
  }


  public AdGroupServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Campaign ID.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID.</div> ")
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


  public AdGroupServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    
    this.containsLabelIdFlg = containsLabelIdFlg;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID取得フラグ&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label ID.&lt;/div&gt; 
   * @return containsLabelIdFlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID.</div> ")
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID_FLG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
  }


  public AdGroupServiceSelector feedSetIds(List<Long> feedSetIds) {
    
    this.feedSetIds = feedSetIds;
    return this;
  }

  public AdGroupServiceSelector addFeedSetIdsItem(Long feedSetIdsItem) {
    if (this.feedSetIds == null) {
      this.feedSetIds = new ArrayList<>();
    }
    this.feedSetIds.add(feedSetIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：フィードセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Feed set ID.&lt;/div&gt; 
   * @return feedSetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：フィードセットID</div> <div lang=\"en\">Search Condition: Feed set ID.</div> ")
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


  public AdGroupServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public AdGroupServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : ラベルID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Label ID.&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID.</div> ")
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


  public AdGroupServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
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


  public AdGroupServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
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


  public AdGroupServiceSelector userStatuses(List<AdGroupServiceUserStatus> userStatuses) {
    
    this.userStatuses = userStatuses;
    return this;
  }

  public AdGroupServiceSelector addUserStatusesItem(AdGroupServiceUserStatus userStatusesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatuses(List<AdGroupServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }


  public AdGroupServiceSelector createdDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    
    this.createdDateRange = createdDateRange;
    return this;
  }

   /**
   * Get createdDateRange
   * @return createdDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceSelector adGroupServiceSelector = (AdGroupServiceSelector) o;
    return Objects.equals(this.accountId, adGroupServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupServiceSelector.adGroupIds) &&
        Objects.equals(this.campaignGoalFilterType, adGroupServiceSelector.campaignGoalFilterType) &&
        Objects.equals(this.campaignIds, adGroupServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelIdFlg, adGroupServiceSelector.containsLabelIdFlg) &&
        Objects.equals(this.feedSetIds, adGroupServiceSelector.feedSetIds) &&
        Objects.equals(this.labelIds, adGroupServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, adGroupServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, adGroupServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, adGroupServiceSelector.createdDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, campaignGoalFilterType, campaignIds, containsLabelIdFlg, feedSetIds, labelIds, numberResults, startIndex, userStatuses, createdDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    campaignGoalFilterType: ").append(toIndentedString(campaignGoalFilterType)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelIdFlg: ").append(toIndentedString(containsLabelIdFlg)).append("\n");
    sb.append("    feedSetIds: ").append(toIndentedString(feedSetIds)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
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

