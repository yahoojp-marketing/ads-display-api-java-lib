/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v16.model;

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
import jp.co.yahoo.adsdisplayapi.v16.model.AccountServiceIncludeMccAccount;
import jp.co.yahoo.adsdisplayapi.v16.model.AccountServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v16.model.AccountServiceStatus;
import jp.co.yahoo.adsdisplayapi.v16.model.AccountServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceSelectorオブジェクトは、取得するアカウントを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountServiceSelector object is used to select accounts for acquisition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountServiceSelectorオブジェクトは、取得するアカウントを指定します。</div> <div lang=\"en\">The AccountServiceSelector object is used to select accounts for acquisition.</div> ")
@JsonPropertyOrder({
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_IDS,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_NAME,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_STATUSES,
  AccountServiceSelector.JSON_PROPERTY_ACCOUNT_TYPES,
  AccountServiceSelector.JSON_PROPERTY_INCLUDE_TEST_ACCOUNT,
  AccountServiceSelector.JSON_PROPERTY_INCLUDE_MCC_ACCOUNT,
  AccountServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AccountServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("AccountServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_IDS = "accountIds";
  private List<Long> accountIds = null;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUSES = "accountStatuses";
  private List<AccountServiceStatus> accountStatuses = null;

  public static final String JSON_PROPERTY_ACCOUNT_TYPES = "accountTypes";
  private List<AccountServiceType> accountTypes = null;

  public static final String JSON_PROPERTY_INCLUDE_TEST_ACCOUNT = "includeTestAccount";
  private AccountServiceIncludeTestAccount includeTestAccount = AccountServiceIncludeTestAccount.EXCLUDE_TEST;

  public static final String JSON_PROPERTY_INCLUDE_MCC_ACCOUNT = "includeMccAccount";
  private AccountServiceIncludeMccAccount includeMccAccount;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">指定しない場合は紐づくアカウントをすべて取得します。</div> <div lang=\"en\">If nothing is selected, all accounts are retrieved.</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; この検索条件では、大文字と小文字は区別されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;br&gt; This field is optional.&lt;br&gt; This searching condition is case-insensitive. &lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br> このフィールドは、省略可能となります。<br> この検索条件では、大文字と小文字は区別されません。 </div> <div lang=\"en\">Account name.<br> This field is optional.<br> This searching condition is case-insensitive. </div> ")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public AccountServiceSelector includeTestAccount(AccountServiceIncludeTestAccount includeTestAccount) {
    
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

  public AccountServiceIncludeTestAccount getIncludeTestAccount() {
    return includeTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTestAccount(AccountServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }


  public AccountServiceSelector includeMccAccount(AccountServiceIncludeMccAccount includeMccAccount) {
    
    this.includeMccAccount = includeMccAccount;
    return this;
  }

   /**
   * Get includeMccAccount
   * @return includeMccAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIncludeMccAccount getIncludeMccAccount() {
    return includeMccAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMccAccount(AccountServiceIncludeMccAccount includeMccAccount) {
    this.includeMccAccount = includeMccAccount;
  }


  public AccountServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 0.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、0以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 0.</div> ")
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
        Objects.equals(this.includeTestAccount, accountServiceSelector.includeTestAccount) &&
        Objects.equals(this.includeMccAccount, accountServiceSelector.includeMccAccount) &&
        Objects.equals(this.numberResults, accountServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, accountName, accountStatuses, accountTypes, includeTestAccount, includeMccAccount, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountServiceSelector {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
    sb.append("    includeTestAccount: ").append(toIndentedString(includeTestAccount)).append("\n");
    sb.append("    includeMccAccount: ").append(toIndentedString(includeMccAccount)).append("\n");
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

