/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v12.model;

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
import jp.co.yahoo.adsdisplayapi.v12.model.BaseAccountServiceAccountStatus;
import jp.co.yahoo.adsdisplayapi.v12.model.BaseAccountServiceAuthType;
import jp.co.yahoo.adsdisplayapi.v12.model.BaseAccountServiceIncludeAdminAuth;
import jp.co.yahoo.adsdisplayapi.v12.model.BaseAccountServiceIncludeMccAccount;
import jp.co.yahoo.adsdisplayapi.v12.model.BaseAccountServiceIncludeTestAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BaseAccountServiceSelectorオブジェクトは、取得するアカウントを指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BaseAccountServiceSelector object is used to select accounts for acquisition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BaseAccountServiceSelectorオブジェクトは、取得するアカウントを指定します。</div> <div lang=\"en\">The BaseAccountServiceSelector object is used to select accounts for acquisition.</div> ")
@JsonPropertyOrder({
  BaseAccountServiceSelector.JSON_PROPERTY_ACCOUNT_IDS,
  BaseAccountServiceSelector.JSON_PROPERTY_ACCOUNT_NAME,
  BaseAccountServiceSelector.JSON_PROPERTY_ACCOUNT_STATUSES,
  BaseAccountServiceSelector.JSON_PROPERTY_AUTH_TYPE,
  BaseAccountServiceSelector.JSON_PROPERTY_INCLUDE_ADMIN_AUTH,
  BaseAccountServiceSelector.JSON_PROPERTY_INCLUDE_MCC_ACCOUNT,
  BaseAccountServiceSelector.JSON_PROPERTY_INCLUDE_TEST_ACCOUNT,
  BaseAccountServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  BaseAccountServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("BaseAccountServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BaseAccountServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_IDS = "accountIds";
  private List<Long> accountIds = null;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUSES = "accountStatuses";
  private List<BaseAccountServiceAccountStatus> accountStatuses = null;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private BaseAccountServiceAuthType authType;

  public static final String JSON_PROPERTY_INCLUDE_ADMIN_AUTH = "includeAdminAuth";
  private BaseAccountServiceIncludeAdminAuth includeAdminAuth;

  public static final String JSON_PROPERTY_INCLUDE_MCC_ACCOUNT = "includeMccAccount";
  private BaseAccountServiceIncludeMccAccount includeMccAccount;

  public static final String JSON_PROPERTY_INCLUDE_TEST_ACCOUNT = "includeTestAccount";
  private BaseAccountServiceIncludeTestAccount includeTestAccount;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 200;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public BaseAccountServiceSelector() { 
  }

  public BaseAccountServiceSelector accountIds(List<Long> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public BaseAccountServiceSelector addAccountIdsItem(Long accountIdsItem) {
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


  public BaseAccountServiceSelector accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;br&gt; This field is optional.&lt;br&gt; &lt;/div&gt; 
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br> このフィールドは、省略可能となります。<br> </div> <div lang=\"en\">Account name.<br> This field is optional.<br> </div> ")
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


  public BaseAccountServiceSelector accountStatuses(List<BaseAccountServiceAccountStatus> accountStatuses) {
    
    this.accountStatuses = accountStatuses;
    return this;
  }

  public BaseAccountServiceSelector addAccountStatusesItem(BaseAccountServiceAccountStatus accountStatusesItem) {
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

  public List<BaseAccountServiceAccountStatus> getAccountStatuses() {
    return accountStatuses;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatuses(List<BaseAccountServiceAccountStatus> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }


  public BaseAccountServiceSelector authType(BaseAccountServiceAuthType authType) {
    
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

  public BaseAccountServiceAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(BaseAccountServiceAuthType authType) {
    this.authType = authType;
  }


  public BaseAccountServiceSelector includeAdminAuth(BaseAccountServiceIncludeAdminAuth includeAdminAuth) {
    
    this.includeAdminAuth = includeAdminAuth;
    return this;
  }

   /**
   * Get includeAdminAuth
   * @return includeAdminAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_ADMIN_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAccountServiceIncludeAdminAuth getIncludeAdminAuth() {
    return includeAdminAuth;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_ADMIN_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeAdminAuth(BaseAccountServiceIncludeAdminAuth includeAdminAuth) {
    this.includeAdminAuth = includeAdminAuth;
  }


  public BaseAccountServiceSelector includeMccAccount(BaseAccountServiceIncludeMccAccount includeMccAccount) {
    
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

  public BaseAccountServiceIncludeMccAccount getIncludeMccAccount() {
    return includeMccAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MCC_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMccAccount(BaseAccountServiceIncludeMccAccount includeMccAccount) {
    this.includeMccAccount = includeMccAccount;
  }


  public BaseAccountServiceSelector includeTestAccount(BaseAccountServiceIncludeTestAccount includeTestAccount) {
    
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

  public BaseAccountServiceIncludeTestAccount getIncludeTestAccount() {
    return includeTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTestAccount(BaseAccountServiceIncludeTestAccount includeTestAccount) {
    this.includeTestAccount = includeTestAccount;
  }


  public BaseAccountServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 200
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
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


  public BaseAccountServiceSelector startIndex(Integer startIndex) {
    
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
    BaseAccountServiceSelector baseAccountServiceSelector = (BaseAccountServiceSelector) o;
    return Objects.equals(this.accountIds, baseAccountServiceSelector.accountIds) &&
        Objects.equals(this.accountName, baseAccountServiceSelector.accountName) &&
        Objects.equals(this.accountStatuses, baseAccountServiceSelector.accountStatuses) &&
        Objects.equals(this.authType, baseAccountServiceSelector.authType) &&
        Objects.equals(this.includeAdminAuth, baseAccountServiceSelector.includeAdminAuth) &&
        Objects.equals(this.includeMccAccount, baseAccountServiceSelector.includeMccAccount) &&
        Objects.equals(this.includeTestAccount, baseAccountServiceSelector.includeTestAccount) &&
        Objects.equals(this.numberResults, baseAccountServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, baseAccountServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, accountName, accountStatuses, authType, includeAdminAuth, includeMccAccount, includeTestAccount, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAccountServiceSelector {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    includeAdminAuth: ").append(toIndentedString(includeAdminAuth)).append("\n");
    sb.append("    includeMccAccount: ").append(toIndentedString(includeMccAccount)).append("\n");
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

