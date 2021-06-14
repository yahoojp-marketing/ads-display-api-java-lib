package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceAutoTaggingEnabled;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceIsManagerAccount;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceIsTestAccount;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Accountオブジェクトは、アカウント情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account objects serve account information.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Accountオブジェクトは、アカウント情報を示します。<br> </div> <div lang=\"en\">Account objects serve account information.<br> </div> ")

public class Account   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("accountName")
  private JsonNullable<String> accountName = JsonNullable.undefined();

  @JsonProperty("accountStatus")
  private JsonNullable<AccountServiceStatus> accountStatus = JsonNullable.undefined();

  @JsonProperty("accountType")
  private JsonNullable<AccountServiceType> accountType = JsonNullable.undefined();

  @JsonProperty("authType")
  private JsonNullable<AccountServiceAuthType> authType = JsonNullable.undefined();

  @JsonProperty("autoTaggingEnabled")
  private JsonNullable<AccountServiceAutoTaggingEnabled> autoTaggingEnabled = JsonNullable.undefined();

  @JsonProperty("deliveryStatus")
  private JsonNullable<AccountServiceDeliveryStatus> deliveryStatus = JsonNullable.undefined();

  @JsonProperty("isTestAccount")
  private JsonNullable<AccountServiceIsTestAccount> isTestAccount = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("isManagerAccount")
  private JsonNullable<AccountServiceIsManagerAccount> isManagerAccount = JsonNullable.undefined();

  @JsonProperty("contactBizId")
  private JsonNullable<String> contactBizId = JsonNullable.undefined();

  public Account accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Account accountName(String accountName) {
    this.accountName = JsonNullable.of(accountName);
    return this;
  }

  /**
   * <div lang=\"ja\"> アカウント名です。<br> SET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account name.<br> This field is optional in SET operation. </div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウント名です。<br> SET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account name.<br> This field is optional in SET operation. </div> ")


  public JsonNullable<String> getAccountName() {
    return accountName;
  }

  public void setAccountName(JsonNullable<String> accountName) {
    this.accountName = accountName;
  }

  public Account accountStatus(AccountServiceStatus accountStatus) {
    this.accountStatus = JsonNullable.of(accountStatus);
    return this;
  }

  /**
   * Get accountStatus
   * @return accountStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceStatus> getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(JsonNullable<AccountServiceStatus> accountStatus) {
    this.accountStatus = accountStatus;
  }

  public Account accountType(AccountServiceType accountType) {
    this.accountType = JsonNullable.of(accountType);
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceType> getAccountType() {
    return accountType;
  }

  public void setAccountType(JsonNullable<AccountServiceType> accountType) {
    this.accountType = accountType;
  }

  public Account authType(AccountServiceAuthType authType) {
    this.authType = JsonNullable.of(authType);
    return this;
  }

  /**
   * Get authType
   * @return authType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceAuthType> getAuthType() {
    return authType;
  }

  public void setAuthType(JsonNullable<AccountServiceAuthType> authType) {
    this.authType = authType;
  }

  public Account autoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = JsonNullable.of(autoTaggingEnabled);
    return this;
  }

  /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceAutoTaggingEnabled> getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }

  public void setAutoTaggingEnabled(JsonNullable<AccountServiceAutoTaggingEnabled> autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }

  public Account deliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = JsonNullable.of(deliveryStatus);
    return this;
  }

  /**
   * Get deliveryStatus
   * @return deliveryStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceDeliveryStatus> getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(JsonNullable<AccountServiceDeliveryStatus> deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public Account isTestAccount(AccountServiceIsTestAccount isTestAccount) {
    this.isTestAccount = JsonNullable.of(isTestAccount);
    return this;
  }

  /**
   * Get isTestAccount
   * @return isTestAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceIsTestAccount> getIsTestAccount() {
    return isTestAccount;
  }

  public void setIsTestAccount(JsonNullable<AccountServiceIsTestAccount> isTestAccount) {
    this.isTestAccount = isTestAccount;
  }

  public Account startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載開始日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載開始日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public Account endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 掲載終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public Account isManagerAccount(AccountServiceIsManagerAccount isManagerAccount) {
    this.isManagerAccount = JsonNullable.of(isManagerAccount);
    return this;
  }

  /**
   * Get isManagerAccount
   * @return isManagerAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceIsManagerAccount> getIsManagerAccount() {
    return isManagerAccount;
  }

  public void setIsManagerAccount(JsonNullable<AccountServiceIsManagerAccount> isManagerAccount) {
    this.isManagerAccount = isManagerAccount;
  }

  public Account contactBizId(String contactBizId) {
    this.contactBizId = JsonNullable.of(contactBizId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。<br> テストアカウントの場合、このフィールドは更新できません。</div> <div lang=\"en\">Contact Business ID.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request.<br> If isTestAccount is \"TRUE\", this field cannot be updated.</div> 
   * @return contactBizId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。<br> テストアカウントの場合、このフィールドは更新できません。</div> <div lang=\"en\">Contact Business ID.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request.<br> If isTestAccount is \"TRUE\", this field cannot be updated.</div> ")


  public JsonNullable<String> getContactBizId() {
    return contactBizId;
  }

  public void setContactBizId(JsonNullable<String> contactBizId) {
    this.contactBizId = contactBizId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.accountStatus, account.accountStatus) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.authType, account.authType) &&
        Objects.equals(this.autoTaggingEnabled, account.autoTaggingEnabled) &&
        Objects.equals(this.deliveryStatus, account.deliveryStatus) &&
        Objects.equals(this.isTestAccount, account.isTestAccount) &&
        Objects.equals(this.startDate, account.startDate) &&
        Objects.equals(this.endDate, account.endDate) &&
        Objects.equals(this.isManagerAccount, account.isManagerAccount) &&
        Objects.equals(this.contactBizId, account.contactBizId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountStatus, accountType, authType, autoTaggingEnabled, deliveryStatus, isTestAccount, startDate, endDate, isManagerAccount, contactBizId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isManagerAccount: ").append(toIndentedString(isManagerAccount)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

