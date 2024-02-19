/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceAutoTaggingEnabled;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceClient;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceClientType;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceIsTestAccount;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServicePayment;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adsdisplayapi.v13.model.AccountManagementServiceStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementオブジェクトは、アカウント情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagement objects serve account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementオブジェクトは、アカウント情報を表します。</div> <div lang=\"en\">AccountManagement objects serve account information.</div> ")
@JsonPropertyOrder({
  AccountManagement.JSON_PROPERTY_ACCOUNT_ID,
  AccountManagement.JSON_PROPERTY_ACCOUNT_NAME,
  AccountManagement.JSON_PROPERTY_ACCOUNT_PAYMENT,
  AccountManagement.JSON_PROPERTY_AGENCY_PERSON_NAME,
  AccountManagement.JSON_PROPERTY_AGENCY_PREFECTURE_CODE,
  AccountManagement.JSON_PROPERTY_AUTO_TAGGING_ENABLED,
  AccountManagement.JSON_PROPERTY_CLIENT,
  AccountManagement.JSON_PROPERTY_CLIENT_TYPE,
  AccountManagement.JSON_PROPERTY_CONTACT_BIZ_ID,
  AccountManagement.JSON_PROPERTY_DELIVERY_STATUS,
  AccountManagement.JSON_PROPERTY_END_DATE,
  AccountManagement.JSON_PROPERTY_IS_TEST_ACCOUNT,
  AccountManagement.JSON_PROPERTY_START_DATE,
  AccountManagement.JSON_PROPERTY_STATUS
})
@JsonTypeName("AccountManagement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountManagement {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_PAYMENT = "accountPayment";
  private AccountManagementServicePayment accountPayment;

  public static final String JSON_PROPERTY_AGENCY_PERSON_NAME = "agencyPersonName";
  private String agencyPersonName;

  public static final String JSON_PROPERTY_AGENCY_PREFECTURE_CODE = "agencyPrefectureCode";
  private AccountManagementServicePrefectureCode agencyPrefectureCode;

  public static final String JSON_PROPERTY_AUTO_TAGGING_ENABLED = "autoTaggingEnabled";
  private AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled;

  public static final String JSON_PROPERTY_CLIENT = "client";
  private AccountManagementServiceClient client;

  public static final String JSON_PROPERTY_CLIENT_TYPE = "clientType";
  private AccountManagementServiceClientType clientType;

  public static final String JSON_PROPERTY_CONTACT_BIZ_ID = "contactBizId";
  private String contactBizId;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private AccountManagementServiceDeliveryStatus deliveryStatus;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_IS_TEST_ACCOUNT = "isTestAccount";
  private AccountManagementServiceIsTestAccount isTestAccount;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AccountManagementServiceStatus status;

  public AccountManagement() { 
  }

  public AccountManagement accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Account ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public AccountManagement accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt;このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;br&gt;This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br>このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account name.<br>This field is required in ADD operation, and will be optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountName() {
    return accountName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AccountManagement accountPayment(AccountManagementServicePayment accountPayment) {
    
    this.accountPayment = accountPayment;
    return this;
  }

   /**
   * Get accountPayment
   * @return accountPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServicePayment getAccountPayment() {
    return accountPayment;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountPayment(AccountManagementServicePayment accountPayment) {
    this.accountPayment = accountPayment;
  }


  public AccountManagement agencyPersonName(String agencyPersonName) {
    
    this.agencyPersonName = agencyPersonName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 代理店担当者名です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Agency person name.&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return agencyPersonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Agency person name.<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_AGENCY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgencyPersonName() {
    return agencyPersonName;
  }


  @JsonProperty(JSON_PROPERTY_AGENCY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgencyPersonName(String agencyPersonName) {
    this.agencyPersonName = agencyPersonName;
  }


  public AccountManagement agencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    
    this.agencyPrefectureCode = agencyPrefectureCode;
    return this;
  }

   /**
   * Get agencyPrefectureCode
   * @return agencyPrefectureCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGENCY_PREFECTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServicePrefectureCode getAgencyPrefectureCode() {
    return agencyPrefectureCode;
  }


  @JsonProperty(JSON_PROPERTY_AGENCY_PREFECTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    this.agencyPrefectureCode = agencyPrefectureCode;
  }


  public AccountManagement autoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

   /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }


  public AccountManagement client(AccountManagementServiceClient client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceClient getClient() {
    return client;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClient(AccountManagementServiceClient client) {
    this.client = client;
  }


  public AccountManagement clientType(AccountManagementServiceClientType clientType) {
    
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceClientType getClientType() {
    return clientType;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientType(AccountManagementServiceClientType clientType) {
    this.clientType = clientType;
  }


  public AccountManagement contactBizId(String contactBizId) {
    
    this.contactBizId = contactBizId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウント管理者のYahoo! JAPANビジネスIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Contact business ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return contactBizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Contact business ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_CONTACT_BIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactBizId() {
    return contactBizId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_BIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactBizId(String contactBizId) {
    this.contactBizId = contactBizId;
  }


  public AccountManagement deliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public AccountManagement endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 終了日&lt;br&gt; YYYYMMDD形式で指定 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date&lt;br&gt; YYYYMMDD &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日<br> YYYYMMDD形式で指定 </div> <div lang=\"en\"> End date<br> YYYYMMDD </div> ")
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


  public AccountManagement isTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    
    this.isTestAccount = isTestAccount;
    return this;
  }

   /**
   * Get isTestAccount
   * @return isTestAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }


  public AccountManagement startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 開始日（YYYYMMDD形式）&lt;br&gt; 自動でADD時の日付が登録される。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date&lt;br&gt; YYYYMMDD&lt;br&gt; This field is automatically registered in ADD operation &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日（YYYYMMDD形式）<br> 自動でADD時の日付が登録される。 </div> <div lang=\"en\"> Start date<br> YYYYMMDD<br> This field is automatically registered in ADD operation </div> ")
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


  public AccountManagement status(AccountManagementServiceStatus status) {
    
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

  public AccountManagementServiceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(AccountManagementServiceStatus status) {
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
    AccountManagement accountManagement = (AccountManagement) o;
    return Objects.equals(this.accountId, accountManagement.accountId) &&
        Objects.equals(this.accountName, accountManagement.accountName) &&
        Objects.equals(this.accountPayment, accountManagement.accountPayment) &&
        Objects.equals(this.agencyPersonName, accountManagement.agencyPersonName) &&
        Objects.equals(this.agencyPrefectureCode, accountManagement.agencyPrefectureCode) &&
        Objects.equals(this.autoTaggingEnabled, accountManagement.autoTaggingEnabled) &&
        Objects.equals(this.client, accountManagement.client) &&
        Objects.equals(this.clientType, accountManagement.clientType) &&
        Objects.equals(this.contactBizId, accountManagement.contactBizId) &&
        Objects.equals(this.deliveryStatus, accountManagement.deliveryStatus) &&
        Objects.equals(this.endDate, accountManagement.endDate) &&
        Objects.equals(this.isTestAccount, accountManagement.isTestAccount) &&
        Objects.equals(this.startDate, accountManagement.startDate) &&
        Objects.equals(this.status, accountManagement.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountPayment, agencyPersonName, agencyPrefectureCode, autoTaggingEnabled, client, clientType, contactBizId, deliveryStatus, endDate, isTestAccount, startDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagement {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPayment: ").append(toIndentedString(accountPayment)).append("\n");
    sb.append("    agencyPersonName: ").append(toIndentedString(agencyPersonName)).append("\n");
    sb.append("    agencyPrefectureCode: ").append(toIndentedString(agencyPrefectureCode)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
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

