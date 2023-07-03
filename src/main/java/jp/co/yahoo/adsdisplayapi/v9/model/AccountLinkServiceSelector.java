/*
 * Yahoo!広告 ディスプレイ広告 API リファレンス / Yahoo! JAPAN Ads Display Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 ディスプレイ広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Display Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-display-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adsdisplayapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v9.model.AccountLinkServiceAccountStatus;
import jp.co.yahoo.adsdisplayapi.v9.model.AccountLinkServiceAudienceListSharingEnabled;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkServiceSelectorオブジェクトは、取得するアカウントリンク情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountLinkServiceSelector object is used to select account link for acquisition.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountLinkServiceSelector.JSON_PROPERTY_MANAGER_ACCOUNT_ID,
  AccountLinkServiceSelector.JSON_PROPERTY_ACCOUNT_STATUSES,
  AccountLinkServiceSelector.JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED,
  AccountLinkServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AccountLinkServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountLinkServiceSelector {
  public static final String JSON_PROPERTY_MANAGER_ACCOUNT_ID = "managerAccountId";
  private Long managerAccountId;

  public static final String JSON_PROPERTY_ACCOUNT_STATUSES = "accountStatuses";
  private List<AccountLinkServiceAccountStatus> accountStatuses;

  public static final String JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED = "audienceListSharingEnabled";
  private AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AccountLinkServiceSelector() {
  }

  public AccountLinkServiceSelector managerAccountId(Long managerAccountId) {
    
    this.managerAccountId = managerAccountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MCCアカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;MCC Account ID.&lt;/div&gt; 
   * @return managerAccountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getManagerAccountId() {
    return managerAccountId;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManagerAccountId(Long managerAccountId) {
    this.managerAccountId = managerAccountId;
  }


  public AccountLinkServiceSelector accountStatuses(List<AccountLinkServiceAccountStatus> accountStatuses) {
    
    this.accountStatuses = accountStatuses;
    return this;
  }

  public AccountLinkServiceSelector addAccountStatusesItem(AccountLinkServiceAccountStatus accountStatusesItem) {
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

  public List<AccountLinkServiceAccountStatus> getAccountStatuses() {
    return accountStatuses;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatuses(List<AccountLinkServiceAccountStatus> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }


  public AccountLinkServiceSelector audienceListSharingEnabled(AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled) {
    
    this.audienceListSharingEnabled = audienceListSharingEnabled;
    return this;
  }

   /**
   * Get audienceListSharingEnabled
   * @return audienceListSharingEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceAudienceListSharingEnabled getAudienceListSharingEnabled() {
    return audienceListSharingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE_LIST_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudienceListSharingEnabled(AccountLinkServiceAudienceListSharingEnabled audienceListSharingEnabled) {
    this.audienceListSharingEnabled = audienceListSharingEnabled;
  }


  public AccountLinkServiceSelector numberResults(Integer numberResults) {
    
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


  public AccountLinkServiceSelector startIndex(Integer startIndex) {
    
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
    AccountLinkServiceSelector accountLinkServiceSelector = (AccountLinkServiceSelector) o;
    return Objects.equals(this.managerAccountId, accountLinkServiceSelector.managerAccountId) &&
        Objects.equals(this.accountStatuses, accountLinkServiceSelector.accountStatuses) &&
        Objects.equals(this.audienceListSharingEnabled, accountLinkServiceSelector.audienceListSharingEnabled) &&
        Objects.equals(this.numberResults, accountLinkServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountLinkServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerAccountId, accountStatuses, audienceListSharingEnabled, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinkServiceSelector {\n");
    sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    audienceListSharingEnabled: ").append(toIndentedString(audienceListSharingEnabled)).append("\n");
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

