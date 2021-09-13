package jp.co.yahoo.adsdisplayapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v4.model.BrandLiftServiceApprovalStatus;
import jp.co.yahoo.adsdisplayapi.v4.model.BrandLiftServiceQuestion;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BrandLiftオブジェクトは、ブランドリフトの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BrandLift object describes brand lift information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BrandLiftオブジェクトは、ブランドリフトの情報を表します。</div> <div lang=\"en\">BrandLift object describes brand lift information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BrandLift   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("brandLiftId")
  private Long brandLiftId = null;

  @JsonProperty("questions")
  @Valid
  private List<BrandLiftServiceQuestion> questions = null;

  @JsonProperty("approvalStatus")
  private BrandLiftServiceApprovalStatus approvalStatus = null;

  @JsonProperty("disapprovalReason")
  private String disapprovalReason = null;

  @JsonProperty("reviewCompleteDate")
  private String reviewCompleteDate = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("submitDate")
  private String submitDate = null;

  @JsonProperty("campaignStartDate")
  private String campaignStartDate = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("notificationBusinessIds")
  @Valid
  private List<String> notificationBusinessIds = null;

  public BrandLift accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID. </div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public BrandLift campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID. </div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public BrandLift brandLiftId(Long brandLiftId) {
    this.brandLiftId = brandLiftId;
    return this;
  }

  /**
   * <div lang=\"ja\">ブランドリフト調査IDです。</div> <div lang=\"en\">BrandLift ID. </div> 
   * @return brandLiftId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ブランドリフト調査IDです。</div> <div lang=\"en\">BrandLift ID. </div> ")


  public Long getBrandLiftId() {
    return brandLiftId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<BrandLiftServiceQuestion> getQuestions() {
    return questions;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public BrandLiftServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(BrandLiftServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public BrandLift disapprovalReason(String disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由です。</div> <div lang=\"en\">Disapproval Reason. </div> 
   * @return disapprovalReason
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由です。</div> <div lang=\"en\">Disapproval Reason. </div> ")


  public String getDisapprovalReason() {
    return disapprovalReason;
  }

  public void setDisapprovalReason(String disapprovalReason) {
    this.disapprovalReason = disapprovalReason;
  }

  public BrandLift reviewCompleteDate(String reviewCompleteDate) {
    this.reviewCompleteDate = reviewCompleteDate;
    return this;
  }

  /**
   * <div lang=\"ja\">審査完了日時です。</div> <div lang=\"en\">Review Complete Date.</div> <br>Format: yyyyMMddHHmmss 
   * @return reviewCompleteDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査完了日時です。</div> <div lang=\"en\">Review Complete Date.</div> <br>Format: yyyyMMddHHmmss ")


  public String getReviewCompleteDate() {
    return reviewCompleteDate;
  }

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
   * <div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Disapproval Reason Codes</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Disapproval Reason Codes</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public BrandLift submitDate(String submitDate) {
    this.submitDate = submitDate;
    return this;
  }

  /**
   * <div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Submit Date.</div> <br>Format: yyyyMMddHHmmss 
   * @return submitDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入稿日時です。</div> <div lang=\"en\">Submit Date.</div> <br>Format: yyyyMMddHHmmss ")


  public String getSubmitDate() {
    return submitDate;
  }

  public void setSubmitDate(String submitDate) {
    this.submitDate = submitDate;
  }

  public BrandLift campaignStartDate(String campaignStartDate) {
    this.campaignStartDate = campaignStartDate;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン配信開始日時です。</div> <div lang=\"en\">Campaign Start Date. </div> <br>Format: yyyyMMdd 
   * @return campaignStartDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン配信開始日時です。</div> <div lang=\"en\">Campaign Start Date. </div> <br>Format: yyyyMMdd ")


  public String getCampaignStartDate() {
    return campaignStartDate;
  }

  public void setCampaignStartDate(String campaignStartDate) {
    this.campaignStartDate = campaignStartDate;
  }

  public BrandLift campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name. </div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name. </div> ")


  public String getCampaignName() {
    return campaignName;
  }

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
   * <div lang=\"ja\">連絡先Yahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID to send notifications.</div> 
   * @return notificationBusinessIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">連絡先Yahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID to send notifications.</div> ")


  public List<String> getNotificationBusinessIds() {
    return notificationBusinessIds;
  }

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

