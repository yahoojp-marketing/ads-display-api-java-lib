package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AdGroupTargetServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupTargetServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AdGroupTargetServiceSelector object contains a set of criteria (parameters) for get method.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupTargetServiceSelectorオブジェクトは、getメソッドの検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The AdGroupTargetServiceSelector object contains a set of criteria (parameters) for get method.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupTargetServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("targetTypes")
  @Valid
  private List<AdGroupTargetServiceTargetType> targetTypes = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public AdGroupTargetServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupTargetServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupTargetServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID</div> ")

@Size(max=1000) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupTargetServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupTargetServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID</div> ")

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupTargetServiceSelector targetTypes(List<AdGroupTargetServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  public AdGroupTargetServiceSelector addTargetTypesItem(AdGroupTargetServiceTargetType targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=15) 
  public List<AdGroupTargetServiceTargetType> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(List<AdGroupTargetServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
  }

  public AdGroupTargetServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AdGroupTargetServiceSelector startIndex(Integer startIndex) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupTargetServiceSelector adGroupTargetServiceSelector = (AdGroupTargetServiceSelector) o;
    return Objects.equals(this.accountId, adGroupTargetServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupTargetServiceSelector.adGroupIds) &&
        Objects.equals(this.campaignIds, adGroupTargetServiceSelector.campaignIds) &&
        Objects.equals(this.targetTypes, adGroupTargetServiceSelector.targetTypes) &&
        Objects.equals(this.numberResults, adGroupTargetServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupTargetServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, campaignIds, targetTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupTargetServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
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

