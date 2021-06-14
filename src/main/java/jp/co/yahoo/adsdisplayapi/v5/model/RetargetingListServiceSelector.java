package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceSharingStatusFilterType;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceTargetListType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceSelectorオブジェクトは、サイトリターゲティングのターゲットリストを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceSelector object selects the target list for site retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceSelectorオブジェクトは、サイトリターゲティングのターゲットリストを指定します。</div> <div lang=\"en\">RetargetingListServiceSelector object selects the target list for site retargeting.</div> ")

public class RetargetingListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("targetListIds")
  @Valid
  private JsonNullable<List<Long>> targetListIds = JsonNullable.undefined();

  @JsonProperty("targetListTypes")
  @Valid
  private JsonNullable<List<RetargetingListServiceTargetListType>> targetListTypes = JsonNullable.undefined();

  @JsonProperty("sharingStatusFilterType")
  private JsonNullable<RetargetingListServiceSharingStatusFilterType> sharingStatusFilterType = JsonNullable.undefined();

  public RetargetingListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public RetargetingListServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public RetargetingListServiceSelector startIndex(Integer startIndex) {
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

  public RetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    this.targetListIds = JsonNullable.of(targetListIds);
    return this;
  }

  public RetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null || !this.targetListIds.isPresent()) {
      this.targetListIds = JsonNullable.of(new ArrayList<>());
    }
    this.targetListIds.get().add(targetListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。</div> <div lang=\"en\">Target List ID.</div> 
   * @return targetListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。</div> <div lang=\"en\">Target List ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getTargetListIds() {
    return targetListIds;
  }

  public void setTargetListIds(JsonNullable<List<Long>> targetListIds) {
    this.targetListIds = targetListIds;
  }

  public RetargetingListServiceSelector targetListTypes(List<RetargetingListServiceTargetListType> targetListTypes) {
    this.targetListTypes = JsonNullable.of(targetListTypes);
    return this;
  }

  public RetargetingListServiceSelector addTargetListTypesItem(RetargetingListServiceTargetListType targetListTypesItem) {
    if (this.targetListTypes == null || !this.targetListTypes.isPresent()) {
      this.targetListTypes = JsonNullable.of(new ArrayList<>());
    }
    this.targetListTypes.get().add(targetListTypesItem);
    return this;
  }

  /**
   * Get targetListTypes
   * @return targetListTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<RetargetingListServiceTargetListType>> getTargetListTypes() {
    return targetListTypes;
  }

  public void setTargetListTypes(JsonNullable<List<RetargetingListServiceTargetListType>> targetListTypes) {
    this.targetListTypes = targetListTypes;
  }

  public RetargetingListServiceSelector sharingStatusFilterType(RetargetingListServiceSharingStatusFilterType sharingStatusFilterType) {
    this.sharingStatusFilterType = JsonNullable.of(sharingStatusFilterType);
    return this;
  }

  /**
   * Get sharingStatusFilterType
   * @return sharingStatusFilterType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceSharingStatusFilterType> getSharingStatusFilterType() {
    return sharingStatusFilterType;
  }

  public void setSharingStatusFilterType(JsonNullable<RetargetingListServiceSharingStatusFilterType> sharingStatusFilterType) {
    this.sharingStatusFilterType = sharingStatusFilterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

