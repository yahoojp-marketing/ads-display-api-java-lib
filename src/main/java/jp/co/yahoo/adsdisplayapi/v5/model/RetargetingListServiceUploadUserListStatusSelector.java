package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceJobStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListStatusSelectorオブジェクトは、ユーザーリストのアップロード情報の検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The RetargetingListServiceUploadUserListStatusSelector object is a container for storing a set of criteria (parameters) for upload jobs of user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListStatusSelectorオブジェクトは、ユーザーリストのアップロード情報の検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The RetargetingListServiceUploadUserListStatusSelector object is a container for storing a set of criteria (parameters) for upload jobs of user list.</div> ")

public class RetargetingListServiceUploadUserListStatusSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("targetListId")
  private JsonNullable<Long> targetListId = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("uploadJobIds")
  @Valid
  private JsonNullable<List<String>> uploadJobIds = JsonNullable.undefined();

  @JsonProperty("jobStatues")
  @Valid
  private JsonNullable<List<RetargetingListServiceJobStatus>> jobStatues = JsonNullable.undefined();

  public RetargetingListServiceUploadUserListStatusSelector accountId(Long accountId) {
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

  public RetargetingListServiceUploadUserListStatusSelector targetListId(Long targetListId) {
    this.targetListId = JsonNullable.of(targetListId);
    return this;
  }

  /**
   * <div lang=\"ja\">カスタムオーディエンスのターゲットリストIDです。</div> <div lang=\"en\">Target list ID of custom audience.</div> 
   * @return targetListId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">カスタムオーディエンスのターゲットリストIDです。</div> <div lang=\"en\">Target list ID of custom audience.</div> ")
  @NotNull


  public JsonNullable<Long> getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(JsonNullable<Long> targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceUploadUserListStatusSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * maximum: 100
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1) @Max(100) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public RetargetingListServiceUploadUserListStatusSelector uploadJobIds(List<String> uploadJobIds) {
    this.uploadJobIds = JsonNullable.of(uploadJobIds);
    return this;
  }

  public RetargetingListServiceUploadUserListStatusSelector addUploadJobIdsItem(String uploadJobIdsItem) {
    if (this.uploadJobIds == null || !this.uploadJobIds.isPresent()) {
      this.uploadJobIds = JsonNullable.of(new ArrayList<>());
    }
    this.uploadJobIds.get().add(uploadJobIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> 
   * @return uploadJobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> ")

@Size(max=100) 
  public JsonNullable<List<String>> getUploadJobIds() {
    return uploadJobIds;
  }

  public void setUploadJobIds(JsonNullable<List<String>> uploadJobIds) {
    this.uploadJobIds = uploadJobIds;
  }

  public RetargetingListServiceUploadUserListStatusSelector jobStatues(List<RetargetingListServiceJobStatus> jobStatues) {
    this.jobStatues = JsonNullable.of(jobStatues);
    return this;
  }

  public RetargetingListServiceUploadUserListStatusSelector addJobStatuesItem(RetargetingListServiceJobStatus jobStatuesItem) {
    if (this.jobStatues == null || !this.jobStatues.isPresent()) {
      this.jobStatues = JsonNullable.of(new ArrayList<>());
    }
    this.jobStatues.get().add(jobStatuesItem);
    return this;
  }

  /**
   * Get jobStatues
   * @return jobStatues
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public JsonNullable<List<RetargetingListServiceJobStatus>> getJobStatues() {
    return jobStatues;
  }

  public void setJobStatues(JsonNullable<List<RetargetingListServiceJobStatus>> jobStatues) {
    this.jobStatues = jobStatues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceUploadUserListStatusSelector retargetingListServiceUploadUserListStatusSelector = (RetargetingListServiceUploadUserListStatusSelector) o;
    return Objects.equals(this.accountId, retargetingListServiceUploadUserListStatusSelector.accountId) &&
        Objects.equals(this.targetListId, retargetingListServiceUploadUserListStatusSelector.targetListId) &&
        Objects.equals(this.numberResults, retargetingListServiceUploadUserListStatusSelector.numberResults) &&
        Objects.equals(this.uploadJobIds, retargetingListServiceUploadUserListStatusSelector.uploadJobIds) &&
        Objects.equals(this.jobStatues, retargetingListServiceUploadUserListStatusSelector.jobStatues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, targetListId, numberResults, uploadJobIds, jobStatues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceUploadUserListStatusSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    uploadJobIds: ").append(toIndentedString(uploadJobIds)).append("\n");
    sb.append("    jobStatues: ").append(toIndentedString(jobStatues)).append("\n");
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

