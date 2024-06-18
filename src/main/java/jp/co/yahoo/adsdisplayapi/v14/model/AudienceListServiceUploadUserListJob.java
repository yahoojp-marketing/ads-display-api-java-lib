/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v14.model.AudienceListServiceJobStatus;
import jp.co.yahoo.adsdisplayapi.v14.model.AudienceListServiceUploadUserListUploadType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AudienceListServiceUploadUserListJob object indicates the processing status of user list upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceUploadUserListJobオブジェクトは、ユーザーリストのアップロードジョブの処理状況を示すオブジェクトです。</div> <div lang=\"en\">AudienceListServiceUploadUserListJob object indicates the processing status of user list upload.</div> ")
@JsonPropertyOrder({
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_UPLOAD_JOB_ID,
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_AUDIENCE_LIST_ID,
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_UPLOAD_TYPE,
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_UPLOAD_SUBMIT_DATE,
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_RECEIVED_DATE,
  AudienceListServiceUploadUserListJob.JSON_PROPERTY_JOB_STATUS
})
@JsonTypeName("AudienceListServiceUploadUserListJob")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceUploadUserListJob {
  public static final String JSON_PROPERTY_UPLOAD_JOB_ID = "uploadJobId";
  private String uploadJobId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_UPLOAD_TYPE = "uploadType";
  private AudienceListServiceUploadUserListUploadType uploadType;

  public static final String JSON_PROPERTY_UPLOAD_SUBMIT_DATE = "uploadSubmitDate";
  private String uploadSubmitDate;

  public static final String JSON_PROPERTY_RECEIVED_DATE = "receivedDate";
  private String receivedDate;

  public static final String JSON_PROPERTY_JOB_STATUS = "jobStatus";
  private AudienceListServiceJobStatus jobStatus;

  public AudienceListServiceUploadUserListJob() { 
  }

  public AudienceListServiceUploadUserListJob uploadJobId(String uploadJobId) {
    
    this.uploadJobId = uploadJobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload job ID.&lt;/div&gt; 
   * @return uploadJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadJobId() {
    return uploadJobId;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadJobId(String uploadJobId) {
    this.uploadJobId = uploadJobId;
  }


  public AudienceListServiceUploadUserListJob audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list ID.&lt;/div&gt; 
   * @return audienceListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAudienceListId() {
    return audienceListId;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceUploadUserListUploadType getUploadType() {
    return uploadType;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadType(AudienceListServiceUploadUserListUploadType uploadType) {
    this.uploadType = uploadType;
  }


  public AudienceListServiceUploadUserListJob uploadSubmitDate(String uploadSubmitDate) {
    
    this.uploadSubmitDate = uploadSubmitDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロード日時&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload date and time.&lt;/div&gt; &lt;br&gt;Format: yyyyMMddHHmmss 
   * @return uploadSubmitDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時</div> <div lang=\"en\">Upload date and time.</div> <br>Format: yyyyMMddHHmmss ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_SUBMIT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadSubmitDate() {
    return uploadSubmitDate;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_SUBMIT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadSubmitDate(String uploadSubmitDate) {
    this.uploadSubmitDate = uploadSubmitDate;
  }


  public AudienceListServiceUploadUserListJob receivedDate(String receivedDate) {
    
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロード受付完了日時&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload job completion date and time.&lt;/div&gt; &lt;br&gt;Format: yyyyMMddHHmmss 
   * @return receivedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード受付完了日時</div> <div lang=\"en\">Upload job completion date and time.</div> <br>Format: yyyyMMddHHmmss ")
  @JsonProperty(JSON_PROPERTY_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivedDate() {
    return receivedDate;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AudienceListServiceJobStatus getJobStatus() {
    return jobStatus;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.audienceListId, audienceListServiceUploadUserListJob.audienceListId) &&
        Objects.equals(this.uploadType, audienceListServiceUploadUserListJob.uploadType) &&
        Objects.equals(this.uploadSubmitDate, audienceListServiceUploadUserListJob.uploadSubmitDate) &&
        Objects.equals(this.receivedDate, audienceListServiceUploadUserListJob.receivedDate) &&
        Objects.equals(this.jobStatus, audienceListServiceUploadUserListJob.jobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadJobId, audienceListId, uploadType, uploadSubmitDate, receivedDate, jobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceUploadUserListJob {\n");
    sb.append("    uploadJobId: ").append(toIndentedString(uploadJobId)).append("\n");
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

