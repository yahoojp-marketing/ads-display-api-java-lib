/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v6.model;

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
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceSharingStatusFilterType;
import jp.co.yahoo.adsdisplayapi.v6.model.RetargetingListServiceTargetListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceSelectorオブジェクトは、サイトリターゲティングのターゲットリストを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceSelector object selects the target list for site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceSelectorオブジェクトは、サイトリターゲティングのターゲットリストを指定します。</div> <div lang=\"en\">RetargetingListServiceSelector object selects the target list for site retargeting.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  RetargetingListServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  RetargetingListServiceSelector.JSON_PROPERTY_START_INDEX,
  RetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_IDS,
  RetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_TYPES,
  RetargetingListServiceSelector.JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE
})
@JsonTypeName("RetargetingListServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 1000;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_TARGET_LIST_IDS = "targetListIds";
  private List<Long> targetListIds = null;

  public static final String JSON_PROPERTY_TARGET_LIST_TYPES = "targetListTypes";
  private List<RetargetingListServiceTargetListType> targetListTypes = null;

  public static final String JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE = "sharingStatusFilterType";
  private RetargetingListServiceSharingStatusFilterType sharingStatusFilterType;

  public RetargetingListServiceSelector() { 
  }

  public RetargetingListServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
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


  public RetargetingListServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
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


  public RetargetingListServiceSelector startIndex(Integer startIndex) {
    
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


  public RetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    
    this.targetListIds = targetListIds;
    return this;
  }

  public RetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null) {
      this.targetListIds = new ArrayList<>();
    }
    this.targetListIds.add(targetListIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target List ID.&lt;/div&gt; 
   * @return targetListIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。</div> <div lang=\"en\">Target List ID.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTargetListIds() {
    return targetListIds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListIds(List<Long> targetListIds) {
    this.targetListIds = targetListIds;
  }


  public RetargetingListServiceSelector targetListTypes(List<RetargetingListServiceTargetListType> targetListTypes) {
    
    this.targetListTypes = targetListTypes;
    return this;
  }

  public RetargetingListServiceSelector addTargetListTypesItem(RetargetingListServiceTargetListType targetListTypesItem) {
    if (this.targetListTypes == null) {
      this.targetListTypes = new ArrayList<>();
    }
    this.targetListTypes.add(targetListTypesItem);
    return this;
  }

   /**
   * Get targetListTypes
   * @return targetListTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceTargetListType> getTargetListTypes() {
    return targetListTypes;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListTypes(List<RetargetingListServiceTargetListType> targetListTypes) {
    this.targetListTypes = targetListTypes;
  }


  public RetargetingListServiceSelector sharingStatusFilterType(RetargetingListServiceSharingStatusFilterType sharingStatusFilterType) {
    
    this.sharingStatusFilterType = sharingStatusFilterType;
    return this;
  }

   /**
   * Get sharingStatusFilterType
   * @return sharingStatusFilterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceSharingStatusFilterType getSharingStatusFilterType() {
    return sharingStatusFilterType;
  }


  @JsonProperty(JSON_PROPERTY_SHARING_STATUS_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharingStatusFilterType(RetargetingListServiceSharingStatusFilterType sharingStatusFilterType) {
    this.sharingStatusFilterType = sharingStatusFilterType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceSelector retargetingListServiceSelector = (RetargetingListServiceSelector) o;
    return Objects.equals(this.accountId, retargetingListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, retargetingListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, retargetingListServiceSelector.startIndex) &&
        Objects.equals(this.targetListIds, retargetingListServiceSelector.targetListIds) &&
        Objects.equals(this.targetListTypes, retargetingListServiceSelector.targetListTypes) &&
        Objects.equals(this.sharingStatusFilterType, retargetingListServiceSelector.sharingStatusFilterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, startIndex, targetListIds, targetListTypes, sharingStatusFilterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetListIds: ").append(toIndentedString(targetListIds)).append("\n");
    sb.append("    targetListTypes: ").append(toIndentedString(targetListTypes)).append("\n");
    sb.append("    sharingStatusFilterType: ").append(toIndentedString(sharingStatusFilterType)).append("\n");
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

