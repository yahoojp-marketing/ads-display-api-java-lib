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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v14.model.AudienceListServiceJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AudienceListServiceUploadUserListStatusSelectorオブジェクトは、ユーザーリストのアップロード情報の検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AudienceListServiceUploadUserListStatusSelector object is a container for storing a set of criteria (parameters) for upload jobs of user list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AudienceListServiceUploadUserListStatusSelectorオブジェクトは、ユーザーリストのアップロード情報の検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">The AudienceListServiceUploadUserListStatusSelector object is a container for storing a set of criteria (parameters) for upload jobs of user list.</div> ")
@JsonPropertyOrder({
  AudienceListServiceUploadUserListStatusSelector.JSON_PROPERTY_ACCOUNT_ID,
  AudienceListServiceUploadUserListStatusSelector.JSON_PROPERTY_AUDIENCE_LIST_ID,
  AudienceListServiceUploadUserListStatusSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AudienceListServiceUploadUserListStatusSelector.JSON_PROPERTY_UPLOAD_JOB_IDS,
  AudienceListServiceUploadUserListStatusSelector.JSON_PROPERTY_JOB_STATUSES
})
@JsonTypeName("AudienceListServiceUploadUserListStatusSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceListServiceUploadUserListStatusSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_ID = "audienceListId";
  private Long audienceListId;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 10;

  public static final String JSON_PROPERTY_UPLOAD_JOB_IDS = "uploadJobIds";
  private List<String> uploadJobIds = null;

  public static final String JSON_PROPERTY_JOB_STATUSES = "jobStatuses";
  private List<AudienceListServiceJobStatus> jobStatuses = null;

  public AudienceListServiceUploadUserListStatusSelector() { 
  }

  public AudienceListServiceUploadUserListStatusSelector accountId(Long accountId) {
    
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


  public AudienceListServiceUploadUserListStatusSelector audienceListId(Long audienceListId) {
    
    this.audienceListId = audienceListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オーディエンスリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Audience list ID.&lt;/div&gt; 
   * @return audienceListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">オーディエンスリストIDです。</div> <div lang=\"en\">Audience list ID.</div> ")
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAudienceListId() {
    return audienceListId;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAudienceListId(Long audienceListId) {
    this.audienceListId = audienceListId;
  }


  public AudienceListServiceUploadUserListStatusSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 100
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> ")
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


  public AudienceListServiceUploadUserListStatusSelector uploadJobIds(List<String> uploadJobIds) {
    
    this.uploadJobIds = uploadJobIds;
    return this;
  }

  public AudienceListServiceUploadUserListStatusSelector addUploadJobIdsItem(String uploadJobIdsItem) {
    if (this.uploadJobIds == null) {
      this.uploadJobIds = new ArrayList<>();
    }
    this.uploadJobIds.add(uploadJobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload job ID.&lt;/div&gt; 
   * @return uploadJobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードジョブIDです。</div> <div lang=\"en\">Upload job ID.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUploadJobIds() {
    return uploadJobIds;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadJobIds(List<String> uploadJobIds) {
    this.uploadJobIds = uploadJobIds;
  }


  public AudienceListServiceUploadUserListStatusSelector jobStatuses(List<AudienceListServiceJobStatus> jobStatuses) {
    
    this.jobStatuses = jobStatuses;
    return this;
  }

  public AudienceListServiceUploadUserListStatusSelector addJobStatusesItem(AudienceListServiceJobStatus jobStatusesItem) {
    if (this.jobStatuses == null) {
      this.jobStatuses = new ArrayList<>();
    }
    this.jobStatuses.add(jobStatusesItem);
    return this;
  }

   /**
   * Get jobStatuses
   * @return jobStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AudienceListServiceJobStatus> getJobStatuses() {
    return jobStatuses;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobStatuses(List<AudienceListServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceListServiceUploadUserListStatusSelector audienceListServiceUploadUserListStatusSelector = (AudienceListServiceUploadUserListStatusSelector) o;
    return Objects.equals(this.accountId, audienceListServiceUploadUserListStatusSelector.accountId) &&
        Objects.equals(this.audienceListId, audienceListServiceUploadUserListStatusSelector.audienceListId) &&
        Objects.equals(this.numberResults, audienceListServiceUploadUserListStatusSelector.numberResults) &&
        Objects.equals(this.uploadJobIds, audienceListServiceUploadUserListStatusSelector.uploadJobIds) &&
        Objects.equals(this.jobStatuses, audienceListServiceUploadUserListStatusSelector.jobStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, audienceListId, numberResults, uploadJobIds, jobStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceListServiceUploadUserListStatusSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    audienceListId: ").append(toIndentedString(audienceListId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    uploadJobIds: ").append(toIndentedString(uploadJobIds)).append("\n");
    sb.append("    jobStatuses: ").append(toIndentedString(jobStatuses)).append("\n");
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

