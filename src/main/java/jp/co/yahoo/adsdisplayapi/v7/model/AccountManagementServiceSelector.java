/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v7.model;

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
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagementServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagementServicePaymentType;
import jp.co.yahoo.adsdisplayapi.v7.model.AccountManagementServiceStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceSelector object explains which accounts to return.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。</div> <div lang=\"en\">AccountManagementServiceSelector object explains which accounts to return.</div> ")
@JsonPropertyOrder({
  AccountManagementServiceSelector.JSON_PROPERTY_ACCOUNT_IDS,
  AccountManagementServiceSelector.JSON_PROPERTY_ACCOUNT_STATUSES,
  AccountManagementServiceSelector.JSON_PROPERTY_ACCOUNT_TYPES,
  AccountManagementServiceSelector.JSON_PROPERTY_AUTH_TYPE,
  AccountManagementServiceSelector.JSON_PROPERTY_INCLUDE_TEST_ACCOUNT,
  AccountManagementServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AccountManagementServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("AccountManagementServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountManagementServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_IDS = "accountIds";
  private List<Long> accountIds = null;

  public static final String JSON_PROPERTY_ACCOUNT_STATUSES = "accountStatuses";
  private List<AccountManagementServiceStatus> accountStatuses = null;

  public static final String JSON_PROPERTY_ACCOUNT_TYPES = "accountTypes";
  private List<AccountManagementServicePaymentType> accountTypes = null;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private AccountManagementServiceAuthType authType;

  public static final String JSON_PROPERTY_INCLUDE_TEST_ACCOUNT = "includeTestAccount";
  private AccountManagementServiceIncludeTestAccount includeTestAccount;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 200;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AccountManagementServiceSelector() { 
  }

  public AccountManagementServiceSelector accountIds(List<Long> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public AccountManagementServiceSelector addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account IDs.&lt;/div&gt; 
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Account IDs.</div> ")
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


  public AccountManagementServiceSelector accountStatuses(List<AccountManagementServiceStatus> accountStatuses) {
    
    this.accountStatuses = accountStatuses;
    return this;
  }

  public AccountManagementServiceSelector addAccountStatusesItem(AccountManagementServiceStatus accountStatusesItem) {
    if (this.accountStatuses == null) {
      this.accountStatuses = new ArrayList<>();
    }
    this.accountStatuses.add(accountStatusesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントステータス&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account Statuses.&lt;/div&gt; 
   * @return accountStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントステータス</div> <div lang=\"en\">Account Statuses.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountManagementServiceStatus> getAccountStatuses() {
    return accountStatuses;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatuses(List<AccountManagementServiceStatus> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }


  public AccountManagementServiceSelector accountTypes(List<AccountManagementServicePaymentType> accountTypes) {
    
    this.accountTypes = accountTypes;
    return this;
  }

  public AccountManagementServiceSelector addAccountTypesItem(AccountManagementServicePaymentType accountTypesItem) {
    if (this.accountTypes == null) {
      this.accountTypes = new ArrayList<>();
    }
    this.accountTypes.add(accountTypesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントの料金支払い種別&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account Payment Types.&lt;/div&gt; 
   * @return accountTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントの料金支払い種別</div> <div lang=\"en\">Account Payment Types.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountManagementServicePaymentType> getAccountTypes() {
    return accountTypes;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountTypes(List<AccountManagementServicePaymentType> accountTypes) {
    this.accountTypes = accountTypes;
  }


  public AccountManagementServiceSelector authType(AccountManagementServiceAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(AccountManagementServiceAuthType authType) {
    this.authType = authType;
  }


  public AccountManagementServiceSelector includeTestAccount(AccountManagementServiceIncludeTestAccount includeTestAccount) {
    
    this.includeTestAccount = includeTestAccount;
    return this;
  }

   /**
   * Get includeTestAccount
   * @return includeTestAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceIncludeTestAccount getIncludeTestAccount() {
    return includeTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTestAccount(AccountManagementServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }


  public AccountManagementServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 200
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


  public AccountManagementServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
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
    AccountManagementServiceSelector accountManagementServiceSelector = (AccountManagementServiceSelector) o;
    return Objects.equals(this.accountIds, accountManagementServiceSelector.accountIds) &&
        Objects.equals(this.accountStatuses, accountManagementServiceSelector.accountStatuses) &&
        Objects.equals(this.accountTypes, accountManagementServiceSelector.accountTypes) &&
        Objects.equals(this.authType, accountManagementServiceSelector.authType) &&
        Objects.equals(this.includeTestAccount, accountManagementServiceSelector.includeTestAccount) &&
        Objects.equals(this.numberResults, accountManagementServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountManagementServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, accountStatuses, accountTypes, authType, includeTestAccount, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceSelector {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    includeTestAccount: ").append(toIndentedString(includeTestAccount)).append("\n");
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

