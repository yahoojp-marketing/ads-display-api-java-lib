package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceIncludeTestAccount;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServicePaymentType;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountManagementServiceStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceSelector object explains which accounts to return.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceSelectorオブジェクトは、選択するアカウントを表します。</div> <div lang=\"en\">AccountManagementServiceSelector object explains which accounts to return.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-display-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountIds")
  @Valid
  private List<Long> accountIds = null;

  @JsonProperty("accountStatuses")
  @Valid
  private List<AccountManagementServiceStatus> accountStatuses = null;

  @JsonProperty("accountTypes")
  @Valid
  private List<AccountManagementServicePaymentType> accountTypes = null;

  @JsonProperty("authType")
  private AccountManagementServiceAuthType authType = null;

  @JsonProperty("includeTestAccount")
  private AccountManagementServiceIncludeTestAccount includeTestAccount = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

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
   * <div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Account IDs.</div> 
   * @return accountIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Account IDs.</div> ")

@Size(max=200) 
  public List<Long> getAccountIds() {
    return accountIds;
  }

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
   * <div lang=\"ja\">検索条件：アカウントステータス</div> <div lang=\"en\">Account Statuses.</div> 
   * @return accountStatuses
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントステータス</div> <div lang=\"en\">Account Statuses.</div> ")

  @Valid
@Size(max=6) 
  public List<AccountManagementServiceStatus> getAccountStatuses() {
    return accountStatuses;
  }

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
   * <div lang=\"ja\">検索条件：アカウントの料金支払い種別</div> <div lang=\"en\">Account Payment Types.</div> 
   * @return accountTypes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アカウントの料金支払い種別</div> <div lang=\"en\">Account Payment Types.</div> ")

  @Valid
@Size(max=2) 
  public List<AccountManagementServicePaymentType> getAccountTypes() {
    return accountTypes;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceAuthType getAuthType() {
    return authType;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountManagementServiceIncludeTestAccount getIncludeTestAccount() {
    return includeTestAccount;
  }

  public void setIncludeTestAccount(AccountManagementServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }

  public AccountManagementServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AccountManagementServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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

