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
import jp.co.yahoo.adsdisplayapi.v10.model.BrandLiftServiceQuestion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftオブジェクトは、ブランドリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLift object describes brand lift information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BrandLiftオブジェクトは、ブランドリフトの情報を表します。</div> <div lang=\"en\">BrandLift object describes brand lift information.</div> ")
@JsonPropertyOrder({
  BrandLift.JSON_PROPERTY_ACCOUNT_ID,
  BrandLift.JSON_PROPERTY_CAMPAIGN_ID,
  BrandLift.JSON_PROPERTY_BRAND_LIFT_ID,
  BrandLift.JSON_PROPERTY_QUESTIONS,
  BrandLift.JSON_PROPERTY_APPROVAL_STATUS,
  BrandLift.JSON_PROPERTY_DISAPPROVAL_REASON,
  BrandLift.JSON_PROPERTY_REVIEW_COMPLETE_DATE,
  BrandLift.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  BrandLift.JSON_PROPERTY_SUBMIT_DATE,
  BrandLift.JSON_PROPERTY_CAMPAIGN_START_DATE,
  BrandLift.JSON_PROPERTY_CAMPAIGN_NAME,
  BrandLift.JSON_PROPERTY_NOTIFICATION_BUSINESS_IDS
})
@JsonTypeName("BrandLift")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrandLift {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_BRAND_LIFT_ID = "brandLiftId";
  private Long brandLiftId;

  public static final String JSON_PROPERTY_QUESTIONS = "questions";
  private List<BrandLiftServiceQuestion> questions = null;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private BrandLiftServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON = "disapprovalReason";
  private String disapprovalReason;

  public static final String JSON_PROPERTY_REVIEW_COMPLETE_DATE = "reviewCompleteDate";
  private String reviewCompleteDate;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public static final String JSON_PROPERTY_SUBMIT_DATE = "submitDate";
  private String submitDate;

  public static final String JSON_PROPERTY_CAMPAIGN_START_DATE = "campaignStartDate";
  private String campaignStartDate;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_NOTIFICATION_BUSINESS_IDS = "notificationBusinessIds";
  private List<String> notificationBusinessIds = null;

  public BrandLift() { 
  }

  public BrandLift accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public BrandLift campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID. &lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandLift brandLiftId(Long brandLiftId) {
    
    this.brandLiftId = brandLiftId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ブランドリフト調査IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLift ID. &lt;/div&gt; 
   * @return brandLiftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ブランドリフト調査IDです。</div> <div lang=\"en\">BrandLift ID. </div> ")
  @JsonProperty(JSON_PROPERTY_BRAND_LIFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBrandLiftId() {
    return brandLiftId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_LIFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandLiftId(Long brandLiftId) {
    this.brandLiftId = brandLiftId;
  }


  public BrandLift questions(List<BrandLiftServiceQuestion> questions) {
    
    this.questions = questions;
    return this;
  }

  public BrandLift addQuestionsItem(BrandLiftServiceQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BrandLiftServiceQuestion> getQuestions() {
    return questions;
  }


  @JsonProperty(JSON_PROPERTY_QUESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestions(List<BrandLiftServiceQuestion> questions) {
    this.questions = questions;
  }


  public BrandLift approvalStatus(BrandLiftServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrandLiftServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(BrandLiftServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public BrandLift disapprovalReason(String disapprovalReason) {
    
    this.disapprovalReason = disapprovalReason;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Disapproval Reason. &lt;/div&gt; 
   * @return disapprovalReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由です。</div> <div lang=\"en\">Disapproval Reason. </div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisapprovalReason() {
    return disapprovalReason;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReason(String disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
  }


  public BrandLift reviewCompleteDate(String reviewCompleteDate) {
    
    this.reviewCompleteDate = reviewCompleteDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査完了日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Review Complete Date.&lt;/div&gt; &lt;br&gt;Format: yyyyMMddHHmmss 
   * @return reviewCompleteDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査完了日時です。</div> <div lang=\"en\">Review Complete Date.</div> <br>Format: yyyyMMddHHmmss ")
  @JsonProperty(JSON_PROPERTY_REVIEW_COMPLETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewCompleteDate() {
    return reviewCompleteDate;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_COMPLETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewCompleteDate(String reviewCompleteDate) {
    this.reviewCompleteDate = reviewCompleteDate;
  }


  public BrandLift disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public BrandLift addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Disapproval Reason Codes&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Disapproval Reason Codes</div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public BrandLift submitDate(String submitDate) {
    
    this.submitDate = submitDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入稿日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Submit Date.&lt;/div&gt; &lt;br&gt;Format: yyyyMMddHHmmss 
   * @return submitDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Submit Date.</div> <br>Format: yyyyMMddHHmmss ")
  @JsonProperty(JSON_PROPERTY_SUBMIT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubmitDate() {
    return submitDate;
  }


  @JsonProperty(JSON_PROPERTY_SUBMIT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitDate(String submitDate) {
    this.submitDate = submitDate;
  }


  public BrandLift campaignStartDate(String campaignStartDate) {
    
    this.campaignStartDate = campaignStartDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン配信開始日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign Start Date. &lt;/div&gt; &lt;br&gt;Format: yyyyMMdd 
   * @return campaignStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン配信開始日時です。</div> <div lang=\"en\">Campaign Start Date. </div> <br>Format: yyyyMMdd ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignStartDate() {
    return campaignStartDate;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignStartDate(String campaignStartDate) {
    this.campaignStartDate = campaignStartDate;
  }


  public BrandLift campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign Name. &lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name. </div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BrandLift notificationBusinessIds(List<String> notificationBusinessIds) {
    
    this.notificationBusinessIds = notificationBusinessIds;
    return this;
  }

  public BrandLift addNotificationBusinessIdsItem(String notificationBusinessIdsItem) {
    if (this.notificationBusinessIds == null) {
      this.notificationBusinessIds = new ArrayList<>();
    }
    this.notificationBusinessIds.add(notificationBusinessIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;連絡先Yahoo! JAPANビジネスIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Yahoo! JAPAN Business ID to send notifications.&lt;/div&gt; 
   * @return notificationBusinessIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">連絡先Yahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID to send notifications.</div> ")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_BUSINESS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNotificationBusinessIds() {
    return notificationBusinessIds;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_BUSINESS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationBusinessIds(List<String> notificationBusinessIds) {
    this.notificationBusinessIds = notificationBusinessIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandLift brandLift = (BrandLift) o;
    return Objects.equals(this.accountId, brandLift.accountId) &&
        Objects.equals(this.campaignId, brandLift.campaignId) &&
        Objects.equals(this.brandLiftId, brandLift.brandLiftId) &&
        Objects.equals(this.questions, brandLift.questions) &&
        Objects.equals(this.approvalStatus, brandLift.approvalStatus) &&
        Objects.equals(this.disapprovalReason, brandLift.disapprovalReason) &&
        Objects.equals(this.reviewCompleteDate, brandLift.reviewCompleteDate) &&
        Objects.equals(this.disapprovalReasonCodes, brandLift.disapprovalReasonCodes) &&
        Objects.equals(this.submitDate, brandLift.submitDate) &&
        Objects.equals(this.campaignStartDate, brandLift.campaignStartDate) &&
        Objects.equals(this.campaignName, brandLift.campaignName) &&
        Objects.equals(this.notificationBusinessIds, brandLift.notificationBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, brandLiftId, questions, approvalStatus, disapprovalReason, reviewCompleteDate, disapprovalReasonCodes, submitDate, campaignStartDate, campaignName, notificationBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandLift {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    brandLiftId: ").append(toIndentedString(brandLiftId)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    disapprovalReason: ").append(toIndentedString(disapprovalReason)).append("\n");
    sb.append("    reviewCompleteDate: ").append(toIndentedString(reviewCompleteDate)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    submitDate: ").append(toIndentedString(submitDate)).append("\n");
    sb.append("    campaignStartDate: ").append(toIndentedString(campaignStartDate)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    notificationBusinessIds: ").append(toIndentedString(notificationBusinessIds)).append("\n");
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

