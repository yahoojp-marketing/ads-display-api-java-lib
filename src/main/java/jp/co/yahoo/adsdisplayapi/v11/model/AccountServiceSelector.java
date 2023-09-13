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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountServiceIncludeManagerAccount;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountServiceStatus;
import jp.co.yahoo.adsdisplayapi.v11.model.AccountServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceSelectorオブジェクトは、取得するアカウントを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountServiceSelector object is used to select accounts for acquisition.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_IDS,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_NAME,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_STATUSES,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_TYPES,
  AccountServiceSelector.JSON_PROPERTY_AUTH_TYPE,
  AccountServiceSelector.JSON_PROPERTY_INCLUDE_TEST_ACCOUNT,
  AccountServiceSelector.JSON_PROPERTY_INCLUDE_MANAGER_ACCOUNT,
  AccountServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AccountServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_IDS = "accountIds";
  private List<Long> accountIds;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUSES = "accountStatuses";
  private List<AccountServiceStatus> accountStatuses;

  public static final String JSON_PROPERTY_ACCOUNT_TYPES = "accountTypes";
  private List<AccountServiceType> accountTypes;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private AccountServiceAuthType authType;

  public static final String JSON_PROPERTY_INCLUDE_TEST_ACCOUNT = "includeTestAccount";
  private AccountServiceIncludeTestAccount includeTestAccount = AccountServiceIncludeTestAccount.EXCLUDE_TEST;

  public static final String JSON_PROPERTY_INCLUDE_MANAGER_ACCOUNT = "includeManagerAccount";
  private AccountServiceIncludeManagerAccount includeManagerAccount = AccountServiceIncludeManagerAccount.EXCLUDE_MANAGER;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AccountServiceSelector() {
  }

  public AccountServiceSelector accountIds(List<Long> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public AccountServiceSelector addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;指定しない場合は紐づくアカウントをすべて取得します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;If nothing is selected, all accounts are retrieved.&lt;/div&gt; 
   * @return accountIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAccountIds() {
    return accountIds;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }


  public AccountServiceSelector accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
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


  public AccountServiceSelector accountStatuses(List<AccountServiceStatus> accountStatuses) {
    
    this.accountStatuses = accountStatuses;
    return this;
  }

  public AccountServiceSelector addAccountStatusesItem(AccountServiceStatus accountStatusesItem) {
    if (this.accountStatuses == null) {
      this.accountStatuses = new ArrayList<>();
    }
    this.accountStatuses.add(accountStatusesItem);
    return this;
  }

   /**
   * Get accountStatuses
   * @return accountStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountServiceStatus> getAccountStatuses() {
    return accountStatuses;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatuses(List<AccountServiceStatus> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }


  public AccountServiceSelector accountTypes(List<AccountServiceType> accountTypes) {
    
    this.accountTypes = accountTypes;
    return this;
  }

  public AccountServiceSelector addAccountTypesItem(AccountServiceType accountTypesItem) {
    if (this.accountTypes == null) {
      this.accountTypes = new ArrayList<>();
    }
    this.accountTypes.add(accountTypesItem);
    return this;
  }

   /**
   * Get accountTypes
   * @return accountTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountServiceType> getAccountTypes() {
    return accountTypes;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountTypes(List<AccountServiceType> accountTypes) {
    this.accountTypes = accountTypes;
  }


  public AccountServiceSelector authType(AccountServiceAuthType authType) {
    
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

  public AccountServiceAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(AccountServiceAuthType authType) {
    this.authType = authType;
  }


  public AccountServiceSelector includeTestAccount(AccountServiceIncludeTestAccount includeTestAccount) {
    
    this.includeTestAccount = includeTestAccount;
    return this;
  }

   /**
   * Get includeTestAccount
   * @return includeTestAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIncludeTestAccount getIncludeTestAccount() {
    return includeTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTestAccount(AccountServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }


  public AccountServiceSelector includeManagerAccount(AccountServiceIncludeManagerAccount includeManagerAccount) {
    
    this.includeManagerAccount = includeManagerAccount;
    return this;
  }

   /**
   * Get includeManagerAccount
   * @return includeManagerAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_MANAGER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIncludeManagerAccount getIncludeManagerAccount() {
    return includeManagerAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MANAGER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeManagerAccount(AccountServiceIncludeManagerAccount includeManagerAccount) {
    this.includeManagerAccount = includeManagerAccount;
  }


  public AccountServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
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


  public AccountServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountServiceSelector accountServiceSelector = (AccountServiceSelector) o;
    return Objects.equals(this.accountIds, accountServiceSelector.accountIds) &&
        Objects.equals(this.accountName, accountServiceSelector.accountName) &&
        Objects.equals(this.accountStatuses, accountServiceSelector.accountStatuses) &&
        Objects.equals(this.accountTypes, accountServiceSelector.accountTypes) &&
        Objects.equals(this.authType, accountServiceSelector.authType) &&
        Objects.equals(this.includeTestAccount, accountServiceSelector.includeTestAccount) &&
        Objects.equals(this.includeManagerAccount, accountServiceSelector.includeManagerAccount) &&
        Objects.equals(this.numberResults, accountServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, accountName, accountStatuses, accountTypes, authType, includeTestAccount, includeManagerAccount, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountServiceSelector {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    includeTestAccount: ").append(toIndentedString(includeTestAccount)).append("\n");
    sb.append("    includeManagerAccount: ").append(toIndentedString(includeManagerAccount)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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
