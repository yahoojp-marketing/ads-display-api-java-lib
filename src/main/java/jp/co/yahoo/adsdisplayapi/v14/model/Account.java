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
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceAutoTaggingEnabled;
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceDeliveryStatus;
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceIsMccAccount;
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceIsTestAccount;
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceStatus;
import jp.co.yahoo.adsdisplayapi.v14.model.AccountServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Accountオブジェクトは、アカウント情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account objects serve account information.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Accountオブジェクトは、アカウント情報を示します。<br> </div> <div lang=\"en\">Account objects serve account information.<br> </div> ")
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ACCOUNT_ID,
  Account.JSON_PROPERTY_ACCOUNT_NAME,
  Account.JSON_PROPERTY_ACCOUNT_STATUS,
  Account.JSON_PROPERTY_ACCOUNT_TYPE,
  Account.JSON_PROPERTY_AUTO_TAGGING_ENABLED,
  Account.JSON_PROPERTY_DELIVERY_STATUS,
  Account.JSON_PROPERTY_IS_TEST_ACCOUNT,
  Account.JSON_PROPERTY_START_DATE,
  Account.JSON_PROPERTY_END_DATE,
  Account.JSON_PROPERTY_IS_MCC_ACCOUNT,
  Account.JSON_PROPERTY_CONTACT_BIZ_ID,
  Account.JSON_PROPERTY_OPTIMIZATION_SCORE
})
@JsonTypeName("Account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUS = "accountStatus";
  private AccountServiceStatus accountStatus;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountServiceType accountType;

  public static final String JSON_PROPERTY_AUTO_TAGGING_ENABLED = "autoTaggingEnabled";
  private AccountServiceAutoTaggingEnabled autoTaggingEnabled;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private AccountServiceDeliveryStatus deliveryStatus;

  public static final String JSON_PROPERTY_IS_TEST_ACCOUNT = "isTestAccount";
  private AccountServiceIsTestAccount isTestAccount;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_IS_MCC_ACCOUNT = "isMccAccount";
  private AccountServiceIsMccAccount isMccAccount;

  public static final String JSON_PROPERTY_CONTACT_BIZ_ID = "contactBizId";
  private String contactBizId;

  public static final String JSON_PROPERTY_OPTIMIZATION_SCORE = "optimizationScore";
  private Double optimizationScore;

  public Account() { 
  }

  public Account accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID.&lt;br&gt; This field is required in SET operation. &lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウントIDです。<br> SET時、このフィールドは必須となります。 </div> <div lang=\"en\"> Account ID.<br> This field is required in SET operation. </div> ")
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


  public Account accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウント名です。&lt;br&gt; SET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account name.&lt;br&gt; This field is optional in SET operation. &lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> アカウント名です。<br> SET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Account name.<br> This field is optional in SET operation. </div> ")
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


  public Account accountStatus(AccountServiceStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceStatus getAccountStatus() {
    return accountStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatus(AccountServiceStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public Account accountType(AccountServiceType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceType getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(AccountServiceType accountType) {
    this.accountType = accountType;
  }


  public Account autoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    
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

  public AccountServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }


  public Account deliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    
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

  public AccountServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public Account isTestAccount(AccountServiceIsTestAccount isTestAccount) {
    
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

  public AccountServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTestAccount(AccountServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }


  public Account startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載開始日です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Start date of ad serving.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載開始日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> Start date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public Account endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 掲載終了日です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; End date of ad serving.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 掲載終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\"> End date of ad serving.<br> Although this field will be returned in the response, it will be ignored on input. </div> ")
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


  public Account isMccAccount(AccountServiceIsMccAccount isMccAccount) {
    
    this.isMccAccount = isMccAccount;
    return this;
  }

   /**
   * Get isMccAccount
   * @return isMccAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIsMccAccount getIsMccAccount() {
    return isMccAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMccAccount(AccountServiceIsMccAccount isMccAccount) {
    this.isMccAccount = isMccAccount;
  }


  public Account contactBizId(String contactBizId) {
    
    this.contactBizId = contactBizId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント管理者のYahoo! JAPANビジネスIDです。&lt;br&gt; MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。&lt;br&gt; テストアカウントの場合、このフィールドは更新できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contact business ID.&lt;br&gt; If isManagerAccount is \&quot;TRUE\&quot;, this field will not be returned and will be ignored on request.&lt;br&gt; If isTestAccount is \&quot;TRUE\&quot;, this field cannot be updated.&lt;/div&gt; 
   * @return contactBizId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。<br> テストアカウントの場合、このフィールドは更新できません。</div> <div lang=\"en\">Contact business ID.<br> If isManagerAccount is \"TRUE\", this field will not be returned and will be ignored on request.<br> If isTestAccount is \"TRUE\", this field cannot be updated.</div> ")
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


  public Account optimizationScore(Double optimizationScore) {
    
    this.optimizationScore = optimizationScore;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最適化スコアです。&lt;br&gt; 最適化スコアは、0.0から1.0の範囲の値を返却します。&lt;br&gt; アカウントの最適化スコアが計算不可の場合、最適化スコアは返却されません。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Optimization score.&lt;br&gt; Optimization score returns a value ranging from 0.0 to 1.0.&lt;br&gt; If the optimization score an account has is not computable, the optimization score will not be returned. Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return optimizationScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最適化スコアです。<br> 最適化スコアは、0.0から1.0の範囲の値を返却します。<br> アカウントの最適化スコアが計算不可の場合、最適化スコアは返却されません。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Optimization score.<br> Optimization score returns a value ranging from 0.0 to 1.0.<br> If the optimization score an account has is not computable, the optimization score will not be returned. Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getOptimizationScore() {
    return optimizationScore;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMIZATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimizationScore(Double optimizationScore) {
    this.optimizationScore = optimizationScore;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.autoTaggingEnabled, account.autoTaggingEnabled) &&
        Objects.equals(this.deliveryStatus, account.deliveryStatus) &&
        Objects.equals(this.isTestAccount, account.isTestAccount) &&
        Objects.equals(this.startDate, account.startDate) &&
        Objects.equals(this.endDate, account.endDate) &&
        Objects.equals(this.isMccAccount, account.isMccAccount) &&
        Objects.equals(this.contactBizId, account.contactBizId) &&
        Objects.equals(this.optimizationScore, account.optimizationScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountStatus, accountType, autoTaggingEnabled, deliveryStatus, isTestAccount, startDate, endDate, isMccAccount, contactBizId, optimizationScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isMccAccount: ").append(toIndentedString(isMccAccount)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
    sb.append("    optimizationScore: ").append(toIndentedString(optimizationScore)).append("\n");
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

