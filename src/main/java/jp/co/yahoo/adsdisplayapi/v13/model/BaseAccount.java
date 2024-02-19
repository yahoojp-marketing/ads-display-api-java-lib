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
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceAccountStatus;
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceHasAdminAuth;
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceIsMccAccount;
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceIsRootMccAccount;
import jp.co.yahoo.adsdisplayapi.v13.model.BaseAccountServiceIsTestAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BaseAccountオブジェクトは、アカウント情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BaseAccount objects serve account information.&lt;br&gt; &lt;/div&gt; 
 */
@JsonPropertyOrder({
  BaseAccount.JSON_PROPERTY_ACCOUNT_ID,
  BaseAccount.JSON_PROPERTY_ACCOUNT_NAME,
  BaseAccount.JSON_PROPERTY_ACCOUNT_STATUS,
  BaseAccount.JSON_PROPERTY_AUTH_TYPE,
  BaseAccount.JSON_PROPERTY_HAS_ADMIN_AUTH,
  BaseAccount.JSON_PROPERTY_IS_ROOT_MCC_ACCOUNT,
  BaseAccount.JSON_PROPERTY_IS_MCC_ACCOUNT,
  BaseAccount.JSON_PROPERTY_IS_TEST_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BaseAccount {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUS = "accountStatus";
  private BaseAccountServiceAccountStatus accountStatus;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private BaseAccountServiceAuthType authType;

  public static final String JSON_PROPERTY_HAS_ADMIN_AUTH = "hasAdminAuth";
  private BaseAccountServiceHasAdminAuth hasAdminAuth;

  public static final String JSON_PROPERTY_IS_ROOT_MCC_ACCOUNT = "isRootMccAccount";
  private BaseAccountServiceIsRootMccAccount isRootMccAccount;

  public static final String JSON_PROPERTY_IS_MCC_ACCOUNT = "isMccAccount";
  private BaseAccountServiceIsMccAccount isMccAccount;

  public static final String JSON_PROPERTY_IS_TEST_ACCOUNT = "isTestAccount";
  private BaseAccountServiceIsTestAccount isTestAccount;

  public BaseAccount() {
  }

  public BaseAccount accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウントIDです。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account ID. &lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public BaseAccount accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; アカウント名です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Account name. &lt;/div&gt; 
   * @return accountName
  **/
  @jakarta.annotation.Nullable
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


  public BaseAccount accountStatus(BaseAccountServiceAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceAccountStatus getAccountStatus() {
    return accountStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatus(BaseAccountServiceAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public BaseAccount authType(BaseAccountServiceAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(BaseAccountServiceAuthType authType) {
    this.authType = authType;
  }


  public BaseAccount hasAdminAuth(BaseAccountServiceHasAdminAuth hasAdminAuth) {
    
    this.hasAdminAuth = hasAdminAuth;
    return this;
  }

   /**
   * Get hasAdminAuth
   * @return hasAdminAuth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ADMIN_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceHasAdminAuth getHasAdminAuth() {
    return hasAdminAuth;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ADMIN_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAdminAuth(BaseAccountServiceHasAdminAuth hasAdminAuth) {
    this.hasAdminAuth = hasAdminAuth;
  }


  public BaseAccount isRootMccAccount(BaseAccountServiceIsRootMccAccount isRootMccAccount) {
    
    this.isRootMccAccount = isRootMccAccount;
    return this;
  }

   /**
   * Get isRootMccAccount
   * @return isRootMccAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ROOT_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceIsRootMccAccount getIsRootMccAccount() {
    return isRootMccAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_ROOT_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRootMccAccount(BaseAccountServiceIsRootMccAccount isRootMccAccount) {
    this.isRootMccAccount = isRootMccAccount;
  }


  public BaseAccount isMccAccount(BaseAccountServiceIsMccAccount isMccAccount) {
    
    this.isMccAccount = isMccAccount;
    return this;
  }

   /**
   * Get isMccAccount
   * @return isMccAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceIsMccAccount getIsMccAccount() {
    return isMccAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMccAccount(BaseAccountServiceIsMccAccount isMccAccount) {
    this.isMccAccount = isMccAccount;
  }


  public BaseAccount isTestAccount(BaseAccountServiceIsTestAccount isTestAccount) {
    
    this.isTestAccount = isTestAccount;
    return this;
  }

   /**
   * Get isTestAccount
   * @return isTestAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTestAccount(BaseAccountServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseAccount baseAccount = (BaseAccount) o;
    return Objects.equals(this.accountId, baseAccount.accountId) &&
        Objects.equals(this.accountName, baseAccount.accountName) &&
        Objects.equals(this.accountStatus, baseAccount.accountStatus) &&
        Objects.equals(this.authType, baseAccount.authType) &&
        Objects.equals(this.hasAdminAuth, baseAccount.hasAdminAuth) &&
        Objects.equals(this.isRootMccAccount, baseAccount.isRootMccAccount) &&
        Objects.equals(this.isMccAccount, baseAccount.isMccAccount) &&
        Objects.equals(this.isTestAccount, baseAccount.isTestAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountStatus, authType, hasAdminAuth, isRootMccAccount, isMccAccount, isTestAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAccount {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hasAdminAuth: ").append(toIndentedString(hasAdminAuth)).append("\n");
    sb.append("    isRootMccAccount: ").append(toIndentedString(isRootMccAccount)).append("\n");
    sb.append("    isMccAccount: ").append(toIndentedString(isMccAccount)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
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

