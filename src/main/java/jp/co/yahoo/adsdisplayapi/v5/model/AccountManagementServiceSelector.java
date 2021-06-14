package jp.co.yahoo.adsdisplayapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServicePaymentType;
import jp.co.yahoo.adsdisplayapi.v5.model.AccountManagementServiceStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceSelector object explains which accounts to return.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。</div> <div lang=\"en\">AccountManagementServiceSelector object explains which accounts to return.</div> ")

public class AccountManagementServiceSelector   {
  @JsonProperty("accountIds")
  @Valid
  private JsonNullable<List<Long>> accountIds = JsonNullable.undefined();

  @JsonProperty("accountStatuses")
  @Valid
  private JsonNullable<List<AccountManagementServiceStatus>> accountStatuses = JsonNullable.undefined();

  @JsonProperty("accountTypes")
  @Valid
  private JsonNullable<List<AccountManagementServicePaymentType>> accountTypes = JsonNullable.undefined();

  @JsonProperty("authType")
  private JsonNullable<AccountManagementServiceAuthType> authType = JsonNullable.undefined();

  @JsonProperty("includeTestAccount")
  private JsonNullable<AccountManagementServiceIncludeTestAccount> includeTestAccount = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public AccountManagementServiceSelector accountIds(List<Long> accountIds) {
    this.accountIds = JsonNullable.of(accountIds);
    return this;
  }

  public AccountManagementServiceSelector addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null || !this.accountIds.isPresent()) {
      this.accountIds = JsonNullable.of(new ArrayList<>());
    }
    this.accountIds.get().add(accountIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Account IDs.</div> 
   * @return accountIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Account IDs.</div> ")

@Size(max=200) 
  public JsonNullable<List<Long>> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(JsonNullable<List<Long>> accountIds) {
    this.accountIds = accountIds;
  }

  public AccountManagementServiceSelector accountStatuses(List<AccountManagementServiceStatus> accountStatuses) {
    this.accountStatuses = JsonNullable.of(accountStatuses);
    return this;
  }

  public AccountManagementServiceSelector addAccountStatusesItem(AccountManagementServiceStatus accountStatusesItem) {
    if (this.accountStatuses == null || !this.accountStatuses.isPresent()) {
      this.accountStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.accountStatuses.get().add(accountStatusesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントステータス</div> <div lang=\"en\">Account Statuses.</div> 
   * @return accountStatuses
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントステータス</div> <div lang=\"en\">Account Statuses.</div> ")

  @Valid
@Size(max=6) 
  public JsonNullable<List<AccountManagementServiceStatus>> getAccountStatuses() {
    return accountStatuses;
  }

  public void setAccountStatuses(JsonNullable<List<AccountManagementServiceStatus>> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }

  public AccountManagementServiceSelector accountTypes(List<AccountManagementServicePaymentType> accountTypes) {
    this.accountTypes = JsonNullable.of(accountTypes);
    return this;
  }

  public AccountManagementServiceSelector addAccountTypesItem(AccountManagementServicePaymentType accountTypesItem) {
    if (this.accountTypes == null || !this.accountTypes.isPresent()) {
      this.accountTypes = JsonNullable.of(new ArrayList<>());
    }
    this.accountTypes.get().add(accountTypesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントの料金支払い種別</div> <div lang=\"en\">Account Payment Types.</div> 
   * @return accountTypes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントの料金支払い種別</div> <div lang=\"en\">Account Payment Types.</div> ")

  @Valid
@Size(max=2) 
  public JsonNullable<List<AccountManagementServicePaymentType>> getAccountTypes() {
    return accountTypes;
  }

  public void setAccountTypes(JsonNullable<List<AccountManagementServicePaymentType>> accountTypes) {
    this.accountTypes = accountTypes;
  }

  public AccountManagementServiceSelector authType(AccountManagementServiceAuthType authType) {
    this.authType = JsonNullable.of(authType);
    return this;
  }

  /**
   * Get authType
   * @return authType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceAuthType> getAuthType() {
    return authType;
  }

  public void setAuthType(JsonNullable<AccountManagementServiceAuthType> authType) {
    this.authType = authType;
  }

  public AccountManagementServiceSelector includeTestAccount(AccountManagementServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = JsonNullable.of(includeTestAccount);
    return this;
  }

  /**
   * Get includeTestAccount
   * @return includeTestAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceIncludeTestAccount> getIncludeTestAccount() {
    return includeTestAccount;
  }

  public void setIncludeTestAccount(JsonNullable<AccountManagementServiceIncludeTestAccount> includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }

  public AccountManagementServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * maximum: 200
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1) @Max(200) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AccountManagementServiceSelector startIndex(Integer startIndex) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

