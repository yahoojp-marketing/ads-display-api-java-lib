package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceAutoTaggingEnabled;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceClient;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceClientType;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceIsTestAccount;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServicePayment;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementオブジェクトは、アカウント情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagement objects serve account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementオブジェクトは、アカウント情報を表します。</div> <div lang=\"en\">AccountManagement objects serve account information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagement   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("accountPayment")
  private AccountManagementServicePayment accountPayment = null;

  @JsonProperty("agencyPersonName")
  private String agencyPersonName = null;

  @JsonProperty("agencyPrefectureCode")
  private AccountManagementServicePrefectureCode agencyPrefectureCode = null;

  @JsonProperty("authType")
  private AccountManagementServiceAuthType authType = null;

  @JsonProperty("autoTaggingEnabled")
  private AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled = null;

  @JsonProperty("client")
  private AccountManagementServiceClient client = null;

  @JsonProperty("clientType")
  private AccountManagementServiceClientType clientType = null;

  @JsonProperty("contactBizId")
  private String contactBizId = null;

  @JsonProperty("deliveryStatus")
  private AccountManagementServiceDeliveryStatus deliveryStatus = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("isTestAccount")
  private AccountManagementServiceIsTestAccount isTestAccount = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("status")
  private AccountManagementServiceStatus status = null;

  public AccountManagement accountId(Long accountId) {
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

  public AccountManagement accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント名です。<br>このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account Name.<br>This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br>このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account Name.<br>This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public String getAccountName() {
    return accountName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServicePayment getAccountPayment() {
    return accountPayment;
  }

  public void setAccountPayment(AccountManagementServicePayment accountPayment) {
    this.accountPayment = accountPayment;
  }

  public AccountManagement agencyPersonName(String agencyPersonName) {
    this.agencyPersonName = agencyPersonName;
    return this;
  }

  /**
   * <div lang=\"ja\"> 代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Agency Person Name.<br> This field is optional in ADD and SET operation. </div> 
   * @return agencyPersonName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Agency Person Name.<br> This field is optional in ADD and SET operation. </div> ")


  public String getAgencyPersonName() {
    return agencyPersonName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServicePrefectureCode getAgencyPrefectureCode() {
    return agencyPrefectureCode;
  }

  public void setAgencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    this.agencyPrefectureCode = agencyPrefectureCode;
  }

  public AccountManagement authType(AccountManagementServiceAuthType authType) {
    this.authType = authType;
    return this;
  }

  /**
   * Get authType
   * @return authType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(AccountManagementServiceAuthType authType) {
    this.authType = authType;
  }

  public AccountManagement autoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

  /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceClient getClient() {
    return client;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceClientType getClientType() {
    return clientType;
  }

  public void setClientType(AccountManagementServiceClientType clientType) {
    this.clientType = clientType;
  }

  public AccountManagement contactBizId(String contactBizId) {
    this.contactBizId = contactBizId;
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Contact Business ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return contactBizId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Contact Business ID.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getContactBizId() {
    return contactBizId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public AccountManagement endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 終了日<br> YYYYMMDD形式で指定 </div> <div lang=\"en\"> End Date<br> YYYYMMDD </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 終了日<br> YYYYMMDD形式で指定 </div> <div lang=\"en\"> End Date<br> YYYYMMDD </div> ")


  public String getEndDate() {
    return endDate;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }

  public void setIsTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }

  public AccountManagement startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 開始日（YYYYMMDD形式）<br> 自動でADD時の日付が登録される。 </div> <div lang=\"en\"> Start Date<br> YYYYMMDD<br> This field is automatically regisetered in ADD operation </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 開始日（YYYYMMDD形式）<br> 自動でADD時の日付が登録される。 </div> <div lang=\"en\"> Start Date<br> YYYYMMDD<br> This field is automatically regisetered in ADD operation </div> ")


  public String getStartDate() {
    return startDate;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceStatus getStatus() {
    return status;
  }

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
        Objects.equals(this.authType, accountManagement.authType) &&
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
    return Objects.hash(accountId, accountName, accountPayment, agencyPersonName, agencyPrefectureCode, authType, autoTaggingEnabled, client, clientType, contactBizId, deliveryStatus, endDate, isTestAccount, startDate, status);
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
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

