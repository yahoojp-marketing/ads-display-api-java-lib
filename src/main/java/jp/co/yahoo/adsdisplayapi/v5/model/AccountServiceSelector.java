package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceIncludeManagerAccount;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceStatus;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceSelectorオブジェクトは、取得するアカウントを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountServiceSelector object is used to select accounts for acquisition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountServiceSelectorオブジェクトは、取得するアカウントを指定します。</div> <div lang=\"en\">The AccountServiceSelector object is used to select accounts for acquisition.</div> ")

public class AccountServiceSelector   {
  @JsonProperty("accountIds")
  @Valid
  private JsonNullable<List<Long>> accountIds = JsonNullable.undefined();

  @JsonProperty("accountName")
  private JsonNullable<String> accountName = JsonNullable.undefined();

  @JsonProperty("accountStatuses")
  @Valid
  private JsonNullable<List<AccountServiceStatus>> accountStatuses = JsonNullable.undefined();

  @JsonProperty("accountTypes")
  @Valid
  private JsonNullable<List<AccountServiceType>> accountTypes = JsonNullable.undefined();

  @JsonProperty("authType")
  private JsonNullable<AccountServiceAuthType> authType = JsonNullable.undefined();

  @JsonProperty("includeTestAccount")
  private JsonNullable<AccountServiceIncludeTestAccount> includeTestAccount = JsonNullable.undefined();

  @JsonProperty("includeManagerAccount")
  private JsonNullable<AccountServiceIncludeManagerAccount> includeManagerAccount = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public AccountServiceSelector accountIds(List<Long> accountIds) {
    this.accountIds = JsonNullable.of(accountIds);
    return this;
  }

  public AccountServiceSelector addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null || !this.accountIds.isPresent()) {
      this.accountIds = JsonNullable.of(new ArrayList<>());
    }
    this.accountIds.get().add(accountIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">指定しない場合は紐づくアカウントをすべて取得します。</div> <div lang=\"en\">If nothing is selected, all accounts are retrieved.</div> 
   * @return accountIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">指定しない場合は紐づくアカウントをすべて取得します。</div> <div lang=\"en\">If nothing is selected, all accounts are retrieved.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(JsonNullable<List<Long>> accountIds) {
    this.accountIds = accountIds;
  }

  public AccountServiceSelector accountName(String accountName) {
    this.accountName = JsonNullable.of(accountName);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント名です。</div> <div lang=\"en\">Account name.</div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。</div> <div lang=\"en\">Account name.</div> ")


  public JsonNullable<String> getAccountName() {
    return accountName;
  }

  public void setAccountName(JsonNullable<String> accountName) {
    this.accountName = accountName;
  }

  public AccountServiceSelector accountStatuses(List<AccountServiceStatus> accountStatuses) {
    this.accountStatuses = JsonNullable.of(accountStatuses);
    return this;
  }

  public AccountServiceSelector addAccountStatusesItem(AccountServiceStatus accountStatusesItem) {
    if (this.accountStatuses == null || !this.accountStatuses.isPresent()) {
      this.accountStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.accountStatuses.get().add(accountStatusesItem);
    return this;
  }

  /**
   * Get accountStatuses
   * @return accountStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=6) 
  public JsonNullable<List<AccountServiceStatus>> getAccountStatuses() {
    return accountStatuses;
  }

  public void setAccountStatuses(JsonNullable<List<AccountServiceStatus>> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }

  public AccountServiceSelector accountTypes(List<AccountServiceType> accountTypes) {
    this.accountTypes = JsonNullable.of(accountTypes);
    return this;
  }

  public AccountServiceSelector addAccountTypesItem(AccountServiceType accountTypesItem) {
    if (this.accountTypes == null || !this.accountTypes.isPresent()) {
      this.accountTypes = JsonNullable.of(new ArrayList<>());
    }
    this.accountTypes.get().add(accountTypesItem);
    return this;
  }

  /**
   * Get accountTypes
   * @return accountTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<AccountServiceType>> getAccountTypes() {
    return accountTypes;
  }

  public void setAccountTypes(JsonNullable<List<AccountServiceType>> accountTypes) {
    this.accountTypes = accountTypes;
  }

  public AccountServiceSelector authType(AccountServiceAuthType authType) {
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

  public AccountServiceSelector includeTestAccount(AccountServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = JsonNullable.of(includeTestAccount);
    return this;
  }

  /**
   * Get includeTestAccount
   * @return includeTestAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceIncludeTestAccount> getIncludeTestAccount() {
    return includeTestAccount;
  }

  public void setIncludeTestAccount(JsonNullable<AccountServiceIncludeTestAccount> includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }

  public AccountServiceSelector includeManagerAccount(AccountServiceIncludeManagerAccount includeManagerAccount) {
    this.includeManagerAccount = JsonNullable.of(includeManagerAccount);
    return this;
  }

  /**
   * Get includeManagerAccount
   * @return includeManagerAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountServiceIncludeManagerAccount> getIncludeManagerAccount() {
    return includeManagerAccount;
  }

  public void setIncludeManagerAccount(JsonNullable<AccountServiceIncludeManagerAccount> includeManagerAccount) {
    this.includeManagerAccount = includeManagerAccount;
  }

  public AccountServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AccountServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

