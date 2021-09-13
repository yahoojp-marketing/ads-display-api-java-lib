package jp.co.yahoo.adsdisplayapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountLinkServiceLinkAccessPermission;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountLinkServiceOwnerShipType;
import jp.co.yahoo.adsdisplayapi.v6.model.AccountLinkServiceRetargetingListSharingEnabled;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkオブジェクトは、アカウントリンク情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountLink objects serve account link information.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountLinkオブジェクトは、アカウントリンク情報を示します。<br> </div> <div lang=\"en\">AccountLink objects serve account link information.<br> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountLink   {
  @JsonProperty("managerAccountId")
  private Long managerAccountId;

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("linkAccessPermission")
  private AccountLinkServiceLinkAccessPermission linkAccessPermission = null;

  @JsonProperty("retargetingListSharingEnabled")
  private AccountLinkServiceRetargetingListSharingEnabled retargetingListSharingEnabled = null;

  @JsonProperty("ownerShipType")
  private AccountLinkServiceOwnerShipType ownerShipType = null;

  public AccountLink managerAccountId(Long managerAccountId) {
    this.managerAccountId = managerAccountId;
    return this;
  }

  /**
   * <div lang=\"ja\">MCCアカウントIDです。</div> <div lang=\"en\">MCC Account ID.</div> 
   * @return managerAccountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">MCCアカウントIDです。</div> <div lang=\"en\">MCC Account ID.</div> ")


  public Long getManagerAccountId() {
    return managerAccountId;
  }

  public void setManagerAccountId(Long managerAccountId) {
    this.managerAccountId = managerAccountId;
  }

  public AccountLink accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountLink linkAccessPermission(AccountLinkServiceLinkAccessPermission linkAccessPermission) {
    this.linkAccessPermission = linkAccessPermission;
    return this;
  }

  /**
   * Get linkAccessPermission
   * @return linkAccessPermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountLinkServiceLinkAccessPermission getLinkAccessPermission() {
    return linkAccessPermission;
  }

  public void setLinkAccessPermission(AccountLinkServiceLinkAccessPermission linkAccessPermission) {
    this.linkAccessPermission = linkAccessPermission;
  }

  public AccountLink retargetingListSharingEnabled(AccountLinkServiceRetargetingListSharingEnabled retargetingListSharingEnabled) {
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

  public AccountLink ownerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    this.ownerShipType = ownerShipType;
    return this;
  }

  /**
   * Get ownerShipType
   * @return ownerShipType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountLinkServiceOwnerShipType getOwnerShipType() {
    return ownerShipType;
  }

  public void setOwnerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    this.ownerShipType = ownerShipType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLink accountLink = (AccountLink) o;
    return Objects.equals(this.managerAccountId, accountLink.managerAccountId) &&
        Objects.equals(this.accountId, accountLink.accountId) &&
        Objects.equals(this.linkAccessPermission, accountLink.linkAccessPermission) &&
        Objects.equals(this.retargetingListSharingEnabled, accountLink.retargetingListSharingEnabled) &&
        Objects.equals(this.ownerShipType, accountLink.ownerShipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerAccountId, accountId, linkAccessPermission, retargetingListSharingEnabled, ownerShipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLink {\n");
    
    sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    linkAccessPermission: ").append(toIndentedString(linkAccessPermission)).append("\n");
    sb.append("    retargetingListSharingEnabled: ").append(toIndentedString(retargetingListSharingEnabled)).append("\n");
    sb.append("    ownerShipType: ").append(toIndentedString(ownerShipType)).append("\n");
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

