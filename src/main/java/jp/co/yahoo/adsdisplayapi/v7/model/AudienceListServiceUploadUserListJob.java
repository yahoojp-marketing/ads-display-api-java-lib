package jp.co.yahoo.adsdisplayapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceJobStatus;
import jp.co.yahoo.adsdisplayapi.v7.model.AudienceListServiceUploadUserListUploadType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceUploadUserListJob object indicates the processing status of user list upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。</div> <div lang=\"en\">AudienceListServiceUploadUserListJob object indicates the processing status of user list upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AudienceListServiceUploadUserListJob   {
  @JsonProperty("uploadJobId")
  private String uploadJobId = null;

  @JsonProperty("retargetingTagId")
  private String retargetingTagId = null;

  @JsonProperty("audienceListId")
  private Long audienceListId = null;

  @JsonProperty("uploadType")
  private AudienceListServiceUploadUserListUploadType uploadType = null;

  @JsonProperty("uploadSubmitDate")
  private String uploadSubmitDate = null;

  @JsonProperty("receivedDate")
  private String receivedDate = null;

  @JsonProperty("jobStatus")
  private AudienceListServiceJobStatus jobStatus = null;

  public AudienceListServiceUploadUserListJob uploadJobId(String uploadJobId) {
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

  public AudienceListServiceUploadUserListJob retargetingTagId(String retargetingTagId) {
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

  public AudienceListServiceUploadUserListJob audienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
    return this;
  }

  /**
   * <div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> 
   * @return audienceListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> ")


  public Long getAudienceListId() {
    return audienceListId;
  }

  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }

  public AudienceListServiceUploadUserListJob uploadType(AudienceListServiceUploadUserListUploadType uploadType) {
    this.uploadType = uploadType;
    return this;
  }

  /**
   * Get uploadType
   * @return uploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceUploadUserListUploadType getUploadType() {
    return uploadType;
  }

  public void setUploadType(AudienceListServiceUploadUserListUploadType uploadType) {
    this.uploadType = uploadType;
  }

  public AudienceListServiceUploadUserListJob uploadSubmitDate(String uploadSubmitDate) {
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

  public AudienceListServiceUploadUserListJob receivedDate(String receivedDate) {
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

  public AudienceListServiceUploadUserListJob jobStatus(AudienceListServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AudienceListServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(AudienceListServiceJobStatus jobStatus) {
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
    AudienceListServiceUploadUserListJob audienceListServiceUploadUserListJob = (AudienceListServiceUploadUserListJob) o;
    return Objects.equals(this.uploadJobId, audienceListServiceUploadUserListJob.uploadJobId) &&
        Objects.equals(this.retargetingTagId, audienceListServiceUploadUserListJob.retargetingTagId) &&
        Objects.equals(this.audienceListId, audienceListServiceUploadUserListJob.audienceListId) &&
        Objects.equals(this.uploadType, audienceListServiceUploadUserListJob.uploadType) &&
        Objects.equals(this.uploadSubmitDate, audienceListServiceUploadUserListJob.uploadSubmitDate) &&
        Objects.equals(this.receivedDate, audienceListServiceUploadUserListJob.receivedDate) &&
        Objects.equals(this.jobStatus, audienceListServiceUploadUserListJob.jobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadJobId, retargetingTagId, audienceListId, uploadType, uploadSubmitDate, receivedDate, jobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceUploadUserListJob {\n");
    
    sb.append("    uploadJobId: ").append(toIndentedString(uploadJobId)).append("\n");
    sb.append("    retargetingTagId: ").append(toIndentedString(retargetingTagId)).append("\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
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

