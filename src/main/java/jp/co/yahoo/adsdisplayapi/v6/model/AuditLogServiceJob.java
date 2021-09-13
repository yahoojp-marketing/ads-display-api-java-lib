package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AuditLogServiceDateRange;
import jp.co.yahoo.adsdisplayapi.v6.model.AuditLogServiceJobStatus;
import jp.co.yahoo.adsdisplayapi.v6.model.AuditLogServiceLang;
import jp.co.yahoo.adsdisplayapi.v6.model.AuditLogServiceUpdateSource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceJobは操作履歴のダウンロードジョブの情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceJob object is a container for storing the download operation history job information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceJobは操作履歴のダウンロードジョブの情報を保持するオブジェクトです。</div> <div lang=\"en\">AuditLogServiceJob object is a container for storing the download operation history job information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceJob   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("auditLogJobEndDate")
  private String auditLogJobEndDate = null;

  @JsonProperty("auditLogJobId")
  private Long auditLogJobId = null;

  @JsonProperty("auditLogJobName")
  private String auditLogJobName = null;

  @JsonProperty("auditLogJobStartDate")
  private String auditLogJobStartDate = null;

  @JsonProperty("auditLogJobUserName")
  private String auditLogJobUserName = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("dateRange")
  private AuditLogServiceDateRange dateRange = null;

  @JsonProperty("jobStatus")
  private AuditLogServiceJobStatus jobStatus = null;

  @JsonProperty("lang")
  private AuditLogServiceLang lang = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("updateSource")
  private AuditLogServiceUpdateSource updateSource = null;

  public AuditLogServiceJob accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceJob auditLogJobEndDate(String auditLogJobEndDate) {
    this.auditLogJobEndDate = auditLogJobEndDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 操作履歴ダウンロードジョブの終了日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The job end date (YYYY-MM-DDTHH:MI:SS+9:00).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return auditLogJobEndDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 操作履歴ダウンロードジョブの終了日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The job end date (YYYY-MM-DDTHH:MI:SS+9:00).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAuditLogJobEndDate() {
    return auditLogJobEndDate;
  }

  public void setAuditLogJobEndDate(String auditLogJobEndDate) {
    this.auditLogJobEndDate = auditLogJobEndDate;
  }

  public AuditLogServiceJob auditLogJobId(Long auditLogJobId) {
    this.auditLogJobId = auditLogJobId;
    return this;
  }

  /**
   * <div lang=\"ja\"> 操作履歴のダウンロードジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The operation history job ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return auditLogJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 操作履歴のダウンロードジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The operation history job ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Long getAuditLogJobId() {
    return auditLogJobId;
  }

  public void setAuditLogJobId(Long auditLogJobId) {
    this.auditLogJobId = auditLogJobId;
  }

  public AuditLogServiceJob auditLogJobName(String auditLogJobName) {
    this.auditLogJobName = auditLogJobName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 操作履歴のダウンロードジョブ名です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> The operation history job name.<br> This field is optional in requests. </div> 
   * @return auditLogJobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 操作履歴のダウンロードジョブ名です。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> The operation history job name.<br> This field is optional in requests. </div> ")


  public String getAuditLogJobName() {
    return auditLogJobName;
  }

  public void setAuditLogJobName(String auditLogJobName) {
    this.auditLogJobName = auditLogJobName;
  }

  public AuditLogServiceJob auditLogJobStartDate(String auditLogJobStartDate) {
    this.auditLogJobStartDate = auditLogJobStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 操作履歴ダウンロードジョブの開始日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The job start date (YYYY-MM-DDTHH:MI:SS+9:00).<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return auditLogJobStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 操作履歴ダウンロードジョブの開始日時です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The job start date (YYYY-MM-DDTHH:MI:SS+9:00).<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAuditLogJobStartDate() {
    return auditLogJobStartDate;
  }

  public void setAuditLogJobStartDate(String auditLogJobStartDate) {
    this.auditLogJobStartDate = auditLogJobStartDate;
  }

  public AuditLogServiceJob auditLogJobUserName(String auditLogJobUserName) {
    this.auditLogJobUserName = auditLogJobUserName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 操作履歴ダウンロードジョブの実行ユーザー名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The user name who executes the operation history job.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return auditLogJobUserName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 操作履歴ダウンロードジョブの実行ユーザー名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> The user name who executes the operation history job.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAuditLogJobUserName() {
    return auditLogJobUserName;
  }

  public void setAuditLogJobUserName(String auditLogJobUserName) {
    this.auditLogJobUserName = auditLogJobUserName;
  }

  public AuditLogServiceJob campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AuditLogServiceJob addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\"> ダウンロード対象のキャンペーンIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Campaign ID of the download object.<br> This field is optional in requests. </div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> ダウンロード対象のキャンペーンIDです。<br> このフィールドは、リクエストの場合は省略可能となります。 </div> <div lang=\"en\"> Campaign ID of the download object.<br> This field is optional in requests. </div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AuditLogServiceJob dateRange(AuditLogServiceDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(AuditLogServiceDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public AuditLogServiceJob jobStatus(AuditLogServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(AuditLogServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }

  public AuditLogServiceJob lang(AuditLogServiceLang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceLang getLang() {
    return lang;
  }

  public void setLang(AuditLogServiceLang lang) {
    this.lang = lang;
  }

  public AuditLogServiceJob progress(Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * <div lang=\"ja\"> 処理進捗です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Displays progress in integers from 1 to 100.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return progress
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 処理進捗です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Displays progress in integers from 1 to 100.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public AuditLogServiceJob updateSource(AuditLogServiceUpdateSource updateSource) {
    this.updateSource = updateSource;
    return this;
  }

  /**
   * Get updateSource
   * @return updateSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceUpdateSource getUpdateSource() {
    return updateSource;
  }

  public void setUpdateSource(AuditLogServiceUpdateSource updateSource) {
    this.updateSource = updateSource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceJob auditLogServiceJob = (AuditLogServiceJob) o;
    return Objects.equals(this.accountId, auditLogServiceJob.accountId) &&
        Objects.equals(this.auditLogJobEndDate, auditLogServiceJob.auditLogJobEndDate) &&
        Objects.equals(this.auditLogJobId, auditLogServiceJob.auditLogJobId) &&
        Objects.equals(this.auditLogJobName, auditLogServiceJob.auditLogJobName) &&
        Objects.equals(this.auditLogJobStartDate, auditLogServiceJob.auditLogJobStartDate) &&
        Objects.equals(this.auditLogJobUserName, auditLogServiceJob.auditLogJobUserName) &&
        Objects.equals(this.campaignIds, auditLogServiceJob.campaignIds) &&
        Objects.equals(this.dateRange, auditLogServiceJob.dateRange) &&
        Objects.equals(this.jobStatus, auditLogServiceJob.jobStatus) &&
        Objects.equals(this.lang, auditLogServiceJob.lang) &&
        Objects.equals(this.progress, auditLogServiceJob.progress) &&
        Objects.equals(this.updateSource, auditLogServiceJob.updateSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, auditLogJobEndDate, auditLogJobId, auditLogJobName, auditLogJobStartDate, auditLogJobUserName, campaignIds, dateRange, jobStatus, lang, progress, updateSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceJob {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    auditLogJobEndDate: ").append(toIndentedString(auditLogJobEndDate)).append("\n");
    sb.append("    auditLogJobId: ").append(toIndentedString(auditLogJobId)).append("\n");
    sb.append("    auditLogJobName: ").append(toIndentedString(auditLogJobName)).append("\n");
    sb.append("    auditLogJobStartDate: ").append(toIndentedString(auditLogJobStartDate)).append("\n");
    sb.append("    auditLogJobUserName: ").append(toIndentedString(auditLogJobUserName)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    updateSource: ").append(toIndentedString(updateSource)).append("\n");
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

