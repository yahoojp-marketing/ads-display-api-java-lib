/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v11.model.AbTestServiceCampaignUserStatus;
import jp.co.yahoo.adsdisplayapi.v11.model.AbTestServiceIsRemoveFlg;
import jp.co.yahoo.adsdisplayapi.v11.model.AbTestServiceStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AbTestオブジェクトは、A/Bテスト情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The A/B Test object is a container for storing A/B test information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AbTestオブジェクトは、A/Bテスト情報を保持します。</div> <div lang=\"en\">The A/B Test object is a container for storing A/B test information.</div> ")
@JsonPropertyOrder({
  AbTest.JSON_PROPERTY_ACCOUNT_ID,
  AbTest.JSON_PROPERTY_AB_TEST_ID,
  AbTest.JSON_PROPERTY_AB_TEST_NAME,
  AbTest.JSON_PROPERTY_DESCRIPTION,
  AbTest.JSON_PROPERTY_A_CAMPAIGN_ID,
  AbTest.JSON_PROPERTY_A_CAMPAIGN_NAME,
  AbTest.JSON_PROPERTY_A_CAMPAIGN_USER_STATUS,
  AbTest.JSON_PROPERTY_B_CAMPAIGN_ID,
  AbTest.JSON_PROPERTY_B_CAMPAIGN_NAME,
  AbTest.JSON_PROPERTY_B_CAMPAIGN_USER_STATUS,
  AbTest.JSON_PROPERTY_END_DATE,
  AbTest.JSON_PROPERTY_IS_REMOVE_DESCRIPTION,
  AbTest.JSON_PROPERTY_START_DATE,
  AbTest.JSON_PROPERTY_STATUS
})
@JsonTypeName("AbTest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AbTest {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AB_TEST_ID = "abTestId";
  private Long abTestId;

  public static final String JSON_PROPERTY_AB_TEST_NAME = "abTestName";
  private String abTestName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_A_CAMPAIGN_ID = "aCampaignId";
  private Long aCampaignId;

  public static final String JSON_PROPERTY_A_CAMPAIGN_NAME = "aCampaignName";
  private String aCampaignName;

  public static final String JSON_PROPERTY_A_CAMPAIGN_USER_STATUS = "aCampaignUserStatus";
  private AbTestServiceCampaignUserStatus aCampaignUserStatus;

  public static final String JSON_PROPERTY_B_CAMPAIGN_ID = "bCampaignId";
  private Long bCampaignId;

  public static final String JSON_PROPERTY_B_CAMPAIGN_NAME = "bCampaignName";
  private String bCampaignName;

  public static final String JSON_PROPERTY_B_CAMPAIGN_USER_STATUS = "bCampaignUserStatus";
  private AbTestServiceCampaignUserStatus bCampaignUserStatus;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_IS_REMOVE_DESCRIPTION = "isRemoveDescription";
  private AbTestServiceIsRemoveFlg isRemoveDescription;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AbTestServiceStatus status;

  public AbTest() { 
  }

  public AbTest accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、リクエストの場合は必須です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in requests. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、リクエストの場合は必須です。 </div> <div lang=\"en\"> Account ID.<br> This field is required in requests. </div> ")
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


  public AbTest abTestId(Long abTestId) {
    
    this.abTestId = abTestId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; A/BテストIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; A/B test ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. &lt;/div&gt; 
   * @return abTestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> A/BテストIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。 </div> <div lang=\"en\"> A/B test ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AB_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAbTestId() {
    return abTestId;
  }


  @JsonProperty(JSON_PROPERTY_AB_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbTestId(Long abTestId) {
    this.abTestId = abTestId;
  }


  public AbTest abTestName(String abTestName) {
    
    this.abTestName = abTestName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; A/Bテスト名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; A/B test name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return abTestName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> A/Bテスト名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> A/B test name.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AB_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbTestName() {
    return abTestName;
  }


  @JsonProperty(JSON_PROPERTY_AB_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbTestName(String abTestName) {
    this.abTestName = abTestName;
  }


  public AbTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 説明文です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Description text.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 説明文です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Description text.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AbTest aCampaignId(Long aCampaignId) {
    
    this.aCampaignId = aCampaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンAのキャンペーンIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID of Campaign A.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return aCampaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンAのキャンペーンIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Campaign ID of Campaign A.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getaCampaignId() {
    return aCampaignId;
  }


  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setaCampaignId(Long aCampaignId) {
    this.aCampaignId = aCampaignId;
  }


  public AbTest aCampaignName(String aCampaignName) {
    
    this.aCampaignName = aCampaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンAのキャンペーン名です。&lt;br&gt; このフィールドはリクエストの際には無視されます。&lt;br&gt; GET時のみレスポンスの際に返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign Name of Campaign A.&lt;br&gt; This field will be ignored on input.&lt;br&gt; This field will be returned in the GET response only. &lt;/div&gt; 
   * @return aCampaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンAのキャンペーン名です。<br> このフィールドはリクエストの際には無視されます。<br> GET時のみレスポンスの際に返却されます。 </div> <div lang=\"en\"> Campaign Name of Campaign A.<br> This field will be ignored on input.<br> This field will be returned in the GET response only. </div> ")
  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getaCampaignName() {
    return aCampaignName;
  }


  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setaCampaignName(String aCampaignName) {
    this.aCampaignName = aCampaignName;
  }


  public AbTest aCampaignUserStatus(AbTestServiceCampaignUserStatus aCampaignUserStatus) {
    
    this.aCampaignUserStatus = aCampaignUserStatus;
    return this;
  }

   /**
   * Get aCampaignUserStatus
   * @return aCampaignUserStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbTestServiceCampaignUserStatus getaCampaignUserStatus() {
    return aCampaignUserStatus;
  }


  @JsonProperty(JSON_PROPERTY_A_CAMPAIGN_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setaCampaignUserStatus(AbTestServiceCampaignUserStatus aCampaignUserStatus) {
    this.aCampaignUserStatus = aCampaignUserStatus;
  }


  public AbTest bCampaignId(Long bCampaignId) {
    
    this.bCampaignId = bCampaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンBのキャンペーンIDです。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign ID of Campaign B.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation. &lt;/div&gt; 
   * @return bCampaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンBのキャンペーンIDです。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。 </div> <div lang=\"en\"> Campaign ID of Campaign B.<br> This field is required in ADD operation, and will be optional in SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getbCampaignId() {
    return bCampaignId;
  }


  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setbCampaignId(Long bCampaignId) {
    this.bCampaignId = bCampaignId;
  }


  public AbTest bCampaignName(String bCampaignName) {
    
    this.bCampaignName = bCampaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; キャンペーンBのキャンペーン名です。&lt;br&gt; このフィールドはリクエストの際には無視されます。&lt;br&gt; GET時のみレスポンスの際に返却されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Campaign Name of Campaign B.&lt;br&gt; This field will be ignored on input.&lt;br&gt; This field will be returned in the GET response only. &lt;/div&gt; 
   * @return bCampaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> キャンペーンBのキャンペーン名です。<br> このフィールドはリクエストの際には無視されます。<br> GET時のみレスポンスの際に返却されます。 </div> <div lang=\"en\"> Campaign Name of Campaign B.<br> This field will be ignored on input.<br> This field will be returned in the GET response only. </div> ")
  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getbCampaignName() {
    return bCampaignName;
  }


  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setbCampaignName(String bCampaignName) {
    this.bCampaignName = bCampaignName;
  }


  public AbTest bCampaignUserStatus(AbTestServiceCampaignUserStatus bCampaignUserStatus) {
    
    this.bCampaignUserStatus = bCampaignUserStatus;
    return this;
  }

   /**
   * Get bCampaignUserStatus
   * @return bCampaignUserStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbTestServiceCampaignUserStatus getbCampaignUserStatus() {
    return bCampaignUserStatus;
  }


  @JsonProperty(JSON_PROPERTY_B_CAMPAIGN_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setbCampaignUserStatus(AbTestServiceCampaignUserStatus bCampaignUserStatus) {
    this.bCampaignUserStatus = bCampaignUserStatus;
  }


  public AbTest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了日です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *format: yyyyMMdd &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> End date.<br> This field is required in ADD operation, and will be optional in SET operation.<br> *format: yyyyMMdd </div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AbTest isRemoveDescription(AbTestServiceIsRemoveFlg isRemoveDescription) {
    
    this.isRemoveDescription = isRemoveDescription;
    return this;
  }

   /**
   * Get isRemoveDescription
   * @return isRemoveDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbTestServiceIsRemoveFlg getIsRemoveDescription() {
    return isRemoveDescription;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveDescription(AbTestServiceIsRemoveFlg isRemoveDescription) {
    this.isRemoveDescription = isRemoveDescription;
  }


  public AbTest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始日です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; *format: yyyyMMdd &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> Start date.<br> This field is required in ADD operation, and will be optional in SET operation.<br> *format: yyyyMMdd </div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public AbTest status(AbTestServiceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbTestServiceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(AbTestServiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbTest abTest = (AbTest) o;
    return Objects.equals(this.accountId, abTest.accountId) &&
        Objects.equals(this.abTestId, abTest.abTestId) &&
        Objects.equals(this.abTestName, abTest.abTestName) &&
        Objects.equals(this.description, abTest.description) &&
        Objects.equals(this.aCampaignId, abTest.aCampaignId) &&
        Objects.equals(this.aCampaignName, abTest.aCampaignName) &&
        Objects.equals(this.aCampaignUserStatus, abTest.aCampaignUserStatus) &&
        Objects.equals(this.bCampaignId, abTest.bCampaignId) &&
        Objects.equals(this.bCampaignName, abTest.bCampaignName) &&
        Objects.equals(this.bCampaignUserStatus, abTest.bCampaignUserStatus) &&
        Objects.equals(this.endDate, abTest.endDate) &&
        Objects.equals(this.isRemoveDescription, abTest.isRemoveDescription) &&
        Objects.equals(this.startDate, abTest.startDate) &&
        Objects.equals(this.status, abTest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, abTestId, abTestName, description, aCampaignId, aCampaignName, aCampaignUserStatus, bCampaignId, bCampaignName, bCampaignUserStatus, endDate, isRemoveDescription, startDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbTest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    abTestId: ").append(toIndentedString(abTestId)).append("\n");
    sb.append("    abTestName: ").append(toIndentedString(abTestName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    aCampaignId: ").append(toIndentedString(aCampaignId)).append("\n");
    sb.append("    aCampaignName: ").append(toIndentedString(aCampaignName)).append("\n");
    sb.append("    aCampaignUserStatus: ").append(toIndentedString(aCampaignUserStatus)).append("\n");
    sb.append("    bCampaignId: ").append(toIndentedString(bCampaignId)).append("\n");
    sb.append("    bCampaignName: ").append(toIndentedString(bCampaignName)).append("\n");
    sb.append("    bCampaignUserStatus: ").append(toIndentedString(bCampaignUserStatus)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isRemoveDescription: ").append(toIndentedString(isRemoveDescription)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

