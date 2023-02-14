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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v10.model.BrandLiftServiceApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BrandLiftServiceSelector object is a container for storing a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BrandLiftServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The BrandLiftServiceSelector object is a container for storing a set of criteria (parameters) for get method.</div> ")
@JsonPropertyOrder({
  BrandLiftServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  BrandLiftServiceSelector.JSON_PROPERTY_BRAND_LIFT_IDS,
  BrandLiftServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  BrandLiftServiceSelector.JSON_PROPERTY_APPROVAL_STATUSES,
  BrandLiftServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  BrandLiftServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("BrandLiftServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrandLiftServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BRAND_LIFT_IDS = "brandLiftIds";
  private List<Long> brandLiftIds = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_APPROVAL_STATUSES = "approvalStatuses";
  private List<BrandLiftServiceApprovalStatus> approvalStatuses = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public BrandLiftServiceSelector() { 
  }

  public BrandLiftServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件 : アカウントID</div> <div lang=\"en\">Search Condition: Account ID</div> ")
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


  public BrandLiftServiceSelector brandLiftIds(List<Long> brandLiftIds) {
    
    this.brandLiftIds = brandLiftIds;
    return this;
  }

  public BrandLiftServiceSelector addBrandLiftIdsItem(Long brandLiftIdsItem) {
    if (this.brandLiftIds == null) {
      this.brandLiftIds = new ArrayList<>();
    }
    this.brandLiftIds.add(brandLiftIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : ブランドリフト調査ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: BrandLift ID&lt;/div&gt; 
   * @return brandLiftIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : ブランドリフト調査ID</div> <div lang=\"en\">Search Condition: BrandLift ID</div> ")
  @JsonProperty(JSON_PROPERTY_BRAND_LIFT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getBrandLiftIds() {
    return brandLiftIds;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_LIFT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandLiftIds(List<Long> brandLiftIds) {
    this.brandLiftIds = brandLiftIds;
  }


  public BrandLiftServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public BrandLiftServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件 : キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search Condition: Campaign ID&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件 : キャンペーンID</div> <div lang=\"en\">Search Condition: Campaign ID</div> ")
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


  public BrandLiftServiceSelector approvalStatuses(List<BrandLiftServiceApprovalStatus> approvalStatuses) {
    
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public BrandLiftServiceSelector addApprovalStatusesItem(BrandLiftServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null) {
      this.approvalStatuses = new ArrayList<>();
    }
    this.approvalStatuses.add(approvalStatusesItem);
    return this;
  }

   /**
   * Get approvalStatuses
   * @return approvalStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandLiftServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatuses(List<BrandLiftServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }


  public BrandLiftServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
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


  public BrandLiftServiceSelector startIndex(Integer startIndex) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandLiftServiceSelector brandLiftServiceSelector = (BrandLiftServiceSelector) o;
    return Objects.equals(this.accountId, brandLiftServiceSelector.accountId) &&
        Objects.equals(this.brandLiftIds, brandLiftServiceSelector.brandLiftIds) &&
        Objects.equals(this.campaignIds, brandLiftServiceSelector.campaignIds) &&
        Objects.equals(this.approvalStatuses, brandLiftServiceSelector.approvalStatuses) &&
        Objects.equals(this.numberResults, brandLiftServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, brandLiftServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, brandLiftIds, campaignIds, approvalStatuses, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLiftServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    brandLiftIds: ").append(toIndentedString(brandLiftIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

