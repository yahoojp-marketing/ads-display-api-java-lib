package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceCampaignGoalFilterType;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v5.model.AdGroupServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupServiceSelector object is a container for storing specified ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。</div> <div lang=\"en\">The AdGroupServiceSelector object is a container for storing specified ad group information.</div> ")

public class AdGroupServiceSelector   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupIds")
  @Valid
  private JsonNullable<List<Long>> adGroupIds = JsonNullable.undefined();

  @JsonProperty("campaignGoalFilterType")
  private JsonNullable<AdGroupServiceCampaignGoalFilterType> campaignGoalFilterType = JsonNullable.undefined();

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("containsLabelIdFlg")
  private JsonNullable<Boolean> containsLabelIdFlg = JsonNullable.undefined();

  @JsonProperty("feedSetIds")
  @Valid
  private JsonNullable<List<Long>> feedSetIds = JsonNullable.undefined();

  @JsonProperty("labelIds")
  @Valid
  private JsonNullable<List<Long>> labelIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("userStatuses")
  @Valid
  private JsonNullable<List<AdGroupServiceUserStatus>> userStatuses = JsonNullable.undefined();

  @JsonProperty("createdDateRange")
  private JsonNullable<AdGroupServiceCreatedDateRange> createdDateRange = JsonNullable.undefined();

  public AdGroupServiceSelector accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search Condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search Condition: Account ID.</div> ")
  @NotNull


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AdGroupServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = JsonNullable.of(adGroupIds);
    return this;
  }

  public AdGroupServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null || !this.adGroupIds.isPresent()) {
      this.adGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupIds.get().add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search Condition: Ad group ID.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search Condition: Ad group ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(JsonNullable<List<Long>> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupServiceSelector campaignGoalFilterType(AdGroupServiceCampaignGoalFilterType campaignGoalFilterType) {
    this.campaignGoalFilterType = JsonNullable.of(campaignGoalFilterType);
    return this;
  }

  /**
   * Get campaignGoalFilterType
   * @return campaignGoalFilterType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceCampaignGoalFilterType> getCampaignGoalFilterType() {
    return campaignGoalFilterType;
  }

  public void setCampaignGoalFilterType(JsonNullable<AdGroupServiceCampaignGoalFilterType> campaignGoalFilterType) {
    this.campaignGoalFilterType = campaignGoalFilterType;
  }

  public AdGroupServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public AdGroupServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = JsonNullable.of(containsLabelIdFlg);
    return this;
  }

  /**
   * <div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID.</div> 
   * @return containsLabelIdFlg
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID.</div> ")


  public JsonNullable<Boolean> getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }

  public void setContainsLabelIdFlg(JsonNullable<Boolean> containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
  }

  public AdGroupServiceSelector feedSetIds(List<Long> feedSetIds) {
    this.feedSetIds = JsonNullable.of(feedSetIds);
    return this;
  }

  public AdGroupServiceSelector addFeedSetIdsItem(Long feedSetIdsItem) {
    if (this.feedSetIds == null || !this.feedSetIds.isPresent()) {
      this.feedSetIds = JsonNullable.of(new ArrayList<>());
    }
    this.feedSetIds.get().add(feedSetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：フィードセットID</div> <div lang=\"en\">Search Condition: Feed set ID.</div> 
   * @return feedSetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：フィードセットID</div> <div lang=\"en\">Search Condition: Feed set ID.</div> ")

@Size(max=200) 
  public JsonNullable<List<Long>> getFeedSetIds() {
    return feedSetIds;
  }

  public void setFeedSetIds(JsonNullable<List<Long>> feedSetIds) {
    this.feedSetIds = feedSetIds;
  }

  public AdGroupServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = JsonNullable.of(labelIds);
    return this;
  }

  public AdGroupServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null || !this.labelIds.isPresent()) {
      this.labelIds = JsonNullable.of(new ArrayList<>());
    }
    this.labelIds.get().add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID.</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(JsonNullable<List<Long>> labelIds) {
    this.labelIds = labelIds;
  }

  public AdGroupServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(10000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AdGroupServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public AdGroupServiceSelector userStatuses(List<AdGroupServiceUserStatus> userStatuses) {
    this.userStatuses = JsonNullable.of(userStatuses);
    return this;
  }

  public AdGroupServiceSelector addUserStatusesItem(AdGroupServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null || !this.userStatuses.isPresent()) {
      this.userStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.userStatuses.get().add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<AdGroupServiceUserStatus>> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(JsonNullable<List<AdGroupServiceUserStatus>> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupServiceSelector createdDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = JsonNullable.of(createdDateRange);
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceCreatedDateRange> getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(JsonNullable<AdGroupServiceCreatedDateRange> createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

