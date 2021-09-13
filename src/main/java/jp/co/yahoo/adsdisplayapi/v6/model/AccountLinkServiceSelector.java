package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountLinkServiceAccountStatus;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountLinkServiceRetargetingListSharingEnabled;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkServiceSelectorオブジェクトは、取得するアカウントリンク情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The AccountLinkServiceSelector object is used to select account link for acquisition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountLinkServiceSelectorオブジェクトは、取得するアカウントリンク情報を指定します。</div> <div lang=\"en\">The AccountLinkServiceSelector object is used to select account link for acquisition.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountLinkServiceSelector   {
  @JsonProperty("managerAccountId")
  private Long managerAccountId;

  @JsonProperty("accountStatuses")
  @Valid
  private List<AccountLinkServiceAccountStatus> accountStatuses = null;

  @JsonProperty("retargetingListSharingEnabled")
  private AccountLinkServiceRetargetingListSharingEnabled retargetingListSharingEnabled = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public AccountLinkServiceSelector managerAccountId(Long managerAccountId) {
    this.managerAccountId = managerAccountId;
    return this;
  }

  /**
   * <div lang=\"ja\">MCCアカウントIDです。</div> <div lang=\"en\">MCC Account ID.</div> 
   * @return managerAccountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">MCCアカウントIDです。</div> <div lang=\"en\">MCC Account ID.</div> ")
  @NotNull


  public Long getManagerAccountId() {
    return managerAccountId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<AccountLinkServiceAccountStatus> getAccountStatuses() {
    return accountStatuses;
  }

  public void setAccountStatuses(List<AccountLinkServiceAccountStatus> accountStatuses) {
    this.accountStatuses = accountStatuses;
  }

  public AccountLinkServiceSelector retargetingListSharingEnabled(AccountLinkServiceRetargetingListSharingEnabled retargetingListSharingEnabled) {
    this.retargetingListSharingEnabled = retargetingListSharingEnabled;
    return this;
  }

  /**
   * Get retargetingListSharingEnabled
   * @return retargetingListSharingEnabled
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountLinkServiceRetargetingListSharingEnabled getRetargetingListSharingEnabled() {
    return retargetingListSharingEnabled;
  }

  public void setRetargetingListSharingEnabled(AccountLinkServiceRetargetingListSharingEnabled retargetingListSharingEnabled) {
    this.retargetingListSharingEnabled = retargetingListSharingEnabled;
  }

  public AccountLinkServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AccountLinkServiceSelector startIndex(Integer startIndex) {
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
    AccountLinkServiceSelector accountLinkServiceSelector = (AccountLinkServiceSelector) o;
    return Objects.equals(this.managerAccountId, accountLinkServiceSelector.managerAccountId) &&
        Objects.equals(this.accountStatuses, accountLinkServiceSelector.accountStatuses) &&
        Objects.equals(this.retargetingListSharingEnabled, accountLinkServiceSelector.retargetingListSharingEnabled) &&
        Objects.equals(this.numberResults, accountLinkServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountLinkServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerAccountId, accountStatuses, retargetingListSharingEnabled, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinkServiceSelector {\n");
    
    sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
    sb.append("    accountStatuses: ").append(toIndentedString(accountStatuses)).append("\n");
    sb.append("    retargetingListSharingEnabled: ").append(toIndentedString(retargetingListSharingEnabled)).append("\n");
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

