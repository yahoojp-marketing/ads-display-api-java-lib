package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceJobStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.RetargetingListServiceUploadUserListUploadType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUploadUserListJob object indicates the processing status of user list upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceUploadUserListJob object indicates the processing status of user list upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceUploadUserListJob   {
  @JsonProperty("uploadJobId")
  private String uploadJobId = null;

  @JsonProperty("retargetingTagId")
  private String retargetingTagId = null;

  @JsonProperty("targetListId")
  private Long targetListId = null;

  @JsonProperty("uploadType")
  private RetargetingListServiceUploadUserListUploadType uploadType = null;

  @JsonProperty("uploadSubmitDate")
  private String uploadSubmitDate = null;

  @JsonProperty("receivedDate")
  private String receivedDate = null;

  @JsonProperty("jobStatus")
  private RetargetingListServiceJobStatus jobStatus = null;

  public RetargetingListServiceUploadUserListJob uploadJobId(String uploadJobId) {
    this.uploadJobId = uploadJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> 
   * @return uploadJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> ")


  public String getUploadJobId() {
    return uploadJobId;
  }

  public void setUploadJobId(String uploadJobId) {
    this.uploadJobId = uploadJobId;
  }

  public RetargetingListServiceUploadUserListJob retargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
    return this;
  }

  /**
   * <div lang=\"ja\">サイトリターゲティングのタグIDです。</div> <div lang=\"en\">Tag ID for site retargeting.</div> 
   * @return retargetingTagId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグIDです。</div> <div lang=\"en\">Tag ID for site retargeting.</div> ")


  public String getRetargetingTagId() {
    return retargetingTagId;
  }

  public void setRetargetingTagId(String retargetingTagId) {
    this.retargetingTagId = retargetingTagId;
  }

  public RetargetingListServiceUploadUserListJob targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\">カスタムオーディエンスのターゲットリストIDです。</div> <div lang=\"en\">Target list ID of custom audience.</div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カスタムオーディエンスのターゲットリストIDです。</div> <div lang=\"en\">Target list ID of custom audience.</div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceUploadUserListJob uploadType(RetargetingListServiceUploadUserListUploadType uploadType) {
    this.uploadType = uploadType;
    return this;
  }

  /**
   * Get uploadType
   * @return uploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceUploadUserListUploadType getUploadType() {
    return uploadType;
  }

  public void setUploadType(RetargetingListServiceUploadUserListUploadType uploadType) {
    this.uploadType = uploadType;
  }

  public RetargetingListServiceUploadUserListJob uploadSubmitDate(String uploadSubmitDate) {
    this.uploadSubmitDate = uploadSubmitDate;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード日時</div> <div lang=\"en\">Upload date and time.</div> <br>Format: yyyyMMddHHmmss 
   * @return uploadSubmitDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時</div> <div lang=\"en\">Upload date and time.</div> <br>Format: yyyyMMddHHmmss ")


  public String getUploadSubmitDate() {
    return uploadSubmitDate;
  }

  public void setUploadSubmitDate(String uploadSubmitDate) {
    this.uploadSubmitDate = uploadSubmitDate;
  }

  public RetargetingListServiceUploadUserListJob receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード受付完了日時</div> <div lang=\"en\">Upload job completion date and time.</div> <br>Format: yyyyMMddHHmmss 
   * @return receivedDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード受付完了日時</div> <div lang=\"en\">Upload job completion date and time.</div> <br>Format: yyyyMMddHHmmss ")


  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public RetargetingListServiceUploadUserListJob jobStatus(RetargetingListServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(RetargetingListServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceUploadUserListJob retargetingListServiceUploadUserListJob = (RetargetingListServiceUploadUserListJob) o;
    return Objects.equals(this.uploadJobId, retargetingListServiceUploadUserListJob.uploadJobId) &&
        Objects.equals(this.retargetingTagId, retargetingListServiceUploadUserListJob.retargetingTagId) &&
        Objects.equals(this.targetListId, retargetingListServiceUploadUserListJob.targetListId) &&
        Objects.equals(this.uploadType, retargetingListServiceUploadUserListJob.uploadType) &&
        Objects.equals(this.uploadSubmitDate, retargetingListServiceUploadUserListJob.uploadSubmitDate) &&
        Objects.equals(this.receivedDate, retargetingListServiceUploadUserListJob.receivedDate) &&
        Objects.equals(this.jobStatus, retargetingListServiceUploadUserListJob.jobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadJobId, retargetingTagId, targetListId, uploadType, uploadSubmitDate, receivedDate, jobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceUploadUserListJob {\n");
    
    sb.append("    uploadJobId: ").append(toIndentedString(uploadJobId)).append("\n");
    sb.append("    retargetingTagId: ").append(toIndentedString(retargetingTagId)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    uploadSubmitDate: ").append(toIndentedString(uploadSubmitDate)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
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

