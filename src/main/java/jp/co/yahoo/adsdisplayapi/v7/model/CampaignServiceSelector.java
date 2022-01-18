package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v7.model.CampaignServiceBudgetAmountRange;
import jp.co.yahoo.adsdisplayapi.v7.model.CampaignServiceCreatedDateRange;
import jp.co.yahoo.adsdisplayapi.v7.model.CampaignServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The CampaignServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The CampaignServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("containsLabelIdFlg")
  private Boolean containsLabelIdFlg = null;

  @JsonProperty("feedIds")
  @Valid
  private List<Long> feedIds = null;

  @JsonProperty("labelIds")
  @Valid
  private List<Long> labelIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<CampaignServiceUserStatus> userStatuses = null;

  @JsonProperty("createdDateRange")
  private CampaignServiceCreatedDateRange createdDateRange = null;

  @JsonProperty("conversionGroupIds")
  @Valid
  private List<Long> conversionGroupIds = null;

  @JsonProperty("conversionTrackerIds")
  @Valid
  private List<Long> conversionTrackerIds = null;

  @JsonProperty("budgetAmountRange")
  private CampaignServiceBudgetAmountRange budgetAmountRange = null;

  public CampaignServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

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
   * <div lang=\"ja\">検索条件 : キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID</div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignServiceSelector containsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
    return this;
  }

  /**
   * <div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID</div> 
   * @return containsLabelIdFlg
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグ</div> <div lang=\"en\">Flag of contains label ID</div> ")


  public Boolean getContainsLabelIdFlg() {
    return containsLabelIdFlg;
  }

  public void setContainsLabelIdFlg(Boolean containsLabelIdFlg) {
    this.containsLabelIdFlg = containsLabelIdFlg;
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
   * <div lang=\"ja\">検索条件 : フィードID</div> <div lang=\"en\">Search Condition: Feed ID</div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : フィードID</div> <div lang=\"en\">Search Condition: Feed ID</div> ")

@Size(max=10) 
  public List<Long> getFeedIds() {
    return feedIds;
  }

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
   * <div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ラベルID</div> <div lang=\"en\">Search Condition: Label ID</div> ")

@Size(max=1000) 
  public List<Long> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }

  public CampaignServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
   * <div lang=\"ja\">検索条件 : 取得範囲</div> <div lang=\"en\">Search Condition: Delivery status of user settings</div> 
   * @return userStatuses
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : 取得範囲</div> <div lang=\"en\">Search Condition: Delivery status of user settings</div> ")

  @Valid
@Size(max=2) 
  public List<CampaignServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }

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
   * <div lang=\"ja\">検索条件 : コンバージョングループID</div> <div lang=\"en\">Search Condition: Conversion Group ID</div> 
   * @return conversionGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : コンバージョングループID</div> <div lang=\"en\">Search Condition: Conversion Group ID</div> ")

@Size(max=1000) 
  public List<Long> getConversionGroupIds() {
    return conversionGroupIds;
  }

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
   * <div lang=\"ja\">検索条件 : コンバージョントラッカーID</div> <div lang=\"en\">Search Condition: Conversion Tracking ID</div> 
   * @return conversionTrackerIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : コンバージョントラッカーID</div> <div lang=\"en\">Search Condition: Conversion Tracking ID</div> ")

@Size(max=1000) 
  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceBudgetAmountRange getBudgetAmountRange() {
    return budgetAmountRange;
  }

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
        Objects.equals(this.containsLabelIdFlg, campaignServiceSelector.containsLabelIdFlg) &&
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
    return Objects.hash(accountId, campaignIds, containsLabelIdFlg, feedIds, labelIds, numberResults, startIndex, userStatuses, createdDateRange, conversionGroupIds, conversionTrackerIds, budgetAmountRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelIdFlg: ").append(toIndentedString(containsLabelIdFlg)).append("\n");
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

